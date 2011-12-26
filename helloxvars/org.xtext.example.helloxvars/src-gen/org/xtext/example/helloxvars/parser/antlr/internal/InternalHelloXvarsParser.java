package org.xtext.example.helloxvars.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.helloxvars.services.HelloXvarsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalHelloXvarsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'Hello'", "'from'", "'!'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalHelloXvarsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHelloXvarsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHelloXvarsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g"; }



     	private HelloXvarsGrammarAccess grammarAccess;
     	
        public InternalHelloXvarsParser(TokenStream input, HelloXvarsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected HelloXvarsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_varDeclarations_1_0= ruleXVariableDeclaration ) )* ( (lv_greetings_2_0= ruleGreeting ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_varDeclarations_1_0 = null;

        EObject lv_greetings_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_varDeclarations_1_0= ruleXVariableDeclaration ) )* ( (lv_greetings_2_0= ruleGreeting ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_varDeclarations_1_0= ruleXVariableDeclaration ) )* ( (lv_greetings_2_0= ruleGreeting ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_varDeclarations_1_0= ruleXVariableDeclaration ) )* ( (lv_greetings_2_0= ruleGreeting ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_varDeclarations_1_0= ruleXVariableDeclaration ) )* ( (lv_greetings_2_0= ruleGreeting ) )*
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:98:3: ( (lv_varDeclarations_1_0= ruleXVariableDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=57 && LA2_0<=58)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:99:1: (lv_varDeclarations_1_0= ruleXVariableDeclaration )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:99:1: (lv_varDeclarations_1_0= ruleXVariableDeclaration )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:100:3: lv_varDeclarations_1_0= ruleXVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getVarDeclarationsXVariableDeclarationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleModel153);
            	    lv_varDeclarations_1_0=ruleXVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"varDeclarations",
            	              		lv_varDeclarations_1_0, 
            	              		"XVariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:116:3: ( (lv_greetings_2_0= ruleGreeting ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:117:1: (lv_greetings_2_0= ruleGreeting )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:117:1: (lv_greetings_2_0= ruleGreeting )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:118:3: lv_greetings_2_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel175);
            	    lv_greetings_2_0=ruleGreeting();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"greetings",
            	              		lv_greetings_2_0, 
            	              		"Greeting");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:142:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:143:2: (iv_ruleImport= ruleImport EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:144:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport212);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport222); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:151:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:154:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:155:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:155:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:155:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport259); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:159:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:160:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:160:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:161:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport280);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:185:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:186:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:187:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard317);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard328); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:194:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:197:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:198:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:198:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:199:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard375);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:209:1: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:210:2: kw= '.*'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedNameWithWildcard394); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleGreeting"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:223:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:224:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:225:2: iv_ruleGreeting= ruleGreeting EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreetingRule()); 
            }
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting436);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreeting; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting446); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:232:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:235:28: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:236:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:236:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:236:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleGreeting483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:240:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:241:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:241:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:242:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting500); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGreetingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleGreeting517); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getFromKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:262:1: ( (lv_expression_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:263:1: (lv_expression_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:263:1: (lv_expression_3_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:264:3: lv_expression_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGreetingAccess().getExpressionXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleGreeting538);
            lv_expression_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGreetingRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleGreeting550); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleXExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:292:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:293:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:294:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression586);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression596); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:301:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:304:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:306:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression642);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:322:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:323:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:324:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment676);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment686); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:331:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:334:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:335:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:335:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||(LA6_1>=RULE_ID && LA6_1<=RULE_STRING)||LA6_1==13||LA6_1==15||(LA6_1>=17 && LA6_1<=42)||(LA6_1>=44 && LA6_1<=71)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==16) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_STRING)||LA6_0==15||LA6_0==26||(LA6_0>=29 && LA6_0<=30)||LA6_0==40||LA6_0==42||LA6_0==46||LA6_0==48||LA6_0==50||(LA6_0>=54 && LA6_0<=56)||LA6_0==59||(LA6_0>=61 && LA6_0<=68)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:335:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:335:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:335:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:335:3: ()
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:336:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:341:2: ( ( ruleValidID ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:342:1: ( ruleValidID )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:342:1: ( ruleValidID )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:343:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment744);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment760);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:364:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:365:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:365:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:366:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment780);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:383:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:383:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:384:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment810);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:392:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==17) ) {
                        int LA5_1 = input.LA(2);

                        if ( (synpred1_InternalHelloXvars()) ) {
                            alt5=1;
                        }
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:392:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:392:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:392:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:397:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:397:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:397:7: ()
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:398:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:403:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:404:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:404:1: ( ruleOpMultiAssign )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:405:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment863);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:418:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:419:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:419:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:420:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment886);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:444:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:445:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:446:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign926);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign937); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:453:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:456:28: (kw= '=' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:458:2: kw= '='
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleOpSingleAssign974); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:471:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:472:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:473:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1014);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1025); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:480:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:483:28: (kw= '+=' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:485:2: kw= '+='
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpMultiAssign1062); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:498:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:499:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:500:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1101);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1111); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:507:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:510:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:511:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:511:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:512:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1158);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:520:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred2_InternalHelloXvars()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:520:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:520:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:520:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:525:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:525:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:525:7: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:526:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:531:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:532:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:532:1: ( ruleOpOr )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:533:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1211);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:546:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:547:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:547:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:548:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1234);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:572:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:573:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:574:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1273);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1284); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:581:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:584:28: (kw= '||' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:586:2: kw= '||'
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpOr1321); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:599:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:600:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:601:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1360);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1370); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:608:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:611:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:612:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:612:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:613:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1417);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:621:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred3_InternalHelloXvars()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:621:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:621:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:621:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:626:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:626:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:626:7: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:627:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:632:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:633:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:633:1: ( ruleOpAnd )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:634:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1470);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:647:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:648:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:648:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:649:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1493);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:673:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:674:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:675:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1532);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1543); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:682:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:685:28: (kw= '&&' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:687:2: kw= '&&'
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpAnd1580); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:700:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:701:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:702:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1619);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1629); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:709:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:712:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:713:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:713:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:714:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1676);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:722:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred4_InternalHelloXvars()) ) {
                        alt9=1;
                    }


                }
                else if ( (LA9_0==21) ) {
                    int LA9_3 = input.LA(2);

                    if ( (synpred4_InternalHelloXvars()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:722:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:722:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:722:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:727:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:727:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:727:7: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:728:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:733:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:734:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:734:1: ( ruleOpEquality )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:735:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1729);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:748:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:749:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:749:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:750:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1752);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:774:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:775:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:776:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1791);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1802); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:783:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:786:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:787:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:787:1: (kw= '==' | kw= '!=' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:788:2: kw= '=='
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleOpEquality1840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:795:2: kw= '!='
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpEquality1859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:808:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:809:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:810:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1899);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression1909); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:817:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:820:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:821:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:821:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:822:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1956);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:830:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop11:
            do {
                int alt11=3;
                switch ( input.LA(1) ) {
                case 22:
                    {
                    int LA11_2 = input.LA(2);

                    if ( (synpred5_InternalHelloXvars()) ) {
                        alt11=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA11_3 = input.LA(2);

                    if ( (synpred6_InternalHelloXvars()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA11_4 = input.LA(2);

                    if ( (synpred6_InternalHelloXvars()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA11_5 = input.LA(2);

                    if ( (synpred6_InternalHelloXvars()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA11_6 = input.LA(2);

                    if ( (synpred6_InternalHelloXvars()) ) {
                        alt11=2;
                    }


                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:830:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:830:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:830:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:830:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:830:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:832:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:832:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:832:6: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:833:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXRelationalExpression1992); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:842:3: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:843:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:843:1: ( ruleQualifiedName )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:844:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2017);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:858:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:858:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:858:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:858:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:858:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:863:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:863:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:863:7: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:864:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:869:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:870:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:870:1: ( ruleOpCompare )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:871:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2078);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:884:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:885:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:885:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:886:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2101);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:910:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:911:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:912:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2141);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2152); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:919:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:922:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:923:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:923:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            case 26:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:924:2: kw= '>='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpCompare2190); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:931:2: kw= '<='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpCompare2209); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:938:2: kw= '>'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare2228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:945:2: kw= '<'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2247); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:958:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:959:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:960:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2287);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2297); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:967:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:970:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:971:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:971:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:972:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2344);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:980:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred7_InternalHelloXvars()) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==28) ) {
                    int LA13_3 = input.LA(2);

                    if ( (synpred7_InternalHelloXvars()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:980:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:980:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:980:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:985:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:985:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:985:7: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:986:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:991:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:992:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:992:1: ( ruleOpOther )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:993:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2397);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1006:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1007:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1007:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1008:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2420);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1032:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1033:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1034:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2459);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2470); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1041:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1044:28: ( (kw= '->' | kw= '..' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1045:1: (kw= '->' | kw= '..' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1045:1: (kw= '->' | kw= '..' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            else if ( (LA14_0==28) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1046:2: kw= '->'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1053:2: kw= '..'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2527); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1066:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1067:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1068:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2567);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2577); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1075:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1078:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1079:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1079:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1080:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2624);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1088:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred8_InternalHelloXvars()) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==30) ) {
                    int LA15_3 = input.LA(2);

                    if ( (synpred8_InternalHelloXvars()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1088:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1088:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1088:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1093:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1093:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1093:7: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1094:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1099:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1100:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1100:1: ( ruleOpAdd )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1101:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2677);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1114:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1115:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1115:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1116:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2700);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1140:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1141:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1142:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2739);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2750); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1149:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1152:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1153:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1153:1: (kw= '+' | kw= '-' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            else if ( (LA16_0==30) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1154:2: kw= '+'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpAdd2788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1161:2: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpAdd2807); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1174:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1175:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1176:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2847);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2857); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1183:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1186:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1187:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1187:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1188:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2904);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1196:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop17:
            do {
                int alt17=2;
                switch ( input.LA(1) ) {
                case 31:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (synpred9_InternalHelloXvars()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (synpred9_InternalHelloXvars()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA17_4 = input.LA(2);

                    if ( (synpred9_InternalHelloXvars()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA17_5 = input.LA(2);

                    if ( (synpred9_InternalHelloXvars()) ) {
                        alt17=1;
                    }


                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1196:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1196:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1196:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1201:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1201:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1201:7: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1202:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1207:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1208:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1208:1: ( ruleOpMulti )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1209:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2957);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1222:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1223:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1223:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1224:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2980);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1248:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1249:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1250:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3019);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3030); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1257:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1260:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1261:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1261:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt18=1;
                }
                break;
            case 32:
                {
                alt18=2;
                }
                break;
            case 33:
                {
                alt18=3;
                }
                break;
            case 34:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1262:2: kw= '*'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpMulti3068); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1269:2: kw= '**'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpMulti3087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1276:2: kw= '/'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpMulti3106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1283:2: kw= '%'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpMulti3125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1296:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1297:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1298:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3165);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3175); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1305:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1308:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1309:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1309:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15||(LA19_0>=29 && LA19_0<=30)) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)||LA19_0==26||LA19_0==40||LA19_0==42||LA19_0==46||LA19_0==48||LA19_0==50||(LA19_0>=54 && LA19_0<=56)||LA19_0==59||(LA19_0>=61 && LA19_0<=68)) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1309:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1309:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1309:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1309:3: ()
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1310:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1315:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1316:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1316:1: ( ruleOpUnary )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1317:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3233);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1330:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1331:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1331:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1332:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3254);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1350:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3283);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1366:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1367:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1368:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3319);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3330); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1375:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1378:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1379:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1379:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt20=1;
                }
                break;
            case 30:
                {
                alt20=2;
                }
                break;
            case 29:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1380:2: kw= '!'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleOpUnary3368); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1387:2: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpUnary3387); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1394:2: kw= '+'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpUnary3406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1407:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1408:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1409:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3446);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3456); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1416:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1419:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1420:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1420:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1421:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3503);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1429:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==35) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred10_InternalHelloXvars()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1429:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1429:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1429:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1431:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1431:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1431:6: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1432:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleXCastedExpression3538); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1441:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1442:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1442:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1443:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3561);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1467:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1468:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1469:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3599);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3609); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1476:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1479:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1480:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1480:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1481:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3656);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1489:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop29:
            do {
                int alt29=3;
                switch ( input.LA(1) ) {
                case 36:
                    {
                    int LA29_2 = input.LA(2);

                    if ( (synpred11_InternalHelloXvars()) ) {
                        alt29=1;
                    }
                    else if ( (synpred12_InternalHelloXvars()) ) {
                        alt29=2;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA29_3 = input.LA(2);

                    if ( (synpred12_InternalHelloXvars()) ) {
                        alt29=2;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA29_4 = input.LA(2);

                    if ( (synpred12_InternalHelloXvars()) ) {
                        alt29=2;
                    }


                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1489:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1489:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1489:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1489:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1489:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1495:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1495:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1495:26: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1496:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleXMemberFeatureCall3705); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1505:1: ( ( ruleValidID ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1506:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1506:1: ( ruleValidID )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1507:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3728);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3744);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1528:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1529:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1529:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1530:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3766);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1547:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1547:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1547:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1547:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1547:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1563:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1563:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1563:8: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1564:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1569:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt22=3;
            	    switch ( input.LA(1) ) {
            	    case 36:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1569:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleXMemberFeatureCall3852); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1574:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1574:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1575:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1575:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1576:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,37,FOLLOW_37_in_ruleXMemberFeatureCall3876); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1590:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1590:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1591:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1591:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1592:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall3913); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1605:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==26) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1605:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,26,FOLLOW_26_in_ruleXMemberFeatureCall3942); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1609:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1610:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1610:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1611:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3963);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1627:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop23:
            	            do {
            	                int alt23=2;
            	                int LA23_0 = input.LA(1);

            	                if ( (LA23_0==39) ) {
            	                    alt23=1;
            	                }


            	                switch (alt23) {
            	            	case 1 :
            	            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1627:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall3976); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1631:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1632:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1632:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1633:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3997);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop23;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleXMemberFeatureCall4011); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1653:3: ( ( ruleValidID ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1654:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1654:1: ( ruleValidID )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1655:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4036);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1668:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt27=2;
            	    alt27 = dfa27.predict(input);
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1668:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1668:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1668:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1675:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1676:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4070); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1689:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt26=3;
            	            alt26 = dfa26.predict(input);
            	            switch (alt26) {
            	                case 1 :
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1689:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1689:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1689:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1706:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1707:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4155);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1724:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1724:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1724:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1724:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1725:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1725:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1726:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4183);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1742:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop25:
            	                    do {
            	                        int alt25=2;
            	                        int LA25_0 = input.LA(1);

            	                        if ( (LA25_0==39) ) {
            	                            alt25=1;
            	                        }


            	                        switch (alt25) {
            	                    	case 1 :
            	                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1742:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall4196); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1746:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1747:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1747:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1748:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4217);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop25;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4234); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1768:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt28=2;
            	    alt28 = dfa28.predict(input);
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1768:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1773:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1774:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4267);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1798:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1799:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1800:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4307);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4317); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1807:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1810:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1811:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1811:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt30=13;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt30=1;
                }
                break;
            case 50:
                {
                alt30=2;
                }
                break;
            case 48:
                {
                alt30=3;
                }
                break;
            case RULE_ID:
            case 26:
            case 59:
                {
                alt30=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 42:
            case 62:
            case 63:
            case 64:
            case 65:
                {
                alt30=5;
                }
                break;
            case 46:
                {
                alt30=6;
                }
                break;
            case 54:
                {
                alt30=7;
                }
                break;
            case 55:
                {
                alt30=8;
                }
                break;
            case 56:
                {
                alt30=9;
                }
                break;
            case 66:
                {
                alt30=10;
                }
                break;
            case 67:
                {
                alt30=11;
                }
                break;
            case 68:
                {
                alt30=12;
                }
                break;
            case 40:
                {
                alt30=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1812:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4364);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1822:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4391);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1832:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4418);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1842:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4445);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1852:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4472);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1862:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4499);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1872:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4526);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1882:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4553);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1892:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4580);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1902:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4607);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1912:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4634);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1922:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4661);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1932:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4688);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1948:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1949:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1950:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4723);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4733); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1957:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XIntLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1960:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1961:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1961:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt31=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt31=1;
                }
                break;
            case 62:
            case 63:
                {
                alt31=2;
                }
                break;
            case RULE_INT:
                {
                alt31=3;
                }
                break;
            case 64:
                {
                alt31=4;
                }
                break;
            case RULE_STRING:
                {
                alt31=5;
                }
                break;
            case 65:
                {
                alt31=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1962:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4780);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1972:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4807);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1982:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral4834);
                    this_XIntLiteral_2=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1992:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral4861);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2002:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral4888);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2012:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4915);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2028:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2029:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2030:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure4950);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure4960); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2037:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2040:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2041:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2041:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2041:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2041:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2042:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleXClosure5006); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2051:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2051:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2066:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2066:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2066:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID||LA33_0==40||LA33_0==71) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2066:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2066:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2067:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2067:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2068:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5077);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2084:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==39) ) {
                                    alt32=1;
                                }


                                switch (alt32) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2084:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleXClosure5090); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2088:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2089:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2089:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2090:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5111);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop32;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2106:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2107:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2107:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2108:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,43,FOLLOW_43_in_ruleXClosure5133); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_2_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2121:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2122:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2122:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2123:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5170);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleXClosure5182); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2151:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2152:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2153:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5218);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5228); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2160:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2163:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2164:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2164:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2164:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2164:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2165:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2170:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_STRING)||LA36_0==15||LA36_0==26||(LA36_0>=29 && LA36_0<=30)||LA36_0==40||LA36_0==42||LA36_0==46||LA36_0==48||LA36_0==50||(LA36_0>=54 && LA36_0<=59)||(LA36_0>=61 && LA36_0<=68)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2170:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2170:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2171:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2171:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2172:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5284);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2188:2: (otherlv_2= ';' )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==45) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2188:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXExpressionInClosure5297); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2200:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2201:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2202:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5337);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5347); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2209:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2212:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2213:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2213:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2213:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2213:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2213:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2229:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2229:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2229:7: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2230:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2235:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID||LA38_0==40||LA38_0==71) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2235:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2235:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2236:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2236:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2237:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5455);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2253:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==39) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2253:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXShortClosure5468); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2257:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2258:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2258:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2259:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5489);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2275:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2276:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2276:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2277:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,43,FOLLOW_43_in_ruleXShortClosure5511); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2290:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2291:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2291:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2292:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5547);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2316:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2317:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2318:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5583);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5593); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2325:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2328:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2329:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2329:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2329:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleXParenthesizedExpression5630); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5652);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXParenthesizedExpression5663); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2354:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2355:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2356:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5699);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5709); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2363:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2366:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2367:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2367:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2367:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2367:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2368:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleXIfExpression5755); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXIfExpression5767); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2381:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2382:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2382:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2383:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5788);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXIfExpression5800); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2403:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2404:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2404:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2405:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5821);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2421:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==47) ) {
                int LA39_1 = input.LA(2);

                if ( (synpred18_InternalHelloXvars()) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2421:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2421:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2421:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleXIfExpression5842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2426:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2427:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2427:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2428:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5864);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2452:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2453:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2454:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5902);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5912); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2461:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2464:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2465:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2465:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2465:2: () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2465:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2466:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression5958); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2475:1: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==49) && (synpred19_InternalHelloXvars())) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2475:2: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2480:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2480:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2480:6: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2481:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2481:1: (lv_localVarName_2_0= ruleValidID )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2482:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression5999);
                    lv_localVarName_2_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_2_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression6011); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2502:4: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2503:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2503:1: (lv_switch_4_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2504:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6035);
            lv_switch_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression6047); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2524:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID||LA41_0==40||LA41_0==49||LA41_0==53||LA41_0==71) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2525:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2525:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2526:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6068);
            	    lv_cases_6_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_6_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2542:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==51) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2542:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6082); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression6094); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2550:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2551:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2551:1: (lv_default_9_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2552:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6115);
                    lv_default_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2580:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2581:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2582:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6165);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6175); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2589:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2592:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2593:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2593:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2593:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2593:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||LA43_0==40||LA43_0==71) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2594:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2594:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2595:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6221);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2611:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==53) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2611:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXCasePart6235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2615:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2616:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2616:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2617:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6256);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleXCasePart6270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2637:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2638:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2638:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2639:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6291);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2663:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2664:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2665:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6327);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6337); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2672:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2675:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2676:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2676:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2676:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2676:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2677:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXForLoopExpression6383); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXForLoopExpression6395); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2690:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2691:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2691:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2692:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6416);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXForLoopExpression6428); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2712:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2713:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2713:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2714:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6449);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleXForLoopExpression6461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2734:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2735:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2735:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2736:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6482);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2760:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2761:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2762:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6518);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6528); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2769:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2772:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2773:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2773:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2773:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2773:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2774:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXWhileExpression6574); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXWhileExpression6586); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2787:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2788:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2788:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2789:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6607);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXWhileExpression6619); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2809:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2810:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2810:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2811:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6640);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2835:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2836:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2837:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6676);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6686); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2844:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2847:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2848:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2848:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2848:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2848:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2849:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXDoWhileExpression6732); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2858:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2859:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2859:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2860:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6753);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleXDoWhileExpression6765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleXDoWhileExpression6777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2884:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2885:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2885:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2886:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6798);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleXDoWhileExpression6810); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2914:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2915:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2916:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6846);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6856); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2923:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2926:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2927:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2927:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2927:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2927:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2928:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXBlockExpression6902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2937:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_STRING)||LA46_0==15||LA46_0==26||(LA46_0>=29 && LA46_0<=30)||LA46_0==40||LA46_0==42||LA46_0==46||LA46_0==48||LA46_0==50||(LA46_0>=54 && LA46_0<=59)||(LA46_0>=61 && LA46_0<=68)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2937:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2937:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2938:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2938:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2939:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6924);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2955:2: (otherlv_3= ';' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==45) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2955:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleXBlockExpression6937); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleXBlockExpression6953); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2971:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2972:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2973:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6989);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6999); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2980:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2983:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2984:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2984:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=57 && LA47_0<=58)) ) {
                alt47=1;
            }
            else if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_STRING)||LA47_0==15||LA47_0==26||(LA47_0>=29 && LA47_0<=30)||LA47_0==40||LA47_0==42||LA47_0==46||LA47_0==48||LA47_0==50||(LA47_0>=54 && LA47_0<=56)||LA47_0==59||(LA47_0>=61 && LA47_0<=68)) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2985:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7046);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2995:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7073);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3011:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3012:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3013:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7108);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7118); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3020:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3023:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3024:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3024:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3024:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3024:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3025:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3030:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==57) ) {
                alt48=1;
            }
            else if ( (LA48_0==58) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3030:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3030:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3031:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3031:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3032:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,57,FOLLOW_57_in_ruleXVariableDeclaration7171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3046:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleXVariableDeclaration7202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3050:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (synpred20_InternalHelloXvars()) ) {
                    alt49=1;
                }
                else if ( (true) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA49_0==40) && (synpred20_InternalHelloXvars())) {
                alt49=1;
            }
            else if ( (LA49_0==71) && (synpred20_InternalHelloXvars())) {
                alt49=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3050:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3050:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3050:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3058:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3058:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3058:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3059:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3059:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3060:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7250);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3076:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3077:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3077:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3078:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7271);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3095:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3095:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3096:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3096:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3097:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7300);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3113:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==16) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3113:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleXVariableDeclaration7314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3117:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3118:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3118:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3119:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7335);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3143:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3144:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3145:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7373);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7383); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3152:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3155:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3156:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3156:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3156:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3156:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==RULE_ID||LA51_1==26||LA51_1==36||LA51_1==42) ) {
                    alt51=1;
                }
            }
            else if ( (LA51_0==40||LA51_0==71) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3157:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3157:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3158:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7429);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3174:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3175:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3175:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3176:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7451);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3200:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3201:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3202:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7487);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7497); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3209:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3212:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3213:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3213:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3213:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3213:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3214:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3214:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3215:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7543);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3231:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3232:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3232:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3233:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7564);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3257:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3258:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3259:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7600);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7610); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3266:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3269:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3270:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3270:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3270:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3270:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3271:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3276:2: ( ( ruleStaticQualifier ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==60) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3277:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3277:1: ( ruleStaticQualifier )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3278:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7667);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3291:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==26) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3291:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleXFeatureCall7681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3295:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3296:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3296:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3297:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7702);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3313:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==39) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3313:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleXFeatureCall7715); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3317:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3318:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3318:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3319:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7736);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleXFeatureCall7750); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3339:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3340:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3340:1: ( ruleIdOrSuper )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3341:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7775);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3354:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3354:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3354:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3354:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3361:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3362:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,40,FOLLOW_40_in_ruleXFeatureCall7809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3375:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt56=3;
                    alt56 = dfa56.predict(input);
                    switch (alt56) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3375:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3375:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3375:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3392:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3393:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7894);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3410:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3410:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3410:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3410:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3411:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3411:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3412:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7922);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3428:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==39) ) {
                                    alt55=1;
                                }


                                switch (alt55) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3428:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,39,FOLLOW_39_in_ruleXFeatureCall7935); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3432:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3433:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3433:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3434:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7956);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop55;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall7973); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3454:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3454:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3459:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3460:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8006);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3484:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3485:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3486:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8044);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8055); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3493:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3496:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3497:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3497:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            else if ( (LA59_0==59) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3498:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8102);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3510:2: kw= 'super'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleIdOrSuper8126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3523:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3524:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3525:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8167);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8178); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3532:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3535:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3536:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3536:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_ID) ) {
                    int LA60_2 = input.LA(2);

                    if ( (LA60_2==60) ) {
                        alt60=1;
                    }


                }


                switch (alt60) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3537:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8225);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleStaticQualifier8243); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3561:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3562:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3563:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8284);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8294); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3570:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3573:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3574:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3574:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3574:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3574:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3575:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXConstructorCall8340); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3584:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3585:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3585:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3586:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8363);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3599:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==26) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3599:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleXConstructorCall8376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3603:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3604:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3604:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3605:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8397);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3621:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==39) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3621:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleXConstructorCall8410); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3625:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3626:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3626:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3627:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8431);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleXConstructorCall8445); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,40,FOLLOW_40_in_ruleXConstructorCall8459); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3651:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt64=3;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3651:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3651:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3651:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3668:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3669:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8531);
                    lv_arguments_9_0=ruleXShortClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_9_0, 
                              		"XShortClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3686:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3686:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3686:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3686:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3687:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3687:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3688:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8559);
                    lv_arguments_10_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_10_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3704:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==39) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3704:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,39,FOLLOW_39_in_ruleXConstructorCall8572); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3708:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3709:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3709:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3710:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8593);
                    	    lv_arguments_12_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_12_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall8610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3730:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3730:2: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3735:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3736:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall8641);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3760:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3761:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3762:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8678);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8688); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3769:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3772:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3773:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3773:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3773:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3773:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3774:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3779:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==62) ) {
                alt66=1;
            }
            else if ( (LA66_0==63) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3779:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXBooleanLiteral8735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3784:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3784:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3785:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3785:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3786:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,63,FOLLOW_63_in_ruleXBooleanLiteral8759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3807:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3808:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3809:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8809);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8819); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3816:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3819:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3820:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3820:1: ( () otherlv_1= 'null' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3820:2: () otherlv_1= 'null'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3820:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3821:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXNullLiteral8865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXIntLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3838:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3839:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3840:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8901);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral8911); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIntLiteral"


    // $ANTLR start "ruleXIntLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3847:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3850:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3851:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3851:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3851:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3851:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3852:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3857:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3858:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3858:1: (lv_value_1_0= RULE_INT )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3859:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral8962); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIntLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3883:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3884:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3885:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9003);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9013); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3892:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3895:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3896:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3896:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3896:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3896:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3897:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3902:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3903:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3903:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3904:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9064); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3928:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3929:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3930:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9105);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9115); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3937:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3940:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3941:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3941:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3941:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3941:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3942:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXTypeLiteral9161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXTypeLiteral9173); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3955:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3956:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3956:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3957:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9196);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXTypeLiteral9208); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3982:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3983:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3984:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9244);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9254); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3991:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3994:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3995:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3995:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3995:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3995:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3996:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXThrowExpression9300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4005:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4006:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4006:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4007:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9321);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4031:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4032:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4033:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9357);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9367); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4040:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4043:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4044:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4044:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4044:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4044:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4045:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXReturnExpression9413); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4054:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4054:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4059:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4060:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9444);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4084:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4085:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4086:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9481);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9491); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4093:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4096:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4097:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4097:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4097:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4097:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4098:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXTryCatchFinallyExpression9537); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4107:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4108:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4108:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4109:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9558);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4125:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==70) ) {
                alt70=1;
            }
            else if ( (LA70_0==69) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4125:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4125:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4125:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4125:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt68=0;
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==70) ) {
                            int LA68_2 = input.LA(2);

                            if ( (synpred27_InternalHelloXvars()) ) {
                                alt68=1;
                            }


                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4125:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4127:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4128:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9588);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt68 >= 1 ) break loop68;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(68, input);
                                throw eee;
                        }
                        cnt68++;
                    } while (true);

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4144:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==69) ) {
                        int LA69_1 = input.LA(2);

                        if ( (synpred28_InternalHelloXvars()) ) {
                            alt69=1;
                        }
                    }
                    switch (alt69) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4144:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4144:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4144:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleXTryCatchFinallyExpression9610); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4149:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4150:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4150:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4151:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9632);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4168:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4168:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4168:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,69,FOLLOW_69_in_ruleXTryCatchFinallyExpression9654); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4172:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4173:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4173:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4174:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9675);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4198:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4199:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4200:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9713);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause9723); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4207:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4210:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4211:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4211:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4211:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4211:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4211:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleXCatchClause9768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleXCatchClause9781); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4220:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4221:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4221:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4222:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause9802);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleXCatchClause9814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4242:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4243:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4243:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4244:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9835);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4268:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4269:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4270:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9872);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9883); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4277:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4280:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4281:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4281:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4282:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9930);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4292:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==36) ) {
                    int LA71_2 = input.LA(2);

                    if ( (LA71_2==RULE_ID) ) {
                        int LA71_3 = input.LA(3);

                        if ( (synpred30_InternalHelloXvars()) ) {
                            alt71=1;
                        }


                    }


                }


                switch (alt71) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4292:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4292:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4292:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,36,FOLLOW_36_in_ruleQualifiedName9958); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9981);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4319:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4320:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4321:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10028);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10038); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4328:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4331:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4332:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4332:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID) ) {
                alt73=1;
            }
            else if ( (LA73_0==40||LA73_0==71) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4332:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4332:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4333:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10086);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4341:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==42) ) {
                            int LA72_2 = input.LA(2);

                            if ( (LA72_2==44) ) {
                                int LA72_3 = input.LA(3);

                                if ( (synpred31_InternalHelloXvars()) ) {
                                    alt72=1;
                                }


                            }


                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4341:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4344:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4344:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4344:6: ()
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4345:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleJvmTypeReference10124); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleJvmTypeReference10136); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4360:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10168);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4376:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4377:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4378:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10203);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10213); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4385:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4388:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4389:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4389:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4389:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4389:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==40) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4389:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleXFunctionTypeRef10251); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4393:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4394:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4394:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4395:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10272);
                    lv_paramTypes_1_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                      	        }
                             		add(
                             			current, 
                             			"paramTypes",
                              		lv_paramTypes_1_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4411:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==39) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4411:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXFunctionTypeRef10285); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4415:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4416:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4416:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4417:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10306);
                    	    lv_paramTypes_3_0=ruleJvmTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"paramTypes",
                    	              		lv_paramTypes_3_0, 
                    	              		"JvmTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXFunctionTypeRef10320); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,71,FOLLOW_71_in_ruleXFunctionTypeRef10334); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4441:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4442:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4442:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4443:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10355);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4467:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4468:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4469:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10391);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10401); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4476:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4479:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4480:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4480:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4480:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4480:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4481:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4481:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4482:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10449);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4495:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt77=2;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4495:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4495:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4495:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleJvmParameterizedTypeReference10470); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4500:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4501:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4501:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4502:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10492);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4518:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==39) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4518:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleJvmParameterizedTypeReference10505); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4522:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4523:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4523:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4524:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10526);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleJvmParameterizedTypeReference10540); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4552:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4553:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4554:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10578);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10588); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4561:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4564:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4565:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4565:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_ID||LA78_0==40||LA78_0==71) ) {
                alt78=1;
            }
            else if ( (LA78_0==72) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4566:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10635);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4576:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10662);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4592:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4593:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4594:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10697);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10707); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4601:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4604:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4605:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4605:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4605:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4605:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4606:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleJvmWildcardTypeReference10753); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4615:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt79=3;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==73) ) {
                alt79=1;
            }
            else if ( (LA79_0==59) ) {
                alt79=2;
            }
            switch (alt79) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4615:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4615:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4616:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4616:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4617:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10775);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4634:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4634:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4635:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4635:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4636:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10802);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4660:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4661:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4662:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10840);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound10850); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4669:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4672:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4673:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4673:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4673:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleJvmUpperBound10887); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4677:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4678:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4678:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4679:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10908);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4703:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4704:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4705:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10944);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10954); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4712:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4715:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4716:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4716:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4716:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleJvmUpperBoundAnded10991); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4720:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4721:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4721:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4722:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11012);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4746:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4747:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4748:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11048);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11058); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4755:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4758:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4759:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4759:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4759:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleJvmLowerBound11095); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4763:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4764:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4764:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4765:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11116);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4791:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4792:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4793:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11155);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11166); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4800:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4803:28: (this_ID_0= RULE_ID )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4804:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11205); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalHelloXvars
    public final void synpred1_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:392:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:392:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:392:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:392:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:392:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:393:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:393:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:394:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:394:1: ( ruleOpMultiAssign )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:395:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloXvars831);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalHelloXvars

    // $ANTLR start synpred2_InternalHelloXvars
    public final void synpred2_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:520:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:520:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:520:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:520:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:520:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:521:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:521:2: ( ( ruleOpOr ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:522:1: ( ruleOpOr )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:522:1: ( ruleOpOr )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:523:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalHelloXvars1179);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalHelloXvars

    // $ANTLR start synpred3_InternalHelloXvars
    public final void synpred3_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:621:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:621:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:621:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:621:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:621:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:622:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:622:2: ( ( ruleOpAnd ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:623:1: ( ruleOpAnd )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:623:1: ( ruleOpAnd )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:624:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalHelloXvars1438);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalHelloXvars

    // $ANTLR start synpred4_InternalHelloXvars
    public final void synpred4_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:722:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:722:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:722:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:722:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:722:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:723:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:723:2: ( ( ruleOpEquality ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:724:1: ( ruleOpEquality )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:724:1: ( ruleOpEquality )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:725:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalHelloXvars1697);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalHelloXvars

    // $ANTLR start synpred5_InternalHelloXvars
    public final void synpred5_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:830:4: ( ( () 'instanceof' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:830:5: ( () 'instanceof' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:830:5: ( () 'instanceof' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:830:6: () 'instanceof'
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:830:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:831:1: 
        {
        }

        match(input,22,FOLLOW_22_in_synpred5_InternalHelloXvars1973); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalHelloXvars

    // $ANTLR start synpred6_InternalHelloXvars
    public final void synpred6_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:858:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:858:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:858:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:858:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:858:10: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:859:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:859:2: ( ( ruleOpCompare ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:860:1: ( ruleOpCompare )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:860:1: ( ruleOpCompare )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:861:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalHelloXvars2046);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalHelloXvars

    // $ANTLR start synpred7_InternalHelloXvars
    public final void synpred7_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:980:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:980:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:980:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:980:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:980:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:981:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:981:2: ( ( ruleOpOther ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:982:1: ( ruleOpOther )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:982:1: ( ruleOpOther )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:983:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalHelloXvars2365);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalHelloXvars

    // $ANTLR start synpred8_InternalHelloXvars
    public final void synpred8_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1088:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1088:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1088:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1088:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1088:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1089:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1089:2: ( ( ruleOpAdd ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1090:1: ( ruleOpAdd )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1090:1: ( ruleOpAdd )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1091:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalHelloXvars2645);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalHelloXvars

    // $ANTLR start synpred9_InternalHelloXvars
    public final void synpred9_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1196:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1196:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1196:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1196:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1196:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1197:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1197:2: ( ( ruleOpMulti ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1198:1: ( ruleOpMulti )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1198:1: ( ruleOpMulti )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1199:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalHelloXvars2925);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalHelloXvars

    // $ANTLR start synpred10_InternalHelloXvars
    public final void synpred10_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1429:3: ( ( () 'as' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1429:4: ( () 'as' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1429:4: ( () 'as' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1429:5: () 'as'
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1429:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1430:1: 
        {
        }

        match(input,35,FOLLOW_35_in_synpred10_InternalHelloXvars3519); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalHelloXvars

    // $ANTLR start synpred11_InternalHelloXvars
    public final void synpred11_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1489:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1489:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1489:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1489:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1489:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1490:1: 
        {
        }

        match(input,36,FOLLOW_36_in_synpred11_InternalHelloXvars3673); if (state.failed) return ;
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1491:1: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1492:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1492:1: ( ruleValidID )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1493:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalHelloXvars3682);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalHelloXvars3688);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalHelloXvars

    // $ANTLR start synpred12_InternalHelloXvars
    public final void synpred12_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1547:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1547:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1547:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1547:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1547:10: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1548:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1548:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt80=3;
        switch ( input.LA(1) ) {
        case 36:
            {
            alt80=1;
            }
            break;
        case 37:
            {
            alt80=2;
            }
            break;
        case 38:
            {
            alt80=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 80, 0, input);

            throw nvae;
        }

        switch (alt80) {
            case 1 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1548:4: '.'
                {
                match(input,36,FOLLOW_36_in_synpred12_InternalHelloXvars3791); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1550:6: ( ( '?.' ) )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1550:6: ( ( '?.' ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1551:1: ( '?.' )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1551:1: ( '?.' )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1552:2: '?.'
                {
                match(input,37,FOLLOW_37_in_synpred12_InternalHelloXvars3805); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1557:6: ( ( '*.' ) )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1557:6: ( ( '*.' ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1558:1: ( '*.' )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1558:1: ( '*.' )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1559:2: '*.'
                {
                match(input,38,FOLLOW_38_in_synpred12_InternalHelloXvars3825); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalHelloXvars

    // $ANTLR start synpred13_InternalHelloXvars
    public final void synpred13_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1668:4: ( ( '(' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1669:1: ( '(' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1669:1: ( '(' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1670:2: '('
        {
        match(input,40,FOLLOW_40_in_synpred13_InternalHelloXvars4052); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalHelloXvars

    // $ANTLR start synpred14_InternalHelloXvars
    public final void synpred14_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1689:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1689:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1689:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1689:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1689:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1690:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1690:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt82=2;
        int LA82_0 = input.LA(1);

        if ( (LA82_0==RULE_ID||LA82_0==40||LA82_0==71) ) {
            alt82=1;
        }
        switch (alt82) {
            case 1 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1690:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1690:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1691:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1691:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1692:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloXvars4104);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1694:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop81:
                do {
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==39) ) {
                        alt81=1;
                    }


                    switch (alt81) {
                	case 1 :
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1694:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,39,FOLLOW_39_in_synpred14_InternalHelloXvars4111); if (state.failed) return ;
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1695:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1696:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1696:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1697:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloXvars4118);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop81;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1699:6: ( ( '|' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1700:1: ( '|' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1700:1: ( '|' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1701:2: '|'
        {
        match(input,43,FOLLOW_43_in_synpred14_InternalHelloXvars4132); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalHelloXvars

    // $ANTLR start synpred15_InternalHelloXvars
    public final void synpred15_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1768:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1769:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1769:1: ( ruleXClosure )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1770:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalHelloXvars4250);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalHelloXvars

    // $ANTLR start synpred16_InternalHelloXvars
    public final void synpred16_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2051:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2051:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2051:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2051:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2051:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt84=2;
        int LA84_0 = input.LA(1);

        if ( (LA84_0==RULE_ID||LA84_0==40||LA84_0==71) ) {
            alt84=1;
        }
        switch (alt84) {
            case 1 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2051:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2051:5: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2052:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2052:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2053:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXvars5023);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2055:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop83:
                do {
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==39) ) {
                        alt83=1;
                    }


                    switch (alt83) {
                	case 1 :
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2055:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,39,FOLLOW_39_in_synpred16_InternalHelloXvars5030); if (state.failed) return ;
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2056:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2057:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2057:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2058:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXvars5037);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop83;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2060:6: ( ( '|' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2061:1: ( '|' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2061:1: ( '|' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2062:2: '|'
        {
        match(input,43,FOLLOW_43_in_synpred16_InternalHelloXvars5051); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalHelloXvars

    // $ANTLR start synpred18_InternalHelloXvars
    public final void synpred18_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2421:4: ( 'else' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2421:6: 'else'
        {
        match(input,47,FOLLOW_47_in_synpred18_InternalHelloXvars5834); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalHelloXvars

    // $ANTLR start synpred19_InternalHelloXvars
    public final void synpred19_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2475:2: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2475:3: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2475:3: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2475:4: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2475:4: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2476:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2476:1: ( ruleValidID )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2477:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalHelloXvars5974);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,49,FOLLOW_49_in_synpred19_InternalHelloXvars5980); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalHelloXvars

    // $ANTLR start synpred20_InternalHelloXvars
    public final void synpred20_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3050:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3050:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3050:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3050:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3050:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3051:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3051:1: ( ruleJvmTypeReference )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3052:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred20_InternalHelloXvars7220);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3054:2: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3055:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3055:1: ( ruleValidID )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3056:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalHelloXvars7229);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalHelloXvars

    // $ANTLR start synpred21_InternalHelloXvars
    public final void synpred21_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3354:4: ( ( '(' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3355:1: ( '(' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3355:1: ( '(' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3356:2: '('
        {
        match(input,40,FOLLOW_40_in_synpred21_InternalHelloXvars7791); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalHelloXvars

    // $ANTLR start synpred22_InternalHelloXvars
    public final void synpred22_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3375:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3375:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3375:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3375:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3375:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3376:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3376:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt88=2;
        int LA88_0 = input.LA(1);

        if ( (LA88_0==RULE_ID||LA88_0==40||LA88_0==71) ) {
            alt88=1;
        }
        switch (alt88) {
            case 1 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3376:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3376:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3377:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3377:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3378:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalHelloXvars7843);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3380:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop87:
                do {
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==39) ) {
                        alt87=1;
                    }


                    switch (alt87) {
                	case 1 :
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3380:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,39,FOLLOW_39_in_synpred22_InternalHelloXvars7850); if (state.failed) return ;
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3381:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3382:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3382:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3383:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalHelloXvars7857);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop87;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3385:6: ( ( '|' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3386:1: ( '|' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3386:1: ( '|' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3387:2: '|'
        {
        match(input,43,FOLLOW_43_in_synpred22_InternalHelloXvars7871); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalHelloXvars

    // $ANTLR start synpred23_InternalHelloXvars
    public final void synpred23_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3454:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3455:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3455:1: ( ruleXClosure )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3456:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred23_InternalHelloXvars7989);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalHelloXvars

    // $ANTLR start synpred24_InternalHelloXvars
    public final void synpred24_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3651:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3651:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3651:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3651:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3651:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3652:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3652:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==RULE_ID||LA90_0==40||LA90_0==71) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3652:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3652:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3653:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3653:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3654:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalHelloXvars8480);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3656:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop89:
                do {
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==39) ) {
                        alt89=1;
                    }


                    switch (alt89) {
                	case 1 :
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3656:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,39,FOLLOW_39_in_synpred24_InternalHelloXvars8487); if (state.failed) return ;
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3657:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3658:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3658:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3659:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalHelloXvars8494);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop89;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3661:6: ( ( '|' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3662:1: ( '|' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3662:1: ( '|' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3663:2: '|'
        {
        match(input,43,FOLLOW_43_in_synpred24_InternalHelloXvars8508); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred24_InternalHelloXvars

    // $ANTLR start synpred25_InternalHelloXvars
    public final void synpred25_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3730:2: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3731:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3731:1: ( ruleXClosure )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3732:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred25_InternalHelloXvars8624);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalHelloXvars

    // $ANTLR start synpred26_InternalHelloXvars
    public final void synpred26_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4054:2: ( ( ruleXExpression ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4055:1: ( ruleXExpression )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4055:1: ( ruleXExpression )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4056:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred26_InternalHelloXvars9427);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalHelloXvars

    // $ANTLR start synpred27_InternalHelloXvars
    public final void synpred27_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4125:5: ( 'catch' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4125:7: 'catch'
        {
        match(input,70,FOLLOW_70_in_synpred27_InternalHelloXvars9572); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalHelloXvars

    // $ANTLR start synpred28_InternalHelloXvars
    public final void synpred28_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4144:5: ( 'finally' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4144:7: 'finally'
        {
        match(input,69,FOLLOW_69_in_synpred28_InternalHelloXvars9602); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalHelloXvars

    // $ANTLR start synpred30_InternalHelloXvars
    public final void synpred30_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4292:3: ( '.' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4293:2: '.'
        {
        match(input,36,FOLLOW_36_in_synpred30_InternalHelloXvars9949); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalHelloXvars

    // $ANTLR start synpred31_InternalHelloXvars
    public final void synpred31_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4341:2: ( ( () '[' ']' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4341:3: ( () '[' ']' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4341:3: ( () '[' ']' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4341:4: () '[' ']'
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4341:4: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4342:1: 
        {
        }

        match(input,42,FOLLOW_42_in_synpred31_InternalHelloXvars10101); if (state.failed) return ;
        match(input,44,FOLLOW_44_in_synpred31_InternalHelloXvars10105); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalHelloXvars

    // $ANTLR start synpred32_InternalHelloXvars
    public final void synpred32_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4495:4: ( '<' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4495:6: '<'
        {
        match(input,26,FOLLOW_26_in_synpred32_InternalHelloXvars10462); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalHelloXvars

    // Delegated rules

    public final boolean synpred26_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA27 dfa27 = new DFA27(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA77 dfa77 = new DFA77(this);
    static final String DFA27_eotS =
        "\75\uffff";
    static final String DFA27_eofS =
        "\1\2\74\uffff";
    static final String DFA27_minS =
        "\1\4\1\0\73\uffff";
    static final String DFA27_maxS =
        "\1\107\1\0\73\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\71\uffff\1\1";
    static final String DFA27_specialS =
        "\1\uffff\1\0\73\uffff}>";
    static final String[] DFA27_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\1\2\1\uffff\27\2\1\1\2\2\1\uffff\20"+
            "\2\1\uffff\13\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1668:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\34\uffff";
    static final String DFA26_eofS =
        "\34\uffff";
    static final String DFA26_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA26_maxS =
        "\1\107\2\0\31\uffff";
    static final String DFA26_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA26_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\2\5\10\uffff\1\5\12\uffff\1\5\2\uffff\2\5\11\uffff\1\2"+
            "\1\33\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3"+
            "\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1689:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_0==RULE_ID) ) {s = 1;}

                        else if ( (LA26_0==40) ) {s = 2;}

                        else if ( (LA26_0==71) && (synpred14_InternalHelloXvars())) {s = 3;}

                        else if ( (LA26_0==43) && (synpred14_InternalHelloXvars())) {s = 4;}

                        else if ( ((LA26_0>=RULE_INT && LA26_0<=RULE_STRING)||LA26_0==15||LA26_0==26||(LA26_0>=29 && LA26_0<=30)||LA26_0==42||LA26_0==46||LA26_0==48||LA26_0==50||(LA26_0>=54 && LA26_0<=56)||LA26_0==59||(LA26_0>=61 && LA26_0<=68)) ) {s = 5;}

                        else if ( (LA26_0==41) ) {s = 27;}

                         
                        input.seek(index26_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_1 = input.LA(1);

                         
                        int index26_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index26_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\75\uffff";
    static final String DFA28_eofS =
        "\1\2\74\uffff";
    static final String DFA28_minS =
        "\1\4\1\0\73\uffff";
    static final String DFA28_maxS =
        "\1\107\1\0\73\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\71\uffff\1\1";
    static final String DFA28_specialS =
        "\1\uffff\1\0\73\uffff}>";
    static final String[] DFA28_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\1\2\1\uffff\31\2\1\1\1\uffff\20\2\1"+
            "\uffff\13\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1768:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\36\uffff";
    static final String DFA34_eofS =
        "\36\uffff";
    static final String DFA34_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA34_maxS =
        "\1\107\2\0\33\uffff";
    static final String DFA34_acceptS =
        "\3\uffff\2\1\1\2\30\uffff";
    static final String DFA34_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1\2\5\10\uffff\1\5\12\uffff\1\5\2\uffff\2\5\11\uffff\1\2"+
            "\1\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff"+
            "\6\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "2051:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_0==RULE_ID) ) {s = 1;}

                        else if ( (LA34_0==40) ) {s = 2;}

                        else if ( (LA34_0==71) && (synpred16_InternalHelloXvars())) {s = 3;}

                        else if ( (LA34_0==43) && (synpred16_InternalHelloXvars())) {s = 4;}

                        else if ( ((LA34_0>=RULE_INT && LA34_0<=RULE_STRING)||LA34_0==15||LA34_0==26||(LA34_0>=29 && LA34_0<=30)||LA34_0==42||LA34_0==44||LA34_0==46||LA34_0==48||LA34_0==50||(LA34_0>=54 && LA34_0<=59)||(LA34_0>=61 && LA34_0<=68)) ) {s = 5;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA57_eotS =
        "\75\uffff";
    static final String DFA57_eofS =
        "\1\2\74\uffff";
    static final String DFA57_minS =
        "\1\4\1\0\73\uffff";
    static final String DFA57_maxS =
        "\1\107\1\0\73\uffff";
    static final String DFA57_acceptS =
        "\2\uffff\1\2\71\uffff\1\1";
    static final String DFA57_specialS =
        "\1\uffff\1\0\73\uffff}>";
    static final String[] DFA57_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\1\2\1\uffff\27\2\1\1\2\2\1\uffff\20"+
            "\2\1\uffff\13\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "3354:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_1 = input.LA(1);

                         
                        int index57_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index57_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\34\uffff";
    static final String DFA56_eofS =
        "\34\uffff";
    static final String DFA56_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA56_maxS =
        "\1\107\2\0\31\uffff";
    static final String DFA56_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA56_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\1\2\5\10\uffff\1\5\12\uffff\1\5\2\uffff\2\5\11\uffff\1\2"+
            "\1\33\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3"+
            "\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "3375:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_0 = input.LA(1);

                         
                        int index56_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA56_0==RULE_ID) ) {s = 1;}

                        else if ( (LA56_0==40) ) {s = 2;}

                        else if ( (LA56_0==71) && (synpred22_InternalHelloXvars())) {s = 3;}

                        else if ( (LA56_0==43) && (synpred22_InternalHelloXvars())) {s = 4;}

                        else if ( ((LA56_0>=RULE_INT && LA56_0<=RULE_STRING)||LA56_0==15||LA56_0==26||(LA56_0>=29 && LA56_0<=30)||LA56_0==42||LA56_0==46||LA56_0==48||LA56_0==50||(LA56_0>=54 && LA56_0<=56)||LA56_0==59||(LA56_0>=61 && LA56_0<=68)) ) {s = 5;}

                        else if ( (LA56_0==41) ) {s = 27;}

                         
                        input.seek(index56_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_1 = input.LA(1);

                         
                        int index56_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index56_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA56_2 = input.LA(1);

                         
                        int index56_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index56_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\75\uffff";
    static final String DFA58_eofS =
        "\1\2\74\uffff";
    static final String DFA58_minS =
        "\1\4\1\0\73\uffff";
    static final String DFA58_maxS =
        "\1\107\1\0\73\uffff";
    static final String DFA58_acceptS =
        "\2\uffff\1\2\71\uffff\1\1";
    static final String DFA58_specialS =
        "\1\uffff\1\0\73\uffff}>";
    static final String[] DFA58_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\1\2\1\uffff\31\2\1\1\1\uffff\20\2\1"+
            "\uffff\13\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "3454:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\34\uffff";
    static final String DFA64_eofS =
        "\34\uffff";
    static final String DFA64_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA64_maxS =
        "\1\107\2\0\31\uffff";
    static final String DFA64_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA64_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\1\2\5\10\uffff\1\5\12\uffff\1\5\2\uffff\2\5\11\uffff\1\2"+
            "\1\33\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3"+
            "\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "3651:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_0 = input.LA(1);

                         
                        int index64_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA64_0==RULE_ID) ) {s = 1;}

                        else if ( (LA64_0==40) ) {s = 2;}

                        else if ( (LA64_0==71) && (synpred24_InternalHelloXvars())) {s = 3;}

                        else if ( (LA64_0==43) && (synpred24_InternalHelloXvars())) {s = 4;}

                        else if ( ((LA64_0>=RULE_INT && LA64_0<=RULE_STRING)||LA64_0==15||LA64_0==26||(LA64_0>=29 && LA64_0<=30)||LA64_0==42||LA64_0==46||LA64_0==48||LA64_0==50||(LA64_0>=54 && LA64_0<=56)||LA64_0==59||(LA64_0>=61 && LA64_0<=68)) ) {s = 5;}

                        else if ( (LA64_0==41) ) {s = 27;}

                         
                        input.seek(index64_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\75\uffff";
    static final String DFA65_eofS =
        "\1\2\74\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\73\uffff";
    static final String DFA65_maxS =
        "\1\107\1\0\73\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\71\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\73\uffff}>";
    static final String[] DFA65_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\1\2\1\uffff\31\2\1\1\1\uffff\20\2\1"+
            "\uffff\13\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "3730:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\75\uffff";
    static final String DFA67_eofS =
        "\1\31\74\uffff";
    static final String DFA67_minS =
        "\1\4\30\0\44\uffff";
    static final String DFA67_maxS =
        "\1\107\30\0\44\uffff";
    static final String DFA67_acceptS =
        "\31\uffff\1\2\42\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\44\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\1\1\15\1\17\6\uffff\1\31\1\uffff\1\2\1\uffff\11\31\1\10\2"+
            "\31\1\4\1\3\11\31\1\30\1\31\1\12\1\uffff\2\31\1\21\1\31\1\7"+
            "\1\31\1\6\3\31\1\22\1\23\1\24\2\31\1\11\1\uffff\1\5\1\13\1\14"+
            "\1\16\1\20\1\25\1\26\1\27\3\31",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "4054:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_2 = input.LA(1);

                         
                        int index67_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_3 = input.LA(1);

                         
                        int index67_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA67_4 = input.LA(1);

                         
                        int index67_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA67_5 = input.LA(1);

                         
                        int index67_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA67_6 = input.LA(1);

                         
                        int index67_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA67_7 = input.LA(1);

                         
                        int index67_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA67_8 = input.LA(1);

                         
                        int index67_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA67_9 = input.LA(1);

                         
                        int index67_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA67_10 = input.LA(1);

                         
                        int index67_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA67_11 = input.LA(1);

                         
                        int index67_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA67_12 = input.LA(1);

                         
                        int index67_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA67_13 = input.LA(1);

                         
                        int index67_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA67_14 = input.LA(1);

                         
                        int index67_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA67_15 = input.LA(1);

                         
                        int index67_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA67_16 = input.LA(1);

                         
                        int index67_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA67_17 = input.LA(1);

                         
                        int index67_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA67_18 = input.LA(1);

                         
                        int index67_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA67_19 = input.LA(1);

                         
                        int index67_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA67_20 = input.LA(1);

                         
                        int index67_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA67_21 = input.LA(1);

                         
                        int index67_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA67_22 = input.LA(1);

                         
                        int index67_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA67_23 = input.LA(1);

                         
                        int index67_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA67_24 = input.LA(1);

                         
                        int index67_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index67_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA77_eotS =
        "\75\uffff";
    static final String DFA77_eofS =
        "\1\2\74\uffff";
    static final String DFA77_minS =
        "\1\4\1\0\73\uffff";
    static final String DFA77_maxS =
        "\1\107\1\0\73\uffff";
    static final String DFA77_acceptS =
        "\2\uffff\1\2\71\uffff\1\1";
    static final String DFA77_specialS =
        "\1\uffff\1\0\73\uffff}>";
    static final String[] DFA77_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\1\2\1\uffff\11\2\1\1\20\2\1\uffff\20"+
            "\2\1\uffff\13\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
    static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
    static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
    static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
    static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
    static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
    static final short[][] DFA77_transition;

    static {
        int numStates = DFA77_transitionS.length;
        DFA77_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = DFA77_eot;
            this.eof = DFA77_eof;
            this.min = DFA77_min;
            this.max = DFA77_max;
            this.accept = DFA77_accept;
            this.special = DFA77_special;
            this.transition = DFA77_transition;
        }
        public String getDescription() {
            return "4495:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_1 = input.LA(1);

                         
                        int index77_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalHelloXvars()) ) {s = 60;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index77_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 77, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x0600000000002802L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleModel153 = new BitSet(new long[]{0x0600000000002002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel175 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard375 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedNameWithWildcard394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGreeting483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting500 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGreeting517 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleGreeting538 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleGreeting550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment744 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment760 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment810 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment863 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpSingleAssign974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpMultiAssign1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1158 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1211 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1234 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpOr1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1417 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1470 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1493 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpAnd1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1676 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1729 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1752 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpEquality1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpEquality1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1956 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_22_in_ruleXRelationalExpression1992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2017 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2078 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2101 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpCompare2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpCompare2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2344 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2397 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2420 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2624 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2677 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2700 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpAdd2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpAdd2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2904 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2957 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2980 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpMulti3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpMulti3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpMulti3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpMulti3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3233 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOpUnary3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpUnary3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpUnary3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3503 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleXCastedExpression3538 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3561 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3656 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_36_in_ruleXMemberFeatureCall3705 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3728 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3744 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3766 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_36_in_ruleXMemberFeatureCall3852 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_37_in_ruleXMemberFeatureCall3876 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall3913 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_26_in_ruleXMemberFeatureCall3942 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3963 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall3976 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3997 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_25_in_ruleXMemberFeatureCall4011 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4036 = new BitSet(new long[]{0x0000057000000002L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4070 = new BitSet(new long[]{0xE9C54F0064008070L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4155 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4183 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall4196 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4217 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4234 = new BitSet(new long[]{0x0000047000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4267 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral4834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral4861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral4888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure4950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure4960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXClosure5006 = new BitSet(new long[]{0xEFC55D0064008070L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5077 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_ruleXClosure5090 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5111 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_ruleXClosure5133 = new BitSet(new long[]{0xEFC5550064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5170 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXClosure5182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5284 = new BitSet(new long[]{0xEFC5650064008072L,0x000000000000001FL});
    public static final BitSet FOLLOW_45_in_ruleXExpressionInClosure5297 = new BitSet(new long[]{0xEFC5450064008072L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5455 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_ruleXShortClosure5468 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5489 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_ruleXShortClosure5511 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXParenthesizedExpression5630 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5652 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXParenthesizedExpression5663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXIfExpression5755 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXIfExpression5767 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5788 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXIfExpression5800 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5821 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleXIfExpression5842 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression5958 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression5999 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression6011 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6035 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression6047 = new BitSet(new long[]{0x0022010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6068 = new BitSet(new long[]{0x003A010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6082 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression6094 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6115 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6221 = new BitSet(new long[]{0x0022000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXCasePart6235 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6256 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXCasePart6270 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXForLoopExpression6383 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXForLoopExpression6395 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6416 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXForLoopExpression6428 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6449 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXForLoopExpression6461 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXWhileExpression6574 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXWhileExpression6586 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6607 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXWhileExpression6619 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXDoWhileExpression6732 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6753 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXDoWhileExpression6765 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXDoWhileExpression6777 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6798 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXDoWhileExpression6810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXBlockExpression6902 = new BitSet(new long[]{0xEFD5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6924 = new BitSet(new long[]{0xEFD5650064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_45_in_ruleXBlockExpression6937 = new BitSet(new long[]{0xEFD5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_52_in_ruleXBlockExpression6953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXVariableDeclaration7171 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_58_in_ruleXVariableDeclaration7202 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7271 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7300 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleXVariableDeclaration7314 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7667 = new BitSet(new long[]{0x0800000004000010L});
    public static final BitSet FOLLOW_26_in_ruleXFeatureCall7681 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7702 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_39_in_ruleXFeatureCall7715 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7736 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_25_in_ruleXFeatureCall7750 = new BitSet(new long[]{0x0800000004000010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7775 = new BitSet(new long[]{0x0000050000000002L});
    public static final BitSet FOLLOW_40_in_ruleXFeatureCall7809 = new BitSet(new long[]{0xE9C54F0064008070L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7894 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7922 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleXFeatureCall7935 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7956 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall7973 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleIdOrSuper8126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8225 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleStaticQualifier8243 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXConstructorCall8340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8363 = new BitSet(new long[]{0x0000010004000000L});
    public static final BitSet FOLLOW_26_in_ruleXConstructorCall8376 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8397 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_39_in_ruleXConstructorCall8410 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8431 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_25_in_ruleXConstructorCall8445 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXConstructorCall8459 = new BitSet(new long[]{0xE9C54F0064008070L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8531 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8559 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleXConstructorCall8572 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8593 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall8610 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall8641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXBooleanLiteral8735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXBooleanLiteral8759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXNullLiteral8865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral8911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral8962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXTypeLiteral9161 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXTypeLiteral9173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9196 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXTypeLiteral9208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXThrowExpression9300 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXReturnExpression9413 = new BitSet(new long[]{0xE9C5450064008072L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXTryCatchFinallyExpression9537 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9588 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_ruleXTryCatchFinallyExpression9610 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXTryCatchFinallyExpression9654 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause9723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXCatchClause9768 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXCatchClause9781 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause9802 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXCatchClause9814 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9930 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleQualifiedName9958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9981 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10086 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleJvmTypeReference10124 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleJvmTypeReference10136 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXFunctionTypeRef10251 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10272 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleXFunctionTypeRef10285 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10306 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_ruleXFunctionTypeRef10320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleXFunctionTypeRef10334 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10449 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleJvmParameterizedTypeReference10470 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10492 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_39_in_ruleJvmParameterizedTypeReference10505 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10526 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_25_in_ruleJvmParameterizedTypeReference10540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleJvmWildcardTypeReference10753 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound10850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleJvmUpperBound10887 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmUpperBoundAnded10991 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleJvmLowerBound11095 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloXvars831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalHelloXvars1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalHelloXvars1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalHelloXvars1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred5_InternalHelloXvars1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalHelloXvars2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalHelloXvars2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalHelloXvars2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalHelloXvars2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred10_InternalHelloXvars3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred11_InternalHelloXvars3673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalHelloXvars3682 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalHelloXvars3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred12_InternalHelloXvars3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred12_InternalHelloXvars3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred12_InternalHelloXvars3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred13_InternalHelloXvars4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloXvars4104 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_synpred14_InternalHelloXvars4111 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloXvars4118 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_synpred14_InternalHelloXvars4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalHelloXvars4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXvars5023 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_synpred16_InternalHelloXvars5030 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXvars5037 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_synpred16_InternalHelloXvars5051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred18_InternalHelloXvars5834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalHelloXvars5974 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_synpred19_InternalHelloXvars5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred20_InternalHelloXvars7220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalHelloXvars7229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred21_InternalHelloXvars7791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalHelloXvars7843 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_synpred22_InternalHelloXvars7850 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalHelloXvars7857 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_synpred22_InternalHelloXvars7871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred23_InternalHelloXvars7989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalHelloXvars8480 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_synpred24_InternalHelloXvars8487 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalHelloXvars8494 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_synpred24_InternalHelloXvars8508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred25_InternalHelloXvars8624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred26_InternalHelloXvars9427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_synpred27_InternalHelloXvars9572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_synpred28_InternalHelloXvars9602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred30_InternalHelloXvars9949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred31_InternalHelloXvars10101 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_synpred31_InternalHelloXvars10105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred32_InternalHelloXvars10462 = new BitSet(new long[]{0x0000000000000002L});

}