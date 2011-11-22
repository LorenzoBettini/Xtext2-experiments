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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'Hello'", "'from'", "'!'", "','"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__17=17;
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:76:1: ( rule__Model__Group__0 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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


    // $ANTLR start "entryRuleImport"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:89:1: ( ruleImport EOF )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:90:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport121);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport128); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:102:1: ( ( rule__Import__Group__0 ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:104:1: ( rule__Import__Group__0 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:104:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport154);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:116:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:117:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:118:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard181);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard188); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:125:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:129:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:130:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:130:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:131:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:132:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:132:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard214);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:144:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:145:1: ( ruleQualifiedName EOF )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:146:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName241);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName248); 

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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:153:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:157:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:159:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:160:1: ( rule__QualifiedName__Group__0 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:160:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName274);
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


    // $ANTLR start "entryRuleGreeting"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:172:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:173:1: ( ruleGreeting EOF )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:174:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting301);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting308); 

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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:181:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:185:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:186:1: ( ( rule__Greeting__Group__0 ) )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:186:1: ( ( rule__Greeting__Group__0 ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:187:1: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:188:1: ( rule__Greeting__Group__0 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:188:2: rule__Greeting__Group__0
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0_in_ruleGreeting334);
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


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:202:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:206:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:207:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0368);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0371);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:214:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:218:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:219:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:219:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:220:1: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:221:1: ( rule__Model__ImportsAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:221:2: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl398);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:231:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:235:1: ( rule__Model__Group__1__Impl )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:236:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1429);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:242:1: rule__Model__Group__1__Impl : ( ( rule__Model__GreetingsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:246:1: ( ( ( rule__Model__GreetingsAssignment_1 )* ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:247:1: ( ( rule__Model__GreetingsAssignment_1 )* )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:247:1: ( ( rule__Model__GreetingsAssignment_1 )* )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:248:1: ( rule__Model__GreetingsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment_1()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:249:1: ( rule__Model__GreetingsAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:249:2: rule__Model__GreetingsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__GreetingsAssignment_1_in_rule__Model__Group__1__Impl456);
            	    rule__Model__GreetingsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:263:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:267:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:268:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0491);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0494);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:275:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:279:1: ( ( 'import' ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:280:1: ( 'import' )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:280:1: ( 'import' )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:281:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Import__Group__0__Impl522); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:294:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:298:1: ( rule__Import__Group__1__Impl )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:299:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1553);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:305:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:309:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:310:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:310:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:311:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:312:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:312:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl580);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:326:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:330:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:331:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__0614);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__0617);
            rule__QualifiedNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:338:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:342:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:343:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:343:1: ( ruleQualifiedName )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:344:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl644);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:355:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:359:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:360:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__1673);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:366:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:370:1: ( ( ( '.*' )? ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:371:1: ( ( '.*' )? )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:371:1: ( ( '.*' )? )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:372:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:373:1: ( '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:374:2: '.*'
                    {
                    match(input,12,FOLLOW_12_in_rule__QualifiedNameWithWildcard__Group__1__Impl702); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:389:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:393:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:394:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0739);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0742);
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:401:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:405:1: ( ( RULE_ID ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:406:1: ( RULE_ID )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:406:1: ( RULE_ID )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:407:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl769); 
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:418:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:422:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:423:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1798);
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:429:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:433:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:434:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:434:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:435:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:436:1: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:436:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl825);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:450:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:454:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:455:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__0860);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__0863);
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:462:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:466:1: ( ( '.' ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:467:1: ( '.' )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:467:1: ( '.' )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:468:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__QualifiedName__Group_1__0__Impl891); 
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:481:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:485:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:486:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__1922);
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:492:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:496:1: ( ( RULE_ID ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:497:1: ( RULE_ID )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:497:1: ( RULE_ID )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:498:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl949); 
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


    // $ANTLR start "rule__Greeting__Group__0"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:513:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:517:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:518:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0982);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0985);
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:525:1: rule__Greeting__Group__0__Impl : ( 'Hello' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:529:1: ( ( 'Hello' ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:530:1: ( 'Hello' )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:530:1: ( 'Hello' )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:531:1: 'Hello'
            {
             before(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Greeting__Group__0__Impl1013); 
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:544:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:548:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:549:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
            {
            pushFollow(FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__11044);
            rule__Greeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__2_in_rule__Greeting__Group__11047);
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:556:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:560:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:561:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:561:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:562:1: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:563:1: ( rule__Greeting__NameAssignment_1 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:563:2: rule__Greeting__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl1074);
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:573:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl rule__Greeting__Group__3 ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:577:1: ( rule__Greeting__Group__2__Impl rule__Greeting__Group__3 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:578:2: rule__Greeting__Group__2__Impl rule__Greeting__Group__3
            {
            pushFollow(FOLLOW_rule__Greeting__Group__2__Impl_in_rule__Greeting__Group__21104);
            rule__Greeting__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__3_in_rule__Greeting__Group__21107);
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:585:1: rule__Greeting__Group__2__Impl : ( 'from' ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:589:1: ( ( 'from' ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:590:1: ( 'from' )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:590:1: ( 'from' )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:591:1: 'from'
            {
             before(grammarAccess.getGreetingAccess().getFromKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Greeting__Group__2__Impl1135); 
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:604:1: rule__Greeting__Group__3 : rule__Greeting__Group__3__Impl rule__Greeting__Group__4 ;
    public final void rule__Greeting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:608:1: ( rule__Greeting__Group__3__Impl rule__Greeting__Group__4 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:609:2: rule__Greeting__Group__3__Impl rule__Greeting__Group__4
            {
            pushFollow(FOLLOW_rule__Greeting__Group__3__Impl_in_rule__Greeting__Group__31166);
            rule__Greeting__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__4_in_rule__Greeting__Group__31169);
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:616:1: rule__Greeting__Group__3__Impl : ( ( rule__Greeting__JavaTypesAssignment_3 ) ) ;
    public final void rule__Greeting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:620:1: ( ( ( rule__Greeting__JavaTypesAssignment_3 ) ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:621:1: ( ( rule__Greeting__JavaTypesAssignment_3 ) )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:621:1: ( ( rule__Greeting__JavaTypesAssignment_3 ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:622:1: ( rule__Greeting__JavaTypesAssignment_3 )
            {
             before(grammarAccess.getGreetingAccess().getJavaTypesAssignment_3()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:623:1: ( rule__Greeting__JavaTypesAssignment_3 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:623:2: rule__Greeting__JavaTypesAssignment_3
            {
            pushFollow(FOLLOW_rule__Greeting__JavaTypesAssignment_3_in_rule__Greeting__Group__3__Impl1196);
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:633:1: rule__Greeting__Group__4 : rule__Greeting__Group__4__Impl rule__Greeting__Group__5 ;
    public final void rule__Greeting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:637:1: ( rule__Greeting__Group__4__Impl rule__Greeting__Group__5 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:638:2: rule__Greeting__Group__4__Impl rule__Greeting__Group__5
            {
            pushFollow(FOLLOW_rule__Greeting__Group__4__Impl_in_rule__Greeting__Group__41226);
            rule__Greeting__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__5_in_rule__Greeting__Group__41229);
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:645:1: rule__Greeting__Group__4__Impl : ( ( rule__Greeting__Group_4__0 )* ) ;
    public final void rule__Greeting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:649:1: ( ( ( rule__Greeting__Group_4__0 )* ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:650:1: ( ( rule__Greeting__Group_4__0 )* )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:650:1: ( ( rule__Greeting__Group_4__0 )* )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:651:1: ( rule__Greeting__Group_4__0 )*
            {
             before(grammarAccess.getGreetingAccess().getGroup_4()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:652:1: ( rule__Greeting__Group_4__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:652:2: rule__Greeting__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Greeting__Group_4__0_in_rule__Greeting__Group__4__Impl1256);
            	    rule__Greeting__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:662:1: rule__Greeting__Group__5 : rule__Greeting__Group__5__Impl ;
    public final void rule__Greeting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:666:1: ( rule__Greeting__Group__5__Impl )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:667:2: rule__Greeting__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group__5__Impl_in_rule__Greeting__Group__51287);
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:673:1: rule__Greeting__Group__5__Impl : ( '!' ) ;
    public final void rule__Greeting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:677:1: ( ( '!' ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:678:1: ( '!' )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:678:1: ( '!' )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:679:1: '!'
            {
             before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Greeting__Group__5__Impl1315); 
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:704:1: rule__Greeting__Group_4__0 : rule__Greeting__Group_4__0__Impl rule__Greeting__Group_4__1 ;
    public final void rule__Greeting__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:708:1: ( rule__Greeting__Group_4__0__Impl rule__Greeting__Group_4__1 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:709:2: rule__Greeting__Group_4__0__Impl rule__Greeting__Group_4__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group_4__0__Impl_in_rule__Greeting__Group_4__01358);
            rule__Greeting__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group_4__1_in_rule__Greeting__Group_4__01361);
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:716:1: rule__Greeting__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Greeting__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:720:1: ( ( ',' ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:721:1: ( ',' )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:721:1: ( ',' )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:722:1: ','
            {
             before(grammarAccess.getGreetingAccess().getCommaKeyword_4_0()); 
            match(input,17,FOLLOW_17_in_rule__Greeting__Group_4__0__Impl1389); 
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:735:1: rule__Greeting__Group_4__1 : rule__Greeting__Group_4__1__Impl ;
    public final void rule__Greeting__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:739:1: ( rule__Greeting__Group_4__1__Impl )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:740:2: rule__Greeting__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group_4__1__Impl_in_rule__Greeting__Group_4__11420);
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:746:1: rule__Greeting__Group_4__1__Impl : ( ( rule__Greeting__JavaTypesAssignment_4_1 ) ) ;
    public final void rule__Greeting__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:750:1: ( ( ( rule__Greeting__JavaTypesAssignment_4_1 ) ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:751:1: ( ( rule__Greeting__JavaTypesAssignment_4_1 ) )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:751:1: ( ( rule__Greeting__JavaTypesAssignment_4_1 ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:752:1: ( rule__Greeting__JavaTypesAssignment_4_1 )
            {
             before(grammarAccess.getGreetingAccess().getJavaTypesAssignment_4_1()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:753:1: ( rule__Greeting__JavaTypesAssignment_4_1 )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:753:2: rule__Greeting__JavaTypesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Greeting__JavaTypesAssignment_4_1_in_rule__Greeting__Group_4__1__Impl1447);
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


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:768:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:772:1: ( ( ruleImport ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:773:1: ( ruleImport )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:773:1: ( ruleImport )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:774:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_01486);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__ImportsAssignment_0"


    // $ANTLR start "rule__Model__GreetingsAssignment_1"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:783:1: rule__Model__GreetingsAssignment_1 : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:787:1: ( ( ruleGreeting ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:788:1: ( ruleGreeting )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:788:1: ( ruleGreeting )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:789:1: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment_11517);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__GreetingsAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:798:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:802:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:803:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:803:1: ( ruleQualifiedNameWithWildcard )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:804:1: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_11548);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Greeting__NameAssignment_1"
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:813:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:817:1: ( ( RULE_ID ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:818:1: ( RULE_ID )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:818:1: ( RULE_ID )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:819:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_11579); 
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:828:1: rule__Greeting__JavaTypesAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Greeting__JavaTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:832:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:833:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:833:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:834:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGreetingAccess().getJavaTypesJvmTypeCrossReference_3_0()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:835:1: ( ruleQualifiedName )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:836:1: ruleQualifiedName
            {
             before(grammarAccess.getGreetingAccess().getJavaTypesJvmTypeQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Greeting__JavaTypesAssignment_31614);
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
    // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:847:1: rule__Greeting__JavaTypesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Greeting__JavaTypesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:851:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:852:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:852:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:853:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGreetingAccess().getJavaTypesJvmTypeCrossReference_4_1_0()); 
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:854:1: ( ruleQualifiedName )
            // ../org.xtext.example.hellojvmtypes.ui/src-gen/org/xtext/example/hellojvmtypes/ui/contentassist/antlr/internal/InternalHelloJvmTypes.g:855:1: ruleQualifiedName
            {
             before(grammarAccess.getGreetingAccess().getJavaTypesJvmTypeQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Greeting__JavaTypesAssignment_4_11653);
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
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0_in_ruleGreeting334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0368 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl398 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_1_in_rule__Model__Group__1__Impl456 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Import__Group__0__Impl522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__0614 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__0617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__QualifiedNameWithWildcard__Group__1__Impl702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0739 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl825 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__0860 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__0863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__QualifiedName__Group_1__0__Impl891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Greeting__Group__0__Impl1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__11044 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__2_in_rule__Greeting__Group__11047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__2__Impl_in_rule__Greeting__Group__21104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Greeting__Group__3_in_rule__Greeting__Group__21107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Greeting__Group__2__Impl1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__3__Impl_in_rule__Greeting__Group__31166 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__4_in_rule__Greeting__Group__31169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__JavaTypesAssignment_3_in_rule__Greeting__Group__3__Impl1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__4__Impl_in_rule__Greeting__Group__41226 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__5_in_rule__Greeting__Group__41229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_4__0_in_rule__Greeting__Group__4__Impl1256 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__5__Impl_in_rule__Greeting__Group__51287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Greeting__Group__5__Impl1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_4__0__Impl_in_rule__Greeting__Group_4__01358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Greeting__Group_4__1_in_rule__Greeting__Group_4__01361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Greeting__Group_4__0__Impl1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_4__1__Impl_in_rule__Greeting__Group_4__11420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__JavaTypesAssignment_4_1_in_rule__Greeting__Group_4__1__Impl1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_01486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment_11517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_11548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_11579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Greeting__JavaTypesAssignment_31614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Greeting__JavaTypesAssignment_4_11653 = new BitSet(new long[]{0x0000000000000002L});

}