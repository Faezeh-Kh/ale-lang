package org.eclipse.ecoretools.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAleLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__59=59;
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
    public static final int RULE_ID=12;
    public static final int RULE_REAL=10;
    public static final int RULE_IDENT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=13;
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
    public static final int RULE_MULT_OP=6;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_COMP_OP=8;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int RULE_ADD_OP=7;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_LETTER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalAleLexer() {;} 
    public InternalAleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAleLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAle.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:11:7: ( 'behavior' )
            // InternalAle.g:11:9: 'behavior'
            {
            match("behavior"); 


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
            // InternalAle.g:12:7: ( ';' )
            // InternalAle.g:12:9: ';'
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
            // InternalAle.g:13:7: ( 'import' )
            // InternalAle.g:13:9: 'import'
            {
            match("import"); 


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
            // InternalAle.g:14:7: ( 'as' )
            // InternalAle.g:14:9: 'as'
            {
            match("as"); 


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
            // InternalAle.g:15:7: ( 'use' )
            // InternalAle.g:15:9: 'use'
            {
            match("use"); 


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
            // InternalAle.g:16:7: ( '.' )
            // InternalAle.g:16:9: '.'
            {
            match('.'); 

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
            // InternalAle.g:17:7: ( 'open' )
            // InternalAle.g:17:9: 'open'
            {
            match("open"); 


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
            // InternalAle.g:18:7: ( 'class' )
            // InternalAle.g:18:9: 'class'
            {
            match("class"); 


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
            // InternalAle.g:19:7: ( 'extends' )
            // InternalAle.g:19:9: 'extends'
            {
            match("extends"); 


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
            // InternalAle.g:20:7: ( ',' )
            // InternalAle.g:20:9: ','
            {
            match(','); 

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
            // InternalAle.g:21:7: ( '{' )
            // InternalAle.g:21:9: '{'
            {
            match('{'); 

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
            // InternalAle.g:22:7: ( '}' )
            // InternalAle.g:22:9: '}'
            {
            match('}'); 

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
            // InternalAle.g:23:7: ( 'def' )
            // InternalAle.g:23:9: 'def'
            {
            match("def"); 


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
            // InternalAle.g:24:7: ( 'override' )
            // InternalAle.g:24:9: 'override'
            {
            match("override"); 


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
            // InternalAle.g:25:7: ( '(' )
            // InternalAle.g:25:9: '('
            {
            match('('); 

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
            // InternalAle.g:26:7: ( ')' )
            // InternalAle.g:26:9: ')'
            {
            match(')'); 

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
            // InternalAle.g:27:7: ( '@' )
            // InternalAle.g:27:9: '@'
            {
            match('@'); 

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
            // InternalAle.g:28:7: ( ':=' )
            // InternalAle.g:28:9: ':='
            {
            match(":="); 


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
            // InternalAle.g:29:7: ( 'for' )
            // InternalAle.g:29:9: 'for'
            {
            match("for"); 


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
            // InternalAle.g:30:7: ( 'in' )
            // InternalAle.g:30:9: 'in'
            {
            match("in"); 


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
            // InternalAle.g:31:7: ( '[' )
            // InternalAle.g:31:9: '['
            {
            match('['); 

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
            // InternalAle.g:32:7: ( '..' )
            // InternalAle.g:32:9: '..'
            {
            match(".."); 


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
            // InternalAle.g:33:7: ( ']' )
            // InternalAle.g:33:9: ']'
            {
            match(']'); 

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
            // InternalAle.g:34:7: ( 'if' )
            // InternalAle.g:34:9: 'if'
            {
            match("if"); 


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
            // InternalAle.g:35:7: ( 'else' )
            // InternalAle.g:35:9: 'else'
            {
            match("else"); 


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
            // InternalAle.g:36:7: ( 'while' )
            // InternalAle.g:36:9: 'while'
            {
            match("while"); 


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
            // InternalAle.g:37:7: ( 'and' )
            // InternalAle.g:37:9: 'and'
            {
            match("and"); 


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
            // InternalAle.g:38:7: ( 'or' )
            // InternalAle.g:38:9: 'or'
            {
            match("or"); 


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
            // InternalAle.g:39:7: ( 'xor' )
            // InternalAle.g:39:9: 'xor'
            {
            match("xor"); 


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
            // InternalAle.g:40:7: ( 'implies' )
            // InternalAle.g:40:9: 'implies'
            {
            match("implies"); 


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
            // InternalAle.g:41:7: ( '->' )
            // InternalAle.g:41:9: '->'
            {
            match("->"); 


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
            // InternalAle.g:42:7: ( 'not' )
            // InternalAle.g:42:9: 'not'
            {
            match("not"); 


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
            // InternalAle.g:43:7: ( '-' )
            // InternalAle.g:43:9: '-'
            {
            match('-'); 

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
            // InternalAle.g:44:7: ( 'then' )
            // InternalAle.g:44:9: 'then'
            {
            match("then"); 


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
            // InternalAle.g:45:7: ( 'endif' )
            // InternalAle.g:45:9: 'endif'
            {
            match("endif"); 


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
            // InternalAle.g:46:7: ( 'let' )
            // InternalAle.g:46:9: 'let'
            {
            match("let"); 


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
            // InternalAle.g:47:7: ( ':' )
            // InternalAle.g:47:9: ':'
            {
            match(':'); 

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
            // InternalAle.g:48:7: ( '=' )
            // InternalAle.g:48:9: '='
            {
            match('='); 

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
            // InternalAle.g:49:7: ( 'select' )
            // InternalAle.g:49:9: 'select'
            {
            match("select"); 


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
            // InternalAle.g:50:7: ( 'reject' )
            // InternalAle.g:50:9: 'reject'
            {
            match("reject"); 


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
            // InternalAle.g:51:7: ( 'collect' )
            // InternalAle.g:51:9: 'collect'
            {
            match("collect"); 


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
            // InternalAle.g:52:7: ( 'any' )
            // InternalAle.g:52:9: 'any'
            {
            match("any"); 


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
            // InternalAle.g:53:7: ( 'exists' )
            // InternalAle.g:53:9: 'exists'
            {
            match("exists"); 


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
            // InternalAle.g:54:7: ( 'forAll' )
            // InternalAle.g:54:9: 'forAll'
            {
            match("forAll"); 


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
            // InternalAle.g:55:7: ( 'isUnique' )
            // InternalAle.g:55:9: 'isUnique'
            {
            match("isUnique"); 


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
            // InternalAle.g:56:7: ( 'one' )
            // InternalAle.g:56:9: 'one'
            {
            match("one"); 


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
            // InternalAle.g:57:7: ( 'sortedBy' )
            // InternalAle.g:57:9: 'sortedBy'
            {
            match("sortedBy"); 


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
            // InternalAle.g:58:7: ( 'closure' )
            // InternalAle.g:58:9: 'closure'
            {
            match("closure"); 


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
            // InternalAle.g:59:7: ( '|' )
            // InternalAle.g:59:9: '|'
            {
            match('|'); 

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
            // InternalAle.g:60:7: ( 'true' )
            // InternalAle.g:60:9: 'true'
            {
            match("true"); 


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
            // InternalAle.g:61:7: ( 'false' )
            // InternalAle.g:61:9: 'false'
            {
            match("false"); 


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
            // InternalAle.g:62:7: ( 'null' )
            // InternalAle.g:62:9: 'null'
            {
            match("null"); 


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
            // InternalAle.g:63:7: ( 'Sequence{' )
            // InternalAle.g:63:9: 'Sequence{'
            {
            match("Sequence{"); 


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
            // InternalAle.g:64:7: ( 'OrderedSet{' )
            // InternalAle.g:64:9: 'OrderedSet{'
            {
            match("OrderedSet{"); 


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
            // InternalAle.g:65:7: ( '::' )
            // InternalAle.g:65:9: '::'
            {
            match("::"); 


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
            // InternalAle.g:66:7: ( 'String' )
            // InternalAle.g:66:9: 'String'
            {
            match("String"); 


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
            // InternalAle.g:67:7: ( 'Integer' )
            // InternalAle.g:67:9: 'Integer'
            {
            match("Integer"); 


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
            // InternalAle.g:68:7: ( 'Real' )
            // InternalAle.g:68:9: 'Real'
            {
            match("Real"); 


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
            // InternalAle.g:69:7: ( 'Boolean' )
            // InternalAle.g:69:9: 'Boolean'
            {
            match("Boolean"); 


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
            // InternalAle.g:70:7: ( 'Sequence(' )
            // InternalAle.g:70:9: 'Sequence('
            {
            match("Sequence("); 


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
            // InternalAle.g:71:7: ( 'OrderedSet(' )
            // InternalAle.g:71:9: 'OrderedSet('
            {
            match("OrderedSet("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "RULE_ADD_OP"
    public final void mRULE_ADD_OP() throws RecognitionException {
        try {
            int _type = RULE_ADD_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:3247:13: ( ( '+' | '-' ) )
            // InternalAle.g:3247:15: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
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
    // $ANTLR end "RULE_ADD_OP"

    // $ANTLR start "RULE_COMP_OP"
    public final void mRULE_COMP_OP() throws RecognitionException {
        try {
            int _type = RULE_COMP_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:3249:14: ( ( '<=' | '>=' | '!=' | '<>' | '=' | '==' | '<' | '>' ) )
            // InternalAle.g:3249:16: ( '<=' | '>=' | '!=' | '<>' | '=' | '==' | '<' | '>' )
            {
            // InternalAle.g:3249:16: ( '<=' | '>=' | '!=' | '<>' | '=' | '==' | '<' | '>' )
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalAle.g:3249:17: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 2 :
                    // InternalAle.g:3249:22: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 3 :
                    // InternalAle.g:3249:27: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 4 :
                    // InternalAle.g:3249:32: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 5 :
                    // InternalAle.g:3249:37: '='
                    {
                    match('='); 

                    }
                    break;
                case 6 :
                    // InternalAle.g:3249:41: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 7 :
                    // InternalAle.g:3249:46: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 8 :
                    // InternalAle.g:3249:50: '>'
                    {
                    match('>'); 

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
    // $ANTLR end "RULE_COMP_OP"

    // $ANTLR start "RULE_MULT_OP"
    public final void mRULE_MULT_OP() throws RecognitionException {
        try {
            int _type = RULE_MULT_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:3251:14: ( ( '*' | '/' ) )
            // InternalAle.g:3251:16: ( '*' | '/' )
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
    // $ANTLR end "RULE_MULT_OP"

    // $ANTLR start "RULE_REAL"
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAle.g:3253:11: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // InternalAle.g:3253:13: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // InternalAle.g:3253:13: ( '0' .. '9' )+
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
            	    // InternalAle.g:3253:14: '0' .. '9'
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

            match('.'); 
            // InternalAle.g:3253:29: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAle.g:3253:30: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // InternalAle.g:3255:12: ( ( RULE_LETTER | '_' ) ( RULE_LETTER | '0' .. '9' | '_' )* )
            // InternalAle.g:3255:14: ( RULE_LETTER | '_' ) ( RULE_LETTER | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAle.g:3255:32: ( RULE_LETTER | '0' .. '9' | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAle.g:
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
            	    break loop4;
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
            // InternalAle.g:3257:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalAle.g:3257:24: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // InternalAle.g:3259:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAle.g:3259:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAle.g:3259:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAle.g:3259:11: '^'
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

            // InternalAle.g:3259:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAle.g:
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
            	    break loop6;
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
            // InternalAle.g:3261:10: ( ( '0' .. '9' )+ )
            // InternalAle.g:3261:12: ( '0' .. '9' )+
            {
            // InternalAle.g:3261:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAle.g:3261:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // InternalAle.g:3263:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAle.g:3263:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAle.g:3263:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAle.g:3263:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAle.g:3263:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalAle.g:3263:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAle.g:3263:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalAle.g:3263:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAle.g:3263:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalAle.g:3263:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAle.g:3263:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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
            // InternalAle.g:3265:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAle.g:3265:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAle.g:3265:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAle.g:3265:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // InternalAle.g:3267:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAle.g:3267:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAle.g:3267:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAle.g:3267:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // InternalAle.g:3267:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAle.g:3267:41: ( '\\r' )? '\\n'
                    {
                    // InternalAle.g:3267:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalAle.g:3267:41: '\\r'
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
            // InternalAle.g:3269:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAle.g:3269:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAle.g:3269:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAle.g:
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // InternalAle.g:3271:16: ( . )
            // InternalAle.g:3271:18: .
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
        // InternalAle.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | RULE_ADD_OP | RULE_COMP_OP | RULE_MULT_OP | RULE_REAL | RULE_IDENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=73;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalAle.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalAle.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalAle.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalAle.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalAle.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalAle.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalAle.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalAle.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalAle.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalAle.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalAle.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalAle.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalAle.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalAle.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalAle.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalAle.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalAle.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalAle.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalAle.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalAle.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalAle.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalAle.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalAle.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalAle.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalAle.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalAle.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalAle.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalAle.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalAle.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalAle.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalAle.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalAle.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalAle.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalAle.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalAle.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalAle.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalAle.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalAle.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalAle.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalAle.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalAle.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // InternalAle.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // InternalAle.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // InternalAle.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // InternalAle.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // InternalAle.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // InternalAle.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // InternalAle.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // InternalAle.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // InternalAle.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // InternalAle.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // InternalAle.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // InternalAle.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // InternalAle.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // InternalAle.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // InternalAle.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // InternalAle.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // InternalAle.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // InternalAle.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // InternalAle.g:1:364: T__76
                {
                mT__76(); 

                }
                break;
            case 61 :
                // InternalAle.g:1:370: T__77
                {
                mT__77(); 

                }
                break;
            case 62 :
                // InternalAle.g:1:376: RULE_ADD_OP
                {
                mRULE_ADD_OP(); 

                }
                break;
            case 63 :
                // InternalAle.g:1:388: RULE_COMP_OP
                {
                mRULE_COMP_OP(); 

                }
                break;
            case 64 :
                // InternalAle.g:1:401: RULE_MULT_OP
                {
                mRULE_MULT_OP(); 

                }
                break;
            case 65 :
                // InternalAle.g:1:414: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 66 :
                // InternalAle.g:1:424: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;
            case 67 :
                // InternalAle.g:1:435: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 68 :
                // InternalAle.g:1:443: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 69 :
                // InternalAle.g:1:452: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 70 :
                // InternalAle.g:1:464: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 71 :
                // InternalAle.g:1:480: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 72 :
                // InternalAle.g:1:496: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 73 :
                // InternalAle.g:1:504: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA1_eotS =
        "\1\uffff\1\7\1\11\1\uffff\1\13\7\uffff";
    static final String DFA1_eofS =
        "\14\uffff";
    static final String DFA1_minS =
        "\1\41\2\75\1\uffff\1\75\7\uffff";
    static final String DFA1_maxS =
        "\2\76\1\75\1\uffff\1\75\7\uffff";
    static final String DFA1_acceptS =
        "\3\uffff\1\3\1\uffff\1\1\1\4\1\7\1\2\1\10\1\6\1\5";
    static final String DFA1_specialS =
        "\14\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\32\uffff\1\1\1\4\1\2",
            "\1\5\1\6",
            "\1\10",
            "",
            "\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "3249:16: ( '<=' | '>=' | '!=' | '<>' | '=' | '==' | '<' | '>' )";
        }
    }
    static final String DFA16_eotS =
        "\1\uffff\1\63\1\uffff\3\63\1\75\3\63\3\uffff\1\63\3\uffff\1\120\1\63\2\uffff\2\63\1\130\3\63\1\137\2\63\1\uffff\5\63\3\uffff\1\60\1\155\1\156\1\63\3\60\3\uffff\2\63\2\uffff\1\63\1\166\1\167\1\63\1\171\2\63\2\uffff\2\63\1\177\6\63\3\uffff\1\63\6\uffff\2\63\2\uffff\2\63\2\uffff\5\63\2\uffff\3\63\1\uffff\6\63\5\uffff\1\156\4\uffff\2\63\2\uffff\1\63\1\uffff\1\u009f\1\u00a0\1\u00a1\2\63\1\uffff\1\u00a4\7\63\1\u00ac\1\u00ae\2\63\1\u00b1\1\u00b2\3\63\1\u00b6\15\63\3\uffff\1\u00c4\1\63\1\uffff\5\63\1\u00cb\1\63\1\uffff\1\63\1\uffff\2\63\2\uffff\1\u00d0\1\u00d1\1\u00d2\1\uffff\7\63\1\u00da\5\63\1\uffff\1\63\1\u00e1\4\63\1\uffff\1\u00e6\1\63\1\u00e8\1\u00e9\3\uffff\7\63\1\uffff\2\63\1\u00f3\3\63\1\uffff\3\63\1\u00fa\1\uffff\1\u00fb\2\uffff\1\u00fc\1\63\1\u00fe\1\63\1\u0100\4\63\1\uffff\1\u0105\2\63\1\u0108\1\u0109\1\u010a\3\uffff\1\63\1\uffff\1\63\1\uffff\1\63\1\u010e\1\u010f\1\u0110\1\uffff\1\u0111\1\u0112\3\uffff\1\u0113\2\63\10\uffff\2\63\2\uffff";
    static final String DFA16_eofS =
        "\u011a\uffff";
    static final String DFA16_minS =
        "\1\0\1\60\1\uffff\3\60\1\56\3\60\3\uffff\1\60\3\uffff\1\72\1\60\2\uffff\2\60\1\76\3\60\1\75\2\60\1\uffff\5\60\3\uffff\1\75\1\52\1\56\1\60\1\101\2\0\3\uffff\2\60\2\uffff\7\60\2\uffff\11\60\3\uffff\1\60\6\uffff\2\60\2\uffff\2\60\2\uffff\5\60\2\uffff\3\60\1\uffff\6\60\5\uffff\1\56\4\uffff\2\60\2\uffff\1\60\1\uffff\5\60\1\uffff\37\60\3\uffff\2\60\1\uffff\7\60\1\uffff\1\60\1\uffff\2\60\2\uffff\3\60\1\uffff\15\60\1\uffff\6\60\1\uffff\4\60\3\uffff\7\60\1\uffff\6\60\1\uffff\4\60\1\uffff\1\60\2\uffff\11\60\1\uffff\6\60\3\uffff\1\60\1\uffff\1\60\1\uffff\4\60\1\uffff\2\60\3\uffff\1\60\1\50\1\60\10\uffff\1\60\1\50\2\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\172\1\uffff\3\172\1\56\3\172\3\uffff\1\172\3\uffff\1\75\1\172\2\uffff\2\172\1\76\3\172\1\75\2\172\1\uffff\5\172\3\uffff\1\75\1\57\1\71\2\172\2\uffff\3\uffff\2\172\2\uffff\7\172\2\uffff\11\172\3\uffff\1\172\6\uffff\2\172\2\uffff\2\172\2\uffff\5\172\2\uffff\3\172\1\uffff\6\172\5\uffff\1\71\4\uffff\2\172\2\uffff\1\172\1\uffff\5\172\1\uffff\37\172\3\uffff\2\172\1\uffff\7\172\1\uffff\1\172\1\uffff\2\172\2\uffff\3\172\1\uffff\15\172\1\uffff\6\172\1\uffff\4\172\3\uffff\7\172\1\uffff\6\172\1\uffff\4\172\1\uffff\1\172\2\uffff\11\172\1\uffff\6\172\3\uffff\1\172\1\uffff\1\172\1\uffff\4\172\1\uffff\2\172\3\uffff\1\172\1\173\1\172\10\uffff\1\172\1\173\2\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\7\uffff\1\12\1\13\1\14\1\uffff\1\17\1\20\1\21\2\uffff\1\25\1\27\11\uffff\1\61\5\uffff\1\76\2\77\7\uffff\1\100\1\110\1\111\2\uffff\1\102\1\2\7\uffff\1\26\1\6\11\uffff\1\12\1\13\1\14\1\uffff\1\17\1\20\1\21\1\22\1\67\1\45\2\uffff\1\25\1\27\2\uffff\1\37\1\41\5\uffff\1\77\1\46\3\uffff\1\61\6\uffff\1\76\1\106\1\107\1\100\1\104\1\uffff\1\101\1\103\1\105\1\110\2\uffff\1\24\1\30\1\uffff\1\4\5\uffff\1\34\37\uffff\1\33\1\52\1\5\2\uffff\1\56\7\uffff\1\15\1\uffff\1\23\2\uffff\1\35\1\40\3\uffff\1\44\15\uffff\1\7\6\uffff\1\31\4\uffff\1\64\1\42\1\62\7\uffff\1\72\6\uffff\1\10\4\uffff\1\43\1\uffff\1\63\1\32\11\uffff\1\3\6\uffff\1\53\1\54\1\47\1\uffff\1\50\1\uffff\1\70\4\uffff\1\36\2\uffff\1\60\1\51\1\11\3\uffff\1\71\1\73\1\1\1\55\1\16\1\57\1\65\1\74\2\uffff\1\66\1\75";
    static final String DFA16_specialS =
        "\1\1\53\uffff\1\2\1\0\u00ec\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\60\2\57\2\60\1\57\22\60\1\57\1\47\1\54\4\60\1\55\1\16\1\17\1\56\1\44\1\12\1\27\1\6\1\50\12\51\1\21\1\2\1\45\1\33\1\46\1\60\1\20\1\52\1\43\6\52\1\41\5\52\1\40\2\52\1\42\1\37\7\52\1\23\1\60\1\24\1\53\1\52\1\60\1\4\1\1\1\10\1\15\1\11\1\22\2\52\1\3\2\52\1\32\1\52\1\30\1\7\2\52\1\35\1\34\1\31\1\5\1\52\1\25\1\26\2\52\1\13\1\36\1\14\uff82\60",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\61\25\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\67\6\62\1\65\1\66\4\62\1\70\7\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\72\4\62\1\71\7\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\73\7\62",
            "\1\74",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\101\1\62\1\76\1\62\1\100\3\62\1\77\4\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\102\2\62\1\103\13\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\105\1\62\1\106\11\62\1\104\2\62",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\112\25\62",
            "",
            "",
            "",
            "\1\117\2\uffff\1\116",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\122\15\62\1\121\13\62",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\125\22\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\126\13\62",
            "\1\127",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\131\5\62\1\132\5\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\133\11\62\1\134\10\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\135\25\62",
            "\1\136",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\140\11\62\1\141\13\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\142\25\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\144\16\62\1\145\6\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\146\10\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\147\14\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\150\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\151\13\62",
            "",
            "",
            "",
            "\1\136",
            "\1\153\4\uffff\1\154",
            "\1\160\1\uffff\12\157",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\32\161\4\uffff\1\161\1\uffff\32\161",
            "\0\162",
            "\0\162",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\164\22\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\165\12\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\24\62\1\170\5\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\172\24\62\1\173\1\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\174\25\62",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\175\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\176\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0080\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u0081\15\62\1\u0082\13\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u0083\16\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0085\12\62\1\u0084\6\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u0086\7\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u0087\26\62",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\u0088\24\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0089\10\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u008a\16\62",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u008b\21\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u008c\10\62",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u008d\6\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u008e\16\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u008f\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u0090\5\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0091\6\62",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u0092\16\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0093\10\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\11\62\1\u0094\20\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\20\62\1\u0095\11\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0096\10\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u0097\26\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0098\6\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u0099\31\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u009a\13\62",
            "",
            "",
            "",
            "",
            "",
            "\1\160\1\uffff\12\157",
            "",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u009b\31\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u009d\2\62\1\u009c\13\62",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u009e\14\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00a2\14\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00a3\10\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00a5\7\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00a6\7\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00a7\16\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00a8\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00a9\7\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00aa\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00ab\21\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\1\u00ad\31\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00af\7\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00b0\16\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00b3\16\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00b4\14\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00b5\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00b7\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00b8\6\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00b9\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u00ba\5\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00bb\21\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00bc\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00bd\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00be\16\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00bf\16\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\25\62\1\u00c0\4\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00c1\10\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00c2\21\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00c3\21\62",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00c5\10\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00c6\7\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u00c7\5\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00c8\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00c9\14\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00ca\6\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\u00cc\24\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00cd\16\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00ce\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00cf\25\62",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u00d3\27\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00d4\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u00d5\27\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00d6\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00d7\14\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00d8\10\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u00d9\23\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00db\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00dc\21\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00dd\6\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00de\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\20\62\1\u00df\11\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00e0\21\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00e2\10\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u00e3\27\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u00e4\26\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00e5\7\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00e7\16\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00ea\6\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u00eb\26\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00ec\6\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00ed\14\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u00ee\23\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00ef\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00f0\25\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u00f1\31\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u00f2\13\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00f4\7\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u00f5\5\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u00f6\26\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00f7\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00f8\6\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00f9\7\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\1\62\1\u00fd\30\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u00ff\27\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u0101\26\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0102\10\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0103\14\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0104\10\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0106\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0107\25\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\30\62\1\u010b\1\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u010c\25\62",
            "",
            "\12\62\7\uffff\22\62\1\u010d\7\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0115\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62\1\u0114",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0116\25\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0117\6\62",
            "\1\u0119\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62\1\u0118",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | RULE_ADD_OP | RULE_COMP_OP | RULE_MULT_OP | RULE_REAL | RULE_IDENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_45 = input.LA(1);

                        s = -1;
                        if ( ((LA16_45>='\u0000' && LA16_45<='\uFFFF')) ) {s = 114;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='b') ) {s = 1;}

                        else if ( (LA16_0==';') ) {s = 2;}

                        else if ( (LA16_0=='i') ) {s = 3;}

                        else if ( (LA16_0=='a') ) {s = 4;}

                        else if ( (LA16_0=='u') ) {s = 5;}

                        else if ( (LA16_0=='.') ) {s = 6;}

                        else if ( (LA16_0=='o') ) {s = 7;}

                        else if ( (LA16_0=='c') ) {s = 8;}

                        else if ( (LA16_0=='e') ) {s = 9;}

                        else if ( (LA16_0==',') ) {s = 10;}

                        else if ( (LA16_0=='{') ) {s = 11;}

                        else if ( (LA16_0=='}') ) {s = 12;}

                        else if ( (LA16_0=='d') ) {s = 13;}

                        else if ( (LA16_0=='(') ) {s = 14;}

                        else if ( (LA16_0==')') ) {s = 15;}

                        else if ( (LA16_0=='@') ) {s = 16;}

                        else if ( (LA16_0==':') ) {s = 17;}

                        else if ( (LA16_0=='f') ) {s = 18;}

                        else if ( (LA16_0=='[') ) {s = 19;}

                        else if ( (LA16_0==']') ) {s = 20;}

                        else if ( (LA16_0=='w') ) {s = 21;}

                        else if ( (LA16_0=='x') ) {s = 22;}

                        else if ( (LA16_0=='-') ) {s = 23;}

                        else if ( (LA16_0=='n') ) {s = 24;}

                        else if ( (LA16_0=='t') ) {s = 25;}

                        else if ( (LA16_0=='l') ) {s = 26;}

                        else if ( (LA16_0=='=') ) {s = 27;}

                        else if ( (LA16_0=='s') ) {s = 28;}

                        else if ( (LA16_0=='r') ) {s = 29;}

                        else if ( (LA16_0=='|') ) {s = 30;}

                        else if ( (LA16_0=='S') ) {s = 31;}

                        else if ( (LA16_0=='O') ) {s = 32;}

                        else if ( (LA16_0=='I') ) {s = 33;}

                        else if ( (LA16_0=='R') ) {s = 34;}

                        else if ( (LA16_0=='B') ) {s = 35;}

                        else if ( (LA16_0=='+') ) {s = 36;}

                        else if ( (LA16_0=='<') ) {s = 37;}

                        else if ( (LA16_0=='>') ) {s = 38;}

                        else if ( (LA16_0=='!') ) {s = 39;}

                        else if ( (LA16_0=='/') ) {s = 40;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 41;}

                        else if ( (LA16_0=='A'||(LA16_0>='C' && LA16_0<='H')||(LA16_0>='J' && LA16_0<='N')||(LA16_0>='P' && LA16_0<='Q')||(LA16_0>='T' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='g' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='k')||LA16_0=='m'||(LA16_0>='p' && LA16_0<='q')||LA16_0=='v'||(LA16_0>='y' && LA16_0<='z')) ) {s = 42;}

                        else if ( (LA16_0=='^') ) {s = 43;}

                        else if ( (LA16_0=='\"') ) {s = 44;}

                        else if ( (LA16_0=='\'') ) {s = 45;}

                        else if ( (LA16_0=='*') ) {s = 46;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 47;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||(LA16_0>='#' && LA16_0<='&')||LA16_0=='?'||LA16_0=='\\'||LA16_0=='`'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_44 = input.LA(1);

                        s = -1;
                        if ( ((LA16_44>='\u0000' && LA16_44<='\uFFFF')) ) {s = 114;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}