// $codepro.audit.disable
/**
 * Aptana Studio
 * Copyright (c) 2005-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.editor.css.parsing;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import beaver.Scanner;
import beaver.Symbol;

import com.aptana.editor.css.parsing.lexer.CSSTokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 4/27/12 9:53 AM from the specification file
 * <tt>CSS.flex</tt>
 */
@SuppressWarnings("nls")
class CSSFlexScanner extends Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
	private static final String ZZ_CMAP_PACKED =
    "\11\0\1\23\1\25\1\0\1\3\1\24\22\0\1\23\1\46\1\5"+
    "\1\42\1\53\1\41\1\0\1\6\1\57\1\60\1\10\1\22\1\63"+
    "\1\11\1\21\1\7\12\1\1\20\1\54\1\0\1\50\1\64\1\0"+
    "\1\43\1\34\1\4\1\31\1\17\1\26\1\44\1\15\1\36\1\16"+
    "\1\4\1\40\1\65\1\27\1\32\1\14\1\12\1\4\1\13\1\35"+
    "\1\33\1\45\2\4\1\30\1\4\1\37\1\61\1\2\1\62\1\52"+
    "\1\4\1\0\1\34\1\4\1\31\1\17\1\26\1\44\1\15\1\36"+
    "\1\16\1\4\1\40\1\65\1\27\1\32\1\14\1\12\1\4\1\13"+
    "\1\35\1\33\1\45\2\4\1\30\1\4\1\37\1\55\1\51\1\56"+
    "\1\47\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\4\1\12\1\1\1\13\1\14"+
    "\2\1\1\4\2\1\1\15\3\1\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\0\5\4"+
    "\1\0\3\4\1\27\2\4\2\5\2\6\1\0\1\4"+
    "\1\2\1\0\1\30\1\2\1\31\1\0\1\32\1\0"+
    "\7\32\1\4\3\0\1\33\1\34\1\35\1\36\1\37"+
    "\2\4\1\2\1\40\1\41\1\42\1\5\1\6\1\0"+
    "\1\4\10\30\1\27\2\30\10\0\1\27\2\0\7\32"+
    "\1\4\2\0\1\43\1\44\1\4\1\37\2\30\1\40"+
    "\1\41\1\42\1\37\2\0\1\40\1\41\1\42\7\32"+
    "\3\0\1\4\2\43\1\32\1\45\5\32\1\46\1\0"+
    "\1\4\2\32\1\47\3\32\2\0\1\32\1\50\3\32"+
    "\1\0\1\4\1\0\1\32\1\51\2\32\1\0\3\32"+
    "\1\0\1\32\1\52\1\53\1\54\3\32\1\55";

  private static int [] zzUnpackAction() {
    int [] result = new int[190];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\66\0\154\0\242\0\330\0\u010e\0\u0144\0\u017a"+
    "\0\u01b0\0\66\0\u01e6\0\u021c\0\66\0\u0252\0\u0288\0\66"+
    "\0\u02be\0\u02f4\0\u032a\0\u0360\0\u0396\0\66\0\u03cc\0\u0402"+
    "\0\u0438\0\66\0\66\0\66\0\66\0\66\0\66\0\66"+
    "\0\66\0\66\0\242\0\u046e\0\u04a4\0\u04da\0\u0510\0\u0546"+
    "\0\u057c\0\u05b2\0\u05e8\0\u061e\0\u010e\0\u0654\0\u068a\0\u06c0"+
    "\0\66\0\u06f6\0\66\0\u072c\0\u0762\0\u0798\0\u07ce\0\u0804"+
    "\0\u083a\0\u02be\0\u0870\0\u08a6\0\u08dc\0\u0912\0\u0948\0\u097e"+
    "\0\u09b4\0\u09ea\0\u0a20\0\u0a56\0\u0a8c\0\u0360\0\u0ac2\0\u0af8"+
    "\0\66\0\66\0\66\0\66\0\u010e\0\u0b2e\0\u0b64\0\u0b9a"+
    "\0\u010e\0\u010e\0\u010e\0\u0bd0\0\u0c06\0\u0c3c\0\u0c72\0\u0ca8"+
    "\0\u0cde\0\u0d14\0\u0d4a\0\u0d80\0\u0db6\0\u0dec\0\u0e22\0\u0804"+
    "\0\u0e58\0\u0e8e\0\u0ec4\0\u0efa\0\u0f30\0\u0f66\0\u0f9c\0\u0fd2"+
    "\0\u1008\0\u103e\0\66\0\u1074\0\u10aa\0\u10e0\0\u1116\0\u114c"+
    "\0\u1182\0\u11b8\0\u11ee\0\u1224\0\u125a\0\u1290\0\u12c6\0\u010e"+
    "\0\66\0\u12fc\0\u0804\0\u1332\0\u1368\0\u0804\0\u0804\0\u0804"+
    "\0\66\0\u139e\0\u13d4\0\66\0\66\0\66\0\u140a\0\u1440"+
    "\0\u1476\0\u14ac\0\u14e2\0\u1518\0\u154e\0\u1584\0\u15ba\0\u15f0"+
    "\0\u1626\0\u0804\0\66\0\u165c\0\u08a6\0\u1692\0\u16c8\0\u16fe"+
    "\0\u1734\0\u176a\0\66\0\u17a0\0\u17d6\0\u180c\0\u1842\0\u08a6"+
    "\0\u1878\0\u18ae\0\u18e4\0\u191a\0\u1950\0\u1986\0\u08a6\0\u19bc"+
    "\0\u19f2\0\u1a28\0\u1a5e\0\u1a94\0\u1aca\0\u1b00\0\u08a6\0\u1b36"+
    "\0\u1b6c\0\u1ba2\0\u1bd8\0\u1c0e\0\u1c44\0\u1c7a\0\u1cb0\0\u08a6"+
    "\0\u08a6\0\66\0\u1ce6\0\u1d1c\0\u1d52\0\u08a6";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[190];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\5\6\1\15\1\16\1\17\3\5"+
    "\13\6\1\20\1\21\1\22\1\6\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\6\67\0\1\3"+
    "\1\43\1\0\1\6\4\0\1\6\1\44\1\45\1\6"+
    "\1\46\1\47\1\50\1\0\1\51\4\0\1\52\1\53"+
    "\1\6\1\54\3\6\1\55\1\56\1\6\1\57\1\20"+
    "\2\0\2\6\17\0\4\6\1\0\20\6\2\0\40\6"+
    "\3\0\1\5\17\0\3\5\41\0\1\6\1\43\1\0"+
    "\1\6\4\0\7\6\6\0\13\6\3\0\2\6\17\0"+
    "\1\6\2\7\1\60\1\0\1\7\1\61\16\7\2\0"+
    "\40\7\2\10\1\62\1\0\2\10\1\63\15\10\2\0"+
    "\40\10\10\0\1\64\56\0\1\3\1\43\1\0\1\6"+
    "\4\0\7\6\1\0\1\51\4\0\13\6\3\0\2\6"+
    "\17\0\1\6\1\0\1\6\1\43\1\0\1\6\4\0"+
    "\2\6\1\65\4\6\6\0\13\6\3\0\2\6\17\0"+
    "\1\6\1\0\1\66\1\67\1\0\1\70\4\0\7\70"+
    "\6\0\13\70\3\0\2\70\17\0\1\70\1\0\1\71"+
    "\17\0\1\51\45\0\1\72\1\73\1\0\1\72\4\0"+
    "\7\72\6\0\13\72\3\0\2\72\17\0\1\72\1\0"+
    "\1\74\1\75\1\0\1\74\4\0\1\76\1\77\3\74"+
    "\1\100\1\74\6\0\1\74\1\101\1\74\1\102\1\103"+
    "\6\74\3\0\1\104\1\74\17\0\1\74\1\0\1\6"+
    "\1\43\1\0\1\6\4\0\2\6\1\105\4\6\6\0"+
    "\13\6\3\0\2\6\17\0\1\6\3\0\1\106\3\0"+
    "\1\107\6\0\1\110\4\0\3\106\110\0\1\111\65\0"+
    "\1\112\65\0\1\113\65\0\1\114\16\0\1\6\1\43"+
    "\1\0\1\6\4\0\7\6\6\0\2\6\2\115\1\6"+
    "\1\115\5\6\3\0\2\6\17\0\1\6\1\0\1\6"+
    "\1\43\1\0\1\6\4\0\7\6\6\0\6\6\1\116"+
    "\4\6\3\0\2\6\17\0\1\6\1\0\1\6\1\43"+
    "\1\0\1\6\4\0\2\6\1\45\4\6\6\0\13\6"+
    "\3\0\2\6\17\0\1\6\1\0\1\6\1\43\1\0"+
    "\1\6\4\0\7\6\6\0\4\6\1\115\6\6\3\0"+
    "\2\6\17\0\1\6\1\0\1\6\1\43\1\0\1\6"+
    "\4\0\7\6\6\0\1\117\12\6\3\0\2\6\17\0"+
    "\1\6\1\0\1\120\65\0\1\6\1\43\1\0\1\6"+
    "\4\0\7\6\6\0\1\6\1\121\1\122\10\6\3\0"+
    "\2\6\17\0\1\6\1\0\1\6\1\43\1\0\1\6"+
    "\4\0\7\6\6\0\1\6\1\115\5\6\1\55\3\6"+
    "\3\0\2\6\17\0\1\6\1\0\1\6\1\43\1\0"+
    "\1\6\4\0\7\6\6\0\1\6\1\115\11\6\3\0"+
    "\2\6\17\0\1\6\1\0\1\6\1\43\1\0\1\6"+
    "\4\0\7\6\6\0\11\6\1\123\1\6\3\0\2\6"+
    "\17\0\1\6\1\0\1\6\1\43\1\0\1\6\4\0"+
    "\7\6\6\0\10\6\1\56\2\6\3\0\2\6\17\0"+
    "\1\6\2\7\1\60\21\7\1\124\41\7\2\10\1\62"+
    "\21\10\1\125\41\10\10\64\1\126\55\64\1\0\1\6"+
    "\1\43\1\0\1\6\4\0\3\6\1\127\3\6\6\0"+
    "\13\6\3\0\2\6\17\0\1\6\1\0\1\66\1\67"+
    "\1\0\1\70\4\0\1\70\1\130\1\131\1\70\1\132"+
    "\1\133\1\134\6\0\1\135\1\136\1\70\1\137\3\70"+
    "\1\140\1\141\1\70\1\142\1\20\2\0\2\70\17\0"+
    "\4\70\1\0\20\70\2\0\40\70\1\0\1\70\1\67"+
    "\1\0\1\70\4\0\7\70\6\0\13\70\3\0\2\70"+
    "\17\0\1\70\1\0\1\71\10\0\1\143\1\144\1\0"+
    "\1\145\1\146\1\147\1\0\1\51\4\0\1\150\1\151"+
    "\1\0\1\152\3\0\1\153\1\154\1\0\1\155\1\20"+
    "\24\0\3\72\1\0\20\72\2\0\40\72\1\0\1\74"+
    "\1\75\1\0\1\74\4\0\7\74\6\0\13\74\3\0"+
    "\2\74\17\0\4\74\1\0\20\74\2\0\40\74\1\0"+
    "\1\74\1\75\1\0\1\74\4\0\7\74\6\0\1\74"+
    "\1\156\11\74\3\0\2\74\17\0\1\74\1\0\1\74"+
    "\1\75\1\0\1\74\4\0\7\74\6\0\6\74\1\157"+
    "\4\74\3\0\2\74\17\0\1\74\1\0\1\74\1\75"+
    "\1\0\1\74\4\0\7\74\6\0\1\74\1\160\11\74"+
    "\3\0\2\74\17\0\1\74\1\0\1\74\1\75\1\0"+
    "\1\74\4\0\7\74\6\0\1\161\12\74\3\0\2\74"+
    "\17\0\1\74\1\0\1\74\1\75\1\0\1\74\4\0"+
    "\7\74\6\0\10\74\1\162\2\74\3\0\2\74\17\0"+
    "\1\74\1\0\1\74\1\75\1\0\1\74\4\0\7\74"+
    "\6\0\6\74\1\163\4\74\3\0\2\74\17\0\1\74"+
    "\1\0\1\74\1\75\1\0\1\74\4\0\3\74\1\164"+
    "\3\74\6\0\13\74\3\0\2\74\17\0\1\74\1\0"+
    "\1\6\1\43\1\0\1\6\4\0\7\6\6\0\13\6"+
    "\3\0\2\6\17\0\1\165\10\0\1\166\104\0\1\167"+
    "\37\0\1\6\1\43\1\0\1\6\4\0\6\6\1\170"+
    "\6\0\13\6\3\0\2\6\17\0\1\6\1\0\1\6"+
    "\1\43\1\0\1\6\4\0\4\6\1\170\2\6\6\0"+
    "\13\6\3\0\2\6\17\0\1\6\1\0\1\120\10\0"+
    "\1\143\1\144\1\0\1\145\1\146\1\147\6\0\1\150"+
    "\1\151\1\0\1\152\3\0\1\153\1\154\1\0\1\155"+
    "\1\20\24\0\2\7\1\60\1\0\1\7\1\61\16\7"+
    "\1\0\41\7\2\10\1\62\1\0\2\10\1\63\15\10"+
    "\1\0\41\10\7\64\1\171\1\126\55\64\1\0\1\6"+
    "\1\43\1\0\1\6\4\0\4\6\1\172\2\6\6\0"+
    "\13\6\3\0\2\6\17\0\1\6\1\0\1\70\1\67"+
    "\1\0\1\70\4\0\7\70\6\0\2\70\2\173\1\70"+
    "\1\173\5\70\3\0\2\70\17\0\1\70\1\0\1\70"+
    "\1\67\1\0\1\70\4\0\7\70\6\0\6\70\1\174"+
    "\4\70\3\0\2\70\17\0\1\70\1\0\1\70\1\67"+
    "\1\0\1\70\4\0\2\70\1\131\4\70\6\0\13\70"+
    "\3\0\2\70\17\0\1\70\1\0\1\70\1\67\1\0"+
    "\1\70\4\0\7\70\6\0\4\70\1\173\6\70\3\0"+
    "\2\70\17\0\1\70\1\0\1\70\1\67\1\0\1\70"+
    "\4\0\7\70\6\0\1\175\12\70\3\0\2\70\17\0"+
    "\1\70\1\0\1\70\1\67\1\0\1\70\4\0\7\70"+
    "\6\0\1\70\1\176\1\177\10\70\3\0\2\70\17\0"+
    "\1\70\1\0\1\70\1\67\1\0\1\70\4\0\7\70"+
    "\6\0\1\70\1\173\5\70\1\140\3\70\3\0\2\70"+
    "\17\0\1\70\1\0\1\70\1\67\1\0\1\70\4\0"+
    "\7\70\6\0\1\70\1\173\11\70\3\0\2\70\17\0"+
    "\1\70\1\0\1\70\1\67\1\0\1\70\4\0\7\70"+
    "\6\0\11\70\1\200\1\70\3\0\2\70\17\0\1\70"+
    "\1\0\1\70\1\67\1\0\1\70\4\0\7\70\6\0"+
    "\10\70\1\141\2\70\3\0\2\70\17\0\1\70\30\0"+
    "\2\201\1\0\1\201\66\0\1\202\44\0\1\144\104\0"+
    "\1\201\61\0\1\203\66\0\1\204\1\205\64\0\1\201"+
    "\5\0\1\153\57\0\1\201\75\0\1\206\64\0\1\154"+
    "\30\0\1\74\1\75\1\0\1\74\4\0\3\74\1\207"+
    "\3\74\6\0\13\74\3\0\2\74\17\0\1\74\1\0"+
    "\1\74\1\75\1\0\1\74\4\0\4\74\1\210\2\74"+
    "\6\0\13\74\3\0\2\74\17\0\1\74\1\0\1\74"+
    "\1\75\1\0\1\74\4\0\1\74\1\211\5\74\6\0"+
    "\13\74\3\0\2\74\17\0\1\74\1\0\1\74\1\75"+
    "\1\0\1\74\4\0\6\74\1\212\6\0\13\74\3\0"+
    "\2\74\17\0\1\74\1\0\1\74\1\75\1\0\1\74"+
    "\4\0\7\74\6\0\6\74\1\213\4\74\3\0\2\74"+
    "\17\0\1\74\1\0\1\74\1\75\1\0\1\74\4\0"+
    "\7\74\6\0\1\74\1\214\11\74\3\0\2\74\17\0"+
    "\1\74\1\0\1\74\1\75\1\0\1\74\4\0\7\74"+
    "\6\0\4\74\1\215\6\74\3\0\2\74\17\0\1\74"+
    "\1\0\1\6\1\43\1\0\1\6\4\0\7\6\6\0"+
    "\13\6\3\0\2\6\11\0\1\216\5\0\1\6\10\166"+
    "\1\217\55\166\12\0\1\220\54\0\1\6\1\43\1\0"+
    "\1\6\4\0\5\6\1\221\1\6\6\0\13\6\3\0"+
    "\2\6\17\0\1\6\1\0\1\70\1\67\1\0\1\70"+
    "\4\0\6\70\1\222\6\0\13\70\3\0\2\70\17\0"+
    "\1\70\1\0\1\70\1\67\1\0\1\70\4\0\4\70"+
    "\1\222\2\70\6\0\13\70\3\0\2\70\17\0\1\70"+
    "\17\0\1\223\63\0\1\223\51\0\1\74\1\75\1\0"+
    "\1\74\4\0\7\74\6\0\11\74\1\224\1\74\3\0"+
    "\2\74\17\0\1\74\1\0\1\74\1\75\1\0\1\74"+
    "\4\0\7\74\6\0\1\225\12\74\3\0\2\74\17\0"+
    "\1\74\1\0\1\74\1\75\1\0\1\74\4\0\3\74"+
    "\1\226\3\74\6\0\13\74\3\0\2\74\17\0\1\74"+
    "\1\0\1\74\1\75\1\0\1\74\4\0\5\74\1\227"+
    "\1\74\6\0\13\74\3\0\2\74\17\0\1\74\1\0"+
    "\1\74\1\75\1\0\1\74\4\0\2\74\1\230\4\74"+
    "\6\0\13\74\3\0\2\74\17\0\1\74\1\0\1\74"+
    "\1\75\1\0\1\74\4\0\7\74\6\0\1\231\12\74"+
    "\3\0\2\74\17\0\1\74\1\0\1\74\1\75\1\0"+
    "\1\74\4\0\7\74\6\0\5\74\1\232\5\74\3\0"+
    "\2\74\17\0\1\74\60\216\1\233\5\216\7\166\1\106"+
    "\1\217\55\166\14\0\1\234\52\0\1\6\1\43\1\0"+
    "\1\6\4\0\6\6\1\235\6\0\13\6\3\0\2\6"+
    "\17\0\1\6\1\0\1\74\1\75\1\0\1\74\4\0"+
    "\1\236\6\74\6\0\13\74\3\0\2\74\17\0\1\74"+
    "\1\0\1\74\1\75\1\0\1\74\4\0\2\74\1\237"+
    "\4\74\6\0\13\74\3\0\2\74\17\0\1\74\1\0"+
    "\1\74\1\75\1\0\1\74\4\0\7\74\6\0\6\74"+
    "\1\240\4\74\3\0\2\74\17\0\1\74\1\0\1\74"+
    "\1\75\1\0\1\74\4\0\7\74\6\0\7\74\1\241"+
    "\3\74\3\0\2\74\17\0\1\74\1\0\1\74\1\75"+
    "\1\0\1\74\4\0\7\74\6\0\7\74\1\242\3\74"+
    "\3\0\2\74\17\0\1\74\1\0\1\74\1\75\1\0"+
    "\1\74\4\0\1\243\6\74\6\0\13\74\3\0\2\74"+
    "\17\0\1\74\13\0\1\244\53\0\1\6\1\43\1\0"+
    "\1\6\4\0\7\6\1\245\5\0\13\6\3\0\2\6"+
    "\17\0\1\6\1\0\1\74\1\75\1\0\1\74\4\0"+
    "\6\74\1\246\6\0\13\74\3\0\2\74\17\0\1\74"+
    "\1\0\1\74\1\75\1\0\1\74\4\0\7\74\6\0"+
    "\5\74\1\247\5\74\3\0\2\74\17\0\1\74\1\0"+
    "\1\74\1\75\1\0\1\74\4\0\7\74\6\0\1\250"+
    "\12\74\3\0\2\74\17\0\1\74\1\0\1\74\1\75"+
    "\1\0\1\74\4\0\1\74\1\251\5\74\6\0\13\74"+
    "\3\0\2\74\17\0\1\74\1\0\1\74\1\75\1\0"+
    "\1\74\4\0\7\74\6\0\13\74\3\0\1\252\1\74"+
    "\17\0\1\74\33\0\1\253\33\0\1\254\1\255\1\0"+
    "\1\254\4\0\7\254\6\0\13\254\3\0\2\254\17\0"+
    "\1\254\1\0\1\74\1\75\1\0\1\74\4\0\3\74"+
    "\1\256\3\74\6\0\13\74\3\0\2\74\17\0\1\74"+
    "\1\0\1\74\1\75\1\0\1\74\4\0\7\74\6\0"+
    "\5\74\1\257\5\74\3\0\2\74\17\0\1\74\1\0"+
    "\1\74\1\75\1\0\1\74\4\0\7\74\6\0\6\74"+
    "\1\260\4\74\3\0\2\74\17\0\1\74\1\0\1\74"+
    "\1\75\1\0\1\74\4\0\7\74\6\0\6\74\1\261"+
    "\4\74\3\0\2\74\17\0\1\74\34\0\1\262\32\0"+
    "\1\254\1\255\1\0\1\254\4\0\7\254\1\0\1\245"+
    "\4\0\13\254\3\0\2\254\17\0\4\254\1\0\20\254"+
    "\2\0\40\254\1\0\1\74\1\75\1\0\1\74\4\0"+
    "\7\74\6\0\3\74\1\263\7\74\3\0\2\74\17\0"+
    "\1\74\1\0\1\74\1\75\1\0\1\74\4\0\7\74"+
    "\6\0\3\74\1\264\7\74\3\0\2\74\17\0\1\74"+
    "\1\0\1\74\1\75\1\0\1\74\4\0\7\74\6\0"+
    "\3\74\1\265\7\74\3\0\2\74\17\0\1\74\32\0"+
    "\1\266\34\0\1\74\1\75\1\0\1\74\4\0\7\74"+
    "\6\0\13\74\3\0\1\74\1\267\17\0\1\74\1\0"+
    "\1\74\1\75\1\0\1\74\4\0\7\74\6\0\1\270"+
    "\12\74\3\0\2\74\17\0\1\74\1\0\1\74\1\75"+
    "\1\0\1\74\4\0\7\74\6\0\1\271\12\74\3\0"+
    "\2\74\17\0\1\74\33\0\1\272\33\0\1\74\1\75"+
    "\1\0\1\74\4\0\7\74\6\0\1\74\1\273\11\74"+
    "\3\0\2\74\17\0\1\74\1\0\1\74\1\75\1\0"+
    "\1\74\4\0\7\74\6\0\1\274\12\74\3\0\2\74"+
    "\17\0\1\74\1\0\1\74\1\75\1\0\1\74\4\0"+
    "\7\74\6\0\4\74\1\275\6\74\3\0\2\74\17\0"+
    "\1\74\1\0\1\74\1\75\1\0\1\74\4\0\7\74"+
    "\6\0\5\74\1\276\5\74\3\0\2\74\17\0\1\74";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7560];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\7\1\1\11\2\1\1\11\2\1\1\11"+
    "\5\1\1\11\3\1\11\11\1\0\5\1\1\0\7\1"+
    "\1\11\1\1\1\11\1\0\2\1\1\0\3\1\1\0"+
    "\1\1\1\0\10\1\3\0\4\11\11\1\1\0\14\1"+
    "\10\0\1\11\2\0\10\1\2\0\1\1\1\11\7\1"+
    "\1\11\2\0\3\11\7\1\3\0\2\1\1\11\7\1"+
    "\1\11\1\0\7\1\2\0\5\1\1\0\1\1\1\0"+
    "\4\1\1\0\3\1\1\0\3\1\1\11\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[190];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	// last token used for look behind. Also needed when implementing the ITokenScanner interface
	private Symbol _lastToken;

	// flag indicating if we should collect comments or not
	private boolean _collectComments = true;

	// comment collections, by type
	private List<Symbol> _comments = new ArrayList<Symbol>();

	// curly brace nesting level
	private int _nestingLevel;

	// a flag indicating we're inside of a @media block
	private boolean _inMedia;

	public CSSFlexScanner()
	{
		this((Reader) null);
	}

	public Symbol getLastToken()
	{
		return _lastToken;
	}

	public List<Symbol> getComments()
	{
		return _comments;
	}

	private Symbol newToken(CSSTokenType type, Object value)
	{
		return newToken(type.getIndex(), value);
	}

	private Symbol newToken(short id, Object value)
	{
		return new Symbol(id, yychar, yychar + yylength() - 1, value);
	}

	public Symbol nextToken() throws java.io.IOException, Scanner.Exception
	{
		try
		{
			// get next token
			_lastToken = yylex();
		} 
		catch (Scanner.Exception e)
		{
			// create default token type
			String text = yytext();
			int end = yychar + text.length() - 1;

			_lastToken = new Symbol(CSSTokenType.EOF.getIndex(), yychar, end, text);
		}

		return _lastToken;
	}

	public void setCollectComments(boolean flag)
	{
		_collectComments = flag;
	}

	public void setSource(String source)
	{
		yyreset(new StringReader(source));

		// clear last token
		_lastToken = null;

		// reset comment collection list
		_comments.clear();

		// reset nesting level
		_nestingLevel = 0;

		// reset media flag
		_inMedia = false;
	}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  CSSFlexScanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  CSSFlexScanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 184) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Symbol yylex() throws java.io.IOException, Scanner.Exception {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 3: 
          { /* ignore */
          }
        case 46: break;
        case 4: 
          { return newToken(CSSTokenType.IDENTIFIER, yytext());
          }
        case 47: break;
        case 11: 
          { return newToken(CSSTokenType.PLUS, yytext());
          }
        case 48: break;
        case 29: 
          { return newToken(CSSTokenType.BEGINS_WITH, yytext());
          }
        case 49: break;
        case 9: 
          { return newToken(CSSTokenType.MINUS, yytext());
          }
        case 50: break;
        case 28: 
          { return newToken(CSSTokenType.DASHMATCH, yytext());
          }
        case 51: break;
        case 5: 
          { return newToken(CSSTokenType.DOUBLE_QUOTED_STRING, yytext());
          }
        case 52: break;
        case 25: 
          { CSSTokenType type;

									if ((_inMedia && _nestingLevel == 1) || _nestingLevel <= 0)
									{
										type = CSSTokenType.ID;
									}
									else
									{
										boolean numbers = true;
										String text = yytext();

										for (int i = 1; i < text.length(); i++)
										{
											char c = text.charAt(i);

											if (!('0' <= c && c <= '9' || 'a' <= c && c <= 'f' || 'A' <= c && c <= 'F'))
											{
												numbers = false;
												break;
											}
										}

										type = (numbers) ? CSSTokenType.RGB : CSSTokenType.ID;
									}

									return newToken(type, yytext());
          }
        case 53: break;
        case 2: 
          { return newToken(CSSTokenType.NUMBER, yytext());
          }
        case 54: break;
        case 41: 
          { return newToken(CSSTokenType.CHARSET, yytext());
          }
        case 55: break;
        case 13: 
          { return newToken(CSSTokenType.EQUAL, yytext());
          }
        case 56: break;
        case 42: 
          { return newToken(CSSTokenType.NAMESPACE, yytext());
          }
        case 57: break;
        case 37: 
          { return newToken(CSSTokenType.PAGE, yytext());
          }
        case 58: break;
        case 39: 
          { _inMedia = true; return newToken(CSSTokenType.MEDIA_KEYWORD, yytext());
          }
        case 59: break;
        case 27: 
          { return newToken(CSSTokenType.INCLUDES, yytext());
          }
        case 60: break;
        case 45: 
          { return newToken(CSSTokenType.MOZ_DOCUMENT, yytext());
          }
        case 61: break;
        case 16: 
          { _nestingLevel--;

									if (_nestingLevel == 0)
									{
										// reset (possibly set) media flag
										_inMedia = false;
									}

									return newToken(CSSTokenType.RCURLY, yytext());
          }
        case 62: break;
        case 30: 
          { return newToken(CSSTokenType.ENDS_WITH, yytext());
          }
        case 63: break;
        case 32: 
          { return newToken(CSSTokenType.EMS, yytext());
          }
        case 64: break;
        case 33: 
          { return newToken(CSSTokenType.EXS, yytext());
          }
        case 65: break;
        case 23: 
          { return newToken(CSSTokenType.TIME, yytext());
          }
        case 66: break;
        case 6: 
          { return newToken(CSSTokenType.SINGLE_QUOTED_STRING, yytext());
          }
        case 67: break;
        case 40: 
          { return newToken(CSSTokenType.IMPORT, yytext());
          }
        case 68: break;
        case 15: 
          { _nestingLevel++;

									return newToken(CSSTokenType.LCURLY, yytext());
          }
        case 69: break;
        case 12: 
          { return newToken(CSSTokenType.PERCENTAGE, yytext());
          }
        case 70: break;
        case 18: 
          { return newToken(CSSTokenType.RPAREN, yytext());
          }
        case 71: break;
        case 14: 
          { return newToken(CSSTokenType.SEMICOLON, yytext());
          }
        case 72: break;
        case 24: 
          { CSSTokenType type;

									if ((_inMedia && _nestingLevel == 1) || _nestingLevel <= 0)
									{
										type = CSSTokenType.CLASS;
									}
									else
									{
										boolean numbers = true;
										String text = yytext();

										for (int i = 1; i < text.length(); i++)
										{
											char c = text.charAt(i);

											if (c < '0' || '9' < c)
											{
												numbers = false;
												break;
											}
										}

										type = (numbers) ? CSSTokenType.NUMBER : CSSTokenType.CLASS;
									}

									return newToken(type, yytext());
          }
        case 73: break;
        case 8: 
          { return newToken(CSSTokenType.STAR, yytext());
          }
        case 74: break;
        case 34: 
          { return newToken(CSSTokenType.FREQUENCY, yytext());
          }
        case 75: break;
        case 7: 
          { return newToken(CSSTokenType.SLASH, yytext());
          }
        case 76: break;
        case 36: 
          { _comments.add(newToken(CSSTokenType.COMMENT, yytext()));
          }
        case 77: break;
        case 19: 
          { return newToken(CSSTokenType.LBRACKET, yytext());
          }
        case 78: break;
        case 31: 
          { return newToken(CSSTokenType.LENGTH, yytext());
          }
        case 79: break;
        case 35: 
          { return newToken(CSSTokenType.ANGLE, yytext());
          }
        case 80: break;
        case 26: 
          { return newToken(CSSTokenType.AT_RULE, yytext());
          }
        case 81: break;
        case 1: 
          { return newToken(CSSTokenType.ERROR, yytext());
          }
        case 82: break;
        case 43: 
          { return newToken(CSSTokenType.FONTFACE, yytext());
          }
        case 83: break;
        case 17: 
          { return newToken(CSSTokenType.LPAREN, yytext());
          }
        case 84: break;
        case 44: 
          { return newToken(CSSTokenType.IMPORTANT, yytext());
          }
        case 85: break;
        case 10: 
          { return newToken(CSSTokenType.COLON, yytext());
          }
        case 86: break;
        case 38: 
          { return newToken(CSSTokenType.URL, yytext());
          }
        case 87: break;
        case 21: 
          { return newToken(CSSTokenType.COMMA, yytext());
          }
        case 88: break;
        case 22: 
          { return newToken(CSSTokenType.GREATER, yytext());
          }
        case 89: break;
        case 20: 
          { return newToken(CSSTokenType.RBRACKET, yytext());
          }
        case 90: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              { 	return newToken(Terminals.EOF, "end-of-file");
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
