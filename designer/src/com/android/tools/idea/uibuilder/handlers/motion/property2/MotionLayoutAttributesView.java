/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.tools.idea.uibuilder.handlers.motion.property2;

import static com.android.SdkConstants.ANDROID_URI;
import static com.android.SdkConstants.ATTR_ID;
import static com.android.SdkConstants.AUTO_URI;
import static com.android.tools.property.panel.api.FilteredPTableModel.PTableModelFactory;

import com.android.tools.idea.common.model.NlComponent;
import com.android.tools.idea.uibuilder.handlers.motion.editor.adapters.MotionSceneAttrs;
import com.android.tools.idea.uibuilder.handlers.motion.property2.action.AddCustomFieldAction;
import com.android.tools.idea.uibuilder.handlers.motion.property2.action.AddMotionFieldAction;
import com.android.tools.idea.uibuilder.handlers.motion.property2.action.DeleteCustomFieldAction;
import com.android.tools.idea.uibuilder.handlers.motion.property2.action.DeleteMotionFieldAction;
import com.android.tools.idea.uibuilder.handlers.motion.property2.action.SubSectionControlAction;
import com.android.tools.idea.uibuilder.property2.NelePropertyItem;
import com.android.tools.idea.uibuilder.property2.model.SelectedComponentModel;
import com.android.tools.idea.uibuilder.property2.support.NeleEnumSupportProvider;
import com.android.tools.idea.uibuilder.property2.support.NeleTwoStateBooleanControlTypeProvider;
import com.android.tools.idea.uibuilder.property2.ui.EmptyTablePanel;
import com.android.tools.idea.uibuilder.property2.ui.SelectedComponentPanel;
import com.android.tools.property.panel.api.EditorProvider;
import com.android.tools.property.panel.api.FilteredPTableModel;
import com.android.tools.property.panel.api.InspectorBuilder;
import com.android.tools.property.panel.api.InspectorLineModel;
import com.android.tools.property.panel.api.InspectorPanel;
import com.android.tools.property.panel.api.PropertiesModel;
import com.android.tools.property.panel.api.PropertiesTable;
import com.android.tools.property.panel.api.PropertiesView;
import com.android.tools.property.panel.api.TableLineModel;
import com.android.tools.property.panel.api.TableUIProvider;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.psi.impl.source.xml.XmlElementDescriptorProvider;
import com.intellij.psi.xml.XmlTag;
import com.intellij.util.ArrayUtil;
import com.intellij.xml.XmlElementDescriptor;
import java.util.Collections;
import kotlin.jvm.functions.Function1;
import org.jetbrains.android.dom.AndroidDomElementDescriptorProvider;
import org.jetbrains.annotations.NotNull;

/**
 * {@link PropertiesView} for motion layout property editor.
 */
public class MotionLayoutAttributesView extends PropertiesView<NelePropertyItem> {
  private static final String MOTION_VIEW_NAME = "Motion";

  public MotionLayoutAttributesView(@NotNull MotionLayoutAttributesModel model) {
    super(MOTION_VIEW_NAME, model);
    NeleEnumSupportProvider enumSupportProvider = new NeleEnumSupportProvider(model);
    NeleTwoStateBooleanControlTypeProvider controlTypeProvider = new NeleTwoStateBooleanControlTypeProvider(enumSupportProvider);
    EditorProvider<NelePropertyItem> editorProvider = EditorProvider.Companion.create(enumSupportProvider, controlTypeProvider);
    TableUIProvider tableUIProvider = TableUIProvider.Companion.create(NelePropertyItem.class, controlTypeProvider, editorProvider);
    getMain().getBuilders().add(new SelectedTargetBuilder());
    addTab("").getBuilders().add(new MotionInspectorBuilder(model, editorProvider, tableUIProvider));
  }

  private static class SelectedTargetBuilder implements InspectorBuilder<NelePropertyItem> {

