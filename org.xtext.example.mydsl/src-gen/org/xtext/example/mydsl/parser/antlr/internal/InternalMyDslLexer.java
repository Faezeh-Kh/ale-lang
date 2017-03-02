package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=10;
    public static final int RULE_REAL=8;
    public static final int RULE_IDENT=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_LETTER=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int RULE_MULTOP=7;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'import' )
            // InternalMyDsl.g:11:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( 'use' )
            // InternalMyDsl.g:12:9: 'use'
            {
            match("use"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( '.' )
            // InternalMyDsl.g:13:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( ';' )
            // InternalMyDsl.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( 'class' )
            // InternalMyDsl.g:15:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( '{' )
            // InternalMyDsl.g:16:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( '}' )
            // InternalMyDsl.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( 'def' )
            // InternalMyDsl.g:18:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( 'override' )
            // InternalMyDsl.g:19:9: 'override'
            {
            match("override"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( '(' )
            // InternalMyDsl.g:20:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( ')' )
            // InternalMyDsl.g:21:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( '@' )
            // InternalMyDsl.g:22:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:23:7: ( ',' )
            // InternalMyDsl.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( ':=' )
            // InternalMyDsl.g:24:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( 'for' )
            // InternalMyDsl.g:25:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26:7: ( 'in' )
            // InternalMyDsl.g:26:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( '[' )
            // InternalMyDsl.g:27:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:28:7: ( '..' )
            // InternalMyDsl.g:28:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:29:7: ( ']' )
            // InternalMyDsl.g:29:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:30:7: ( 'if' )
            // InternalMyDsl.g:30:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:31:7: ( 'else' )
            // InternalMyDsl.g:31:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:32:7: ( 'while' )
            // InternalMyDsl.g:32:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:33:7: ( 'and' )
            // InternalMyDsl.g:33:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( 'or' )
            // InternalMyDsl.g:34:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:35:7: ( 'xor' )
            // InternalMyDsl.g:35:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( 'implies' )
            // InternalMyDsl.g:36:9: 'implies'
            {
            match("implies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( '->' )
            // InternalMyDsl.g:37:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:38:7: ( 'not' )
            // InternalMyDsl.g:38:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:39:7: ( '-' )
            // InternalMyDsl.g:39:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:40:7: ( 'then' )
            // InternalMyDsl.g:40:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:41:7: ( 'endif' )
            // InternalMyDsl.g:41:9: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:42:7: ( 'let' )
            // InternalMyDsl.g:42:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:43:7: ( ':' )
            // InternalMyDsl.g:43:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:44:7: ( '=' )
            // InternalMyDsl.g:44:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:45:7: ( '+' )
            // InternalMyDsl.g:45:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:46:7: ( '<=' )
            // InternalMyDsl.g:46:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:47:7: ( '>=' )
            // InternalMyDsl.g:47:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:48:7: ( '!=' )
            // InternalMyDsl.g:48:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:49:7: ( '<>' )
            // InternalMyDsl.g:49:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:50:7: ( '==' )
            // InternalMyDsl.g:50:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:51:7: ( '<' )
            // InternalMyDsl.g:51:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:52:7: ( '>' )
            // InternalMyDsl.g:52:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:53:7: ( 'select' )
            // InternalMyDsl.g:53:9: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:54:7: ( 'reject' )
            // InternalMyDsl.g:54:9: 'reject'
            {
            match("reject"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:55:7: ( 'collect' )
            // InternalMyDsl.g:55:9: 'collect'
            {
            match("collect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:56:7: ( 'any' )
            // InternalMyDsl.g:56:9: 'any'
            {
            match("any"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:57:7: ( 'exists' )
            // InternalMyDsl.g:57:9: 'exists'
            {
            match("exists"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:58:7: ( 'forAll' )
            // InternalMyDsl.g:58:9: 'forAll'
            {
            match("forAll"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:59:7: ( 'isUnique' )
            // InternalMyDsl.g:59:9: 'isUnique'
            {
            match("isUnique"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:60:7: ( 'one' )
            // InternalMyDsl.g:60:9: 'one'
            {
            match("one"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:61:7: ( 'sortedBy' )
            // InternalMyDsl.g:61:9: 'sortedBy'
            {
            match("sortedBy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:62:7: ( 'closure' )
            // InternalMyDsl.g:62:9: 'closure'
            {
            match("closure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:63:7: ( '|' )
            // InternalMyDsl.g:63:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:64:7: ( 'true' )
            // InternalMyDsl.g:64:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:65:7: ( 'false' )
            // InternalMyDsl.g:65:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:66:7: ( 'null' )
            // InternalMyDsl.g:66:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:67:7: ( 'Sequence{' )
            // InternalMyDsl.g:67:9: 'Sequence{'
            {
            match("Sequence{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:68:7: ( 'OrderedSet{' )
            // InternalMyDsl.g:68:9: 'OrderedSet{'
            {
            match("OrderedSet{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:69:7: ( '::' )
            // InternalMyDsl.g:69:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:70:7: ( 'String' )
            // InternalMyDsl.g:70:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:71:7: ( 'Integer' )
            // InternalMyDsl.g:71:9: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:72:7: ( 'Real' )
            // InternalMyDsl.g:72:9: 'Real'
            {
            match("Real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:73:7: ( 'Boolean' )
            // InternalMyDsl.g:73:9: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:74:7: ( 'Sequence(' )
            // InternalMyDsl.g:74:9: 'Sequence('
            {
            match("Sequence("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:75:7: ( 'OrderedSet(' )
            // InternalMyDsl.g:75:9: 'OrderedSet('
            {
            match("OrderedSet("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "RULE_MULTOP"
    public final void mRULE_MULTOP() throws RecognitionException {
        try {
            int _type = RULE_MULTOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2480:13: ( ( '*' | '/' ) )
            // InternalMyDsl.g:2480:15: ( '*' | '/' )
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTOP"

    // $ANTLR start "RULE_REAL"
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2482:11: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // InternalMyDsl.g:2482:13: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // InternalMyDsl.g:2482:13: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:2482:14: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match('.'); 
            // InternalMyDsl.g:2482:29: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:2482:30: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL"

    // $ANTLR start "RULE_IDENT"
    public final void mRULE_IDENT() throws RecognitionException {
        try {
            int _type = RULE_IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2484:12: ( ( RULE_LETTER | '_' ) ( RULE_LETTER | '0' .. '9' | '_' )* )
            // InternalMyDsl.g:2484:14: ( RULE_LETTER | '_' ) ( RULE_LETTER | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:2484:32: ( RULE_LETTER | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // InternalMyDsl.g:2486:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalMyDsl.g:2486:24: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2488:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:2488:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:2488:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:2488:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:2488:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2490:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:2490:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:2490:12: ( '0' .. '9' )+
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
            	    // InternalMyDsl.g:2490:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2492:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:2492:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:2492:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:2492:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:2492:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:2492:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:2492:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2492:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:2492:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:2492:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:2492:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2494:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:2494:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:2494:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:2494:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2496:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:2496:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:2496:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:2496:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalMyDsl.g:2496:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:2496:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:2496:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMyDsl.g:2496:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2498:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:2498:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:2498:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2500:16: ( . )
            // InternalMyDsl.g:2500:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | RULE_MULTOP | RULE_REAL | RULE_IDENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=75;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalMyDsl.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // InternalMyDsl.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // InternalMyDsl.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // InternalMyDsl.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // InternalMyDsl.g:1:274: T__59
                {
                mT__59(); 

                }
                break;
            case 46 :
                // InternalMyDsl.g:1:280: T__60
                {
                mT__60(); 

                }
                break;
            case 47 :
                // InternalMyDsl.g:1:286: T__61
                {
                mT__61(); 

                }
                break;
            case 48 :
                // InternalMyDsl.g:1:292: T__62
                {
                mT__62(); 

                }
                break;
            case 49 :
                // InternalMyDsl.g:1:298: T__63
                {
                mT__63(); 

                }
                break;
            case 50 :
                // InternalMyDsl.g:1:304: T__64
                {
                mT__64(); 

                }
                break;
            case 51 :
                // InternalMyDsl.g:1:310: T__65
                {
                mT__65(); 

                }
                break;
            case 52 :
                // InternalMyDsl.g:1:316: T__66
                {
                mT__66(); 

                }
                break;
            case 53 :
                // InternalMyDsl.g:1:322: T__67
                {
                mT__67(); 

                }
                break;
            case 54 :
                // InternalMyDsl.g:1:328: T__68
                {
                mT__68(); 

                }
                break;
            case 55 :
                // InternalMyDsl.g:1:334: T__69
                {
                mT__69(); 

                }
                break;
            case 56 :
                // InternalMyDsl.g:1:340: T__70
                {
                mT__70(); 

                }
                break;
            case 57 :
                // InternalMyDsl.g:1:346: T__71
                {
                mT__71(); 

                }
                break;
            case 58 :
                // InternalMyDsl.g:1:352: T__72
                {
                mT__72(); 

                }
                break;
            case 59 :
                // InternalMyDsl.g:1:358: T__73
                {
                mT__73(); 

                }
                break;
            case 60 :
                // InternalMyDsl.g:1:364: T__74
                {
                mT__74(); 

                }
                break;
            case 61 :
                // InternalMyDsl.g:1:370: T__75
                {
                mT__75(); 

                }
                break;
            case 62 :
                // InternalMyDsl.g:1:376: T__76
                {
                mT__76(); 

                }
                break;
            case 63 :
                // InternalMyDsl.g:1:382: T__77
                {
                mT__77(); 

                }
                break;
            case 64 :
                // InternalMyDsl.g:1:388: T__78
                {
                mT__78(); 

                }
                break;
            case 65 :
                // InternalMyDsl.g:1:394: T__79
                {
                mT__79(); 

                }
                break;
            case 66 :
                // InternalMyDsl.g:1:400: RULE_MULTOP
                {
                mRULE_MULTOP(); 

                }
                break;
            case 67 :
                // InternalMyDsl.g:1:412: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 68 :
                // InternalMyDsl.g:1:422: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;
            case 69 :
                // InternalMyDsl.g:1:433: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 70 :
                // InternalMyDsl.g:1:441: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 71 :
                // InternalMyDsl.g:1:450: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 72 :
                // InternalMyDsl.g:1:462: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 73 :
                // InternalMyDsl.g:1:478: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 74 :
                // InternalMyDsl.g:1:494: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 75 :
                // InternalMyDsl.g:1:502: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\2\64\1\70\1\uffff\1\64\2\uffff\2\64\4\uffff\1\110\1\64\2\uffff\4\64\1\124\3\64\1\133\1\uffff\1\137\1\141\1\57\2\64\1\uffff\5\64\1\157\1\162\1\64\3\57\3\uffff\1\64\1\167\1\170\1\64\1\uffff\2\64\3\uffff\2\64\2\uffff\2\64\1\u0080\1\64\7\uffff\2\64\2\uffff\6\64\2\uffff\5\64\11\uffff\3\64\1\uffff\6\64\4\uffff\1\162\4\uffff\1\64\2\uffff\1\64\1\u009c\3\64\1\u00a0\1\64\1\uffff\1\u00a2\1\u00a4\5\64\1\u00aa\1\u00ab\1\u00ac\1\u00ad\3\64\1\u00b1\14\64\1\uffff\3\64\1\uffff\1\64\1\uffff\1\64\1\uffff\1\64\1\u00c4\3\64\4\uffff\1\u00c8\1\u00c9\1\u00ca\1\uffff\7\64\1\u00d2\4\64\1\u00d7\4\64\1\u00dc\1\uffff\1\u00dd\1\64\1\u00df\3\uffff\7\64\1\uffff\1\64\1\u00e8\2\64\1\uffff\3\64\1\u00ee\2\uffff\1\u00ef\1\uffff\1\u00f0\1\64\1\u00f2\1\64\1\u00f4\3\64\1\uffff\1\u00f8\1\64\1\u00fa\1\u00fb\1\64\3\uffff\1\64\1\uffff\1\64\1\uffff\1\64\1\u0100\1\u0101\1\uffff\1\u0102\2\uffff\1\u0103\1\u0104\2\64\7\uffff\2\64\2\uffff";
    static final String DFA15_eofS =
        "\u010b\uffff";
    static final String DFA15_minS =
        "\1\0\2\60\1\56\1\uffff\1\60\2\uffff\2\60\4\uffff\1\72\1\60\2\uffff\4\60\1\76\3\60\1\75\1\uffff\3\75\2\60\1\uffff\5\60\1\52\1\56\1\60\1\101\2\0\3\uffff\4\60\1\uffff\2\60\3\uffff\2\60\2\uffff\4\60\7\uffff\2\60\2\uffff\6\60\2\uffff\5\60\11\uffff\3\60\1\uffff\6\60\4\uffff\1\56\4\uffff\1\60\2\uffff\7\60\1\uffff\33\60\1\uffff\3\60\1\uffff\1\60\1\uffff\1\60\1\uffff\5\60\4\uffff\3\60\1\uffff\22\60\1\uffff\3\60\3\uffff\7\60\1\uffff\4\60\1\uffff\4\60\2\uffff\1\60\1\uffff\10\60\1\uffff\5\60\3\uffff\1\60\1\uffff\1\60\1\uffff\3\60\1\uffff\1\60\2\uffff\2\60\1\50\1\60\7\uffff\1\60\1\50\2\uffff";
    static final String DFA15_maxS =
        "\1\uffff\2\172\1\56\1\uffff\1\172\2\uffff\2\172\4\uffff\1\75\1\172\2\uffff\4\172\1\76\3\172\1\75\1\uffff\1\76\2\75\2\172\1\uffff\5\172\1\57\1\71\2\172\2\uffff\3\uffff\4\172\1\uffff\2\172\3\uffff\2\172\2\uffff\4\172\7\uffff\2\172\2\uffff\6\172\2\uffff\5\172\11\uffff\3\172\1\uffff\6\172\4\uffff\1\71\4\uffff\1\172\2\uffff\7\172\1\uffff\33\172\1\uffff\3\172\1\uffff\1\172\1\uffff\1\172\1\uffff\5\172\4\uffff\3\172\1\uffff\22\172\1\uffff\3\172\3\uffff\7\172\1\uffff\4\172\1\uffff\4\172\2\uffff\1\172\1\uffff\10\172\1\uffff\5\172\3\uffff\1\172\1\uffff\1\172\1\uffff\3\172\1\uffff\1\172\2\uffff\2\172\1\173\1\172\7\uffff\1\172\1\173\2\uffff";
    static final String DFA15_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\2\uffff\1\12\1\13\1\14\1\15\2\uffff\1\21\1\23\11\uffff\1\43\5\uffff\1\65\13\uffff\1\102\1\112\1\113\4\uffff\1\104\2\uffff\1\22\1\3\1\4\2\uffff\1\6\1\7\4\uffff\1\12\1\13\1\14\1\15\1\16\1\73\1\41\2\uffff\1\21\1\23\6\uffff\1\33\1\35\5\uffff\1\50\1\42\1\43\1\44\1\47\1\51\1\45\1\52\1\46\3\uffff\1\65\6\uffff\1\110\1\111\1\102\1\103\1\uffff\1\106\1\105\1\107\1\112\1\uffff\1\20\1\24\7\uffff\1\30\33\uffff\1\2\3\uffff\1\10\1\uffff\1\62\1\uffff\1\17\5\uffff\1\27\1\56\1\31\1\34\3\uffff\1\40\22\uffff\1\25\3\uffff\1\70\1\36\1\66\7\uffff\1\76\4\uffff\1\5\4\uffff\1\67\1\37\1\uffff\1\26\10\uffff\1\1\5\uffff\1\60\1\57\1\53\1\uffff\1\54\1\uffff\1\74\3\uffff\1\32\1\uffff\1\64\1\55\4\uffff\1\75\1\77\1\61\1\11\1\63\1\71\1\100\2\uffff\1\72\1\101";
    static final String DFA15_specialS =
        "\1\1\52\uffff\1\0\1\2\u00de\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\57\2\56\2\57\1\56\22\57\1\56\1\36\1\53\4\57\1\54\1\12\1\13\1\55\1\33\1\15\1\26\1\3\1\47\12\50\1\16\1\4\1\34\1\32\1\35\1\57\1\14\1\51\1\46\6\51\1\44\5\51\1\43\2\51\1\45\1\42\7\51\1\20\1\57\1\21\1\52\1\51\1\57\1\24\1\51\1\5\1\10\1\22\1\17\2\51\1\1\2\51\1\31\1\51\1\27\1\11\2\51\1\40\1\37\1\30\1\2\1\51\1\23\1\25\2\51\1\6\1\41\1\7\uff82\57",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\5\65\1\62\6\65\1\60\1\61\4\65\1\63\7\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\66\7\65",
            "\1\67",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\72\2\65\1\73\13\65",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\76\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\101\3\65\1\100\3\65\1\77\4\65",
            "",
            "",
            "",
            "",
            "\1\107\2\uffff\1\106",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\112\15\65\1\111\13\65",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\115\1\65\1\116\11\65\1\117\2\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\7\65\1\120\22\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\121\14\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\122\13\65",
            "\1\123",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\125\5\65\1\126\5\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\7\65\1\127\11\65\1\130\10\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\131\25\65",
            "\1\132",
            "",
            "\1\135\1\136",
            "\1\140",
            "\1\142",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\143\11\65\1\144\13\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\145\25\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\147\16\65\1\150\6\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\151\10\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\152\14\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\153\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\154\13\65",
            "\1\155\4\uffff\1\156",
            "\1\160\1\uffff\12\161",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\32\163\4\uffff\1\163\1\uffff\32\163",
            "\0\164",
            "\0\164",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\17\65\1\166\12\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\24\65\1\171\5\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\172\25\65",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\173\15\65\1\174\13\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\175\16\65",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\5\65\1\176\24\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\177\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0081\25\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u0082\10\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u0083\16\65",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u0084\7\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\3\65\1\u0085\26\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u0086\21\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u0087\21\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\3\65\1\u0088\24\65\1\u0089\1\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u008a\10\65",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u008b\6\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u008c\16\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u008d\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u008e\5\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u008f\6\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u0090\16\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u0091\10\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\11\65\1\u0092\20\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\20\65\1\u0093\11\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u0094\10\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\3\65\1\u0095\26\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u0096\6\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u0097\31\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u0098\13\65",
            "",
            "",
            "",
            "",
            "\1\160\1\uffff\12\161",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u009a\2\65\1\u0099\13\65",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u009b\14\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u009d\7\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u009e\7\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u009f\16\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u00a1\10\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\1\u00a3\31\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u00a5\7\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00a6\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00a7\21\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u00a8\7\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u00a9\16\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u00ae\16\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u00af\14\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00b0\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00b2\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00b3\6\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00b4\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u00b5\5\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00b6\21\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00b7\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00b8\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u00b9\16\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u00ba\16\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u00bb\10\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00bc\21\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00bd\21\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u00be\7\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u00bf\5\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00c0\25\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u00c1\10\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u00c2\16\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00c3\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\5\65\1\u00c5\24\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00c6\6\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00c7\25\65",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u00cb\27\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00cc\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u00cd\27\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00ce\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u00cf\14\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u00d0\10\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\6\65\1\u00d1\23\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00d3\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00d4\6\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00d5\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\20\65\1\u00d6\11\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u00d8\10\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u00d9\27\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00da\21\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u00db\16\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u00de\7\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00e0\6\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\3\65\1\u00e1\26\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00e2\6\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u00e3\14\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\6\65\1\u00e4\23\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00e5\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00e6\25\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u00e7\31\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u00e9\7\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u00ea\5\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00eb\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00ec\6\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\3\65\1\u00ed\26\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\1\65\1\u00f1\30\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u00f3\27\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\3\65\1\u00f5\26\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u00f6\10\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u00f7\14\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00f9\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00fc\25\65",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\30\65\1\u00fd\1\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00fe\25\65",
            "",
            "\12\65\7\uffff\22\65\1\u00ff\7\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0106\7\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65\1\u0105",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0107\25\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u0108\6\65",
            "\1\u010a\7\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65\1\u0109",
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
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | RULE_MULTOP | RULE_REAL | RULE_IDENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_43 = input.LA(1);

                        s = -1;
                        if ( ((LA15_43>='\u0000' && LA15_43<='\uFFFF')) ) {s = 116;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='i') ) {s = 1;}

                        else if ( (LA15_0=='u') ) {s = 2;}

                        else if ( (LA15_0=='.') ) {s = 3;}

                        else if ( (LA15_0==';') ) {s = 4;}

                        else if ( (LA15_0=='c') ) {s = 5;}

                        else if ( (LA15_0=='{') ) {s = 6;}

                        else if ( (LA15_0=='}') ) {s = 7;}

                        else if ( (LA15_0=='d') ) {s = 8;}

                        else if ( (LA15_0=='o') ) {s = 9;}

                        else if ( (LA15_0=='(') ) {s = 10;}

                        else if ( (LA15_0==')') ) {s = 11;}

                        else if ( (LA15_0=='@') ) {s = 12;}

                        else if ( (LA15_0==',') ) {s = 13;}

                        else if ( (LA15_0==':') ) {s = 14;}

                        else if ( (LA15_0=='f') ) {s = 15;}

                        else if ( (LA15_0=='[') ) {s = 16;}

                        else if ( (LA15_0==']') ) {s = 17;}

                        else if ( (LA15_0=='e') ) {s = 18;}

                        else if ( (LA15_0=='w') ) {s = 19;}

                        else if ( (LA15_0=='a') ) {s = 20;}

                        else if ( (LA15_0=='x') ) {s = 21;}

                        else if ( (LA15_0=='-') ) {s = 22;}

                        else if ( (LA15_0=='n') ) {s = 23;}

                        else if ( (LA15_0=='t') ) {s = 24;}

                        else if ( (LA15_0=='l') ) {s = 25;}

                        else if ( (LA15_0=='=') ) {s = 26;}

                        else if ( (LA15_0=='+') ) {s = 27;}

                        else if ( (LA15_0=='<') ) {s = 28;}

                        else if ( (LA15_0=='>') ) {s = 29;}

                        else if ( (LA15_0=='!') ) {s = 30;}

                        else if ( (LA15_0=='s') ) {s = 31;}

                        else if ( (LA15_0=='r') ) {s = 32;}

                        else if ( (LA15_0=='|') ) {s = 33;}

                        else if ( (LA15_0=='S') ) {s = 34;}

                        else if ( (LA15_0=='O') ) {s = 35;}

                        else if ( (LA15_0=='I') ) {s = 36;}

                        else if ( (LA15_0=='R') ) {s = 37;}

                        else if ( (LA15_0=='B') ) {s = 38;}

                        else if ( (LA15_0=='/') ) {s = 39;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 40;}

                        else if ( (LA15_0=='A'||(LA15_0>='C' && LA15_0<='H')||(LA15_0>='J' && LA15_0<='N')||(LA15_0>='P' && LA15_0<='Q')||(LA15_0>='T' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='b'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='k')||LA15_0=='m'||(LA15_0>='p' && LA15_0<='q')||LA15_0=='v'||(LA15_0>='y' && LA15_0<='z')) ) {s = 41;}

                        else if ( (LA15_0=='^') ) {s = 42;}

                        else if ( (LA15_0=='\"') ) {s = 43;}

                        else if ( (LA15_0=='\'') ) {s = 44;}

                        else if ( (LA15_0=='*') ) {s = 45;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 46;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='#' && LA15_0<='&')||LA15_0=='?'||LA15_0=='\\'||LA15_0=='`'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_44 = input.LA(1);

                        s = -1;
                        if ( ((LA15_44>='\u0000' && LA15_44<='\uFFFF')) ) {s = 116;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}