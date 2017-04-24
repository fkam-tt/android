/*
 * Copyright (C) 2017 The Android Open Source Project
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

// ATTENTION: This file has been automatically generated from roomSql.bnf. Do not edit it manually.

package com.android.tools.idea.lang.roomSql.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.android.tools.idea.lang.roomSql.psi.RoomPsiTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class RoomSqlParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ALTER_TABLE_STMT) {
      r = alter_table_stmt(b, 0);
    }
    else if (t == ANALYZE_STMT) {
      r = analyze_stmt(b, 0);
    }
    else if (t == ATTACH_STMT) {
      r = attach_stmt(b, 0);
    }
    else if (t == BEGIN_STMT) {
      r = begin_stmt(b, 0);
    }
    else if (t == BIND_PARAMETER) {
      r = bind_parameter(b, 0);
    }
    else if (t == COLLATION_NAME) {
      r = collation_name(b, 0);
    }
    else if (t == COLUMN_ALIAS) {
      r = column_alias(b, 0);
    }
    else if (t == COLUMN_CONSTRAINT) {
      r = column_constraint(b, 0);
    }
    else if (t == COLUMN_DEF) {
      r = column_def(b, 0);
    }
    else if (t == COLUMN_NAME) {
      r = column_name(b, 0);
    }
    else if (t == COMMIT_STMT) {
      r = commit_stmt(b, 0);
    }
    else if (t == COMMON_TABLE_EXPRESSION) {
      r = common_table_expression(b, 0);
    }
    else if (t == COMPOUND_OPERATOR) {
      r = compound_operator(b, 0);
    }
    else if (t == CONFLICT_CLAUSE) {
      r = conflict_clause(b, 0);
    }
    else if (t == CREATE_INDEX_STMT) {
      r = create_index_stmt(b, 0);
    }
    else if (t == CREATE_TABLE_STMT) {
      r = create_table_stmt(b, 0);
    }
    else if (t == CREATE_TRIGGER_STMT) {
      r = create_trigger_stmt(b, 0);
    }
    else if (t == CREATE_VIEW_STMT) {
      r = create_view_stmt(b, 0);
    }
    else if (t == CREATE_VIRTUAL_TABLE_STMT) {
      r = create_virtual_table_stmt(b, 0);
    }
    else if (t == CTE_TABLE_NAME) {
      r = cte_table_name(b, 0);
    }
    else if (t == DATABASE_NAME) {
      r = database_name(b, 0);
    }
    else if (t == DELETE_STMT) {
      r = delete_stmt(b, 0);
    }
    else if (t == DELETE_STMT_LIMITED) {
      r = delete_stmt_limited(b, 0);
    }
    else if (t == DETACH_STMT) {
      r = detach_stmt(b, 0);
    }
    else if (t == DROP_INDEX_STMT) {
      r = drop_index_stmt(b, 0);
    }
    else if (t == DROP_TABLE_STMT) {
      r = drop_table_stmt(b, 0);
    }
    else if (t == DROP_TRIGGER_STMT) {
      r = drop_trigger_stmt(b, 0);
    }
    else if (t == DROP_VIEW_STMT) {
      r = drop_view_stmt(b, 0);
    }
    else if (t == ERROR_MESSAGE) {
      r = error_message(b, 0);
    }
    else if (t == EXPR) {
      r = expr(b, 0);
    }
    else if (t == FOREIGN_KEY_CLAUSE) {
      r = foreign_key_clause(b, 0);
    }
    else if (t == FOREIGN_TABLE) {
      r = foreign_table(b, 0);
    }
    else if (t == FUNCTION_NAME) {
      r = function_name(b, 0);
    }
    else if (t == INDEX_NAME) {
      r = index_name(b, 0);
    }
    else if (t == INDEXED_COLUMN) {
      r = indexed_column(b, 0);
    }
    else if (t == INSERT_STMT) {
      r = insert_stmt(b, 0);
    }
    else if (t == JOIN_CLAUSE) {
      r = join_clause(b, 0);
    }
    else if (t == JOIN_CONSTRAINT) {
      r = join_constraint(b, 0);
    }
    else if (t == JOIN_OPERATOR) {
      r = join_operator(b, 0);
    }
    else if (t == LITERAL_VALUE) {
      r = literal_value(b, 0);
    }
    else if (t == MODULE_ARGUMENT) {
      r = module_argument(b, 0);
    }
    else if (t == MODULE_NAME) {
      r = module_name(b, 0);
    }
    else if (t == ORDERING_TERM) {
      r = ordering_term(b, 0);
    }
    else if (t == PRAGMA_NAME) {
      r = pragma_name(b, 0);
    }
    else if (t == PRAGMA_STMT) {
      r = pragma_stmt(b, 0);
    }
    else if (t == PRAGMA_VALUE) {
      r = pragma_value(b, 0);
    }
    else if (t == QUALIFIED_TABLE_NAME) {
      r = qualified_table_name(b, 0);
    }
    else if (t == RAISE_FUNCTION) {
      r = raise_function(b, 0);
    }
    else if (t == REINDEX_STMT) {
      r = reindex_stmt(b, 0);
    }
    else if (t == RELEASE_STMT) {
      r = release_stmt(b, 0);
    }
    else if (t == RESULT_COLUMN) {
      r = result_column(b, 0);
    }
    else if (t == ROLLBACK_STMT) {
      r = rollback_stmt(b, 0);
    }
    else if (t == SAVEPOINT_NAME) {
      r = savepoint_name(b, 0);
    }
    else if (t == SAVEPOINT_STMT) {
      r = savepoint_stmt(b, 0);
    }
    else if (t == SELECT_STMT) {
      r = select_stmt(b, 0);
    }
    else if (t == SIGNED_NUMBER) {
      r = signed_number(b, 0);
    }
    else if (t == SQL_STMT) {
      r = sql_stmt(b, 0);
    }
    else if (t == TABLE_ALIAS) {
      r = table_alias(b, 0);
    }
    else if (t == TABLE_CONSTRAINT) {
      r = table_constraint(b, 0);
    }
    else if (t == TABLE_NAME) {
      r = table_name(b, 0);
    }
    else if (t == TABLE_OR_INDEX_NAME) {
      r = table_or_index_name(b, 0);
    }
    else if (t == TABLE_OR_SUBQUERY) {
      r = table_or_subquery(b, 0);
    }
    else if (t == TRIGGER_NAME) {
      r = trigger_name(b, 0);
    }
    else if (t == TYPE_NAME) {
      r = type_name(b, 0);
    }
    else if (t == UNARY_OPERATOR) {
      r = unary_operator(b, 0);
    }
    else if (t == UPDATE_STMT) {
      r = update_stmt(b, 0);
    }
    else if (t == UPDATE_STMT_LIMITED) {
      r = update_stmt_limited(b, 0);
    }
    else if (t == VACUUM_STMT) {
      r = vacuum_stmt(b, 0);
    }
    else if (t == VIEW_NAME) {
      r = view_name(b, 0);
    }
    else if (t == WITH_CLAUSE) {
      r = with_clause(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return sql_stmt_list(b, l + 1);
  }

  /* ********************************************************** */
  // ALTER TABLE ( database_name '.' )? table_name ( RENAME TO table_name | ADD ( COLUMN )? column_def )
  public static boolean alter_table_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alter_table_stmt")) return false;
    if (!nextTokenIs(b, ALTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ALTER, TABLE);
    r = r && alter_table_stmt_2(b, l + 1);
    r = r && table_name(b, l + 1);
    r = r && alter_table_stmt_4(b, l + 1);
    exit_section_(b, m, ALTER_TABLE_STMT, r);
    return r;
  }

  // ( database_name '.' )?
  private static boolean alter_table_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alter_table_stmt_2")) return false;
    alter_table_stmt_2_0(b, l + 1);
    return true;
  }

  // database_name '.'
  private static boolean alter_table_stmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alter_table_stmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  // RENAME TO table_name | ADD ( COLUMN )? column_def
  private static boolean alter_table_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alter_table_stmt_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = alter_table_stmt_4_0(b, l + 1);
    if (!r) r = alter_table_stmt_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RENAME TO table_name
  private static boolean alter_table_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alter_table_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, RENAME, TO);
    r = r && table_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ADD ( COLUMN )? column_def
  private static boolean alter_table_stmt_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alter_table_stmt_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ADD);
    r = r && alter_table_stmt_4_1_1(b, l + 1);
    r = r && column_def(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( COLUMN )?
  private static boolean alter_table_stmt_4_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alter_table_stmt_4_1_1")) return false;
    consumeToken(b, COLUMN);
    return true;
  }

  /* ********************************************************** */
  // ANALYZE ( database_name | table_or_index_name | database_name '.' table_or_index_name )?
  public static boolean analyze_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "analyze_stmt")) return false;
    if (!nextTokenIs(b, ANALYZE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANALYZE);
    r = r && analyze_stmt_1(b, l + 1);
    exit_section_(b, m, ANALYZE_STMT, r);
    return r;
  }

  // ( database_name | table_or_index_name | database_name '.' table_or_index_name )?
  private static boolean analyze_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "analyze_stmt_1")) return false;
    analyze_stmt_1_0(b, l + 1);
    return true;
  }

  // database_name | table_or_index_name | database_name '.' table_or_index_name
  private static boolean analyze_stmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "analyze_stmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    if (!r) r = table_or_index_name(b, l + 1);
    if (!r) r = analyze_stmt_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // database_name '.' table_or_index_name
  private static boolean analyze_stmt_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "analyze_stmt_1_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    r = r && consumeToken(b, ".");
    r = r && table_or_index_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ATTACH ( DATABASE )? expr AS database_name
  public static boolean attach_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attach_stmt")) return false;
    if (!nextTokenIs(b, ATTACH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATTACH);
    r = r && attach_stmt_1(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, AS);
    r = r && database_name(b, l + 1);
    exit_section_(b, m, ATTACH_STMT, r);
    return r;
  }

  // ( DATABASE )?
  private static boolean attach_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attach_stmt_1")) return false;
    consumeToken(b, DATABASE);
    return true;
  }

  /* ********************************************************** */
  // BEGIN ( DEFERRED | IMMEDIATE | EXCLUSIVE )? ( TRANSACTION )?
  public static boolean begin_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "begin_stmt")) return false;
    if (!nextTokenIs(b, BEGIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BEGIN);
    r = r && begin_stmt_1(b, l + 1);
    r = r && begin_stmt_2(b, l + 1);
    exit_section_(b, m, BEGIN_STMT, r);
    return r;
  }

  // ( DEFERRED | IMMEDIATE | EXCLUSIVE )?
  private static boolean begin_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "begin_stmt_1")) return false;
    begin_stmt_1_0(b, l + 1);
    return true;
  }

  // DEFERRED | IMMEDIATE | EXCLUSIVE
  private static boolean begin_stmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "begin_stmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEFERRED);
    if (!r) r = consumeToken(b, IMMEDIATE);
    if (!r) r = consumeToken(b, EXCLUSIVE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TRANSACTION )?
  private static boolean begin_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "begin_stmt_2")) return false;
    consumeToken(b, TRANSACTION);
    return true;
  }

  /* ********************************************************** */
  // PARAMETER_NAME
  public static boolean bind_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bind_parameter")) return false;
    if (!nextTokenIs(b, PARAMETER_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARAMETER_NAME);
    exit_section_(b, m, BIND_PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // NAME_LITERAL
  public static boolean collation_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collation_name")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME_LITERAL);
    exit_section_(b, m, COLLATION_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // NAME_LITERAL
  public static boolean column_alias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_alias")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME_LITERAL);
    exit_section_(b, m, COLUMN_ALIAS, r);
    return r;
  }

  /* ********************************************************** */
  // ( CONSTRAINT  NAME_LITERAL )?
  //   ( PRIMARY KEY ( ASC | DESC )? conflict_clause ( AUTOINCREMENT )?
  //   | NOT NULL conflict_clause
  //   | UNIQUE conflict_clause
  //   | CHECK '(' expr ')'
  //   | DEFAULT ( signed_number | literal_value | '(' expr ')' )
  //   | COLLATE collation_name | foreign_key_clause )
  public static boolean column_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COLUMN_CONSTRAINT, "<column constraint>");
    r = column_constraint_0(b, l + 1);
    r = r && column_constraint_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( CONSTRAINT  NAME_LITERAL )?
  private static boolean column_constraint_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_constraint_0")) return false;
    column_constraint_0_0(b, l + 1);
    return true;
  }

  // CONSTRAINT  NAME_LITERAL
  private static boolean column_constraint_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_constraint_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CONSTRAINT, NAME_LITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // PRIMARY KEY ( ASC | DESC )? conflict_clause ( AUTOINCREMENT )?
  //   | NOT NULL conflict_clause
  //   | UNIQUE conflict_clause
  //   | CHECK '(' expr ')'
  //   | DEFAULT ( signed_number | literal_value | '(' expr ')' )
  //   | COLLATE collation_name | foreign_key_clause
  private static boolean column_constraint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_constraint_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = column_constraint_1_0(b, l + 1);
    if (!r) r = column_constraint_1_1(b, l + 1);
    if (!r) r = column_constraint_1_2(b, l + 1);
    if (!r) r = column_constraint_1_3(b, l + 1);
    if (!r) r = column_constraint_1_4(b, l + 1);
    if (!r) r = column_constraint_1_5(b, l + 1);
    if (!r) r = foreign_key_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PRIMARY KEY ( ASC | DESC )? conflict_clause ( AUTOINCREMENT )?
  private static boolean column_constraint_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_constraint_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PRIMARY, KEY);
    r = r && column_constraint_1_0_2(b, l + 1);
    r = r && conflict_clause(b, l + 1);
    r = r && column_constraint_1_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ASC | DESC )?
  private static boolean column_constraint_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_constraint_1_0_2")) return false;
    column_constraint_1_0_2_0(b, l + 1);
    return true;
  }

  // ASC | DESC
  private static boolean column_constraint_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_constraint_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASC);
    if (!r) r = consumeToken(b, DESC);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( AUTOINCREMENT )?
  private static boolean column_constraint_1_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_constraint_1_0_4")) return false;
    consumeToken(b, AUTOINCREMENT);
    return true;
  }

  // NOT NULL conflict_clause
  private static boolean column_constraint_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_constraint_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NOT, NULL);
    r = r && conflict_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // UNIQUE conflict_clause
  private static boolean column_constraint_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_constraint_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNIQUE);
    r = r && conflict_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CHECK '(' expr ')'
  private static boolean column_constraint_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_constraint_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CHECK);
    r = r && consumeToken(b, "(");
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // DEFAULT ( signed_number | literal_value | '(' expr ')' )
  private static boolean column_constraint_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_constraint_1_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEFAULT);
    r = r && column_constraint_1_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // signed_number | literal_value | '(' expr ')'
  private static boolean column_constraint_1_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_constraint_1_4_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = signed_number(b, l + 1);
    if (!r) r = literal_value(b, l + 1);
    if (!r) r = column_constraint_1_4_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' expr ')'
  private static boolean column_constraint_1_4_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_constraint_1_4_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // COLLATE collation_name
  private static boolean column_constraint_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_constraint_1_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLLATE);
    r = r && collation_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // column_name ( type_name )? ( column_constraint )*
  public static boolean column_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_def")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = column_name(b, l + 1);
    r = r && column_def_1(b, l + 1);
    r = r && column_def_2(b, l + 1);
    exit_section_(b, m, COLUMN_DEF, r);
    return r;
  }

  // ( type_name )?
  private static boolean column_def_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_def_1")) return false;
    column_def_1_0(b, l + 1);
    return true;
  }

  // ( type_name )
  private static boolean column_def_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_def_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( column_constraint )*
  private static boolean column_def_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_def_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!column_def_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "column_def_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ( column_constraint )
  private static boolean column_def_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_def_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = column_constraint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NAME_LITERAL
  public static boolean column_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column_name")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME_LITERAL);
    exit_section_(b, m, COLUMN_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // ( COMMIT | END ) ( TRANSACTION )?
  public static boolean commit_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "commit_stmt")) return false;
    if (!nextTokenIs(b, "<commit stmt>", COMMIT, END)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMIT_STMT, "<commit stmt>");
    r = commit_stmt_0(b, l + 1);
    r = r && commit_stmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMIT | END
  private static boolean commit_stmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "commit_stmt_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMIT);
    if (!r) r = consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( TRANSACTION )?
  private static boolean commit_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "commit_stmt_1")) return false;
    consumeToken(b, TRANSACTION);
    return true;
  }

  /* ********************************************************** */
  // table_name ( '(' column_name ( ',' column_name )* ')' )? AS '(' select_stmt ')'
  public static boolean common_table_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "common_table_expression")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_name(b, l + 1);
    r = r && common_table_expression_1(b, l + 1);
    r = r && consumeToken(b, AS);
    r = r && consumeToken(b, "(");
    r = r && select_stmt(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, COMMON_TABLE_EXPRESSION, r);
    return r;
  }

  // ( '(' column_name ( ',' column_name )* ')' )?
  private static boolean common_table_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "common_table_expression_1")) return false;
    common_table_expression_1_0(b, l + 1);
    return true;
  }

  // '(' column_name ( ',' column_name )* ')'
  private static boolean common_table_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "common_table_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && column_name(b, l + 1);
    r = r && common_table_expression_1_0_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' column_name )*
  private static boolean common_table_expression_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "common_table_expression_1_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!common_table_expression_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "common_table_expression_1_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' column_name
  private static boolean common_table_expression_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "common_table_expression_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && column_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // UNION | UNION ALL | INTERSECT | EXCEPT
  public static boolean compound_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPOUND_OPERATOR, "<compound operator>");
    r = consumeToken(b, UNION);
    if (!r) r = parseTokens(b, 0, UNION, ALL);
    if (!r) r = consumeToken(b, INTERSECT);
    if (!r) r = consumeToken(b, EXCEPT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE ) )?
  public static boolean conflict_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conflict_clause")) return false;
    Marker m = enter_section_(b, l, _NONE_, CONFLICT_CLAUSE, "<conflict clause>");
    conflict_clause_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ON CONFLICT ( ROLLBACK | ABORT | FAIL | IGNORE | REPLACE )
  private static boolean conflict_clause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conflict_clause_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ON, CONFLICT);
    r = r && conflict_clause_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ROLLBACK | ABORT | FAIL | IGNORE | REPLACE
  private static boolean conflict_clause_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conflict_clause_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ROLLBACK);
    if (!r) r = consumeToken(b, ABORT);
    if (!r) r = consumeToken(b, FAIL);
    if (!r) r = consumeToken(b, IGNORE);
    if (!r) r = consumeToken(b, REPLACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CREATE ( UNIQUE )? INDEX ( IF NOT EXISTS )?
  //   ( database_name '.' )? index_name ON table_name '(' indexed_column ( ',' indexed_column )* ')'
  //   ( WHERE expr )?
  public static boolean create_index_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_index_stmt")) return false;
    if (!nextTokenIs(b, CREATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CREATE);
    r = r && create_index_stmt_1(b, l + 1);
    r = r && consumeToken(b, INDEX);
    r = r && create_index_stmt_3(b, l + 1);
    r = r && create_index_stmt_4(b, l + 1);
    r = r && index_name(b, l + 1);
    r = r && consumeToken(b, ON);
    r = r && table_name(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && indexed_column(b, l + 1);
    r = r && create_index_stmt_10(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && create_index_stmt_12(b, l + 1);
    exit_section_(b, m, CREATE_INDEX_STMT, r);
    return r;
  }

  // ( UNIQUE )?
  private static boolean create_index_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_index_stmt_1")) return false;
    consumeToken(b, UNIQUE);
    return true;
  }

  // ( IF NOT EXISTS )?
  private static boolean create_index_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_index_stmt_3")) return false;
    create_index_stmt_3_0(b, l + 1);
    return true;
  }

  // IF NOT EXISTS
  private static boolean create_index_stmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_index_stmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, NOT, EXISTS);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( database_name '.' )?
  private static boolean create_index_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_index_stmt_4")) return false;
    create_index_stmt_4_0(b, l + 1);
    return true;
  }

  // database_name '.'
  private static boolean create_index_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_index_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' indexed_column )*
  private static boolean create_index_stmt_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_index_stmt_10")) return false;
    int c = current_position_(b);
    while (true) {
      if (!create_index_stmt_10_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "create_index_stmt_10", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' indexed_column
  private static boolean create_index_stmt_10_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_index_stmt_10_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && indexed_column(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WHERE expr )?
  private static boolean create_index_stmt_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_index_stmt_12")) return false;
    create_index_stmt_12_0(b, l + 1);
    return true;
  }

  // WHERE expr
  private static boolean create_index_stmt_12_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_index_stmt_12_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CREATE ( TEMP | TEMPORARY )? TABLE ( IF NOT EXISTS )?
  //   ( database_name '.' )? table_name
  //   ( '(' column_def ( ',' column_def )* ( ',' table_constraint )* ')' ( WITHOUT ROWID )? | AS select_stmt )
  public static boolean create_table_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_stmt")) return false;
    if (!nextTokenIs(b, CREATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CREATE);
    r = r && create_table_stmt_1(b, l + 1);
    r = r && consumeToken(b, TABLE);
    r = r && create_table_stmt_3(b, l + 1);
    r = r && create_table_stmt_4(b, l + 1);
    r = r && table_name(b, l + 1);
    r = r && create_table_stmt_6(b, l + 1);
    exit_section_(b, m, CREATE_TABLE_STMT, r);
    return r;
  }

  // ( TEMP | TEMPORARY )?
  private static boolean create_table_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_stmt_1")) return false;
    create_table_stmt_1_0(b, l + 1);
    return true;
  }

  // TEMP | TEMPORARY
  private static boolean create_table_stmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_stmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEMP);
    if (!r) r = consumeToken(b, TEMPORARY);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IF NOT EXISTS )?
  private static boolean create_table_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_stmt_3")) return false;
    create_table_stmt_3_0(b, l + 1);
    return true;
  }

  // IF NOT EXISTS
  private static boolean create_table_stmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_stmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, NOT, EXISTS);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( database_name '.' )?
  private static boolean create_table_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_stmt_4")) return false;
    create_table_stmt_4_0(b, l + 1);
    return true;
  }

  // database_name '.'
  private static boolean create_table_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' column_def ( ',' column_def )* ( ',' table_constraint )* ')' ( WITHOUT ROWID )? | AS select_stmt
  private static boolean create_table_stmt_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_stmt_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = create_table_stmt_6_0(b, l + 1);
    if (!r) r = create_table_stmt_6_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' column_def ( ',' column_def )* ( ',' table_constraint )* ')' ( WITHOUT ROWID )?
  private static boolean create_table_stmt_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_stmt_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && column_def(b, l + 1);
    r = r && create_table_stmt_6_0_2(b, l + 1);
    r = r && create_table_stmt_6_0_3(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && create_table_stmt_6_0_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' column_def )*
  private static boolean create_table_stmt_6_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_stmt_6_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!create_table_stmt_6_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "create_table_stmt_6_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' column_def
  private static boolean create_table_stmt_6_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_stmt_6_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && column_def(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' table_constraint )*
  private static boolean create_table_stmt_6_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_stmt_6_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!create_table_stmt_6_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "create_table_stmt_6_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' table_constraint
  private static boolean create_table_stmt_6_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_stmt_6_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && table_constraint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WITHOUT ROWID )?
  private static boolean create_table_stmt_6_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_stmt_6_0_5")) return false;
    create_table_stmt_6_0_5_0(b, l + 1);
    return true;
  }

  // WITHOUT ROWID
  private static boolean create_table_stmt_6_0_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_stmt_6_0_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WITHOUT, ROWID);
    exit_section_(b, m, null, r);
    return r;
  }

  // AS select_stmt
  private static boolean create_table_stmt_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_table_stmt_6_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && select_stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CREATE ( TEMP | TEMPORARY )? TRIGGER ( IF NOT EXISTS )?
  //   ( database_name '.' )? trigger_name ( BEFORE | AFTER | INSTEAD OF )?
  //   ( DELETE | INSERT | UPDATE ( OF column_name ( ',' column_name )* )? ) ON table_name
  //   ( FOR EACH ROW )? ( WHEN expr )?
  //   BEGIN ( update_stmt | insert_stmt | delete_stmt | select_stmt ) ';' END
  public static boolean create_trigger_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_trigger_stmt")) return false;
    if (!nextTokenIs(b, CREATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CREATE);
    r = r && create_trigger_stmt_1(b, l + 1);
    r = r && consumeToken(b, TRIGGER);
    r = r && create_trigger_stmt_3(b, l + 1);
    r = r && create_trigger_stmt_4(b, l + 1);
    r = r && trigger_name(b, l + 1);
    r = r && create_trigger_stmt_6(b, l + 1);
    r = r && create_trigger_stmt_7(b, l + 1);
    r = r && consumeToken(b, ON);
    r = r && table_name(b, l + 1);
    r = r && create_trigger_stmt_10(b, l + 1);
    r = r && create_trigger_stmt_11(b, l + 1);
    r = r && consumeToken(b, BEGIN);
    r = r && create_trigger_stmt_13(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && consumeToken(b, END);
    exit_section_(b, m, CREATE_TRIGGER_STMT, r);
    return r;
  }

  // ( TEMP | TEMPORARY )?
  private static boolean create_trigger_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_trigger_stmt_1")) return false;
    create_trigger_stmt_1_0(b, l + 1);
    return true;
  }

  // TEMP | TEMPORARY
  private static boolean create_trigger_stmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_trigger_stmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEMP);
    if (!r) r = consumeToken(b, TEMPORARY);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IF NOT EXISTS )?
  private static boolean create_trigger_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_trigger_stmt_3")) return false;
    create_trigger_stmt_3_0(b, l + 1);
    return true;
  }

  // IF NOT EXISTS
  private static boolean create_trigger_stmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_trigger_stmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, NOT, EXISTS);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( database_name '.' )?
  private static boolean create_trigger_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_trigger_stmt_4")) return false;
    create_trigger_stmt_4_0(b, l + 1);
    return true;
  }

  // database_name '.'
  private static boolean create_trigger_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_trigger_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( BEFORE | AFTER | INSTEAD OF )?
  private static boolean create_trigger_stmt_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_trigger_stmt_6")) return false;
    create_trigger_stmt_6_0(b, l + 1);
    return true;
  }

  // BEFORE | AFTER | INSTEAD OF
  private static boolean create_trigger_stmt_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_trigger_stmt_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BEFORE);
    if (!r) r = consumeToken(b, AFTER);
    if (!r) r = parseTokens(b, 0, INSTEAD, OF);
    exit_section_(b, m, null, r);
    return r;
  }

  // DELETE | INSERT | UPDATE ( OF column_name ( ',' column_name )* )?
  private static boolean create_trigger_stmt_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_trigger_stmt_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DELETE);
    if (!r) r = consumeToken(b, INSERT);
    if (!r) r = create_trigger_stmt_7_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // UPDATE ( OF column_name ( ',' column_name )* )?
  private static boolean create_trigger_stmt_7_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_trigger_stmt_7_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UPDATE);
    r = r && create_trigger_stmt_7_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( OF column_name ( ',' column_name )* )?
  private static boolean create_trigger_stmt_7_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_trigger_stmt_7_2_1")) return false;
    create_trigger_stmt_7_2_1_0(b, l + 1);
    return true;
  }

  // OF column_name ( ',' column_name )*
  private static boolean create_trigger_stmt_7_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_trigger_stmt_7_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OF);
    r = r && column_name(b, l + 1);
    r = r && create_trigger_stmt_7_2_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' column_name )*
  private static boolean create_trigger_stmt_7_2_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_trigger_stmt_7_2_1_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!create_trigger_stmt_7_2_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "create_trigger_stmt_7_2_1_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' column_name
  private static boolean create_trigger_stmt_7_2_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_trigger_stmt_7_2_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && column_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FOR EACH ROW )?
  private static boolean create_trigger_stmt_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_trigger_stmt_10")) return false;
    create_trigger_stmt_10_0(b, l + 1);
    return true;
  }

  // FOR EACH ROW
  private static boolean create_trigger_stmt_10_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_trigger_stmt_10_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, EACH, ROW);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WHEN expr )?
  private static boolean create_trigger_stmt_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_trigger_stmt_11")) return false;
    create_trigger_stmt_11_0(b, l + 1);
    return true;
  }

  // WHEN expr
  private static boolean create_trigger_stmt_11_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_trigger_stmt_11_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // update_stmt | insert_stmt | delete_stmt | select_stmt
  private static boolean create_trigger_stmt_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_trigger_stmt_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = update_stmt(b, l + 1);
    if (!r) r = insert_stmt(b, l + 1);
    if (!r) r = delete_stmt(b, l + 1);
    if (!r) r = select_stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CREATE ( TEMP | TEMPORARY )? VIEW ( IF NOT EXISTS )?
  //   ( database_name '.' )? view_name AS select_stmt
  public static boolean create_view_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_view_stmt")) return false;
    if (!nextTokenIs(b, CREATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CREATE);
    r = r && create_view_stmt_1(b, l + 1);
    r = r && consumeToken(b, VIEW);
    r = r && create_view_stmt_3(b, l + 1);
    r = r && create_view_stmt_4(b, l + 1);
    r = r && view_name(b, l + 1);
    r = r && consumeToken(b, AS);
    r = r && select_stmt(b, l + 1);
    exit_section_(b, m, CREATE_VIEW_STMT, r);
    return r;
  }

  // ( TEMP | TEMPORARY )?
  private static boolean create_view_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_view_stmt_1")) return false;
    create_view_stmt_1_0(b, l + 1);
    return true;
  }

  // TEMP | TEMPORARY
  private static boolean create_view_stmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_view_stmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEMP);
    if (!r) r = consumeToken(b, TEMPORARY);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( IF NOT EXISTS )?
  private static boolean create_view_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_view_stmt_3")) return false;
    create_view_stmt_3_0(b, l + 1);
    return true;
  }

  // IF NOT EXISTS
  private static boolean create_view_stmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_view_stmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, NOT, EXISTS);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( database_name '.' )?
  private static boolean create_view_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_view_stmt_4")) return false;
    create_view_stmt_4_0(b, l + 1);
    return true;
  }

  // database_name '.'
  private static boolean create_view_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_view_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CREATE VIRTUAL TABLE ( IF NOT EXISTS )?
  //   ( database_name '.' )? table_name
  //   USING module_name ( '(' module_argument ( ',' module_argument )* ')' )?
  public static boolean create_virtual_table_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_virtual_table_stmt")) return false;
    if (!nextTokenIs(b, CREATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CREATE, VIRTUAL, TABLE);
    r = r && create_virtual_table_stmt_3(b, l + 1);
    r = r && create_virtual_table_stmt_4(b, l + 1);
    r = r && table_name(b, l + 1);
    r = r && consumeToken(b, USING);
    r = r && module_name(b, l + 1);
    r = r && create_virtual_table_stmt_8(b, l + 1);
    exit_section_(b, m, CREATE_VIRTUAL_TABLE_STMT, r);
    return r;
  }

  // ( IF NOT EXISTS )?
  private static boolean create_virtual_table_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_virtual_table_stmt_3")) return false;
    create_virtual_table_stmt_3_0(b, l + 1);
    return true;
  }

  // IF NOT EXISTS
  private static boolean create_virtual_table_stmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_virtual_table_stmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, NOT, EXISTS);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( database_name '.' )?
  private static boolean create_virtual_table_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_virtual_table_stmt_4")) return false;
    create_virtual_table_stmt_4_0(b, l + 1);
    return true;
  }

  // database_name '.'
  private static boolean create_virtual_table_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_virtual_table_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( '(' module_argument ( ',' module_argument )* ')' )?
  private static boolean create_virtual_table_stmt_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_virtual_table_stmt_8")) return false;
    create_virtual_table_stmt_8_0(b, l + 1);
    return true;
  }

  // '(' module_argument ( ',' module_argument )* ')'
  private static boolean create_virtual_table_stmt_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_virtual_table_stmt_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && module_argument(b, l + 1);
    r = r && create_virtual_table_stmt_8_0_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' module_argument )*
  private static boolean create_virtual_table_stmt_8_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_virtual_table_stmt_8_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!create_virtual_table_stmt_8_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "create_virtual_table_stmt_8_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' module_argument
  private static boolean create_virtual_table_stmt_8_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "create_virtual_table_stmt_8_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && module_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // table_name ( '(' column_name ( ',' column_name )* ')' )?
  public static boolean cte_table_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cte_table_name")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_name(b, l + 1);
    r = r && cte_table_name_1(b, l + 1);
    exit_section_(b, m, CTE_TABLE_NAME, r);
    return r;
  }

  // ( '(' column_name ( ',' column_name )* ')' )?
  private static boolean cte_table_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cte_table_name_1")) return false;
    cte_table_name_1_0(b, l + 1);
    return true;
  }

  // '(' column_name ( ',' column_name )* ')'
  private static boolean cte_table_name_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cte_table_name_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && column_name(b, l + 1);
    r = r && cte_table_name_1_0_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' column_name )*
  private static boolean cte_table_name_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cte_table_name_1_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!cte_table_name_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cte_table_name_1_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' column_name
  private static boolean cte_table_name_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cte_table_name_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && column_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NAME_LITERAL
  public static boolean database_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "database_name")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME_LITERAL);
    exit_section_(b, m, DATABASE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // ( with_clause )? DELETE FROM qualified_table_name
  // ( WHERE expr )?
  public static boolean delete_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_stmt")) return false;
    if (!nextTokenIs(b, "<delete stmt>", DELETE, WITH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DELETE_STMT, "<delete stmt>");
    r = delete_stmt_0(b, l + 1);
    r = r && consumeTokens(b, 0, DELETE, FROM);
    r = r && qualified_table_name(b, l + 1);
    r = r && delete_stmt_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( with_clause )?
  private static boolean delete_stmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_stmt_0")) return false;
    delete_stmt_0_0(b, l + 1);
    return true;
  }

  // ( with_clause )
  private static boolean delete_stmt_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_stmt_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = with_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WHERE expr )?
  private static boolean delete_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_stmt_4")) return false;
    delete_stmt_4_0(b, l + 1);
    return true;
  }

  // WHERE expr
  private static boolean delete_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( with_clause )? DELETE FROM qualified_table_name
  //   ( WHERE expr )?
  //   ( ( ORDER BY ordering_term ( ',' ordering_term )* )?
  //   LIMIT expr ( ( OFFSET | ',' ) expr )? )?
  public static boolean delete_stmt_limited(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_stmt_limited")) return false;
    if (!nextTokenIs(b, "<delete stmt limited>", DELETE, WITH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DELETE_STMT_LIMITED, "<delete stmt limited>");
    r = delete_stmt_limited_0(b, l + 1);
    r = r && consumeTokens(b, 0, DELETE, FROM);
    r = r && qualified_table_name(b, l + 1);
    r = r && delete_stmt_limited_4(b, l + 1);
    r = r && delete_stmt_limited_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( with_clause )?
  private static boolean delete_stmt_limited_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_stmt_limited_0")) return false;
    delete_stmt_limited_0_0(b, l + 1);
    return true;
  }

  // ( with_clause )
  private static boolean delete_stmt_limited_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_stmt_limited_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = with_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WHERE expr )?
  private static boolean delete_stmt_limited_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_stmt_limited_4")) return false;
    delete_stmt_limited_4_0(b, l + 1);
    return true;
  }

  // WHERE expr
  private static boolean delete_stmt_limited_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_stmt_limited_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( ORDER BY ordering_term ( ',' ordering_term )* )?
  //   LIMIT expr ( ( OFFSET | ',' ) expr )? )?
  private static boolean delete_stmt_limited_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_stmt_limited_5")) return false;
    delete_stmt_limited_5_0(b, l + 1);
    return true;
  }

  // ( ORDER BY ordering_term ( ',' ordering_term )* )?
  //   LIMIT expr ( ( OFFSET | ',' ) expr )?
  private static boolean delete_stmt_limited_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_stmt_limited_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = delete_stmt_limited_5_0_0(b, l + 1);
    r = r && consumeToken(b, LIMIT);
    r = r && expr(b, l + 1);
    r = r && delete_stmt_limited_5_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ORDER BY ordering_term ( ',' ordering_term )* )?
  private static boolean delete_stmt_limited_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_stmt_limited_5_0_0")) return false;
    delete_stmt_limited_5_0_0_0(b, l + 1);
    return true;
  }

  // ORDER BY ordering_term ( ',' ordering_term )*
  private static boolean delete_stmt_limited_5_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_stmt_limited_5_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ORDER, BY);
    r = r && ordering_term(b, l + 1);
    r = r && delete_stmt_limited_5_0_0_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' ordering_term )*
  private static boolean delete_stmt_limited_5_0_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_stmt_limited_5_0_0_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!delete_stmt_limited_5_0_0_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "delete_stmt_limited_5_0_0_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' ordering_term
  private static boolean delete_stmt_limited_5_0_0_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_stmt_limited_5_0_0_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && ordering_term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( OFFSET | ',' ) expr )?
  private static boolean delete_stmt_limited_5_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_stmt_limited_5_0_3")) return false;
    delete_stmt_limited_5_0_3_0(b, l + 1);
    return true;
  }

  // ( OFFSET | ',' ) expr
  private static boolean delete_stmt_limited_5_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_stmt_limited_5_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = delete_stmt_limited_5_0_3_0_0(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OFFSET | ','
  private static boolean delete_stmt_limited_5_0_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delete_stmt_limited_5_0_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OFFSET);
    if (!r) r = consumeToken(b, ",");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DETACH ( DATABASE )? database_name
  public static boolean detach_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "detach_stmt")) return false;
    if (!nextTokenIs(b, DETACH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DETACH);
    r = r && detach_stmt_1(b, l + 1);
    r = r && database_name(b, l + 1);
    exit_section_(b, m, DETACH_STMT, r);
    return r;
  }

  // ( DATABASE )?
  private static boolean detach_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "detach_stmt_1")) return false;
    consumeToken(b, DATABASE);
    return true;
  }

  /* ********************************************************** */
  // DROP INDEX ( IF EXISTS )? ( database_name '.' )? index_name
  public static boolean drop_index_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_index_stmt")) return false;
    if (!nextTokenIs(b, DROP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DROP, INDEX);
    r = r && drop_index_stmt_2(b, l + 1);
    r = r && drop_index_stmt_3(b, l + 1);
    r = r && index_name(b, l + 1);
    exit_section_(b, m, DROP_INDEX_STMT, r);
    return r;
  }

  // ( IF EXISTS )?
  private static boolean drop_index_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_index_stmt_2")) return false;
    drop_index_stmt_2_0(b, l + 1);
    return true;
  }

  // IF EXISTS
  private static boolean drop_index_stmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_index_stmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, EXISTS);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( database_name '.' )?
  private static boolean drop_index_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_index_stmt_3")) return false;
    drop_index_stmt_3_0(b, l + 1);
    return true;
  }

  // database_name '.'
  private static boolean drop_index_stmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_index_stmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DROP TABLE ( IF EXISTS )? ( database_name '.' )? table_name
  public static boolean drop_table_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_table_stmt")) return false;
    if (!nextTokenIs(b, DROP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DROP, TABLE);
    r = r && drop_table_stmt_2(b, l + 1);
    r = r && drop_table_stmt_3(b, l + 1);
    r = r && table_name(b, l + 1);
    exit_section_(b, m, DROP_TABLE_STMT, r);
    return r;
  }

  // ( IF EXISTS )?
  private static boolean drop_table_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_table_stmt_2")) return false;
    drop_table_stmt_2_0(b, l + 1);
    return true;
  }

  // IF EXISTS
  private static boolean drop_table_stmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_table_stmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, EXISTS);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( database_name '.' )?
  private static boolean drop_table_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_table_stmt_3")) return false;
    drop_table_stmt_3_0(b, l + 1);
    return true;
  }

  // database_name '.'
  private static boolean drop_table_stmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_table_stmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DROP TRIGGER ( IF EXISTS )? ( database_name '.' )? trigger_name
  public static boolean drop_trigger_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_trigger_stmt")) return false;
    if (!nextTokenIs(b, DROP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DROP, TRIGGER);
    r = r && drop_trigger_stmt_2(b, l + 1);
    r = r && drop_trigger_stmt_3(b, l + 1);
    r = r && trigger_name(b, l + 1);
    exit_section_(b, m, DROP_TRIGGER_STMT, r);
    return r;
  }

  // ( IF EXISTS )?
  private static boolean drop_trigger_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_trigger_stmt_2")) return false;
    drop_trigger_stmt_2_0(b, l + 1);
    return true;
  }

  // IF EXISTS
  private static boolean drop_trigger_stmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_trigger_stmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, EXISTS);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( database_name '.' )?
  private static boolean drop_trigger_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_trigger_stmt_3")) return false;
    drop_trigger_stmt_3_0(b, l + 1);
    return true;
  }

  // database_name '.'
  private static boolean drop_trigger_stmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_trigger_stmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DROP VIEW ( IF EXISTS )? ( database_name '.' )? view_name
  public static boolean drop_view_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_view_stmt")) return false;
    if (!nextTokenIs(b, DROP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DROP, VIEW);
    r = r && drop_view_stmt_2(b, l + 1);
    r = r && drop_view_stmt_3(b, l + 1);
    r = r && view_name(b, l + 1);
    exit_section_(b, m, DROP_VIEW_STMT, r);
    return r;
  }

  // ( IF EXISTS )?
  private static boolean drop_view_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_view_stmt_2")) return false;
    drop_view_stmt_2_0(b, l + 1);
    return true;
  }

  // IF EXISTS
  private static boolean drop_view_stmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_view_stmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, EXISTS);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( database_name '.' )?
  private static boolean drop_view_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_view_stmt_3")) return false;
    drop_view_stmt_3_0(b, l + 1);
    return true;
  }

  // database_name '.'
  private static boolean drop_view_stmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "drop_view_stmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_LITERAL
  public static boolean error_message(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "error_message")) return false;
    if (!nextTokenIs(b, STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_LITERAL);
    exit_section_(b, m, ERROR_MESSAGE, r);
    return r;
  }

  /* ********************************************************** */
  // literal_value
  //   | bind_parameter
  //   | ( ( database_name '.' )? table_name '.' )? column_name
  //   | unary_operator expr
  //   //| expr binary_operator expr
  //   | function_name '(' ( ( DISTINCT )? expr ( ',' expr )* | '*' )? ')'
  //   | '(' expr ')'
  //   | CAST '(' expr AS type_name ')'
  //   //| expr COLLATE collation_name
  //   //| expr ( NOT )? ( LIKE | GLOB | REGEXP | MATCH ) expr ( ESCAPE expr )?
  //   //| expr ( ISNULL | NOTNULL | NOT NULL )
  //   //| expr IS ( NOT )? expr
  //   //| expr ( NOT )? BETWEEN expr AND expr
  //   //| expr ( NOT )? IN ( '(' ( select_stmt | expr ( ',' expr )* )? ')' | ( database_name '.' )? table_name )
  //   | ( ( NOT )? EXISTS )? '(' select_stmt ')'
  //   | CASE ( expr )? WHEN expr THEN expr ( ELSE expr )? END
  //   | raise_function
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = literal_value(b, l + 1);
    if (!r) r = bind_parameter(b, l + 1);
    if (!r) r = expr_2(b, l + 1);
    if (!r) r = expr_3(b, l + 1);
    if (!r) r = expr_4(b, l + 1);
    if (!r) r = expr_5(b, l + 1);
    if (!r) r = expr_6(b, l + 1);
    if (!r) r = expr_7(b, l + 1);
    if (!r) r = expr_8(b, l + 1);
    if (!r) r = raise_function(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ( database_name '.' )? table_name '.' )? column_name
  private static boolean expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_2_0(b, l + 1);
    r = r && column_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( database_name '.' )? table_name '.' )?
  private static boolean expr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_2_0")) return false;
    expr_2_0_0(b, l + 1);
    return true;
  }

  // ( database_name '.' )? table_name '.'
  private static boolean expr_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_2_0_0_0(b, l + 1);
    r = r && table_name(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( database_name '.' )?
  private static boolean expr_2_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_2_0_0_0")) return false;
    expr_2_0_0_0_0(b, l + 1);
    return true;
  }

  // database_name '.'
  private static boolean expr_2_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_2_0_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  // unary_operator expr
  private static boolean expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unary_operator(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // function_name '(' ( ( DISTINCT )? expr ( ',' expr )* | '*' )? ')'
  private static boolean expr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_name(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && expr_4_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( DISTINCT )? expr ( ',' expr )* | '*' )?
  private static boolean expr_4_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_4_2")) return false;
    expr_4_2_0(b, l + 1);
    return true;
  }

  // ( DISTINCT )? expr ( ',' expr )* | '*'
  private static boolean expr_4_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_4_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_4_2_0_0(b, l + 1);
    if (!r) r = consumeToken(b, "*");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DISTINCT )? expr ( ',' expr )*
  private static boolean expr_4_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_4_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_4_2_0_0_0(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && expr_4_2_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DISTINCT )?
  private static boolean expr_4_2_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_4_2_0_0_0")) return false;
    consumeToken(b, DISTINCT);
    return true;
  }

  // ( ',' expr )*
  private static boolean expr_4_2_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_4_2_0_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expr_4_2_0_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_4_2_0_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' expr
  private static boolean expr_4_2_0_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_4_2_0_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' expr ')'
  private static boolean expr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // CAST '(' expr AS type_name ')'
  private static boolean expr_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CAST);
    r = r && consumeToken(b, "(");
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, AS);
    r = r && type_name(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( NOT )? EXISTS )? '(' select_stmt ')'
  private static boolean expr_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_7_0(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && select_stmt(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( NOT )? EXISTS )?
  private static boolean expr_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_7_0")) return false;
    expr_7_0_0(b, l + 1);
    return true;
  }

  // ( NOT )? EXISTS
  private static boolean expr_7_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_7_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_7_0_0_0(b, l + 1);
    r = r && consumeToken(b, EXISTS);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( NOT )?
  private static boolean expr_7_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_7_0_0_0")) return false;
    consumeToken(b, NOT);
    return true;
  }

  // CASE ( expr )? WHEN expr THEN expr ( ELSE expr )? END
  private static boolean expr_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CASE);
    r = r && expr_8_1(b, l + 1);
    r = r && consumeToken(b, WHEN);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, THEN);
    r = r && expr(b, l + 1);
    r = r && expr_8_6(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( expr )?
  private static boolean expr_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_8_1")) return false;
    expr_8_1_0(b, l + 1);
    return true;
  }

  // ( expr )
  private static boolean expr_8_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_8_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ELSE expr )?
  private static boolean expr_8_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_8_6")) return false;
    expr_8_6_0(b, l + 1);
    return true;
  }

  // ELSE expr
  private static boolean expr_8_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_8_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // REFERENCES foreign_table ( '(' column_name ( ',' column_name )* ')' )?
  //   ( ( ON ( DELETE | UPDATE ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT | NO ACTION ) | MATCH  NAME_LITERAL ) )?
  //   ( ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? )?
  public static boolean foreign_key_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_key_clause")) return false;
    if (!nextTokenIs(b, REFERENCES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REFERENCES);
    r = r && foreign_table(b, l + 1);
    r = r && foreign_key_clause_2(b, l + 1);
    r = r && foreign_key_clause_3(b, l + 1);
    r = r && foreign_key_clause_4(b, l + 1);
    exit_section_(b, m, FOREIGN_KEY_CLAUSE, r);
    return r;
  }

  // ( '(' column_name ( ',' column_name )* ')' )?
  private static boolean foreign_key_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_key_clause_2")) return false;
    foreign_key_clause_2_0(b, l + 1);
    return true;
  }

  // '(' column_name ( ',' column_name )* ')'
  private static boolean foreign_key_clause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_key_clause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && column_name(b, l + 1);
    r = r && foreign_key_clause_2_0_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' column_name )*
  private static boolean foreign_key_clause_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_key_clause_2_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!foreign_key_clause_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "foreign_key_clause_2_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' column_name
  private static boolean foreign_key_clause_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_key_clause_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && column_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( ON ( DELETE | UPDATE ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT | NO ACTION ) | MATCH  NAME_LITERAL ) )?
  private static boolean foreign_key_clause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_key_clause_3")) return false;
    foreign_key_clause_3_0(b, l + 1);
    return true;
  }

  // ON ( DELETE | UPDATE ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT | NO ACTION ) | MATCH  NAME_LITERAL
  private static boolean foreign_key_clause_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_key_clause_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = foreign_key_clause_3_0_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, MATCH, NAME_LITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // ON ( DELETE | UPDATE ) ( SET NULL | SET DEFAULT | CASCADE | RESTRICT | NO ACTION )
  private static boolean foreign_key_clause_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_key_clause_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON);
    r = r && foreign_key_clause_3_0_0_1(b, l + 1);
    r = r && foreign_key_clause_3_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DELETE | UPDATE
  private static boolean foreign_key_clause_3_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_key_clause_3_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DELETE);
    if (!r) r = consumeToken(b, UPDATE);
    exit_section_(b, m, null, r);
    return r;
  }

  // SET NULL | SET DEFAULT | CASCADE | RESTRICT | NO ACTION
  private static boolean foreign_key_clause_3_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_key_clause_3_0_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, SET, NULL);
    if (!r) r = parseTokens(b, 0, SET, DEFAULT);
    if (!r) r = consumeToken(b, CASCADE);
    if (!r) r = consumeToken(b, RESTRICT);
    if (!r) r = parseTokens(b, 0, NO, ACTION);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )? )?
  private static boolean foreign_key_clause_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_key_clause_4")) return false;
    foreign_key_clause_4_0(b, l + 1);
    return true;
  }

  // ( NOT )? DEFERRABLE ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
  private static boolean foreign_key_clause_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_key_clause_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = foreign_key_clause_4_0_0(b, l + 1);
    r = r && consumeToken(b, DEFERRABLE);
    r = r && foreign_key_clause_4_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( NOT )?
  private static boolean foreign_key_clause_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_key_clause_4_0_0")) return false;
    consumeToken(b, NOT);
    return true;
  }

  // ( INITIALLY DEFERRED | INITIALLY IMMEDIATE )?
  private static boolean foreign_key_clause_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_key_clause_4_0_2")) return false;
    foreign_key_clause_4_0_2_0(b, l + 1);
    return true;
  }

  // INITIALLY DEFERRED | INITIALLY IMMEDIATE
  private static boolean foreign_key_clause_4_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_key_clause_4_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, INITIALLY, DEFERRED);
    if (!r) r = parseTokens(b, 0, INITIALLY, IMMEDIATE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NAME_LITERAL
  public static boolean foreign_table(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreign_table")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME_LITERAL);
    exit_section_(b, m, FOREIGN_TABLE, r);
    return r;
  }

  /* ********************************************************** */
  // NAME_LITERAL
  public static boolean function_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_name")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME_LITERAL);
    exit_section_(b, m, FUNCTION_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // NAME_LITERAL
  public static boolean index_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index_name")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME_LITERAL);
    exit_section_(b, m, INDEX_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // column_name ( COLLATE collation_name )? ( ASC | DESC )?
  public static boolean indexed_column(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexed_column")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = column_name(b, l + 1);
    r = r && indexed_column_1(b, l + 1);
    r = r && indexed_column_2(b, l + 1);
    exit_section_(b, m, INDEXED_COLUMN, r);
    return r;
  }

  // ( COLLATE collation_name )?
  private static boolean indexed_column_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexed_column_1")) return false;
    indexed_column_1_0(b, l + 1);
    return true;
  }

  // COLLATE collation_name
  private static boolean indexed_column_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexed_column_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLLATE);
    r = r && collation_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ASC | DESC )?
  private static boolean indexed_column_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexed_column_2")) return false;
    indexed_column_2_0(b, l + 1);
    return true;
  }

  // ASC | DESC
  private static boolean indexed_column_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexed_column_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASC);
    if (!r) r = consumeToken(b, DESC);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( with_clause )? ( INSERT | REPLACE | INSERT OR REPLACE | INSERT OR ROLLBACK | INSERT OR ABORT | INSERT OR FAIL | INSERT OR IGNORE ) INTO
  //   ( database_name '.' )? table_name ( '(' column_name ( ',' column_name )* ')' )?
  //   ( VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )* | select_stmt | DEFAULT VALUES )
  public static boolean insert_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSERT_STMT, "<insert stmt>");
    r = insert_stmt_0(b, l + 1);
    r = r && insert_stmt_1(b, l + 1);
    r = r && consumeToken(b, INTO);
    r = r && insert_stmt_3(b, l + 1);
    r = r && table_name(b, l + 1);
    r = r && insert_stmt_5(b, l + 1);
    r = r && insert_stmt_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( with_clause )?
  private static boolean insert_stmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_stmt_0")) return false;
    insert_stmt_0_0(b, l + 1);
    return true;
  }

  // ( with_clause )
  private static boolean insert_stmt_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_stmt_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = with_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INSERT | REPLACE | INSERT OR REPLACE | INSERT OR ROLLBACK | INSERT OR ABORT | INSERT OR FAIL | INSERT OR IGNORE
  private static boolean insert_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_stmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INSERT);
    if (!r) r = consumeToken(b, REPLACE);
    if (!r) r = parseTokens(b, 0, INSERT, OR, REPLACE);
    if (!r) r = parseTokens(b, 0, INSERT, OR, ROLLBACK);
    if (!r) r = parseTokens(b, 0, INSERT, OR, ABORT);
    if (!r) r = parseTokens(b, 0, INSERT, OR, FAIL);
    if (!r) r = parseTokens(b, 0, INSERT, OR, IGNORE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( database_name '.' )?
  private static boolean insert_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_stmt_3")) return false;
    insert_stmt_3_0(b, l + 1);
    return true;
  }

  // database_name '.'
  private static boolean insert_stmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_stmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( '(' column_name ( ',' column_name )* ')' )?
  private static boolean insert_stmt_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_stmt_5")) return false;
    insert_stmt_5_0(b, l + 1);
    return true;
  }

  // '(' column_name ( ',' column_name )* ')'
  private static boolean insert_stmt_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_stmt_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && column_name(b, l + 1);
    r = r && insert_stmt_5_0_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' column_name )*
  private static boolean insert_stmt_5_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_stmt_5_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!insert_stmt_5_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "insert_stmt_5_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' column_name
  private static boolean insert_stmt_5_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_stmt_5_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && column_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )* | select_stmt | DEFAULT VALUES
  private static boolean insert_stmt_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_stmt_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = insert_stmt_6_0(b, l + 1);
    if (!r) r = select_stmt(b, l + 1);
    if (!r) r = parseTokens(b, 0, DEFAULT, VALUES);
    exit_section_(b, m, null, r);
    return r;
  }

  // VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
  private static boolean insert_stmt_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_stmt_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALUES);
    r = r && consumeToken(b, "(");
    r = r && expr(b, l + 1);
    r = r && insert_stmt_6_0_3(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && insert_stmt_6_0_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' expr )*
  private static boolean insert_stmt_6_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_stmt_6_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!insert_stmt_6_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "insert_stmt_6_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' expr
  private static boolean insert_stmt_6_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_stmt_6_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' '(' expr ( ',' expr )* ')' )*
  private static boolean insert_stmt_6_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_stmt_6_0_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!insert_stmt_6_0_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "insert_stmt_6_0_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' '(' expr ( ',' expr )* ')'
  private static boolean insert_stmt_6_0_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_stmt_6_0_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, "(");
    r = r && expr(b, l + 1);
    r = r && insert_stmt_6_0_5_0_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' expr )*
  private static boolean insert_stmt_6_0_5_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_stmt_6_0_5_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!insert_stmt_6_0_5_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "insert_stmt_6_0_5_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' expr
  private static boolean insert_stmt_6_0_5_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insert_stmt_6_0_5_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // table_or_subquery ( join_operator table_or_subquery join_constraint )?
  public static boolean join_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JOIN_CLAUSE, "<join clause>");
    r = table_or_subquery(b, l + 1);
    r = r && join_clause_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( join_operator table_or_subquery join_constraint )?
  private static boolean join_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_clause_1")) return false;
    join_clause_1_0(b, l + 1);
    return true;
  }

  // join_operator table_or_subquery join_constraint
  private static boolean join_clause_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_clause_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = join_operator(b, l + 1);
    r = r && table_or_subquery(b, l + 1);
    r = r && join_constraint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( ON expr | USING '(' column_name ( ',' column_name )* ')' )?
  public static boolean join_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_constraint")) return false;
    Marker m = enter_section_(b, l, _NONE_, JOIN_CONSTRAINT, "<join constraint>");
    join_constraint_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ON expr | USING '(' column_name ( ',' column_name )* ')'
  private static boolean join_constraint_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_constraint_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = join_constraint_0_0(b, l + 1);
    if (!r) r = join_constraint_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ON expr
  private static boolean join_constraint_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_constraint_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // USING '(' column_name ( ',' column_name )* ')'
  private static boolean join_constraint_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_constraint_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USING);
    r = r && consumeToken(b, "(");
    r = r && column_name(b, l + 1);
    r = r && join_constraint_0_1_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' column_name )*
  private static boolean join_constraint_0_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_constraint_0_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!join_constraint_0_1_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "join_constraint_0_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' column_name
  private static boolean join_constraint_0_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_constraint_0_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && column_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ',' | ( NATURAL )? ( LEFT ( OUTER )? | INNER | CROSS )? JOIN
  public static boolean join_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JOIN_OPERATOR, "<join operator>");
    r = consumeToken(b, ",");
    if (!r) r = join_operator_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( NATURAL )? ( LEFT ( OUTER )? | INNER | CROSS )? JOIN
  private static boolean join_operator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_operator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = join_operator_1_0(b, l + 1);
    r = r && join_operator_1_1(b, l + 1);
    r = r && consumeToken(b, JOIN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( NATURAL )?
  private static boolean join_operator_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_operator_1_0")) return false;
    consumeToken(b, NATURAL);
    return true;
  }

  // ( LEFT ( OUTER )? | INNER | CROSS )?
  private static boolean join_operator_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_operator_1_1")) return false;
    join_operator_1_1_0(b, l + 1);
    return true;
  }

  // LEFT ( OUTER )? | INNER | CROSS
  private static boolean join_operator_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_operator_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = join_operator_1_1_0_0(b, l + 1);
    if (!r) r = consumeToken(b, INNER);
    if (!r) r = consumeToken(b, CROSS);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT ( OUTER )?
  private static boolean join_operator_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_operator_1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT);
    r = r && join_operator_1_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( OUTER )?
  private static boolean join_operator_1_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_operator_1_1_0_0_1")) return false;
    consumeToken(b, OUTER);
    return true;
  }

  /* ********************************************************** */
  // NUMERIC_LITERAL
  //   | STRING_LITERAL
  //   | BLOB_LITERAL
  //   | NULL
  //   | CURRENT_TIME
  //   | CURRENT_DATE
  //   | CURRENT_TIMESTAMP
  public static boolean literal_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_VALUE, "<literal value>");
    r = consumeToken(b, NUMERIC_LITERAL);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, BLOB_LITERAL);
    if (!r) r = consumeToken(b, NULL);
    if (!r) r = consumeToken(b, CURRENT_TIME);
    if (!r) r = consumeToken(b, CURRENT_DATE);
    if (!r) r = consumeToken(b, CURRENT_TIMESTAMP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NAME_LITERAL
  public static boolean module_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_argument")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME_LITERAL);
    exit_section_(b, m, MODULE_ARGUMENT, r);
    return r;
  }

  /* ********************************************************** */
  // NAME_LITERAL
  public static boolean module_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_name")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME_LITERAL);
    exit_section_(b, m, MODULE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // expr ( COLLATE collation_name )? ( ASC | DESC )?
  public static boolean ordering_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ordering_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ORDERING_TERM, "<ordering term>");
    r = expr(b, l + 1);
    r = r && ordering_term_1(b, l + 1);
    r = r && ordering_term_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( COLLATE collation_name )?
  private static boolean ordering_term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ordering_term_1")) return false;
    ordering_term_1_0(b, l + 1);
    return true;
  }

  // COLLATE collation_name
  private static boolean ordering_term_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ordering_term_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLLATE);
    r = r && collation_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ASC | DESC )?
  private static boolean ordering_term_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ordering_term_2")) return false;
    ordering_term_2_0(b, l + 1);
    return true;
  }

  // ASC | DESC
  private static boolean ordering_term_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ordering_term_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASC);
    if (!r) r = consumeToken(b, DESC);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NAME_LITERAL
  public static boolean pragma_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_name")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME_LITERAL);
    exit_section_(b, m, PRAGMA_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // PRAGMA ( database_name '.' )? pragma_name ( '=' pragma_value | '(' pragma_value ')' )?
  public static boolean pragma_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_stmt")) return false;
    if (!nextTokenIs(b, PRAGMA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PRAGMA);
    r = r && pragma_stmt_1(b, l + 1);
    r = r && pragma_name(b, l + 1);
    r = r && pragma_stmt_3(b, l + 1);
    exit_section_(b, m, PRAGMA_STMT, r);
    return r;
  }

  // ( database_name '.' )?
  private static boolean pragma_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_stmt_1")) return false;
    pragma_stmt_1_0(b, l + 1);
    return true;
  }

  // database_name '.'
  private static boolean pragma_stmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_stmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( '=' pragma_value | '(' pragma_value ')' )?
  private static boolean pragma_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_stmt_3")) return false;
    pragma_stmt_3_0(b, l + 1);
    return true;
  }

  // '=' pragma_value | '(' pragma_value ')'
  private static boolean pragma_stmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_stmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pragma_stmt_3_0_0(b, l + 1);
    if (!r) r = pragma_stmt_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' pragma_value
  private static boolean pragma_stmt_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_stmt_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && pragma_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' pragma_value ')'
  private static boolean pragma_stmt_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_stmt_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && pragma_value(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // signed_number | NAME_LITERAL | STRING_LITERAL
  public static boolean pragma_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragma_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRAGMA_VALUE, "<pragma value>");
    r = signed_number(b, l + 1);
    if (!r) r = consumeToken(b, NAME_LITERAL);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( database_name '.' )? table_name ( INDEXED BY index_name | NOT INDEXED )?
  public static boolean qualified_table_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_table_name")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualified_table_name_0(b, l + 1);
    r = r && table_name(b, l + 1);
    r = r && qualified_table_name_2(b, l + 1);
    exit_section_(b, m, QUALIFIED_TABLE_NAME, r);
    return r;
  }

  // ( database_name '.' )?
  private static boolean qualified_table_name_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_table_name_0")) return false;
    qualified_table_name_0_0(b, l + 1);
    return true;
  }

  // database_name '.'
  private static boolean qualified_table_name_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_table_name_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( INDEXED BY index_name | NOT INDEXED )?
  private static boolean qualified_table_name_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_table_name_2")) return false;
    qualified_table_name_2_0(b, l + 1);
    return true;
  }

  // INDEXED BY index_name | NOT INDEXED
  private static boolean qualified_table_name_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_table_name_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualified_table_name_2_0_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, NOT, INDEXED);
    exit_section_(b, m, null, r);
    return r;
  }

  // INDEXED BY index_name
  private static boolean qualified_table_name_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_table_name_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INDEXED, BY);
    r = r && index_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RAISE '(' ( IGNORE | ( ROLLBACK | ABORT | FAIL ) ',' error_message ) ')'
  public static boolean raise_function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raise_function")) return false;
    if (!nextTokenIs(b, RAISE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RAISE);
    r = r && consumeToken(b, "(");
    r = r && raise_function_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, RAISE_FUNCTION, r);
    return r;
  }

  // IGNORE | ( ROLLBACK | ABORT | FAIL ) ',' error_message
  private static boolean raise_function_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raise_function_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IGNORE);
    if (!r) r = raise_function_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ROLLBACK | ABORT | FAIL ) ',' error_message
  private static boolean raise_function_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raise_function_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = raise_function_2_1_0(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && error_message(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ROLLBACK | ABORT | FAIL
  private static boolean raise_function_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raise_function_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ROLLBACK);
    if (!r) r = consumeToken(b, ABORT);
    if (!r) r = consumeToken(b, FAIL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // REINDEX ( collation_name | ( database_name '.' )? ( table_name | index_name ) )?
  public static boolean reindex_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "reindex_stmt")) return false;
    if (!nextTokenIs(b, REINDEX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REINDEX);
    r = r && reindex_stmt_1(b, l + 1);
    exit_section_(b, m, REINDEX_STMT, r);
    return r;
  }

  // ( collation_name | ( database_name '.' )? ( table_name | index_name ) )?
  private static boolean reindex_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "reindex_stmt_1")) return false;
    reindex_stmt_1_0(b, l + 1);
    return true;
  }

  // collation_name | ( database_name '.' )? ( table_name | index_name )
  private static boolean reindex_stmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "reindex_stmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = collation_name(b, l + 1);
    if (!r) r = reindex_stmt_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( database_name '.' )? ( table_name | index_name )
  private static boolean reindex_stmt_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "reindex_stmt_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = reindex_stmt_1_0_1_0(b, l + 1);
    r = r && reindex_stmt_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( database_name '.' )?
  private static boolean reindex_stmt_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "reindex_stmt_1_0_1_0")) return false;
    reindex_stmt_1_0_1_0_0(b, l + 1);
    return true;
  }

  // database_name '.'
  private static boolean reindex_stmt_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "reindex_stmt_1_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  // table_name | index_name
  private static boolean reindex_stmt_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "reindex_stmt_1_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_name(b, l + 1);
    if (!r) r = index_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RELEASE ( SAVEPOINT )? savepoint_name
  public static boolean release_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "release_stmt")) return false;
    if (!nextTokenIs(b, RELEASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RELEASE);
    r = r && release_stmt_1(b, l + 1);
    r = r && savepoint_name(b, l + 1);
    exit_section_(b, m, RELEASE_STMT, r);
    return r;
  }

  // ( SAVEPOINT )?
  private static boolean release_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "release_stmt_1")) return false;
    consumeToken(b, SAVEPOINT);
    return true;
  }

  /* ********************************************************** */
  // '*'
  //   | table_name '.*' // TODO: spaces between dot and star?
  //   | expr ( ( AS )? column_alias )?
  public static boolean result_column(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "result_column")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RESULT_COLUMN, "<result column>");
    r = consumeToken(b, "*");
    if (!r) r = result_column_1(b, l + 1);
    if (!r) r = result_column_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // table_name '.*'
  private static boolean result_column_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "result_column_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_name(b, l + 1);
    r = r && consumeToken(b, ".*");
    exit_section_(b, m, null, r);
    return r;
  }

  // expr ( ( AS )? column_alias )?
  private static boolean result_column_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "result_column_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && result_column_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( AS )? column_alias )?
  private static boolean result_column_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "result_column_2_1")) return false;
    result_column_2_1_0(b, l + 1);
    return true;
  }

  // ( AS )? column_alias
  private static boolean result_column_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "result_column_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = result_column_2_1_0_0(b, l + 1);
    r = r && column_alias(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( AS )?
  private static boolean result_column_2_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "result_column_2_1_0_0")) return false;
    consumeToken(b, AS);
    return true;
  }

  /* ********************************************************** */
  // ROLLBACK ( TRANSACTION )? ( TO ( SAVEPOINT )? savepoint_name )?
  public static boolean rollback_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rollback_stmt")) return false;
    if (!nextTokenIs(b, ROLLBACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ROLLBACK);
    r = r && rollback_stmt_1(b, l + 1);
    r = r && rollback_stmt_2(b, l + 1);
    exit_section_(b, m, ROLLBACK_STMT, r);
    return r;
  }

  // ( TRANSACTION )?
  private static boolean rollback_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rollback_stmt_1")) return false;
    consumeToken(b, TRANSACTION);
    return true;
  }

  // ( TO ( SAVEPOINT )? savepoint_name )?
  private static boolean rollback_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rollback_stmt_2")) return false;
    rollback_stmt_2_0(b, l + 1);
    return true;
  }

  // TO ( SAVEPOINT )? savepoint_name
  private static boolean rollback_stmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rollback_stmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TO);
    r = r && rollback_stmt_2_0_1(b, l + 1);
    r = r && savepoint_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( SAVEPOINT )?
  private static boolean rollback_stmt_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rollback_stmt_2_0_1")) return false;
    consumeToken(b, SAVEPOINT);
    return true;
  }

  /* ********************************************************** */
  // NAME_LITERAL
  public static boolean savepoint_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "savepoint_name")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME_LITERAL);
    exit_section_(b, m, SAVEPOINT_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // SAVEPOINT savepoint_name
  public static boolean savepoint_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "savepoint_stmt")) return false;
    if (!nextTokenIs(b, SAVEPOINT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SAVEPOINT);
    r = r && savepoint_name(b, l + 1);
    exit_section_(b, m, SAVEPOINT_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // ( WITH ( RECURSIVE )? common_table_expression ( ',' common_table_expression )* )?
  //   ( SELECT ( DISTINCT | ALL )? result_column ( ',' result_column )*
  //   ( FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
  //   ( WHERE expr )?
  //   ( GROUP BY expr ( ',' expr )* ( HAVING expr )? )? | VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )* ) ( compound_operator ( SELECT ( DISTINCT | ALL )? result_column ( ',' result_column )*
  //   ( FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
  //   ( WHERE expr )?
  //   ( GROUP BY expr ( ',' expr )* ( HAVING expr )? )? | VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )* ) )*
  //   ( ORDER BY ordering_term ( ',' ordering_term )* )?
  //   ( LIMIT expr ( ( OFFSET | ',' ) expr )? )?
  public static boolean select_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECT_STMT, "<select stmt>");
    r = select_stmt_0(b, l + 1);
    r = r && select_stmt_1(b, l + 1);
    r = r && select_stmt_2(b, l + 1);
    r = r && select_stmt_3(b, l + 1);
    r = r && select_stmt_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( WITH ( RECURSIVE )? common_table_expression ( ',' common_table_expression )* )?
  private static boolean select_stmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_0")) return false;
    select_stmt_0_0(b, l + 1);
    return true;
  }

  // WITH ( RECURSIVE )? common_table_expression ( ',' common_table_expression )*
  private static boolean select_stmt_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WITH);
    r = r && select_stmt_0_0_1(b, l + 1);
    r = r && common_table_expression(b, l + 1);
    r = r && select_stmt_0_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( RECURSIVE )?
  private static boolean select_stmt_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_0_0_1")) return false;
    consumeToken(b, RECURSIVE);
    return true;
  }

  // ( ',' common_table_expression )*
  private static boolean select_stmt_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_0_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!select_stmt_0_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "select_stmt_0_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' common_table_expression
  private static boolean select_stmt_0_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_0_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && common_table_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SELECT ( DISTINCT | ALL )? result_column ( ',' result_column )*
  //   ( FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
  //   ( WHERE expr )?
  //   ( GROUP BY expr ( ',' expr )* ( HAVING expr )? )? | VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
  private static boolean select_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = select_stmt_1_0(b, l + 1);
    if (!r) r = select_stmt_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SELECT ( DISTINCT | ALL )? result_column ( ',' result_column )*
  //   ( FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
  //   ( WHERE expr )?
  //   ( GROUP BY expr ( ',' expr )* ( HAVING expr )? )?
  private static boolean select_stmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SELECT);
    r = r && select_stmt_1_0_1(b, l + 1);
    r = r && result_column(b, l + 1);
    r = r && select_stmt_1_0_3(b, l + 1);
    r = r && select_stmt_1_0_4(b, l + 1);
    r = r && select_stmt_1_0_5(b, l + 1);
    r = r && select_stmt_1_0_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DISTINCT | ALL )?
  private static boolean select_stmt_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_0_1")) return false;
    select_stmt_1_0_1_0(b, l + 1);
    return true;
  }

  // DISTINCT | ALL
  private static boolean select_stmt_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DISTINCT);
    if (!r) r = consumeToken(b, ALL);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' result_column )*
  private static boolean select_stmt_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!select_stmt_1_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "select_stmt_1_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' result_column
  private static boolean select_stmt_1_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && result_column(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
  private static boolean select_stmt_1_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_0_4")) return false;
    select_stmt_1_0_4_0(b, l + 1);
    return true;
  }

  // FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause )
  private static boolean select_stmt_1_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FROM);
    r = r && select_stmt_1_0_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // table_or_subquery ( ',' table_or_subquery )* | join_clause
  private static boolean select_stmt_1_0_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_0_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = select_stmt_1_0_4_0_1_0(b, l + 1);
    if (!r) r = join_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // table_or_subquery ( ',' table_or_subquery )*
  private static boolean select_stmt_1_0_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_0_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_or_subquery(b, l + 1);
    r = r && select_stmt_1_0_4_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' table_or_subquery )*
  private static boolean select_stmt_1_0_4_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_0_4_0_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!select_stmt_1_0_4_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "select_stmt_1_0_4_0_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' table_or_subquery
  private static boolean select_stmt_1_0_4_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_0_4_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && table_or_subquery(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WHERE expr )?
  private static boolean select_stmt_1_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_0_5")) return false;
    select_stmt_1_0_5_0(b, l + 1);
    return true;
  }

  // WHERE expr
  private static boolean select_stmt_1_0_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_0_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( GROUP BY expr ( ',' expr )* ( HAVING expr )? )?
  private static boolean select_stmt_1_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_0_6")) return false;
    select_stmt_1_0_6_0(b, l + 1);
    return true;
  }

  // GROUP BY expr ( ',' expr )* ( HAVING expr )?
  private static boolean select_stmt_1_0_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_0_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GROUP, BY);
    r = r && expr(b, l + 1);
    r = r && select_stmt_1_0_6_0_3(b, l + 1);
    r = r && select_stmt_1_0_6_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' expr )*
  private static boolean select_stmt_1_0_6_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_0_6_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!select_stmt_1_0_6_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "select_stmt_1_0_6_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' expr
  private static boolean select_stmt_1_0_6_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_0_6_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( HAVING expr )?
  private static boolean select_stmt_1_0_6_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_0_6_0_4")) return false;
    select_stmt_1_0_6_0_4_0(b, l + 1);
    return true;
  }

  // HAVING expr
  private static boolean select_stmt_1_0_6_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_0_6_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HAVING);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
  private static boolean select_stmt_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALUES);
    r = r && consumeToken(b, "(");
    r = r && expr(b, l + 1);
    r = r && select_stmt_1_1_3(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && select_stmt_1_1_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' expr )*
  private static boolean select_stmt_1_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!select_stmt_1_1_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "select_stmt_1_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' expr
  private static boolean select_stmt_1_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' '(' expr ( ',' expr )* ')' )*
  private static boolean select_stmt_1_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_1_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!select_stmt_1_1_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "select_stmt_1_1_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' '(' expr ( ',' expr )* ')'
  private static boolean select_stmt_1_1_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_1_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, "(");
    r = r && expr(b, l + 1);
    r = r && select_stmt_1_1_5_0_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' expr )*
  private static boolean select_stmt_1_1_5_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_1_5_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!select_stmt_1_1_5_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "select_stmt_1_1_5_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' expr
  private static boolean select_stmt_1_1_5_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_1_1_5_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( compound_operator ( SELECT ( DISTINCT | ALL )? result_column ( ',' result_column )*
  //   ( FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
  //   ( WHERE expr )?
  //   ( GROUP BY expr ( ',' expr )* ( HAVING expr )? )? | VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )* ) )*
  private static boolean select_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!select_stmt_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "select_stmt_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // compound_operator ( SELECT ( DISTINCT | ALL )? result_column ( ',' result_column )*
  //   ( FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
  //   ( WHERE expr )?
  //   ( GROUP BY expr ( ',' expr )* ( HAVING expr )? )? | VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )* )
  private static boolean select_stmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = compound_operator(b, l + 1);
    r = r && select_stmt_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SELECT ( DISTINCT | ALL )? result_column ( ',' result_column )*
  //   ( FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
  //   ( WHERE expr )?
  //   ( GROUP BY expr ( ',' expr )* ( HAVING expr )? )? | VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
  private static boolean select_stmt_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = select_stmt_2_0_1_0(b, l + 1);
    if (!r) r = select_stmt_2_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SELECT ( DISTINCT | ALL )? result_column ( ',' result_column )*
  //   ( FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
  //   ( WHERE expr )?
  //   ( GROUP BY expr ( ',' expr )* ( HAVING expr )? )?
  private static boolean select_stmt_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SELECT);
    r = r && select_stmt_2_0_1_0_1(b, l + 1);
    r = r && result_column(b, l + 1);
    r = r && select_stmt_2_0_1_0_3(b, l + 1);
    r = r && select_stmt_2_0_1_0_4(b, l + 1);
    r = r && select_stmt_2_0_1_0_5(b, l + 1);
    r = r && select_stmt_2_0_1_0_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( DISTINCT | ALL )?
  private static boolean select_stmt_2_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_0_1")) return false;
    select_stmt_2_0_1_0_1_0(b, l + 1);
    return true;
  }

  // DISTINCT | ALL
  private static boolean select_stmt_2_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DISTINCT);
    if (!r) r = consumeToken(b, ALL);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' result_column )*
  private static boolean select_stmt_2_0_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!select_stmt_2_0_1_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "select_stmt_2_0_1_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' result_column
  private static boolean select_stmt_2_0_1_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && result_column(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
  private static boolean select_stmt_2_0_1_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_0_4")) return false;
    select_stmt_2_0_1_0_4_0(b, l + 1);
    return true;
  }

  // FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause )
  private static boolean select_stmt_2_0_1_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FROM);
    r = r && select_stmt_2_0_1_0_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // table_or_subquery ( ',' table_or_subquery )* | join_clause
  private static boolean select_stmt_2_0_1_0_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_0_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = select_stmt_2_0_1_0_4_0_1_0(b, l + 1);
    if (!r) r = join_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // table_or_subquery ( ',' table_or_subquery )*
  private static boolean select_stmt_2_0_1_0_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_0_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_or_subquery(b, l + 1);
    r = r && select_stmt_2_0_1_0_4_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' table_or_subquery )*
  private static boolean select_stmt_2_0_1_0_4_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_0_4_0_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!select_stmt_2_0_1_0_4_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "select_stmt_2_0_1_0_4_0_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' table_or_subquery
  private static boolean select_stmt_2_0_1_0_4_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_0_4_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && table_or_subquery(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WHERE expr )?
  private static boolean select_stmt_2_0_1_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_0_5")) return false;
    select_stmt_2_0_1_0_5_0(b, l + 1);
    return true;
  }

  // WHERE expr
  private static boolean select_stmt_2_0_1_0_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_0_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( GROUP BY expr ( ',' expr )* ( HAVING expr )? )?
  private static boolean select_stmt_2_0_1_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_0_6")) return false;
    select_stmt_2_0_1_0_6_0(b, l + 1);
    return true;
  }

  // GROUP BY expr ( ',' expr )* ( HAVING expr )?
  private static boolean select_stmt_2_0_1_0_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_0_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GROUP, BY);
    r = r && expr(b, l + 1);
    r = r && select_stmt_2_0_1_0_6_0_3(b, l + 1);
    r = r && select_stmt_2_0_1_0_6_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' expr )*
  private static boolean select_stmt_2_0_1_0_6_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_0_6_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!select_stmt_2_0_1_0_6_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "select_stmt_2_0_1_0_6_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' expr
  private static boolean select_stmt_2_0_1_0_6_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_0_6_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( HAVING expr )?
  private static boolean select_stmt_2_0_1_0_6_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_0_6_0_4")) return false;
    select_stmt_2_0_1_0_6_0_4_0(b, l + 1);
    return true;
  }

  // HAVING expr
  private static boolean select_stmt_2_0_1_0_6_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_0_6_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HAVING);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
  private static boolean select_stmt_2_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALUES);
    r = r && consumeToken(b, "(");
    r = r && expr(b, l + 1);
    r = r && select_stmt_2_0_1_1_3(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && select_stmt_2_0_1_1_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' expr )*
  private static boolean select_stmt_2_0_1_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!select_stmt_2_0_1_1_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "select_stmt_2_0_1_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' expr
  private static boolean select_stmt_2_0_1_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' '(' expr ( ',' expr )* ')' )*
  private static boolean select_stmt_2_0_1_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_1_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!select_stmt_2_0_1_1_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "select_stmt_2_0_1_1_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' '(' expr ( ',' expr )* ')'
  private static boolean select_stmt_2_0_1_1_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_1_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && consumeToken(b, "(");
    r = r && expr(b, l + 1);
    r = r && select_stmt_2_0_1_1_5_0_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' expr )*
  private static boolean select_stmt_2_0_1_1_5_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_1_5_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!select_stmt_2_0_1_1_5_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "select_stmt_2_0_1_1_5_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' expr
  private static boolean select_stmt_2_0_1_1_5_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_2_0_1_1_5_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ORDER BY ordering_term ( ',' ordering_term )* )?
  private static boolean select_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_3")) return false;
    select_stmt_3_0(b, l + 1);
    return true;
  }

  // ORDER BY ordering_term ( ',' ordering_term )*
  private static boolean select_stmt_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ORDER, BY);
    r = r && ordering_term(b, l + 1);
    r = r && select_stmt_3_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' ordering_term )*
  private static boolean select_stmt_3_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_3_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!select_stmt_3_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "select_stmt_3_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' ordering_term
  private static boolean select_stmt_3_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_3_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && ordering_term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( LIMIT expr ( ( OFFSET | ',' ) expr )? )?
  private static boolean select_stmt_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_4")) return false;
    select_stmt_4_0(b, l + 1);
    return true;
  }

  // LIMIT expr ( ( OFFSET | ',' ) expr )?
  private static boolean select_stmt_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LIMIT);
    r = r && expr(b, l + 1);
    r = r && select_stmt_4_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( OFFSET | ',' ) expr )?
  private static boolean select_stmt_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_4_0_2")) return false;
    select_stmt_4_0_2_0(b, l + 1);
    return true;
  }

  // ( OFFSET | ',' ) expr
  private static boolean select_stmt_4_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_4_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = select_stmt_4_0_2_0_0(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OFFSET | ','
  private static boolean select_stmt_4_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_stmt_4_0_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OFFSET);
    if (!r) r = consumeToken(b, ",");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( '+' | '-' )? NUMERIC_LITERAL
  public static boolean signed_number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signed_number")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNED_NUMBER, "<signed number>");
    r = signed_number_0(b, l + 1);
    r = r && consumeToken(b, NUMERIC_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( '+' | '-' )?
  private static boolean signed_number_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signed_number_0")) return false;
    signed_number_0_0(b, l + 1);
    return true;
  }

  // '+' | '-'
  private static boolean signed_number_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signed_number_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( EXPLAIN ( QUERY PLAN )? )?
  //   ( alter_table_stmt
  //   | analyze_stmt
  //   | attach_stmt
  //   | begin_stmt
  //   | commit_stmt
  //   | create_index_stmt
  //   | create_table_stmt
  //   | create_trigger_stmt
  //   | create_view_stmt
  //   | create_virtual_table_stmt
  //   | delete_stmt
  //   | delete_stmt_limited
  //   | detach_stmt
  //   | drop_index_stmt
  //   | drop_table_stmt
  //   | drop_trigger_stmt
  //   | drop_view_stmt
  //   | insert_stmt
  //   | pragma_stmt
  //   | reindex_stmt
  //   | release_stmt
  //   | rollback_stmt
  //   | savepoint_stmt
  //   | select_stmt
  //   | update_stmt
  //   | update_stmt_limited
  //   | vacuum_stmt
  //   )
  public static boolean sql_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SQL_STMT, "<sql stmt>");
    r = sql_stmt_0(b, l + 1);
    r = r && sql_stmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( EXPLAIN ( QUERY PLAN )? )?
  private static boolean sql_stmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_stmt_0")) return false;
    sql_stmt_0_0(b, l + 1);
    return true;
  }

  // EXPLAIN ( QUERY PLAN )?
  private static boolean sql_stmt_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_stmt_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXPLAIN);
    r = r && sql_stmt_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( QUERY PLAN )?
  private static boolean sql_stmt_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_stmt_0_0_1")) return false;
    sql_stmt_0_0_1_0(b, l + 1);
    return true;
  }

  // QUERY PLAN
  private static boolean sql_stmt_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_stmt_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, QUERY, PLAN);
    exit_section_(b, m, null, r);
    return r;
  }

  // alter_table_stmt
  //   | analyze_stmt
  //   | attach_stmt
  //   | begin_stmt
  //   | commit_stmt
  //   | create_index_stmt
  //   | create_table_stmt
  //   | create_trigger_stmt
  //   | create_view_stmt
  //   | create_virtual_table_stmt
  //   | delete_stmt
  //   | delete_stmt_limited
  //   | detach_stmt
  //   | drop_index_stmt
  //   | drop_table_stmt
  //   | drop_trigger_stmt
  //   | drop_view_stmt
  //   | insert_stmt
  //   | pragma_stmt
  //   | reindex_stmt
  //   | release_stmt
  //   | rollback_stmt
  //   | savepoint_stmt
  //   | select_stmt
  //   | update_stmt
  //   | update_stmt_limited
  //   | vacuum_stmt
  private static boolean sql_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_stmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = alter_table_stmt(b, l + 1);
    if (!r) r = analyze_stmt(b, l + 1);
    if (!r) r = attach_stmt(b, l + 1);
    if (!r) r = begin_stmt(b, l + 1);
    if (!r) r = commit_stmt(b, l + 1);
    if (!r) r = create_index_stmt(b, l + 1);
    if (!r) r = create_table_stmt(b, l + 1);
    if (!r) r = create_trigger_stmt(b, l + 1);
    if (!r) r = create_view_stmt(b, l + 1);
    if (!r) r = create_virtual_table_stmt(b, l + 1);
    if (!r) r = delete_stmt(b, l + 1);
    if (!r) r = delete_stmt_limited(b, l + 1);
    if (!r) r = detach_stmt(b, l + 1);
    if (!r) r = drop_index_stmt(b, l + 1);
    if (!r) r = drop_table_stmt(b, l + 1);
    if (!r) r = drop_trigger_stmt(b, l + 1);
    if (!r) r = drop_view_stmt(b, l + 1);
    if (!r) r = insert_stmt(b, l + 1);
    if (!r) r = pragma_stmt(b, l + 1);
    if (!r) r = reindex_stmt(b, l + 1);
    if (!r) r = release_stmt(b, l + 1);
    if (!r) r = rollback_stmt(b, l + 1);
    if (!r) r = savepoint_stmt(b, l + 1);
    if (!r) r = select_stmt(b, l + 1);
    if (!r) r = update_stmt(b, l + 1);
    if (!r) r = update_stmt_limited(b, l + 1);
    if (!r) r = vacuum_stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( sql_stmt )? ( ';' ( sql_stmt )? )*
  static boolean sql_stmt_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_stmt_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sql_stmt_list_0(b, l + 1);
    r = r && sql_stmt_list_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( sql_stmt )?
  private static boolean sql_stmt_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_stmt_list_0")) return false;
    sql_stmt_list_0_0(b, l + 1);
    return true;
  }

  // ( sql_stmt )
  private static boolean sql_stmt_list_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_stmt_list_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sql_stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ';' ( sql_stmt )? )*
  private static boolean sql_stmt_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_stmt_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!sql_stmt_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sql_stmt_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ';' ( sql_stmt )?
  private static boolean sql_stmt_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_stmt_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && sql_stmt_list_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( sql_stmt )?
  private static boolean sql_stmt_list_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_stmt_list_1_0_1")) return false;
    sql_stmt_list_1_0_1_0(b, l + 1);
    return true;
  }

  // ( sql_stmt )
  private static boolean sql_stmt_list_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sql_stmt_list_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sql_stmt(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NAME_LITERAL
  public static boolean table_alias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_alias")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME_LITERAL);
    exit_section_(b, m, TABLE_ALIAS, r);
    return r;
  }

  /* ********************************************************** */
  // ( CONSTRAINT  NAME_LITERAL )?
  //   ( ( PRIMARY KEY | UNIQUE ) '(' indexed_column ( ',' indexed_column )* ')' conflict_clause
  //   | CHECK '(' expr ')'
  //   | FOREIGN KEY '(' column_name ( ',' column_name )* ')' foreign_key_clause )
  public static boolean table_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE_CONSTRAINT, "<table constraint>");
    r = table_constraint_0(b, l + 1);
    r = r && table_constraint_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( CONSTRAINT  NAME_LITERAL )?
  private static boolean table_constraint_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_constraint_0")) return false;
    table_constraint_0_0(b, l + 1);
    return true;
  }

  // CONSTRAINT  NAME_LITERAL
  private static boolean table_constraint_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_constraint_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CONSTRAINT, NAME_LITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( PRIMARY KEY | UNIQUE ) '(' indexed_column ( ',' indexed_column )* ')' conflict_clause
  //   | CHECK '(' expr ')'
  //   | FOREIGN KEY '(' column_name ( ',' column_name )* ')' foreign_key_clause
  private static boolean table_constraint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_constraint_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_constraint_1_0(b, l + 1);
    if (!r) r = table_constraint_1_1(b, l + 1);
    if (!r) r = table_constraint_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( PRIMARY KEY | UNIQUE ) '(' indexed_column ( ',' indexed_column )* ')' conflict_clause
  private static boolean table_constraint_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_constraint_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_constraint_1_0_0(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && indexed_column(b, l + 1);
    r = r && table_constraint_1_0_3(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && conflict_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PRIMARY KEY | UNIQUE
  private static boolean table_constraint_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_constraint_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, PRIMARY, KEY);
    if (!r) r = consumeToken(b, UNIQUE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' indexed_column )*
  private static boolean table_constraint_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_constraint_1_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!table_constraint_1_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "table_constraint_1_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' indexed_column
  private static boolean table_constraint_1_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_constraint_1_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && indexed_column(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CHECK '(' expr ')'
  private static boolean table_constraint_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_constraint_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CHECK);
    r = r && consumeToken(b, "(");
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // FOREIGN KEY '(' column_name ( ',' column_name )* ')' foreign_key_clause
  private static boolean table_constraint_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_constraint_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOREIGN, KEY);
    r = r && consumeToken(b, "(");
    r = r && column_name(b, l + 1);
    r = r && table_constraint_1_2_4(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && foreign_key_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' column_name )*
  private static boolean table_constraint_1_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_constraint_1_2_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!table_constraint_1_2_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "table_constraint_1_2_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' column_name
  private static boolean table_constraint_1_2_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_constraint_1_2_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && column_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NAME_LITERAL
  public static boolean table_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_name")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME_LITERAL);
    exit_section_(b, m, TABLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // NAME_LITERAL
  public static boolean table_or_index_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_or_index_name")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME_LITERAL);
    exit_section_(b, m, TABLE_OR_INDEX_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // ( database_name '.' )? table_name ( ( AS )? table_alias )? ( INDEXED BY index_name | NOT INDEXED )?
  //   | '(' ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) ')'
  //   | '(' select_stmt ')' ( ( AS )? table_alias )?
  public static boolean table_or_subquery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_or_subquery")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE_OR_SUBQUERY, "<table or subquery>");
    r = table_or_subquery_0(b, l + 1);
    if (!r) r = table_or_subquery_1(b, l + 1);
    if (!r) r = table_or_subquery_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( database_name '.' )? table_name ( ( AS )? table_alias )? ( INDEXED BY index_name | NOT INDEXED )?
  private static boolean table_or_subquery_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_or_subquery_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_or_subquery_0_0(b, l + 1);
    r = r && table_name(b, l + 1);
    r = r && table_or_subquery_0_2(b, l + 1);
    r = r && table_or_subquery_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( database_name '.' )?
  private static boolean table_or_subquery_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_or_subquery_0_0")) return false;
    table_or_subquery_0_0_0(b, l + 1);
    return true;
  }

  // database_name '.'
  private static boolean table_or_subquery_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_or_subquery_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = database_name(b, l + 1);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( AS )? table_alias )?
  private static boolean table_or_subquery_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_or_subquery_0_2")) return false;
    table_or_subquery_0_2_0(b, l + 1);
    return true;
  }

  // ( AS )? table_alias
  private static boolean table_or_subquery_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_or_subquery_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_or_subquery_0_2_0_0(b, l + 1);
    r = r && table_alias(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( AS )?
  private static boolean table_or_subquery_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_or_subquery_0_2_0_0")) return false;
    consumeToken(b, AS);
    return true;
  }

  // ( INDEXED BY index_name | NOT INDEXED )?
  private static boolean table_or_subquery_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_or_subquery_0_3")) return false;
    table_or_subquery_0_3_0(b, l + 1);
    return true;
  }

  // INDEXED BY index_name | NOT INDEXED
  private static boolean table_or_subquery_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_or_subquery_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_or_subquery_0_3_0_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, NOT, INDEXED);
    exit_section_(b, m, null, r);
    return r;
  }

  // INDEXED BY index_name
  private static boolean table_or_subquery_0_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_or_subquery_0_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INDEXED, BY);
    r = r && index_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) ')'
  private static boolean table_or_subquery_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_or_subquery_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && table_or_subquery_1_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // table_or_subquery ( ',' table_or_subquery )* | join_clause
  private static boolean table_or_subquery_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_or_subquery_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_or_subquery_1_1_0(b, l + 1);
    if (!r) r = join_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // table_or_subquery ( ',' table_or_subquery )*
  private static boolean table_or_subquery_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_or_subquery_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_or_subquery(b, l + 1);
    r = r && table_or_subquery_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' table_or_subquery )*
  private static boolean table_or_subquery_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_or_subquery_1_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!table_or_subquery_1_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "table_or_subquery_1_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' table_or_subquery
  private static boolean table_or_subquery_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_or_subquery_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && table_or_subquery(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' select_stmt ')' ( ( AS )? table_alias )?
  private static boolean table_or_subquery_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_or_subquery_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && select_stmt(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && table_or_subquery_2_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( AS )? table_alias )?
  private static boolean table_or_subquery_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_or_subquery_2_3")) return false;
    table_or_subquery_2_3_0(b, l + 1);
    return true;
  }

  // ( AS )? table_alias
  private static boolean table_or_subquery_2_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_or_subquery_2_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_or_subquery_2_3_0_0(b, l + 1);
    r = r && table_alias(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( AS )?
  private static boolean table_or_subquery_2_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_or_subquery_2_3_0_0")) return false;
    consumeToken(b, AS);
    return true;
  }

  /* ********************************************************** */
  // NAME_LITERAL
  public static boolean trigger_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "trigger_name")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME_LITERAL);
    exit_section_(b, m, TRIGGER_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // NAME_LITERAL ( '(' signed_number ')' | '(' signed_number ',' signed_number ')' )?
  public static boolean type_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_name")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME_LITERAL);
    r = r && type_name_1(b, l + 1);
    exit_section_(b, m, TYPE_NAME, r);
    return r;
  }

  // ( '(' signed_number ')' | '(' signed_number ',' signed_number ')' )?
  private static boolean type_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_name_1")) return false;
    type_name_1_0(b, l + 1);
    return true;
  }

  // '(' signed_number ')' | '(' signed_number ',' signed_number ')'
  private static boolean type_name_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_name_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_name_1_0_0(b, l + 1);
    if (!r) r = type_name_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' signed_number ')'
  private static boolean type_name_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_name_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && signed_number(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' signed_number ',' signed_number ')'
  private static boolean type_name_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_name_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && signed_number(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && signed_number(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '+' | '-' | '!'
  public static boolean unary_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_OPERATOR, "<unary operator>");
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    if (!r) r = consumeToken(b, "!");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( with_clause )? UPDATE ( OR ROLLBACK | OR ABORT | OR REPLACE | OR FAIL | OR IGNORE )? qualified_table_name
  // SET column_name '=' expr ( ',' column_name '=' expr )* ( WHERE expr )?
  public static boolean update_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt")) return false;
    if (!nextTokenIs(b, "<update stmt>", UPDATE, WITH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UPDATE_STMT, "<update stmt>");
    r = update_stmt_0(b, l + 1);
    r = r && consumeToken(b, UPDATE);
    r = r && update_stmt_2(b, l + 1);
    r = r && qualified_table_name(b, l + 1);
    r = r && consumeToken(b, SET);
    r = r && column_name(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && expr(b, l + 1);
    r = r && update_stmt_8(b, l + 1);
    r = r && update_stmt_9(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( with_clause )?
  private static boolean update_stmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_0")) return false;
    update_stmt_0_0(b, l + 1);
    return true;
  }

  // ( with_clause )
  private static boolean update_stmt_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = with_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( OR ROLLBACK | OR ABORT | OR REPLACE | OR FAIL | OR IGNORE )?
  private static boolean update_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_2")) return false;
    update_stmt_2_0(b, l + 1);
    return true;
  }

  // OR ROLLBACK | OR ABORT | OR REPLACE | OR FAIL | OR IGNORE
  private static boolean update_stmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, OR, ROLLBACK);
    if (!r) r = parseTokens(b, 0, OR, ABORT);
    if (!r) r = parseTokens(b, 0, OR, REPLACE);
    if (!r) r = parseTokens(b, 0, OR, FAIL);
    if (!r) r = parseTokens(b, 0, OR, IGNORE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' column_name '=' expr )*
  private static boolean update_stmt_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!update_stmt_8_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "update_stmt_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' column_name '=' expr
  private static boolean update_stmt_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && column_name(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WHERE expr )?
  private static boolean update_stmt_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_9")) return false;
    update_stmt_9_0(b, l + 1);
    return true;
  }

  // WHERE expr
  private static boolean update_stmt_9_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_9_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( with_clause )? UPDATE ( OR ROLLBACK | OR ABORT | OR REPLACE | OR FAIL | OR IGNORE )? qualified_table_name
  // SET column_name '=' expr ( ',' column_name '=' expr )* ( WHERE expr )?
  // ( ( ORDER BY ordering_term ( ',' ordering_term )* )?
  // LIMIT expr ( ( OFFSET | ',' ) expr )? )?
  public static boolean update_stmt_limited(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_limited")) return false;
    if (!nextTokenIs(b, "<update stmt limited>", UPDATE, WITH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UPDATE_STMT_LIMITED, "<update stmt limited>");
    r = update_stmt_limited_0(b, l + 1);
    r = r && consumeToken(b, UPDATE);
    r = r && update_stmt_limited_2(b, l + 1);
    r = r && qualified_table_name(b, l + 1);
    r = r && consumeToken(b, SET);
    r = r && column_name(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && expr(b, l + 1);
    r = r && update_stmt_limited_8(b, l + 1);
    r = r && update_stmt_limited_9(b, l + 1);
    r = r && update_stmt_limited_10(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( with_clause )?
  private static boolean update_stmt_limited_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_limited_0")) return false;
    update_stmt_limited_0_0(b, l + 1);
    return true;
  }

  // ( with_clause )
  private static boolean update_stmt_limited_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_limited_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = with_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( OR ROLLBACK | OR ABORT | OR REPLACE | OR FAIL | OR IGNORE )?
  private static boolean update_stmt_limited_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_limited_2")) return false;
    update_stmt_limited_2_0(b, l + 1);
    return true;
  }

  // OR ROLLBACK | OR ABORT | OR REPLACE | OR FAIL | OR IGNORE
  private static boolean update_stmt_limited_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_limited_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, OR, ROLLBACK);
    if (!r) r = parseTokens(b, 0, OR, ABORT);
    if (!r) r = parseTokens(b, 0, OR, REPLACE);
    if (!r) r = parseTokens(b, 0, OR, FAIL);
    if (!r) r = parseTokens(b, 0, OR, IGNORE);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' column_name '=' expr )*
  private static boolean update_stmt_limited_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_limited_8")) return false;
    int c = current_position_(b);
    while (true) {
      if (!update_stmt_limited_8_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "update_stmt_limited_8", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' column_name '=' expr
  private static boolean update_stmt_limited_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_limited_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && column_name(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( WHERE expr )?
  private static boolean update_stmt_limited_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_limited_9")) return false;
    update_stmt_limited_9_0(b, l + 1);
    return true;
  }

  // WHERE expr
  private static boolean update_stmt_limited_9_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_limited_9_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( ORDER BY ordering_term ( ',' ordering_term )* )?
  // LIMIT expr ( ( OFFSET | ',' ) expr )? )?
  private static boolean update_stmt_limited_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_limited_10")) return false;
    update_stmt_limited_10_0(b, l + 1);
    return true;
  }

  // ( ORDER BY ordering_term ( ',' ordering_term )* )?
  // LIMIT expr ( ( OFFSET | ',' ) expr )?
  private static boolean update_stmt_limited_10_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_limited_10_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = update_stmt_limited_10_0_0(b, l + 1);
    r = r && consumeToken(b, LIMIT);
    r = r && expr(b, l + 1);
    r = r && update_stmt_limited_10_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ORDER BY ordering_term ( ',' ordering_term )* )?
  private static boolean update_stmt_limited_10_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_limited_10_0_0")) return false;
    update_stmt_limited_10_0_0_0(b, l + 1);
    return true;
  }

  // ORDER BY ordering_term ( ',' ordering_term )*
  private static boolean update_stmt_limited_10_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_limited_10_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ORDER, BY);
    r = r && ordering_term(b, l + 1);
    r = r && update_stmt_limited_10_0_0_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' ordering_term )*
  private static boolean update_stmt_limited_10_0_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_limited_10_0_0_0_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!update_stmt_limited_10_0_0_0_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "update_stmt_limited_10_0_0_0_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' ordering_term
  private static boolean update_stmt_limited_10_0_0_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_limited_10_0_0_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && ordering_term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ( OFFSET | ',' ) expr )?
  private static boolean update_stmt_limited_10_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_limited_10_0_3")) return false;
    update_stmt_limited_10_0_3_0(b, l + 1);
    return true;
  }

  // ( OFFSET | ',' ) expr
  private static boolean update_stmt_limited_10_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_limited_10_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = update_stmt_limited_10_0_3_0_0(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OFFSET | ','
  private static boolean update_stmt_limited_10_0_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_stmt_limited_10_0_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OFFSET);
    if (!r) r = consumeToken(b, ",");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VACUUM
  public static boolean vacuum_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vacuum_stmt")) return false;
    if (!nextTokenIs(b, VACUUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VACUUM);
    exit_section_(b, m, VACUUM_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // NAME_LITERAL
  public static boolean view_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "view_name")) return false;
    if (!nextTokenIs(b, NAME_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME_LITERAL);
    exit_section_(b, m, VIEW_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // WITH ( RECURSIVE )? cte_table_name AS '(' select_stmt ')' ( ',' cte_table_name AS '(' select_stmt ')' )*
  public static boolean with_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "with_clause")) return false;
    if (!nextTokenIs(b, WITH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WITH);
    r = r && with_clause_1(b, l + 1);
    r = r && cte_table_name(b, l + 1);
    r = r && consumeToken(b, AS);
    r = r && consumeToken(b, "(");
    r = r && select_stmt(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && with_clause_7(b, l + 1);
    exit_section_(b, m, WITH_CLAUSE, r);
    return r;
  }

  // ( RECURSIVE )?
  private static boolean with_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "with_clause_1")) return false;
    consumeToken(b, RECURSIVE);
    return true;
  }

  // ( ',' cte_table_name AS '(' select_stmt ')' )*
  private static boolean with_clause_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "with_clause_7")) return false;
    int c = current_position_(b);
    while (true) {
      if (!with_clause_7_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "with_clause_7", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' cte_table_name AS '(' select_stmt ')'
  private static boolean with_clause_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "with_clause_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && cte_table_name(b, l + 1);
    r = r && consumeToken(b, AS);
    r = r && consumeToken(b, "(");
    r = r && select_stmt(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

}