    @Override
    public void attachToInspector(@NotNull InspectorPanel inspector, @NotNull PropertiesTable<NelePropertyItem> properties) {
      NelePropertyItem any = properties.getFirst();
      if (any == null || any.getComponents().isEmpty()) {
        return;
      }
      NelePropertyItem id = properties.getOrNull(ANDROID_URI, ATTR_ID);
      NlComponent component = any.getComponents().get(0);
      XmlTag tag = MotionLayoutAttributesModel.getTag(any);
      if (tag == null) {
        return;
      }
      String label = tag.getLocalName();
      inspector.addComponent(new SelectedComponentPanel(
        new SelectedComponentModel(id, Collections.singletonList(component), label)), null);
    }

    @Override
    public void resetCache() {
    }
  }

  private static class MotionInspectorBuilder implements InspectorBuilder<NelePropertyItem> {
    private final MotionLayoutAttributesModel myModel;
    private final EditorProvider<NelePropertyItem> myEditorProvider;
    private final TableUIProvider myTableUIProvider;
    private final XmlElementDescriptorProvider myDescriptorProvider;

    private MotionInspectorBuilder(@NotNull MotionLayoutAttributesModel model,
                                   @NotNull EditorProvider<NelePropertyItem> editorProvider,
                                   @NotNull TableUIProvider tableUIProvider) {
      myModel = model;
      myEditorProvider = editorProvider;
      myTableUIProvider = tableUIProvider;
      myDescriptorProvider = new AndroidDomElementDescriptorProvider();
    }

    @Override
    public void attachToInspector(@NotNull InspectorPanel inspector,
                                  @NotNull PropertiesTable<NelePropertyItem> properties) {
      NelePropertyItem any = properties.getFirst();
      if (any == null) {
        return;
      }
      XmlTag tag = MotionLayoutAttributesModel.getTag(any);
      if (tag == null) {
        return;
      }
      String label = tag.getLocalName();
      switch (label) {
        case MotionSceneAttrs.Tags.CONSTRAINT:
          NelePropertyItem targetId = properties.getOrNull(ANDROID_URI, ATTR_ID);
          boolean showDefaultValues = myModel.getProperties().getValues().stream().anyMatch(
            item -> !item.getNamespace().isEmpty() &&
                    item != targetId &&
                    (item.getRawValue() != null));
          addPropertyTable(inspector, label, myModel, showDefaultValues, false, targetId);
          addSubTagSections(inspector, tag, myModel);
          break;

        // These are all some kind of a KeyFrame:
        case MotionSceneAttrs.Tags.KEY_ATTRIBUTE:
        case MotionSceneAttrs.Tags.KEY_POSITION:
        case MotionSceneAttrs.Tags.KEY_CYCLE:
        case MotionSceneAttrs.Tags.KEY_TIME_CYCLE:
          NelePropertyItem target = properties.getOrNull(AUTO_URI, MotionSceneAttrs.Key.MOTION_TARGET);
          NelePropertyItem position = properties.getOrNull(AUTO_URI, MotionSceneAttrs.Key.FRAME_POSITION);
          if (target == null || position == null) {
            // All KeyFrames should have target and position.
            Logger.getInstance(NelePropertyItem.class).warn("KeyFrame without target and position");
            return;
          }
          inspector.addEditor(myEditorProvider.createEditor(position, false), null);
          addPropertyTable(inspector, label, myModel, false, false, target, position);
          break;

        default:
          addPropertyTable(inspector, label, myModel, false, false);
          break;
      }
      if (hasCustomAttributes(tag)) {
        addCustomAttributes(inspector, any, myModel);
      }
    }

    private void addSubTagSections(@NotNull InspectorPanel inspector,
                                   @NotNull XmlTag tag,
                                   @NotNull MotionLayoutAttributesModel model) {
      XmlElementDescriptor elementDescriptor = myDescriptorProvider.getDescriptor(tag);
      if (elementDescriptor == null) {
        return;
      }
      for (XmlElementDescriptor childDescriptor : elementDescriptor.getElementsDescriptors(tag)) {
        String subTagName = childDescriptor.getName();
        if (!subTagName.equals(MotionSceneAttrs.Tags.CUSTOM_ATTRIBUTE)) {
          SubTagAttributesModel subModel = new SubTagAttributesModel(model, subTagName);
          addPropertyTable(inspector, subTagName, subModel, true, true);
        }
      }
    }

