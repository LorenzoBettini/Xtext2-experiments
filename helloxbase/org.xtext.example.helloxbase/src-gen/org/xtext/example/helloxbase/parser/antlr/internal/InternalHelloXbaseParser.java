package org.xtext.example.helloxbase.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.helloxbase.services.HelloXbaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalHelloXbaseParser extends AbstractInternalAntlrParser {
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


        public InternalHelloXbaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHelloXbaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHelloXbaseParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g"; }



     	private HelloXbaseGrammarAccess grammarAccess;
     	
        public InternalHelloXbaseParser(TokenStream input, HelloXbaseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected HelloXbaseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_greetings_1_0= ruleGreeting ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_greetings_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_greetings_1_0= ruleGreeting ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_greetings_1_0= ruleGreeting ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_greetings_1_0= ruleGreeting ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_greetings_1_0= ruleGreeting ) )*
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:82:3: lv_imports_0_0= ruleImport
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:98:3: ( (lv_greetings_1_0= ruleGreeting ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:99:1: (lv_greetings_1_0= ruleGreeting )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:99:1: (lv_greetings_1_0= ruleGreeting )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:100:3: lv_greetings_1_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel153);
            	    lv_greetings_1_0=ruleGreeting();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"greetings",
            	              		lv_greetings_1_0, 
            	              		"Greeting");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:124:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:125:2: (iv_ruleImport= ruleImport EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:126:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport190);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport200); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:133:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:136:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:137:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:141:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:143:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport258);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:167:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:168:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:169:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard295);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard306); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:176:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:179:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:180:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:180:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:181:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard353);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:191:1: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:192:2: kw= '.*'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedNameWithWildcard372); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:205:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:206:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:207:2: iv_ruleGreeting= ruleGreeting EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreetingRule()); 
            }
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting414);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreeting; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting424); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:214:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expressions_3_0= ruleXExpression ) ) otherlv_4= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:217:28: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expressions_3_0= ruleXExpression ) ) otherlv_4= '!' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:218:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expressions_3_0= ruleXExpression ) ) otherlv_4= '!' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:218:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expressions_3_0= ruleXExpression ) ) otherlv_4= '!' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:218:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expressions_3_0= ruleXExpression ) ) otherlv_4= '!'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleGreeting461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:222:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:223:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:223:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:224:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting478); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleGreeting495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getFromKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:244:1: ( (lv_expressions_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:245:1: (lv_expressions_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:245:1: (lv_expressions_3_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:246:3: lv_expressions_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGreetingAccess().getExpressionsXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleGreeting516);
            lv_expressions_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGreetingRule());
              	        }
                     		set(
                     			current, 
                     			"expressions",
                      		lv_expressions_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleGreeting528); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:274:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:275:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:276:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression564);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression574); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:283:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:286:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:288:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression620);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:304:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:305:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:306:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment654);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment664); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:313:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:316:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:317:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:317:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||(LA5_1>=RULE_ID && LA5_1<=RULE_STRING)||LA5_1==15||(LA5_1>=17 && LA5_1<=42)||(LA5_1>=44 && LA5_1<=71)) ) {
                    alt5=2;
                }
                else if ( (LA5_1==16) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA5_0>=RULE_INT && LA5_0<=RULE_STRING)||LA5_0==15||LA5_0==26||(LA5_0>=29 && LA5_0<=30)||LA5_0==40||LA5_0==42||LA5_0==46||LA5_0==48||LA5_0==50||(LA5_0>=54 && LA5_0<=56)||LA5_0==59||(LA5_0>=61 && LA5_0<=68)) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:317:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:317:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:317:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:317:3: ()
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:318:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:323:2: ( ( ruleValidID ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:324:1: ( ruleValidID )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:324:1: ( ruleValidID )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:325:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment722);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment738);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:346:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:347:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:347:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:348:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment758);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:365:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:365:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:366:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment788);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:374:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==17) ) {
                        int LA4_1 = input.LA(2);

                        if ( (synpred1_InternalHelloXbase()) ) {
                            alt4=1;
                        }
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:374:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:374:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:374:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:379:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:379:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:379:7: ()
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:380:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:385:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:386:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:386:1: ( ruleOpMultiAssign )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:387:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment841);
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

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:400:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:401:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:401:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:402:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment864);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:426:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:427:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:428:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign904);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign915); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:435:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:438:28: (kw= '=' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:440:2: kw= '='
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleOpSingleAssign952); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:453:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:454:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:455:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign992);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1003); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:462:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:465:28: (kw= '+=' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:467:2: kw= '+='
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpMultiAssign1040); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:480:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:481:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:482:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1079);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1089); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:489:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:492:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:493:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:493:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:494:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1136);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:502:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    int LA6_2 = input.LA(2);

                    if ( (synpred2_InternalHelloXbase()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:502:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:502:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:502:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:507:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:507:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:507:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:508:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:513:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:514:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:514:1: ( ruleOpOr )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:515:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1189);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:528:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:529:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:529:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:530:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1212);
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
            	    break loop6;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:554:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:555:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:556:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1251);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1262); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:563:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:566:28: (kw= '||' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:568:2: kw= '||'
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpOr1299); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:581:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:582:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:583:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1338);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1348); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:590:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:593:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:594:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:594:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:595:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1395);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:603:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred3_InternalHelloXbase()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:603:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:603:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:603:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:608:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:608:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:608:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:609:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:614:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:615:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:615:1: ( ruleOpAnd )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:616:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1448);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:629:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:630:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:630:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:631:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1471);
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:655:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:656:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:657:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1510);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1521); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:664:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:667:28: (kw= '&&' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:669:2: kw= '&&'
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpAnd1558); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:682:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:683:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:684:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1597);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1607); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:691:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:694:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:695:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:695:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:696:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1654);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:704:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred4_InternalHelloXbase()) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==21) ) {
                    int LA8_3 = input.LA(2);

                    if ( (synpred4_InternalHelloXbase()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:704:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:704:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:704:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:709:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:709:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:709:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:710:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:715:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:716:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:716:1: ( ruleOpEquality )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:717:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1707);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:730:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:731:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:731:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:732:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1730);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:756:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:757:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:758:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1769);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1780); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:765:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:768:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:769:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:769:1: (kw= '==' | kw= '!=' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:770:2: kw= '=='
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleOpEquality1818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:777:2: kw= '!='
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpEquality1837); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:790:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:791:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:792:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1877);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression1887); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:799:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:802:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:803:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:803:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:804:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1934);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:812:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop10:
            do {
                int alt10=3;
                switch ( input.LA(1) ) {
                case 22:
                    {
                    int LA10_2 = input.LA(2);

                    if ( (synpred5_InternalHelloXbase()) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA10_3 = input.LA(2);

                    if ( (synpred6_InternalHelloXbase()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA10_4 = input.LA(2);

                    if ( (synpred6_InternalHelloXbase()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA10_5 = input.LA(2);

                    if ( (synpred6_InternalHelloXbase()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA10_6 = input.LA(2);

                    if ( (synpred6_InternalHelloXbase()) ) {
                        alt10=2;
                    }


                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:812:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:812:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:812:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:812:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:812:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:814:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:814:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:814:6: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:815:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXRelationalExpression1970); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:824:3: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:825:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:825:1: ( ruleQualifiedName )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:826:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression1995);
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
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:840:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:840:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:840:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:840:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:840:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:845:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:845:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:845:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:846:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:851:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:852:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:852:1: ( ruleOpCompare )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:853:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2056);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:866:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:867:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:867:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:868:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2079);
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
            	    break loop10;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:892:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:893:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:894:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2119);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2130); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:901:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:904:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:905:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:905:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case 25:
                {
                alt11=3;
                }
                break;
            case 26:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:906:2: kw= '>='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpCompare2168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:913:2: kw= '<='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpCompare2187); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:920:2: kw= '>'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare2206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:927:2: kw= '<'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2225); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:940:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:941:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:942:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2265);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2275); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:949:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:952:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:953:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:953:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:954:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2322);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:962:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred7_InternalHelloXbase()) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==28) ) {
                    int LA12_3 = input.LA(2);

                    if ( (synpred7_InternalHelloXbase()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:962:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:962:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:962:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:967:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:967:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:967:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:968:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:973:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:974:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:974:1: ( ruleOpOther )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:975:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2375);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:988:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:989:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:989:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:990:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2398);
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
            	    break loop12;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1014:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1015:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1016:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2437);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2448); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1023:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1026:28: ( (kw= '->' | kw= '..' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1027:1: (kw= '->' | kw= '..' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1027:1: (kw= '->' | kw= '..' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            else if ( (LA13_0==28) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1028:2: kw= '->'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1035:2: kw= '..'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2505); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1048:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1049:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1050:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2545);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2555); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1057:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1060:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1061:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1061:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1062:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2602);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1070:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred8_InternalHelloXbase()) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==30) ) {
                    int LA14_3 = input.LA(2);

                    if ( (synpred8_InternalHelloXbase()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1070:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1070:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1070:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1075:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1075:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1075:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1076:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1081:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1082:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1082:1: ( ruleOpAdd )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1083:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2655);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1096:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1097:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1097:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1098:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2678);
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
            	    break loop14;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1122:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1123:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1124:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2717);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2728); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1131:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1134:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1135:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1135:1: (kw= '+' | kw= '-' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            else if ( (LA15_0==30) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1136:2: kw= '+'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpAdd2766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1143:2: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpAdd2785); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1156:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1157:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1158:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2825);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2835); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1165:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1168:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1169:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1169:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1170:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2882);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1178:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop16:
            do {
                int alt16=2;
                switch ( input.LA(1) ) {
                case 31:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (synpred9_InternalHelloXbase()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (synpred9_InternalHelloXbase()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA16_4 = input.LA(2);

                    if ( (synpred9_InternalHelloXbase()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA16_5 = input.LA(2);

                    if ( (synpred9_InternalHelloXbase()) ) {
                        alt16=1;
                    }


                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1178:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1178:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1178:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1183:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1183:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1183:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1184:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1189:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1190:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1190:1: ( ruleOpMulti )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1191:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2935);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1204:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1205:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1205:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1206:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2958);
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
            	    break loop16;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1230:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1231:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1232:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti2997);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3008); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1239:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1242:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1243:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1243:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt17=1;
                }
                break;
            case 32:
                {
                alt17=2;
                }
                break;
            case 33:
                {
                alt17=3;
                }
                break;
            case 34:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1244:2: kw= '*'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpMulti3046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1251:2: kw= '**'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpMulti3065); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1258:2: kw= '/'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpMulti3084); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1265:2: kw= '%'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpMulti3103); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1278:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1279:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1280:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3143);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3153); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1287:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1290:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1291:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1291:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15||(LA18_0>=29 && LA18_0<=30)) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)||LA18_0==26||LA18_0==40||LA18_0==42||LA18_0==46||LA18_0==48||LA18_0==50||(LA18_0>=54 && LA18_0<=56)||LA18_0==59||(LA18_0>=61 && LA18_0<=68)) ) {
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1291:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1291:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1291:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1291:3: ()
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1292:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1297:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1298:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1298:1: ( ruleOpUnary )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1299:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3211);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1312:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1313:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1313:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1314:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3232);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1332:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3261);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1348:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1349:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1350:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3297);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3308); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1357:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1360:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1361:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1361:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt19=1;
                }
                break;
            case 30:
                {
                alt19=2;
                }
                break;
            case 29:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1362:2: kw= '!'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleOpUnary3346); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1369:2: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpUnary3365); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1376:2: kw= '+'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpUnary3384); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1389:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1390:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1391:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3424);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3434); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1398:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1401:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1402:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1402:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1403:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3481);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1411:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred10_InternalHelloXbase()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1411:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1411:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1411:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1413:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1413:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1413:6: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1414:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleXCastedExpression3516); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1423:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1424:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1424:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1425:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3539);
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
            	    break loop20;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1449:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1450:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1451:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3577);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3587); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1458:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1461:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1462:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1462:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1463:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3634);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1471:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop28:
            do {
                int alt28=3;
                switch ( input.LA(1) ) {
                case 36:
                    {
                    int LA28_2 = input.LA(2);

                    if ( (synpred11_InternalHelloXbase()) ) {
                        alt28=1;
                    }
                    else if ( (synpred12_InternalHelloXbase()) ) {
                        alt28=2;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA28_3 = input.LA(2);

                    if ( (synpred12_InternalHelloXbase()) ) {
                        alt28=2;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA28_4 = input.LA(2);

                    if ( (synpred12_InternalHelloXbase()) ) {
                        alt28=2;
                    }


                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1471:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1471:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1471:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1471:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1471:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1477:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1477:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1477:26: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1478:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleXMemberFeatureCall3683); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1487:1: ( ( ruleValidID ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1488:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1488:1: ( ruleValidID )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1489:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3706);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3722);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1510:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1511:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1511:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1512:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3744);
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
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1529:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1529:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1529:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1529:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1529:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1545:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1545:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1545:8: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1546:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1551:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt21=3;
            	    switch ( input.LA(1) ) {
            	    case 36:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1551:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleXMemberFeatureCall3830); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1556:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1556:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1557:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1557:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1558:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,37,FOLLOW_37_in_ruleXMemberFeatureCall3854); if (state.failed) return current;
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
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1572:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1572:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1573:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1573:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1574:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall3891); if (state.failed) return current;
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1587:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==26) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1587:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,26,FOLLOW_26_in_ruleXMemberFeatureCall3920); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1591:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1592:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1592:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1593:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3941);
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

            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1609:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop22:
            	            do {
            	                int alt22=2;
            	                int LA22_0 = input.LA(1);

            	                if ( (LA22_0==39) ) {
            	                    alt22=1;
            	                }


            	                switch (alt22) {
            	            	case 1 :
            	            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1609:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall3954); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1613:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1614:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1614:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1615:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3975);
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
            	            	    break loop22;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleXMemberFeatureCall3989); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1635:3: ( ( ruleValidID ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1636:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1636:1: ( ruleValidID )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1637:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4014);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1650:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt26=2;
            	    alt26 = dfa26.predict(input);
            	    switch (alt26) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1650:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1650:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1650:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1657:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1658:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4048); if (state.failed) return current;
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

            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1671:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt25=3;
            	            alt25 = dfa25.predict(input);
            	            switch (alt25) {
            	                case 1 :
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1671:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1671:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1671:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1688:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1689:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4133);
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
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1706:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1706:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1706:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1706:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1707:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1707:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1708:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4161);
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

            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1724:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop24:
            	                    do {
            	                        int alt24=2;
            	                        int LA24_0 = input.LA(1);

            	                        if ( (LA24_0==39) ) {
            	                            alt24=1;
            	                        }


            	                        switch (alt24) {
            	                    	case 1 :
            	                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1724:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall4174); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1728:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1729:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1729:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1730:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4195);
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
            	                    	    break loop24;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4212); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1750:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt27=2;
            	    alt27 = dfa27.predict(input);
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1750:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1755:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1756:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4245);
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
            	    break loop28;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1780:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1781:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1782:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4285);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4295); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1789:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1792:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1793:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1793:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt29=13;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt29=1;
                }
                break;
            case 50:
                {
                alt29=2;
                }
                break;
            case 48:
                {
                alt29=3;
                }
                break;
            case RULE_ID:
            case 26:
            case 59:
                {
                alt29=4;
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
                alt29=5;
                }
                break;
            case 46:
                {
                alt29=6;
                }
                break;
            case 54:
                {
                alt29=7;
                }
                break;
            case 55:
                {
                alt29=8;
                }
                break;
            case 56:
                {
                alt29=9;
                }
                break;
            case 66:
                {
                alt29=10;
                }
                break;
            case 67:
                {
                alt29=11;
                }
                break;
            case 68:
                {
                alt29=12;
                }
                break;
            case 40:
                {
                alt29=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1794:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4342);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1804:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4369);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1814:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4396);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1824:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4423);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1834:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4450);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1844:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4477);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1854:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4504);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1864:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4531);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1874:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4558);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1884:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4585);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1894:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4612);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1904:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4639);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1914:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4666);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1930:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1931:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1932:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4701);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4711); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1939:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1942:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1943:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1943:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt30=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt30=1;
                }
                break;
            case 62:
            case 63:
                {
                alt30=2;
                }
                break;
            case RULE_INT:
                {
                alt30=3;
                }
                break;
            case 64:
                {
                alt30=4;
                }
                break;
            case RULE_STRING:
                {
                alt30=5;
                }
                break;
            case 65:
                {
                alt30=6;
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1944:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4758);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1954:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4785);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1964:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral4812);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1974:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral4839);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1984:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral4866);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1994:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4893);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2010:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2011:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2012:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure4928);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure4938); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2019:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2022:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2023:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2023:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2023:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2023:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2024:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleXClosure4984); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2033:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2033:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2048:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2048:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2048:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID||LA32_0==40||LA32_0==71) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2048:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2048:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2049:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2049:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2050:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5055);
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

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2066:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==39) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2066:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleXClosure5068); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2070:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2071:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2071:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2072:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5089);
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
                            	    break loop31;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2088:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2089:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2089:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2090:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,43,FOLLOW_43_in_ruleXClosure5111); if (state.failed) return current;
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2103:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2104:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2104:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2105:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5148);
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

            otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleXClosure5160); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2133:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2134:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2135:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5196);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5206); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2142:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2145:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2146:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2146:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2146:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2146:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2147:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2152:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_STRING)||LA35_0==15||LA35_0==26||(LA35_0>=29 && LA35_0<=30)||LA35_0==40||LA35_0==42||LA35_0==46||LA35_0==48||LA35_0==50||(LA35_0>=54 && LA35_0<=59)||(LA35_0>=61 && LA35_0<=68)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2152:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2152:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2153:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2153:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2154:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5262);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2170:2: (otherlv_2= ';' )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==45) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2170:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXExpressionInClosure5275); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2182:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2183:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2184:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5315);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5325); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2191:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2194:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2195:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2195:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2195:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2195:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2195:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2211:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2211:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2211:7: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2212:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2217:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||LA37_0==40||LA37_0==71) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2217:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2217:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2218:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2218:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2219:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5433);
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

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2235:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==39) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2235:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXShortClosure5446); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2239:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2240:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2240:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2241:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5467);
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
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2257:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2258:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2258:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2259:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,43,FOLLOW_43_in_ruleXShortClosure5489); if (state.failed) return current;
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2272:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2273:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2273:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2274:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5525);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2298:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2299:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2300:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5561);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5571); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2307:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2310:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2311:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2311:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2311:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleXParenthesizedExpression5608); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5630);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXParenthesizedExpression5641); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2336:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2337:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2338:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5677);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5687); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2345:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2348:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2349:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2349:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2349:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2349:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2350:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleXIfExpression5733); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXIfExpression5745); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2363:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2364:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2364:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2365:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5766);
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

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXIfExpression5778); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2385:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2386:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2386:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2387:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5799);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2403:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                int LA38_1 = input.LA(2);

                if ( (synpred18_InternalHelloXbase()) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2403:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2403:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2403:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleXIfExpression5820); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2408:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2409:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2409:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2410:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5842);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2434:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2435:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2436:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5880);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5890); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2443:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2446:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2447:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2447:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2447:2: () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2447:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2448:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression5936); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2457:1: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==49) && (synpred19_InternalHelloXbase())) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2457:2: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2462:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2462:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2462:6: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2463:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2463:1: (lv_localVarName_2_0= ruleValidID )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2464:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression5977);
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

                    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression5989); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2484:4: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2485:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2485:1: (lv_switch_4_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2486:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6013);
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

            otherlv_5=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression6025); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2506:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID||LA40_0==40||LA40_0==49||LA40_0==53||LA40_0==71) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2507:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2507:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2508:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6046);
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
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2524:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==51) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2524:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression6072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2532:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2533:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2533:1: (lv_default_9_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2534:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6093);
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

            otherlv_10=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6107); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2562:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2563:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2564:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6143);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6153); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2571:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2574:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2575:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2575:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2575:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2575:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||LA42_0==40||LA42_0==71) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2576:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2576:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2577:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6199);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2593:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==53) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2593:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXCasePart6213); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2597:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2598:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2598:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2599:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6234);
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

            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleXCasePart6248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2619:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2620:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2620:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2621:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6269);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2645:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2646:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2647:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6305);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6315); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2654:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2657:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2658:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2658:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2658:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2658:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2659:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXForLoopExpression6361); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXForLoopExpression6373); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2672:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2673:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2673:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2674:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6394);
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

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXForLoopExpression6406); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2694:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2695:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2695:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2696:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6427);
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

            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleXForLoopExpression6439); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2716:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2717:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2717:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2718:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6460);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2742:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2743:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2744:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6496);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6506); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2751:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2754:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2755:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2755:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2755:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2755:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2756:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXWhileExpression6552); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXWhileExpression6564); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2769:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2770:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2770:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2771:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6585);
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

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXWhileExpression6597); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2791:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2792:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2792:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2793:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6618);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2817:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2818:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2819:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6654);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6664); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2826:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2829:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2830:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2830:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2830:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2830:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2831:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXDoWhileExpression6710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2840:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2841:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2841:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2842:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6731);
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

            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleXDoWhileExpression6743); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleXDoWhileExpression6755); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2866:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2867:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2867:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2868:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6776);
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

            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleXDoWhileExpression6788); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2896:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2897:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2898:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6824);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6834); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2905:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2908:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2909:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2909:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2909:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2909:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2910:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXBlockExpression6880); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2919:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_STRING)||LA45_0==15||LA45_0==26||(LA45_0>=29 && LA45_0<=30)||LA45_0==40||LA45_0==42||LA45_0==46||LA45_0==48||LA45_0==50||(LA45_0>=54 && LA45_0<=59)||(LA45_0>=61 && LA45_0<=68)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2919:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2919:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2920:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2920:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2921:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6902);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2937:2: (otherlv_3= ';' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==45) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2937:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleXBlockExpression6915); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleXBlockExpression6931); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2953:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2954:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2955:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6967);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6977); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2962:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2965:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2966:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2966:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=57 && LA46_0<=58)) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_STRING)||LA46_0==15||LA46_0==26||(LA46_0>=29 && LA46_0<=30)||LA46_0==40||LA46_0==42||LA46_0==46||LA46_0==48||LA46_0==50||(LA46_0>=54 && LA46_0<=56)||LA46_0==59||(LA46_0>=61 && LA46_0<=68)) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2967:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7024);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2977:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7051);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2993:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2994:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2995:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7086);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7096); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3002:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3005:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3006:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3006:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3006:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3006:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3007:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3012:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==57) ) {
                alt47=1;
            }
            else if ( (LA47_0==58) ) {
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3012:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3012:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3013:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3013:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3014:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,57,FOLLOW_57_in_ruleXVariableDeclaration7149); if (state.failed) return current;
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3028:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleXVariableDeclaration7180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3032:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                int LA48_1 = input.LA(2);

                if ( (synpred20_InternalHelloXbase()) ) {
                    alt48=1;
                }
                else if ( (true) ) {
                    alt48=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA48_0==40) && (synpred20_InternalHelloXbase())) {
                alt48=1;
            }
            else if ( (LA48_0==71) && (synpred20_InternalHelloXbase())) {
                alt48=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3032:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3032:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3032:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3040:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3040:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3040:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3041:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3041:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3042:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7228);
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

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3058:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3059:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3059:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3060:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7249);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3077:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3077:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3078:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3078:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3079:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7278);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3095:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==16) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3095:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleXVariableDeclaration7292); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3099:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3100:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3100:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3101:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7313);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3125:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3126:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3127:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7351);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7361); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3134:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3137:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3138:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3138:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3138:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3138:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==RULE_ID||LA50_1==26||LA50_1==36||LA50_1==42) ) {
                    alt50=1;
                }
            }
            else if ( (LA50_0==40||LA50_0==71) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3139:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3139:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3140:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7407);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3156:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3157:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3157:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3158:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7429);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3182:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3183:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3184:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7465);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7475); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3191:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3194:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3195:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3195:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3195:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3195:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3196:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3196:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3197:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7521);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3213:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3214:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3214:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3215:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7542);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3239:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3240:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3241:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7578);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7588); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3248:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3251:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3252:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3252:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3252:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3252:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3253:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3258:2: ( ( ruleStaticQualifier ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==60) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3259:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3259:1: ( ruleStaticQualifier )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3260:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7645);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3273:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==26) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3273:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleXFeatureCall7659); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3277:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3278:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3278:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3279:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7680);
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

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3295:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==39) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3295:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleXFeatureCall7693); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3299:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3300:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3300:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3301:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7714);
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
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleXFeatureCall7728); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3321:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3322:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3322:1: ( ruleIdOrSuper )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3323:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7753);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3336:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3336:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3336:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3336:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3343:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3344:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,40,FOLLOW_40_in_ruleXFeatureCall7787); if (state.failed) return current;
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

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3357:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt55=3;
                    alt55 = dfa55.predict(input);
                    switch (alt55) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3357:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3357:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3357:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3374:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3375:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7872);
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
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3392:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3392:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3392:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3392:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3393:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3393:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3394:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7900);
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

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3410:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==39) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3410:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,39,FOLLOW_39_in_ruleXFeatureCall7913); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3414:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3415:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3415:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3416:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7934);
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
                            	    break loop54;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall7951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3436:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3436:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3441:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3442:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall7984);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3466:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3467:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3468:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8022);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8033); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3475:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3478:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3479:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3479:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            else if ( (LA58_0==59) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3480:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8080);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3492:2: kw= 'super'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleIdOrSuper8104); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3505:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3506:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3507:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8145);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8156); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3514:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3517:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3518:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3518:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_ID) ) {
                    int LA59_2 = input.LA(2);

                    if ( (LA59_2==60) ) {
                        alt59=1;
                    }


                }


                switch (alt59) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3519:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8203);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleStaticQualifier8221); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3543:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3544:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3545:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8262);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8272); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3552:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3555:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3556:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3556:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3556:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3556:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3557:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXConstructorCall8318); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3566:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3567:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3567:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3568:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8341);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3581:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==26) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3581:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleXConstructorCall8354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3585:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3586:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3586:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3587:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8375);
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

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3603:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==39) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3603:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleXConstructorCall8388); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3607:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3608:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3608:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3609:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8409);
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
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleXConstructorCall8423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,40,FOLLOW_40_in_ruleXConstructorCall8437); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3633:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt63=3;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3633:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3633:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3633:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3650:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3651:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8509);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3668:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3668:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3668:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3668:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3669:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3669:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3670:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8537);
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

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3686:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==39) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3686:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,39,FOLLOW_39_in_ruleXConstructorCall8550); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3690:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3691:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3691:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3692:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8571);
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
                    	    break loop62;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall8588); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3712:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3712:2: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3717:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3718:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall8619);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3742:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3743:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3744:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8656);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8666); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3751:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3754:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3755:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3755:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3755:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3755:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3756:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3761:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==62) ) {
                alt65=1;
            }
            else if ( (LA65_0==63) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3761:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXBooleanLiteral8713); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3766:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3766:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3767:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3767:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3768:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,63,FOLLOW_63_in_ruleXBooleanLiteral8737); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3789:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3790:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3791:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8787);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8797); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3798:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3801:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3802:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3802:1: ( () otherlv_1= 'null' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3802:2: () otherlv_1= 'null'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3802:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3803:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXNullLiteral8843); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3820:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3821:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3822:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8879);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral8889); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3829:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3832:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3833:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3833:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3833:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3833:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3834:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3839:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3840:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3840:1: (lv_value_1_0= RULE_INT )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3841:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral8940); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3865:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3866:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3867:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8981);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral8991); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3874:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3877:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3878:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3878:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3878:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3878:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3879:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3884:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3885:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3885:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3886:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9042); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3910:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3911:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3912:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9083);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9093); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3919:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3922:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3923:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3923:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3923:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3923:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3924:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXTypeLiteral9139); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXTypeLiteral9151); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3937:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3938:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3938:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3939:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9174);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXTypeLiteral9186); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3964:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3965:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3966:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9222);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9232); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3973:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3976:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3977:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3977:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3977:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3977:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3978:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXThrowExpression9278); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3987:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3988:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3988:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3989:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9299);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4013:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4014:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4015:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9335);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9345); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4022:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4025:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4026:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4026:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4026:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4026:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4027:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXReturnExpression9391); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4036:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4036:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4041:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4042:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9422);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4066:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4067:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4068:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9459);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9469); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4075:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4078:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4079:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4079:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4079:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4079:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4080:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXTryCatchFinallyExpression9515); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4089:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4090:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4090:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4091:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9536);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4107:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==70) ) {
                alt69=1;
            }
            else if ( (LA69_0==69) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4107:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4107:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4107:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4107:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt67=0;
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==70) ) {
                            int LA67_2 = input.LA(2);

                            if ( (synpred27_InternalHelloXbase()) ) {
                                alt67=1;
                            }


                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4107:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4109:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4110:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9566);
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
                    	    if ( cnt67 >= 1 ) break loop67;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(67, input);
                                throw eee;
                        }
                        cnt67++;
                    } while (true);

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4126:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==69) ) {
                        int LA68_1 = input.LA(2);

                        if ( (synpred28_InternalHelloXbase()) ) {
                            alt68=1;
                        }
                    }
                    switch (alt68) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4126:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4126:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4126:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleXTryCatchFinallyExpression9588); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4131:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4132:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4132:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4133:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9610);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4150:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4150:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4150:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,69,FOLLOW_69_in_ruleXTryCatchFinallyExpression9632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4154:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4155:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4155:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4156:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9653);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4180:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4181:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4182:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9691);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause9701); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4189:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4192:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4193:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4193:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4193:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4193:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4193:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleXCatchClause9746); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleXCatchClause9759); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4202:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4203:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4203:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4204:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause9780);
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

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleXCatchClause9792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4224:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4225:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4225:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4226:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9813);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4250:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4251:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4252:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9850);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9861); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4259:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4262:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4263:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4263:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4264:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9908);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4274:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==36) ) {
                    int LA70_2 = input.LA(2);

                    if ( (LA70_2==RULE_ID) ) {
                        int LA70_3 = input.LA(3);

                        if ( (synpred30_InternalHelloXbase()) ) {
                            alt70=1;
                        }


                    }


                }


                switch (alt70) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4274:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4274:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4274:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,36,FOLLOW_36_in_ruleQualifiedName9936); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName9959);
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
            	    break loop70;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4301:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4302:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4303:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10006);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10016); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4310:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4313:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4314:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4314:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID) ) {
                alt72=1;
            }
            else if ( (LA72_0==40||LA72_0==71) ) {
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4314:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4314:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4315:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10064);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4323:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==42) ) {
                            int LA71_2 = input.LA(2);

                            if ( (LA71_2==44) ) {
                                int LA71_3 = input.LA(3);

                                if ( (synpred31_InternalHelloXbase()) ) {
                                    alt71=1;
                                }


                            }


                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4323:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4326:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4326:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4326:6: ()
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4327:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleJvmTypeReference10102); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleJvmTypeReference10114); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4342:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10146);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4358:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4359:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4360:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10181);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10191); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4367:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4370:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4371:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4371:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4371:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4371:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==40) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4371:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleXFunctionTypeRef10229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4375:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4376:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4376:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4377:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10250);
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

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4393:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==39) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4393:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXFunctionTypeRef10263); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4397:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4398:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4398:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4399:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10284);
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
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXFunctionTypeRef10298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,71,FOLLOW_71_in_ruleXFunctionTypeRef10312); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4423:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4424:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4424:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4425:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10333);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4449:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4450:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4451:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10369);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10379); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4458:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4461:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4462:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4462:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4462:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4462:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4463:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4463:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4464:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10427);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4477:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4477:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4477:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4477:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleJvmParameterizedTypeReference10448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4482:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4483:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4483:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4484:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10470);
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

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4500:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==39) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4500:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleJvmParameterizedTypeReference10483); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4504:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4505:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4505:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4506:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10504);
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
                    	    break loop75;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleJvmParameterizedTypeReference10518); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4534:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4535:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4536:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10556);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10566); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4543:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4546:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4547:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4547:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_ID||LA77_0==40||LA77_0==71) ) {
                alt77=1;
            }
            else if ( (LA77_0==72) ) {
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4548:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10613);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4558:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10640);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4574:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4575:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4576:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10675);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10685); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4583:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4586:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4587:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4587:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4587:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4587:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4588:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleJvmWildcardTypeReference10731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4597:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt78=3;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==73) ) {
                alt78=1;
            }
            else if ( (LA78_0==59) ) {
                alt78=2;
            }
            switch (alt78) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4597:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4597:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4598:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4598:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4599:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10753);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4616:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4616:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4617:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4617:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4618:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10780);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4642:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4643:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4644:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10818);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound10828); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4651:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4654:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4655:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4655:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4655:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleJvmUpperBound10865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4659:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4660:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4660:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4661:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10886);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4685:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4686:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4687:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10922);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10932); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4694:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4697:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4698:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4698:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4698:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleJvmUpperBoundAnded10969); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4702:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4703:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4703:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4704:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10990);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4728:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4729:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4730:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11026);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11036); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4737:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4740:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4741:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4741:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4741:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleJvmLowerBound11073); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4745:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4746:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4746:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4747:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11094);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4773:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4774:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4775:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11133);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11144); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4782:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4785:28: (this_ID_0= RULE_ID )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4786:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11183); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalHelloXbase
    public final void synpred1_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:374:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:374:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:374:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:374:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:374:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:375:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:375:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:376:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:376:1: ( ruleOpMultiAssign )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:377:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloXbase809);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalHelloXbase

    // $ANTLR start synpred2_InternalHelloXbase
    public final void synpred2_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:502:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:502:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:502:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:502:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:502:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:503:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:503:2: ( ( ruleOpOr ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:504:1: ( ruleOpOr )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:504:1: ( ruleOpOr )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:505:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalHelloXbase1157);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalHelloXbase

    // $ANTLR start synpred3_InternalHelloXbase
    public final void synpred3_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:603:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:603:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:603:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:603:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:603:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:604:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:604:2: ( ( ruleOpAnd ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:605:1: ( ruleOpAnd )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:605:1: ( ruleOpAnd )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:606:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalHelloXbase1416);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalHelloXbase

    // $ANTLR start synpred4_InternalHelloXbase
    public final void synpred4_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:704:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:704:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:704:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:704:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:704:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:705:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:705:2: ( ( ruleOpEquality ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:706:1: ( ruleOpEquality )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:706:1: ( ruleOpEquality )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:707:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalHelloXbase1675);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalHelloXbase

    // $ANTLR start synpred5_InternalHelloXbase
    public final void synpred5_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:812:4: ( ( () 'instanceof' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:812:5: ( () 'instanceof' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:812:5: ( () 'instanceof' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:812:6: () 'instanceof'
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:812:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:813:1: 
        {
        }

        match(input,22,FOLLOW_22_in_synpred5_InternalHelloXbase1951); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalHelloXbase

    // $ANTLR start synpred6_InternalHelloXbase
    public final void synpred6_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:840:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:840:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:840:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:840:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:840:10: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:841:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:841:2: ( ( ruleOpCompare ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:842:1: ( ruleOpCompare )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:842:1: ( ruleOpCompare )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:843:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalHelloXbase2024);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalHelloXbase

    // $ANTLR start synpred7_InternalHelloXbase
    public final void synpred7_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:962:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:962:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:962:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:962:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:962:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:963:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:963:2: ( ( ruleOpOther ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:964:1: ( ruleOpOther )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:964:1: ( ruleOpOther )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:965:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalHelloXbase2343);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalHelloXbase

    // $ANTLR start synpred8_InternalHelloXbase
    public final void synpred8_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1070:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1070:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1070:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1070:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1070:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1071:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1071:2: ( ( ruleOpAdd ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1072:1: ( ruleOpAdd )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1072:1: ( ruleOpAdd )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1073:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalHelloXbase2623);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalHelloXbase

    // $ANTLR start synpred9_InternalHelloXbase
    public final void synpred9_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1178:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1178:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1178:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1178:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1178:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1179:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1179:2: ( ( ruleOpMulti ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1180:1: ( ruleOpMulti )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1180:1: ( ruleOpMulti )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1181:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalHelloXbase2903);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalHelloXbase

    // $ANTLR start synpred10_InternalHelloXbase
    public final void synpred10_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1411:3: ( ( () 'as' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1411:4: ( () 'as' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1411:4: ( () 'as' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1411:5: () 'as'
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1411:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1412:1: 
        {
        }

        match(input,35,FOLLOW_35_in_synpred10_InternalHelloXbase3497); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalHelloXbase

    // $ANTLR start synpred11_InternalHelloXbase
    public final void synpred11_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1471:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1471:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1471:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1471:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1471:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1472:1: 
        {
        }

        match(input,36,FOLLOW_36_in_synpred11_InternalHelloXbase3651); if (state.failed) return ;
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1473:1: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1474:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1474:1: ( ruleValidID )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1475:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalHelloXbase3660);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalHelloXbase3666);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalHelloXbase

    // $ANTLR start synpred12_InternalHelloXbase
    public final void synpred12_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1529:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1529:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1529:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1529:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1529:10: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1530:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1530:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt79=3;
        switch ( input.LA(1) ) {
        case 36:
            {
            alt79=1;
            }
            break;
        case 37:
            {
            alt79=2;
            }
            break;
        case 38:
            {
            alt79=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 79, 0, input);

            throw nvae;
        }

        switch (alt79) {
            case 1 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1530:4: '.'
                {
                match(input,36,FOLLOW_36_in_synpred12_InternalHelloXbase3769); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1532:6: ( ( '?.' ) )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1532:6: ( ( '?.' ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1533:1: ( '?.' )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1533:1: ( '?.' )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1534:2: '?.'
                {
                match(input,37,FOLLOW_37_in_synpred12_InternalHelloXbase3783); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1539:6: ( ( '*.' ) )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1539:6: ( ( '*.' ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1540:1: ( '*.' )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1540:1: ( '*.' )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1541:2: '*.'
                {
                match(input,38,FOLLOW_38_in_synpred12_InternalHelloXbase3803); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalHelloXbase

    // $ANTLR start synpred13_InternalHelloXbase
    public final void synpred13_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1650:4: ( ( '(' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1651:1: ( '(' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1651:1: ( '(' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1652:2: '('
        {
        match(input,40,FOLLOW_40_in_synpred13_InternalHelloXbase4030); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalHelloXbase

    // $ANTLR start synpred14_InternalHelloXbase
    public final void synpred14_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1671:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1671:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1671:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1671:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1671:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1672:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1672:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt81=2;
        int LA81_0 = input.LA(1);

        if ( (LA81_0==RULE_ID||LA81_0==40||LA81_0==71) ) {
            alt81=1;
        }
        switch (alt81) {
            case 1 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1672:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1672:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1673:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1673:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1674:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloXbase4082);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1676:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop80:
                do {
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==39) ) {
                        alt80=1;
                    }


                    switch (alt80) {
                	case 1 :
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1676:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,39,FOLLOW_39_in_synpred14_InternalHelloXbase4089); if (state.failed) return ;
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1677:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1678:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1678:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1679:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloXbase4096);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

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

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1681:6: ( ( '|' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1682:1: ( '|' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1682:1: ( '|' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1683:2: '|'
        {
        match(input,43,FOLLOW_43_in_synpred14_InternalHelloXbase4110); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalHelloXbase

    // $ANTLR start synpred15_InternalHelloXbase
    public final void synpred15_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1750:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1751:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1751:1: ( ruleXClosure )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1752:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalHelloXbase4228);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalHelloXbase

    // $ANTLR start synpred16_InternalHelloXbase
    public final void synpred16_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2033:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2033:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2033:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2033:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2033:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt83=2;
        int LA83_0 = input.LA(1);

        if ( (LA83_0==RULE_ID||LA83_0==40||LA83_0==71) ) {
            alt83=1;
        }
        switch (alt83) {
            case 1 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2033:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2033:5: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2034:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2034:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2035:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXbase5001);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2037:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop82:
                do {
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==39) ) {
                        alt82=1;
                    }


                    switch (alt82) {
                	case 1 :
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2037:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,39,FOLLOW_39_in_synpred16_InternalHelloXbase5008); if (state.failed) return ;
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2038:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2039:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2039:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2040:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXbase5015);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

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

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2042:6: ( ( '|' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2043:1: ( '|' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2043:1: ( '|' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2044:2: '|'
        {
        match(input,43,FOLLOW_43_in_synpred16_InternalHelloXbase5029); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalHelloXbase

    // $ANTLR start synpred18_InternalHelloXbase
    public final void synpred18_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2403:4: ( 'else' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2403:6: 'else'
        {
        match(input,47,FOLLOW_47_in_synpred18_InternalHelloXbase5812); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalHelloXbase

    // $ANTLR start synpred19_InternalHelloXbase
    public final void synpred19_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2457:2: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2457:3: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2457:3: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2457:4: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2457:4: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2458:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2458:1: ( ruleValidID )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2459:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalHelloXbase5952);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,49,FOLLOW_49_in_synpred19_InternalHelloXbase5958); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalHelloXbase

    // $ANTLR start synpred20_InternalHelloXbase
    public final void synpred20_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3032:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3032:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3032:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3032:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3032:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3033:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3033:1: ( ruleJvmTypeReference )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3034:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred20_InternalHelloXbase7198);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3036:2: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3037:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3037:1: ( ruleValidID )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3038:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalHelloXbase7207);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalHelloXbase

    // $ANTLR start synpred21_InternalHelloXbase
    public final void synpred21_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3336:4: ( ( '(' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3337:1: ( '(' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3337:1: ( '(' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3338:2: '('
        {
        match(input,40,FOLLOW_40_in_synpred21_InternalHelloXbase7769); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalHelloXbase

    // $ANTLR start synpred22_InternalHelloXbase
    public final void synpred22_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3357:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3357:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3357:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3357:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3357:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3358:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3358:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt87=2;
        int LA87_0 = input.LA(1);

        if ( (LA87_0==RULE_ID||LA87_0==40||LA87_0==71) ) {
            alt87=1;
        }
        switch (alt87) {
            case 1 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3358:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3358:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3359:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3359:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3360:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalHelloXbase7821);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3362:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop86:
                do {
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==39) ) {
                        alt86=1;
                    }


                    switch (alt86) {
                	case 1 :
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3362:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,39,FOLLOW_39_in_synpred22_InternalHelloXbase7828); if (state.failed) return ;
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3363:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3364:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3364:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3365:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalHelloXbase7835);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop86;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3367:6: ( ( '|' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3368:1: ( '|' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3368:1: ( '|' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3369:2: '|'
        {
        match(input,43,FOLLOW_43_in_synpred22_InternalHelloXbase7849); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalHelloXbase

    // $ANTLR start synpred23_InternalHelloXbase
    public final void synpred23_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3436:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3437:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3437:1: ( ruleXClosure )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3438:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred23_InternalHelloXbase7967);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalHelloXbase

    // $ANTLR start synpred24_InternalHelloXbase
    public final void synpred24_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3633:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3633:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3633:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3633:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3633:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3634:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3634:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt89=2;
        int LA89_0 = input.LA(1);

        if ( (LA89_0==RULE_ID||LA89_0==40||LA89_0==71) ) {
            alt89=1;
        }
        switch (alt89) {
            case 1 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3634:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3634:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3635:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3635:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3636:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalHelloXbase8458);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3638:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop88:
                do {
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==39) ) {
                        alt88=1;
                    }


                    switch (alt88) {
                	case 1 :
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3638:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,39,FOLLOW_39_in_synpred24_InternalHelloXbase8465); if (state.failed) return ;
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3639:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3640:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3640:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3641:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalHelloXbase8472);
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

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3643:6: ( ( '|' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3644:1: ( '|' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3644:1: ( '|' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3645:2: '|'
        {
        match(input,43,FOLLOW_43_in_synpred24_InternalHelloXbase8486); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred24_InternalHelloXbase

    // $ANTLR start synpred25_InternalHelloXbase
    public final void synpred25_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3712:2: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3713:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3713:1: ( ruleXClosure )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3714:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred25_InternalHelloXbase8602);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalHelloXbase

    // $ANTLR start synpred26_InternalHelloXbase
    public final void synpred26_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4036:2: ( ( ruleXExpression ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4037:1: ( ruleXExpression )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4037:1: ( ruleXExpression )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4038:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred26_InternalHelloXbase9405);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalHelloXbase

    // $ANTLR start synpred27_InternalHelloXbase
    public final void synpred27_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4107:5: ( 'catch' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4107:7: 'catch'
        {
        match(input,70,FOLLOW_70_in_synpred27_InternalHelloXbase9550); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalHelloXbase

    // $ANTLR start synpred28_InternalHelloXbase
    public final void synpred28_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4126:5: ( 'finally' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4126:7: 'finally'
        {
        match(input,69,FOLLOW_69_in_synpred28_InternalHelloXbase9580); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalHelloXbase

    // $ANTLR start synpred30_InternalHelloXbase
    public final void synpred30_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4274:3: ( '.' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4275:2: '.'
        {
        match(input,36,FOLLOW_36_in_synpred30_InternalHelloXbase9927); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalHelloXbase

    // $ANTLR start synpred31_InternalHelloXbase
    public final void synpred31_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4323:2: ( ( () '[' ']' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4323:3: ( () '[' ']' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4323:3: ( () '[' ']' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4323:4: () '[' ']'
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4323:4: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4324:1: 
        {
        }

        match(input,42,FOLLOW_42_in_synpred31_InternalHelloXbase10079); if (state.failed) return ;
        match(input,44,FOLLOW_44_in_synpred31_InternalHelloXbase10083); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalHelloXbase

    // $ANTLR start synpred32_InternalHelloXbase
    public final void synpred32_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4477:4: ( '<' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4477:6: '<'
        {
        match(input,26,FOLLOW_26_in_synpred32_InternalHelloXbase10440); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalHelloXbase

    // Delegated rules

    public final boolean synpred10_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA26 dfa26 = new DFA26(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA76 dfa76 = new DFA76(this);
    static final String DFA26_eotS =
        "\74\uffff";
    static final String DFA26_eofS =
        "\1\2\73\uffff";
    static final String DFA26_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA26_maxS =
        "\1\107\1\0\72\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA26_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA26_transitionS = {
            "\3\2\10\uffff\1\2\1\uffff\27\2\1\1\2\2\1\uffff\20\2\1\uffff"+
            "\13\2",
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
            return "1650:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_1 = input.LA(1);

                         
                        int index26_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index26_1);
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
    static final String DFA25_eotS =
        "\34\uffff";
    static final String DFA25_eofS =
        "\34\uffff";
    static final String DFA25_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA25_maxS =
        "\1\107\2\0\31\uffff";
    static final String DFA25_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA25_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA25_transitionS = {
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

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1671:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_0 = input.LA(1);

                         
                        int index25_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_0==RULE_ID) ) {s = 1;}

                        else if ( (LA25_0==40) ) {s = 2;}

                        else if ( (LA25_0==71) && (synpred14_InternalHelloXbase())) {s = 3;}

                        else if ( (LA25_0==43) && (synpred14_InternalHelloXbase())) {s = 4;}

                        else if ( ((LA25_0>=RULE_INT && LA25_0<=RULE_STRING)||LA25_0==15||LA25_0==26||(LA25_0>=29 && LA25_0<=30)||LA25_0==42||LA25_0==46||LA25_0==48||LA25_0==50||(LA25_0>=54 && LA25_0<=56)||LA25_0==59||(LA25_0>=61 && LA25_0<=68)) ) {s = 5;}

                        else if ( (LA25_0==41) ) {s = 27;}

                         
                        input.seek(index25_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_1 = input.LA(1);

                         
                        int index25_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index25_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_2 = input.LA(1);

                         
                        int index25_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index25_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\74\uffff";
    static final String DFA27_eofS =
        "\1\2\73\uffff";
    static final String DFA27_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA27_maxS =
        "\1\107\1\0\72\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA27_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA27_transitionS = {
            "\3\2\10\uffff\1\2\1\uffff\31\2\1\1\1\uffff\20\2\1\uffff\13\2",
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
            return "1750:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
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
                        if ( (synpred15_InternalHelloXbase()) ) {s = 59;}

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
    static final String DFA33_eotS =
        "\36\uffff";
    static final String DFA33_eofS =
        "\36\uffff";
    static final String DFA33_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA33_maxS =
        "\1\107\2\0\33\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\2\1\1\2\30\uffff";
    static final String DFA33_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA33_transitionS = {
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

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "2033:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_0 = input.LA(1);

                         
                        int index33_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA33_0==RULE_ID) ) {s = 1;}

                        else if ( (LA33_0==40) ) {s = 2;}

                        else if ( (LA33_0==71) && (synpred16_InternalHelloXbase())) {s = 3;}

                        else if ( (LA33_0==43) && (synpred16_InternalHelloXbase())) {s = 4;}

                        else if ( ((LA33_0>=RULE_INT && LA33_0<=RULE_STRING)||LA33_0==15||LA33_0==26||(LA33_0>=29 && LA33_0<=30)||LA33_0==42||LA33_0==44||LA33_0==46||LA33_0==48||LA33_0==50||(LA33_0>=54 && LA33_0<=59)||(LA33_0>=61 && LA33_0<=68)) ) {s = 5;}

                         
                        input.seek(index33_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\74\uffff";
    static final String DFA56_eofS =
        "\1\2\73\uffff";
    static final String DFA56_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA56_maxS =
        "\1\107\1\0\72\uffff";
    static final String DFA56_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA56_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA56_transitionS = {
            "\3\2\10\uffff\1\2\1\uffff\27\2\1\1\2\2\1\uffff\20\2\1\uffff"+
            "\13\2",
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
            return "3336:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_1 = input.LA(1);

                         
                        int index56_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index56_1);
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
    static final String DFA55_eotS =
        "\34\uffff";
    static final String DFA55_eofS =
        "\34\uffff";
    static final String DFA55_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA55_maxS =
        "\1\107\2\0\31\uffff";
    static final String DFA55_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA55_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA55_transitionS = {
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

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "3357:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_0 = input.LA(1);

                         
                        int index55_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA55_0==RULE_ID) ) {s = 1;}

                        else if ( (LA55_0==40) ) {s = 2;}

                        else if ( (LA55_0==71) && (synpred22_InternalHelloXbase())) {s = 3;}

                        else if ( (LA55_0==43) && (synpred22_InternalHelloXbase())) {s = 4;}

                        else if ( ((LA55_0>=RULE_INT && LA55_0<=RULE_STRING)||LA55_0==15||LA55_0==26||(LA55_0>=29 && LA55_0<=30)||LA55_0==42||LA55_0==46||LA55_0==48||LA55_0==50||(LA55_0>=54 && LA55_0<=56)||LA55_0==59||(LA55_0>=61 && LA55_0<=68)) ) {s = 5;}

                        else if ( (LA55_0==41) ) {s = 27;}

                         
                        input.seek(index55_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA55_1 = input.LA(1);

                         
                        int index55_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index55_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA55_2 = input.LA(1);

                         
                        int index55_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index55_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA57_eotS =
        "\74\uffff";
    static final String DFA57_eofS =
        "\1\2\73\uffff";
    static final String DFA57_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA57_maxS =
        "\1\107\1\0\72\uffff";
    static final String DFA57_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA57_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA57_transitionS = {
            "\3\2\10\uffff\1\2\1\uffff\31\2\1\1\1\uffff\20\2\1\uffff\13\2",
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
            return "3436:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred23_InternalHelloXbase()) ) {s = 59;}

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
    static final String DFA63_eotS =
        "\34\uffff";
    static final String DFA63_eofS =
        "\34\uffff";
    static final String DFA63_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA63_maxS =
        "\1\107\2\0\31\uffff";
    static final String DFA63_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA63_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA63_transitionS = {
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
            return "3633:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_0 = input.LA(1);

                         
                        int index63_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA63_0==RULE_ID) ) {s = 1;}

                        else if ( (LA63_0==40) ) {s = 2;}

                        else if ( (LA63_0==71) && (synpred24_InternalHelloXbase())) {s = 3;}

                        else if ( (LA63_0==43) && (synpred24_InternalHelloXbase())) {s = 4;}

                        else if ( ((LA63_0>=RULE_INT && LA63_0<=RULE_STRING)||LA63_0==15||LA63_0==26||(LA63_0>=29 && LA63_0<=30)||LA63_0==42||LA63_0==46||LA63_0==48||LA63_0==50||(LA63_0>=54 && LA63_0<=56)||LA63_0==59||(LA63_0>=61 && LA63_0<=68)) ) {s = 5;}

                        else if ( (LA63_0==41) ) {s = 27;}

                         
                        input.seek(index63_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA63_1 = input.LA(1);

                         
                        int index63_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index63_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA63_2 = input.LA(1);

                         
                        int index63_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index63_2);
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
    static final String DFA64_eotS =
        "\74\uffff";
    static final String DFA64_eofS =
        "\1\2\73\uffff";
    static final String DFA64_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA64_maxS =
        "\1\107\1\0\72\uffff";
    static final String DFA64_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA64_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA64_transitionS = {
            "\3\2\10\uffff\1\2\1\uffff\31\2\1\1\1\uffff\20\2\1\uffff\13\2",
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
            return "3712:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index64_1);
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
    static final String DFA66_eotS =
        "\74\uffff";
    static final String DFA66_eofS =
        "\1\31\73\uffff";
    static final String DFA66_minS =
        "\1\4\30\0\43\uffff";
    static final String DFA66_maxS =
        "\1\107\30\0\43\uffff";
    static final String DFA66_acceptS =
        "\31\uffff\1\2\41\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\43\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\1\1\15\1\17\10\uffff\1\2\1\uffff\11\31\1\10\2\31\1\4\1\3"+
            "\11\31\1\30\1\31\1\12\1\uffff\2\31\1\21\1\31\1\7\1\31\1\6\3"+
            "\31\1\22\1\23\1\24\2\31\1\11\1\uffff\1\5\1\13\1\14\1\16\1\20"+
            "\1\25\1\26\1\27\3\31",
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
            return "4036:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_2 = input.LA(1);

                         
                        int index66_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA66_3 = input.LA(1);

                         
                        int index66_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA66_4 = input.LA(1);

                         
                        int index66_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA66_5 = input.LA(1);

                         
                        int index66_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA66_6 = input.LA(1);

                         
                        int index66_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA66_7 = input.LA(1);

                         
                        int index66_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA66_8 = input.LA(1);

                         
                        int index66_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA66_9 = input.LA(1);

                         
                        int index66_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA66_10 = input.LA(1);

                         
                        int index66_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA66_11 = input.LA(1);

                         
                        int index66_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA66_12 = input.LA(1);

                         
                        int index66_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA66_13 = input.LA(1);

                         
                        int index66_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA66_14 = input.LA(1);

                         
                        int index66_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA66_15 = input.LA(1);

                         
                        int index66_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA66_16 = input.LA(1);

                         
                        int index66_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA66_17 = input.LA(1);

                         
                        int index66_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA66_18 = input.LA(1);

                         
                        int index66_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA66_19 = input.LA(1);

                         
                        int index66_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA66_20 = input.LA(1);

                         
                        int index66_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA66_21 = input.LA(1);

                         
                        int index66_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA66_22 = input.LA(1);

                         
                        int index66_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA66_23 = input.LA(1);

                         
                        int index66_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA66_24 = input.LA(1);

                         
                        int index66_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index66_24);
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
    static final String DFA76_eotS =
        "\74\uffff";
    static final String DFA76_eofS =
        "\1\2\73\uffff";
    static final String DFA76_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA76_maxS =
        "\1\107\1\0\72\uffff";
    static final String DFA76_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA76_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA76_transitionS = {
            "\3\2\10\uffff\1\2\1\uffff\11\2\1\1\20\2\1\uffff\20\2\1\uffff"+
            "\13\2",
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
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "4477:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_1 = input.LA(1);

                         
                        int index76_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalHelloXbase()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index76_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel153 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard353 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedNameWithWildcard372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGreeting461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting478 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGreeting495 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleGreeting516 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleGreeting528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment722 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment738 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment788 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment841 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpSingleAssign952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpMultiAssign1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1136 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1189 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1212 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpOr1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1395 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1448 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1471 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpAnd1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1654 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1707 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1730 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpEquality1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpEquality1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1934 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_22_in_ruleXRelationalExpression1970 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression1995 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2056 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2079 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpCompare2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpCompare2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2322 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2375 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2398 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2602 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2655 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2678 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpAdd2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpAdd2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2882 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2935 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2958 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti2997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpMulti3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpMulti3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpMulti3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpMulti3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3211 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOpUnary3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpUnary3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpUnary3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3481 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleXCastedExpression3516 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3539 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3634 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_36_in_ruleXMemberFeatureCall3683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3706 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3722 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3744 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_36_in_ruleXMemberFeatureCall3830 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_37_in_ruleXMemberFeatureCall3854 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall3891 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_26_in_ruleXMemberFeatureCall3920 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3941 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall3954 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3975 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_25_in_ruleXMemberFeatureCall3989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4014 = new BitSet(new long[]{0x0000057000000002L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4048 = new BitSet(new long[]{0xE9C54F0064008070L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4133 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4161 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall4174 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4195 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4212 = new BitSet(new long[]{0x0000047000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4245 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral4839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral4866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure4928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXClosure4984 = new BitSet(new long[]{0xEFC55D0064008070L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5055 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_ruleXClosure5068 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5089 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_ruleXClosure5111 = new BitSet(new long[]{0xEFC5550064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5148 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXClosure5160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5262 = new BitSet(new long[]{0xEFC5650064008072L,0x000000000000001FL});
    public static final BitSet FOLLOW_45_in_ruleXExpressionInClosure5275 = new BitSet(new long[]{0xEFC5450064008072L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5433 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_ruleXShortClosure5446 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5467 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_ruleXShortClosure5489 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXParenthesizedExpression5608 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5630 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXParenthesizedExpression5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXIfExpression5733 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXIfExpression5745 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5766 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXIfExpression5778 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5799 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleXIfExpression5820 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression5936 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression5977 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression5989 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6013 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression6025 = new BitSet(new long[]{0x0022010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6046 = new BitSet(new long[]{0x003A010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6060 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression6072 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6093 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6199 = new BitSet(new long[]{0x0022000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXCasePart6213 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6234 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXCasePart6248 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXForLoopExpression6361 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXForLoopExpression6373 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6394 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXForLoopExpression6406 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6427 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXForLoopExpression6439 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXWhileExpression6552 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXWhileExpression6564 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6585 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXWhileExpression6597 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXDoWhileExpression6710 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6731 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXDoWhileExpression6743 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXDoWhileExpression6755 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6776 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXDoWhileExpression6788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXBlockExpression6880 = new BitSet(new long[]{0xEFD5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression6902 = new BitSet(new long[]{0xEFD5650064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_45_in_ruleXBlockExpression6915 = new BitSet(new long[]{0xEFD5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_52_in_ruleXBlockExpression6931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock6967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock6977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXVariableDeclaration7149 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_58_in_ruleXVariableDeclaration7180 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7228 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7249 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7278 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleXVariableDeclaration7292 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7645 = new BitSet(new long[]{0x0800000004000010L});
    public static final BitSet FOLLOW_26_in_ruleXFeatureCall7659 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7680 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_39_in_ruleXFeatureCall7693 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7714 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_25_in_ruleXFeatureCall7728 = new BitSet(new long[]{0x0800000004000010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7753 = new BitSet(new long[]{0x0000050000000002L});
    public static final BitSet FOLLOW_40_in_ruleXFeatureCall7787 = new BitSet(new long[]{0xE9C54F0064008070L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7872 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7900 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleXFeatureCall7913 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7934 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall7951 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall7984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleIdOrSuper8104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8203 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleStaticQualifier8221 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXConstructorCall8318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8341 = new BitSet(new long[]{0x0000010004000000L});
    public static final BitSet FOLLOW_26_in_ruleXConstructorCall8354 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8375 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_39_in_ruleXConstructorCall8388 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8409 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_25_in_ruleXConstructorCall8423 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXConstructorCall8437 = new BitSet(new long[]{0xE9C54F0064008070L,0x000000000000009FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8509 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8537 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleXConstructorCall8550 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8571 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall8588 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall8619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXBooleanLiteral8713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXBooleanLiteral8737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXNullLiteral8843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral8879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral8889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral8940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral8991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXTypeLiteral9139 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXTypeLiteral9151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9174 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXTypeLiteral9186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXThrowExpression9278 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXReturnExpression9391 = new BitSet(new long[]{0xE9C5450064008072L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXTryCatchFinallyExpression9515 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9566 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_ruleXTryCatchFinallyExpression9588 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXTryCatchFinallyExpression9632 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause9701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXCatchClause9746 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXCatchClause9759 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause9780 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXCatchClause9792 = new BitSet(new long[]{0xE9C5450064008070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9908 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleQualifiedName9936 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName9959 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10064 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleJvmTypeReference10102 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleJvmTypeReference10114 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXFunctionTypeRef10229 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10250 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleXFunctionTypeRef10263 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10284 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_ruleXFunctionTypeRef10298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleXFunctionTypeRef10312 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10427 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleJvmParameterizedTypeReference10448 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10470 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_39_in_ruleJvmParameterizedTypeReference10483 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10504 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_25_in_ruleJvmParameterizedTypeReference10518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference10640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference10675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference10685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleJvmWildcardTypeReference10731 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference10753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference10780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound10818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound10828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleJvmUpperBound10865 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmUpperBoundAnded10969 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleJvmLowerBound11073 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloXbase809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalHelloXbase1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalHelloXbase1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalHelloXbase1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred5_InternalHelloXbase1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalHelloXbase2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalHelloXbase2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalHelloXbase2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalHelloXbase2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred10_InternalHelloXbase3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred11_InternalHelloXbase3651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalHelloXbase3660 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalHelloXbase3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred12_InternalHelloXbase3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred12_InternalHelloXbase3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred12_InternalHelloXbase3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred13_InternalHelloXbase4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloXbase4082 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_synpred14_InternalHelloXbase4089 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloXbase4096 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_synpred14_InternalHelloXbase4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalHelloXbase4228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXbase5001 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_synpred16_InternalHelloXbase5008 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXbase5015 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_synpred16_InternalHelloXbase5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred18_InternalHelloXbase5812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalHelloXbase5952 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_synpred19_InternalHelloXbase5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred20_InternalHelloXbase7198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalHelloXbase7207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred21_InternalHelloXbase7769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalHelloXbase7821 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_synpred22_InternalHelloXbase7828 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalHelloXbase7835 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_synpred22_InternalHelloXbase7849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred23_InternalHelloXbase7967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalHelloXbase8458 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_synpred24_InternalHelloXbase8465 = new BitSet(new long[]{0x0000010000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalHelloXbase8472 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_synpred24_InternalHelloXbase8486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred25_InternalHelloXbase8602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred26_InternalHelloXbase9405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_synpred27_InternalHelloXbase9550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_synpred28_InternalHelloXbase9580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred30_InternalHelloXbase9927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred31_InternalHelloXbase10079 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_synpred31_InternalHelloXbase10083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred32_InternalHelloXbase10440 = new BitSet(new long[]{0x0000000000000002L});

}