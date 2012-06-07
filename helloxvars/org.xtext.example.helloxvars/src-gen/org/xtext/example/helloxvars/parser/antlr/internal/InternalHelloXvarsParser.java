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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'Hello'", "'from'", "'!'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
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
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=6;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int RULE_DECIMAL=8;
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
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
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
    public static final int RULE_WS=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

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

                if ( (LA1_0==13) ) {
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

                if ( ((LA2_0>=63 && LA2_0<=64)) ) {
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

                if ( (LA3_0==15) ) {
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
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImport259); if (state.failed) return current;
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

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:210:2: kw= '.*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildcard394); if (state.failed) return current;
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
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleGreeting483); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleGreeting517); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleGreeting550); if (state.failed) return current;
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

                if ( (LA6_1==18) ) {
                    alt6=1;
                }
                else if ( (LA6_1==EOF||(LA6_1>=RULE_ID && LA6_1<=RULE_DECIMAL)||LA6_1==15||LA6_1==17||(LA6_1>=19 && LA6_1<=48)||(LA6_1>=50 && LA6_1<=76)) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_DECIMAL)||LA6_0==17||LA6_0==28||(LA6_0>=35 && LA6_0<=36)||LA6_0==46||LA6_0==48||LA6_0==52||LA6_0==54||LA6_0==56||(LA6_0>=60 && LA6_0<=62)||LA6_0==65||(LA6_0>=67 && LA6_0<=74)) ) {
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

                    if ( (LA5_0==19) ) {
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
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpSingleAssign974); if (state.failed) return current;
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
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpMultiAssign1062); if (state.failed) return current;
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

                if ( (LA7_0==20) ) {
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
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpOr1321); if (state.failed) return current;
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

                if ( (LA8_0==21) ) {
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
            kw=(Token)match(input,21,FOLLOW_21_in_ruleOpAnd1580); if (state.failed) return current;
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

                if ( (LA9_0==22) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred4_InternalHelloXvars()) ) {
                        alt9=1;
                    }


                }
                else if ( (LA9_0==23) ) {
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

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
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
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpEquality1840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:795:2: kw= '!='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpEquality1859); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:817:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:820:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:821:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:821:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:822:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:830:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop11:
            do {
                int alt11=3;
                switch ( input.LA(1) ) {
                case 27:
                    {
                    int LA11_2 = input.LA(2);

                    if ( (synpred6_InternalHelloXvars()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 28:
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

                    if ( (synpred5_InternalHelloXvars()) ) {
                        alt11=1;
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
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:830:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:830:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:830:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
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

            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXRelationalExpression1992); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:842:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:843:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:843:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:844:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2015);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
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


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:861:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:861:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:861:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:861:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:861:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:866:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:866:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:866:7: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:867:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:872:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:873:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:873:1: ( ruleOpCompare )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:874:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2076);
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

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:887:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:888:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:888:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:889:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2099);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:913:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:914:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:915:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2139);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2150); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:922:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:925:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:926:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:926:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
                }
                break;
            case 28:
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:927:2: kw= '>='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare2188); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:934:2: kw= '<='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:941:2: kw= '>'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2226); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:948:2: kw= '<'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpCompare2245); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:961:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:962:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:963:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2285);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2295); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:970:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:973:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:974:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:974:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:975:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2342);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:983:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:983:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:983:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:983:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:988:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:988:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:988:7: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:989:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:994:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:995:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:995:1: ( ruleOpOther )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:996:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2395);
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

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1009:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1010:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1010:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1011:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2418);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1035:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1036:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1037:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2457);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2468); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1044:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1047:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1048:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1048:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt16=8;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt16=1;
                }
                break;
            case 30:
                {
                alt16=2;
                }
                break;
            case 31:
                {
                alt16=3;
                }
                break;
            case 27:
                {
                alt16=4;
                }
                break;
            case 28:
                {
                alt16=5;
                }
                break;
            case 32:
                {
                alt16=6;
                }
                break;
            case 33:
                {
                alt16=7;
                }
                break;
            case 34:
                {
                alt16=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1049:2: kw= '->'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2506); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1056:2: kw= '..'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1063:2: kw= '=>'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2544); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1069:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1069:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1070:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2564); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1075:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==27) ) {
                        int LA14_1 = input.LA(2);

                        if ( (LA14_1==27) && (synpred8_InternalHelloXvars())) {
                            alt14=1;
                        }
                        else if ( (LA14_1==EOF||(LA14_1>=RULE_ID && LA14_1<=RULE_DECIMAL)||LA14_1==17||LA14_1==28||(LA14_1>=35 && LA14_1<=36)||LA14_1==46||LA14_1==48||LA14_1==52||LA14_1==54||LA14_1==56||(LA14_1>=60 && LA14_1<=62)||LA14_1==65||(LA14_1>=67 && LA14_1<=74)) ) {
                            alt14=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1075:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1075:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1075:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1079:5: (kw= '>' kw= '>' )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1080:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2595); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2608); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1093:2: kw= '>'
                            {
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2629); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1099:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1099:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1100:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2651); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1105:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==28) ) {
                        int LA15_1 = input.LA(2);

                        if ( (synpred9_InternalHelloXvars()) ) {
                            alt15=1;
                        }
                        else if ( (true) ) {
                            alt15=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1105:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1105:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1105:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1109:5: (kw= '<' kw= '<' )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1110:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2682); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2695); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1123:2: kw= '<'
                            {
                            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2716); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1130:2: kw= '<>'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2737); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1137:2: kw= '?:'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2756); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1144:2: kw= '<=>'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOther2775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_7()); 
                          
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1157:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1158:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1159:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2815);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2825); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1166:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1169:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1170:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1170:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1171:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2872);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1179:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    int LA17_2 = input.LA(2);

                    if ( (synpred10_InternalHelloXvars()) ) {
                        alt17=1;
                    }


                }
                else if ( (LA17_0==36) ) {
                    int LA17_3 = input.LA(2);

                    if ( (synpred10_InternalHelloXvars()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1179:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1179:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1179:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1184:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1184:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1184:7: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1185:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1190:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1191:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1191:1: ( ruleOpAdd )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1192:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2925);
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

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1205:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1206:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1206:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1207:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2948);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1231:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1232:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1233:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2987);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2998); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1240:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1243:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1244:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1244:1: (kw= '+' | kw= '-' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            else if ( (LA18_0==36) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1245:2: kw= '+'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpAdd3036); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1252:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpAdd3055); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1265:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1266:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1267:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3095);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3105); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1274:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1277:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1278:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1278:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1279:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3152);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1287:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop19:
            do {
                int alt19=2;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    int LA19_2 = input.LA(2);

                    if ( (synpred11_InternalHelloXvars()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA19_3 = input.LA(2);

                    if ( (synpred11_InternalHelloXvars()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA19_4 = input.LA(2);

                    if ( (synpred11_InternalHelloXvars()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA19_5 = input.LA(2);

                    if ( (synpred11_InternalHelloXvars()) ) {
                        alt19=1;
                    }


                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1287:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1287:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1287:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1292:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1292:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1292:7: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1293:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1298:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1299:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1299:1: ( ruleOpMulti )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1300:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3205);
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

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1313:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1314:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1314:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1315:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3228);
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
            	    break loop19;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1339:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1340:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1341:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3267);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3278); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1348:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1351:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1352:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1352:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt20=1;
                }
                break;
            case 38:
                {
                alt20=2;
                }
                break;
            case 39:
                {
                alt20=3;
                }
                break;
            case 40:
                {
                alt20=4;
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1353:2: kw= '*'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1360:2: kw= '**'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpMulti3335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1367:2: kw= '/'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpMulti3354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1374:2: kw= '%'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpMulti3373); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1387:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1388:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1389:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3413);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3423); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1396:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1399:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1400:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1400:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17||(LA21_0>=35 && LA21_0<=36)) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_DECIMAL)||LA21_0==28||LA21_0==46||LA21_0==48||LA21_0==52||LA21_0==54||LA21_0==56||(LA21_0>=60 && LA21_0<=62)||LA21_0==65||(LA21_0>=67 && LA21_0<=74)) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1400:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1400:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1400:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1400:3: ()
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1401:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1406:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1407:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1407:1: ( ruleOpUnary )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1408:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3481);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1421:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1422:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1422:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1423:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3502);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1441:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3531);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1457:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1458:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1459:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3567);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3578); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1466:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1469:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1470:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1470:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt22=1;
                }
                break;
            case 36:
                {
                alt22=2;
                }
                break;
            case 35:
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1471:2: kw= '!'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleOpUnary3616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1478:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpUnary3635); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1485:2: kw= '+'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpUnary3654); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1498:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1499:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1500:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3694);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3704); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1507:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1510:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1511:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1511:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1512:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3751);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1520:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==41) ) {
                    int LA23_2 = input.LA(2);

                    if ( (synpred12_InternalHelloXvars()) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1520:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1520:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1520:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1522:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1522:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1522:6: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1523:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXCastedExpression3786); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1532:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1533:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1533:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1534:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3809);
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
            	    break loop23;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1558:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1559:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1560:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3847);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3857); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1567:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1570:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1571:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1571:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1572:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3904);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1580:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop31:
            do {
                int alt31=3;
                switch ( input.LA(1) ) {
                case 42:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred13_InternalHelloXvars()) ) {
                        alt31=1;
                    }
                    else if ( (synpred14_InternalHelloXvars()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (synpred14_InternalHelloXvars()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA31_4 = input.LA(2);

                    if ( (synpred14_InternalHelloXvars()) ) {
                        alt31=2;
                    }


                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1580:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1580:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1580:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1580:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1580:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1586:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1586:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1586:26: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1587:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall3953); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1596:1: ( ( ruleValidID ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1597:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1597:1: ( ruleValidID )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1598:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3976);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3992);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1619:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1620:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1620:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1621:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4014);
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
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1638:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1638:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1638:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1638:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1638:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1654:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1654:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1654:8: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1655:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1660:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt24=3;
            	    switch ( input.LA(1) ) {
            	    case 42:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1660:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4100); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1665:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1665:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1666:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1666:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1667:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4124); if (state.failed) return current;
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
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1681:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1681:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1682:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1682:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1683:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4161); if (state.failed) return current;
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

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1696:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==28) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1696:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall4190); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1700:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1701:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1701:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1702:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4211);
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

            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1718:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop25:
            	            do {
            	                int alt25=2;
            	                int LA25_0 = input.LA(1);

            	                if ( (LA25_0==45) ) {
            	                    alt25=1;
            	                }


            	                switch (alt25) {
            	            	case 1 :
            	            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1718:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4224); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1722:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1723:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1723:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1724:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4245);
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
            	            	    break loop25;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall4259); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1744:3: ( ( ruleValidID ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1745:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1745:1: ( ruleValidID )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1746:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4284);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1759:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt29=2;
            	    alt29 = dfa29.predict(input);
            	    switch (alt29) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1759:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1759:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1759:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1766:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1767:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4318); if (state.failed) return current;
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

            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1780:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt28=3;
            	            alt28 = dfa28.predict(input);
            	            switch (alt28) {
            	                case 1 :
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1780:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1780:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1780:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1797:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1798:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4403);
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
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1815:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1815:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1815:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1815:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1816:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1816:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1817:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4431);
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

            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1833:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop27:
            	                    do {
            	                        int alt27=2;
            	                        int LA27_0 = input.LA(1);

            	                        if ( (LA27_0==45) ) {
            	                            alt27=1;
            	                        }


            	                        switch (alt27) {
            	                    	case 1 :
            	                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1833:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4444); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1837:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1838:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1838:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1839:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4465);
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
            	                    	    break loop27;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4482); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1859:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt30=2;
            	    alt30 = dfa30.predict(input);
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1859:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1862:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1863:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4517);
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
            	    break loop31;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1887:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1888:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1889:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4557);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4567); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1896:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1899:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1900:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1900:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt32=13;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1901:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4614);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1911:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4641);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1921:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4668);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1931:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4695);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1941:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4722);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1951:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4749);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1961:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4776);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1971:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4803);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1981:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4830);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1991:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4857);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2001:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4884);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2011:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4911);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2021:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4938);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2037:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2038:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2039:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4973);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4983); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2046:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XNumberLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2049:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2050:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2050:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt33=6;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) && (synpred18_InternalHelloXvars())) {
                alt33=1;
            }
            else if ( ((LA33_0>=68 && LA33_0<=69)) ) {
                alt33=2;
            }
            else if ( ((LA33_0>=RULE_HEX && LA33_0<=RULE_DECIMAL)) ) {
                alt33=3;
            }
            else if ( (LA33_0==70) ) {
                alt33=4;
            }
            else if ( (LA33_0==RULE_STRING) ) {
                alt33=5;
            }
            else if ( (LA33_0==71) ) {
                alt33=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2050:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2050:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2050:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5043);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2063:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5071);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2073:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5098);
                    this_XNumberLiteral_2=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2083:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5125);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2093:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5152);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2103:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5179);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2119:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2120:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2121:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5214);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5224); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2128:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2131:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2132:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2132:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2132:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2132:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2132:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2134:5: ( () otherlv_1= '[' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2134:6: () otherlv_1= '['
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2134:6: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2135:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXClosure5284); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2144:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2144:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2159:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2159:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2159:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID||LA35_0==31||LA35_0==46) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2159:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2159:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2160:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2160:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2161:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5357);
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

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2177:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==45) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2177:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleXClosure5370); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2181:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2182:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2182:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2183:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5391);
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
                            	    break loop34;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2199:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2200:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2200:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2201:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,49,FOLLOW_49_in_ruleXClosure5413); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_1_0_1_0());
                          
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

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2214:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2215:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2215:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2216:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5450);
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

            otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleXClosure5462); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_3());
                  
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2244:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2245:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2246:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5498);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5508); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2253:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2256:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2257:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2257:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2257:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2257:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2258:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2263:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_DECIMAL)||LA38_0==17||LA38_0==28||(LA38_0>=35 && LA38_0<=36)||LA38_0==46||LA38_0==48||LA38_0==52||LA38_0==54||LA38_0==56||(LA38_0>=60 && LA38_0<=65)||(LA38_0>=67 && LA38_0<=74)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2263:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2263:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2264:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2264:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2265:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5564);
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

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2281:2: (otherlv_2= ';' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==51) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2281:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleXExpressionInClosure5577); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2293:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2294:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2295:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5617);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5627); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2302:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2305:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2306:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2306:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2306:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2306:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2306:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2322:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2322:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2322:7: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2323:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2328:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||LA40_0==31||LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2328:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2328:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2329:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2329:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2330:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5735);
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

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2346:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==45) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2346:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXShortClosure5748); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2350:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2351:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2351:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2352:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5769);
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
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2368:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2369:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2369:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2370:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,49,FOLLOW_49_in_ruleXShortClosure5791); if (state.failed) return current;
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

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2383:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2384:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2384:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2385:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5827);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2409:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2410:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2411:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5863);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5873); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2418:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2421:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2422:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2422:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2422:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleXParenthesizedExpression5910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5932);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXParenthesizedExpression5943); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2447:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2448:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2449:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5979);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5989); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2456:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2459:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2460:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2460:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2460:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2460:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2461:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXIfExpression6035); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXIfExpression6047); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2474:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2475:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2475:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2476:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6068);
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

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXIfExpression6080); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2496:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2497:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2497:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2498:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6101);
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

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2514:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==53) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred22_InternalHelloXvars()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2514:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2514:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2514:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleXIfExpression6122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2519:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2520:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2520:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2521:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6144);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2545:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2546:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2547:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6182);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6192); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2554:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        AntlrDatatypeRuleToken lv_localVarName_6_0 = null;

        EObject lv_switch_8_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2557:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2558:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2558:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2558:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2558:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2559:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6238); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2568:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_DECIMAL)||LA43_0==17||LA43_0==28||(LA43_0>=35 && LA43_0<=36)||LA43_0==48||LA43_0==52||LA43_0==54||LA43_0==56||(LA43_0>=60 && LA43_0<=62)||LA43_0==65||(LA43_0>=67 && LA43_0<=74)) ) {
                alt43=1;
            }
            else if ( (LA43_0==46) ) {
                int LA43_2 = input.LA(2);

                if ( (LA43_2==RULE_ID) ) {
                    int LA43_3 = input.LA(3);

                    if ( ((LA43_3>=18 && LA43_3<=44)||(LA43_3>=46 && LA43_3<=48)||LA43_3==66) ) {
                        alt43=1;
                    }
                    else if ( (LA43_3==55) && (synpred24_InternalHelloXvars())) {
                        alt43=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA43_2>=RULE_STRING && LA43_2<=RULE_DECIMAL)||LA43_2==17||LA43_2==28||(LA43_2>=35 && LA43_2<=36)||LA43_2==46||LA43_2==48||LA43_2==52||LA43_2==54||LA43_2==56||(LA43_2>=60 && LA43_2<=62)||LA43_2==65||(LA43_2>=67 && LA43_2<=74)) ) {
                    alt43=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2568:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2568:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2568:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2568:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_ID) ) {
                        int LA42_1 = input.LA(2);

                        if ( (LA42_1==55) && (synpred23_InternalHelloXvars())) {
                            alt42=1;
                        }
                    }
                    switch (alt42) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2568:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2573:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2573:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2573:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2574:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2574:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2575:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6281);
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

                            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6293); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2595:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2596:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2596:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2597:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6317);
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


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2614:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2614:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2614:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2614:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2614:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2620:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2620:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleXSwitchExpression6361); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2624:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2625:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2625:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2626:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6382);
                    lv_localVarName_6_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_6_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6394); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2646:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2647:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2647:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2648:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6417);
                    lv_switch_8_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_8_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,47,FOLLOW_47_in_ruleXSwitchExpression6429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6443); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2672:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID||LA44_0==31||LA44_0==46||LA44_0==55||LA44_0==59) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2673:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2673:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2674:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6464);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_11_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2690:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==57) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2690:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6478); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2698:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2699:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2699:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2700:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6511);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_14_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression6525); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2728:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2729:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2730:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6561);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6571); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2737:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2740:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2741:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2741:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2741:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2741:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==31||LA46_0==46) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2742:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2742:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2743:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6617);
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

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2759:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==59) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2759:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXCasePart6631); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2763:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2764:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2764:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2765:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6652);
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

            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleXCasePart6666); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2785:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2786:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2786:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2787:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6687);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2811:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2812:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2813:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6723);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6733); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2820:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2823:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2824:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2824:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2824:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2824:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2825:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXForLoopExpression6779); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXForLoopExpression6791); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2838:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2839:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2839:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2840:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6812);
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

            otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleXForLoopExpression6824); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2860:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2861:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2861:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2862:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6845);
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

            otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleXForLoopExpression6857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2882:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2883:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2883:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2884:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6878);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2908:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2909:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2910:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6914);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6924); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2917:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2920:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2921:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2921:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2921:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2921:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2922:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXWhileExpression6970); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXWhileExpression6982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2935:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2936:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2936:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2937:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7003);
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

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXWhileExpression7015); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2957:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2958:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2958:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2959:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7036);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2983:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2984:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2985:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7072);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7082); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2992:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2995:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2996:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2996:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2996:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2996:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2997:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXDoWhileExpression7128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3006:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3007:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3007:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3008:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7149);
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

            otherlv_3=(Token)match(input,61,FOLLOW_61_in_ruleXDoWhileExpression7161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleXDoWhileExpression7173); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3032:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3033:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3033:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3034:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7194);
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

            otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleXDoWhileExpression7206); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3062:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3063:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3064:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7242);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7252); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3071:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3074:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3075:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3075:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3075:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3075:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3076:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXBlockExpression7298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3085:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_DECIMAL)||LA49_0==17||LA49_0==28||(LA49_0>=35 && LA49_0<=36)||LA49_0==46||LA49_0==48||LA49_0==52||LA49_0==54||LA49_0==56||(LA49_0>=60 && LA49_0<=65)||(LA49_0>=67 && LA49_0<=74)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3085:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3085:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3086:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3086:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3087:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7320);
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

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3103:2: (otherlv_3= ';' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==51) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3103:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleXBlockExpression7333); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_4=(Token)match(input,58,FOLLOW_58_in_ruleXBlockExpression7349); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3119:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3120:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3121:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7385);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7395); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3128:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3131:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3132:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3132:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=63 && LA50_0<=64)) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_DECIMAL)||LA50_0==17||LA50_0==28||(LA50_0>=35 && LA50_0<=36)||LA50_0==46||LA50_0==48||LA50_0==52||LA50_0==54||LA50_0==56||(LA50_0>=60 && LA50_0<=62)||LA50_0==65||(LA50_0>=67 && LA50_0<=74)) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3133:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7442);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3143:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7469);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3159:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3160:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3161:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7504);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7514); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3168:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3171:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3172:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3172:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3172:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3172:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3173:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3178:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==63) ) {
                alt51=1;
            }
            else if ( (LA51_0==64) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3178:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3178:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3179:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3179:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3180:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,63,FOLLOW_63_in_ruleXVariableDeclaration7567); if (state.failed) return current;
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3194:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleXVariableDeclaration7598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3198:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (synpred25_InternalHelloXvars()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA52_0==46) && (synpred25_InternalHelloXvars())) {
                alt52=1;
            }
            else if ( (LA52_0==31) && (synpred25_InternalHelloXvars())) {
                alt52=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3198:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3198:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3198:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3206:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3206:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3206:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3207:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3207:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3208:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7646);
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

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3224:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3225:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3225:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3226:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7667);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3243:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3243:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3244:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3244:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3245:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7696);
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

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3261:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==18) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3261:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleXVariableDeclaration7710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3265:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3266:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3266:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3267:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7731);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3291:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3292:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3293:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7769);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7779); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3300:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3303:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3304:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3304:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3304:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3304:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==RULE_ID||LA54_1==28||LA54_1==42||LA54_1==48) ) {
                    alt54=1;
                }
            }
            else if ( (LA54_0==31||LA54_0==46) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3305:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3305:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3306:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7825);
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

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3322:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3323:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3323:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3324:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7847);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3348:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3349:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3350:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7883);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7893); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3357:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3360:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3361:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3361:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3361:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3361:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3362:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3362:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3363:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7939);
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

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3379:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3380:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3380:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3381:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7960);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3405:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3406:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3407:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7996);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8006); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3414:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3417:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3418:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3418:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3418:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3418:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3419:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3424:2: ( ( ruleStaticQualifier ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==66) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3425:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3425:1: ( ruleStaticQualifier )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3426:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8063);
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

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3439:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==28) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3439:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall8077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3443:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3444:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3444:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3445:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8098);
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

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3461:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==45) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3461:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXFeatureCall8111); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3465:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3466:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3466:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3467:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8132);
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
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall8146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3487:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3488:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3488:1: ( ruleIdOrSuper )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3489:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8171);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3502:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3502:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3502:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3502:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3509:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3510:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,46,FOLLOW_46_in_ruleXFeatureCall8205); if (state.failed) return current;
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

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3523:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt59=3;
                    alt59 = dfa59.predict(input);
                    switch (alt59) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3523:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3523:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3523:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3540:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3541:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8290);
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
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3558:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3558:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3558:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3558:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3559:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3559:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3560:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8318);
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

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3576:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==45) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3576:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,45,FOLLOW_45_in_ruleXFeatureCall8331); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3580:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3581:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3581:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3582:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8352);
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
                            	    break loop58;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,47,FOLLOW_47_in_ruleXFeatureCall8369); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3602:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3602:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3605:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3606:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8404);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3630:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3631:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3632:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8442);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8453); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3639:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3642:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3643:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3643:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            else if ( (LA62_0==65) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3644:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8500);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3656:2: kw= 'super'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleIdOrSuper8524); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3669:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3670:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3671:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8565);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8576); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3678:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3681:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3682:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3682:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_ID) ) {
                    int LA63_2 = input.LA(2);

                    if ( (LA63_2==66) ) {
                        alt63=1;
                    }


                }


                switch (alt63) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3683:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8623);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,66,FOLLOW_66_in_ruleStaticQualifier8641); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3707:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3708:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3709:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8682);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8692); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3716:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3719:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3720:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3720:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3720:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3720:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3721:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXConstructorCall8738); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3730:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3731:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3731:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3732:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8761);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3745:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3745:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3745:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3745:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall8782); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3750:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3751:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3751:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3752:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8804);
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

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3768:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==45) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3768:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleXConstructorCall8817); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3772:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3773:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3773:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3774:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8838);
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
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall8852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3794:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3794:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3794:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3794:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleXConstructorCall8875); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3799:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt67=3;
                    alt67 = dfa67.predict(input);
                    switch (alt67) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3799:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3799:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3799:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3816:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3817:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8948);
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
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3834:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3834:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3834:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3834:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3835:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3835:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3836:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8976);
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

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3852:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop66:
                            do {
                                int alt66=2;
                                int LA66_0 = input.LA(1);

                                if ( (LA66_0==45) ) {
                                    alt66=1;
                                }


                                switch (alt66) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3852:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,45,FOLLOW_45_in_ruleXConstructorCall8989); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3856:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3857:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3857:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3858:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9010);
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
                            	    break loop66;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,47,FOLLOW_47_in_ruleXConstructorCall9027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3878:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3878:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3881:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3882:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9062);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3906:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3907:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3908:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9099);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9109); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3915:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3918:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3919:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3919:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3919:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3919:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3920:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3925:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==68) ) {
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3925:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXBooleanLiteral9156); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3930:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3930:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3931:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3931:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3932:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,69,FOLLOW_69_in_ruleXBooleanLiteral9180); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3953:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3954:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3955:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9230);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9240); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3962:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3965:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3966:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3966:1: ( () otherlv_1= 'null' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3966:2: () otherlv_1= 'null'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3966:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3967:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXNullLiteral9286); if (state.failed) return current;
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


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3984:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3985:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3986:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9322);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9332); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3993:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3996:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3997:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3997:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3997:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3997:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3998:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4003:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4004:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4004:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4005:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9387);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
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
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4029:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4030:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4031:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9423);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9433); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4038:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4041:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4042:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4042:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4042:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4042:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4043:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4048:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4049:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4049:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4050:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9484); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4074:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4075:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4076:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9525);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9535); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4083:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4086:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4087:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4087:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4087:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4087:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4088:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXTypeLiteral9581); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXTypeLiteral9593); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4101:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4102:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4102:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4103:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9616);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXTypeLiteral9628); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4128:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4129:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4130:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9664);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9674); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4137:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4140:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4141:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4141:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4141:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4141:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4142:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXThrowExpression9720); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4151:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4152:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4152:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4153:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9741);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4177:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4178:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4179:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9777);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9787); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4186:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4189:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4190:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4190:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4190:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4190:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4191:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXReturnExpression9833); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4200:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4200:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4205:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4206:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9864);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4230:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4231:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4232:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9901);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9911); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4239:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4242:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4243:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4243:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4243:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4243:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4244:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression9957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4253:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4254:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4254:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4255:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9978);
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

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4271:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==76) ) {
                alt74=1;
            }
            else if ( (LA74_0==75) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4271:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4271:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4271:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4271:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt72=0;
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==76) ) {
                            int LA72_2 = input.LA(2);

                            if ( (synpred34_InternalHelloXvars()) ) {
                                alt72=1;
                            }


                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4271:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4273:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4274:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10008);
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
                    	    if ( cnt72 >= 1 ) break loop72;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(72, input);
                                throw eee;
                        }
                        cnt72++;
                    } while (true);

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4290:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==75) ) {
                        int LA73_1 = input.LA(2);

                        if ( (synpred35_InternalHelloXvars()) ) {
                            alt73=1;
                        }
                    }
                    switch (alt73) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4290:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4290:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4290:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,75,FOLLOW_75_in_ruleXTryCatchFinallyExpression10030); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4295:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4296:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4296:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4297:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10052);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4314:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4314:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4314:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,75,FOLLOW_75_in_ruleXTryCatchFinallyExpression10074); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4318:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4319:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4319:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4320:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10095);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4344:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4345:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4346:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10133);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10143); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4353:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4356:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4357:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4357:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4357:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4357:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4357:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleXCatchClause10188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleXCatchClause10201); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4366:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4367:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4367:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4368:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10222);
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

            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleXCatchClause10234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4388:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4389:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4389:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4390:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10255);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4414:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4415:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4416:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10292);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10303); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4423:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4426:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4427:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4427:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4428:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10350);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4438:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==42) ) {
                    int LA75_2 = input.LA(2);

                    if ( (LA75_2==RULE_ID) ) {
                        int LA75_3 = input.LA(3);

                        if ( (synpred37_InternalHelloXvars()) ) {
                            alt75=1;
                        }


                    }


                }


                switch (alt75) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4438:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4438:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4438:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_ruleQualifiedName10378); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10401);
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
            	    break loop75;
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


    // $ANTLR start "entryRuleNumber"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4465:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4469:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4470:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10455);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10466); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4480:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4484:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4485:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4485:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_HEX) ) {
                alt79=1;
            }
            else if ( ((LA79_0>=RULE_INT && LA79_0<=RULE_DECIMAL)) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4485:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10510); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4493:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4493:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4493:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4493:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==RULE_INT) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==RULE_DECIMAL) ) {
                        alt76=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4493:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10538); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4501:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10564); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4508:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==42) ) {
                        int LA78_1 = input.LA(2);

                        if ( ((LA78_1>=RULE_INT && LA78_1<=RULE_DECIMAL)) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4509:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,42,FOLLOW_42_in_ruleNumber10584); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4514:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt77=2;
                            int LA77_0 = input.LA(1);

                            if ( (LA77_0==RULE_INT) ) {
                                alt77=1;
                            }
                            else if ( (LA77_0==RULE_DECIMAL) ) {
                                alt77=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 77, 0, input);

                                throw nvae;
                            }
                            switch (alt77) {
                                case 1 :
                                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4514:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10600); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4522:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10626); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4540:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4541:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4542:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10679);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10689); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4549:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4552:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4553:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4553:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID) ) {
                alt81=1;
            }
            else if ( (LA81_0==31||LA81_0==46) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4553:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4553:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4554:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10737);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4562:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==48) ) {
                            int LA80_2 = input.LA(2);

                            if ( (LA80_2==50) ) {
                                int LA80_3 = input.LA(3);

                                if ( (synpred38_InternalHelloXvars()) ) {
                                    alt80=1;
                                }


                            }


                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4562:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4565:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4565:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4565:6: ()
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4566:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleJvmTypeReference10775); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleJvmTypeReference10787); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4581:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10819);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4597:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4598:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4599:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10854);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10864); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4606:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4609:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4610:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4610:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4610:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4610:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==46) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4610:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleXFunctionTypeRef10902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4614:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==RULE_ID||LA83_0==31||LA83_0==46) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4614:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4614:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4615:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4615:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4616:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10924);
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

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4632:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop82:
                            do {
                                int alt82=2;
                                int LA82_0 = input.LA(1);

                                if ( (LA82_0==45) ) {
                                    alt82=1;
                                }


                                switch (alt82) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4632:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXFunctionTypeRef10937); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4636:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4637:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4637:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4638:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10958);
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
                            	    break loop82;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXFunctionTypeRef10974); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleXFunctionTypeRef10988); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4662:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4663:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4663:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4664:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11009);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4688:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4689:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4690:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11045);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11055); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4697:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4700:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4701:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4701:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4701:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4701:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4702:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4702:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4703:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11103);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4716:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt86=2;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4716:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4716:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4716:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleJvmParameterizedTypeReference11124); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4721:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4722:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4722:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4723:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11146);
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

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4739:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==45) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4739:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleJvmParameterizedTypeReference11159); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4743:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4744:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4744:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4745:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11180);
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
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleJvmParameterizedTypeReference11194); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4773:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4774:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4775:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11232);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11242); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4782:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4785:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4786:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4786:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_ID||LA87_0==31||LA87_0==46) ) {
                alt87=1;
            }
            else if ( (LA87_0==77) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4787:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11289);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4797:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11316);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4813:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4814:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4815:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11351);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11361); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4822:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4825:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4826:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4826:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4826:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4826:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4827:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleJvmWildcardTypeReference11407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4836:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt88=3;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==78) ) {
                alt88=1;
            }
            else if ( (LA88_0==65) ) {
                alt88=2;
            }
            switch (alt88) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4836:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4836:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4837:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4837:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4838:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11429);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4855:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4855:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4856:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4856:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4857:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11456);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4881:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4882:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4883:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11494);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11504); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4890:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4893:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4894:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4894:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4894:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleJvmUpperBound11541); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4898:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4899:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4899:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4900:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11562);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4924:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4925:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4926:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11598);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11608); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4933:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4936:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4937:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4937:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4937:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleJvmUpperBoundAnded11645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4941:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4942:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4942:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4943:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11666);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4967:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4968:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4969:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11702);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11712); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4976:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4979:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4980:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4980:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4980:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleJvmLowerBound11749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4984:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4985:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4985:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4986:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11770);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5012:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5013:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5014:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11809);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11820); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5021:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5024:28: (this_ID_0= RULE_ID )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:5025:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11859); if (state.failed) return current;
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

        match(input,24,FOLLOW_24_in_synpred5_InternalHelloXvars1973); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalHelloXvars

    // $ANTLR start synpred6_InternalHelloXvars
    public final void synpred6_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:861:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:861:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:861:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:861:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:861:10: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:862:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:862:2: ( ( ruleOpCompare ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:863:1: ( ruleOpCompare )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:863:1: ( ruleOpCompare )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:864:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalHelloXvars2044);
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
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:983:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:983:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:983:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:983:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:983:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:984:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:984:2: ( ( ruleOpOther ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:985:1: ( ruleOpOther )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:985:1: ( ruleOpOther )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:986:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalHelloXvars2363);
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
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1075:3: ( ( '>' '>' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1075:4: ( '>' '>' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1075:4: ( '>' '>' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1076:2: '>' '>'
        {
        match(input,27,FOLLOW_27_in_synpred8_InternalHelloXvars2579); if (state.failed) return ;
        match(input,27,FOLLOW_27_in_synpred8_InternalHelloXvars2584); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalHelloXvars

    // $ANTLR start synpred9_InternalHelloXvars
    public final void synpred9_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1105:3: ( ( '<' '<' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1105:4: ( '<' '<' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1105:4: ( '<' '<' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1106:2: '<' '<'
        {
        match(input,28,FOLLOW_28_in_synpred9_InternalHelloXvars2666); if (state.failed) return ;
        match(input,28,FOLLOW_28_in_synpred9_InternalHelloXvars2671); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalHelloXvars

    // $ANTLR start synpred10_InternalHelloXvars
    public final void synpred10_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1179:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1179:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1179:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1179:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1179:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1180:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1180:2: ( ( ruleOpAdd ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1181:1: ( ruleOpAdd )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1181:1: ( ruleOpAdd )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1182:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalHelloXvars2893);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalHelloXvars

    // $ANTLR start synpred11_InternalHelloXvars
    public final void synpred11_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1287:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1287:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1287:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1287:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1287:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1288:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1288:2: ( ( ruleOpMulti ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1289:1: ( ruleOpMulti )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1289:1: ( ruleOpMulti )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1290:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalHelloXvars3173);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalHelloXvars

    // $ANTLR start synpred12_InternalHelloXvars
    public final void synpred12_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1520:3: ( ( () 'as' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1520:4: ( () 'as' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1520:4: ( () 'as' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1520:5: () 'as'
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1520:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1521:1: 
        {
        }

        match(input,41,FOLLOW_41_in_synpred12_InternalHelloXvars3767); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalHelloXvars

    // $ANTLR start synpred13_InternalHelloXvars
    public final void synpred13_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1580:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1580:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1580:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1580:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1580:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1581:1: 
        {
        }

        match(input,42,FOLLOW_42_in_synpred13_InternalHelloXvars3921); if (state.failed) return ;
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1582:1: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1583:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1583:1: ( ruleValidID )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1584:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalHelloXvars3930);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHelloXvars3936);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalHelloXvars

    // $ANTLR start synpred14_InternalHelloXvars
    public final void synpred14_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1638:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1638:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1638:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1638:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1638:10: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1639:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1639:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt89=3;
        switch ( input.LA(1) ) {
        case 42:
            {
            alt89=1;
            }
            break;
        case 43:
            {
            alt89=2;
            }
            break;
        case 44:
            {
            alt89=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 89, 0, input);

            throw nvae;
        }

        switch (alt89) {
            case 1 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1639:4: '.'
                {
                match(input,42,FOLLOW_42_in_synpred14_InternalHelloXvars4039); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1641:6: ( ( '?.' ) )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1641:6: ( ( '?.' ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1642:1: ( '?.' )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1642:1: ( '?.' )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1643:2: '?.'
                {
                match(input,43,FOLLOW_43_in_synpred14_InternalHelloXvars4053); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1648:6: ( ( '*.' ) )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1648:6: ( ( '*.' ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1649:1: ( '*.' )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1649:1: ( '*.' )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1650:2: '*.'
                {
                match(input,44,FOLLOW_44_in_synpred14_InternalHelloXvars4073); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalHelloXvars

    // $ANTLR start synpred15_InternalHelloXvars
    public final void synpred15_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1759:4: ( ( '(' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1760:1: ( '(' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1760:1: ( '(' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1761:2: '('
        {
        match(input,46,FOLLOW_46_in_synpred15_InternalHelloXvars4300); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalHelloXvars

    // $ANTLR start synpred16_InternalHelloXvars
    public final void synpred16_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1780:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1780:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1780:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1780:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1780:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1781:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1781:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt91=2;
        int LA91_0 = input.LA(1);

        if ( (LA91_0==RULE_ID||LA91_0==31||LA91_0==46) ) {
            alt91=1;
        }
        switch (alt91) {
            case 1 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1781:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1781:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1782:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1782:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1783:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXvars4352);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1785:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop90:
                do {
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==45) ) {
                        alt90=1;
                    }


                    switch (alt90) {
                	case 1 :
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1785:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,45,FOLLOW_45_in_synpred16_InternalHelloXvars4359); if (state.failed) return ;
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1786:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1787:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1787:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1788:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXvars4366);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop90;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1790:6: ( ( '|' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1791:1: ( '|' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1791:1: ( '|' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1792:2: '|'
        {
        match(input,49,FOLLOW_49_in_synpred16_InternalHelloXvars4380); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalHelloXvars

    // $ANTLR start synpred17_InternalHelloXvars
    public final void synpred17_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1859:4: ( ( () '[' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1859:5: ( () '[' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1859:5: ( () '[' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1859:6: () '['
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1859:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1860:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred17_InternalHelloXvars4500); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalHelloXvars

    // $ANTLR start synpred18_InternalHelloXvars
    public final void synpred18_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2050:3: ( ( () '[' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2050:4: ( () '[' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2050:4: ( () '[' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2050:5: () '['
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2050:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2051:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred18_InternalHelloXvars5024); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalHelloXvars

    // $ANTLR start synpred20_InternalHelloXvars
    public final void synpred20_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2144:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2144:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2144:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2144:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2144:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt93=2;
        int LA93_0 = input.LA(1);

        if ( (LA93_0==RULE_ID||LA93_0==31||LA93_0==46) ) {
            alt93=1;
        }
        switch (alt93) {
            case 1 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2144:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2144:7: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2145:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2145:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2146:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloXvars5303);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2148:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop92:
                do {
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==45) ) {
                        alt92=1;
                    }


                    switch (alt92) {
                	case 1 :
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2148:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,45,FOLLOW_45_in_synpred20_InternalHelloXvars5310); if (state.failed) return ;
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2149:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2150:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2150:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2151:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloXvars5317);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop92;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2153:6: ( ( '|' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2154:1: ( '|' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2154:1: ( '|' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2155:2: '|'
        {
        match(input,49,FOLLOW_49_in_synpred20_InternalHelloXvars5331); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalHelloXvars

    // $ANTLR start synpred22_InternalHelloXvars
    public final void synpred22_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2514:4: ( 'else' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2514:6: 'else'
        {
        match(input,53,FOLLOW_53_in_synpred22_InternalHelloXvars6114); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalHelloXvars

    // $ANTLR start synpred23_InternalHelloXvars
    public final void synpred23_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2568:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2568:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2568:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2568:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2568:6: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2569:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2569:1: ( ruleValidID )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2570:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalHelloXvars6256);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,55,FOLLOW_55_in_synpred23_InternalHelloXvars6262); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalHelloXvars

    // $ANTLR start synpred24_InternalHelloXvars
    public final void synpred24_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2614:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2614:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2614:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2614:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,46,FOLLOW_46_in_synpred24_InternalHelloXvars6338); if (state.failed) return ;
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2615:1: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2616:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2616:1: ( ruleValidID )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2617:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalHelloXvars6345);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,55,FOLLOW_55_in_synpred24_InternalHelloXvars6351); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalHelloXvars

    // $ANTLR start synpred25_InternalHelloXvars
    public final void synpred25_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3198:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3198:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3198:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3198:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3198:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3199:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3199:1: ( ruleJvmTypeReference )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3200:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalHelloXvars7616);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3202:2: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3203:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3203:1: ( ruleValidID )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3204:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalHelloXvars7625);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalHelloXvars

    // $ANTLR start synpred26_InternalHelloXvars
    public final void synpred26_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3502:4: ( ( '(' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3503:1: ( '(' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3503:1: ( '(' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3504:2: '('
        {
        match(input,46,FOLLOW_46_in_synpred26_InternalHelloXvars8187); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalHelloXvars

    // $ANTLR start synpred27_InternalHelloXvars
    public final void synpred27_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3523:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3523:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3523:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3523:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3523:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3524:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3524:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==RULE_ID||LA97_0==31||LA97_0==46) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3524:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3524:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3525:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3525:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3526:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloXvars8239);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3528:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop96:
                do {
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==45) ) {
                        alt96=1;
                    }


                    switch (alt96) {
                	case 1 :
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3528:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,45,FOLLOW_45_in_synpred27_InternalHelloXvars8246); if (state.failed) return ;
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3529:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3530:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3530:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3531:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloXvars8253);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop96;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3533:6: ( ( '|' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3534:1: ( '|' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3534:1: ( '|' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3535:2: '|'
        {
        match(input,49,FOLLOW_49_in_synpred27_InternalHelloXvars8267); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalHelloXvars

    // $ANTLR start synpred28_InternalHelloXvars
    public final void synpred28_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3602:4: ( ( () '[' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3602:5: ( () '[' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3602:5: ( () '[' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3602:6: () '['
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3602:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3603:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred28_InternalHelloXvars8387); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalHelloXvars

    // $ANTLR start synpred29_InternalHelloXvars
    public final void synpred29_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3745:4: ( '<' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3745:6: '<'
        {
        match(input,28,FOLLOW_28_in_synpred29_InternalHelloXvars8774); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalHelloXvars

    // $ANTLR start synpred30_InternalHelloXvars
    public final void synpred30_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3794:5: ( '(' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3794:7: '('
        {
        match(input,46,FOLLOW_46_in_synpred30_InternalHelloXvars8867); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalHelloXvars

    // $ANTLR start synpred31_InternalHelloXvars
    public final void synpred31_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3799:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3799:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3799:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3799:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3799:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3800:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3800:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==RULE_ID||LA99_0==31||LA99_0==46) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3800:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3800:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3801:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3801:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3802:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloXvars8897);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3804:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop98:
                do {
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==45) ) {
                        alt98=1;
                    }


                    switch (alt98) {
                	case 1 :
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3804:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,45,FOLLOW_45_in_synpred31_InternalHelloXvars8904); if (state.failed) return ;
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3805:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3806:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3806:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3807:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloXvars8911);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop98;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3809:6: ( ( '|' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3810:1: ( '|' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3810:1: ( '|' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3811:2: '|'
        {
        match(input,49,FOLLOW_49_in_synpred31_InternalHelloXvars8925); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalHelloXvars

    // $ANTLR start synpred32_InternalHelloXvars
    public final void synpred32_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3878:4: ( ( () '[' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3878:5: ( () '[' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3878:5: ( () '[' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3878:6: () '['
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3878:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3879:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred32_InternalHelloXvars9045); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalHelloXvars

    // $ANTLR start synpred33_InternalHelloXvars
    public final void synpred33_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4200:2: ( ( ruleXExpression ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4201:1: ( ruleXExpression )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4201:1: ( ruleXExpression )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4202:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalHelloXvars9847);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalHelloXvars

    // $ANTLR start synpred34_InternalHelloXvars
    public final void synpred34_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4271:5: ( 'catch' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4271:7: 'catch'
        {
        match(input,76,FOLLOW_76_in_synpred34_InternalHelloXvars9992); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalHelloXvars

    // $ANTLR start synpred35_InternalHelloXvars
    public final void synpred35_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4290:5: ( 'finally' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4290:7: 'finally'
        {
        match(input,75,FOLLOW_75_in_synpred35_InternalHelloXvars10022); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalHelloXvars

    // $ANTLR start synpred37_InternalHelloXvars
    public final void synpred37_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4438:3: ( '.' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4439:2: '.'
        {
        match(input,42,FOLLOW_42_in_synpred37_InternalHelloXvars10369); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalHelloXvars

    // $ANTLR start synpred38_InternalHelloXvars
    public final void synpred38_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4562:2: ( ( () '[' ']' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4562:3: ( () '[' ']' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4562:3: ( () '[' ']' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4562:4: () '[' ']'
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4562:4: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4563:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred38_InternalHelloXvars10752); if (state.failed) return ;
        match(input,50,FOLLOW_50_in_synpred38_InternalHelloXvars10756); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalHelloXvars

    // $ANTLR start synpred39_InternalHelloXvars
    public final void synpred39_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4716:4: ( '<' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4716:6: '<'
        {
        match(input,28,FOLLOW_28_in_synpred39_InternalHelloXvars11116); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalHelloXvars

    // Delegated rules

    public final boolean synpred34_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred39_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalHelloXvars_fragment(); // can never throw exception
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
    public final boolean synpred37_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalHelloXvars_fragment(); // can never throw exception
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
    public final boolean synpred35_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalHelloXvars_fragment(); // can never throw exception
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
    public final boolean synpred17_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalHelloXvars_fragment(); // can never throw exception
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
    public final boolean synpred29_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalHelloXvars_fragment(); // can never throw exception
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
    public final boolean synpred38_InternalHelloXvars() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalHelloXvars_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA86 dfa86 = new DFA86(this);
    static final String DFA13_eotS =
        "\13\uffff";
    static final String DFA13_eofS =
        "\1\1\12\uffff";
    static final String DFA13_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA13_maxS =
        "\1\114\1\uffff\10\0\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA13_specialS =
        "\2\uffff\1\0\1\1\1\6\1\5\1\3\1\4\1\2\1\7\1\uffff}>";
    static final String[] DFA13_transitionS = {
            "\5\1\6\uffff\1\1\1\uffff\1\1\1\uffff\10\1\1\2\1\3\1\4\1\5\1"+
            "\6\1\7\1\10\1\11\16\1\1\uffff\20\1\1\uffff\12\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "()* loopback of 983:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_2 = input.LA(1);

                         
                        int index13_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXvars()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_3 = input.LA(1);

                         
                        int index13_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXvars()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_8 = input.LA(1);

                         
                        int index13_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXvars()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_6 = input.LA(1);

                         
                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXvars()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_7 = input.LA(1);

                         
                        int index13_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXvars()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_5 = input.LA(1);

                         
                        int index13_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXvars()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_4 = input.LA(1);

                         
                        int index13_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXvars()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_9 = input.LA(1);

                         
                        int index13_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXvars()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\102\uffff";
    static final String DFA29_eofS =
        "\1\2\101\uffff";
    static final String DFA29_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA29_maxS =
        "\1\114\1\0\100\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA29_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA29_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\1\2\1\uffff\33\2\1\1\2\2\1\uffff\20"+
            "\2\1\uffff\12\2",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1759:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\36\uffff";
    static final String DFA28_eofS =
        "\36\uffff";
    static final String DFA28_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA28_maxS =
        "\1\112\2\0\33\uffff";
    static final String DFA28_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA28_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1\4\5\10\uffff\1\5\12\uffff\1\5\2\uffff\1\3\3\uffff\2\5\11"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            return "1780:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_0 = input.LA(1);

                         
                        int index28_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA28_0==RULE_ID) ) {s = 1;}

                        else if ( (LA28_0==46) ) {s = 2;}

                        else if ( (LA28_0==31) && (synpred16_InternalHelloXvars())) {s = 3;}

                        else if ( (LA28_0==49) && (synpred16_InternalHelloXvars())) {s = 4;}

                        else if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_DECIMAL)||LA28_0==17||LA28_0==28||(LA28_0>=35 && LA28_0<=36)||LA28_0==48||LA28_0==52||LA28_0==54||LA28_0==56||(LA28_0>=60 && LA28_0<=62)||LA28_0==65||(LA28_0>=67 && LA28_0<=74)) ) {s = 5;}

                        else if ( (LA28_0==47) ) {s = 29;}

                         
                        input.seek(index28_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index28_2);
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
    static final String DFA30_eotS =
        "\102\uffff";
    static final String DFA30_eofS =
        "\1\2\101\uffff";
    static final String DFA30_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA30_maxS =
        "\1\114\1\0\100\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA30_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA30_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\1\2\1\uffff\35\2\1\1\1\uffff\20\2\1"+
            "\uffff\12\2",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1859:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA32_eotS =
        "\16\uffff";
    static final String DFA32_eofS =
        "\16\uffff";
    static final String DFA32_minS =
        "\1\4\15\uffff";
    static final String DFA32_maxS =
        "\1\112\15\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA32_specialS =
        "\16\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\4\4\5\23\uffff\1\4\21\uffff\1\15\1\uffff\1\5\3\uffff\1\6"+
            "\1\uffff\1\3\1\uffff\1\2\3\uffff\1\7\1\10\1\11\2\uffff\1\4\1"+
            "\uffff\1\1\4\5\1\12\1\13\1\14",
            "",
            "",
            "",
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

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "1900:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA36_eotS =
        "\40\uffff";
    static final String DFA36_eofS =
        "\40\uffff";
    static final String DFA36_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA36_maxS =
        "\1\112\2\0\35\uffff";
    static final String DFA36_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA36_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\1\4\5\10\uffff\1\5\12\uffff\1\5\2\uffff\1\3\3\uffff\2\5\11"+
            "\uffff\1\2\1\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\6\5\1\uffff\10\5",
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
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "2144:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_0 = input.LA(1);

                         
                        int index36_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA36_0==RULE_ID) ) {s = 1;}

                        else if ( (LA36_0==46) ) {s = 2;}

                        else if ( (LA36_0==31) && (synpred20_InternalHelloXvars())) {s = 3;}

                        else if ( (LA36_0==49) && (synpred20_InternalHelloXvars())) {s = 4;}

                        else if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_DECIMAL)||LA36_0==17||LA36_0==28||(LA36_0>=35 && LA36_0<=36)||LA36_0==48||LA36_0==50||LA36_0==52||LA36_0==54||LA36_0==56||(LA36_0>=60 && LA36_0<=65)||(LA36_0>=67 && LA36_0<=74)) ) {s = 5;}

                         
                        input.seek(index36_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index36_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_2 = input.LA(1);

                         
                        int index36_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index36_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\102\uffff";
    static final String DFA60_eofS =
        "\1\2\101\uffff";
    static final String DFA60_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA60_maxS =
        "\1\114\1\0\100\uffff";
    static final String DFA60_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA60_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA60_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\1\2\1\uffff\33\2\1\1\2\2\1\uffff\20"+
            "\2\1\uffff\12\2",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "3502:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_1 = input.LA(1);

                         
                        int index60_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index60_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\36\uffff";
    static final String DFA59_eofS =
        "\36\uffff";
    static final String DFA59_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA59_maxS =
        "\1\112\2\0\33\uffff";
    static final String DFA59_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA59_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA59_transitionS = {
            "\1\1\4\5\10\uffff\1\5\12\uffff\1\5\2\uffff\1\3\3\uffff\2\5\11"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "3523:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_0 = input.LA(1);

                         
                        int index59_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA59_0==RULE_ID) ) {s = 1;}

                        else if ( (LA59_0==46) ) {s = 2;}

                        else if ( (LA59_0==31) && (synpred27_InternalHelloXvars())) {s = 3;}

                        else if ( (LA59_0==49) && (synpred27_InternalHelloXvars())) {s = 4;}

                        else if ( ((LA59_0>=RULE_STRING && LA59_0<=RULE_DECIMAL)||LA59_0==17||LA59_0==28||(LA59_0>=35 && LA59_0<=36)||LA59_0==48||LA59_0==52||LA59_0==54||LA59_0==56||(LA59_0>=60 && LA59_0<=62)||LA59_0==65||(LA59_0>=67 && LA59_0<=74)) ) {s = 5;}

                        else if ( (LA59_0==47) ) {s = 29;}

                         
                        input.seek(index59_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA59_2 = input.LA(1);

                         
                        int index59_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index59_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA61_eotS =
        "\102\uffff";
    static final String DFA61_eofS =
        "\1\2\101\uffff";
    static final String DFA61_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA61_maxS =
        "\1\114\1\0\100\uffff";
    static final String DFA61_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA61_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA61_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\1\2\1\uffff\35\2\1\1\1\uffff\20\2\1"+
            "\uffff\12\2",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "3602:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\102\uffff";
    static final String DFA65_eofS =
        "\1\2\101\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA65_maxS =
        "\1\114\1\0\100\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA65_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\1\2\1\uffff\11\2\1\1\24\2\1\uffff\20"+
            "\2\1\uffff\12\2",
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
            return "3745:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
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
                        if ( (synpred29_InternalHelloXvars()) ) {s = 65;}

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
    static final String DFA68_eotS =
        "\102\uffff";
    static final String DFA68_eofS =
        "\1\2\101\uffff";
    static final String DFA68_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA68_maxS =
        "\1\114\1\0\100\uffff";
    static final String DFA68_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA68_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\1\2\1\uffff\33\2\1\1\2\2\1\uffff\20"+
            "\2\1\uffff\12\2",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "3794:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\36\uffff";
    static final String DFA67_eofS =
        "\36\uffff";
    static final String DFA67_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA67_maxS =
        "\1\112\2\0\33\uffff";
    static final String DFA67_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA67_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\1\4\5\10\uffff\1\5\12\uffff\1\5\2\uffff\1\3\3\uffff\2\5\11"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            return "3799:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_0 = input.LA(1);

                         
                        int index67_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_0==RULE_ID) ) {s = 1;}

                        else if ( (LA67_0==46) ) {s = 2;}

                        else if ( (LA67_0==31) && (synpred31_InternalHelloXvars())) {s = 3;}

                        else if ( (LA67_0==49) && (synpred31_InternalHelloXvars())) {s = 4;}

                        else if ( ((LA67_0>=RULE_STRING && LA67_0<=RULE_DECIMAL)||LA67_0==17||LA67_0==28||(LA67_0>=35 && LA67_0<=36)||LA67_0==48||LA67_0==52||LA67_0==54||LA67_0==56||(LA67_0>=60 && LA67_0<=62)||LA67_0==65||(LA67_0>=67 && LA67_0<=74)) ) {s = 5;}

                        else if ( (LA67_0==47) ) {s = 29;}

                         
                        input.seek(index67_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_2 = input.LA(1);

                         
                        int index67_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index67_2);
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
    static final String DFA69_eotS =
        "\102\uffff";
    static final String DFA69_eofS =
        "\1\2\101\uffff";
    static final String DFA69_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA69_maxS =
        "\1\114\1\0\100\uffff";
    static final String DFA69_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA69_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA69_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\1\2\1\uffff\35\2\1\1\1\uffff\20\2\1"+
            "\uffff\12\2",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "3878:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA71_eotS =
        "\102\uffff";
    static final String DFA71_eofS =
        "\1\33\101\uffff";
    static final String DFA71_minS =
        "\1\4\32\0\47\uffff";
    static final String DFA71_maxS =
        "\1\114\32\0\47\uffff";
    static final String DFA71_acceptS =
        "\33\uffff\1\2\45\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\47\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\1\1\21\1\15\1\16\1\17\6\uffff\1\33\1\uffff\1\2\1\uffff\11"+
            "\33\1\10\6\33\1\4\1\3\11\33\1\32\1\33\1\12\1\uffff\2\33\1\23"+
            "\1\33\1\7\1\33\1\6\3\33\1\24\1\25\1\26\2\33\1\11\1\uffff\1\5"+
            "\1\13\1\14\1\20\1\22\1\27\1\30\1\31\2\33",
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
            "",
            "",
            "",
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "4200:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_1 = input.LA(1);

                         
                        int index71_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA71_2 = input.LA(1);

                         
                        int index71_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA71_3 = input.LA(1);

                         
                        int index71_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA71_4 = input.LA(1);

                         
                        int index71_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA71_5 = input.LA(1);

                         
                        int index71_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA71_6 = input.LA(1);

                         
                        int index71_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA71_7 = input.LA(1);

                         
                        int index71_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA71_8 = input.LA(1);

                         
                        int index71_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA71_9 = input.LA(1);

                         
                        int index71_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA71_10 = input.LA(1);

                         
                        int index71_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA71_11 = input.LA(1);

                         
                        int index71_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA71_12 = input.LA(1);

                         
                        int index71_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA71_13 = input.LA(1);

                         
                        int index71_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA71_14 = input.LA(1);

                         
                        int index71_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA71_15 = input.LA(1);

                         
                        int index71_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA71_16 = input.LA(1);

                         
                        int index71_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA71_17 = input.LA(1);

                         
                        int index71_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA71_18 = input.LA(1);

                         
                        int index71_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA71_19 = input.LA(1);

                         
                        int index71_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA71_20 = input.LA(1);

                         
                        int index71_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA71_21 = input.LA(1);

                         
                        int index71_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA71_22 = input.LA(1);

                         
                        int index71_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA71_23 = input.LA(1);

                         
                        int index71_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA71_24 = input.LA(1);

                         
                        int index71_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA71_25 = input.LA(1);

                         
                        int index71_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA71_26 = input.LA(1);

                         
                        int index71_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA86_eotS =
        "\102\uffff";
    static final String DFA86_eofS =
        "\1\2\101\uffff";
    static final String DFA86_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA86_maxS =
        "\1\114\1\0\100\uffff";
    static final String DFA86_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA86_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA86_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\1\2\1\uffff\11\2\1\1\24\2\1\uffff\20"+
            "\2\1\uffff\12\2",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA86_eot = DFA.unpackEncodedString(DFA86_eotS);
    static final short[] DFA86_eof = DFA.unpackEncodedString(DFA86_eofS);
    static final char[] DFA86_min = DFA.unpackEncodedStringToUnsignedChars(DFA86_minS);
    static final char[] DFA86_max = DFA.unpackEncodedStringToUnsignedChars(DFA86_maxS);
    static final short[] DFA86_accept = DFA.unpackEncodedString(DFA86_acceptS);
    static final short[] DFA86_special = DFA.unpackEncodedString(DFA86_specialS);
    static final short[][] DFA86_transition;

    static {
        int numStates = DFA86_transitionS.length;
        DFA86_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA86_transition[i] = DFA.unpackEncodedString(DFA86_transitionS[i]);
        }
    }

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = DFA86_eot;
            this.eof = DFA86_eof;
            this.min = DFA86_min;
            this.max = DFA86_max;
            this.accept = DFA86_accept;
            this.special = DFA86_special;
            this.transition = DFA86_transition;
        }
        public String getDescription() {
            return "4716:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA86_1 = input.LA(1);

                         
                        int index86_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalHelloXvars()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index86_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 86, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x800000000000A002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleModel153 = new BitSet(new long[]{0x8000000000008002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel175 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImport259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard375 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildcard394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGreeting483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting500 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleGreeting517 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleGreeting538 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGreeting550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment744 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment760 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment810 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment863 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpSingleAssign974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpMultiAssign1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1158 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1211 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1234 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpOr1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1417 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1470 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1493 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpAnd1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1676 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1729 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1752 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpEquality1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpEquality1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1956 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_24_in_ruleXRelationalExpression1992 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2015 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2076 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2099 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2342 = new BitSet(new long[]{0x00000007F8000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2395 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2418 = new BitSet(new long[]{0x00000007F8000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2564 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2595 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2651 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2682 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOther2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2872 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2925 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2948 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpAdd3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpAdd3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3152 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3205 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3228 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpMulti3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpMulti3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpMulti3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3481 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpUnary3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpUnary3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpUnary3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3751 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleXCastedExpression3786 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3809 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3904 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall3953 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3976 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3992 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4014 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4100 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4124 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4161 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall4190 = new BitSet(new long[]{0x0000400080000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4211 = new BitSet(new long[]{0x0000200008000000L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4224 = new BitSet(new long[]{0x0000400080000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4245 = new BitSet(new long[]{0x0000200008000000L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall4259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4284 = new BitSet(new long[]{0x00015C0000000002L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4318 = new BitSet(new long[]{0x7153C018900201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4403 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4431 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4444 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4465 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4482 = new BitSet(new long[]{0x00011C0000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4517 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXClosure5284 = new BitSet(new long[]{0xF1574018900201F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5357 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXClosure5370 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5391 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_ruleXClosure5413 = new BitSet(new long[]{0xF1554018100201F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5450 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXClosure5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5564 = new BitSet(new long[]{0xF1594018100201F2L,0x00000000000007FBL});
    public static final BitSet FOLLOW_51_in_ruleXExpressionInClosure5577 = new BitSet(new long[]{0xF1514018100201F2L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5735 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXShortClosure5748 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5769 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_ruleXShortClosure5791 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXParenthesizedExpression5910 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5932 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXParenthesizedExpression5943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXIfExpression6035 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXIfExpression6047 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6068 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXIfExpression6080 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6101 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXIfExpression6122 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6238 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6281 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6293 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6317 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_46_in_ruleXSwitchExpression6361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6382 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6394 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6417 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXSwitchExpression6429 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6443 = new BitSet(new long[]{0x0880400080000010L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6464 = new BitSet(new long[]{0x0E80400080000010L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6478 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6490 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6511 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression6525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6617 = new BitSet(new long[]{0x0880000000000000L});
    public static final BitSet FOLLOW_59_in_ruleXCasePart6631 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6652 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXCasePart6666 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXForLoopExpression6779 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXForLoopExpression6791 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6812 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXForLoopExpression6824 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6845 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXForLoopExpression6857 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXWhileExpression6970 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXWhileExpression6982 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7003 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXWhileExpression7015 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXDoWhileExpression7128 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7149 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleXDoWhileExpression7161 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXDoWhileExpression7173 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7194 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXDoWhileExpression7206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXBlockExpression7298 = new BitSet(new long[]{0xF5514018100201F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7320 = new BitSet(new long[]{0xF5594018100201F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_51_in_ruleXBlockExpression7333 = new BitSet(new long[]{0xF5514018100201F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_58_in_ruleXBlockExpression7349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXVariableDeclaration7567 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_64_in_ruleXVariableDeclaration7598 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7667 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7696 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXVariableDeclaration7710 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7825 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8063 = new BitSet(new long[]{0x0000000010000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall8077 = new BitSet(new long[]{0x0000400080000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8098 = new BitSet(new long[]{0x0000200008000000L});
    public static final BitSet FOLLOW_45_in_ruleXFeatureCall8111 = new BitSet(new long[]{0x0000400080000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8132 = new BitSet(new long[]{0x0000200008000000L});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall8146 = new BitSet(new long[]{0x0000000010000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8171 = new BitSet(new long[]{0x0001400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXFeatureCall8205 = new BitSet(new long[]{0x7153C018900201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8290 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8318 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFeatureCall8331 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8352 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_47_in_ruleXFeatureCall8369 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleIdOrSuper8524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleStaticQualifier8641 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXConstructorCall8738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8761 = new BitSet(new long[]{0x0001400010000002L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall8782 = new BitSet(new long[]{0x0000400080000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8804 = new BitSet(new long[]{0x0000200008000000L});
    public static final BitSet FOLLOW_45_in_ruleXConstructorCall8817 = new BitSet(new long[]{0x0000400080000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8838 = new BitSet(new long[]{0x0000200008000000L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall8852 = new BitSet(new long[]{0x0001400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXConstructorCall8875 = new BitSet(new long[]{0x7153C018900201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8948 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8976 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_45_in_ruleXConstructorCall8989 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9010 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_47_in_ruleXConstructorCall9027 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXBooleanLiteral9156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXBooleanLiteral9180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXNullLiteral9286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXTypeLiteral9581 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXTypeLiteral9593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9616 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXTypeLiteral9628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXThrowExpression9720 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXReturnExpression9833 = new BitSet(new long[]{0x71514018100201F2L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression9957 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10008 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_ruleXTryCatchFinallyExpression10030 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXTryCatchFinallyExpression10074 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXCatchClause10188 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXCatchClause10201 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10222 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXCatchClause10234 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10350 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleQualifiedName10378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10401 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10538 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10564 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleNumber10584 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10737 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleJvmTypeReference10775 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleJvmTypeReference10787 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXFunctionTypeRef10902 = new BitSet(new long[]{0x0000C00080000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10924 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFunctionTypeRef10937 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10958 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_47_in_ruleXFunctionTypeRef10974 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXFunctionTypeRef10988 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11103 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleJvmParameterizedTypeReference11124 = new BitSet(new long[]{0x0000400080000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11146 = new BitSet(new long[]{0x0000200008000000L});
    public static final BitSet FOLLOW_45_in_ruleJvmParameterizedTypeReference11159 = new BitSet(new long[]{0x0000400080000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11180 = new BitSet(new long[]{0x0000200008000000L});
    public static final BitSet FOLLOW_27_in_ruleJvmParameterizedTypeReference11194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmWildcardTypeReference11407 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmUpperBound11541 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleJvmUpperBoundAnded11645 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleJvmLowerBound11749 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloXvars831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalHelloXvars1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalHelloXvars1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalHelloXvars1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred5_InternalHelloXvars1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalHelloXvars2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalHelloXvars2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred8_InternalHelloXvars2579 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred8_InternalHelloXvars2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred9_InternalHelloXvars2666 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred9_InternalHelloXvars2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalHelloXvars2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalHelloXvars3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred12_InternalHelloXvars3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred13_InternalHelloXvars3921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalHelloXvars3930 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHelloXvars3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred14_InternalHelloXvars4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred14_InternalHelloXvars4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred14_InternalHelloXvars4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred15_InternalHelloXvars4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXvars4352 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_synpred16_InternalHelloXvars4359 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXvars4366 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_synpred16_InternalHelloXvars4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred17_InternalHelloXvars4500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred18_InternalHelloXvars5024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloXvars5303 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_synpred20_InternalHelloXvars5310 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloXvars5317 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_synpred20_InternalHelloXvars5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred22_InternalHelloXvars6114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalHelloXvars6256 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred23_InternalHelloXvars6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred24_InternalHelloXvars6338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalHelloXvars6345 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred24_InternalHelloXvars6351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalHelloXvars7616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalHelloXvars7625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred26_InternalHelloXvars8187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloXvars8239 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_synpred27_InternalHelloXvars8246 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloXvars8253 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_synpred27_InternalHelloXvars8267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred28_InternalHelloXvars8387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred29_InternalHelloXvars8774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred30_InternalHelloXvars8867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloXvars8897 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_synpred31_InternalHelloXvars8904 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloXvars8911 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_synpred31_InternalHelloXvars8925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred32_InternalHelloXvars9045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalHelloXvars9847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_synpred34_InternalHelloXvars9992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_synpred35_InternalHelloXvars10022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred37_InternalHelloXvars10369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred38_InternalHelloXvars10752 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_synpred38_InternalHelloXvars10756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred39_InternalHelloXvars11116 = new BitSet(new long[]{0x0000000000000002L});

}