    private void addCustomAttributes(@NotNull InspectorPanel inspector,
                                     @NotNull NelePropertyItem any,
                                     @NotNull MotionLayoutAttributesModel model) {
      SubTagAttributesModel customModel = new SubTagAttributesModel(model, MotionSceneAttrs.Tags.CUSTOM_ATTRIBUTE);
      Function1<NelePropertyItem, Boolean> filter = (item) -> item.getNamespace().isEmpty() && item.getRawValue() != null;

      FilteredPTableModel<NelePropertyItem> tableModel = PTableModelFactory.create(
        customModel, filter, PTableModelFactory.getAlphabeticalSortOrder(), Collections.emptyList(), false, true);
      AddCustomFieldAction addFieldAction = new AddCustomFieldAction(tableModel, any);
      DeleteCustomFieldAction deleteFieldAction = new DeleteCustomFieldAction(tableModel);
      InspectorLineModel title = inspector.addExpandableTitle("CustomAttributes", true, addFieldAction, deleteFieldAction);
      TableLineModel lineModel = inspector.addTable(tableModel, true, myTableUIProvider, title);
      inspector.addComponent(new EmptyTablePanel(addFieldAction, lineModel), title);
      deleteFieldAction.setLineModel(lineModel);
    }

    private void addPropertyTable(@NotNull InspectorPanel inspector,
                                  @NotNull String titleName,
                                  @NotNull PropertiesModel<NelePropertyItem> model,
                                  boolean showDefaultValues,
                                  boolean showSectionControl,
                                  @NotNull NelePropertyItem... excluded) {
      NelePropertyItem any = model.getProperties().getFirst();
      Function1<NelePropertyItem, Boolean> filter =
        (item) -> !item.getNamespace().isEmpty() &&
                  ArrayUtil.find(excluded, item) < 0 &&
                  (item.getRawValue() != null || (showDefaultValues && item.getDefaultValue() != null));

      FilteredPTableModel<NelePropertyItem> tableModel =
        PTableModelFactory.create(
          model, filter, PTableModelFactory.getAlphabeticalSortOrder(), Collections.emptyList(), true, true);
      SubSectionControlAction controlAction = new SubSectionControlAction(any);
      AddMotionFieldAction addFieldAction = new AddMotionFieldAction(myModel, tableModel, model.getProperties());
      DeleteMotionFieldAction deleteFieldAction = new DeleteMotionFieldAction(tableModel);
      AnAction[] actions = showSectionControl
                           ? new AnAction[]{controlAction, addFieldAction, deleteFieldAction}
                           : new AnAction[]{addFieldAction, deleteFieldAction};
      InspectorLineModel title = inspector.addExpandableTitle(titleName, true, actions);
      TableLineModel lineModel = inspector.addTable(tableModel, true, myTableUIProvider, title);
      inspector.addComponent(new EmptyTablePanel(addFieldAction, lineModel), title);
      controlAction.setLineModel(title);
      addFieldAction.setLineModel(lineModel);
      deleteFieldAction.setLineModel(lineModel);
    }

    private boolean hasCustomAttributes(@NotNull XmlTag tag) {
      XmlElementDescriptor elementDescriptor = myDescriptorProvider.getDescriptor(tag);
      if (elementDescriptor == null) {
        return false;
      }
      for (XmlElementDescriptor childDescriptor : elementDescriptor.getElementsDescriptors(tag)) {
        if (childDescriptor.getDefaultName().equals(MotionSceneAttrs.Tags.CUSTOM_ATTRIBUTE)) {
          return true;
        }
      }
      return false;
    }

    @Override
    public void resetCache() {
    }
  }
}
