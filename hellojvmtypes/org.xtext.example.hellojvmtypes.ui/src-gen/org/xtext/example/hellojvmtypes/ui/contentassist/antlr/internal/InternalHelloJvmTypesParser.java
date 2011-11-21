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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'from'", "'!'", "','", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__15=15;
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:116:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:117:1: ( ruleQualifiedName EOF )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:118:1: ruleQualifiedName EOF
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:125:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:129:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:130:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:130:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:131:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:132:1: ( rule__QualifiedName__Group__0 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:132:2: rule__QualifiedName__Group__0
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:146:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:150:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:151:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:158:1: rule__Greeting__Group__0__Impl : ( 'Hello' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:162:1: ( ( 'Hello' ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:163:1: ( 'Hello' )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:163:1: ( 'Hello' )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:164:1: 'Hello'
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:177:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:181:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:182:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:189:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:193:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:194:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:194:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:195:1: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:196:1: ( rule__Greeting__NameAssignment_1 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:196:2: rule__Greeting__NameAssignment_1
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:206:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl rule__Greeting__Group__3 ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:210:1: ( rule__Greeting__Group__2__Impl rule__Greeting__Group__3 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:211:2: rule__Greeting__Group__2__Impl rule__Greeting__Group__3
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:218:1: rule__Greeting__Group__2__Impl : ( 'from' ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:222:1: ( ( 'from' ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:223:1: ( 'from' )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:223:1: ( 'from' )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:224:1: 'from'
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:237:1: rule__Greeting__Group__3 : rule__Greeting__Group__3__Impl rule__Greeting__Group__4 ;
    public final void rule__Greeting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:241:1: ( rule__Greeting__Group__3__Impl rule__Greeting__Group__4 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:242:2: rule__Greeting__Group__3__Impl rule__Greeting__Group__4
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:249:1: rule__Greeting__Group__3__Impl : ( ( rule__Greeting__JavaTypesAssignment_3 ) ) ;
    public final void rule__Greeting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:253:1: ( ( ( rule__Greeting__JavaTypesAssignment_3 ) ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:254:1: ( ( rule__Greeting__JavaTypesAssignment_3 ) )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:254:1: ( ( rule__Greeting__JavaTypesAssignment_3 ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:255:1: ( rule__Greeting__JavaTypesAssignment_3 )
            {
             before(grammarAccess.getGreetingAccess().getJavaTypesAssignment_3()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:256:1: ( rule__Greeting__JavaTypesAssignment_3 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:256:2: rule__Greeting__JavaTypesAssignment_3
            {
            pushFollow(FOLLOW_rule__Greeting__JavaTypesAssignment_3_in_rule__Greeting__Group__3__Impl463);
            rule__Greeting__JavaTypesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getJavaTypesAssignment_3()); 

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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:266:1: rule__Greeting__Group__4 : rule__Greeting__Group__4__Impl rule__Greeting__Group__5 ;
    public final void rule__Greeting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:270:1: ( rule__Greeting__Group__4__Impl rule__Greeting__Group__5 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:271:2: rule__Greeting__Group__4__Impl rule__Greeting__Group__5
            {
            pushFollow(FOLLOW_rule__Greeting__Group__4__Impl_in_rule__Greeting__Group__4493);
            rule__Greeting__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__5_in_rule__Greeting__Group__4496);
            rule__Greeting__Group__5();

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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:278:1: rule__Greeting__Group__4__Impl : ( ( rule__Greeting__Group_4__0 )* ) ;
    public final void rule__Greeting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:282:1: ( ( ( rule__Greeting__Group_4__0 )* ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:283:1: ( ( rule__Greeting__Group_4__0 )* )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:283:1: ( ( rule__Greeting__Group_4__0 )* )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:284:1: ( rule__Greeting__Group_4__0 )*
            {
             before(grammarAccess.getGreetingAccess().getGroup_4()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:285:1: ( rule__Greeting__Group_4__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:285:2: rule__Greeting__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Greeting__Group_4__0_in_rule__Greeting__Group__4__Impl523);
            	    rule__Greeting__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getGreetingAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Greeting__Group__5"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:295:1: rule__Greeting__Group__5 : rule__Greeting__Group__5__Impl ;
    public final void rule__Greeting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:299:1: ( rule__Greeting__Group__5__Impl )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:300:2: rule__Greeting__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group__5__Impl_in_rule__Greeting__Group__5554);
            rule__Greeting__Group__5__Impl();

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
    // $ANTLR end "rule__Greeting__Group__5"


    // $ANTLR start "rule__Greeting__Group__5__Impl"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:306:1: rule__Greeting__Group__5__Impl : ( '!' ) ;
    public final void rule__Greeting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:310:1: ( ( '!' ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:311:1: ( '!' )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:311:1: ( '!' )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:312:1: '!'
            {
             before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__Greeting__Group__5__Impl582); 
             after(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_5()); 

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
    // $ANTLR end "rule__Greeting__Group__5__Impl"


    // $ANTLR start "rule__Greeting__Group_4__0"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:337:1: rule__Greeting__Group_4__0 : rule__Greeting__Group_4__0__Impl rule__Greeting__Group_4__1 ;
    public final void rule__Greeting__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:341:1: ( rule__Greeting__Group_4__0__Impl rule__Greeting__Group_4__1 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:342:2: rule__Greeting__Group_4__0__Impl rule__Greeting__Group_4__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group_4__0__Impl_in_rule__Greeting__Group_4__0625);
            rule__Greeting__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group_4__1_in_rule__Greeting__Group_4__0628);
            rule__Greeting__Group_4__1();

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
    // $ANTLR end "rule__Greeting__Group_4__0"


    // $ANTLR start "rule__Greeting__Group_4__0__Impl"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:349:1: rule__Greeting__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Greeting__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:353:1: ( ( ',' ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:354:1: ( ',' )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:354:1: ( ',' )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:355:1: ','
            {
             before(grammarAccess.getGreetingAccess().getCommaKeyword_4_0()); 
            match(input,14,FOLLOW_14_in_rule__Greeting__Group_4__0__Impl656); 
             after(grammarAccess.getGreetingAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Greeting__Group_4__0__Impl"


    // $ANTLR start "rule__Greeting__Group_4__1"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:368:1: rule__Greeting__Group_4__1 : rule__Greeting__Group_4__1__Impl ;
    public final void rule__Greeting__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:372:1: ( rule__Greeting__Group_4__1__Impl )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:373:2: rule__Greeting__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group_4__1__Impl_in_rule__Greeting__Group_4__1687);
            rule__Greeting__Group_4__1__Impl();

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
    // $ANTLR end "rule__Greeting__Group_4__1"


    // $ANTLR start "rule__Greeting__Group_4__1__Impl"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:379:1: rule__Greeting__Group_4__1__Impl : ( ( rule__Greeting__JavaTypesAssignment_4_1 ) ) ;
    public final void rule__Greeting__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:383:1: ( ( ( rule__Greeting__JavaTypesAssignment_4_1 ) ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:384:1: ( ( rule__Greeting__JavaTypesAssignment_4_1 ) )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:384:1: ( ( rule__Greeting__JavaTypesAssignment_4_1 ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:385:1: ( rule__Greeting__JavaTypesAssignment_4_1 )
            {
             before(grammarAccess.getGreetingAccess().getJavaTypesAssignment_4_1()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:386:1: ( rule__Greeting__JavaTypesAssignment_4_1 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:386:2: rule__Greeting__JavaTypesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Greeting__JavaTypesAssignment_4_1_in_rule__Greeting__Group_4__1__Impl714);
            rule__Greeting__JavaTypesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getJavaTypesAssignment_4_1()); 

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
    // $ANTLR end "rule__Greeting__Group_4__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:400:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:404:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:405:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0748);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0751);
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:412:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:416:1: ( ( RULE_ID ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:417:1: ( RULE_ID )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:417:1: ( RULE_ID )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:418:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl778); 
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:429:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:433:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:434:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1807);
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:440:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:444:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:445:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:445:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:446:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:447:1: ( rule__QualifiedName__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:447:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl834);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:461:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:465:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:466:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__0869);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__0872);
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:473:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:477:1: ( ( '.' ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:478:1: ( '.' )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:478:1: ( '.' )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:479:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__QualifiedName__Group_1__0__Impl900); 
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:492:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:496:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:497:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__1931);
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:503:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:507:1: ( ( RULE_ID ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:508:1: ( RULE_ID )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:508:1: ( RULE_ID )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:509:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl958); 
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:525:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:529:1: ( ( ruleGreeting ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:530:1: ( ruleGreeting )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:530:1: ( ruleGreeting )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:531:1: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment996);
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:540:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:544:1: ( ( RULE_ID ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:545:1: ( RULE_ID )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:545:1: ( RULE_ID )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:546:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_11027); 
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


    // $ANTLR start "rule__Greeting__JavaTypesAssignment_3"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:555:1: rule__Greeting__JavaTypesAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Greeting__JavaTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:559:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:560:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:560:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:561:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGreetingAccess().getJavaTypesJvmTypeCrossReference_3_0()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:562:1: ( ruleQualifiedName )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:563:1: ruleQualifiedName
            {
             before(grammarAccess.getGreetingAccess().getJavaTypesJvmTypeQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Greeting__JavaTypesAssignment_31062);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGreetingAccess().getJavaTypesJvmTypeQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGreetingAccess().getJavaTypesJvmTypeCrossReference_3_0()); 

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
    // $ANTLR end "rule__Greeting__JavaTypesAssignment_3"


    // $ANTLR start "rule__Greeting__JavaTypesAssignment_4_1"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:574:1: rule__Greeting__JavaTypesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Greeting__JavaTypesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:578:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:579:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:579:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:580:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGreetingAccess().getJavaTypesJvmTypeCrossReference_4_1_0()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:581:1: ( ruleQualifiedName )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:582:1: ruleQualifiedName
            {
             before(grammarAccess.getGreetingAccess().getJavaTypesJvmTypeQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Greeting__JavaTypesAssignment_4_11101);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGreetingAccess().getJavaTypesJvmTypeQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getGreetingAccess().getJavaTypesJvmTypeCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Greeting__JavaTypesAssignment_4_1"

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
    public static final BitSet FOLLOW_rule__Greeting__Group__3__Impl_in_rule__Greeting__Group__3433 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__4_in_rule__Greeting__Group__3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__JavaTypesAssignment_3_in_rule__Greeting__Group__3__Impl463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__4__Impl_in_rule__Greeting__Group__4493 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__5_in_rule__Greeting__Group__4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_4__0_in_rule__Greeting__Group__4__Impl523 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__5__Impl_in_rule__Greeting__Group__5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Greeting__Group__5__Impl582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_4__0__Impl_in_rule__Greeting__Group_4__0625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Greeting__Group_4__1_in_rule__Greeting__Group_4__0628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Greeting__Group_4__0__Impl656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_4__1__Impl_in_rule__Greeting__Group_4__1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__JavaTypesAssignment_4_1_in_rule__Greeting__Group_4__1__Impl714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0748 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl834 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__0869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__0872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__QualifiedName__Group_1__0__Impl900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_11027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Greeting__JavaTypesAssignment_31062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Greeting__JavaTypesAssignment_4_11101 = new BitSet(new long[]{0x0000000000000002L});

}