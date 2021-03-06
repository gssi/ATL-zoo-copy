// $ANTLR 3.0 C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g 2007-11-02 14:08:32
package org.atl.engine.injectors.ebnf;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SimScan_ANTLR3Lexer extends Lexer {
    public static final int MINUS=9;
    public static final int SHARP=27;
    public static final int FLOAT=7;
    public static final int LARROW=41;
    public static final int PIPE=26;
    public static final int RCURLY=24;
    public static final int NL=12;
    public static final int LCURLY=23;
    public static final int INT=6;
    public static final int LE=39;
    public static final int RPAREN=22;
    public static final int LPAREN=21;
    public static final int PLUS=34;
    public static final int DIGIT=14;
    public static final int LSQUARE=18;
    public static final int SNAME=16;
    public static final int SLASH=33;
    public static final int POINT=30;
    public static final int WS=13;
    public static final int ALPHA=15;
    public static final int STRING=5;
    public static final int EQ=35;
    public static final int EXCL=20;
    public static final int RARROW=31;
    public static final int LT=37;
    public static final int GT=36;
    public static final int NE=40;
    public static final int COMMENT=42;
    public static final int RSQUARE=19;
    public static final int ESC=17;
    public static final int SEMI=25;
    public static final int GE=38;
    public static final int COLONCOLON=29;
    public static final int EOF=-1;
    public static final int QMARK=28;
    public static final int Tokens=43;
    public static final int COLON=11;
    public static final int COLONBS=10;
    public static final int COMA=8;
    public static final int STAR=32;
    public static final int NAME=4;


    	private void newline() {}

    	public org.atl.engine.injectors.ebnf.EBNFInjector2 ei = null;

    	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
    		ei.reportError((Exception)e);
    	}

    	public Token emit() {
    		org.atl.engine.injectors.ebnf.LocationTokenv3 ret = null;

    		ret = new org.atl.engine.injectors.ebnf.LocationTokenv3(input, type, channel, tokenStartCharIndex, getCharIndex()-1);
    		ret.setLine(tokenStartLine);
    		ret.setText(text);
    	  	ret.setCharPositionInLine(tokenStartCharPositionInLine);
    		ret.setEndLine(getLine());
    		ret.setEndColumn(getCharPositionInLine());
    		emit(ret);

    		return ret;
    	}


    public SimScan_ANTLR3Lexer() {;} 
    public SimScan_ANTLR3Lexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g"; }

    // $ANTLR start NL
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:137:4: ( ( '\\r' '\\n' | '\\n' '\\r' | '\\r' | '\\n' ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:137:4: ( '\\r' '\\n' | '\\n' '\\r' | '\\r' | '\\n' )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:137:4: ( '\\r' '\\n' | '\\n' '\\r' | '\\r' | '\\n' )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='\n') ) {
                    alt1=1;
                }
                else {
                    alt1=3;}
            }
            else if ( (LA1_0=='\n') ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='\r') ) {
                    alt1=2;
                }
                else {
                    alt1=4;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("137:4: ( '\\r' '\\n' | '\\n' '\\r' | '\\r' | '\\n' )", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:137:6: '\\r' '\\n'
                    {
                    match('\r'); 
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:138:5: '\\n' '\\r'
                    {
                    match('\n'); 
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:139:5: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:140:5: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }

            newline();

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NL

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:146:4: ( ( ' ' | '\\t' ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:146:4: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start DIGIT
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:153:4: ( '0' .. '9' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:153:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end DIGIT

    // $ANTLR start ALPHA
    public final void mALPHA() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:158:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u00FF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end ALPHA

    // $ANTLR start SNAME
    public final void mSNAME() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:172:4: ( ( ALPHA ) ( ALPHA | DIGIT | '.' | '\\\\' | '-' | ' ' )* )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:172:4: ( ALPHA ) ( ALPHA | DIGIT | '.' | '\\\\' | '-' | ' ' )*
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:172:4: ( ALPHA )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:172:5: ALPHA
            {
            mALPHA(); 

            }

            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:172:12: ( ALPHA | DIGIT | '.' | '\\\\' | '-' | ' ' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==' '||(LA2_0>='-' && LA2_0<='.')||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='\\'||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')||(LA2_0>='\u00C0' && LA2_0<='\u00D6')||(LA2_0>='\u00D8' && LA2_0<='\u00F6')||(LA2_0>='\u00F8' && LA2_0<='\u00FF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:
            	    {
            	    if ( input.LA(1)==' '||(input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u00FF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end SNAME

    // $ANTLR start NAME
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:176:4: ( ( SNAME | '\"' ( ESC | '\\n' | ~ ( '\\\\' | '\\\"' | '\\n' ) )* '\"' ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:176:4: ( SNAME | '\"' ( ESC | '\\n' | ~ ( '\\\\' | '\\\"' | '\\n' ) )* '\"' )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:176:4: ( SNAME | '\"' ( ESC | '\\n' | ~ ( '\\\\' | '\\\"' | '\\n' ) )* '\"' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')||(LA4_0>='\u00C0' && LA4_0<='\u00D6')||(LA4_0>='\u00D8' && LA4_0<='\u00F6')||(LA4_0>='\u00F8' && LA4_0<='\u00FF')) ) {
                alt4=1;
            }
            else if ( (LA4_0=='\"') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("176:4: ( SNAME | '\"' ( ESC | '\\n' | ~ ( '\\\\' | '\\\"' | '\\n' ) )* '\"' )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:177:4: SNAME
                    {
                    mSNAME(); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:179:5: '\"' ( ESC | '\\n' | ~ ( '\\\\' | '\\\"' | '\\n' ) )* '\"'
                    {
                    match('\"'); 
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:180:4: ( ESC | '\\n' | ~ ( '\\\\' | '\\\"' | '\\n' ) )*
                    loop3:
                    do {
                        int alt3=4;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( (LA3_0=='\n') ) {
                            alt3=2;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFE')) ) {
                            alt3=3;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:180:6: ESC
                    	    {
                    	    mESC(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:181:6: '\\n'
                    	    {
                    	    match('\n'); 
                    	    newline();

                    	    }
                    	    break;
                    	case 3 :
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:182:6: ~ ( '\\\\' | '\\\"' | '\\n' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 
                    setText(ei.unescapeString(getText(), 1));

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NAME

    // $ANTLR start INT
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:190:4: ( ( DIGIT )+ )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:190:4: ( DIGIT )+
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:190:4: ( DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:190:5: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INT

    // $ANTLR start FLOAT
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:194:9: ( ( DIGIT )+ '.' ( DIGIT )* )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:194:9: ( DIGIT )+ '.' ( DIGIT )*
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:194:9: ( DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:194:9: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            match('.'); 
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:194:20: ( DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:194:20: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FLOAT

    // $ANTLR start ESC
    public final void mESC() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:198:4: ( '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | ( ( '0' .. '3' ) ( ( '0' .. '7' ) ( '0' .. '7' )? )? | ( '4' .. '7' ) ( ( '0' .. '7' ) )? ) ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:198:4: '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | ( ( '0' .. '3' ) ( ( '0' .. '7' ) ( '0' .. '7' )? )? | ( '4' .. '7' ) ( ( '0' .. '7' ) )? ) )
            {
            match('\\'); 
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:199:3: ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | ( ( '0' .. '3' ) ( ( '0' .. '7' ) ( '0' .. '7' )? )? | ( '4' .. '7' ) ( ( '0' .. '7' ) )? ) )
            int alt12=9;
            switch ( input.LA(1) ) {
            case 'n':
                {
                alt12=1;
                }
                break;
            case 'r':
                {
                alt12=2;
                }
                break;
            case 't':
                {
                alt12=3;
                }
                break;
            case 'b':
                {
                alt12=4;
                }
                break;
            case 'f':
                {
                alt12=5;
                }
                break;
            case '\"':
                {
                alt12=6;
                }
                break;
            case '\'':
                {
                alt12=7;
                }
                break;
            case '\\':
                {
                alt12=8;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
                {
                alt12=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("199:3: ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | ( ( '0' .. '3' ) ( ( '0' .. '7' ) ( '0' .. '7' )? )? | ( '4' .. '7' ) ( ( '0' .. '7' ) )? ) )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:199:5: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:200:5: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:201:5: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:202:5: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:203:5: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:204:5: '\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:205:5: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:206:5: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:207:5: ( ( '0' .. '3' ) ( ( '0' .. '7' ) ( '0' .. '7' )? )? | ( '4' .. '7' ) ( ( '0' .. '7' ) )? )
                    {
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:207:5: ( ( '0' .. '3' ) ( ( '0' .. '7' ) ( '0' .. '7' )? )? | ( '4' .. '7' ) ( ( '0' .. '7' ) )? )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>='0' && LA11_0<='3')) ) {
                        alt11=1;
                    }
                    else if ( ((LA11_0>='4' && LA11_0<='7')) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("207:5: ( ( '0' .. '3' ) ( ( '0' .. '7' ) ( '0' .. '7' )? )? | ( '4' .. '7' ) ( ( '0' .. '7' ) )? )", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:208:5: ( '0' .. '3' ) ( ( '0' .. '7' ) ( '0' .. '7' )? )?
                            {
                            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:208:5: ( '0' .. '3' )
                            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:208:6: '0' .. '3'
                            {
                            matchRange('0','3'); 

                            }

                            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:209:5: ( ( '0' .. '7' ) ( '0' .. '7' )? )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( ((LA9_0>='0' && LA9_0<='7')) ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:213:7: ( '0' .. '7' ) ( '0' .. '7' )?
                                    {
                                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:213:7: ( '0' .. '7' )
                                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:213:8: '0' .. '7'
                                    {
                                    matchRange('0','7'); 

                                    }

                                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:214:6: ( '0' .. '7' )?
                                    int alt8=2;
                                    int LA8_0 = input.LA(1);

                                    if ( ((LA8_0>='0' && LA8_0<='7')) ) {
                                        alt8=1;
                                    }
                                    switch (alt8) {
                                        case 1 :
                                            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:218:8: '0' .. '7'
                                            {
                                            matchRange('0','7'); 

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:221:6: ( '4' .. '7' ) ( ( '0' .. '7' ) )?
                            {
                            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:221:6: ( '4' .. '7' )
                            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:221:7: '4' .. '7'
                            {
                            matchRange('4','7'); 

                            }

                            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:222:5: ( ( '0' .. '7' ) )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( ((LA10_0>='0' && LA10_0<='7')) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:226:7: ( '0' .. '7' )
                                    {
                                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:226:7: ( '0' .. '7' )
                                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:226:8: '0' .. '7'
                                    {
                                    matchRange('0','7'); 

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    
                    //					String s = getText();
                    //					int i;
                    //					int ret = 0;
                    //					String ans;
                    //					for (i=0; i<s.length(); ++i)
                    //						ret = ret*8 + s.charAt(i) - '0';
                    //					ans = String.valueOf((char) ret);
                    //					setText(ans);
                    				

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end ESC

    // $ANTLR start STRING
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:243:4: ( '\\'' ( ESC | '\\n' | ~ ( '\\\\' | '\\'' | '\\n' ) )* '\\'' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:243:4: '\\'' ( ESC | '\\n' | ~ ( '\\\\' | '\\'' | '\\n' ) )* '\\''
            {
            match('\''); 
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:244:3: ( ESC | '\\n' | ~ ( '\\\\' | '\\'' | '\\n' ) )*
            loop13:
            do {
                int alt13=4;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\\') ) {
                    alt13=1;
                }
                else if ( (LA13_0=='\n') ) {
                    alt13=2;
                }
                else if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFE')) ) {
                    alt13=3;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:244:5: ESC
            	    {
            	    mESC(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:245:5: '\\n'
            	    {
            	    match('\n'); 
            	    newline();

            	    }
            	    break;
            	case 3 :
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:246:5: ~ ( '\\\\' | '\\'' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match('\''); 
            setText(ei.unescapeString(getText(), 1));

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING

    // $ANTLR start LSQUARE
    public final void mLSQUARE() throws RecognitionException {
        try {
            int _type = LSQUARE;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:255:4: ( '[' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:255:4: '['
            {
            match('['); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LSQUARE

    // $ANTLR start RSQUARE
    public final void mRSQUARE() throws RecognitionException {
        try {
            int _type = RSQUARE;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:263:4: ( ']' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:263:4: ']'
            {
            match(']'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RSQUARE

    // $ANTLR start EXCL
    public final void mEXCL() throws RecognitionException {
        try {
            int _type = EXCL;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:271:4: ( '!' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:271:4: '!'
            {
            match('!'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EXCL

    // $ANTLR start COMA
    public final void mCOMA() throws RecognitionException {
        try {
            int _type = COMA;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:279:4: ( ',' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:279:4: ','
            {
            match(','); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMA

    // $ANTLR start LPAREN
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:287:4: ( '(' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:287:4: '('
            {
            match('('); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LPAREN

    // $ANTLR start RPAREN
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:295:4: ( ')' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:295:4: ')'
            {
            match(')'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RPAREN

    // $ANTLR start LCURLY
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:303:4: ( '{' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:303:4: '{'
            {
            match('{'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LCURLY

    // $ANTLR start RCURLY
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:311:4: ( '}' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:311:4: '}'
            {
            match('}'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RCURLY

    // $ANTLR start SEMI
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:319:4: ( ';' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:319:4: ';'
            {
            match(';'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SEMI

    // $ANTLR start COLON
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:327:4: ( ':' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:327:4: ':'
            {
            match(':'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLON

    // $ANTLR start COLONBS
    public final void mCOLONBS() throws RecognitionException {
        try {
            int _type = COLONBS;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:335:4: ( ':\\\\' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:335:4: ':\\\\'
            {
            match(":\\"); 


               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLONBS

    // $ANTLR start PIPE
    public final void mPIPE() throws RecognitionException {
        try {
            int _type = PIPE;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:343:4: ( '|' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:343:4: '|'
            {
            match('|'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PIPE

    // $ANTLR start SHARP
    public final void mSHARP() throws RecognitionException {
        try {
            int _type = SHARP;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:351:4: ( '#' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:351:4: '#'
            {
            match('#'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SHARP

    // $ANTLR start QMARK
    public final void mQMARK() throws RecognitionException {
        try {
            int _type = QMARK;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:359:4: ( '?' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:359:4: '?'
            {
            match('?'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end QMARK

    // $ANTLR start COLONCOLON
    public final void mCOLONCOLON() throws RecognitionException {
        try {
            int _type = COLONCOLON;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:367:4: ( '::' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:367:4: '::'
            {
            match("::"); 


               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLONCOLON

    // $ANTLR start POINT
    public final void mPOINT() throws RecognitionException {
        try {
            int _type = POINT;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:375:4: ( '.' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:375:4: '.'
            {
            match('.'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end POINT

    // $ANTLR start RARROW
    public final void mRARROW() throws RecognitionException {
        try {
            int _type = RARROW;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:383:4: ( '->' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:383:4: '->'
            {
            match("->"); 


               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RARROW

    // $ANTLR start MINUS
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:391:4: ( '-' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:391:4: '-'
            {
            match('-'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MINUS

    // $ANTLR start STAR
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:399:4: ( '*' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:399:4: '*'
            {
            match('*'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STAR

    // $ANTLR start SLASH
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:407:4: ( '/' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:407:4: '/'
            {
            match('/'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SLASH

    // $ANTLR start PLUS
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:415:4: ( '+' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:415:4: '+'
            {
            match('+'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLUS

    // $ANTLR start EQ
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:423:4: ( '=' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:423:4: '='
            {
            match('='); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQ

    // $ANTLR start GT
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:431:4: ( '>' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:431:4: '>'
            {
            match('>'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GT

    // $ANTLR start LT
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:439:4: ( '<' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:439:4: '<'
            {
            match('<'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LT

    // $ANTLR start GE
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:447:4: ( '>=' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:447:4: '>='
            {
            match(">="); 


               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GE

    // $ANTLR start LE
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:455:4: ( '<=' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:455:4: '<='
            {
            match("<="); 


               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LE

    // $ANTLR start NE
    public final void mNE() throws RecognitionException {
        try {
            int _type = NE;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:463:4: ( '<>' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:463:4: '<>'
            {
            match("<>"); 


               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NE

    // $ANTLR start LARROW
    public final void mLARROW() throws RecognitionException {
        try {
            int _type = LARROW;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:471:4: ( '<-' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:471:4: '<-'
            {
            match("<-"); 


               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LARROW

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:479:4: ( ( ( '--' (~ ( '\\r' | '\\n' ) )* ) ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:479:4: ( ( '--' (~ ( '\\r' | '\\n' ) )* ) )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:479:4: ( ( '--' (~ ( '\\r' | '\\n' ) )* ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:479:5: ( '--' (~ ( '\\r' | '\\n' ) )* )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:479:5: ( '--' (~ ( '\\r' | '\\n' ) )* )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:479:6: '--' (~ ( '\\r' | '\\n' ) )*
            {
            match("--"); 

            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:479:11: (~ ( '\\r' | '\\n' ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFE')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:479:12: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    public void mTokens() throws RecognitionException {
        // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:10: ( NL | WS | NAME | INT | FLOAT | STRING | LSQUARE | RSQUARE | EXCL | COMA | LPAREN | RPAREN | LCURLY | RCURLY | SEMI | COLON | COLONBS | PIPE | SHARP | QMARK | COLONCOLON | POINT | RARROW | MINUS | STAR | SLASH | PLUS | EQ | GT | LT | GE | LE | NE | LARROW | COMMENT )
        int alt15=35;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:10: NL
                {
                mNL(); 

                }
                break;
            case 2 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:13: WS
                {
                mWS(); 

                }
                break;
            case 3 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:16: NAME
                {
                mNAME(); 

                }
                break;
            case 4 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:21: INT
                {
                mINT(); 

                }
                break;
            case 5 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:25: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 6 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:31: STRING
                {
                mSTRING(); 

                }
                break;
            case 7 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:38: LSQUARE
                {
                mLSQUARE(); 

                }
                break;
            case 8 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:46: RSQUARE
                {
                mRSQUARE(); 

                }
                break;
            case 9 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:54: EXCL
                {
                mEXCL(); 

                }
                break;
            case 10 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:59: COMA
                {
                mCOMA(); 

                }
                break;
            case 11 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:64: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 12 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:71: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 13 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:78: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 14 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:85: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 15 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:92: SEMI
                {
                mSEMI(); 

                }
                break;
            case 16 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:97: COLON
                {
                mCOLON(); 

                }
                break;
            case 17 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:103: COLONBS
                {
                mCOLONBS(); 

                }
                break;
            case 18 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:111: PIPE
                {
                mPIPE(); 

                }
                break;
            case 19 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:116: SHARP
                {
                mSHARP(); 

                }
                break;
            case 20 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:122: QMARK
                {
                mQMARK(); 

                }
                break;
            case 21 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:128: COLONCOLON
                {
                mCOLONCOLON(); 

                }
                break;
            case 22 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:139: POINT
                {
                mPOINT(); 

                }
                break;
            case 23 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:145: RARROW
                {
                mRARROW(); 

                }
                break;
            case 24 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:152: MINUS
                {
                mMINUS(); 

                }
                break;
            case 25 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:158: STAR
                {
                mSTAR(); 

                }
                break;
            case 26 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:163: SLASH
                {
                mSLASH(); 

                }
                break;
            case 27 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:169: PLUS
                {
                mPLUS(); 

                }
                break;
            case 28 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:174: EQ
                {
                mEQ(); 

                }
                break;
            case 29 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:177: GT
                {
                mGT(); 

                }
                break;
            case 30 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:180: LT
                {
                mLT(); 

                }
                break;
            case 31 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:183: GE
                {
                mGE(); 

                }
                break;
            case 32 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:186: LE
                {
                mLE(); 

                }
                break;
            case 33 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:189: NE
                {
                mNE(); 

                }
                break;
            case 34 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:192: LARROW
                {
                mLARROW(); 

                }
                break;
            case 35 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:1:199: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\4\uffff\1\33\12\uffff\1\37\4\uffff\1\42\4\uffff\1\44\1\50\16\uffff";
    static final String DFA15_eofS =
        "\51\uffff";
    static final String DFA15_minS =
        "\1\11\3\uffff\1\56\12\uffff\1\72\4\uffff\1\55\4\uffff\1\75\1\55"+
        "\16\uffff";
    static final String DFA15_maxS =
        "\1\u00ff\3\uffff\1\71\12\uffff\1\134\4\uffff\1\76\4\uffff\1\75\1"+
        "\76\16\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\uffff\1\22\1\23\1\24\1\26\1\uffff\1\31\1\32\1\33"+
        "\1\34\2\uffff\1\4\1\5\1\25\1\21\1\20\1\43\1\27\1\30\1\37\1\35\1"+
        "\41\1\40\1\42\1\36";
    static final String DFA15_specialS =
        "\51\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\1\2\uffff\1\1\22\uffff\1\2\1\10\1\3\1\21\3\uffff\1\5"+
            "\1\12\1\13\1\25\1\27\1\11\1\24\1\23\1\26\12\4\1\17\1\16\1\32"+
            "\1\30\1\31\1\22\1\uffff\32\3\1\6\1\uffff\1\7\1\uffff\1\3\1\uffff"+
            "\32\3\1\14\1\20\1\15\102\uffff\27\3\1\uffff\37\3\1\uffff\10"+
            "\3",
            "",
            "",
            "",
            "\1\34\1\uffff\12\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\35\41\uffff\1\36",
            "",
            "",
            "",
            "",
            "\1\40\20\uffff\1\41",
            "",
            "",
            "",
            "",
            "\1\43",
            "\1\47\17\uffff\1\46\1\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( NL | WS | NAME | INT | FLOAT | STRING | LSQUARE | RSQUARE | EXCL | COMA | LPAREN | RPAREN | LCURLY | RCURLY | SEMI | COLON | COLONBS | PIPE | SHARP | QMARK | COLONCOLON | POINT | RARROW | MINUS | STAR | SLASH | PLUS | EQ | GT | LT | GE | LE | NE | LARROW | COMMENT );";
        }
    }
 

}