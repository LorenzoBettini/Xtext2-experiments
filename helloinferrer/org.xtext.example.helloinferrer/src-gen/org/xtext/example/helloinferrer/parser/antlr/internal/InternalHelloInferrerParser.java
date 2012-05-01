package org.xtext.example.helloinferrer.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.helloinferrer.services.HelloInferrerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalHelloInferrerParser extends AbstractInternalAntlrParser {
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


        public InternalHelloInferrerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHelloInferrerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHelloInferrerParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g"; }



     	private HelloInferrerGrammarAccess grammarAccess;
     	
        public InternalHelloInferrerParser(TokenStream input, HelloInferrerGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected HelloInferrerGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_greetings_1_0= ruleGreeting ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_greetings_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_greetings_1_0= ruleGreeting ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_greetings_1_0= ruleGreeting ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_greetings_1_0= ruleGreeting ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_greetings_1_0= ruleGreeting ) )*
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:82:3: lv_imports_0_0= ruleImport
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:98:3: ( (lv_greetings_1_0= ruleGreeting ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:99:1: (lv_greetings_1_0= ruleGreeting )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:99:1: (lv_greetings_1_0= ruleGreeting )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:100:3: lv_greetings_1_0= ruleGreeting
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:124:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:125:2: (iv_ruleImport= ruleImport EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:126:2: iv_ruleImport= ruleImport EOF
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:133:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:136:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:137:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImport237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:141:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:143:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:167:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:168:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:169:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:176:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:179:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:180:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:180:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:181:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:191:1: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:192:2: kw= '.*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildcard372); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:205:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:206:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:207:2: iv_ruleGreeting= ruleGreeting EOF
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:214:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:217:28: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:218:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:218:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:218:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleGreeting461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:222:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:223:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:223:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:224:3: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleGreeting495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getFromKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:244:1: ( (lv_expression_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:245:1: (lv_expression_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:245:1: (lv_expression_3_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:246:3: lv_expression_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGreetingAccess().getExpressionXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleGreeting516);
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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleGreeting528); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:274:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:275:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:276:2: iv_ruleXExpression= ruleXExpression EOF
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:283:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:286:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:288:5: this_XAssignment_0= ruleXAssignment
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:304:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:305:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:306:2: iv_ruleXAssignment= ruleXAssignment EOF
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:313:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:316:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:317:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:317:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||(LA5_1>=RULE_ID && LA5_1<=RULE_DECIMAL)||LA5_1==17||(LA5_1>=19 && LA5_1<=44)||(LA5_1>=46 && LA5_1<=73)) ) {
                    alt5=2;
                }
                else if ( (LA5_1==18) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_DECIMAL)||LA5_0==17||LA5_0==28||(LA5_0>=31 && LA5_0<=32)||LA5_0==42||LA5_0==44||LA5_0==48||LA5_0==50||LA5_0==52||(LA5_0>=56 && LA5_0<=58)||LA5_0==61||(LA5_0>=63 && LA5_0<=70)) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:317:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:317:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:317:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:317:3: ()
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:318:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:323:2: ( ( ruleValidID ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:324:1: ( ruleValidID )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:324:1: ( ruleValidID )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:325:3: ruleValidID
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:346:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:347:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:347:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:348:3: lv_value_3_0= ruleXAssignment
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:365:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:365:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:366:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:374:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==19) ) {
                        int LA4_1 = input.LA(2);

                        if ( (synpred1_InternalHelloInferrer()) ) {
                            alt4=1;
                        }
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:374:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:374:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:374:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:379:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:379:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:379:7: ()
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:380:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:385:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:386:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:386:1: ( ruleOpMultiAssign )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:387:3: ruleOpMultiAssign
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

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:400:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:401:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:401:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:402:3: lv_rightOperand_7_0= ruleXAssignment
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:426:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:427:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:428:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:435:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:438:28: (kw= '=' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:440:2: kw= '='
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpSingleAssign952); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:453:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:454:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:455:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:462:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:465:28: (kw= '+=' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:467:2: kw= '+='
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpMultiAssign1040); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:480:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:481:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:482:2: iv_ruleXOrExpression= ruleXOrExpression EOF
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:489:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:492:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:493:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:493:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:494:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:502:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    int LA6_2 = input.LA(2);

                    if ( (synpred2_InternalHelloInferrer()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:502:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:502:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:502:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:507:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:507:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:507:7: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:508:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:513:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:514:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:514:1: ( ruleOpOr )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:515:3: ruleOpOr
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:528:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:529:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:529:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:530:3: lv_rightOperand_3_0= ruleXAndExpression
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:554:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:555:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:556:2: iv_ruleOpOr= ruleOpOr EOF
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:563:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:566:28: (kw= '||' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:568:2: kw= '||'
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpOr1299); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:581:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:582:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:583:2: iv_ruleXAndExpression= ruleXAndExpression EOF
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:590:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:593:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:594:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:594:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:595:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:603:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred3_InternalHelloInferrer()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:603:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:603:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:603:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:608:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:608:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:608:7: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:609:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:614:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:615:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:615:1: ( ruleOpAnd )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:616:3: ruleOpAnd
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:629:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:630:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:630:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:631:3: lv_rightOperand_3_0= ruleXEqualityExpression
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:655:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:656:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:657:2: iv_ruleOpAnd= ruleOpAnd EOF
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:664:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:667:28: (kw= '&&' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:669:2: kw= '&&'
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleOpAnd1558); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:682:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:683:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:684:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:691:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:694:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:695:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:695:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:696:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:704:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred4_InternalHelloInferrer()) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==23) ) {
                    int LA8_3 = input.LA(2);

                    if ( (synpred4_InternalHelloInferrer()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:704:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:704:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:704:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:709:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:709:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:709:7: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:710:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:715:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:716:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:716:1: ( ruleOpEquality )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:717:3: ruleOpEquality
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:730:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:731:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:731:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:732:3: lv_rightOperand_3_0= ruleXRelationalExpression
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:756:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:757:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:758:2: iv_ruleOpEquality= ruleOpEquality EOF
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:765:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:768:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:769:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:769:1: (kw= '==' | kw= '!=' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:770:2: kw= '=='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpEquality1818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:777:2: kw= '!='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpEquality1837); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:790:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:791:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:792:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:799:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:802:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:803:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:803:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:804:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:812:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop10:
            do {
                int alt10=3;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    int LA10_2 = input.LA(2);

                    if ( (synpred5_InternalHelloInferrer()) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA10_3 = input.LA(2);

                    if ( (synpred6_InternalHelloInferrer()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA10_4 = input.LA(2);

                    if ( (synpred6_InternalHelloInferrer()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA10_5 = input.LA(2);

                    if ( (synpred6_InternalHelloInferrer()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA10_6 = input.LA(2);

                    if ( (synpred6_InternalHelloInferrer()) ) {
                        alt10=2;
                    }


                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:812:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:812:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:812:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:812:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:812:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:814:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:814:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:814:6: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:815:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXRelationalExpression1970); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:824:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:825:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:825:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:826:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1993);
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
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:843:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:843:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:843:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:843:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:843:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:848:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:848:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:848:7: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:849:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:854:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:855:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:855:1: ( ruleOpCompare )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:856:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2054);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:869:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:870:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:870:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:871:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2077);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:895:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:896:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:897:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2117);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2128); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:904:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:907:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:908:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:908:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt11=1;
                }
                break;
            case 26:
                {
                alt11=2;
                }
                break;
            case 27:
                {
                alt11=3;
                }
                break;
            case 28:
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:909:2: kw= '>='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare2166); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:916:2: kw= '<='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2185); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:923:2: kw= '>'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2204); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:930:2: kw= '<'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpCompare2223); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:943:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:944:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:945:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2263);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2273); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:952:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:955:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:956:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:956:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:957:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2320);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:965:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred7_InternalHelloInferrer()) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==30) ) {
                    int LA12_3 = input.LA(2);

                    if ( (synpred7_InternalHelloInferrer()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:965:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:965:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:965:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:970:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:970:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:970:7: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:971:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:976:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:977:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:977:1: ( ruleOpOther )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:978:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2373);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:991:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:992:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:992:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:993:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2396);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1017:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1018:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1019:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2435);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2446); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1026:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1029:28: ( (kw= '->' | kw= '..' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1030:1: (kw= '->' | kw= '..' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1030:1: (kw= '->' | kw= '..' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1031:2: kw= '->'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2484); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1038:2: kw= '..'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2503); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1051:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1052:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1053:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2543);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2553); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1060:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1063:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1064:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1064:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1065:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2600);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1073:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred8_InternalHelloInferrer()) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==32) ) {
                    int LA14_3 = input.LA(2);

                    if ( (synpred8_InternalHelloInferrer()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1073:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1073:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1073:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1078:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1078:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1078:7: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1079:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1084:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1085:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1085:1: ( ruleOpAdd )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1086:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2653);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1099:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1100:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1100:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1101:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2676);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1125:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1126:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1127:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2715);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2726); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1134:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1137:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1138:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1138:1: (kw= '+' | kw= '-' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            else if ( (LA15_0==32) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1139:2: kw= '+'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpAdd2764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1146:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpAdd2783); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1159:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1160:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1161:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2823);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2833); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1168:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1171:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1172:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1172:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1173:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2880);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1181:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop16:
            do {
                int alt16=2;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (synpred9_InternalHelloInferrer()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (synpred9_InternalHelloInferrer()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA16_4 = input.LA(2);

                    if ( (synpred9_InternalHelloInferrer()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA16_5 = input.LA(2);

                    if ( (synpred9_InternalHelloInferrer()) ) {
                        alt16=1;
                    }


                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1181:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1181:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1181:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1186:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1186:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1186:7: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1187:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1192:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1193:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1193:1: ( ruleOpMulti )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1194:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2933);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1207:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1208:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1208:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1209:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2956);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1233:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1234:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1235:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti2995);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3006); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1242:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1245:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1246:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1246:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt17=1;
                }
                break;
            case 34:
                {
                alt17=2;
                }
                break;
            case 35:
                {
                alt17=3;
                }
                break;
            case 36:
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1247:2: kw= '*'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpMulti3044); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1254:2: kw= '**'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpMulti3063); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1261:2: kw= '/'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3082); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1268:2: kw= '%'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3101); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1281:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1282:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1283:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3141);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3151); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1290:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1293:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1294:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1294:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17||(LA18_0>=31 && LA18_0<=32)) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_DECIMAL)||LA18_0==28||LA18_0==42||LA18_0==44||LA18_0==48||LA18_0==50||LA18_0==52||(LA18_0>=56 && LA18_0<=58)||LA18_0==61||(LA18_0>=63 && LA18_0<=70)) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1294:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1294:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1294:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1294:3: ()
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1295:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1300:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1301:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1301:1: ( ruleOpUnary )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1302:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3209);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1315:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1316:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1316:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1317:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3230);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1335:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3259);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1351:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1352:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1353:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3295);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3306); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1360:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1363:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1364:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1364:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt19=1;
                }
                break;
            case 32:
                {
                alt19=2;
                }
                break;
            case 31:
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1365:2: kw= '!'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleOpUnary3344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1372:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpUnary3363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1379:2: kw= '+'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpUnary3382); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1392:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1393:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1394:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3422);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3432); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1401:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1404:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1405:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1405:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1406:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3479);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1414:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred10_InternalHelloInferrer()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1414:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1414:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1414:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1416:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1416:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1416:6: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1417:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleXCastedExpression3514); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1426:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1427:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1427:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1428:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3537);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1452:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1453:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1454:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3575);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3585); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1461:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1464:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1465:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1465:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1466:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3632);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1474:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop28:
            do {
                int alt28=3;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    int LA28_2 = input.LA(2);

                    if ( (synpred11_InternalHelloInferrer()) ) {
                        alt28=1;
                    }
                    else if ( (synpred12_InternalHelloInferrer()) ) {
                        alt28=2;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA28_3 = input.LA(2);

                    if ( (synpred12_InternalHelloInferrer()) ) {
                        alt28=2;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA28_4 = input.LA(2);

                    if ( (synpred12_InternalHelloInferrer()) ) {
                        alt28=2;
                    }


                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1474:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1474:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1474:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1474:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1474:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1480:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1480:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1480:26: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1481:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall3681); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1490:1: ( ( ruleValidID ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1491:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1491:1: ( ruleValidID )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1492:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3704);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3720);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1513:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1514:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1514:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1515:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3742);
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
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1532:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1532:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1532:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1532:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1532:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1548:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1548:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1548:8: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1549:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1554:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt21=3;
            	    switch ( input.LA(1) ) {
            	    case 38:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 40:
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
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1554:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall3828); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1559:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1559:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1560:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1560:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1561:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall3852); if (state.failed) return current;
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
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1575:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1575:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1576:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1576:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1577:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall3889); if (state.failed) return current;
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1590:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==28) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1590:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall3918); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1594:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1595:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1595:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1596:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3939);
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

            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1612:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop22:
            	            do {
            	                int alt22=2;
            	                int LA22_0 = input.LA(1);

            	                if ( (LA22_0==41) ) {
            	                    alt22=1;
            	                }


            	                switch (alt22) {
            	            	case 1 :
            	            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1612:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall3952); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1616:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1617:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1617:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1618:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3973);
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

            	            otherlv_14=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall3987); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1638:3: ( ( ruleValidID ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1639:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1639:1: ( ruleValidID )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1640:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4012);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1653:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt26=2;
            	    alt26 = dfa26.predict(input);
            	    switch (alt26) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1653:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1653:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1653:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1660:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1661:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4046); if (state.failed) return current;
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

            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1674:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt25=3;
            	            alt25 = dfa25.predict(input);
            	            switch (alt25) {
            	                case 1 :
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1674:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1674:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1674:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1691:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1692:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4131);
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
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1709:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1709:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1709:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1709:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1710:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1710:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1711:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4159);
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

            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1727:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop24:
            	                    do {
            	                        int alt24=2;
            	                        int LA24_0 = input.LA(1);

            	                        if ( (LA24_0==41) ) {
            	                            alt24=1;
            	                        }


            	                        switch (alt24) {
            	                    	case 1 :
            	                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1727:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4172); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1731:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1732:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1732:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1733:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4193);
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

            	            otherlv_21=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4210); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1753:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt27=2;
            	    alt27 = dfa27.predict(input);
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1753:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1758:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1759:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4243);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1783:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1784:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1785:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4283);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4293); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1792:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1795:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1796:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1796:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt29=13;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt29=1;
                }
                break;
            case 52:
                {
                alt29=2;
                }
                break;
            case 50:
                {
                alt29=3;
                }
                break;
            case RULE_ID:
            case 28:
            case 61:
                {
                alt29=4;
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
                alt29=5;
                }
                break;
            case 48:
                {
                alt29=6;
                }
                break;
            case 56:
                {
                alt29=7;
                }
                break;
            case 57:
                {
                alt29=8;
                }
                break;
            case 58:
                {
                alt29=9;
                }
                break;
            case 68:
                {
                alt29=10;
                }
                break;
            case 69:
                {
                alt29=11;
                }
                break;
            case 70:
                {
                alt29=12;
                }
                break;
            case 42:
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1797:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4340);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1807:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4367);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1817:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4394);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1827:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4421);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1837:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4448);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1847:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4475);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1857:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4502);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1867:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4529);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1877:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4556);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1887:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4583);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1897:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4610);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1907:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4637);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1917:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4664);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1933:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1934:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1935:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4699);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4709); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1942:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1945:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1946:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1946:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt30=6;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt30=1;
                }
                break;
            case 64:
            case 65:
                {
                alt30=2;
                }
                break;
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt30=3;
                }
                break;
            case 66:
                {
                alt30=4;
                }
                break;
            case RULE_STRING:
                {
                alt30=5;
                }
                break;
            case 67:
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1947:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4756);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1957:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4783);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1967:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4810);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1977:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral4837);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1987:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral4864);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1997:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4891);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2013:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2014:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2015:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure4926);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure4936); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2022:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2025:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2026:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2026:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2026:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2026:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2027:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleXClosure4982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2036:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2036:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2051:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2051:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2051:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID||LA32_0==42||LA32_0==73) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2051:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2051:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2052:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2052:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2053:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5053);
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

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2069:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==41) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2069:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleXClosure5066); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2073:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2074:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2074:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2075:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5087);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2091:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2092:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2092:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2093:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,45,FOLLOW_45_in_ruleXClosure5109); if (state.failed) return current;
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2106:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2107:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2107:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2108:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5146);
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

            otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleXClosure5158); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2136:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2137:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2138:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5194);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5204); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2145:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2148:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2149:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2149:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2149:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2149:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2150:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2155:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_DECIMAL)||LA35_0==17||LA35_0==28||(LA35_0>=31 && LA35_0<=32)||LA35_0==42||LA35_0==44||LA35_0==48||LA35_0==50||LA35_0==52||(LA35_0>=56 && LA35_0<=61)||(LA35_0>=63 && LA35_0<=70)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2155:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2155:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2156:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2156:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2157:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5260);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2173:2: (otherlv_2= ';' )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==47) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2173:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXExpressionInClosure5273); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2185:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2186:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2187:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5313);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5323); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2194:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2197:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2198:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2198:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2198:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2198:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2198:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2214:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2214:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2214:7: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2215:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2220:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||LA37_0==42||LA37_0==73) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2220:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2220:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2221:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2221:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2222:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5431);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2238:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==41) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2238:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXShortClosure5444); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2242:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2243:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2243:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2244:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5465);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2260:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2261:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2261:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2262:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,45,FOLLOW_45_in_ruleXShortClosure5487); if (state.failed) return current;
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2275:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2276:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2276:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2277:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5523);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2301:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2302:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2303:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5559);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5569); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2310:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2313:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2314:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2314:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2314:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleXParenthesizedExpression5606); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5628);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXParenthesizedExpression5639); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2339:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2340:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2341:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5675);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5685); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2348:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2351:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2352:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2352:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2352:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2352:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2353:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXIfExpression5731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXIfExpression5743); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2366:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2367:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2367:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2368:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5764);
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

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXIfExpression5776); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2388:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2389:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2389:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2390:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5797);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2406:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==49) ) {
                int LA38_1 = input.LA(2);

                if ( (synpred18_InternalHelloInferrer()) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2406:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2406:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2406:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleXIfExpression5818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2411:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2412:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2412:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2413:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5840);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2437:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2438:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2439:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5878);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5888); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2446:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2449:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2450:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2450:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2450:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2450:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2451:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression5934); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2460:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_DECIMAL)||LA40_0==17||LA40_0==28||(LA40_0>=31 && LA40_0<=32)||LA40_0==44||LA40_0==48||LA40_0==50||LA40_0==52||(LA40_0>=56 && LA40_0<=58)||LA40_0==61||(LA40_0>=63 && LA40_0<=70)) ) {
                alt40=1;
            }
            else if ( (LA40_0==42) ) {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==RULE_ID) ) {
                    int LA40_3 = input.LA(3);

                    if ( ((LA40_3>=18 && LA40_3<=40)||(LA40_3>=42 && LA40_3<=44)||LA40_3==62) ) {
                        alt40=1;
                    }
                    else if ( (LA40_3==51) && (synpred20_InternalHelloInferrer())) {
                        alt40=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA40_2>=RULE_STRING && LA40_2<=RULE_DECIMAL)||LA40_2==17||LA40_2==28||(LA40_2>=31 && LA40_2<=32)||LA40_2==42||LA40_2==44||LA40_2==48||LA40_2==50||LA40_2==52||(LA40_2>=56 && LA40_2<=58)||LA40_2==61||(LA40_2>=63 && LA40_2<=70)) ) {
                    alt40=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2460:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2460:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2460:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2460:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_ID) ) {
                        int LA39_1 = input.LA(2);

                        if ( (LA39_1==51) && (synpred19_InternalHelloInferrer())) {
                            alt39=1;
                        }
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2460:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2465:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2465:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2465:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2466:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2466:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2467:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
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

                            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression5989); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2487:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2488:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2488:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2489:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
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


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2506:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2506:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2506:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2506:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2506:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2512:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2512:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleXSwitchExpression6057); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2516:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2517:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2517:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2518:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6078);
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

                    otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6090); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2538:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2539:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2539:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2540:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6113);
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

                    otherlv_9=(Token)match(input,43,FOLLOW_43_in_ruleXSwitchExpression6125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6139); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2564:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID||LA41_0==42||LA41_0==51||LA41_0==55||LA41_0==73) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2565:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2565:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2566:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6160);
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
            	    if ( cnt41 >= 1 ) break loop41;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2582:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==53) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2582:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6186); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2590:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2591:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2591:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2592:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6207);
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

            otherlv_15=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6221); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2620:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2621:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2622:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6257);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6267); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2629:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2632:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2633:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2633:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2633:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2633:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||LA43_0==42||LA43_0==73) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2634:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2634:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2635:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6313);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2651:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==55) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2651:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXCasePart6327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2655:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2656:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2656:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2657:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6348);
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

            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleXCasePart6362); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2677:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2678:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2678:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2679:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6383);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2703:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2704:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2705:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6419);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6429); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2712:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2715:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2716:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2716:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2716:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2716:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2717:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXForLoopExpression6475); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXForLoopExpression6487); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2730:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2731:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2731:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2732:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6508);
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

            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXForLoopExpression6520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2752:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2753:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2753:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2754:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6541);
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

            otherlv_6=(Token)match(input,43,FOLLOW_43_in_ruleXForLoopExpression6553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2774:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2775:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2775:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2776:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6574);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2800:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2801:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2802:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6610);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6620); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2809:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2812:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2813:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2813:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2813:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2813:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2814:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXWhileExpression6666); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXWhileExpression6678); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2827:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2828:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2828:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2829:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6699);
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

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXWhileExpression6711); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2849:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2850:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2850:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2851:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6732);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2875:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2876:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2877:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6768);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6778); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2884:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2887:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2888:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2888:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2888:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2888:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2889:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXDoWhileExpression6824); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2898:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2899:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2899:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2900:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6845);
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

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleXDoWhileExpression6857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXDoWhileExpression6869); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2924:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2925:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2925:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2926:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6890);
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

            otherlv_6=(Token)match(input,43,FOLLOW_43_in_ruleXDoWhileExpression6902); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2954:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2955:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2956:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6938);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6948); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2963:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2966:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2967:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2967:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2967:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2967:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2968:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXBlockExpression6994); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2977:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_DECIMAL)||LA46_0==17||LA46_0==28||(LA46_0>=31 && LA46_0<=32)||LA46_0==42||LA46_0==44||LA46_0==48||LA46_0==50||LA46_0==52||(LA46_0>=56 && LA46_0<=61)||(LA46_0>=63 && LA46_0<=70)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2977:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2977:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2978:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2978:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2979:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7016);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2995:2: (otherlv_3= ';' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==47) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2995:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleXBlockExpression7029); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleXBlockExpression7045); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3011:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3012:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3013:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7081);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7091); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3020:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3023:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3024:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3024:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=59 && LA47_0<=60)) ) {
                alt47=1;
            }
            else if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_DECIMAL)||LA47_0==17||LA47_0==28||(LA47_0>=31 && LA47_0<=32)||LA47_0==42||LA47_0==44||LA47_0==48||LA47_0==50||LA47_0==52||(LA47_0>=56 && LA47_0<=58)||LA47_0==61||(LA47_0>=63 && LA47_0<=70)) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3025:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7138);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3035:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7165);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3051:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3052:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3053:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7200);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7210); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3060:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3063:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3064:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3064:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3064:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3064:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3065:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3070:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==59) ) {
                alt48=1;
            }
            else if ( (LA48_0==60) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3070:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3070:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3071:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3071:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3072:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,59,FOLLOW_59_in_ruleXVariableDeclaration7263); if (state.failed) return current;
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3086:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleXVariableDeclaration7294); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3090:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (synpred21_InternalHelloInferrer()) ) {
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
            else if ( (LA49_0==42) && (synpred21_InternalHelloInferrer())) {
                alt49=1;
            }
            else if ( (LA49_0==73) && (synpred21_InternalHelloInferrer())) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3090:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3090:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3090:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3098:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3098:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3098:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3099:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3099:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3100:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7342);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3116:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3117:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3117:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3118:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7363);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3135:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3135:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3136:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3136:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3137:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7392);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3153:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==18) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3153:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleXVariableDeclaration7406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3157:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3158:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3158:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3159:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7427);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3183:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3184:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3185:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7465);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7475); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3192:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3195:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3196:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3196:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3196:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3196:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==RULE_ID||LA51_1==28||LA51_1==38||LA51_1==44) ) {
                    alt51=1;
                }
            }
            else if ( (LA51_0==42||LA51_0==73) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3197:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3197:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3198:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7521);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3214:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3215:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3215:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3216:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7543);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3240:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3241:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3242:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7579);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7589); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3249:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3252:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3253:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3253:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3253:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3253:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3254:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3254:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3255:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7635);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3271:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3272:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3272:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3273:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7656);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3297:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3298:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3299:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7692);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7702); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3306:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3309:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3310:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3310:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3310:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3310:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3311:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3316:2: ( ( ruleStaticQualifier ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==62) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3317:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3317:1: ( ruleStaticQualifier )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3318:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7759);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3331:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==28) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3331:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall7773); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3335:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3336:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3336:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3337:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7794);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3353:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==41) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3353:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall7807); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3357:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3358:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3358:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3359:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7828);
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

                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall7842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3379:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3380:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3380:1: ( ruleIdOrSuper )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3381:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7867);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3394:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3394:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3394:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3394:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3401:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3402:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,42,FOLLOW_42_in_ruleXFeatureCall7901); if (state.failed) return current;
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3415:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt56=3;
                    alt56 = dfa56.predict(input);
                    switch (alt56) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3415:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3415:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3415:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3432:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3433:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7986);
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
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3450:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3450:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3450:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3450:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3451:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3451:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3452:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8014);
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

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3468:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==41) ) {
                                    alt55=1;
                                }


                                switch (alt55) {
                            	case 1 :
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3468:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall8027); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3472:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3473:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3473:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3474:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8048);
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

                    otherlv_13=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall8065); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3494:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3494:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3499:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3500:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8098);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3524:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3525:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3526:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8136);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8147); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3533:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3536:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3537:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3537:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            else if ( (LA59_0==61) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3538:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8194);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3550:2: kw= 'super'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleIdOrSuper8218); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3563:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3564:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3565:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8259);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8270); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3572:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3575:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3576:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3576:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_ID) ) {
                    int LA60_2 = input.LA(2);

                    if ( (LA60_2==62) ) {
                        alt60=1;
                    }


                }


                switch (alt60) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3577:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8317);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,62,FOLLOW_62_in_ruleStaticQualifier8335); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3601:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3602:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3603:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8376);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8386); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3610:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3613:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3614:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3614:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3614:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3614:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3615:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXConstructorCall8432); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3624:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3625:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3625:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3626:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8455);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3639:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3639:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3639:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3639:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall8476); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3644:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3645:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3645:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3646:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8498);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3662:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==41) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3662:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall8511); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3666:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3667:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3667:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3668:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8532);
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

                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall8546); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3688:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3688:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3688:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3688:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,42,FOLLOW_42_in_ruleXConstructorCall8569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3693:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt64=3;
                    alt64 = dfa64.predict(input);
                    switch (alt64) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3693:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3693:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3693:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3710:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3711:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8642);
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
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3728:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3728:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3728:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3728:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3729:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3729:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3730:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8670);
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

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3746:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==41) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3746:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall8683); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3750:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3751:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3751:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3752:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8704);
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

                    otherlv_13=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall8721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3772:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3772:4: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3777:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3778:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall8754);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3802:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3803:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3804:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8791);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8801); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3811:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3814:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3815:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3815:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3815:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3815:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3816:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3821:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==64) ) {
                alt67=1;
            }
            else if ( (LA67_0==65) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3821:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXBooleanLiteral8848); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3826:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3826:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3827:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3827:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3828:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,65,FOLLOW_65_in_ruleXBooleanLiteral8872); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3849:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3850:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3851:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8922);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8932); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3858:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3861:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3862:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3862:1: ( () otherlv_1= 'null' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3862:2: () otherlv_1= 'null'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3862:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3863:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXNullLiteral8978); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3880:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3881:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3882:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9014);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9024); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3889:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3892:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3893:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3893:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3893:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3893:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3894:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3899:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3900:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3900:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3901:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9079);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3925:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3926:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3927:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9115);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9125); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3934:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3937:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3938:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3938:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3938:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3938:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3939:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3944:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3945:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3945:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3946:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9176); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3970:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3971:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3972:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9217);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9227); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3979:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3982:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3983:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3983:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3983:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3983:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3984:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXTypeLiteral9273); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXTypeLiteral9285); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3997:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3998:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3998:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3999:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9308);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXTypeLiteral9320); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4024:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4025:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4026:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9356);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9366); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4033:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4036:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4037:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4037:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4037:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4037:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4038:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXThrowExpression9412); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4047:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4048:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4048:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4049:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9433);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4073:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4074:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4075:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9469);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9479); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4082:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4085:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4086:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4086:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4086:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4086:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4087:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXReturnExpression9525); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4096:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4096:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4101:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4102:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9556);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4126:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4127:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4128:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9593);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9603); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4135:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4138:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4139:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4139:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4139:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4139:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4140:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXTryCatchFinallyExpression9649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4149:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4150:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4150:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4151:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9670);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4167:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==72) ) {
                alt71=1;
            }
            else if ( (LA71_0==71) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4167:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4167:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4167:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4167:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt69=0;
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==72) ) {
                            int LA69_2 = input.LA(2);

                            if ( (synpred30_InternalHelloInferrer()) ) {
                                alt69=1;
                            }


                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4167:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4169:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4170:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9700);
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
                    	    if ( cnt69 >= 1 ) break loop69;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(69, input);
                                throw eee;
                        }
                        cnt69++;
                    } while (true);

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4186:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==71) ) {
                        int LA70_1 = input.LA(2);

                        if ( (synpred31_InternalHelloInferrer()) ) {
                            alt70=1;
                        }
                    }
                    switch (alt70) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4186:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4186:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4186:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression9722); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4191:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4192:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4192:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4193:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9744);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4210:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4210:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4210:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression9766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4214:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4215:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4215:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4216:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9787);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4240:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4241:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4242:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9825);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause9835); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4249:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4252:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4253:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4253:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4253:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4253:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4253:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleXCatchClause9880); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleXCatchClause9893); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4262:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4263:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4263:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4264:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause9914);
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

            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleXCatchClause9926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4284:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4285:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4285:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4286:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9947);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4310:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4311:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4312:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9984);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9995); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4319:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4322:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4323:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4323:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4324:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10042);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4334:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==38) ) {
                    int LA72_2 = input.LA(2);

                    if ( (LA72_2==RULE_ID) ) {
                        int LA72_3 = input.LA(3);

                        if ( (synpred33_InternalHelloInferrer()) ) {
                            alt72=1;
                        }


                    }


                }


                switch (alt72) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4334:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4334:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4334:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,38,FOLLOW_38_in_ruleQualifiedName10070); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10093);
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
            	    break loop72;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4361:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4365:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4366:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10147);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10158); if (state.failed) return current;

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4376:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4380:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4381:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4381:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_HEX) ) {
                alt76=1;
            }
            else if ( ((LA76_0>=RULE_INT && LA76_0<=RULE_DECIMAL)) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4381:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4389:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4389:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4389:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4389:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==RULE_INT) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==RULE_DECIMAL) ) {
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
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4389:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10230); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4397:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10256); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4404:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==38) ) {
                        int LA75_1 = input.LA(2);

                        if ( ((LA75_1>=RULE_INT && LA75_1<=RULE_DECIMAL)) ) {
                            alt75=1;
                        }
                    }
                    switch (alt75) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4405:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,38,FOLLOW_38_in_ruleNumber10276); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4410:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
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
                                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4410:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10292); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4418:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10318); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4436:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4437:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4438:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10371);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10381); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4445:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4448:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4449:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4449:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_ID) ) {
                alt78=1;
            }
            else if ( (LA78_0==42||LA78_0==73) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4449:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4449:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4450:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10429);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4458:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==44) ) {
                            int LA77_2 = input.LA(2);

                            if ( (LA77_2==46) ) {
                                int LA77_3 = input.LA(3);

                                if ( (synpred34_InternalHelloInferrer()) ) {
                                    alt77=1;
                                }


                            }


                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4458:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4461:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4461:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4461:6: ()
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4462:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleJvmTypeReference10467); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleJvmTypeReference10479); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4477:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10511);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4493:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4494:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4495:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10546);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10556); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4502:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4505:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4506:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4506:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4506:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4506:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==42) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4506:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleXFunctionTypeRef10594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4510:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==RULE_ID||LA80_0==42||LA80_0==73) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4510:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4510:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4511:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4511:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4512:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10616);
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

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4528:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop79:
                            do {
                                int alt79=2;
                                int LA79_0 = input.LA(1);

                                if ( (LA79_0==41) ) {
                                    alt79=1;
                                }


                                switch (alt79) {
                            	case 1 :
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4528:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXFunctionTypeRef10629); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4532:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4533:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4533:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4534:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10650);
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
                            	    break loop79;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXFunctionTypeRef10666); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,73,FOLLOW_73_in_ruleXFunctionTypeRef10680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4558:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4559:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4559:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4560:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10701);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4584:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4585:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4586:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10737);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10747); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4593:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4596:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4597:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4597:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4597:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4597:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4598:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4598:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4599:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10795);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4612:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt83=2;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4612:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4612:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4612:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleJvmParameterizedTypeReference10816); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4617:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4618:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4618:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4619:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10838);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4635:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==41) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4635:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleJvmParameterizedTypeReference10851); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4639:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4640:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4640:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4641:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10872);
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
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleJvmParameterizedTypeReference10886); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4669:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4670:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4671:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10924);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10934); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4678:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4681:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4682:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4682:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_ID||LA84_0==42||LA84_0==73) ) {
                alt84=1;
            }
            else if ( (LA84_0==74) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4683:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10981);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4693:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11008);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4709:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4710:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4711:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11043);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11053); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4718:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4721:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4722:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4722:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4722:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4722:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4723:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleJvmWildcardTypeReference11099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4732:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt85=3;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==75) ) {
                alt85=1;
            }
            else if ( (LA85_0==61) ) {
                alt85=2;
            }
            switch (alt85) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4732:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4732:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4733:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4733:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4734:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11121);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4751:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4751:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4752:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4752:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4753:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11148);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4777:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4778:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4779:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11186);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11196); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4786:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4789:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4790:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4790:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4790:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleJvmUpperBound11233); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4794:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4795:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4795:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4796:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11254);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4820:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4821:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4822:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11290);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11300); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4829:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4832:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4833:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4833:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4833:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleJvmUpperBoundAnded11337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4837:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4838:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4838:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4839:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11358);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4863:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4864:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4865:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11394);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11404); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4872:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4875:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4876:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4876:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4876:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleJvmLowerBound11441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4880:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4881:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4881:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4882:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11462);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4908:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4909:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4910:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11501);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11512); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4917:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4920:28: (this_ID_0= RULE_ID )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4921:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11551); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalHelloInferrer
    public final void synpred1_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:374:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:374:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:374:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:374:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:374:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:375:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:375:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:376:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:376:1: ( ruleOpMultiAssign )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:377:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloInferrer809);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalHelloInferrer

    // $ANTLR start synpred2_InternalHelloInferrer
    public final void synpred2_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:502:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:502:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:502:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:502:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:502:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:503:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:503:2: ( ( ruleOpOr ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:504:1: ( ruleOpOr )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:504:1: ( ruleOpOr )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:505:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalHelloInferrer1157);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalHelloInferrer

    // $ANTLR start synpred3_InternalHelloInferrer
    public final void synpred3_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:603:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:603:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:603:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:603:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:603:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:604:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:604:2: ( ( ruleOpAnd ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:605:1: ( ruleOpAnd )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:605:1: ( ruleOpAnd )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:606:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalHelloInferrer1416);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalHelloInferrer

    // $ANTLR start synpred4_InternalHelloInferrer
    public final void synpred4_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:704:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:704:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:704:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:704:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:704:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:705:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:705:2: ( ( ruleOpEquality ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:706:1: ( ruleOpEquality )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:706:1: ( ruleOpEquality )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:707:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalHelloInferrer1675);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalHelloInferrer

    // $ANTLR start synpred5_InternalHelloInferrer
    public final void synpred5_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:812:4: ( ( () 'instanceof' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:812:5: ( () 'instanceof' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:812:5: ( () 'instanceof' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:812:6: () 'instanceof'
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:812:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:813:1: 
        {
        }

        match(input,24,FOLLOW_24_in_synpred5_InternalHelloInferrer1951); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalHelloInferrer

    // $ANTLR start synpred6_InternalHelloInferrer
    public final void synpred6_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:843:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:843:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:843:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:843:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:843:10: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:844:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:844:2: ( ( ruleOpCompare ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:845:1: ( ruleOpCompare )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:845:1: ( ruleOpCompare )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:846:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalHelloInferrer2022);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalHelloInferrer

    // $ANTLR start synpred7_InternalHelloInferrer
    public final void synpred7_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:965:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:965:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:965:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:965:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:965:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:966:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:966:2: ( ( ruleOpOther ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:967:1: ( ruleOpOther )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:967:1: ( ruleOpOther )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:968:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalHelloInferrer2341);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalHelloInferrer

    // $ANTLR start synpred8_InternalHelloInferrer
    public final void synpred8_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1073:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1073:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1073:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1073:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1073:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1074:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1074:2: ( ( ruleOpAdd ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1075:1: ( ruleOpAdd )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1075:1: ( ruleOpAdd )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1076:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalHelloInferrer2621);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalHelloInferrer

    // $ANTLR start synpred9_InternalHelloInferrer
    public final void synpred9_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1181:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1181:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1181:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1181:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1181:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1182:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1182:2: ( ( ruleOpMulti ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1183:1: ( ruleOpMulti )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1183:1: ( ruleOpMulti )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1184:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalHelloInferrer2901);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalHelloInferrer

    // $ANTLR start synpred10_InternalHelloInferrer
    public final void synpred10_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1414:3: ( ( () 'as' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1414:4: ( () 'as' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1414:4: ( () 'as' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1414:5: () 'as'
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1414:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1415:1: 
        {
        }

        match(input,37,FOLLOW_37_in_synpred10_InternalHelloInferrer3495); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalHelloInferrer

    // $ANTLR start synpred11_InternalHelloInferrer
    public final void synpred11_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1474:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1474:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1474:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1474:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1474:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1475:1: 
        {
        }

        match(input,38,FOLLOW_38_in_synpred11_InternalHelloInferrer3649); if (state.failed) return ;
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1476:1: ( ( ruleValidID ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1477:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1477:1: ( ruleValidID )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1478:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalHelloInferrer3658);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalHelloInferrer3664);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalHelloInferrer

    // $ANTLR start synpred12_InternalHelloInferrer
    public final void synpred12_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1532:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1532:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1532:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1532:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1532:10: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1533:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1533:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt86=3;
        switch ( input.LA(1) ) {
        case 38:
            {
            alt86=1;
            }
            break;
        case 39:
            {
            alt86=2;
            }
            break;
        case 40:
            {
            alt86=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 86, 0, input);

            throw nvae;
        }

        switch (alt86) {
            case 1 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1533:4: '.'
                {
                match(input,38,FOLLOW_38_in_synpred12_InternalHelloInferrer3767); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1535:6: ( ( '?.' ) )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1535:6: ( ( '?.' ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1536:1: ( '?.' )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1536:1: ( '?.' )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1537:2: '?.'
                {
                match(input,39,FOLLOW_39_in_synpred12_InternalHelloInferrer3781); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1542:6: ( ( '*.' ) )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1542:6: ( ( '*.' ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1543:1: ( '*.' )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1543:1: ( '*.' )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1544:2: '*.'
                {
                match(input,40,FOLLOW_40_in_synpred12_InternalHelloInferrer3801); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalHelloInferrer

    // $ANTLR start synpred13_InternalHelloInferrer
    public final void synpred13_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1653:4: ( ( '(' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1654:1: ( '(' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1654:1: ( '(' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1655:2: '('
        {
        match(input,42,FOLLOW_42_in_synpred13_InternalHelloInferrer4028); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalHelloInferrer

    // $ANTLR start synpred14_InternalHelloInferrer
    public final void synpred14_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1674:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1674:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1674:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1674:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1674:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1675:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1675:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt88=2;
        int LA88_0 = input.LA(1);

        if ( (LA88_0==RULE_ID||LA88_0==42||LA88_0==73) ) {
            alt88=1;
        }
        switch (alt88) {
            case 1 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1675:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1675:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1676:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1676:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1677:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloInferrer4080);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1679:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop87:
                do {
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==41) ) {
                        alt87=1;
                    }


                    switch (alt87) {
                	case 1 :
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1679:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,41,FOLLOW_41_in_synpred14_InternalHelloInferrer4087); if (state.failed) return ;
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1680:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1681:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1681:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1682:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloInferrer4094);
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

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1684:6: ( ( '|' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1685:1: ( '|' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1685:1: ( '|' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1686:2: '|'
        {
        match(input,45,FOLLOW_45_in_synpred14_InternalHelloInferrer4108); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalHelloInferrer

    // $ANTLR start synpred15_InternalHelloInferrer
    public final void synpred15_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1753:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1754:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1754:1: ( ruleXClosure )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1755:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalHelloInferrer4226);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalHelloInferrer

    // $ANTLR start synpred16_InternalHelloInferrer
    public final void synpred16_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2036:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2036:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2036:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2036:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2036:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==RULE_ID||LA90_0==42||LA90_0==73) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2036:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2036:5: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2037:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2037:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2038:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloInferrer4999);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2040:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop89:
                do {
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==41) ) {
                        alt89=1;
                    }


                    switch (alt89) {
                	case 1 :
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2040:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,41,FOLLOW_41_in_synpred16_InternalHelloInferrer5006); if (state.failed) return ;
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2041:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2042:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2042:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2043:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloInferrer5013);
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

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2045:6: ( ( '|' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2046:1: ( '|' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2046:1: ( '|' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2047:2: '|'
        {
        match(input,45,FOLLOW_45_in_synpred16_InternalHelloInferrer5027); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalHelloInferrer

    // $ANTLR start synpred18_InternalHelloInferrer
    public final void synpred18_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2406:4: ( 'else' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2406:6: 'else'
        {
        match(input,49,FOLLOW_49_in_synpred18_InternalHelloInferrer5810); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalHelloInferrer

    // $ANTLR start synpred19_InternalHelloInferrer
    public final void synpred19_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2460:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2460:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2460:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2460:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2460:6: ( ( ruleValidID ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2461:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2461:1: ( ruleValidID )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2462:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalHelloInferrer5952);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,51,FOLLOW_51_in_synpred19_InternalHelloInferrer5958); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalHelloInferrer

    // $ANTLR start synpred20_InternalHelloInferrer
    public final void synpred20_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2506:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2506:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2506:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2506:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,42,FOLLOW_42_in_synpred20_InternalHelloInferrer6034); if (state.failed) return ;
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2507:1: ( ( ruleValidID ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2508:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2508:1: ( ruleValidID )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2509:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalHelloInferrer6041);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,51,FOLLOW_51_in_synpred20_InternalHelloInferrer6047); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalHelloInferrer

    // $ANTLR start synpred21_InternalHelloInferrer
    public final void synpred21_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3090:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3090:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3090:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3090:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3090:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3091:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3091:1: ( ruleJvmTypeReference )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3092:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred21_InternalHelloInferrer7312);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3094:2: ( ( ruleValidID ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3095:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3095:1: ( ruleValidID )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3096:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred21_InternalHelloInferrer7321);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred21_InternalHelloInferrer

    // $ANTLR start synpred22_InternalHelloInferrer
    public final void synpred22_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3394:4: ( ( '(' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3395:1: ( '(' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3395:1: ( '(' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3396:2: '('
        {
        match(input,42,FOLLOW_42_in_synpred22_InternalHelloInferrer7883); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred22_InternalHelloInferrer

    // $ANTLR start synpred23_InternalHelloInferrer
    public final void synpred23_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3415:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3415:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3415:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3415:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3415:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3416:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3416:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt94=2;
        int LA94_0 = input.LA(1);

        if ( (LA94_0==RULE_ID||LA94_0==42||LA94_0==73) ) {
            alt94=1;
        }
        switch (alt94) {
            case 1 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3416:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3416:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3417:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3417:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3418:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalHelloInferrer7935);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3420:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop93:
                do {
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==41) ) {
                        alt93=1;
                    }


                    switch (alt93) {
                	case 1 :
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3420:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,41,FOLLOW_41_in_synpred23_InternalHelloInferrer7942); if (state.failed) return ;
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3421:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3422:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3422:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3423:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalHelloInferrer7949);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop93;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3425:6: ( ( '|' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3426:1: ( '|' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3426:1: ( '|' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3427:2: '|'
        {
        match(input,45,FOLLOW_45_in_synpred23_InternalHelloInferrer7963); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred23_InternalHelloInferrer

    // $ANTLR start synpred24_InternalHelloInferrer
    public final void synpred24_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3494:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3495:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3495:1: ( ruleXClosure )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3496:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred24_InternalHelloInferrer8081);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalHelloInferrer

    // $ANTLR start synpred25_InternalHelloInferrer
    public final void synpred25_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3639:4: ( '<' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3639:6: '<'
        {
        match(input,28,FOLLOW_28_in_synpred25_InternalHelloInferrer8468); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalHelloInferrer

    // $ANTLR start synpred26_InternalHelloInferrer
    public final void synpred26_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3688:5: ( '(' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3688:7: '('
        {
        match(input,42,FOLLOW_42_in_synpred26_InternalHelloInferrer8561); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalHelloInferrer

    // $ANTLR start synpred27_InternalHelloInferrer
    public final void synpred27_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3693:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3693:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3693:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3693:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3693:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3694:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3694:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==42||LA96_0==73) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3694:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3694:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3695:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3695:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3696:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloInferrer8591);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3698:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==41) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3698:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,41,FOLLOW_41_in_synpred27_InternalHelloInferrer8598); if (state.failed) return ;
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3699:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3700:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3700:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3701:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloInferrer8605);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop95;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3703:6: ( ( '|' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3704:1: ( '|' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3704:1: ( '|' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3705:2: '|'
        {
        match(input,45,FOLLOW_45_in_synpred27_InternalHelloInferrer8619); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalHelloInferrer

    // $ANTLR start synpred28_InternalHelloInferrer
    public final void synpred28_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3772:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3773:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3773:1: ( ruleXClosure )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3774:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred28_InternalHelloInferrer8737);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalHelloInferrer

    // $ANTLR start synpred29_InternalHelloInferrer
    public final void synpred29_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4096:2: ( ( ruleXExpression ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4097:1: ( ruleXExpression )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4097:1: ( ruleXExpression )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4098:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred29_InternalHelloInferrer9539);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred29_InternalHelloInferrer

    // $ANTLR start synpred30_InternalHelloInferrer
    public final void synpred30_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4167:5: ( 'catch' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4167:7: 'catch'
        {
        match(input,72,FOLLOW_72_in_synpred30_InternalHelloInferrer9684); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalHelloInferrer

    // $ANTLR start synpred31_InternalHelloInferrer
    public final void synpred31_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4186:5: ( 'finally' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4186:7: 'finally'
        {
        match(input,71,FOLLOW_71_in_synpred31_InternalHelloInferrer9714); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalHelloInferrer

    // $ANTLR start synpred33_InternalHelloInferrer
    public final void synpred33_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4334:3: ( '.' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4335:2: '.'
        {
        match(input,38,FOLLOW_38_in_synpred33_InternalHelloInferrer10061); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalHelloInferrer

    // $ANTLR start synpred34_InternalHelloInferrer
    public final void synpred34_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4458:2: ( ( () '[' ']' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4458:3: ( () '[' ']' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4458:3: ( () '[' ']' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4458:4: () '[' ']'
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4458:4: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4459:1: 
        {
        }

        match(input,44,FOLLOW_44_in_synpred34_InternalHelloInferrer10444); if (state.failed) return ;
        match(input,46,FOLLOW_46_in_synpred34_InternalHelloInferrer10448); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred34_InternalHelloInferrer

    // $ANTLR start synpred35_InternalHelloInferrer
    public final void synpred35_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4612:4: ( '<' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4612:6: '<'
        {
        match(input,28,FOLLOW_28_in_synpred35_InternalHelloInferrer10808); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalHelloInferrer

    // Delegated rules

    public final boolean synpred20_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalHelloInferrer_fragment(); // can never throw exception
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
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA83 dfa83 = new DFA83(this);
    static final String DFA26_eotS =
        "\76\uffff";
    static final String DFA26_eofS =
        "\1\2\75\uffff";
    static final String DFA26_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA26_maxS =
        "\1\111\1\0\74\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA26_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA26_transitionS = {
            "\5\2\10\uffff\1\2\1\uffff\27\2\1\1\2\2\1\uffff\20\2\1\uffff"+
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
            return "1653:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
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
                        if ( (synpred13_InternalHelloInferrer()) ) {s = 61;}

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
        "\36\uffff";
    static final String DFA25_eofS =
        "\36\uffff";
    static final String DFA25_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA25_maxS =
        "\1\111\2\0\33\uffff";
    static final String DFA25_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA25_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA25_transitionS = {
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
            return "1674:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA25_0==42) ) {s = 2;}

                        else if ( (LA25_0==73) && (synpred14_InternalHelloInferrer())) {s = 3;}

                        else if ( (LA25_0==45) && (synpred14_InternalHelloInferrer())) {s = 4;}

                        else if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_DECIMAL)||LA25_0==17||LA25_0==28||(LA25_0>=31 && LA25_0<=32)||LA25_0==44||LA25_0==48||LA25_0==50||LA25_0==52||(LA25_0>=56 && LA25_0<=58)||LA25_0==61||(LA25_0>=63 && LA25_0<=70)) ) {s = 5;}

                        else if ( (LA25_0==43) ) {s = 29;}

                         
                        input.seek(index25_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_1 = input.LA(1);

                         
                        int index25_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalHelloInferrer()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index25_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_2 = input.LA(1);

                         
                        int index25_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalHelloInferrer()) ) {s = 4;}

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
        "\76\uffff";
    static final String DFA27_eofS =
        "\1\2\75\uffff";
    static final String DFA27_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA27_maxS =
        "\1\111\1\0\74\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA27_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA27_transitionS = {
            "\5\2\10\uffff\1\2\1\uffff\31\2\1\1\1\uffff\20\2\1\uffff\13\2",
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
            return "1753:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
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
                        if ( (synpred15_InternalHelloInferrer()) ) {s = 61;}

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
        "\40\uffff";
    static final String DFA33_eofS =
        "\40\uffff";
    static final String DFA33_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA33_maxS =
        "\1\111\2\0\35\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA33_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA33_transitionS = {
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
            return "2036:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
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

                        else if ( (LA33_0==42) ) {s = 2;}

                        else if ( (LA33_0==73) && (synpred16_InternalHelloInferrer())) {s = 3;}

                        else if ( (LA33_0==45) && (synpred16_InternalHelloInferrer())) {s = 4;}

                        else if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_DECIMAL)||LA33_0==17||LA33_0==28||(LA33_0>=31 && LA33_0<=32)||LA33_0==44||LA33_0==46||LA33_0==48||LA33_0==50||LA33_0==52||(LA33_0>=56 && LA33_0<=61)||(LA33_0>=63 && LA33_0<=70)) ) {s = 5;}

                         
                        input.seek(index33_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloInferrer()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloInferrer()) ) {s = 4;}

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
    static final String DFA57_eotS =
        "\76\uffff";
    static final String DFA57_eofS =
        "\1\2\75\uffff";
    static final String DFA57_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA57_maxS =
        "\1\111\1\0\74\uffff";
    static final String DFA57_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA57_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA57_transitionS = {
            "\5\2\10\uffff\1\2\1\uffff\27\2\1\1\2\2\1\uffff\20\2\1\uffff"+
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
            return "3394:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred22_InternalHelloInferrer()) ) {s = 61;}

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
        "\36\uffff";
    static final String DFA56_eofS =
        "\36\uffff";
    static final String DFA56_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA56_maxS =
        "\1\111\2\0\33\uffff";
    static final String DFA56_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA56_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA56_transitionS = {
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
            return "3415:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA56_0==42) ) {s = 2;}

                        else if ( (LA56_0==73) && (synpred23_InternalHelloInferrer())) {s = 3;}

                        else if ( (LA56_0==45) && (synpred23_InternalHelloInferrer())) {s = 4;}

                        else if ( ((LA56_0>=RULE_STRING && LA56_0<=RULE_DECIMAL)||LA56_0==17||LA56_0==28||(LA56_0>=31 && LA56_0<=32)||LA56_0==44||LA56_0==48||LA56_0==50||LA56_0==52||(LA56_0>=56 && LA56_0<=58)||LA56_0==61||(LA56_0>=63 && LA56_0<=70)) ) {s = 5;}

                        else if ( (LA56_0==43) ) {s = 29;}

                         
                        input.seek(index56_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_1 = input.LA(1);

                         
                        int index56_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalHelloInferrer()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index56_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA56_2 = input.LA(1);

                         
                        int index56_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalHelloInferrer()) ) {s = 4;}

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
        "\76\uffff";
    static final String DFA58_eofS =
        "\1\2\75\uffff";
    static final String DFA58_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA58_maxS =
        "\1\111\1\0\74\uffff";
    static final String DFA58_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA58_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA58_transitionS = {
            "\5\2\10\uffff\1\2\1\uffff\31\2\1\1\1\uffff\20\2\1\uffff\13\2",
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
            return "3494:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred24_InternalHelloInferrer()) ) {s = 61;}

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
    static final String DFA62_eotS =
        "\76\uffff";
    static final String DFA62_eofS =
        "\1\2\75\uffff";
    static final String DFA62_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA62_maxS =
        "\1\111\1\0\74\uffff";
    static final String DFA62_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA62_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA62_transitionS = {
            "\5\2\10\uffff\1\2\1\uffff\11\2\1\1\20\2\1\uffff\20\2\1\uffff"+
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
            "",
            "",
            ""
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "3639:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\76\uffff";
    static final String DFA65_eofS =
        "\1\2\75\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA65_maxS =
        "\1\111\1\0\74\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA65_transitionS = {
            "\5\2\10\uffff\1\2\1\uffff\27\2\1\1\2\2\1\uffff\20\2\1\uffff"+
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
            return "3688:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred26_InternalHelloInferrer()) ) {s = 61;}

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
    static final String DFA64_eotS =
        "\36\uffff";
    static final String DFA64_eofS =
        "\36\uffff";
    static final String DFA64_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA64_maxS =
        "\1\111\2\0\33\uffff";
    static final String DFA64_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA64_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA64_transitionS = {
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
            return "3693:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA64_0==42) ) {s = 2;}

                        else if ( (LA64_0==73) && (synpred27_InternalHelloInferrer())) {s = 3;}

                        else if ( (LA64_0==45) && (synpred27_InternalHelloInferrer())) {s = 4;}

                        else if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_DECIMAL)||LA64_0==17||LA64_0==28||(LA64_0>=31 && LA64_0<=32)||LA64_0==44||LA64_0==48||LA64_0==50||LA64_0==52||(LA64_0>=56 && LA64_0<=58)||LA64_0==61||(LA64_0>=63 && LA64_0<=70)) ) {s = 5;}

                        else if ( (LA64_0==43) ) {s = 29;}

                         
                        input.seek(index64_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHelloInferrer()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHelloInferrer()) ) {s = 4;}

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
    static final String DFA66_eotS =
        "\76\uffff";
    static final String DFA66_eofS =
        "\1\2\75\uffff";
    static final String DFA66_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA66_maxS =
        "\1\111\1\0\74\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA66_transitionS = {
            "\5\2\10\uffff\1\2\1\uffff\31\2\1\1\1\uffff\20\2\1\uffff\13\2",
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
            return "3772:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred28_InternalHelloInferrer()) ) {s = 61;}

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
    static final String DFA68_eotS =
        "\76\uffff";
    static final String DFA68_eofS =
        "\1\33\75\uffff";
    static final String DFA68_minS =
        "\1\4\32\0\43\uffff";
    static final String DFA68_maxS =
        "\1\111\32\0\43\uffff";
    static final String DFA68_acceptS =
        "\33\uffff\1\2\41\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\43\uffff}>";
    static final String[] DFA68_transitionS = {
            "\1\1\1\21\1\15\1\16\1\17\10\uffff\1\2\1\uffff\11\33\1\10\2\33"+
            "\1\4\1\3\11\33\1\32\1\33\1\12\1\uffff\2\33\1\23\1\33\1\7\1\33"+
            "\1\6\3\33\1\24\1\25\1\26\2\33\1\11\1\uffff\1\5\1\13\1\14\1\20"+
            "\1\22\1\27\1\30\1\31\3\33",
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
            return "4096:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA68_2 = input.LA(1);

                         
                        int index68_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA68_3 = input.LA(1);

                         
                        int index68_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA68_4 = input.LA(1);

                         
                        int index68_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA68_5 = input.LA(1);

                         
                        int index68_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA68_6 = input.LA(1);

                         
                        int index68_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA68_7 = input.LA(1);

                         
                        int index68_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA68_8 = input.LA(1);

                         
                        int index68_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA68_9 = input.LA(1);

                         
                        int index68_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA68_10 = input.LA(1);

                         
                        int index68_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA68_11 = input.LA(1);

                         
                        int index68_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA68_12 = input.LA(1);

                         
                        int index68_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA68_13 = input.LA(1);

                         
                        int index68_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA68_14 = input.LA(1);

                         
                        int index68_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA68_15 = input.LA(1);

                         
                        int index68_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA68_16 = input.LA(1);

                         
                        int index68_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA68_17 = input.LA(1);

                         
                        int index68_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA68_18 = input.LA(1);

                         
                        int index68_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA68_19 = input.LA(1);

                         
                        int index68_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA68_20 = input.LA(1);

                         
                        int index68_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA68_21 = input.LA(1);

                         
                        int index68_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA68_22 = input.LA(1);

                         
                        int index68_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA68_23 = input.LA(1);

                         
                        int index68_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA68_24 = input.LA(1);

                         
                        int index68_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA68_25 = input.LA(1);

                         
                        int index68_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA68_26 = input.LA(1);

                         
                        int index68_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index68_26);
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
    static final String DFA83_eotS =
        "\76\uffff";
    static final String DFA83_eofS =
        "\1\2\75\uffff";
    static final String DFA83_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA83_maxS =
        "\1\111\1\0\74\uffff";
    static final String DFA83_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA83_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA83_transitionS = {
            "\5\2\10\uffff\1\2\1\uffff\11\2\1\1\20\2\1\uffff\20\2\1\uffff"+
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
            "",
            "",
            ""
    };

    static final short[] DFA83_eot = DFA.unpackEncodedString(DFA83_eotS);
    static final short[] DFA83_eof = DFA.unpackEncodedString(DFA83_eofS);
    static final char[] DFA83_min = DFA.unpackEncodedStringToUnsignedChars(DFA83_minS);
    static final char[] DFA83_max = DFA.unpackEncodedStringToUnsignedChars(DFA83_maxS);
    static final short[] DFA83_accept = DFA.unpackEncodedString(DFA83_acceptS);
    static final short[] DFA83_special = DFA.unpackEncodedString(DFA83_specialS);
    static final short[][] DFA83_transition;

    static {
        int numStates = DFA83_transitionS.length;
        DFA83_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA83_transition[i] = DFA.unpackEncodedString(DFA83_transitionS[i]);
        }
    }

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = DFA83_eot;
            this.eof = DFA83_eof;
            this.min = DFA83_min;
            this.max = DFA83_max;
            this.accept = DFA83_accept;
            this.special = DFA83_special;
            this.transition = DFA83_transition;
        }
        public String getDescription() {
            return "4612:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA83_1 = input.LA(1);

                         
                        int index83_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index83_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 83, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel153 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImport237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard353 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildcard372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGreeting461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting478 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleGreeting495 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleGreeting516 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGreeting528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment722 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment738 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment788 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment841 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpSingleAssign952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpMultiAssign1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1136 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1189 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1212 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpOr1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1395 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1448 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1471 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpAnd1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1654 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1707 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1730 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpEquality1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpEquality1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1934 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_24_in_ruleXRelationalExpression1970 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1993 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2054 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2077 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2320 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2373 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2396 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2600 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2653 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2676 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpAdd2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpAdd2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2880 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2933 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2956 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti2995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpMulti3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpMulti3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3209 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpUnary3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpUnary3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpUnary3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3479 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleXCastedExpression3514 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3537 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3632 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall3681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3704 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3720 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3742 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall3828 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall3852 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall3889 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall3918 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3939 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall3952 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3973 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall3987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4012 = new BitSet(new long[]{0x000015C000000002L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4046 = new BitSet(new long[]{0xA7153C01900201F0L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4131 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4159 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4172 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4193 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4210 = new BitSet(new long[]{0x000011C000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4243 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral4864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure4926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure4936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXClosure4982 = new BitSet(new long[]{0xBF157401900201F0L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5053 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_ruleXClosure5066 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5087 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_ruleXClosure5109 = new BitSet(new long[]{0xBF155401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5146 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXClosure5158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5260 = new BitSet(new long[]{0xBF159401900201F2L,0x000000000000007FL});
    public static final BitSet FOLLOW_47_in_ruleXExpressionInClosure5273 = new BitSet(new long[]{0xBF151401900201F2L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5431 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_ruleXShortClosure5444 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5465 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_ruleXShortClosure5487 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXParenthesizedExpression5606 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5628 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXParenthesizedExpression5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXIfExpression5731 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXIfExpression5743 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5764 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXIfExpression5776 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5797 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXIfExpression5818 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression5934 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression5977 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression5989 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6013 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_42_in_ruleXSwitchExpression6057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6078 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6090 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6113 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXSwitchExpression6125 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6139 = new BitSet(new long[]{0x0088040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6160 = new BitSet(new long[]{0x00E8040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6174 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6186 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6207 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6313 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXCasePart6327 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6348 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXCasePart6362 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXForLoopExpression6475 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXForLoopExpression6487 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6508 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXForLoopExpression6520 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6541 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXForLoopExpression6553 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXWhileExpression6666 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXWhileExpression6678 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6699 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXWhileExpression6711 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXDoWhileExpression6824 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6845 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXDoWhileExpression6857 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXDoWhileExpression6869 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6890 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXDoWhileExpression6902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXBlockExpression6994 = new BitSet(new long[]{0xBF551401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7016 = new BitSet(new long[]{0xBF559401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_47_in_ruleXBlockExpression7029 = new BitSet(new long[]{0xBF551401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_54_in_ruleXBlockExpression7045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXVariableDeclaration7263 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_60_in_ruleXVariableDeclaration7294 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7363 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7392 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXVariableDeclaration7406 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7759 = new BitSet(new long[]{0x2000000010000010L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall7773 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7794 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall7807 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7828 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall7842 = new BitSet(new long[]{0x2000000010000010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7867 = new BitSet(new long[]{0x0000140000000002L});
    public static final BitSet FOLLOW_42_in_ruleXFeatureCall7901 = new BitSet(new long[]{0xA7153C01900201F0L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7986 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8014 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall8027 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8048 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall8065 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleIdOrSuper8218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8317 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleStaticQualifier8335 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXConstructorCall8432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8455 = new BitSet(new long[]{0x0000140010000002L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall8476 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8498 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall8511 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8532 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall8546 = new BitSet(new long[]{0x0000140000000002L});
    public static final BitSet FOLLOW_42_in_ruleXConstructorCall8569 = new BitSet(new long[]{0xA7153C01900201F0L,0x000000000000027FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8642 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8670 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall8683 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8704 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall8721 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall8754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXBooleanLiteral8848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXBooleanLiteral8872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXNullLiteral8978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXTypeLiteral9273 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXTypeLiteral9285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9308 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXTypeLiteral9320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXThrowExpression9412 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXReturnExpression9525 = new BitSet(new long[]{0xA7151401900201F2L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXTryCatchFinallyExpression9649 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9700 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression9722 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression9766 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause9835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXCatchClause9880 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXCatchClause9893 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause9914 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXCatchClause9926 = new BitSet(new long[]{0xA7151401900201F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10042 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleQualifiedName10070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10093 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10230 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10256 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleNumber10276 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10429 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleJvmTypeReference10467 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleJvmTypeReference10479 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXFunctionTypeRef10594 = new BitSet(new long[]{0x00000C0000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10616 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_41_in_ruleXFunctionTypeRef10629 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10650 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFunctionTypeRef10666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleXFunctionTypeRef10680 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10795 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleJvmParameterizedTypeReference10816 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10838 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_41_in_ruleJvmParameterizedTypeReference10851 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10872 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_27_in_ruleJvmParameterizedTypeReference10886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference10981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmWildcardTypeReference11099 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJvmUpperBound11233 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmUpperBoundAnded11337 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleJvmLowerBound11441 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloInferrer809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalHelloInferrer1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalHelloInferrer1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalHelloInferrer1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred5_InternalHelloInferrer1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalHelloInferrer2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalHelloInferrer2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalHelloInferrer2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalHelloInferrer2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred10_InternalHelloInferrer3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred11_InternalHelloInferrer3649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalHelloInferrer3658 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalHelloInferrer3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred12_InternalHelloInferrer3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred12_InternalHelloInferrer3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred12_InternalHelloInferrer3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred13_InternalHelloInferrer4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloInferrer4080 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_synpred14_InternalHelloInferrer4087 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloInferrer4094 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_synpred14_InternalHelloInferrer4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalHelloInferrer4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloInferrer4999 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_synpred16_InternalHelloInferrer5006 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloInferrer5013 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_synpred16_InternalHelloInferrer5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred18_InternalHelloInferrer5810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalHelloInferrer5952 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_synpred19_InternalHelloInferrer5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred20_InternalHelloInferrer6034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalHelloInferrer6041 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_synpred20_InternalHelloInferrer6047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred21_InternalHelloInferrer7312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred21_InternalHelloInferrer7321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred22_InternalHelloInferrer7883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalHelloInferrer7935 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_synpred23_InternalHelloInferrer7942 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalHelloInferrer7949 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_synpred23_InternalHelloInferrer7963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred24_InternalHelloInferrer8081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred25_InternalHelloInferrer8468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred26_InternalHelloInferrer8561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloInferrer8591 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_synpred27_InternalHelloInferrer8598 = new BitSet(new long[]{0x0000040000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloInferrer8605 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_45_in_synpred27_InternalHelloInferrer8619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred28_InternalHelloInferrer8737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred29_InternalHelloInferrer9539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_synpred30_InternalHelloInferrer9684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_synpred31_InternalHelloInferrer9714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred33_InternalHelloInferrer10061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred34_InternalHelloInferrer10444 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_synpred34_InternalHelloInferrer10448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred35_InternalHelloInferrer10808 = new BitSet(new long[]{0x0000000000000002L});

}