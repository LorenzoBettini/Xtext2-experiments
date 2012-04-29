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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'Hello'", "'from'", "'!'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
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

                if ( ((LA2_0>=59 && LA2_0<=60)) ) {
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
                else if ( (LA6_1==EOF||(LA6_1>=RULE_ID && LA6_1<=RULE_DECIMAL)||LA6_1==15||LA6_1==17||(LA6_1>=19 && LA6_1<=44)||(LA6_1>=46 && LA6_1<=73)) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_DECIMAL)||LA6_0==17||LA6_0==28||(LA6_0>=31 && LA6_0<=32)||LA6_0==42||LA6_0==44||LA6_0==48||LA6_0==50||LA6_0==52||(LA6_0>=56 && LA6_0<=58)||LA6_0==61||(LA6_0>=63 && LA6_0<=70)) ) {
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
                case 24:
                    {
                    int LA11_2 = input.LA(2);

                    if ( (synpred5_InternalHelloXvars()) ) {
                        alt11=1;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA11_3 = input.LA(2);

                    if ( (synpred6_InternalHelloXvars()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA11_4 = input.LA(2);

                    if ( (synpred6_InternalHelloXvars()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA11_5 = input.LA(2);

                    if ( (synpred6_InternalHelloXvars()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 28:
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
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred7_InternalHelloXvars()) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==30) ) {
                    int LA13_3 = input.LA(2);

                    if ( (synpred7_InternalHelloXvars()) ) {
                        alt13=1;
                    }


                }


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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1044:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1047:28: ( (kw= '->' | kw= '..' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1048:1: (kw= '->' | kw= '..' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1048:1: (kw= '->' | kw= '..' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            else if ( (LA14_0==30) ) {
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1069:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1070:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1071:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2565);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2575); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1078:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1081:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1082:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1082:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1083:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2622);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1091:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred8_InternalHelloXvars()) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==32) ) {
                    int LA15_3 = input.LA(2);

                    if ( (synpred8_InternalHelloXvars()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1091:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1091:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1091:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1096:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1096:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1096:7: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1097:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1102:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1103:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1103:1: ( ruleOpAdd )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1104:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2675);
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

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1117:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1118:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1118:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1119:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2698);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1143:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1144:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1145:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2737);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2748); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1152:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1155:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1156:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1156:1: (kw= '+' | kw= '-' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            else if ( (LA16_0==32) ) {
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1157:2: kw= '+'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpAdd2786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1164:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpAdd2805); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1177:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1178:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1179:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2845);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2855); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1186:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1189:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1190:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1190:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1191:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2902);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1199:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop17:
            do {
                int alt17=2;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (synpred9_InternalHelloXvars()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (synpred9_InternalHelloXvars()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA17_4 = input.LA(2);

                    if ( (synpred9_InternalHelloXvars()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 36:
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
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1199:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1199:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1199:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1204:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1204:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1204:7: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1205:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1210:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1211:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1211:1: ( ruleOpMulti )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1212:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2955);
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

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1225:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1226:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1226:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1227:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2978);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1251:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1252:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1253:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3017);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3028); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1260:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1263:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1264:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1264:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt18=1;
                }
                break;
            case 34:
                {
                alt18=2;
                }
                break;
            case 35:
                {
                alt18=3;
                }
                break;
            case 36:
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1265:2: kw= '*'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpMulti3066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1272:2: kw= '**'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpMulti3085); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1279:2: kw= '/'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1286:2: kw= '%'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3123); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1299:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1300:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1301:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3163);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3173); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1308:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1311:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1312:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1312:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17||(LA19_0>=31 && LA19_0<=32)) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_DECIMAL)||LA19_0==28||LA19_0==42||LA19_0==44||LA19_0==48||LA19_0==50||LA19_0==52||(LA19_0>=56 && LA19_0<=58)||LA19_0==61||(LA19_0>=63 && LA19_0<=70)) ) {
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1312:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1312:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1312:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1312:3: ()
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1313:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1318:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1319:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1319:1: ( ruleOpUnary )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1320:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3231);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1333:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1334:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1334:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1335:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3252);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1353:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3281);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1369:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1370:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1371:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3317);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3328); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1378:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1381:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1382:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1382:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt20=1;
                }
                break;
            case 32:
                {
                alt20=2;
                }
                break;
            case 31:
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1383:2: kw= '!'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleOpUnary3366); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1390:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpUnary3385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1397:2: kw= '+'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpUnary3404); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1410:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1411:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1412:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3444);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3454); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1419:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1422:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1423:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1423:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1424:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3501);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1432:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==37) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred10_InternalHelloXvars()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1432:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1432:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1432:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1434:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1434:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1434:6: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1435:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXCastedExpression3536); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1444:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1445:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1445:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1446:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3559);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1470:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1471:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1472:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3597);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3607); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1479:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1482:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1483:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1483:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1484:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3654);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1492:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop29:
            do {
                int alt29=3;
                switch ( input.LA(1) ) {
                case 38:
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
                case 39:
                    {
                    int LA29_3 = input.LA(2);

                    if ( (synpred12_InternalHelloXvars()) ) {
                        alt29=2;
                    }


                    }
                    break;
                case 40:
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
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1492:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1492:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1492:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1492:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1492:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1498:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1498:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1498:26: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1499:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall3703); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1508:1: ( ( ruleValidID ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1509:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1509:1: ( ruleValidID )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1510:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3726);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3742);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1531:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1532:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1532:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1533:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3764);
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
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1550:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1550:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1550:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1550:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1550:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1566:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1566:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1566:8: ()
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1567:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1572:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt22=3;
            	    switch ( input.LA(1) ) {
            	    case 38:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 40:
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
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1572:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall3850); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1577:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1577:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1578:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1578:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1579:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall3874); if (state.failed) return current;
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
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1593:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1593:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1594:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1594:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1595:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall3911); if (state.failed) return current;
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

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1608:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==28) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1608:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall3940); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1612:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1613:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1613:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1614:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3961);
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

            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1630:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop23:
            	            do {
            	                int alt23=2;
            	                int LA23_0 = input.LA(1);

            	                if ( (LA23_0==41) ) {
            	                    alt23=1;
            	                }


            	                switch (alt23) {
            	            	case 1 :
            	            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1630:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall3974); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1634:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1635:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1635:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1636:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3995);
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

            	            otherlv_14=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall4009); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1656:3: ( ( ruleValidID ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1657:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1657:1: ( ruleValidID )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1658:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4034);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1671:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt27=2;
            	    alt27 = dfa27.predict(input);
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1671:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1671:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1671:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1678:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1679:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4068); if (state.failed) return current;
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

            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1692:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt26=3;
            	            alt26 = dfa26.predict(input);
            	            switch (alt26) {
            	                case 1 :
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1692:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1692:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1692:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1709:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1710:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4153);
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
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1727:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1727:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1727:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1727:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1728:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1728:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1729:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4181);
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

            	                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1745:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop25:
            	                    do {
            	                        int alt25=2;
            	                        int LA25_0 = input.LA(1);

            	                        if ( (LA25_0==41) ) {
            	                            alt25=1;
            	                        }


            	                        switch (alt25) {
            	                    	case 1 :
            	                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1745:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4194); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1749:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1750:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1750:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1751:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4215);
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

            	            otherlv_21=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4232); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1771:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt28=2;
            	    alt28 = dfa28.predict(input);
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1771:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1776:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1777:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4265);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1801:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1802:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1803:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4305);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4315); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1810:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1813:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1814:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1814:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt30=13;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt30=1;
                }
                break;
            case 52:
                {
                alt30=2;
                }
                break;
            case 50:
                {
                alt30=3;
                }
                break;
            case RULE_ID:
            case 28:
            case 61:
                {
                alt30=4;
                }
                break;
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 44:
            case 64:
            case 65:
            case 66:
            case 67:
                {
                alt30=5;
                }
                break;
            case 48:
                {
                alt30=6;
                }
                break;
            case 56:
                {
                alt30=7;
                }
                break;
            case 57:
                {
                alt30=8;
                }
                break;
            case 58:
                {
                alt30=9;
                }
                break;
            case 68:
                {
                alt30=10;
                }
                break;
            case 69:
                {
                alt30=11;
                }
                break;
            case 70:
                {
                alt30=12;
                }
                break;
            case 42:
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1815:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4362);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1825:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4389);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1835:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4416);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1845:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4443);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1855:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4470);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1865:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4497);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1875:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4524);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1885:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4551);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1895:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4578);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1905:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4605);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1915:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4632);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1925:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4659);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1935:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4686);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1951:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1952:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1953:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4721);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4731); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1960:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1963:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1964:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1964:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt31=6;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt31=1;
                }
                break;
            case 64:
            case 65:
                {
                alt31=2;
                }
                break;
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt31=3;
                }
                break;
            case 66:
                {
                alt31=4;
                }
                break;
            case RULE_STRING:
                {
                alt31=5;
                }
                break;
            case 67:
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1965:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4778);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1975:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4805);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1985:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4832);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1995:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral4859);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2005:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral4886);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2015:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4913);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2031:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2032:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2033:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure4948);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure4958); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2040:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2043:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2044:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2044:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2044:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2044:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2045:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleXClosure5004); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2054:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2054:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2069:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2069:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2069:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID||LA33_0==42||LA33_0==73) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2069:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2069:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2070:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2070:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2071:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5075);
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

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2087:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==41) ) {
                                    alt32=1;
                                }


                                switch (alt32) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2087:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleXClosure5088); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2091:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2092:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2092:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2093:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5109);
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

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2109:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2110:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2110:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2111:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,45,FOLLOW_45_in_ruleXClosure5131); if (state.failed) return current;
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

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2124:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2125:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2125:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2126:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5168);
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

            otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleXClosure5180); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2154:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2155:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2156:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5216);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5226); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2163:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2166:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2167:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2167:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2167:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2167:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2168:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2173:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_DECIMAL)||LA36_0==17||LA36_0==28||(LA36_0>=31 && LA36_0<=32)||LA36_0==42||LA36_0==44||LA36_0==48||LA36_0==50||LA36_0==52||(LA36_0>=56 && LA36_0<=61)||(LA36_0>=63 && LA36_0<=70)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2173:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2173:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2174:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2174:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2175:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5282);
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

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2191:2: (otherlv_2= ';' )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==47) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2191:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXExpressionInClosure5295); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2203:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2204:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2205:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5335);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5345); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2212:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2215:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2216:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2216:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2216:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2216:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2216:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2232:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2232:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2232:7: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2233:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2238:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID||LA38_0==42||LA38_0==73) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2238:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2238:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2239:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2239:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2240:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5453);
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

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2256:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==41) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2256:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXShortClosure5466); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2260:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2261:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2261:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2262:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5487);
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

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2278:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2279:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2279:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2280:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,45,FOLLOW_45_in_ruleXShortClosure5509); if (state.failed) return current;
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

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2293:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2294:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2294:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2295:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5545);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2319:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2320:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2321:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5581);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5591); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2328:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2331:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2332:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2332:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2332:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleXParenthesizedExpression5628); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5650);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXParenthesizedExpression5661); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2357:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2358:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2359:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5697);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5707); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2366:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2369:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2370:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2370:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2370:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2370:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2371:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXIfExpression5753); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXIfExpression5765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2384:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2385:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2385:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2386:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5786);
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

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXIfExpression5798); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2406:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2407:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2407:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2408:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5819);
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

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2424:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                int LA39_1 = input.LA(2);

                if ( (synpred18_InternalHelloXvars()) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2424:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2424:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2424:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleXIfExpression5840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2429:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2430:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2430:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2431:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5862);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2455:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2456:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2457:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5900);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5910); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2464:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2467:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2468:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2468:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2468:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2468:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2469:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression5956); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2478:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_DECIMAL)||LA41_0==17||LA41_0==28||(LA41_0>=31 && LA41_0<=32)||LA41_0==44||LA41_0==48||LA41_0==50||LA41_0==52||(LA41_0>=56 && LA41_0<=58)||LA41_0==61||(LA41_0>=63 && LA41_0<=70)) ) {
                alt41=1;
            }
            else if ( (LA41_0==42) ) {
                int LA41_2 = input.LA(2);

                if ( (LA41_2==RULE_ID) ) {
                    int LA41_3 = input.LA(3);

                    if ( (LA41_3==51) && (synpred20_InternalHelloXvars())) {
                        alt41=2;
                    }
                    else if ( ((LA41_3>=18 && LA41_3<=40)||(LA41_3>=42 && LA41_3<=44)||LA41_3==62) ) {
                        alt41=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA41_2>=RULE_STRING && LA41_2<=RULE_DECIMAL)||LA41_2==17||LA41_2==28||(LA41_2>=31 && LA41_2<=32)||LA41_2==42||LA41_2==44||LA41_2==48||LA41_2==50||LA41_2==52||(LA41_2>=56 && LA41_2<=58)||LA41_2==61||(LA41_2>=63 && LA41_2<=70)) ) {
                    alt41=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2478:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2478:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2478:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2478:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID) ) {
                        int LA40_1 = input.LA(2);

                        if ( (LA40_1==51) && (synpred19_InternalHelloXvars())) {
                            alt40=1;
                        }
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2478:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2483:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2483:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2483:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2484:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2484:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2485:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
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

                            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6011); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2505:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2506:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2506:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2507:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
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


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2524:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2524:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2524:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2524:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2524:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2530:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2530:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleXSwitchExpression6079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2534:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2535:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2535:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2536:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6100);
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

                    otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6112); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2556:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2557:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2557:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2558:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6135);
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

                    otherlv_9=(Token)match(input,43,FOLLOW_43_in_ruleXSwitchExpression6147); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2582:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID||LA42_0==42||LA42_0==51||LA42_0==55||LA42_0==73) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2583:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2583:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2584:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6182);
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
            	    if ( cnt42 >= 1 ) break loop42;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2600:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==53) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2600:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6196); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6208); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2608:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2609:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2609:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2610:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6229);
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

            otherlv_15=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6243); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2638:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2639:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2640:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6279);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6289); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2647:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2650:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2651:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2651:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2651:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2651:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID||LA44_0==42||LA44_0==73) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2652:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2652:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2653:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6335);
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

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2669:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==55) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2669:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXCasePart6349); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2673:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2674:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2674:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2675:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6370);
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

            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleXCasePart6384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2695:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2696:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2696:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2697:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6405);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2721:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2722:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2723:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6441);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6451); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2730:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2733:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2734:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2734:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2734:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2734:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2735:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXForLoopExpression6497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXForLoopExpression6509); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2748:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2749:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2749:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2750:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6530);
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

            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXForLoopExpression6542); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2770:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2771:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2771:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2772:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6563);
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

            otherlv_6=(Token)match(input,43,FOLLOW_43_in_ruleXForLoopExpression6575); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2792:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2793:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2793:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2794:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6596);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2818:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2819:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2820:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6632);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6642); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2827:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2830:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2831:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2831:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2831:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2831:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2832:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXWhileExpression6688); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXWhileExpression6700); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2845:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2846:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2846:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2847:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6721);
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

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXWhileExpression6733); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2867:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2868:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2868:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2869:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6754);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2893:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2894:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2895:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6790);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6800); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2902:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2905:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2906:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2906:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2906:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2906:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2907:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXDoWhileExpression6846); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2916:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2917:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2917:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2918:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6867);
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

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleXDoWhileExpression6879); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXDoWhileExpression6891); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2942:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2943:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2943:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2944:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6912);
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

            otherlv_6=(Token)match(input,43,FOLLOW_43_in_ruleXDoWhileExpression6924); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2972:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2973:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2974:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6960);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6970); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2981:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2984:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2985:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2985:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2985:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2985:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2986:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXBlockExpression7016); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2995:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_DECIMAL)||LA47_0==17||LA47_0==28||(LA47_0>=31 && LA47_0<=32)||LA47_0==42||LA47_0==44||LA47_0==48||LA47_0==50||LA47_0==52||(LA47_0>=56 && LA47_0<=61)||(LA47_0>=63 && LA47_0<=70)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2995:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2995:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2996:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2996:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2997:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7038);
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

            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3013:2: (otherlv_3= ';' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==47) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3013:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleXBlockExpression7051); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleXBlockExpression7067); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3029:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3030:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3031:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7103);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7113); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3038:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3041:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3042:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3042:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=59 && LA48_0<=60)) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_DECIMAL)||LA48_0==17||LA48_0==28||(LA48_0>=31 && LA48_0<=32)||LA48_0==42||LA48_0==44||LA48_0==48||LA48_0==50||LA48_0==52||(LA48_0>=56 && LA48_0<=58)||LA48_0==61||(LA48_0>=63 && LA48_0<=70)) ) {
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3043:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7160);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3053:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7187);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3069:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3070:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3071:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7222);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7232); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3078:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3081:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3082:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3082:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3082:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3082:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3083:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3088:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==59) ) {
                alt49=1;
            }
            else if ( (LA49_0==60) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3088:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3088:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3089:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3089:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3090:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,59,FOLLOW_59_in_ruleXVariableDeclaration7285); if (state.failed) return current;
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3104:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleXVariableDeclaration7316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3108:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (synpred21_InternalHelloXvars()) ) {
                    alt50=1;
                }
                else if ( (true) ) {
                    alt50=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA50_0==42) && (synpred21_InternalHelloXvars())) {
                alt50=1;
            }
            else if ( (LA50_0==73) && (synpred21_InternalHelloXvars())) {
                alt50=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3108:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3108:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3108:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3116:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3116:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3116:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3117:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3117:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3118:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7364);
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

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3134:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3135:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3135:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3136:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7385);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3153:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3153:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3154:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3154:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3155:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7414);
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

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3171:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==18) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3171:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleXVariableDeclaration7428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3175:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3176:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3176:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3177:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7449);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3201:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3202:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3203:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7487);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7497); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3210:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3213:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3214:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3214:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3214:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3214:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==RULE_ID||LA52_1==28||LA52_1==38||LA52_1==44) ) {
                    alt52=1;
                }
            }
            else if ( (LA52_0==42||LA52_0==73) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3215:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3215:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3216:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7543);
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

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3232:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3233:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3233:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3234:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7565);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3258:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3259:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3260:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7601);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7611); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3267:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3270:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3271:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3271:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3271:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3271:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3272:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3272:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3273:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7657);
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

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3289:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3290:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3290:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3291:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7678);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3315:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3316:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3317:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7714);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7724); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3324:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3327:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3328:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3328:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3328:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3328:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3329:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3334:2: ( ( ruleStaticQualifier ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==62) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3335:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3335:1: ( ruleStaticQualifier )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3336:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7781);
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

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3349:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==28) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3349:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall7795); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3353:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3354:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3354:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3355:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7816);
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

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3371:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==41) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3371:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall7829); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3375:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3376:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3376:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3377:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7850);
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
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall7864); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3397:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3398:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3398:1: ( ruleIdOrSuper )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3399:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7889);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3412:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3412:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3412:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3412:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3419:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3420:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,42,FOLLOW_42_in_ruleXFeatureCall7923); if (state.failed) return current;
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

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3433:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt57=3;
                    alt57 = dfa57.predict(input);
                    switch (alt57) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3433:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3433:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3433:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3450:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3451:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8008);
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
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3468:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3468:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3468:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3468:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3469:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3469:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3470:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8036);
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

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3486:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==41) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3486:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall8049); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3490:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3491:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3491:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3492:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8070);
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
                            	    break loop56;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall8087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3512:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3512:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3517:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3518:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8120);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3542:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3543:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3544:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8158);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8169); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3551:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3554:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3555:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3555:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                alt60=1;
            }
            else if ( (LA60_0==61) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3556:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8216);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3568:2: kw= 'super'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleIdOrSuper8240); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3581:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3582:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3583:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8281);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8292); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3590:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3593:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3594:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3594:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_ID) ) {
                    int LA61_2 = input.LA(2);

                    if ( (LA61_2==62) ) {
                        alt61=1;
                    }


                }


                switch (alt61) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3595:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8339);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,62,FOLLOW_62_in_ruleStaticQualifier8357); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3619:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3620:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3621:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8398);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8408); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3628:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3631:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3632:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3632:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3632:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3632:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3633:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXConstructorCall8454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3642:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3643:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3643:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3644:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8477);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3657:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3657:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3657:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3657:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall8498); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3662:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3663:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3663:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3664:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8520);
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

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3680:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==41) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3680:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall8533); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3684:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3685:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3685:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3686:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8554);
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
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall8568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3706:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3706:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3706:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3706:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,42,FOLLOW_42_in_ruleXConstructorCall8591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3711:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt65=3;
                    alt65 = dfa65.predict(input);
                    switch (alt65) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3711:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3711:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3711:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3728:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3729:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8664);
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
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3746:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3746:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3746:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3746:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3747:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3747:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3748:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8692);
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

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3764:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==41) ) {
                                    alt64=1;
                                }


                                switch (alt64) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3764:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall8705); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3768:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3769:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3769:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3770:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8726);
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
                            	    break loop64;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall8743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3790:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3790:4: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3795:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3796:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall8776);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3820:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3821:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3822:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8813);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8823); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3829:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3832:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3833:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3833:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3833:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3833:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3834:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3839:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==64) ) {
                alt68=1;
            }
            else if ( (LA68_0==65) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3839:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXBooleanLiteral8870); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3844:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3844:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3845:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3845:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3846:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,65,FOLLOW_65_in_ruleXBooleanLiteral8894); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3867:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3868:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3869:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8944);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8954); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3876:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3879:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3880:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3880:1: ( () otherlv_1= 'null' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3880:2: () otherlv_1= 'null'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3880:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3881:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXNullLiteral9000); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3898:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3899:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3900:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9036);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9046); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3907:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3910:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3911:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3911:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3911:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3911:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3912:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3917:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3918:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3918:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3919:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9101);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3943:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3944:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3945:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9137);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9147); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3952:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3955:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3956:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3956:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3956:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3956:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3957:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3962:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3963:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3963:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3964:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9198); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3988:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3989:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3990:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9239);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9249); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3997:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4000:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4001:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4001:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4001:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4001:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4002:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXTypeLiteral9295); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXTypeLiteral9307); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4015:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4016:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4016:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4017:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9330);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXTypeLiteral9342); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4042:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4043:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4044:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9378);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9388); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4051:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4054:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4055:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4055:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4055:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4055:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4056:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXThrowExpression9434); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4065:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4066:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4066:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4067:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9455);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4091:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4092:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4093:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9491);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9501); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4100:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4103:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4104:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4104:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4104:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4104:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4105:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXReturnExpression9547); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4114:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4114:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4119:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4120:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9578);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4144:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4145:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4146:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9615);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9625); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4153:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4156:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4157:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4157:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4157:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4157:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4158:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXTryCatchFinallyExpression9671); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4167:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4168:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4168:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4169:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9692);
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

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4185:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==72) ) {
                alt72=1;
            }
            else if ( (LA72_0==71) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4185:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4185:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4185:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4185:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt70=0;
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==72) ) {
                            int LA70_2 = input.LA(2);

                            if ( (synpred30_InternalHelloXvars()) ) {
                                alt70=1;
                            }


                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4185:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4187:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4188:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9722);
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
                    	    if ( cnt70 >= 1 ) break loop70;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(70, input);
                                throw eee;
                        }
                        cnt70++;
                    } while (true);

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4204:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==71) ) {
                        int LA71_1 = input.LA(2);

                        if ( (synpred31_InternalHelloXvars()) ) {
                            alt71=1;
                        }
                    }
                    switch (alt71) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4204:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4204:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4204:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression9744); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4209:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4210:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4210:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4211:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9766);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4228:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4228:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4228:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression9788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4232:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4233:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4233:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4234:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9809);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4258:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4259:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4260:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9847);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause9857); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4267:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4270:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4271:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4271:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4271:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4271:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4271:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleXCatchClause9902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleXCatchClause9915); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4280:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4281:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4281:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4282:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause9936);
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

            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleXCatchClause9948); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4302:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4303:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4303:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4304:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9969);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4328:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4329:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4330:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10006);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10017); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4337:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4340:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4341:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4341:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4342:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10064);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4352:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==38) ) {
                    int LA73_2 = input.LA(2);

                    if ( (LA73_2==RULE_ID) ) {
                        int LA73_3 = input.LA(3);

                        if ( (synpred33_InternalHelloXvars()) ) {
                            alt73=1;
                        }


                    }


                }


                switch (alt73) {
            	case 1 :
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4352:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4352:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4352:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,38,FOLLOW_38_in_ruleQualifiedName10092); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10115);
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
            	    break loop73;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4379:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4383:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4384:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10169);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10180); if (state.failed) return current;

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4394:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4398:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4399:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4399:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_HEX) ) {
                alt77=1;
            }
            else if ( ((LA77_0>=RULE_INT && LA77_0<=RULE_DECIMAL)) ) {
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4399:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4407:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4407:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4407:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4407:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==RULE_INT) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==RULE_DECIMAL) ) {
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
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4407:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10252); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4415:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10278); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4422:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==38) ) {
                        int LA76_1 = input.LA(2);

                        if ( ((LA76_1>=RULE_INT && LA76_1<=RULE_DECIMAL)) ) {
                            alt76=1;
                        }
                    }
                    switch (alt76) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4423:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,38,FOLLOW_38_in_ruleNumber10298); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4428:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt75=2;
                            int LA75_0 = input.LA(1);

                            if ( (LA75_0==RULE_INT) ) {
                                alt75=1;
                            }
                            else if ( (LA75_0==RULE_DECIMAL) ) {
                                alt75=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 75, 0, input);

                                throw nvae;
                            }
                            switch (alt75) {
                                case 1 :
                                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4428:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10314); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4436:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10340); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4454:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4455:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4456:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10393);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10403); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4463:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4466:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4467:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4467:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_ID) ) {
                alt79=1;
            }
            else if ( (LA79_0==42||LA79_0==73) ) {
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4467:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4467:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4468:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10451);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4476:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==44) ) {
                            int LA78_2 = input.LA(2);

                            if ( (LA78_2==46) ) {
                                int LA78_3 = input.LA(3);

                                if ( (synpred34_InternalHelloXvars()) ) {
                                    alt78=1;
                                }


                            }


                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4476:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4479:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4479:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4479:6: ()
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4480:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleJvmTypeReference10489); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleJvmTypeReference10501); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4495:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10533);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4511:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4512:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4513:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10568);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10578); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4520:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4523:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4524:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4524:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4524:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4524:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==42) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4524:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleXFunctionTypeRef10616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4528:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==RULE_ID||LA81_0==42||LA81_0==73) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4528:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4528:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4529:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4529:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4530:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10638);
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

                            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4546:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop80:
                            do {
                                int alt80=2;
                                int LA80_0 = input.LA(1);

                                if ( (LA80_0==41) ) {
                                    alt80=1;
                                }


                                switch (alt80) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4546:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXFunctionTypeRef10651); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4550:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4551:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4551:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4552:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10672);
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
                            	    break loop80;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXFunctionTypeRef10688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,73,FOLLOW_73_in_ruleXFunctionTypeRef10702); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4576:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4577:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4577:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4578:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10723);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4602:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4603:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4604:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10759);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10769); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4611:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4614:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4615:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4615:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4615:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4615:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4616:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4616:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4617:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10817);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4630:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt84=2;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4630:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4630:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4630:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleJvmParameterizedTypeReference10838); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4635:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4636:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4636:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4637:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10860);
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

                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4653:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==41) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4653:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleJvmParameterizedTypeReference10873); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4657:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4658:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4658:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4659:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10894);
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
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleJvmParameterizedTypeReference10908); if (state.failed) return current;
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4687:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4688:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4689:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10946);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10956); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4696:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4699:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4700:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4700:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_ID||LA85_0==42||LA85_0==73) ) {
                alt85=1;
            }
            else if ( (LA85_0==74) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4701:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11003);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4711:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11030);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4727:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4728:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4729:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11065);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11075); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4736:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4739:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4740:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4740:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4740:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4740:2: ()
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4741:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleJvmWildcardTypeReference11121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4750:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt86=3;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==75) ) {
                alt86=1;
            }
            else if ( (LA86_0==61) ) {
                alt86=2;
            }
            switch (alt86) {
                case 1 :
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4750:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4750:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4751:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4751:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4752:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11143);
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
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4769:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4769:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4770:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4770:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4771:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11170);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4795:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4796:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4797:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11208);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11218); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4804:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4807:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4808:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4808:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4808:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleJvmUpperBound11255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4812:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4813:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4813:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4814:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11276);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4838:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4839:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4840:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11312);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11322); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4847:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4850:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4851:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4851:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4851:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleJvmUpperBoundAnded11359); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4855:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4856:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4856:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4857:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11380);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4881:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4882:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4883:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11416);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11426); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4890:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4893:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4894:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4894:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4894:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleJvmLowerBound11463); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4898:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4899:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4899:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4900:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11484);
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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4926:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4927:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4928:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11523);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11534); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4935:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4938:28: (this_ID_0= RULE_ID )
            // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4939:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11573); if (state.failed) return current;
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
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1091:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1091:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1091:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1091:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1091:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1092:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1092:2: ( ( ruleOpAdd ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1093:1: ( ruleOpAdd )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1093:1: ( ruleOpAdd )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1094:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalHelloXvars2643);
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
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1199:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1199:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1199:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1199:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1199:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1200:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1200:2: ( ( ruleOpMulti ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1201:1: ( ruleOpMulti )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1201:1: ( ruleOpMulti )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1202:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalHelloXvars2923);
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
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1432:3: ( ( () 'as' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1432:4: ( () 'as' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1432:4: ( () 'as' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1432:5: () 'as'
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1432:5: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1433:1: 
        {
        }

        match(input,37,FOLLOW_37_in_synpred10_InternalHelloXvars3517); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalHelloXvars

    // $ANTLR start synpred11_InternalHelloXvars
    public final void synpred11_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1492:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1492:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1492:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1492:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1492:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1493:1: 
        {
        }

        match(input,38,FOLLOW_38_in_synpred11_InternalHelloXvars3671); if (state.failed) return ;
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1494:1: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1495:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1495:1: ( ruleValidID )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1496:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalHelloXvars3680);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalHelloXvars3686);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalHelloXvars

    // $ANTLR start synpred12_InternalHelloXvars
    public final void synpred12_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1550:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1550:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1550:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1550:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1550:10: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1551:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1551:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt87=3;
        switch ( input.LA(1) ) {
        case 38:
            {
            alt87=1;
            }
            break;
        case 39:
            {
            alt87=2;
            }
            break;
        case 40:
            {
            alt87=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 87, 0, input);

            throw nvae;
        }

        switch (alt87) {
            case 1 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1551:4: '.'
                {
                match(input,38,FOLLOW_38_in_synpred12_InternalHelloXvars3789); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1553:6: ( ( '?.' ) )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1553:6: ( ( '?.' ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1554:1: ( '?.' )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1554:1: ( '?.' )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1555:2: '?.'
                {
                match(input,39,FOLLOW_39_in_synpred12_InternalHelloXvars3803); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1560:6: ( ( '*.' ) )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1560:6: ( ( '*.' ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1561:1: ( '*.' )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1561:1: ( '*.' )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1562:2: '*.'
                {
                match(input,40,FOLLOW_40_in_synpred12_InternalHelloXvars3823); if (state.failed) return ;

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
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1671:4: ( ( '(' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1672:1: ( '(' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1672:1: ( '(' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1673:2: '('
        {
        match(input,42,FOLLOW_42_in_synpred13_InternalHelloXvars4050); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalHelloXvars

    // $ANTLR start synpred14_InternalHelloXvars
    public final void synpred14_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1692:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1692:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1692:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1692:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1692:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1693:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1693:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt89=2;
        int LA89_0 = input.LA(1);

        if ( (LA89_0==RULE_ID||LA89_0==42||LA89_0==73) ) {
            alt89=1;
        }
        switch (alt89) {
            case 1 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1693:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1693:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1694:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1694:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1695:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloXvars4102);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1697:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop88:
                do {
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==41) ) {
                        alt88=1;
                    }


                    switch (alt88) {
                	case 1 :
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1697:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,41,FOLLOW_41_in_synpred14_InternalHelloXvars4109); if (state.failed) return ;
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1698:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1699:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1699:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1700:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloXvars4116);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop88;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1702:6: ( ( '|' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1703:1: ( '|' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1703:1: ( '|' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1704:2: '|'
        {
        match(input,45,FOLLOW_45_in_synpred14_InternalHelloXvars4130); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalHelloXvars

    // $ANTLR start synpred15_InternalHelloXvars
    public final void synpred15_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1771:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1772:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1772:1: ( ruleXClosure )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:1773:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalHelloXvars4248);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalHelloXvars

    // $ANTLR start synpred16_InternalHelloXvars
    public final void synpred16_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2054:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2054:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2054:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2054:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2054:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt91=2;
        int LA91_0 = input.LA(1);

        if ( (LA91_0==RULE_ID||LA91_0==42||LA91_0==73) ) {
            alt91=1;
        }
        switch (alt91) {
            case 1 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2054:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2054:5: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2055:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2055:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2056:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXvars5021);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2058:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop90:
                do {
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==41) ) {
                        alt90=1;
                    }


                    switch (alt90) {
                	case 1 :
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2058:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,41,FOLLOW_41_in_synpred16_InternalHelloXvars5028); if (state.failed) return ;
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2059:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2060:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2060:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2061:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXvars5035);
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

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2063:6: ( ( '|' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2064:1: ( '|' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2064:1: ( '|' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2065:2: '|'
        {
        match(input,45,FOLLOW_45_in_synpred16_InternalHelloXvars5049); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalHelloXvars

    // $ANTLR start synpred18_InternalHelloXvars
    public final void synpred18_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2424:4: ( 'else' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2424:6: 'else'
        {
        match(input,49,FOLLOW_49_in_synpred18_InternalHelloXvars5832); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalHelloXvars

    // $ANTLR start synpred19_InternalHelloXvars
    public final void synpred19_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2478:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2478:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2478:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2478:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2478:6: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2479:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2479:1: ( ruleValidID )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2480:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalHelloXvars5974);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,51,FOLLOW_51_in_synpred19_InternalHelloXvars5980); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalHelloXvars

    // $ANTLR start synpred20_InternalHelloXvars
    public final void synpred20_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2524:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2524:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2524:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2524:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,42,FOLLOW_42_in_synpred20_InternalHelloXvars6056); if (state.failed) return ;
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2525:1: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2526:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2526:1: ( ruleValidID )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:2527:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalHelloXvars6063);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,51,FOLLOW_51_in_synpred20_InternalHelloXvars6069); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalHelloXvars

    // $ANTLR start synpred21_InternalHelloXvars
    public final void synpred21_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3108:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3108:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3108:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3108:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3108:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3109:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3109:1: ( ruleJvmTypeReference )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3110:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred21_InternalHelloXvars7334);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3112:2: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3113:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3113:1: ( ruleValidID )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3114:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred21_InternalHelloXvars7343);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred21_InternalHelloXvars

    // $ANTLR start synpred22_InternalHelloXvars
    public final void synpred22_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3412:4: ( ( '(' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3413:1: ( '(' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3413:1: ( '(' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3414:2: '('
        {
        match(input,42,FOLLOW_42_in_synpred22_InternalHelloXvars7905); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred22_InternalHelloXvars

    // $ANTLR start synpred23_InternalHelloXvars
    public final void synpred23_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3433:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3433:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3433:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3433:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3433:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3434:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3434:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==RULE_ID||LA95_0==42||LA95_0==73) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3434:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3434:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3435:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3435:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3436:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalHelloXvars7957);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3438:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop94:
                do {
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==41) ) {
                        alt94=1;
                    }


                    switch (alt94) {
                	case 1 :
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3438:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,41,FOLLOW_41_in_synpred23_InternalHelloXvars7964); if (state.failed) return ;
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3439:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3440:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3440:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3441:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalHelloXvars7971);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop94;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3443:6: ( ( '|' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3444:1: ( '|' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3444:1: ( '|' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3445:2: '|'
        {
        match(input,45,FOLLOW_45_in_synpred23_InternalHelloXvars7985); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred23_InternalHelloXvars

    // $ANTLR start synpred24_InternalHelloXvars
    public final void synpred24_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3512:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3513:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3513:1: ( ruleXClosure )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3514:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred24_InternalHelloXvars8103);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalHelloXvars

    // $ANTLR start synpred25_InternalHelloXvars
    public final void synpred25_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3657:4: ( '<' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3657:6: '<'
        {
        match(input,28,FOLLOW_28_in_synpred25_InternalHelloXvars8490); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalHelloXvars

    // $ANTLR start synpred26_InternalHelloXvars
    public final void synpred26_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3706:5: ( '(' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3706:7: '('
        {
        match(input,42,FOLLOW_42_in_synpred26_InternalHelloXvars8583); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalHelloXvars

    // $ANTLR start synpred27_InternalHelloXvars
    public final void synpred27_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3711:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3711:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3711:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3711:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3711:6: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3712:1: 
        {
        }

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3712:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==RULE_ID||LA97_0==42||LA97_0==73) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3712:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3712:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3713:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3713:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3714:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloXvars8613);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3716:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop96:
                do {
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==41) ) {
                        alt96=1;
                    }


                    switch (alt96) {
                	case 1 :
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3716:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,41,FOLLOW_41_in_synpred27_InternalHelloXvars8620); if (state.failed) return ;
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3717:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3718:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3718:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3719:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloXvars8627);
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

        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3721:6: ( ( '|' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3722:1: ( '|' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3722:1: ( '|' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3723:2: '|'
        {
        match(input,45,FOLLOW_45_in_synpred27_InternalHelloXvars8641); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalHelloXvars

    // $ANTLR start synpred28_InternalHelloXvars
    public final void synpred28_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3790:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3791:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3791:1: ( ruleXClosure )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:3792:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred28_InternalHelloXvars8759);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalHelloXvars

    // $ANTLR start synpred29_InternalHelloXvars
    public final void synpred29_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4114:2: ( ( ruleXExpression ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4115:1: ( ruleXExpression )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4115:1: ( ruleXExpression )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4116:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred29_InternalHelloXvars9561);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred29_InternalHelloXvars

    // $ANTLR start synpred30_InternalHelloXvars
    public final void synpred30_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4185:5: ( 'catch' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4185:7: 'catch'
        {
        match(input,72,FOLLOW_72_in_synpred30_InternalHelloXvars9706); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalHelloXvars

    // $ANTLR start synpred31_InternalHelloXvars
    public final void synpred31_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4204:5: ( 'finally' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4204:7: 'finally'
        {
        match(input,71,FOLLOW_71_in_synpred31_InternalHelloXvars9736); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalHelloXvars

    // $ANTLR start synpred33_InternalHelloXvars
    public final void synpred33_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4352:3: ( '.' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4353:2: '.'
        {
        match(input,38,FOLLOW_38_in_synpred33_InternalHelloXvars10083); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalHelloXvars

    // $ANTLR start synpred34_InternalHelloXvars
    public final void synpred34_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4476:2: ( ( () '[' ']' ) )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4476:3: ( () '[' ']' )
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4476:3: ( () '[' ']' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4476:4: () '[' ']'
        {
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4476:4: ()
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4477:1: 
        {
        }

        match(input,44,FOLLOW_44_in_synpred34_InternalHelloXvars10466); if (state.failed) return ;
        match(input,46,FOLLOW_46_in_synpred34_InternalHelloXvars10470); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred34_InternalHelloXvars

    // $ANTLR start synpred35_InternalHelloXvars
    public final void synpred35_InternalHelloXvars_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4630:4: ( '<' )
        // ../org.xtext.example.helloxvars/src-gen/org/xtext/example/helloxvars/parser/antlr/internal/InternalHelloXvars.g:4630:6: '<'
        {
        match(input,28,FOLLOW_28_in_synpred35_InternalHelloXvars10830); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalHelloXvars

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
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA84 dfa84 = new DFA84(this);
    static final String DFA27_eotS =
        "\77\uffff";
    static final String DFA27_eofS =
        "\1\2\76\uffff";
    static final String DFA27_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA27_maxS =
        "\1\111\1\0\75\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA27_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA27_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\1\2\1\uffff\27\2\1\1\2\2\1\uffff\20"+
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
            return "1671:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
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
                        if ( (synpred13_InternalHelloXvars()) ) {s = 62;}

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
        "\36\uffff";
    static final String DFA26_eofS =
        "\36\uffff";
    static final String DFA26_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA26_maxS =
        "\1\111\2\0\33\uffff";
    static final String DFA26_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA26_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1\4\5\10\uffff\1\5\12\uffff\1\5\2\uffff\2\5\11\uffff\1\2"+
            "\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3"+
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
            return "1692:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA26_0==42) ) {s = 2;}

                        else if ( (LA26_0==73) && (synpred14_InternalHelloXvars())) {s = 3;}

                        else if ( (LA26_0==45) && (synpred14_InternalHelloXvars())) {s = 4;}

                        else if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_DECIMAL)||LA26_0==17||LA26_0==28||(LA26_0>=31 && LA26_0<=32)||LA26_0==44||LA26_0==48||LA26_0==50||LA26_0==52||(LA26_0>=56 && LA26_0<=58)||LA26_0==61||(LA26_0>=63 && LA26_0<=70)) ) {s = 5;}

                        else if ( (LA26_0==43) ) {s = 29;}

                         
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
        "\77\uffff";
    static final String DFA28_eofS =
        "\1\2\76\uffff";
    static final String DFA28_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA28_maxS =
        "\1\111\1\0\75\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA28_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA28_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\1\2\1\uffff\31\2\1\1\1\uffff\20\2\1"+
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
            return "1771:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
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
                        if ( (synpred15_InternalHelloXvars()) ) {s = 62;}

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
        "\40\uffff";
    static final String DFA34_eofS =
        "\40\uffff";
    static final String DFA34_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA34_maxS =
        "\1\111\2\0\35\uffff";
    static final String DFA34_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA34_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1\4\5\10\uffff\1\5\12\uffff\1\5\2\uffff\2\5\11\uffff\1\2"+
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
            return "2054:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
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

                        else if ( (LA34_0==42) ) {s = 2;}

                        else if ( (LA34_0==73) && (synpred16_InternalHelloXvars())) {s = 3;}

                        else if ( (LA34_0==45) && (synpred16_InternalHelloXvars())) {s = 4;}

                        else if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_DECIMAL)||LA34_0==17||LA34_0==28||(LA34_0>=31 && LA34_0<=32)||LA34_0==44||LA34_0==46||LA34_0==48||LA34_0==50||LA34_0==52||(LA34_0>=56 && LA34_0<=61)||(LA34_0>=63 && LA34_0<=70)) ) {s = 5;}

                         
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
    static final String DFA58_eotS =
        "\77\uffff";
    static final String DFA58_eofS =
        "\1\2\76\uffff";
    static final String DFA58_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA58_maxS =
        "\1\111\1\0\75\uffff";
    static final String DFA58_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA58_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA58_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\1\2\1\uffff\27\2\1\1\2\2\1\uffff\20"+
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
            return "3412:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred22_InternalHelloXvars()) ) {s = 62;}

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
    static final String DFA57_eotS =
        "\36\uffff";
    static final String DFA57_eofS =
        "\36\uffff";
    static final String DFA57_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA57_maxS =
        "\1\111\2\0\33\uffff";
    static final String DFA57_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA57_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\1\4\5\10\uffff\1\5\12\uffff\1\5\2\uffff\2\5\11\uffff\1\2"+
            "\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3"+
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
            return "3433:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_0 = input.LA(1);

                         
                        int index57_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA57_0==RULE_ID) ) {s = 1;}

                        else if ( (LA57_0==42) ) {s = 2;}

                        else if ( (LA57_0==73) && (synpred23_InternalHelloXvars())) {s = 3;}

                        else if ( (LA57_0==45) && (synpred23_InternalHelloXvars())) {s = 4;}

                        else if ( ((LA57_0>=RULE_STRING && LA57_0<=RULE_DECIMAL)||LA57_0==17||LA57_0==28||(LA57_0>=31 && LA57_0<=32)||LA57_0==44||LA57_0==48||LA57_0==50||LA57_0==52||(LA57_0>=56 && LA57_0<=58)||LA57_0==61||(LA57_0>=63 && LA57_0<=70)) ) {s = 5;}

                        else if ( (LA57_0==43) ) {s = 29;}

                         
                        input.seek(index57_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA57_1 = input.LA(1);

                         
                        int index57_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index57_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA57_2 = input.LA(1);

                         
                        int index57_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index57_2);
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
    static final String DFA59_eotS =
        "\77\uffff";
    static final String DFA59_eofS =
        "\1\2\76\uffff";
    static final String DFA59_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA59_maxS =
        "\1\111\1\0\75\uffff";
    static final String DFA59_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA59_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA59_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\1\2\1\uffff\31\2\1\1\1\uffff\20\2\1"+
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
            return "3512:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index59_1);
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
    static final String DFA63_eotS =
        "\77\uffff";
    static final String DFA63_eofS =
        "\1\2\76\uffff";
    static final String DFA63_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA63_maxS =
        "\1\111\1\0\75\uffff";
    static final String DFA63_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA63_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA63_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\1\2\1\uffff\11\2\1\1\20\2\1\uffff\20"+
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
            "",
            "",
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "3657:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_1 = input.LA(1);

                         
                        int index63_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index63_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\77\uffff";
    static final String DFA66_eofS =
        "\1\2\76\uffff";
    static final String DFA66_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA66_maxS =
        "\1\111\1\0\75\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA66_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\1\2\1\uffff\27\2\1\1\2\2\1\uffff\20"+
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
            "",
            "",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "3706:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\36\uffff";
    static final String DFA65_eofS =
        "\36\uffff";
    static final String DFA65_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA65_maxS =
        "\1\111\2\0\33\uffff";
    static final String DFA65_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA65_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA65_transitionS = {
            "\1\1\4\5\10\uffff\1\5\12\uffff\1\5\2\uffff\2\5\11\uffff\1\2"+
            "\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\3"+
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
            return "3711:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_0 = input.LA(1);

                         
                        int index65_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_0==RULE_ID) ) {s = 1;}

                        else if ( (LA65_0==42) ) {s = 2;}

                        else if ( (LA65_0==73) && (synpred27_InternalHelloXvars())) {s = 3;}

                        else if ( (LA65_0==45) && (synpred27_InternalHelloXvars())) {s = 4;}

                        else if ( ((LA65_0>=RULE_STRING && LA65_0<=RULE_DECIMAL)||LA65_0==17||LA65_0==28||(LA65_0>=31 && LA65_0<=32)||LA65_0==44||LA65_0==48||LA65_0==50||LA65_0==52||(LA65_0>=56 && LA65_0<=58)||LA65_0==61||(LA65_0>=63 && LA65_0<=70)) ) {s = 5;}

                        else if ( (LA65_0==43) ) {s = 29;}

                         
                        input.seek(index65_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA65_2 = input.LA(1);

                         
                        int index65_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHelloXvars()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index65_2);
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
        "\77\uffff";
    static final String DFA67_eofS =
        "\1\2\76\uffff";
    static final String DFA67_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA67_maxS =
        "\1\111\1\0\75\uffff";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA67_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\1\2\1\uffff\31\2\1\1\1\uffff\20\2\1"+
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
            return "3790:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred28_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index67_1);
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
        "\77\uffff";
    static final String DFA69_eofS =
        "\1\33\76\uffff";
    static final String DFA69_minS =
        "\1\4\32\0\44\uffff";
    static final String DFA69_maxS =
        "\1\111\32\0\44\uffff";
    static final String DFA69_acceptS =
        "\33\uffff\1\2\42\uffff\1\1";
    static final String DFA69_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\44\uffff}>";
    static final String[] DFA69_transitionS = {
            "\1\1\1\21\1\15\1\16\1\17\6\uffff\1\33\1\uffff\1\2\1\uffff\11"+
            "\33\1\10\2\33\1\4\1\3\11\33\1\32\1\33\1\12\1\uffff\2\33\1\23"+
            "\1\33\1\7\1\33\1\6\3\33\1\24\1\25\1\26\2\33\1\11\1\uffff\1\5"+
            "\1\13\1\14\1\20\1\22\1\27\1\30\1\31\3\33",
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
            return "4114:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_2 = input.LA(1);

                         
                        int index69_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA69_3 = input.LA(1);

                         
                        int index69_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA69_4 = input.LA(1);

                         
                        int index69_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA69_5 = input.LA(1);

                         
                        int index69_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA69_6 = input.LA(1);

                         
                        int index69_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA69_7 = input.LA(1);

                         
                        int index69_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA69_8 = input.LA(1);

                         
                        int index69_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA69_9 = input.LA(1);

                         
                        int index69_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA69_10 = input.LA(1);

                         
                        int index69_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA69_11 = input.LA(1);

                         
                        int index69_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA69_12 = input.LA(1);

                         
                        int index69_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA69_13 = input.LA(1);

                         
                        int index69_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA69_14 = input.LA(1);

                         
                        int index69_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA69_15 = input.LA(1);

                         
                        int index69_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA69_16 = input.LA(1);

                         
                        int index69_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA69_17 = input.LA(1);

                         
                        int index69_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA69_18 = input.LA(1);

                         
                        int index69_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA69_19 = input.LA(1);

                         
                        int index69_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA69_20 = input.LA(1);

                         
                        int index69_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA69_21 = input.LA(1);

                         
                        int index69_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA69_22 = input.LA(1);

                         
                        int index69_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA69_23 = input.LA(1);

                         
                        int index69_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA69_24 = input.LA(1);

                         
                        int index69_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA69_25 = input.LA(1);

                         
                        int index69_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA69_26 = input.LA(1);

                         
                        int index69_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_26);
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
    static final String DFA84_eotS =
        "\77\uffff";
    static final String DFA84_eofS =
        "\1\2\76\uffff";
    static final String DFA84_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA84_maxS =
        "\1\111\1\0\75\uffff";
    static final String DFA84_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA84_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA84_transitionS = {
            "\5\2\6\uffff\1\2\1\uffff\1\2\1\uffff\11\2\1\1\20\2\1\uffff\20"+
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
            "",
            "",
            ""
    };

    static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
    static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
    static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
    static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
    static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
    static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
    static final short[][] DFA84_transition;

    static {
        int numStates = DFA84_transitionS.length;
        DFA84_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = DFA84_eot;
            this.eof = DFA84_eof;
            this.min = DFA84_min;
            this.max = DFA84_max;
            this.accept = DFA84_accept;
            this.special = DFA84_special;
            this.transition = DFA84_transition;
        }
        public String getDescription() {
            return "4630:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA84_1 = input.LA(1);

                         
                        int index84_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalHelloXvars()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index84_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 84, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x180000000000A002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleModel153 = new BitSet(new long[]{0x1800000000008002L});
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
    public static final BitSet FOLLOW_16_in_ruleGreeting517 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleGreeting538 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGreeting550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment744 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment760 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment810 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment863 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
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
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1211 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1234 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpOr1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1417 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1470 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1493 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpAnd1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1676 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1729 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1752 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpEquality1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpEquality1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1956 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_24_in_ruleXRelationalExpression1992 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2015 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2076 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2099 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2342 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2395 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2418 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2622 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2675 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2698 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpAdd2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpAdd2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2902 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2955 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2978 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpMulti3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpMulti3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3231 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpUnary3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpUnary3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpUnary3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3501 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleXCastedExpression3536 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3559 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3654 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall3703 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3726 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3742 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3764 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall3850 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall3874 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall3911 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall3940 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3961 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall3974 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3995 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall4009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4034 = new BitSet(new long[]{0x000015C000000002L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4068 = new BitSet(new long[]{0xA7153C01900201F0L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4153 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4181 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4194 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4215 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4232 = new BitSet(new long[]{0x000011C000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4265 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral4886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure4948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXClosure5004 = new BitSet(new long[]{0xBF157401900201F0L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5075 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_ruleXClosure5088 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5109 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_ruleXClosure5131 = new BitSet(new long[]{0xBF155401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5168 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXClosure5180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5282 = new BitSet(new long[]{0xBF159401900201F2L,0x000000000000007FL});
    public static final BitSet FOLLOW_47_in_ruleXExpressionInClosure5295 = new BitSet(new long[]{0xBF151401900201F2L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5453 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_ruleXShortClosure5466 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5487 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_ruleXShortClosure5509 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXParenthesizedExpression5628 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5650 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXParenthesizedExpression5661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXIfExpression5753 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXIfExpression5765 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5786 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXIfExpression5798 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5819 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXIfExpression5840 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression5956 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression5999 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6011 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6035 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_42_in_ruleXSwitchExpression6079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6100 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6112 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6135 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXSwitchExpression6147 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6161 = new BitSet(new long[]{0x0088040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6182 = new BitSet(new long[]{0x00E8040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6196 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6208 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6229 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6335 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXCasePart6349 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6370 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXCasePart6384 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXForLoopExpression6497 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXForLoopExpression6509 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6530 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXForLoopExpression6542 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6563 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXForLoopExpression6575 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXWhileExpression6688 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXWhileExpression6700 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6721 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXWhileExpression6733 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXDoWhileExpression6846 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6867 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXDoWhileExpression6879 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXDoWhileExpression6891 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6912 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXDoWhileExpression6924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXBlockExpression7016 = new BitSet(new long[]{0xBF551401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7038 = new BitSet(new long[]{0xBF559401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_47_in_ruleXBlockExpression7051 = new BitSet(new long[]{0xBF551401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_54_in_ruleXBlockExpression7067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXVariableDeclaration7285 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_60_in_ruleXVariableDeclaration7316 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7385 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7414 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXVariableDeclaration7428 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7781 = new BitSet(new long[]{0x2000000010000010L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall7795 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7816 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall7829 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7850 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall7864 = new BitSet(new long[]{0x2000000010000010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7889 = new BitSet(new long[]{0x0000140000000002L});
    public static final BitSet FOLLOW_42_in_ruleXFeatureCall7923 = new BitSet(new long[]{0xA7153C01900201F0L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8008 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8036 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall8049 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8070 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall8087 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleIdOrSuper8240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8339 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleStaticQualifier8357 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXConstructorCall8454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8477 = new BitSet(new long[]{0x0000140010000002L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall8498 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8520 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall8533 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8554 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall8568 = new BitSet(new long[]{0x0000140000000002L});
    public static final BitSet FOLLOW_42_in_ruleXConstructorCall8591 = new BitSet(new long[]{0xA7153C01900201F0L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8664 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8692 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall8705 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8726 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall8743 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall8776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXBooleanLiteral8870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXBooleanLiteral8894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXNullLiteral9000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXTypeLiteral9295 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXTypeLiteral9307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9330 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXTypeLiteral9342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXThrowExpression9434 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXReturnExpression9547 = new BitSet(new long[]{0xA7151401900201F2L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXTryCatchFinallyExpression9671 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9722 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression9744 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression9788 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause9857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXCatchClause9902 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXCatchClause9915 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause9936 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXCatchClause9948 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10064 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleQualifiedName10092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10115 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10252 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10278 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleNumber10298 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10451 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleJvmTypeReference10489 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleJvmTypeReference10501 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXFunctionTypeRef10616 = new BitSet(new long[]{0x00000C0000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10638 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_41_in_ruleXFunctionTypeRef10651 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10672 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFunctionTypeRef10688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleXFunctionTypeRef10702 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10817 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleJvmParameterizedTypeReference10838 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10860 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_41_in_ruleJvmParameterizedTypeReference10873 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10894 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_27_in_ruleJvmParameterizedTypeReference10908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmWildcardTypeReference11121 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJvmUpperBound11255 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmUpperBoundAnded11359 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleJvmLowerBound11463 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloXvars831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalHelloXvars1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalHelloXvars1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalHelloXvars1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred5_InternalHelloXvars1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalHelloXvars2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalHelloXvars2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalHelloXvars2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalHelloXvars2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred10_InternalHelloXvars3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred11_InternalHelloXvars3671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalHelloXvars3680 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalHelloXvars3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred12_InternalHelloXvars3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred12_InternalHelloXvars3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred12_InternalHelloXvars3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred13_InternalHelloXvars4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloXvars4102 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_synpred14_InternalHelloXvars4109 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloXvars4116 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_synpred14_InternalHelloXvars4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalHelloXvars4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXvars5021 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_synpred16_InternalHelloXvars5028 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXvars5035 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_synpred16_InternalHelloXvars5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred18_InternalHelloXvars5832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalHelloXvars5974 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_synpred19_InternalHelloXvars5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred20_InternalHelloXvars6056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalHelloXvars6063 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_synpred20_InternalHelloXvars6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred21_InternalHelloXvars7334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred21_InternalHelloXvars7343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred22_InternalHelloXvars7905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalHelloXvars7957 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_synpred23_InternalHelloXvars7964 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalHelloXvars7971 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_synpred23_InternalHelloXvars7985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred24_InternalHelloXvars8103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred25_InternalHelloXvars8490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred26_InternalHelloXvars8583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloXvars8613 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_synpred27_InternalHelloXvars8620 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloXvars8627 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_synpred27_InternalHelloXvars8641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred28_InternalHelloXvars8759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred29_InternalHelloXvars9561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_synpred30_InternalHelloXvars9706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_synpred31_InternalHelloXvars9736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred33_InternalHelloXvars10083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred34_InternalHelloXvars10466 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_synpred34_InternalHelloXvars10470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred35_InternalHelloXvars10830 = new BitSet(new long[]{0x0000000000000002L});

}