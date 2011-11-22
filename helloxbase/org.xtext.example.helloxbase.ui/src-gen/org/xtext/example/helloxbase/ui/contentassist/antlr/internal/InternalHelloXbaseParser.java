package org.xtext.example.helloxbase.ui.contentassist.antlr.internal; 

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
import org.xtext.example.helloxbase.services.HelloXbaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHelloXbaseParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'from'", "'!'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalHelloXbaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHelloXbaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHelloXbaseParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g"; }


     
     	private HelloXbaseGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(HelloXbaseGrammarAccess grammarAccess) {
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
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:62:1: ruleModel EOF
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
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:69:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:73:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:75:1: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:76:1: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:76:2: rule__Model__GreetingsAssignment
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
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:88:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:89:1: ( ruleGreeting EOF )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:90:1: ruleGreeting EOF
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
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:97:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:101:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:102:1: ( ( rule__Greeting__Group__0 ) )
            {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:102:1: ( ( rule__Greeting__Group__0 ) )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:103:1: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:104:1: ( rule__Greeting__Group__0 )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:104:2: rule__Greeting__Group__0
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:116:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:117:1: ( ruleQualifiedName EOF )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:118:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName182);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName189); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:125:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:129:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:130:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:130:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:131:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:132:1: ( rule__QualifiedName__Group__0 )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:132:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName215);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__Greeting__Group__0"
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:146:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:150:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:151:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0249);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0252);
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
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:158:1: rule__Greeting__Group__0__Impl : ( 'Hello' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:162:1: ( ( 'Hello' ) )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:163:1: ( 'Hello' )
            {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:163:1: ( 'Hello' )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:164:1: 'Hello'
            {
             before(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Greeting__Group__0__Impl280); 
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
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:177:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:181:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:182:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
            {
            pushFollow(FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__1311);
            rule__Greeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__2_in_rule__Greeting__Group__1314);
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
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:189:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:193:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:194:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:194:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:195:1: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:196:1: ( rule__Greeting__NameAssignment_1 )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:196:2: rule__Greeting__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl341);
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
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:206:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl rule__Greeting__Group__3 ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:210:1: ( rule__Greeting__Group__2__Impl rule__Greeting__Group__3 )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:211:2: rule__Greeting__Group__2__Impl rule__Greeting__Group__3
            {
            pushFollow(FOLLOW_rule__Greeting__Group__2__Impl_in_rule__Greeting__Group__2371);
            rule__Greeting__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__3_in_rule__Greeting__Group__2374);
            rule__Greeting__Group__3();

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
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:218:1: rule__Greeting__Group__2__Impl : ( 'from' ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:222:1: ( ( 'from' ) )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:223:1: ( 'from' )
            {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:223:1: ( 'from' )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:224:1: 'from'
            {
             before(grammarAccess.getGreetingAccess().getFromKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Greeting__Group__2__Impl402); 
             after(grammarAccess.getGreetingAccess().getFromKeyword_2()); 

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


    // $ANTLR start "rule__Greeting__Group__3"
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:237:1: rule__Greeting__Group__3 : rule__Greeting__Group__3__Impl rule__Greeting__Group__4 ;
    public final void rule__Greeting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:241:1: ( rule__Greeting__Group__3__Impl rule__Greeting__Group__4 )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:242:2: rule__Greeting__Group__3__Impl rule__Greeting__Group__4
            {
            pushFollow(FOLLOW_rule__Greeting__Group__3__Impl_in_rule__Greeting__Group__3433);
            rule__Greeting__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__4_in_rule__Greeting__Group__3436);
            rule__Greeting__Group__4();

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
    // $ANTLR end "rule__Greeting__Group__3"


    // $ANTLR start "rule__Greeting__Group__3__Impl"
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:249:1: rule__Greeting__Group__3__Impl : ( ( rule__Greeting__JavaTypeAssignment_3 ) ) ;
    public final void rule__Greeting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:253:1: ( ( ( rule__Greeting__JavaTypeAssignment_3 ) ) )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:254:1: ( ( rule__Greeting__JavaTypeAssignment_3 ) )
            {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:254:1: ( ( rule__Greeting__JavaTypeAssignment_3 ) )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:255:1: ( rule__Greeting__JavaTypeAssignment_3 )
            {
             before(grammarAccess.getGreetingAccess().getJavaTypeAssignment_3()); 
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:256:1: ( rule__Greeting__JavaTypeAssignment_3 )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:256:2: rule__Greeting__JavaTypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Greeting__JavaTypeAssignment_3_in_rule__Greeting__Group__3__Impl463);
            rule__Greeting__JavaTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getJavaTypeAssignment_3()); 

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
    // $ANTLR end "rule__Greeting__Group__3__Impl"


    // $ANTLR start "rule__Greeting__Group__4"
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:266:1: rule__Greeting__Group__4 : rule__Greeting__Group__4__Impl ;
    public final void rule__Greeting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:270:1: ( rule__Greeting__Group__4__Impl )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:271:2: rule__Greeting__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group__4__Impl_in_rule__Greeting__Group__4493);
            rule__Greeting__Group__4__Impl();

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
    // $ANTLR end "rule__Greeting__Group__4"


    // $ANTLR start "rule__Greeting__Group__4__Impl"
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:277:1: rule__Greeting__Group__4__Impl : ( '!' ) ;
    public final void rule__Greeting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:281:1: ( ( '!' ) )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:282:1: ( '!' )
            {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:282:1: ( '!' )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:283:1: '!'
            {
             before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Greeting__Group__4__Impl521); 
             after(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_4()); 

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
    // $ANTLR end "rule__Greeting__Group__4__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:306:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:310:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:311:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0562);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0565);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:318:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:322:1: ( ( RULE_ID ) )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:323:1: ( RULE_ID )
            {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:323:1: ( RULE_ID )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:324:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl592); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:335:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:339:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:340:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1621);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:346:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:350:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:351:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:351:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:352:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:353:1: ( rule__QualifiedName__Group_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:353:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl648);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:367:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:371:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:372:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__0683);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__0686);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:379:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:383:1: ( ( '.' ) )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:384:1: ( '.' )
            {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:384:1: ( '.' )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:385:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl714); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:398:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:402:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:403:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__1745);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:409:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:413:1: ( ( RULE_ID ) )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:414:1: ( RULE_ID )
            {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:414:1: ( RULE_ID )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:415:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl772); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:431:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:435:1: ( ( ruleGreeting ) )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:436:1: ( ruleGreeting )
            {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:436:1: ( ruleGreeting )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:437:1: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment810);
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
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:446:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:450:1: ( ( RULE_ID ) )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:451:1: ( RULE_ID )
            {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:451:1: ( RULE_ID )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:452:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_1841); 
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


    // $ANTLR start "rule__Greeting__JavaTypeAssignment_3"
    // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:461:1: rule__Greeting__JavaTypeAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Greeting__JavaTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:465:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:466:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:466:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:467:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGreetingAccess().getJavaTypeJvmTypeCrossReference_3_0()); 
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:468:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxbase.ui/src-gen/org/xtext/example/helloxbase/ui/contentassist/antlr/internal/InternalHelloXbase.g:469:1: ruleQualifiedName
            {
             before(grammarAccess.getGreetingAccess().getJavaTypeJvmTypeQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Greeting__JavaTypeAssignment_3876);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGreetingAccess().getJavaTypeJvmTypeQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGreetingAccess().getJavaTypeJvmTypeCrossReference_3_0()); 

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
    // $ANTLR end "rule__Greeting__JavaTypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0_in_ruleGreeting155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Greeting__Group__0__Impl280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__1311 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__2_in_rule__Greeting__Group__1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__2__Impl_in_rule__Greeting__Group__2371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Greeting__Group__3_in_rule__Greeting__Group__2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Greeting__Group__2__Impl402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__3__Impl_in_rule__Greeting__Group__3433 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__4_in_rule__Greeting__Group__3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__JavaTypeAssignment_3_in_rule__Greeting__Group__3__Impl463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__4__Impl_in_rule__Greeting__Group__4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Greeting__Group__4__Impl521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0562 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl648 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__0683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__0686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Greeting__JavaTypeAssignment_3876 = new BitSet(new long[]{0x0000000000000002L});

}