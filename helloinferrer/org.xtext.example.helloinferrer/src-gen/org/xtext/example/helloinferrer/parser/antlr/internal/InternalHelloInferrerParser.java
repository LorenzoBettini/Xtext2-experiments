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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'Hello'", "'{'", "'}'", "'op'", "'('", "','", "')'", "'output'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=8;
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
    public static final int RULE_HEX=5;
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
    public static final int RULE_INT=6;
    public static final int RULE_DECIMAL=7;
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
    public static final int RULE_STRING=4;
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
    public static final int T__77=77;

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:214:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )* otherlv_4= '}' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_operations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:217:28: ( (otherlv_0= 'Hello' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )* otherlv_4= '}' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:218:1: (otherlv_0= 'Hello' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )* otherlv_4= '}' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:218:1: (otherlv_0= 'Hello' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )* otherlv_4= '}' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:218:3: otherlv_0= 'Hello' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleOperation ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleGreeting461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:222:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:223:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:223:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:224:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGreetingAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGreeting482);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGreetingRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleGreeting494); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:244:1: ( (lv_operations_3_0= ruleOperation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:245:1: (lv_operations_3_0= ruleOperation )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:245:1: (lv_operations_3_0= ruleOperation )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:246:3: lv_operations_3_0= ruleOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGreetingAccess().getOperationsOperationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperation_in_ruleGreeting515);
            	    lv_operations_3_0=ruleOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGreetingRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"operations",
            	              		lv_operations_3_0, 
            	              		"Operation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleGreeting528); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getGreetingAccess().getRightCurlyBracketKeyword_4());
                  
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


    // $ANTLR start "entryRuleOperation"
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:274:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:275:2: (iv_ruleOperation= ruleOperation EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:276:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation564);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation574); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:283:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'op' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_6= ')' otherlv_7= 'output' ( (lv_output_8_0= ruleFullJvmFormalParameter ) ) ( (lv_body_9_0= ruleXBlockExpression ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_output_8_0 = null;

        EObject lv_body_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:286:28: ( (otherlv_0= 'op' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_6= ')' otherlv_7= 'output' ( (lv_output_8_0= ruleFullJvmFormalParameter ) ) ( (lv_body_9_0= ruleXBlockExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:287:1: (otherlv_0= 'op' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_6= ')' otherlv_7= 'output' ( (lv_output_8_0= ruleFullJvmFormalParameter ) ) ( (lv_body_9_0= ruleXBlockExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:287:1: (otherlv_0= 'op' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_6= ')' otherlv_7= 'output' ( (lv_output_8_0= ruleFullJvmFormalParameter ) ) ( (lv_body_9_0= ruleXBlockExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:287:3: otherlv_0= 'op' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_6= ')' otherlv_7= 'output' ( (lv_output_8_0= ruleFullJvmFormalParameter ) ) ( (lv_body_9_0= ruleXBlockExpression ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleOperation611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOpKeyword_0());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:291:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:292:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:292:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:293:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleOperation632);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationRule());
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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleOperation644); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:313:1: ( ( (lv_params_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==19||LA6_0==74) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:313:2: ( (lv_params_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:313:2: ( (lv_params_3_0= ruleFullJvmFormalParameter ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:314:1: (lv_params_3_0= ruleFullJvmFormalParameter )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:314:1: (lv_params_3_0= ruleFullJvmFormalParameter )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:315:3: lv_params_3_0= ruleFullJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getParamsFullJvmFormalParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleOperation666);
                    lv_params_3_0=ruleFullJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_3_0, 
                              		"FullJvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:331:2: (otherlv_4= ',' ( (lv_params_5_0= ruleFullJvmFormalParameter ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==20) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:331:4: otherlv_4= ',' ( (lv_params_5_0= ruleFullJvmFormalParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleOperation679); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:335:1: ( (lv_params_5_0= ruleFullJvmFormalParameter ) )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:336:1: (lv_params_5_0= ruleFullJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:336:1: (lv_params_5_0= ruleFullJvmFormalParameter )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:337:3: lv_params_5_0= ruleFullJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationAccess().getParamsFullJvmFormalParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleOperation700);
                    	    lv_params_5_0=ruleFullJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_5_0, 
                    	              		"FullJvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleOperation716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleOperation728); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getOutputKeyword_5());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:361:1: ( (lv_output_8_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:362:1: (lv_output_8_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:362:1: (lv_output_8_0= ruleFullJvmFormalParameter )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:363:3: lv_output_8_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getOutputFullJvmFormalParameterParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleOperation749);
            lv_output_8_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationRule());
              	        }
                     		set(
                     			current, 
                     			"output",
                      		lv_output_8_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:379:2: ( (lv_body_9_0= ruleXBlockExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:380:1: (lv_body_9_0= ruleXBlockExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:380:1: (lv_body_9_0= ruleXBlockExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:381:3: lv_body_9_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getBodyXBlockExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleOperation770);
            lv_body_9_0=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_9_0, 
                      		"XBlockExpression");
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleXExpression"
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:405:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:406:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:407:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression806);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression816); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:414:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:417:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:419:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression862);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:435:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:436:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:437:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment896);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment906); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:444:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:447:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:448:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:448:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==23) ) {
                    alt8=1;
                }
                else if ( (LA8_1==EOF||(LA8_1>=RULE_STRING && LA8_1<=RULE_ID)||(LA8_1>=16 && LA8_1<=17)||(LA8_1>=19 && LA8_1<=21)||(LA8_1>=24 && LA8_1<=47)||(LA8_1>=49 && LA8_1<=74)) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_DECIMAL)||LA8_0==16||LA8_0==19||LA8_0==33||(LA8_0>=36 && LA8_0<=37)||LA8_0==42||LA8_0==47||LA8_0==51||LA8_0==53||(LA8_0>=57 && LA8_0<=59)||LA8_0==62||(LA8_0>=64 && LA8_0<=71)) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:448:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:448:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:448:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:448:3: ()
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:449:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:454:2: ( ( ruleValidID ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:455:1: ( ruleValidID )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:455:1: ( ruleValidID )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:456:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment964);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment980);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:477:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:478:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:478:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:479:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1000);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:496:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:496:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:497:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1030);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:505:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==24) ) {
                        int LA7_1 = input.LA(2);

                        if ( (synpred1_InternalHelloInferrer()) ) {
                            alt7=1;
                        }
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:505:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:505:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:505:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:510:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:510:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:510:7: ()
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:511:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:516:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:517:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:517:1: ( ruleOpMultiAssign )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:518:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1083);
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

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:531:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:532:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:532:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:533:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1106);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:557:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:558:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:559:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1146);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1157); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:566:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:569:28: (kw= '=' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:571:2: kw= '='
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleOpSingleAssign1194); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:584:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:585:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:586:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1234);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1245); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:593:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:596:28: (kw= '+=' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:598:2: kw= '+='
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpMultiAssign1282); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:611:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:612:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:613:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1321);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1331); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:620:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:623:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:624:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:624:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:625:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1378);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:633:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred2_InternalHelloInferrer()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:633:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:633:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:633:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:638:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:638:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:638:7: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:639:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:644:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:645:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:645:1: ( ruleOpOr )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:646:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1431);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:659:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:660:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:660:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:661:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1454);
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:685:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:686:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:687:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1493);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1504); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:694:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:697:28: (kw= '||' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:699:2: kw= '||'
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOr1541); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:712:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:713:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:714:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1580);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1590); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:721:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:724:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:725:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:725:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:726:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1637);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:734:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    int LA10_2 = input.LA(2);

                    if ( (synpred3_InternalHelloInferrer()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:734:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:734:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:734:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:739:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:739:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:739:7: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:740:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:745:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:746:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:746:1: ( ruleOpAnd )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:747:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1690);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:760:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:761:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:761:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:762:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1713);
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:786:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:787:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:788:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1752);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1763); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:795:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:798:28: (kw= '&&' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:800:2: kw= '&&'
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpAnd1800); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:813:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:814:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:815:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1839);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1849); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:822:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:825:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:826:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:826:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:827:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1896);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:835:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred4_InternalHelloInferrer()) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0==28) ) {
                    int LA11_3 = input.LA(2);

                    if ( (synpred4_InternalHelloInferrer()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:835:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:835:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:835:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:840:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:840:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:840:7: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:841:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:846:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:847:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:847:1: ( ruleOpEquality )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:848:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1949);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:861:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:862:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:862:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:863:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1972);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:887:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:888:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:889:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2011);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2022); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:896:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:899:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:900:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:900:1: (kw= '==' | kw= '!=' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            else if ( (LA12_0==28) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:901:2: kw= '=='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpEquality2060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:908:2: kw= '!='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpEquality2079); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:921:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:922:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:923:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2119);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2129); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:930:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:933:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:934:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:934:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:935:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2176);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:943:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop13:
            do {
                int alt13=3;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    int LA13_2 = input.LA(2);

                    if ( (synpred5_InternalHelloInferrer()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA13_3 = input.LA(2);

                    if ( (synpred6_InternalHelloInferrer()) ) {
                        alt13=2;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA13_4 = input.LA(2);

                    if ( (synpred6_InternalHelloInferrer()) ) {
                        alt13=2;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA13_5 = input.LA(2);

                    if ( (synpred6_InternalHelloInferrer()) ) {
                        alt13=2;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA13_6 = input.LA(2);

                    if ( (synpred6_InternalHelloInferrer()) ) {
                        alt13=2;
                    }


                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:943:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:943:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:943:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:943:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:943:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:945:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:945:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:945:6: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:946:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleXRelationalExpression2212); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:955:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:956:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:956:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:957:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2235);
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
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:974:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:974:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:974:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:974:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:974:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:979:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:979:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:979:7: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:980:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:985:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:986:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:986:1: ( ruleOpCompare )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:987:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2296);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1000:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1001:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1001:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1002:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2319);
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1026:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1027:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1028:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2359);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2370); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1035:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1038:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1039:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1039:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt14=1;
                }
                break;
            case 31:
                {
                alt14=2;
                }
                break;
            case 32:
                {
                alt14=3;
                }
                break;
            case 33:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1040:2: kw= '>='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpCompare2408); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1047:2: kw= '<='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpCompare2427); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1054:2: kw= '>'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpCompare2446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1061:2: kw= '<'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpCompare2465); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1074:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1075:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1076:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2505);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2515); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1083:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1086:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1087:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1087:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1088:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2562);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1096:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred7_InternalHelloInferrer()) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==35) ) {
                    int LA15_3 = input.LA(2);

                    if ( (synpred7_InternalHelloInferrer()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1096:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1096:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1096:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1101:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1101:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1101:7: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1102:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1107:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1108:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1108:1: ( ruleOpOther )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1109:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2615);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1122:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1123:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1123:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1124:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2638);
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1148:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1149:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1150:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2677);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2688); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1157:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1160:28: ( (kw= '->' | kw= '..' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1161:1: (kw= '->' | kw= '..' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1161:1: (kw= '->' | kw= '..' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            else if ( (LA16_0==35) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1162:2: kw= '->'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOther2726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1169:2: kw= '..'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther2745); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1182:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1183:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1184:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2785);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2795); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1191:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1194:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1195:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1195:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1196:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2842);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1204:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36) ) {
                    int LA17_2 = input.LA(2);

                    if ( (synpred8_InternalHelloInferrer()) ) {
                        alt17=1;
                    }


                }
                else if ( (LA17_0==37) ) {
                    int LA17_3 = input.LA(2);

                    if ( (synpred8_InternalHelloInferrer()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1204:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1204:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1204:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1209:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1209:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1209:7: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1210:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1215:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1216:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1216:1: ( ruleOpAdd )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1217:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2895);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1230:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1231:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1231:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1232:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2918);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1256:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1257:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1258:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2957);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2968); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1265:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1268:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1269:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1269:1: (kw= '+' | kw= '-' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            else if ( (LA18_0==37) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1270:2: kw= '+'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpAdd3006); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1277:2: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpAdd3025); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1290:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1291:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1292:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3065);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3075); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1299:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1302:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1303:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1303:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1304:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3122);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1312:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop19:
            do {
                int alt19=2;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    int LA19_2 = input.LA(2);

                    if ( (synpred9_InternalHelloInferrer()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA19_3 = input.LA(2);

                    if ( (synpred9_InternalHelloInferrer()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA19_4 = input.LA(2);

                    if ( (synpred9_InternalHelloInferrer()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA19_5 = input.LA(2);

                    if ( (synpred9_InternalHelloInferrer()) ) {
                        alt19=1;
                    }


                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1312:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1312:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1312:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1317:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1317:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1317:7: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1318:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1323:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1324:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1324:1: ( ruleOpMulti )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1325:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3175);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1338:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1339:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1339:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1340:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3198);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1364:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1365:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1366:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3237);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3248); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1373:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1376:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1377:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1377:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt20=1;
                }
                break;
            case 39:
                {
                alt20=2;
                }
                break;
            case 40:
                {
                alt20=3;
                }
                break;
            case 41:
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1378:2: kw= '*'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpMulti3286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1385:2: kw= '**'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpMulti3305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1392:2: kw= '/'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpMulti3324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1399:2: kw= '%'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpMulti3343); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1412:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1413:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1414:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3383);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3393); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1421:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1424:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1425:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1425:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=36 && LA21_0<=37)||LA21_0==42) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)||LA21_0==16||LA21_0==19||LA21_0==33||LA21_0==47||LA21_0==51||LA21_0==53||(LA21_0>=57 && LA21_0<=59)||LA21_0==62||(LA21_0>=64 && LA21_0<=71)) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1425:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1425:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1425:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1425:3: ()
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1426:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1431:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1432:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1432:1: ( ruleOpUnary )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1433:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3451);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1446:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1447:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1447:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1448:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3472);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1466:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3501);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1482:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1483:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1484:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3537);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3548); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1491:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1494:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1495:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1495:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt22=1;
                }
                break;
            case 37:
                {
                alt22=2;
                }
                break;
            case 36:
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1496:2: kw= '!'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpUnary3586); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1503:2: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpUnary3605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1510:2: kw= '+'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpUnary3624); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1523:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1524:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1525:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3664);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3674); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1532:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1535:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1536:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1536:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1537:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3721);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1545:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==43) ) {
                    int LA23_2 = input.LA(2);

                    if ( (synpred10_InternalHelloInferrer()) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1545:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1545:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1545:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1547:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1547:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1547:6: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1548:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXCastedExpression3756); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1557:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1558:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1558:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1559:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3779);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1583:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1584:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1585:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3817);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3827); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1592:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1595:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1596:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1596:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1597:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3874);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1605:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop31:
            do {
                int alt31=3;
                switch ( input.LA(1) ) {
                case 44:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred11_InternalHelloInferrer()) ) {
                        alt31=1;
                    }
                    else if ( (synpred12_InternalHelloInferrer()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (synpred12_InternalHelloInferrer()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA31_4 = input.LA(2);

                    if ( (synpred12_InternalHelloInferrer()) ) {
                        alt31=2;
                    }


                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1605:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1605:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1605:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1605:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1605:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1611:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1611:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1611:26: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1612:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall3923); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1621:1: ( ( ruleValidID ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1622:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1622:1: ( ruleValidID )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1623:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3946);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3962);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1644:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1645:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1645:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1646:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3984);
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
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1663:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1663:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1663:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1663:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1663:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1679:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1679:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1679:8: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1680:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1685:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt24=3;
            	    switch ( input.LA(1) ) {
            	    case 44:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 46:
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
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1685:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4070); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1690:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1690:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1691:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1691:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1692:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4094); if (state.failed) return current;
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
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1706:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1706:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1707:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1707:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1708:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4131); if (state.failed) return current;
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1721:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==33) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1721:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,33,FOLLOW_33_in_ruleXMemberFeatureCall4160); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1725:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1726:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1726:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1727:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4181);
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

            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1743:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop25:
            	            do {
            	                int alt25=2;
            	                int LA25_0 = input.LA(1);

            	                if ( (LA25_0==20) ) {
            	                    alt25=1;
            	                }


            	                switch (alt25) {
            	            	case 1 :
            	            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1743:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleXMemberFeatureCall4194); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1747:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1748:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1748:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1749:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4215);
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

            	            otherlv_14=(Token)match(input,32,FOLLOW_32_in_ruleXMemberFeatureCall4229); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1769:3: ( ( ruleValidID ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1770:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1770:1: ( ruleValidID )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1771:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4254);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1784:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt29=2;
            	    alt29 = dfa29.predict(input);
            	    switch (alt29) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1784:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1784:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1784:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1791:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1792:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,19,FOLLOW_19_in_ruleXMemberFeatureCall4288); if (state.failed) return current;
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

            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1805:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt28=3;
            	            alt28 = dfa28.predict(input);
            	            switch (alt28) {
            	                case 1 :
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1805:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1805:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1805:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1822:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1823:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4373);
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
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1840:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1840:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1840:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1840:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1841:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1841:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1842:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4401);
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

            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1858:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop27:
            	                    do {
            	                        int alt27=2;
            	                        int LA27_0 = input.LA(1);

            	                        if ( (LA27_0==20) ) {
            	                            alt27=1;
            	                        }


            	                        switch (alt27) {
            	                    	case 1 :
            	                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1858:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleXMemberFeatureCall4414); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1862:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1863:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1863:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1864:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4435);
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

            	            otherlv_21=(Token)match(input,21,FOLLOW_21_in_ruleXMemberFeatureCall4452); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1884:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt30=2;
            	    alt30 = dfa30.predict(input);
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1884:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1889:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1890:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4485);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1914:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1915:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1916:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4525);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4535); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1923:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1926:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1927:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1927:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt32=13;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt32=1;
                }
                break;
            case 16:
                {
                alt32=2;
                }
                break;
            case 53:
                {
                alt32=3;
                }
                break;
            case RULE_ID:
            case 33:
            case 62:
                {
                alt32=4;
                }
                break;
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 47:
            case 65:
            case 66:
            case 67:
            case 68:
                {
                alt32=5;
                }
                break;
            case 51:
                {
                alt32=6;
                }
                break;
            case 57:
                {
                alt32=7;
                }
                break;
            case 58:
                {
                alt32=8;
                }
                break;
            case 59:
                {
                alt32=9;
                }
                break;
            case 69:
                {
                alt32=10;
                }
                break;
            case 70:
                {
                alt32=11;
                }
                break;
            case 71:
                {
                alt32=12;
                }
                break;
            case 19:
                {
                alt32=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1928:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4582);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1938:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4609);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1948:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4636);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1958:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4663);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1968:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4690);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1978:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4717);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1988:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4744);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1998:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4771);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2008:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4798);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2018:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4825);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2028:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4852);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2038:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4879);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2048:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4906);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2064:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2065:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2066:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4941);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4951); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2073:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2076:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2077:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2077:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt33=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt33=1;
                }
                break;
            case 65:
            case 66:
                {
                alt33=2;
                }
                break;
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt33=3;
                }
                break;
            case 67:
                {
                alt33=4;
                }
                break;
            case RULE_STRING:
                {
                alt33=5;
                }
                break;
            case 68:
                {
                alt33=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2078:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4998);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2088:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5025);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2098:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5052);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2108:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5079);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2118:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5106);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2128:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5133);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2144:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2145:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2146:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5168);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5178); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2153:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2156:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2157:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2157:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2157:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2157:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2158:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleXClosure5224); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2167:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2167:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2182:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2182:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2182:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID||LA35_0==19||LA35_0==74) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2182:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2182:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2183:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2183:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2184:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5295);
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

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2200:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==20) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2200:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleXClosure5308); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2204:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2205:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2205:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2206:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5329);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2222:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2223:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2223:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2224:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,48,FOLLOW_48_in_ruleXClosure5351); if (state.failed) return current;
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2237:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2238:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2238:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2239:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5388);
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

            otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleXClosure5400); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2267:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2268:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2269:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5436);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5446); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2276:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2279:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2280:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2280:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2280:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2280:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2281:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2286:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_ID)||LA38_0==16||LA38_0==19||LA38_0==33||(LA38_0>=36 && LA38_0<=37)||LA38_0==42||LA38_0==47||LA38_0==51||LA38_0==53||(LA38_0>=57 && LA38_0<=62)||(LA38_0>=64 && LA38_0<=71)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2286:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2286:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2287:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2287:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2288:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5502);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2304:2: (otherlv_2= ';' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==50) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2304:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXExpressionInClosure5515); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2316:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2317:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2318:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5555);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5565); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2325:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2328:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2329:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2329:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2329:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2329:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2329:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2345:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2345:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2345:7: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2346:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2351:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||LA40_0==19||LA40_0==74) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2351:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2351:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2352:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2352:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2353:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5673);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2369:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==20) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2369:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleXShortClosure5686); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2373:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2374:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2374:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2375:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5707);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2391:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2392:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2392:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2393:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,48,FOLLOW_48_in_ruleXShortClosure5729); if (state.failed) return current;
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2406:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2407:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2407:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2408:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5765);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2432:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2433:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2434:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5801);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5811); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2441:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2444:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2445:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2445:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2445:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleXParenthesizedExpression5848); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5870);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXParenthesizedExpression5881); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2470:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2471:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2472:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5917);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5927); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2479:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2482:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2483:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2483:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2483:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2483:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2484:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXIfExpression5973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXIfExpression5985); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2497:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2498:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2498:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2499:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6006);
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

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXIfExpression6018); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2519:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2520:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2520:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2521:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6039);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2537:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==52) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred18_InternalHelloInferrer()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2537:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2537:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2537:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,52,FOLLOW_52_in_ruleXIfExpression6060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2542:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2543:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2543:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2544:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6082);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2568:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2569:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2570:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6120);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6130); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2577:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2580:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2581:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2581:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2581:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2581:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2582:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6176); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2591:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_ID)||LA43_0==16||LA43_0==33||(LA43_0>=36 && LA43_0<=37)||LA43_0==42||LA43_0==47||LA43_0==51||LA43_0==53||(LA43_0>=57 && LA43_0<=59)||LA43_0==62||(LA43_0>=64 && LA43_0<=71)) ) {
                alt43=1;
            }
            else if ( (LA43_0==19) ) {
                int LA43_2 = input.LA(2);

                if ( (LA43_2==RULE_ID) ) {
                    int LA43_3 = input.LA(3);

                    if ( (LA43_3==19||LA43_3==21||(LA43_3>=23 && LA43_3<=41)||(LA43_3>=43 && LA43_3<=47)||LA43_3==63) ) {
                        alt43=1;
                    }
                    else if ( (LA43_3==54) && (synpred20_InternalHelloInferrer())) {
                        alt43=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA43_2>=RULE_STRING && LA43_2<=RULE_DECIMAL)||LA43_2==16||LA43_2==19||LA43_2==33||(LA43_2>=36 && LA43_2<=37)||LA43_2==42||LA43_2==47||LA43_2==51||LA43_2==53||(LA43_2>=57 && LA43_2<=59)||LA43_2==62||(LA43_2>=64 && LA43_2<=71)) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2591:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2591:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2591:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2591:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_ID) ) {
                        int LA42_1 = input.LA(2);

                        if ( (LA42_1==54) && (synpred19_InternalHelloInferrer())) {
                            alt42=1;
                        }
                    }
                    switch (alt42) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2591:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2596:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2596:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2596:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2597:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2597:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2598:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6219);
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

                            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6231); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2618:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2619:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2619:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2620:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6255);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2637:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2637:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2637:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2637:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2637:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2643:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2643:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleXSwitchExpression6299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2647:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2648:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2648:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2649:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6320);
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

                    otherlv_7=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2669:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2670:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2670:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2671:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6355);
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

                    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleXSwitchExpression6367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleXSwitchExpression6381); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2695:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID||LA44_0==19||LA44_0==54||LA44_0==56||LA44_0==74) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2696:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2696:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2697:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6402);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2713:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==55) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2713:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6416); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2721:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2722:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2722:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2723:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6449);
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

            otherlv_15=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression6463); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2751:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2752:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2753:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6499);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6509); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2760:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2763:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2764:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2764:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2764:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2764:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==19||LA46_0==74) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2765:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2765:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2766:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6555);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2782:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==56) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2782:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXCasePart6569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2786:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2787:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2787:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2788:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6590);
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

            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXCasePart6604); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2808:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2809:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2809:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2810:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6625);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2834:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2835:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2836:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6661);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6671); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2843:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2846:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2847:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2847:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2847:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2847:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2848:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXForLoopExpression6717); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXForLoopExpression6729); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2861:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2862:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2862:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2863:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6750);
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

            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleXForLoopExpression6762); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2883:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2884:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2884:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2885:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6783);
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

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleXForLoopExpression6795); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2905:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2906:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2906:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2907:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6816);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2931:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2932:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2933:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6852);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6862); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2940:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2943:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2944:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2944:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2944:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2944:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2945:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXWhileExpression6908); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXWhileExpression6920); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2958:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2959:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2959:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2960:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6941);
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

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXWhileExpression6953); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2980:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2981:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2981:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2982:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6974);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3006:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3007:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3008:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7010);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7020); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3015:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3018:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3019:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3019:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3019:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3019:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3020:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXDoWhileExpression7066); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3029:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3030:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3030:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3031:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7087);
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

            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleXDoWhileExpression7099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleXDoWhileExpression7111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3055:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3056:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3056:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3057:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7132);
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

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleXDoWhileExpression7144); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3085:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3086:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3087:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7180);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7190); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3094:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3097:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3098:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3098:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3098:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3098:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3099:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleXBlockExpression7236); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3108:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_ID)||LA49_0==16||LA49_0==19||LA49_0==33||(LA49_0>=36 && LA49_0<=37)||LA49_0==42||LA49_0==47||LA49_0==51||LA49_0==53||(LA49_0>=57 && LA49_0<=62)||(LA49_0>=64 && LA49_0<=71)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3108:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3108:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3109:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3109:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3110:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7258);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3126:2: (otherlv_3= ';' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==50) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3126:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleXBlockExpression7271); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleXBlockExpression7287); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3142:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3143:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3144:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7323);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7333); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3151:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3154:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3155:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3155:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=60 && LA50_0<=61)) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=RULE_STRING && LA50_0<=RULE_ID)||LA50_0==16||LA50_0==19||LA50_0==33||(LA50_0>=36 && LA50_0<=37)||LA50_0==42||LA50_0==47||LA50_0==51||LA50_0==53||(LA50_0>=57 && LA50_0<=59)||LA50_0==62||(LA50_0>=64 && LA50_0<=71)) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3156:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7380);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3166:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7407);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3182:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3183:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3184:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7442);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7452); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3191:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3194:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3195:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3195:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3195:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3195:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3196:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3201:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==60) ) {
                alt51=1;
            }
            else if ( (LA51_0==61) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3201:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3201:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3202:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3202:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3203:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,60,FOLLOW_60_in_ruleXVariableDeclaration7505); if (state.failed) return current;
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3217:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleXVariableDeclaration7536); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3221:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (synpred21_InternalHelloInferrer()) ) {
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
            else if ( (LA52_0==19) && (synpred21_InternalHelloInferrer())) {
                alt52=1;
            }
            else if ( (LA52_0==74) && (synpred21_InternalHelloInferrer())) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3221:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3221:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3221:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3229:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3229:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3229:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3230:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3230:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3231:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7584);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3247:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3248:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3248:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3249:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7605);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3266:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3266:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3267:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3267:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3268:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7634);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3284:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==23) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3284:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleXVariableDeclaration7648); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3288:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3289:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3289:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3290:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7669);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3314:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3315:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3316:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7707);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7717); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3323:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3326:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3327:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3327:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3327:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3327:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==RULE_ID||LA54_1==33||LA54_1==44||LA54_1==47) ) {
                    alt54=1;
                }
            }
            else if ( (LA54_0==19||LA54_0==74) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3328:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3328:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3329:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7763);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3345:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3346:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3346:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3347:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7785);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3371:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3372:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3373:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7821);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7831); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3380:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3383:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3384:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3384:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3384:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3384:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3385:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3385:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3386:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7877);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3402:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3403:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3403:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3404:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7898);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3428:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3429:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3430:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7934);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7944); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3437:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3440:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3441:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3441:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3441:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3441:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3442:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3447:2: ( ( ruleStaticQualifier ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==63) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3448:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3448:1: ( ruleStaticQualifier )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3449:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8001);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3462:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==33) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3462:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleXFeatureCall8015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3466:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3467:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3467:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3468:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8036);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3484:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==20) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3484:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleXFeatureCall8049); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3488:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3489:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3489:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3490:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8070);
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

                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleXFeatureCall8084); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3510:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3511:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3511:1: ( ruleIdOrSuper )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3512:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8109);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3525:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3525:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3525:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3525:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3532:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3533:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,19,FOLLOW_19_in_ruleXFeatureCall8143); if (state.failed) return current;
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3546:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt59=3;
                    alt59 = dfa59.predict(input);
                    switch (alt59) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3546:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3546:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3546:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3563:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3564:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8228);
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
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3581:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3581:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3581:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3581:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3582:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3582:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3583:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8256);
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

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3599:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==20) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3599:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleXFeatureCall8269); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3603:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3604:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3604:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3605:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8290);
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

                    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleXFeatureCall8307); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3625:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3625:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3630:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3631:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8340);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3655:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3656:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3657:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8378);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8389); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3664:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3667:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3668:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3668:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            else if ( (LA62_0==62) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3669:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8436);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3681:2: kw= 'super'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleIdOrSuper8460); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3694:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3695:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3696:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8501);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8512); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3703:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3706:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3707:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3707:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_ID) ) {
                    int LA63_2 = input.LA(2);

                    if ( (LA63_2==63) ) {
                        alt63=1;
                    }


                }


                switch (alt63) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3708:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8559);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,63,FOLLOW_63_in_ruleStaticQualifier8577); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3732:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3733:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3734:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8618);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8628); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3741:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3744:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3745:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3745:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3745:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3745:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3746:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXConstructorCall8674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3755:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3756:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3756:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3757:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8697);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3770:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3770:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3770:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3770:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleXConstructorCall8718); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3775:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3776:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3776:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3777:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8740);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3793:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==20) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3793:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleXConstructorCall8753); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3797:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3798:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3798:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3799:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8774);
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

                    otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleXConstructorCall8788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3819:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3819:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3819:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3819:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleXConstructorCall8811); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3824:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt67=3;
                    alt67 = dfa67.predict(input);
                    switch (alt67) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3824:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3824:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3824:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3841:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3842:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8884);
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
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3859:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3859:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3859:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3859:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3860:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3860:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3861:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8912);
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

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3877:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop66:
                            do {
                                int alt66=2;
                                int LA66_0 = input.LA(1);

                                if ( (LA66_0==20) ) {
                                    alt66=1;
                                }


                                switch (alt66) {
                            	case 1 :
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3877:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleXConstructorCall8925); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3881:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3882:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3882:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3883:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8946);
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

                    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleXConstructorCall8963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3903:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3903:4: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3908:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3909:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall8996);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3933:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3934:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3935:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9033);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9043); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3942:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3945:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3946:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3946:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3946:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3946:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3947:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3952:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==65) ) {
                alt70=1;
            }
            else if ( (LA70_0==66) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3952:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXBooleanLiteral9090); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3957:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3957:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3958:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3958:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3959:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,66,FOLLOW_66_in_ruleXBooleanLiteral9114); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3980:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3981:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3982:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9164);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9174); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3989:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3992:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3993:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3993:1: ( () otherlv_1= 'null' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3993:2: () otherlv_1= 'null'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3993:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3994:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXNullLiteral9220); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4011:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4012:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4013:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9256);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9266); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4020:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4023:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4024:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4024:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4024:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4024:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4025:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4030:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4031:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4031:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4032:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9321);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4056:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4057:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4058:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9357);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9367); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4065:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4068:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4069:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4069:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4069:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4069:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4070:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4075:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4076:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4076:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4077:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9418); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4101:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4102:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4103:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9459);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9469); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4110:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4113:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4114:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4114:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4114:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4114:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4115:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXTypeLiteral9515); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXTypeLiteral9527); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4128:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4129:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4129:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4130:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9550);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXTypeLiteral9562); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4155:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4156:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4157:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9598);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9608); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4164:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4167:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4168:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4168:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4168:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4168:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4169:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXThrowExpression9654); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4178:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4179:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4179:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4180:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9675);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4204:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4205:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4206:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9711);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9721); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4213:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4216:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4217:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4217:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4217:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4217:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4218:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXReturnExpression9767); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4227:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4227:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4232:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4233:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9798);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4257:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4258:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4259:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9835);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9845); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4266:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4269:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4270:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4270:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4270:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4270:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4271:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression9891); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4280:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4281:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4281:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4282:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9912);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4298:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==73) ) {
                alt74=1;
            }
            else if ( (LA74_0==72) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4298:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4298:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4298:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4298:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt72=0;
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==73) ) {
                            int LA72_2 = input.LA(2);

                            if ( (synpred30_InternalHelloInferrer()) ) {
                                alt72=1;
                            }


                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4298:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4300:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4301:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9942);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4317:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==72) ) {
                        int LA73_1 = input.LA(2);

                        if ( (synpred31_InternalHelloInferrer()) ) {
                            alt73=1;
                        }
                    }
                    switch (alt73) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4317:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4317:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4317:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,72,FOLLOW_72_in_ruleXTryCatchFinallyExpression9964); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4322:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4323:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4323:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4324:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9986);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4341:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4341:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4341:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,72,FOLLOW_72_in_ruleXTryCatchFinallyExpression10008); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4345:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4346:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4346:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4347:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10029);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4371:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4372:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4373:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10067);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10077); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4380:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4383:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4384:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4384:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4384:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4384:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4384:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleXCatchClause10122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleXCatchClause10135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4393:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4394:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4394:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4395:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10156);
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

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleXCatchClause10168); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4415:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4416:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4416:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4417:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10189);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4441:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4442:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4443:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10226);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10237); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4450:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4453:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4454:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4454:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4455:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10284);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4465:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==44) ) {
                    int LA75_2 = input.LA(2);

                    if ( (LA75_2==RULE_ID) ) {
                        int LA75_3 = input.LA(3);

                        if ( (synpred33_InternalHelloInferrer()) ) {
                            alt75=1;
                        }


                    }


                }


                switch (alt75) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4465:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4465:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4465:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,44,FOLLOW_44_in_ruleQualifiedName10312); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10335);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4492:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4496:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4497:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10389);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10400); if (state.failed) return current;

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4507:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4511:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4512:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4512:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4512:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10444); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4520:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4520:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4520:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4520:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
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
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4520:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10472); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4528:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10498); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4535:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==44) ) {
                        int LA78_1 = input.LA(2);

                        if ( ((LA78_1>=RULE_INT && LA78_1<=RULE_DECIMAL)) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4536:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,44,FOLLOW_44_in_ruleNumber10518); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4541:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
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
                                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4541:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10534); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4549:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10560); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4567:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4568:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4569:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10613);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10623); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4576:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4579:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4580:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4580:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID) ) {
                alt81=1;
            }
            else if ( (LA81_0==19||LA81_0==74) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4580:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4580:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4581:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10671);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4589:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==47) ) {
                            int LA80_2 = input.LA(2);

                            if ( (LA80_2==49) ) {
                                int LA80_3 = input.LA(3);

                                if ( (synpred34_InternalHelloInferrer()) ) {
                                    alt80=1;
                                }


                            }


                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4589:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4592:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4592:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4592:6: ()
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4593:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleJvmTypeReference10709); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleJvmTypeReference10721); if (state.failed) return current;
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4608:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10753);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4624:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4625:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4626:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10788);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10798); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4633:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4636:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4637:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4637:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4637:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4637:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==19) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4637:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleXFunctionTypeRef10836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4641:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==RULE_ID||LA83_0==19||LA83_0==74) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4641:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4641:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4642:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4642:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4643:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10858);
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

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4659:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop82:
                            do {
                                int alt82=2;
                                int LA82_0 = input.LA(1);

                                if ( (LA82_0==20) ) {
                                    alt82=1;
                                }


                                switch (alt82) {
                            	case 1 :
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4659:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleXFunctionTypeRef10871); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4663:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4664:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4664:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4665:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10892);
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

                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXFunctionTypeRef10908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,74,FOLLOW_74_in_ruleXFunctionTypeRef10922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4689:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4690:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4690:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4691:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10943);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4715:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4716:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4717:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10979);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10989); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4724:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4727:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4728:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4728:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4728:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4728:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4729:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4729:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4730:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11037);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4743:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt86=2;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4743:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4743:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4743:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleJvmParameterizedTypeReference11058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4748:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4749:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4749:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4750:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11080);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4766:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==20) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4766:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleJvmParameterizedTypeReference11093); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4770:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4771:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4771:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4772:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11114);
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

                    otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleJvmParameterizedTypeReference11128); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4800:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4801:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4802:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11166);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11176); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4809:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4812:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4813:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4813:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_ID||LA87_0==19||LA87_0==74) ) {
                alt87=1;
            }
            else if ( (LA87_0==75) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4814:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11223);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4824:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11250);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4840:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4841:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4842:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11285);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11295); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4849:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4852:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4853:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4853:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4853:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4853:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4854:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleJvmWildcardTypeReference11341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4863:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt88=3;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==76) ) {
                alt88=1;
            }
            else if ( (LA88_0==62) ) {
                alt88=2;
            }
            switch (alt88) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4863:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4863:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4864:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4864:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4865:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11363);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4882:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4882:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4883:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4883:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4884:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11390);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4908:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4909:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4910:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11428);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11438); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4917:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4920:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4921:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4921:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4921:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleJvmUpperBound11475); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4925:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4926:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4926:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4927:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11496);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4951:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4952:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4953:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11532);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11542); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4960:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4963:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4964:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4964:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4964:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleJvmUpperBoundAnded11579); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4968:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4969:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4969:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4970:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11600);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4994:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4995:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4996:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11636);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11646); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5003:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5006:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5007:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5007:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5007:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleJvmLowerBound11683); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5011:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5012:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5012:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5013:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11704);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5039:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5040:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5041:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11743);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11754); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5048:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5051:28: (this_ID_0= RULE_ID )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5052:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11793); if (state.failed) return current;
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
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:505:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:505:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:505:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:505:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:505:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:506:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:506:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:507:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:507:1: ( ruleOpMultiAssign )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:508:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloInferrer1051);
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
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:633:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:633:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:633:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:633:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:633:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:634:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:634:2: ( ( ruleOpOr ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:635:1: ( ruleOpOr )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:635:1: ( ruleOpOr )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:636:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalHelloInferrer1399);
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
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:734:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:734:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:734:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:734:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:734:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:735:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:735:2: ( ( ruleOpAnd ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:736:1: ( ruleOpAnd )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:736:1: ( ruleOpAnd )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:737:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalHelloInferrer1658);
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
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:835:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:835:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:835:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:835:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:835:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:836:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:836:2: ( ( ruleOpEquality ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:837:1: ( ruleOpEquality )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:837:1: ( ruleOpEquality )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:838:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalHelloInferrer1917);
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
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:943:4: ( ( () 'instanceof' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:943:5: ( () 'instanceof' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:943:5: ( () 'instanceof' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:943:6: () 'instanceof'
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:943:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:944:1: 
        {
        }

        match(input,29,FOLLOW_29_in_synpred5_InternalHelloInferrer2193); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalHelloInferrer

    // $ANTLR start synpred6_InternalHelloInferrer
    public final void synpred6_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:974:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:974:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:974:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:974:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:974:10: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:975:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:975:2: ( ( ruleOpCompare ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:976:1: ( ruleOpCompare )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:976:1: ( ruleOpCompare )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:977:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalHelloInferrer2264);
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
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1096:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1096:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1096:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1096:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1096:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1097:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1097:2: ( ( ruleOpOther ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1098:1: ( ruleOpOther )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1098:1: ( ruleOpOther )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1099:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalHelloInferrer2583);
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
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1204:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1204:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1204:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1204:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1204:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1205:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1205:2: ( ( ruleOpAdd ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1206:1: ( ruleOpAdd )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1206:1: ( ruleOpAdd )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1207:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalHelloInferrer2863);
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
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1312:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1312:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1312:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1312:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1312:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1313:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1313:2: ( ( ruleOpMulti ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1314:1: ( ruleOpMulti )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1314:1: ( ruleOpMulti )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1315:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalHelloInferrer3143);
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
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1545:3: ( ( () 'as' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1545:4: ( () 'as' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1545:4: ( () 'as' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1545:5: () 'as'
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1545:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1546:1: 
        {
        }

        match(input,43,FOLLOW_43_in_synpred10_InternalHelloInferrer3737); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalHelloInferrer

    // $ANTLR start synpred11_InternalHelloInferrer
    public final void synpred11_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1605:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1605:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1605:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1605:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1605:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1606:1: 
        {
        }

        match(input,44,FOLLOW_44_in_synpred11_InternalHelloInferrer3891); if (state.failed) return ;
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1607:1: ( ( ruleValidID ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1608:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1608:1: ( ruleValidID )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1609:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalHelloInferrer3900);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalHelloInferrer3906);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalHelloInferrer

    // $ANTLR start synpred12_InternalHelloInferrer
    public final void synpred12_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1663:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1663:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1663:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1663:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1663:10: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1664:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1664:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt89=3;
        switch ( input.LA(1) ) {
        case 44:
            {
            alt89=1;
            }
            break;
        case 45:
            {
            alt89=2;
            }
            break;
        case 46:
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
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1664:4: '.'
                {
                match(input,44,FOLLOW_44_in_synpred12_InternalHelloInferrer4009); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1666:6: ( ( '?.' ) )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1666:6: ( ( '?.' ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1667:1: ( '?.' )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1667:1: ( '?.' )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1668:2: '?.'
                {
                match(input,45,FOLLOW_45_in_synpred12_InternalHelloInferrer4023); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1673:6: ( ( '*.' ) )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1673:6: ( ( '*.' ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1674:1: ( '*.' )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1674:1: ( '*.' )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1675:2: '*.'
                {
                match(input,46,FOLLOW_46_in_synpred12_InternalHelloInferrer4043); if (state.failed) return ;

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
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1784:4: ( ( '(' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1785:1: ( '(' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1785:1: ( '(' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1786:2: '('
        {
        match(input,19,FOLLOW_19_in_synpred13_InternalHelloInferrer4270); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalHelloInferrer

    // $ANTLR start synpred14_InternalHelloInferrer
    public final void synpred14_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1805:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1805:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1805:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1805:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1805:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1806:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1806:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt91=2;
        int LA91_0 = input.LA(1);

        if ( (LA91_0==RULE_ID||LA91_0==19||LA91_0==74) ) {
            alt91=1;
        }
        switch (alt91) {
            case 1 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1806:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1806:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1807:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1807:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1808:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloInferrer4322);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1810:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop90:
                do {
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==20) ) {
                        alt90=1;
                    }


                    switch (alt90) {
                	case 1 :
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1810:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred14_InternalHelloInferrer4329); if (state.failed) return ;
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1811:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1812:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1812:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1813:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloInferrer4336);
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

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1815:6: ( ( '|' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1816:1: ( '|' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1816:1: ( '|' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1817:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred14_InternalHelloInferrer4350); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalHelloInferrer

    // $ANTLR start synpred15_InternalHelloInferrer
    public final void synpred15_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1884:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1885:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1885:1: ( ruleXClosure )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1886:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalHelloInferrer4468);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalHelloInferrer

    // $ANTLR start synpred16_InternalHelloInferrer
    public final void synpred16_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2167:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2167:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2167:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2167:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2167:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt93=2;
        int LA93_0 = input.LA(1);

        if ( (LA93_0==RULE_ID||LA93_0==19||LA93_0==74) ) {
            alt93=1;
        }
        switch (alt93) {
            case 1 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2167:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2167:5: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2168:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2168:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2169:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloInferrer5241);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2171:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop92:
                do {
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==20) ) {
                        alt92=1;
                    }


                    switch (alt92) {
                	case 1 :
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2171:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred16_InternalHelloInferrer5248); if (state.failed) return ;
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2172:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2173:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2173:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2174:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloInferrer5255);
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

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2176:6: ( ( '|' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2177:1: ( '|' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2177:1: ( '|' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2178:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred16_InternalHelloInferrer5269); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalHelloInferrer

    // $ANTLR start synpred18_InternalHelloInferrer
    public final void synpred18_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2537:4: ( 'else' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2537:6: 'else'
        {
        match(input,52,FOLLOW_52_in_synpred18_InternalHelloInferrer6052); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalHelloInferrer

    // $ANTLR start synpred19_InternalHelloInferrer
    public final void synpred19_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2591:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2591:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2591:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2591:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2591:6: ( ( ruleValidID ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2592:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2592:1: ( ruleValidID )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2593:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalHelloInferrer6194);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,54,FOLLOW_54_in_synpred19_InternalHelloInferrer6200); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalHelloInferrer

    // $ANTLR start synpred20_InternalHelloInferrer
    public final void synpred20_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2637:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2637:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2637:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2637:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,19,FOLLOW_19_in_synpred20_InternalHelloInferrer6276); if (state.failed) return ;
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2638:1: ( ( ruleValidID ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2639:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2639:1: ( ruleValidID )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2640:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalHelloInferrer6283);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,54,FOLLOW_54_in_synpred20_InternalHelloInferrer6289); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalHelloInferrer

    // $ANTLR start synpred21_InternalHelloInferrer
    public final void synpred21_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3221:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3221:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3221:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3221:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3221:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3222:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3222:1: ( ruleJvmTypeReference )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3223:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred21_InternalHelloInferrer7554);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3225:2: ( ( ruleValidID ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3226:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3226:1: ( ruleValidID )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3227:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred21_InternalHelloInferrer7563);
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
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3525:4: ( ( '(' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3526:1: ( '(' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3526:1: ( '(' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3527:2: '('
        {
        match(input,19,FOLLOW_19_in_synpred22_InternalHelloInferrer8125); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred22_InternalHelloInferrer

    // $ANTLR start synpred23_InternalHelloInferrer
    public final void synpred23_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3546:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3546:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3546:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3546:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3546:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3547:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3547:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==RULE_ID||LA97_0==19||LA97_0==74) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3547:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3547:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3548:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3548:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3549:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalHelloInferrer8177);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3551:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop96:
                do {
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==20) ) {
                        alt96=1;
                    }


                    switch (alt96) {
                	case 1 :
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3551:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred23_InternalHelloInferrer8184); if (state.failed) return ;
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3552:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3553:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3553:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3554:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalHelloInferrer8191);
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

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3556:6: ( ( '|' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3557:1: ( '|' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3557:1: ( '|' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3558:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred23_InternalHelloInferrer8205); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred23_InternalHelloInferrer

    // $ANTLR start synpred24_InternalHelloInferrer
    public final void synpred24_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3625:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3626:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3626:1: ( ruleXClosure )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3627:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred24_InternalHelloInferrer8323);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalHelloInferrer

    // $ANTLR start synpred25_InternalHelloInferrer
    public final void synpred25_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3770:4: ( '<' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3770:6: '<'
        {
        match(input,33,FOLLOW_33_in_synpred25_InternalHelloInferrer8710); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalHelloInferrer

    // $ANTLR start synpred26_InternalHelloInferrer
    public final void synpred26_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3819:5: ( '(' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3819:7: '('
        {
        match(input,19,FOLLOW_19_in_synpred26_InternalHelloInferrer8803); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalHelloInferrer

    // $ANTLR start synpred27_InternalHelloInferrer
    public final void synpred27_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3824:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3824:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3824:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3824:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3824:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3825:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3825:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==RULE_ID||LA99_0==19||LA99_0==74) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3825:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3825:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3826:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3826:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3827:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloInferrer8833);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3829:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop98:
                do {
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==20) ) {
                        alt98=1;
                    }


                    switch (alt98) {
                	case 1 :
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3829:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred27_InternalHelloInferrer8840); if (state.failed) return ;
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3830:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3831:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3831:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3832:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloInferrer8847);
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

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3834:6: ( ( '|' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3835:1: ( '|' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3835:1: ( '|' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3836:2: '|'
        {
        match(input,48,FOLLOW_48_in_synpred27_InternalHelloInferrer8861); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalHelloInferrer

    // $ANTLR start synpred28_InternalHelloInferrer
    public final void synpred28_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3903:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3904:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3904:1: ( ruleXClosure )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3905:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred28_InternalHelloInferrer8979);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalHelloInferrer

    // $ANTLR start synpred29_InternalHelloInferrer
    public final void synpred29_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4227:2: ( ( ruleXExpression ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4228:1: ( ruleXExpression )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4228:1: ( ruleXExpression )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4229:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred29_InternalHelloInferrer9781);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred29_InternalHelloInferrer

    // $ANTLR start synpred30_InternalHelloInferrer
    public final void synpred30_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4298:5: ( 'catch' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4298:7: 'catch'
        {
        match(input,73,FOLLOW_73_in_synpred30_InternalHelloInferrer9926); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalHelloInferrer

    // $ANTLR start synpred31_InternalHelloInferrer
    public final void synpred31_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4317:5: ( 'finally' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4317:7: 'finally'
        {
        match(input,72,FOLLOW_72_in_synpred31_InternalHelloInferrer9956); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalHelloInferrer

    // $ANTLR start synpred33_InternalHelloInferrer
    public final void synpred33_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4465:3: ( '.' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4466:2: '.'
        {
        match(input,44,FOLLOW_44_in_synpred33_InternalHelloInferrer10303); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalHelloInferrer

    // $ANTLR start synpred34_InternalHelloInferrer
    public final void synpred34_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4589:2: ( ( () '[' ']' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4589:3: ( () '[' ']' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4589:3: ( () '[' ']' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4589:4: () '[' ']'
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4589:4: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4590:1: 
        {
        }

        match(input,47,FOLLOW_47_in_synpred34_InternalHelloInferrer10686); if (state.failed) return ;
        match(input,49,FOLLOW_49_in_synpred34_InternalHelloInferrer10690); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred34_InternalHelloInferrer

    // $ANTLR start synpred35_InternalHelloInferrer
    public final void synpred35_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4743:4: ( '<' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4743:6: '<'
        {
        match(input,33,FOLLOW_33_in_synpred35_InternalHelloInferrer11050); if (state.failed) return ;

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


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA30 dfa30 = new DFA30(this);
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
    static final String DFA29_eotS =
        "\76\uffff";
    static final String DFA29_eofS =
        "\1\2\75\uffff";
    static final String DFA29_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA29_maxS =
        "\1\112\1\0\74\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA29_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA29_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\1\2\2\2\uffff\30\2\1\uffff\16\2\1"+
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
            return "1784:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
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
                        if ( (synpred13_InternalHelloInferrer()) ) {s = 61;}

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
            "\4\5\1\1\7\uffff\1\5\2\uffff\1\2\1\uffff\1\35\13\uffff\1\5\2"+
            "\uffff\2\5\4\uffff\1\5\4\uffff\1\5\1\4\2\uffff\1\5\1\uffff\1"+
            "\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "1805:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA28_0==19) ) {s = 2;}

                        else if ( (LA28_0==74) && (synpred14_InternalHelloInferrer())) {s = 3;}

                        else if ( (LA28_0==48) && (synpred14_InternalHelloInferrer())) {s = 4;}

                        else if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_DECIMAL)||LA28_0==16||LA28_0==33||(LA28_0>=36 && LA28_0<=37)||LA28_0==42||LA28_0==47||LA28_0==51||LA28_0==53||(LA28_0>=57 && LA28_0<=59)||LA28_0==62||(LA28_0>=64 && LA28_0<=71)) ) {s = 5;}

                        else if ( (LA28_0==21) ) {s = 29;}

                         
                        input.seek(index28_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalHelloInferrer()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalHelloInferrer()) ) {s = 4;}

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
        "\76\uffff";
    static final String DFA30_eofS =
        "\1\2\75\uffff";
    static final String DFA30_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA30_maxS =
        "\1\112\1\0\74\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA30_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA30_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\3\2\2\uffff\27\2\1\1\1\uffff\16\2\1"+
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
            return "1884:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
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
                        if ( (synpred15_InternalHelloInferrer()) ) {s = 61;}

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
            "\4\5\1\1\7\uffff\1\5\2\uffff\1\2\15\uffff\1\5\2\uffff\2\5\4"+
            "\uffff\1\5\4\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff"+
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
            return "2167:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
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

                        else if ( (LA36_0==19) ) {s = 2;}

                        else if ( (LA36_0==74) && (synpred16_InternalHelloInferrer())) {s = 3;}

                        else if ( (LA36_0==48) && (synpred16_InternalHelloInferrer())) {s = 4;}

                        else if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_DECIMAL)||LA36_0==16||LA36_0==33||(LA36_0>=36 && LA36_0<=37)||LA36_0==42||LA36_0==47||LA36_0==49||LA36_0==51||LA36_0==53||(LA36_0>=57 && LA36_0<=62)||(LA36_0>=64 && LA36_0<=71)) ) {s = 5;}

                         
                        input.seek(index36_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloInferrer()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index36_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_2 = input.LA(1);

                         
                        int index36_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloInferrer()) ) {s = 4;}

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
        "\76\uffff";
    static final String DFA60_eofS =
        "\1\2\75\uffff";
    static final String DFA60_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA60_maxS =
        "\1\112\1\0\74\uffff";
    static final String DFA60_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA60_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA60_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\1\2\2\2\uffff\30\2\1\uffff\16\2\1"+
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
            return "3525:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred22_InternalHelloInferrer()) ) {s = 61;}

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
            "\4\5\1\1\7\uffff\1\5\2\uffff\1\2\1\uffff\1\35\13\uffff\1\5\2"+
            "\uffff\2\5\4\uffff\1\5\4\uffff\1\5\1\4\2\uffff\1\5\1\uffff\1"+
            "\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "3546:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA59_0==19) ) {s = 2;}

                        else if ( (LA59_0==74) && (synpred23_InternalHelloInferrer())) {s = 3;}

                        else if ( (LA59_0==48) && (synpred23_InternalHelloInferrer())) {s = 4;}

                        else if ( ((LA59_0>=RULE_STRING && LA59_0<=RULE_DECIMAL)||LA59_0==16||LA59_0==33||(LA59_0>=36 && LA59_0<=37)||LA59_0==42||LA59_0==47||LA59_0==51||LA59_0==53||(LA59_0>=57 && LA59_0<=59)||LA59_0==62||(LA59_0>=64 && LA59_0<=71)) ) {s = 5;}

                        else if ( (LA59_0==21) ) {s = 29;}

                         
                        input.seek(index59_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalHelloInferrer()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA59_2 = input.LA(1);

                         
                        int index59_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalHelloInferrer()) ) {s = 4;}

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
        "\76\uffff";
    static final String DFA61_eofS =
        "\1\2\75\uffff";
    static final String DFA61_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA61_maxS =
        "\1\112\1\0\74\uffff";
    static final String DFA61_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA61_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA61_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\3\2\2\uffff\27\2\1\1\1\uffff\16\2\1"+
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
            return "3625:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred24_InternalHelloInferrer()) ) {s = 61;}

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
        "\76\uffff";
    static final String DFA65_eofS =
        "\1\2\75\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA65_maxS =
        "\1\112\1\0\74\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA65_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\3\2\2\uffff\11\2\1\1\16\2\1\uffff\16"+
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
            return "3770:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
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
                        if ( (synpred25_InternalHelloInferrer()) ) {s = 61;}

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
        "\76\uffff";
    static final String DFA68_eofS =
        "\1\2\75\uffff";
    static final String DFA68_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA68_maxS =
        "\1\112\1\0\74\uffff";
    static final String DFA68_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA68_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\1\2\2\2\uffff\30\2\1\uffff\16\2\1"+
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
            return "3819:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred26_InternalHelloInferrer()) ) {s = 61;}

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
            "\4\5\1\1\7\uffff\1\5\2\uffff\1\2\1\uffff\1\35\13\uffff\1\5\2"+
            "\uffff\2\5\4\uffff\1\5\4\uffff\1\5\1\4\2\uffff\1\5\1\uffff\1"+
            "\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
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
            return "3824:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA67_0==19) ) {s = 2;}

                        else if ( (LA67_0==74) && (synpred27_InternalHelloInferrer())) {s = 3;}

                        else if ( (LA67_0==48) && (synpred27_InternalHelloInferrer())) {s = 4;}

                        else if ( ((LA67_0>=RULE_STRING && LA67_0<=RULE_DECIMAL)||LA67_0==16||LA67_0==33||(LA67_0>=36 && LA67_0<=37)||LA67_0==42||LA67_0==47||LA67_0==51||LA67_0==53||(LA67_0>=57 && LA67_0<=59)||LA67_0==62||(LA67_0>=64 && LA67_0<=71)) ) {s = 5;}

                        else if ( (LA67_0==21) ) {s = 29;}

                         
                        input.seek(index67_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHelloInferrer()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_2 = input.LA(1);

                         
                        int index67_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHelloInferrer()) ) {s = 4;}

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
        "\76\uffff";
    static final String DFA69_eofS =
        "\1\2\75\uffff";
    static final String DFA69_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA69_maxS =
        "\1\112\1\0\74\uffff";
    static final String DFA69_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA69_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA69_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\3\2\2\uffff\27\2\1\1\1\uffff\16\2\1"+
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
            return "3903:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred28_InternalHelloInferrer()) ) {s = 61;}

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
        "\76\uffff";
    static final String DFA71_eofS =
        "\1\33\75\uffff";
    static final String DFA71_minS =
        "\1\4\32\0\43\uffff";
    static final String DFA71_maxS =
        "\1\112\32\0\43\uffff";
    static final String DFA71_acceptS =
        "\33\uffff\1\2\41\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\43\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\21\1\15\1\16\1\17\1\1\7\uffff\1\6\1\33\1\uffff\1\32\2\33"+
            "\2\uffff\11\33\1\10\2\33\1\4\1\3\4\33\1\2\4\33\1\12\1\uffff"+
            "\2\33\1\23\1\33\1\7\3\33\1\24\1\25\1\26\2\33\1\11\1\uffff\1"+
            "\5\1\13\1\14\1\20\1\22\1\27\1\30\1\31\3\33",
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
            return "4227:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA71_2 = input.LA(1);

                         
                        int index71_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA71_3 = input.LA(1);

                         
                        int index71_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA71_4 = input.LA(1);

                         
                        int index71_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA71_5 = input.LA(1);

                         
                        int index71_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA71_6 = input.LA(1);

                         
                        int index71_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA71_7 = input.LA(1);

                         
                        int index71_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA71_8 = input.LA(1);

                         
                        int index71_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA71_9 = input.LA(1);

                         
                        int index71_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA71_10 = input.LA(1);

                         
                        int index71_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA71_11 = input.LA(1);

                         
                        int index71_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA71_12 = input.LA(1);

                         
                        int index71_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA71_13 = input.LA(1);

                         
                        int index71_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA71_14 = input.LA(1);

                         
                        int index71_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA71_15 = input.LA(1);

                         
                        int index71_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA71_16 = input.LA(1);

                         
                        int index71_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA71_17 = input.LA(1);

                         
                        int index71_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA71_18 = input.LA(1);

                         
                        int index71_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA71_19 = input.LA(1);

                         
                        int index71_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA71_20 = input.LA(1);

                         
                        int index71_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA71_21 = input.LA(1);

                         
                        int index71_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA71_22 = input.LA(1);

                         
                        int index71_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA71_23 = input.LA(1);

                         
                        int index71_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA71_24 = input.LA(1);

                         
                        int index71_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA71_25 = input.LA(1);

                         
                        int index71_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA71_26 = input.LA(1);

                         
                        int index71_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 61;}

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
        "\76\uffff";
    static final String DFA86_eofS =
        "\1\2\75\uffff";
    static final String DFA86_minS =
        "\1\4\1\0\74\uffff";
    static final String DFA86_maxS =
        "\1\112\1\0\74\uffff";
    static final String DFA86_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA86_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA86_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\3\2\2\uffff\11\2\1\1\16\2\1\uffff\16"+
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
            return "4743:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
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
                        if ( (synpred35_InternalHelloInferrer()) ) {s = 61;}

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
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel153 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImport237 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard353 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildcard372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGreeting461 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGreeting482 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleGreeting494 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleGreeting515 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleGreeting528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOperation611 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleOperation632 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOperation644 = new BitSet(new long[]{0x0000000000280100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleOperation666 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleOperation679 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleOperation700 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleOperation716 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleOperation728 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleOperation749 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleOperation770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment964 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment980 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1030 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1083 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpSingleAssign1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpMultiAssign1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1378 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1431 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1454 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOr1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1637 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1690 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1713 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpAnd1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1896 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1949 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1972 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpEquality2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpEquality2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2176 = new BitSet(new long[]{0x00000003E0000002L});
    public static final BitSet FOLLOW_29_in_ruleXRelationalExpression2212 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2235 = new BitSet(new long[]{0x00000003E0000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2296 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2319 = new BitSet(new long[]{0x00000003E0000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpCompare2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpCompare2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpCompare2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpCompare2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2562 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2615 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2638 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOther2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2842 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2895 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2918 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpAdd3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpAdd3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3122 = new BitSet(new long[]{0x000003C000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3175 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3198 = new BitSet(new long[]{0x000003C000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpMulti3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpMulti3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpMulti3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpMulti3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3451 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpUnary3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpUnary3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpUnary3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3721 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleXCastedExpression3756 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3779 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3874 = new BitSet(new long[]{0x0000700000000002L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall3923 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3946 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3962 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3984 = new BitSet(new long[]{0x0000700000000002L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4070 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4094 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4131 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_33_in_ruleXMemberFeatureCall4160 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4181 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_20_in_ruleXMemberFeatureCall4194 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4215 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_32_in_ruleXMemberFeatureCall4229 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4254 = new BitSet(new long[]{0x0000F00000080002L});
    public static final BitSet FOLLOW_19_in_ruleXMemberFeatureCall4288 = new BitSet(new long[]{0x4E298432002901F0L,0x00000000000004FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4373 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4401 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleXMemberFeatureCall4414 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4435 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleXMemberFeatureCall4452 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4485 = new BitSet(new long[]{0x0000700000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXClosure5224 = new BitSet(new long[]{0x7E2B8432000901F0L,0x00000000000004FFL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5295 = new BitSet(new long[]{0x0001000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXClosure5308 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5329 = new BitSet(new long[]{0x0001000000100000L});
    public static final BitSet FOLLOW_48_in_ruleXClosure5351 = new BitSet(new long[]{0x7E2A8432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5388 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXClosure5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5502 = new BitSet(new long[]{0x7E2C8432000901F2L,0x00000000000000FFL});
    public static final BitSet FOLLOW_50_in_ruleXExpressionInClosure5515 = new BitSet(new long[]{0x7E288432000901F2L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5673 = new BitSet(new long[]{0x0001000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXShortClosure5686 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5707 = new BitSet(new long[]{0x0001000000100000L});
    public static final BitSet FOLLOW_48_in_ruleXShortClosure5729 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleXParenthesizedExpression5848 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5870 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXParenthesizedExpression5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXIfExpression5973 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXIfExpression5985 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6006 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXIfExpression6018 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6039 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXIfExpression6060 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6176 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6219 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6231 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6255 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_19_in_ruleXSwitchExpression6299 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6320 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6332 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6355 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXSwitchExpression6367 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXSwitchExpression6381 = new BitSet(new long[]{0x0140000000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6402 = new BitSet(new long[]{0x01C00000000A0100L,0x0000000000000400L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6416 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6428 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6449 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression6463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6555 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXCasePart6569 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6590 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXCasePart6604 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXForLoopExpression6717 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXForLoopExpression6729 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6750 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXForLoopExpression6762 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6783 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXForLoopExpression6795 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXWhileExpression6908 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXWhileExpression6920 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6941 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXWhileExpression6953 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXDoWhileExpression7066 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7087 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXDoWhileExpression7099 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXDoWhileExpression7111 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7132 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXDoWhileExpression7144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleXBlockExpression7236 = new BitSet(new long[]{0x7E288432000B01F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7258 = new BitSet(new long[]{0x7E2C8432000B01F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_50_in_ruleXBlockExpression7271 = new BitSet(new long[]{0x7E288432000B01F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_17_in_ruleXBlockExpression7287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXVariableDeclaration7505 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_61_in_ruleXVariableDeclaration7536 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7584 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7605 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7634 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleXVariableDeclaration7648 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7763 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7877 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8001 = new BitSet(new long[]{0x4000000200000100L});
    public static final BitSet FOLLOW_33_in_ruleXFeatureCall8015 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8036 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_20_in_ruleXFeatureCall8049 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8070 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_32_in_ruleXFeatureCall8084 = new BitSet(new long[]{0x4000000200000100L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8109 = new BitSet(new long[]{0x0000800000080002L});
    public static final BitSet FOLLOW_19_in_ruleXFeatureCall8143 = new BitSet(new long[]{0x4E298432002901F0L,0x00000000000004FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8228 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8256 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleXFeatureCall8269 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8290 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleXFeatureCall8307 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleIdOrSuper8460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8559 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleStaticQualifier8577 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXConstructorCall8674 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8697 = new BitSet(new long[]{0x0000800200080002L});
    public static final BitSet FOLLOW_33_in_ruleXConstructorCall8718 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8740 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_20_in_ruleXConstructorCall8753 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8774 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_32_in_ruleXConstructorCall8788 = new BitSet(new long[]{0x0000800000080002L});
    public static final BitSet FOLLOW_19_in_ruleXConstructorCall8811 = new BitSet(new long[]{0x4E298432002901F0L,0x00000000000004FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8884 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8912 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleXConstructorCall8925 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8946 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleXConstructorCall8963 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall8996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXBooleanLiteral9090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXBooleanLiteral9114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXNullLiteral9220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXTypeLiteral9515 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXTypeLiteral9527 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9550 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXTypeLiteral9562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXThrowExpression9654 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXReturnExpression9767 = new BitSet(new long[]{0x4E288432000901F2L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression9891 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9942 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_ruleXTryCatchFinallyExpression9964 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXTryCatchFinallyExpression10008 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXCatchClause10122 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXCatchClause10135 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10156 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXCatchClause10168 = new BitSet(new long[]{0x4E288432000901F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10284 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleQualifiedName10312 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10335 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10472 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10498 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleNumber10518 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10671 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleJvmTypeReference10709 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleJvmTypeReference10721 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleXFunctionTypeRef10836 = new BitSet(new long[]{0x0000000000280100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10858 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleXFunctionTypeRef10871 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10892 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleXFunctionTypeRef10908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleXFunctionTypeRef10922 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11037 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleJvmParameterizedTypeReference11058 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11080 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_20_in_ruleJvmParameterizedTypeReference11093 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11114 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_32_in_ruleJvmParameterizedTypeReference11128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJvmWildcardTypeReference11341 = new BitSet(new long[]{0x4000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmUpperBound11475 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmUpperBoundAnded11579 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleJvmLowerBound11683 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloInferrer1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalHelloInferrer1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalHelloInferrer1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalHelloInferrer1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred5_InternalHelloInferrer2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalHelloInferrer2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalHelloInferrer2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalHelloInferrer2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalHelloInferrer3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred10_InternalHelloInferrer3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred11_InternalHelloInferrer3891 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalHelloInferrer3900 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalHelloInferrer3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred12_InternalHelloInferrer4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred12_InternalHelloInferrer4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred12_InternalHelloInferrer4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred13_InternalHelloInferrer4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloInferrer4322 = new BitSet(new long[]{0x0001000000100000L});
    public static final BitSet FOLLOW_20_in_synpred14_InternalHelloInferrer4329 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalHelloInferrer4336 = new BitSet(new long[]{0x0001000000100000L});
    public static final BitSet FOLLOW_48_in_synpred14_InternalHelloInferrer4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalHelloInferrer4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloInferrer5241 = new BitSet(new long[]{0x0001000000100000L});
    public static final BitSet FOLLOW_20_in_synpred16_InternalHelloInferrer5248 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloInferrer5255 = new BitSet(new long[]{0x0001000000100000L});
    public static final BitSet FOLLOW_48_in_synpred16_InternalHelloInferrer5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred18_InternalHelloInferrer6052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalHelloInferrer6194 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_synpred19_InternalHelloInferrer6200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred20_InternalHelloInferrer6276 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalHelloInferrer6283 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_synpred20_InternalHelloInferrer6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred21_InternalHelloInferrer7554 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred21_InternalHelloInferrer7563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred22_InternalHelloInferrer8125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalHelloInferrer8177 = new BitSet(new long[]{0x0001000000100000L});
    public static final BitSet FOLLOW_20_in_synpred23_InternalHelloInferrer8184 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred23_InternalHelloInferrer8191 = new BitSet(new long[]{0x0001000000100000L});
    public static final BitSet FOLLOW_48_in_synpred23_InternalHelloInferrer8205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred24_InternalHelloInferrer8323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred25_InternalHelloInferrer8710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred26_InternalHelloInferrer8803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloInferrer8833 = new BitSet(new long[]{0x0001000000100000L});
    public static final BitSet FOLLOW_20_in_synpred27_InternalHelloInferrer8840 = new BitSet(new long[]{0x0000000000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloInferrer8847 = new BitSet(new long[]{0x0001000000100000L});
    public static final BitSet FOLLOW_48_in_synpred27_InternalHelloInferrer8861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred28_InternalHelloInferrer8979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred29_InternalHelloInferrer9781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_synpred30_InternalHelloInferrer9926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_synpred31_InternalHelloInferrer9956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred33_InternalHelloInferrer10303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred34_InternalHelloInferrer10686 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_synpred34_InternalHelloInferrer10690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred35_InternalHelloInferrer11050 = new BitSet(new long[]{0x0000000000000002L});

}