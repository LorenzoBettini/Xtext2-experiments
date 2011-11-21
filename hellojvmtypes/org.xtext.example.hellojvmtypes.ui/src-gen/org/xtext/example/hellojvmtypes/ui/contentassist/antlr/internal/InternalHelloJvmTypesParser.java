package org.xtext.example.hellojvmtypes.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.hellojvmtypes.services.HelloJvmTypesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHelloJvmTypesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalHelloJvmTypesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHelloJvmTypesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHelloJvmTypesParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g"; }


     
     	private HelloJvmTypesGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(HelloJvmTypesGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:69:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:73:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:75:1: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:76:1: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:76:2: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:88:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:89:1: ( ruleGreeting EOF )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:90:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting122);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:97:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:101:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:102:1: ( ( rule__Greeting__Group__0 ) )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:102:1: ( ( rule__Greeting__Group__0 ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:103:1: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:104:1: ( rule__Greeting__Group__0 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:104:2: rule__Greeting__Group__0
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0_in_ruleGreeting155);
            rule__Greeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "rule__Greeting__Group__0"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:118:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:122:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:123:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0189);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0192);
            rule__Greeting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__0"


    // $ANTLR start "rule__Greeting__Group__0__Impl"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:130:1: rule__Greeting__Group__0__Impl : ( 'Hello' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:134:1: ( ( 'Hello' ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:135:1: ( 'Hello' )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:135:1: ( 'Hello' )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:136:1: 'Hello'
            {
             before(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Greeting__Group__0__Impl220); 
             after(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__0__Impl"


    // $ANTLR start "rule__Greeting__Group__1"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:149:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:153:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:154:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
            {
            pushFollow(FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__1251);
            rule__Greeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__2_in_rule__Greeting__Group__1254);
            rule__Greeting__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__1"


    // $ANTLR start "rule__Greeting__Group__1__Impl"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:161:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:165:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:166:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:166:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:167:1: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:168:1: ( rule__Greeting__NameAssignment_1 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:168:2: rule__Greeting__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl281);
            rule__Greeting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__1__Impl"


    // $ANTLR start "rule__Greeting__Group__2"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:178:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:182:1: ( rule__Greeting__Group__2__Impl )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:183:2: rule__Greeting__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group__2__Impl_in_rule__Greeting__Group__2311);
            rule__Greeting__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__2"


    // $ANTLR start "rule__Greeting__Group__2__Impl"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:189:1: rule__Greeting__Group__2__Impl : ( '!' ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:193:1: ( ( '!' ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:194:1: ( '!' )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:194:1: ( '!' )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:195:1: '!'
            {
             before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Greeting__Group__2__Impl339); 
             after(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__2__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:215:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:219:1: ( ( ruleGreeting ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:220:1: ( ruleGreeting )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:220:1: ( ruleGreeting )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:221:1: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment381);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__Greeting__NameAssignment_1"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:230:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:234:1: ( ( RULE_ID ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:235:1: ( RULE_ID )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:235:1: ( RULE_ID )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:236:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_1412); 
             after(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0_in_ruleGreeting155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Greeting__Group__0__Impl220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__1251 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__2_in_rule__Greeting__Group__1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__2__Impl_in_rule__Greeting__Group__2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Greeting__Group__2__Impl339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_1412 = new BitSet(new long[]{0x0000000000000002L});

}