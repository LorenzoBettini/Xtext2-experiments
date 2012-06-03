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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'Hello'", "'{'", "'}'", "'op'", "'('", "','", "')'", "'output'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
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
    public static final int T__79=79;
    public static final int T__78=78;
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

            if ( (LA6_0==RULE_ID||LA6_0==19||LA6_0==36) ) {
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

                if ( (LA8_1==EOF||(LA8_1>=RULE_STRING && LA8_1<=RULE_ID)||(LA8_1>=16 && LA8_1<=17)||(LA8_1>=19 && LA8_1<=21)||(LA8_1>=24 && LA8_1<=50)||(LA8_1>=52 && LA8_1<=76)) ) {
                    alt8=2;
                }
                else if ( (LA8_1==23) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_DECIMAL)||LA8_0==16||LA8_0==19||LA8_0==33||(LA8_0>=39 && LA8_0<=40)||LA8_0==45||LA8_0==50||LA8_0==54||LA8_0==56||(LA8_0>=60 && LA8_0<=62)||LA8_0==65||(LA8_0>=67 && LA8_0<=74)) ) {
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
                case 32:
                    {
                    int LA13_2 = input.LA(2);

                    if ( (synpred6_InternalHelloInferrer()) ) {
                        alt13=2;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA13_3 = input.LA(2);

                    if ( (synpred6_InternalHelloInferrer()) ) {
                        alt13=2;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA13_4 = input.LA(2);

                    if ( (synpred5_InternalHelloInferrer()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA13_5 = input.LA(2);

                    if ( (synpred6_InternalHelloInferrer()) ) {
                        alt13=2;
                    }


                    }
                    break;
                case 31:
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
                alt15 = dfa15.predict(input);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1157:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? ) | (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? ) | (kw= '<' kw= '>' ) | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1160:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? ) | (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? ) | (kw= '<' kw= '>' ) | kw= '?:' | kw= '<=>' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1161:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? ) | (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? ) | (kw= '<' kw= '>' ) | kw= '?:' | kw= '<=>' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1161:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? ) | (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? ) | (kw= '<' kw= '>' ) | kw= '?:' | kw= '<=>' )
            int alt18=8;
            alt18 = dfa18.predict(input);
            switch (alt18) {
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
                case 3 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1176:2: kw= '=>'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther2764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1182:6: (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1182:6: (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1183:2: kw= '>' kw= '>' ( ( '>' )=>kw= '>' )?
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1()); 
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1194:1: ( ( '>' )=>kw= '>' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==32) && (synpred8_InternalHelloInferrer())) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1194:2: ( '>' )=>kw= '>'
                            {
                            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2819); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_2()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1203:6: (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1203:6: (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1204:2: kw= '<' kw= '<' ( ( '<' )=>kw= '<' )?
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1()); 
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1215:1: ( ( '<' )=>kw= '<' )?
                    int alt17=2;
                    alt17 = dfa17.predict(input);
                    switch (alt17) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1215:2: ( '<' )=>kw= '<'
                            {
                            kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2877); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_2()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1224:6: (kw= '<' kw= '>' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1224:6: (kw= '<' kw= '>' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1225:2: kw= '<' kw= '>'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2900); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_5_0()); 
                          
                    }
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2913); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1238:2: kw= '?:'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpOther2933); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1245:2: kw= '<=>'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpOther2952); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1258:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1259:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1260:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2992);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3002); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1267:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1270:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1271:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1271:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1272:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3049);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1280:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==39) ) {
                    int LA19_2 = input.LA(2);

                    if ( (synpred10_InternalHelloInferrer()) ) {
                        alt19=1;
                    }


                }
                else if ( (LA19_0==40) ) {
                    int LA19_3 = input.LA(2);

                    if ( (synpred10_InternalHelloInferrer()) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1280:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1280:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1280:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1285:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1285:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1285:7: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1286:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1291:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1292:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1292:1: ( ruleOpAdd )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1293:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3102);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1306:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1307:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1307:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1308:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3125);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1332:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1333:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1334:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3164);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3175); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1341:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1344:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1345:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1345:1: (kw= '+' | kw= '-' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            else if ( (LA20_0==40) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1346:2: kw= '+'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpAdd3213); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1353:2: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpAdd3232); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1366:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1367:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1368:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3272);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3282); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1375:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1378:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1379:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1379:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1380:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3329);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1388:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop21:
            do {
                int alt21=2;
                switch ( input.LA(1) ) {
                case 41:
                    {
                    int LA21_2 = input.LA(2);

                    if ( (synpred11_InternalHelloInferrer()) ) {
                        alt21=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA21_3 = input.LA(2);

                    if ( (synpred11_InternalHelloInferrer()) ) {
                        alt21=1;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA21_4 = input.LA(2);

                    if ( (synpred11_InternalHelloInferrer()) ) {
                        alt21=1;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA21_5 = input.LA(2);

                    if ( (synpred11_InternalHelloInferrer()) ) {
                        alt21=1;
                    }


                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1388:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1388:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1388:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1393:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1393:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1393:7: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1394:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1399:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1400:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1400:1: ( ruleOpMulti )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1401:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3382);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1414:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1415:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1415:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1416:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3405);
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1440:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1441:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1442:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3444);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3455); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1449:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1452:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1453:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1453:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt22=1;
                }
                break;
            case 42:
                {
                alt22=2;
                }
                break;
            case 43:
                {
                alt22=3;
                }
                break;
            case 44:
                {
                alt22=4;
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1454:2: kw= '*'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpMulti3493); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1461:2: kw= '**'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpMulti3512); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1468:2: kw= '/'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpMulti3531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1475:2: kw= '%'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpMulti3550); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1488:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1489:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1490:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3590);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3600); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1497:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1500:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1501:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1501:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=39 && LA23_0<=40)||LA23_0==45) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)||LA23_0==16||LA23_0==19||LA23_0==33||LA23_0==50||LA23_0==54||LA23_0==56||(LA23_0>=60 && LA23_0<=62)||LA23_0==65||(LA23_0>=67 && LA23_0<=74)) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1501:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1501:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1501:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1501:3: ()
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1502:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1507:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1508:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1508:1: ( ruleOpUnary )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1509:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3658);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1522:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1523:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1523:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1524:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3679);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1542:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3708);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1558:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1559:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1560:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3744);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3755); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1567:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1570:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1571:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1571:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt24=1;
                }
                break;
            case 40:
                {
                alt24=2;
                }
                break;
            case 39:
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1572:2: kw= '!'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpUnary3793); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1579:2: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpUnary3812); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1586:2: kw= '+'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpUnary3831); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1599:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1600:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1601:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3871);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3881); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1608:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1611:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1612:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1612:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1613:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3928);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1621:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==46) ) {
                    int LA25_2 = input.LA(2);

                    if ( (synpred12_InternalHelloInferrer()) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1621:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1621:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1621:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1623:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1623:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1623:6: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1624:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXCastedExpression3963); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1633:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1634:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1634:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1635:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3986);
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
            	    break loop25;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1659:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1660:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1661:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4024);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4034); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1668:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1671:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1672:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1672:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1673:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4081);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1681:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop33:
            do {
                int alt33=3;
                switch ( input.LA(1) ) {
                case 47:
                    {
                    int LA33_2 = input.LA(2);

                    if ( (synpred13_InternalHelloInferrer()) ) {
                        alt33=1;
                    }
                    else if ( (synpred14_InternalHelloInferrer()) ) {
                        alt33=2;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (synpred14_InternalHelloInferrer()) ) {
                        alt33=2;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA33_4 = input.LA(2);

                    if ( (synpred14_InternalHelloInferrer()) ) {
                        alt33=2;
                    }


                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1681:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1681:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1681:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1681:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1681:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1687:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1687:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1687:26: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1688:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4130); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1697:1: ( ( ruleValidID ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1698:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1698:1: ( ruleValidID )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1699:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4153);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4169);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1720:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1721:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1721:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1722:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4191);
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
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1739:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1739:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1739:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1739:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1739:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1755:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1755:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1755:8: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1756:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1761:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt26=3;
            	    switch ( input.LA(1) ) {
            	    case 47:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1761:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4277); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1766:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1766:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1767:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1767:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1768:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall4301); if (state.failed) return current;
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
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1782:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1782:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1783:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1783:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1784:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,49,FOLLOW_49_in_ruleXMemberFeatureCall4338); if (state.failed) return current;
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1797:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==33) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1797:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,33,FOLLOW_33_in_ruleXMemberFeatureCall4367); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1801:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1802:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1802:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1803:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4388);
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

            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1819:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop27:
            	            do {
            	                int alt27=2;
            	                int LA27_0 = input.LA(1);

            	                if ( (LA27_0==20) ) {
            	                    alt27=1;
            	                }


            	                switch (alt27) {
            	            	case 1 :
            	            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1819:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleXMemberFeatureCall4401); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1823:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1824:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1824:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1825:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4422);
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
            	            	    break loop27;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,32,FOLLOW_32_in_ruleXMemberFeatureCall4436); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1845:3: ( ( ruleValidID ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1846:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1846:1: ( ruleValidID )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1847:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4461);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1860:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt31=2;
            	    alt31 = dfa31.predict(input);
            	    switch (alt31) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1860:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1860:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1860:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1867:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1868:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,19,FOLLOW_19_in_ruleXMemberFeatureCall4495); if (state.failed) return current;
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

            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1881:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt30=3;
            	            alt30 = dfa30.predict(input);
            	            switch (alt30) {
            	                case 1 :
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1881:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1881:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1881:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1898:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1899:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4580);
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
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1916:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1916:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1916:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1916:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1917:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1917:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1918:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4608);
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

            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1934:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop29:
            	                    do {
            	                        int alt29=2;
            	                        int LA29_0 = input.LA(1);

            	                        if ( (LA29_0==20) ) {
            	                            alt29=1;
            	                        }


            	                        switch (alt29) {
            	                    	case 1 :
            	                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1934:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleXMemberFeatureCall4621); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1938:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1939:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1939:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1940:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4642);
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
            	                    	    break loop29;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,21,FOLLOW_21_in_ruleXMemberFeatureCall4659); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1960:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt32=2;
            	    alt32 = dfa32.predict(input);
            	    switch (alt32) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1960:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1965:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1966:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4692);
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
            	    break loop33;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1990:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1991:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1992:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4732);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4742); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1999:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2002:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2003:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2003:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt34=13;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt34=1;
                }
                break;
            case 16:
                {
                alt34=2;
                }
                break;
            case 56:
                {
                alt34=3;
                }
                break;
            case RULE_ID:
            case 33:
            case 65:
                {
                alt34=4;
                }
                break;
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 50:
            case 68:
            case 69:
            case 70:
            case 71:
                {
                alt34=5;
                }
                break;
            case 54:
                {
                alt34=6;
                }
                break;
            case 60:
                {
                alt34=7;
                }
                break;
            case 61:
                {
                alt34=8;
                }
                break;
            case 62:
                {
                alt34=9;
                }
                break;
            case 72:
                {
                alt34=10;
                }
                break;
            case 73:
                {
                alt34=11;
                }
                break;
            case 74:
                {
                alt34=12;
                }
                break;
            case 19:
                {
                alt34=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2004:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4789);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2014:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4816);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2024:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4843);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2034:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4870);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2044:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4897);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2054:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4924);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2064:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4951);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2074:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4978);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2084:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5005);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2094:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5032);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2104:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5059);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2114:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5086);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2124:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5113);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2140:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2141:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2142:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5148);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5158); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2149:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2152:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2153:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2153:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt35=6;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt35=1;
                }
                break;
            case 68:
            case 69:
                {
                alt35=2;
                }
                break;
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt35=3;
                }
                break;
            case 70:
                {
                alt35=4;
                }
                break;
            case RULE_STRING:
                {
                alt35=5;
                }
                break;
            case 71:
                {
                alt35=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2154:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5205);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2164:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5232);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2174:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5259);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2184:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5286);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2194:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5313);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2204:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5340);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2220:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2221:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2222:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5375);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5385); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2229:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2232:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2233:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2233:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2233:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2233:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2234:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXClosure5431); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2243:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2243:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2258:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2258:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2258:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_ID||LA37_0==19||LA37_0==36) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2258:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2258:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2259:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2259:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2260:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5502);
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

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2276:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==20) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2276:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleXClosure5515); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2280:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2281:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2281:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2282:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5536);
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
                            	    break loop36;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2298:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2299:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2299:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2300:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,51,FOLLOW_51_in_ruleXClosure5558); if (state.failed) return current;
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2313:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2314:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2314:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2315:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5595);
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

            otherlv_7=(Token)match(input,52,FOLLOW_52_in_ruleXClosure5607); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2343:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2344:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2345:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5643);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5653); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2352:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2355:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2356:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2356:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2356:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2356:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2357:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2362:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_ID)||LA40_0==16||LA40_0==19||LA40_0==33||(LA40_0>=39 && LA40_0<=40)||LA40_0==45||LA40_0==50||LA40_0==54||LA40_0==56||(LA40_0>=60 && LA40_0<=65)||(LA40_0>=67 && LA40_0<=74)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2362:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2362:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2363:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2363:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2364:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5709);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2380:2: (otherlv_2= ';' )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==53) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2380:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleXExpressionInClosure5722); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2392:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2393:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2394:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5762);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5772); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2401:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2404:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2405:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2405:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2405:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2405:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2405:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2421:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2421:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2421:7: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2422:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2427:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||LA42_0==19||LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2427:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2427:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2428:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2428:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2429:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5880);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2445:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==20) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2445:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleXShortClosure5893); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2449:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2450:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2450:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2451:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5914);
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
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2467:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2468:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2468:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2469:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,51,FOLLOW_51_in_ruleXShortClosure5936); if (state.failed) return current;
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2482:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2483:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2483:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2484:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5972);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2508:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2509:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2510:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6008);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6018); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2517:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2520:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2521:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2521:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2521:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleXParenthesizedExpression6055); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6077);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXParenthesizedExpression6088); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2546:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2547:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2548:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6124);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6134); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2555:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2558:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2559:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2559:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2559:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2559:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2560:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXIfExpression6180); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXIfExpression6192); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2573:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2574:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2574:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2575:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6213);
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

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXIfExpression6225); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2595:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2596:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2596:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2597:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6246);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2613:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==55) ) {
                int LA43_1 = input.LA(2);

                if ( (synpred20_InternalHelloInferrer()) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2613:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2613:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2613:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleXIfExpression6267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2618:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2619:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2619:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2620:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6289);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2644:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2645:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2646:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6327);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6337); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2653:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2656:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2657:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2657:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2657:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2657:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2658:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6383); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2667:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)||LA45_0==16||LA45_0==33||(LA45_0>=39 && LA45_0<=40)||LA45_0==45||LA45_0==50||LA45_0==54||LA45_0==56||(LA45_0>=60 && LA45_0<=62)||LA45_0==65||(LA45_0>=67 && LA45_0<=74)) ) {
                alt45=1;
            }
            else if ( (LA45_0==19) ) {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==RULE_ID) ) {
                    int LA45_3 = input.LA(3);

                    if ( (LA45_3==19||LA45_3==21||(LA45_3>=23 && LA45_3<=44)||(LA45_3>=46 && LA45_3<=50)||LA45_3==66) ) {
                        alt45=1;
                    }
                    else if ( (LA45_3==57) && (synpred22_InternalHelloInferrer())) {
                        alt45=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA45_2>=RULE_STRING && LA45_2<=RULE_DECIMAL)||LA45_2==16||LA45_2==19||LA45_2==33||(LA45_2>=39 && LA45_2<=40)||LA45_2==45||LA45_2==50||LA45_2==54||LA45_2==56||(LA45_2>=60 && LA45_2<=62)||LA45_2==65||(LA45_2>=67 && LA45_2<=74)) ) {
                    alt45=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2667:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2667:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2667:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2667:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_ID) ) {
                        int LA44_1 = input.LA(2);

                        if ( (LA44_1==57) && (synpred21_InternalHelloInferrer())) {
                            alt44=1;
                        }
                    }
                    switch (alt44) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2667:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2672:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2672:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2672:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2673:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2673:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2674:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6426);
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

                            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6438); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2694:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2695:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2695:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2696:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6462);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2713:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2713:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2713:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2713:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2713:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2719:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2719:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleXSwitchExpression6506); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2723:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2724:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2724:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2725:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6527);
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

                    otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6539); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2745:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2746:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2746:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2747:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6562);
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

                    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleXSwitchExpression6574); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleXSwitchExpression6588); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2771:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID||LA46_0==19||LA46_0==36||LA46_0==57||LA46_0==59) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2772:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2772:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2773:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6609);
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
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2789:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==58) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2789:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression6623); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6635); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2797:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2798:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2798:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2799:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6656);
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

            otherlv_15=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression6670); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2827:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2828:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2829:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6706);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6716); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2836:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2839:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2840:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2840:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2840:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2840:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||LA48_0==19||LA48_0==36) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2841:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2841:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2842:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6762);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2858:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==59) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2858:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXCasePart6776); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2862:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2863:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2863:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2864:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6797);
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

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleXCasePart6811); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2884:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2885:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2885:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2886:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6832);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2910:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2911:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2912:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6868);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6878); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2919:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2922:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2923:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2923:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2923:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2923:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2924:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXForLoopExpression6924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXForLoopExpression6936); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2937:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2938:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2938:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2939:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6957);
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

            otherlv_4=(Token)match(input,57,FOLLOW_57_in_ruleXForLoopExpression6969); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2959:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2960:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2960:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2961:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6990);
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

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleXForLoopExpression7002); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2981:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2982:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2982:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2983:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7023);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3007:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3008:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3009:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7059);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7069); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3016:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3019:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3020:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3020:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3020:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3020:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3021:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXWhileExpression7115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXWhileExpression7127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3034:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3035:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3035:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3036:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7148);
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

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXWhileExpression7160); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3056:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3057:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3057:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3058:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7181);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3082:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3083:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3084:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7217);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7227); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3091:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3094:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3095:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3095:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3095:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3095:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3096:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXDoWhileExpression7273); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3105:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3106:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3106:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3107:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7294);
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

            otherlv_3=(Token)match(input,61,FOLLOW_61_in_ruleXDoWhileExpression7306); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleXDoWhileExpression7318); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3131:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3132:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3132:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3133:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7339);
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

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleXDoWhileExpression7351); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3161:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3162:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3163:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7387);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7397); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3170:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3173:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3174:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3174:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3174:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3174:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3175:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleXBlockExpression7443); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3184:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_STRING && LA51_0<=RULE_ID)||LA51_0==16||LA51_0==19||LA51_0==33||(LA51_0>=39 && LA51_0<=40)||LA51_0==45||LA51_0==50||LA51_0==54||LA51_0==56||(LA51_0>=60 && LA51_0<=65)||(LA51_0>=67 && LA51_0<=74)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3184:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3184:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3185:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3185:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3186:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7465);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3202:2: (otherlv_3= ';' )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==53) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3202:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleXBlockExpression7478); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleXBlockExpression7494); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3218:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3219:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3220:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7530);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7540); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3227:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3230:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3231:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3231:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=63 && LA52_0<=64)) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_ID)||LA52_0==16||LA52_0==19||LA52_0==33||(LA52_0>=39 && LA52_0<=40)||LA52_0==45||LA52_0==50||LA52_0==54||LA52_0==56||(LA52_0>=60 && LA52_0<=62)||LA52_0==65||(LA52_0>=67 && LA52_0<=74)) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3232:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7587);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3242:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7614);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3258:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3259:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3260:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7649);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7659); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3267:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3270:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3271:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3271:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3271:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3271:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3272:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3277:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==63) ) {
                alt53=1;
            }
            else if ( (LA53_0==64) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3277:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3277:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3278:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3278:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3279:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,63,FOLLOW_63_in_ruleXVariableDeclaration7712); if (state.failed) return current;
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3293:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleXVariableDeclaration7743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3297:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (synpred23_InternalHelloInferrer()) ) {
                    alt54=1;
                }
                else if ( (true) ) {
                    alt54=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==19) && (synpred23_InternalHelloInferrer())) {
                alt54=1;
            }
            else if ( (LA54_0==36) && (synpred23_InternalHelloInferrer())) {
                alt54=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3297:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3297:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3297:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3305:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3305:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3305:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3306:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3306:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3307:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7791);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3323:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3324:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3324:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3325:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7812);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3342:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3342:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3343:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3343:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3344:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7841);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3360:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==23) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3360:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleXVariableDeclaration7855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3364:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3365:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3365:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3366:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7876);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3390:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3391:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3392:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7914);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7924); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3399:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3402:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3403:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3403:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3403:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3403:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==RULE_ID||LA56_1==33||LA56_1==47||LA56_1==50) ) {
                    alt56=1;
                }
            }
            else if ( (LA56_0==19||LA56_0==36) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3404:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3404:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3405:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7970);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3421:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3422:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3422:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3423:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7992);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3447:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3448:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3449:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8028);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8038); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3456:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3459:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3460:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3460:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3460:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3460:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3461:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3461:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3462:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8084);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3478:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3479:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3479:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3480:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8105);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3504:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3505:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3506:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8141);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8151); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3513:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3516:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3517:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3517:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3517:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3517:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3518:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3523:2: ( ( ruleStaticQualifier ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==66) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3524:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3524:1: ( ruleStaticQualifier )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3525:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8208);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3538:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==33) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3538:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleXFeatureCall8222); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3542:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3543:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3543:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3544:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8243);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3560:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==20) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3560:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleXFeatureCall8256); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3564:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3565:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3565:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3566:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8277);
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
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleXFeatureCall8291); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3586:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3587:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3587:1: ( ruleIdOrSuper )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3588:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8316);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3601:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3601:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3601:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3601:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3608:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3609:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,19,FOLLOW_19_in_ruleXFeatureCall8350); if (state.failed) return current;
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3622:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt61=3;
                    alt61 = dfa61.predict(input);
                    switch (alt61) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3622:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3622:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3622:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3639:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3640:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8435);
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
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3657:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3657:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3657:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3657:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3658:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3658:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3659:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8463);
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

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3675:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==20) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3675:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleXFeatureCall8476); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3679:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3680:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3680:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3681:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8497);
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
                            	    break loop60;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleXFeatureCall8514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3701:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3701:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3706:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3707:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8547);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3731:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3732:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3733:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8585);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8596); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3740:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3743:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3744:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3744:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_ID) ) {
                alt64=1;
            }
            else if ( (LA64_0==65) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3745:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8643);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3757:2: kw= 'super'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleIdOrSuper8667); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3770:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3771:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3772:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8708);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8719); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3779:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3782:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3783:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3783:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt65=0;
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_ID) ) {
                    int LA65_2 = input.LA(2);

                    if ( (LA65_2==66) ) {
                        alt65=1;
                    }


                }


                switch (alt65) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3784:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8766);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,66,FOLLOW_66_in_ruleStaticQualifier8784); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt65 >= 1 ) break loop65;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3808:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3809:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3810:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8825);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8835); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3817:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3820:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3821:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3821:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3821:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3821:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3822:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXConstructorCall8881); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3831:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3832:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3832:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3833:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8904);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3846:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3846:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3846:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3846:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleXConstructorCall8925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3851:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3852:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3852:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3853:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8947);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3869:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==20) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3869:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleXConstructorCall8960); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3873:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3874:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3874:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3875:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8981);
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
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleXConstructorCall8995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3895:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3895:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3895:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3895:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleXConstructorCall9018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3900:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt69=3;
                    alt69 = dfa69.predict(input);
                    switch (alt69) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3900:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3900:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3900:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3917:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3918:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9091);
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
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3935:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3935:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3935:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3935:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3936:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3936:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3937:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9119);
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

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3953:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop68:
                            do {
                                int alt68=2;
                                int LA68_0 = input.LA(1);

                                if ( (LA68_0==20) ) {
                                    alt68=1;
                                }


                                switch (alt68) {
                            	case 1 :
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3953:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleXConstructorCall9132); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3957:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3958:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3958:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3959:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9153);
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
                            	    break loop68;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleXConstructorCall9170); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3979:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3979:4: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3984:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3985:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9203);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4009:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4010:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4011:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9240);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9250); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4018:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4021:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4022:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4022:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4022:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4022:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4023:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4028:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==68) ) {
                alt72=1;
            }
            else if ( (LA72_0==69) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4028:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXBooleanLiteral9297); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4033:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4033:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4034:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4034:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4035:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,69,FOLLOW_69_in_ruleXBooleanLiteral9321); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4056:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4057:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4058:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9371);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9381); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4065:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4068:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4069:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4069:1: ( () otherlv_1= 'null' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4069:2: () otherlv_1= 'null'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4069:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4070:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXNullLiteral9427); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4087:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4088:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4089:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9463);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9473); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4096:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4099:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4100:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4100:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4100:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4100:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4101:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4106:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4107:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4107:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4108:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9528);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4132:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4133:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4134:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9564);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9574); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4141:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4144:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4145:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4145:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4145:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4145:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4146:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4151:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4152:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4152:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4153:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9625); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4177:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4178:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4179:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9666);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9676); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4186:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4189:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4190:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4190:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4190:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4190:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4191:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXTypeLiteral9722); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXTypeLiteral9734); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4204:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4205:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4205:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4206:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9757);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXTypeLiteral9769); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4231:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4232:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4233:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9805);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9815); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4240:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4243:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4244:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4244:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4244:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4244:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4245:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXThrowExpression9861); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4254:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4255:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4255:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4256:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9882);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4280:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4281:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4282:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9918);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9928); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4289:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4292:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4293:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4293:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4293:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4293:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4294:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXReturnExpression9974); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4303:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4303:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4308:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4309:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10005);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4333:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4334:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4335:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10042);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10052); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4342:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4345:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4346:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4346:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4346:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4346:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4347:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression10098); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4356:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4357:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4357:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4358:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10119);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4374:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==76) ) {
                alt76=1;
            }
            else if ( (LA76_0==75) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4374:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4374:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4374:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4374:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt74=0;
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==76) ) {
                            int LA74_2 = input.LA(2);

                            if ( (synpred32_InternalHelloInferrer()) ) {
                                alt74=1;
                            }


                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4374:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4376:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4377:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10149);
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
                    	    if ( cnt74 >= 1 ) break loop74;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(74, input);
                                throw eee;
                        }
                        cnt74++;
                    } while (true);

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4393:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==75) ) {
                        int LA75_1 = input.LA(2);

                        if ( (synpred33_InternalHelloInferrer()) ) {
                            alt75=1;
                        }
                    }
                    switch (alt75) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4393:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4393:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4393:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,75,FOLLOW_75_in_ruleXTryCatchFinallyExpression10171); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4398:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4399:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4399:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4400:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10193);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4417:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4417:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4417:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,75,FOLLOW_75_in_ruleXTryCatchFinallyExpression10215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4421:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4422:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4422:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4423:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10236);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4447:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4448:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4449:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10274);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10284); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4456:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4459:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4460:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4460:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4460:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4460:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4460:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleXCatchClause10329); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleXCatchClause10342); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4469:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4470:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4470:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4471:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10363);
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

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleXCatchClause10375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4491:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4492:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4492:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4493:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10396);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4517:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4518:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4519:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10433);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10444); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4526:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4529:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4530:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4530:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4531:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10491);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4541:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==47) ) {
                    int LA77_2 = input.LA(2);

                    if ( (LA77_2==RULE_ID) ) {
                        int LA77_3 = input.LA(3);

                        if ( (synpred35_InternalHelloInferrer()) ) {
                            alt77=1;
                        }


                    }


                }


                switch (alt77) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4541:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4541:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4541:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,47,FOLLOW_47_in_ruleQualifiedName10519); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10542);
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
            	    break loop77;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4568:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4572:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4573:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10596);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10607); if (state.failed) return current;

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4583:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4587:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4588:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4588:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_HEX) ) {
                alt81=1;
            }
            else if ( ((LA81_0>=RULE_INT && LA81_0<=RULE_DECIMAL)) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4588:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10651); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4596:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4596:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4596:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4596:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==RULE_INT) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==RULE_DECIMAL) ) {
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
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4596:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10679); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4604:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10705); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4611:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==47) ) {
                        int LA80_1 = input.LA(2);

                        if ( ((LA80_1>=RULE_INT && LA80_1<=RULE_DECIMAL)) ) {
                            alt80=1;
                        }
                    }
                    switch (alt80) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4612:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,47,FOLLOW_47_in_ruleNumber10725); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4617:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt79=2;
                            int LA79_0 = input.LA(1);

                            if ( (LA79_0==RULE_INT) ) {
                                alt79=1;
                            }
                            else if ( (LA79_0==RULE_DECIMAL) ) {
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
                                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4617:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10741); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4625:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10767); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4643:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4644:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4645:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10820);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10830); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4652:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4655:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4656:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4656:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_ID) ) {
                alt83=1;
            }
            else if ( (LA83_0==19||LA83_0==36) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4656:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4656:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4657:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10878);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4665:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==50) ) {
                            int LA82_2 = input.LA(2);

                            if ( (LA82_2==52) ) {
                                int LA82_3 = input.LA(3);

                                if ( (synpred36_InternalHelloInferrer()) ) {
                                    alt82=1;
                                }


                            }


                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4665:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4668:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4668:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4668:6: ()
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4669:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleJvmTypeReference10916); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleJvmTypeReference10928); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4684:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10960);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4700:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4701:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4702:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10995);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11005); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4709:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4712:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4713:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4713:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4713:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4713:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==19) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4713:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleXFunctionTypeRef11043); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4717:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==RULE_ID||LA85_0==19||LA85_0==36) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4717:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4717:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4718:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4718:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4719:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11065);
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

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4735:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop84:
                            do {
                                int alt84=2;
                                int LA84_0 = input.LA(1);

                                if ( (LA84_0==20) ) {
                                    alt84=1;
                                }


                                switch (alt84) {
                            	case 1 :
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4735:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleXFunctionTypeRef11078); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4739:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4740:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4740:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4741:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11099);
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
                            	    break loop84;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXFunctionTypeRef11115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleXFunctionTypeRef11129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4765:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4766:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4766:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4767:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11150);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4791:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4792:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4793:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11186);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11196); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4800:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4803:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4804:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4804:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4804:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4804:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4805:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4805:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4806:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11244);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4819:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt88=2;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4819:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4819:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4819:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleJvmParameterizedTypeReference11265); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4824:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4825:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4825:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4826:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11287);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4842:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==20) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4842:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleJvmParameterizedTypeReference11300); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4846:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4847:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4847:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4848:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11321);
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
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleJvmParameterizedTypeReference11335); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4876:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4877:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4878:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11373);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11383); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4885:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4888:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4889:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4889:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_ID||LA89_0==19||LA89_0==36) ) {
                alt89=1;
            }
            else if ( (LA89_0==77) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4890:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11430);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4900:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11457);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4916:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4917:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4918:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11492);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11502); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4925:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4928:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4929:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4929:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4929:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4929:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4930:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleJvmWildcardTypeReference11548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4939:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt90=3;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==78) ) {
                alt90=1;
            }
            else if ( (LA90_0==65) ) {
                alt90=2;
            }
            switch (alt90) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4939:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4939:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4940:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4940:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4941:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11570);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4958:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4958:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4959:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4959:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4960:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11597);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4984:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4985:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4986:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11635);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11645); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4993:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4996:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4997:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4997:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4997:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleJvmUpperBound11682); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5001:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5002:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5002:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5003:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11703);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5027:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5028:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5029:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11739);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11749); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5036:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5039:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5040:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5040:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5040:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleJvmUpperBoundAnded11786); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5044:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5045:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5045:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5046:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11807);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5070:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5071:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5072:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11843);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11853); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5079:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5082:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5083:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5083:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5083:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleJvmLowerBound11890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5087:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5088:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5088:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5089:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11911);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5115:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5116:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5117:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11950);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11961); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5124:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5127:28: (this_ID_0= RULE_ID )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5128:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12000); if (state.failed) return current;
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
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1194:2: ( '>' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1195:2: '>'
        {
        match(input,32,FOLLOW_32_in_synpred8_InternalHelloInferrer2810); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalHelloInferrer

    // $ANTLR start synpred9_InternalHelloInferrer
    public final void synpred9_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1215:2: ( '<' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1216:2: '<'
        {
        match(input,33,FOLLOW_33_in_synpred9_InternalHelloInferrer2868); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalHelloInferrer

    // $ANTLR start synpred10_InternalHelloInferrer
    public final void synpred10_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1280:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1280:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1280:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1280:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1280:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1281:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1281:2: ( ( ruleOpAdd ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1282:1: ( ruleOpAdd )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1282:1: ( ruleOpAdd )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1283:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalHelloInferrer3070);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalHelloInferrer

    // $ANTLR start synpred11_InternalHelloInferrer
    public final void synpred11_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1388:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1388:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1388:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1388:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1388:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1389:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1389:2: ( ( ruleOpMulti ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1390:1: ( ruleOpMulti )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1390:1: ( ruleOpMulti )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1391:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalHelloInferrer3350);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalHelloInferrer

    // $ANTLR start synpred12_InternalHelloInferrer
    public final void synpred12_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1621:3: ( ( () 'as' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1621:4: ( () 'as' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1621:4: ( () 'as' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1621:5: () 'as'
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1621:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1622:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred12_InternalHelloInferrer3944); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalHelloInferrer

    // $ANTLR start synpred13_InternalHelloInferrer
    public final void synpred13_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1681:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1681:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1681:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1681:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1681:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1682:1: 
        {
        }

        match(input,47,FOLLOW_47_in_synpred13_InternalHelloInferrer4098); if (state.failed) return ;
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1683:1: ( ( ruleValidID ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1684:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1684:1: ( ruleValidID )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1685:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalHelloInferrer4107);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHelloInferrer4113);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalHelloInferrer

    // $ANTLR start synpred14_InternalHelloInferrer
    public final void synpred14_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1739:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1739:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1739:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1739:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1739:10: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1740:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1740:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt91=3;
        switch ( input.LA(1) ) {
        case 47:
            {
            alt91=1;
            }
            break;
        case 48:
            {
            alt91=2;
            }
            break;
        case 49:
            {
            alt91=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 91, 0, input);

            throw nvae;
        }

        switch (alt91) {
            case 1 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1740:4: '.'
                {
                match(input,47,FOLLOW_47_in_synpred14_InternalHelloInferrer4216); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1742:6: ( ( '?.' ) )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1742:6: ( ( '?.' ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1743:1: ( '?.' )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1743:1: ( '?.' )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1744:2: '?.'
                {
                match(input,48,FOLLOW_48_in_synpred14_InternalHelloInferrer4230); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1749:6: ( ( '*.' ) )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1749:6: ( ( '*.' ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1750:1: ( '*.' )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1750:1: ( '*.' )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1751:2: '*.'
                {
                match(input,49,FOLLOW_49_in_synpred14_InternalHelloInferrer4250); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalHelloInferrer

    // $ANTLR start synpred15_InternalHelloInferrer
    public final void synpred15_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1860:4: ( ( '(' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1861:1: ( '(' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1861:1: ( '(' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1862:2: '('
        {
        match(input,19,FOLLOW_19_in_synpred15_InternalHelloInferrer4477); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalHelloInferrer

    // $ANTLR start synpred16_InternalHelloInferrer
    public final void synpred16_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1881:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1881:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1881:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1881:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1881:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1882:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1882:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt93=2;
        int LA93_0 = input.LA(1);

        if ( (LA93_0==RULE_ID||LA93_0==19||LA93_0==36) ) {
            alt93=1;
        }
        switch (alt93) {
            case 1 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1882:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1882:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1883:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1883:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1884:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloInferrer4529);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1886:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop92:
                do {
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==20) ) {
                        alt92=1;
                    }


                    switch (alt92) {
                	case 1 :
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1886:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred16_InternalHelloInferrer4536); if (state.failed) return ;
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1887:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1888:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1888:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1889:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloInferrer4543);
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

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1891:6: ( ( '|' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1892:1: ( '|' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1892:1: ( '|' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1893:2: '|'
        {
        match(input,51,FOLLOW_51_in_synpred16_InternalHelloInferrer4557); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalHelloInferrer

    // $ANTLR start synpred17_InternalHelloInferrer
    public final void synpred17_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1960:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1961:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1961:1: ( ruleXClosure )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1962:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred17_InternalHelloInferrer4675);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalHelloInferrer

    // $ANTLR start synpred18_InternalHelloInferrer
    public final void synpred18_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2243:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2243:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2243:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2243:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2243:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==RULE_ID||LA95_0==19||LA95_0==36) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2243:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2243:5: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2244:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2244:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2245:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalHelloInferrer5448);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2247:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop94:
                do {
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==20) ) {
                        alt94=1;
                    }


                    switch (alt94) {
                	case 1 :
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2247:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred18_InternalHelloInferrer5455); if (state.failed) return ;
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2248:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2249:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2249:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2250:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalHelloInferrer5462);
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

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2252:6: ( ( '|' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2253:1: ( '|' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2253:1: ( '|' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2254:2: '|'
        {
        match(input,51,FOLLOW_51_in_synpred18_InternalHelloInferrer5476); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred18_InternalHelloInferrer

    // $ANTLR start synpred20_InternalHelloInferrer
    public final void synpred20_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2613:4: ( 'else' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2613:6: 'else'
        {
        match(input,55,FOLLOW_55_in_synpred20_InternalHelloInferrer6259); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalHelloInferrer

    // $ANTLR start synpred21_InternalHelloInferrer
    public final void synpred21_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2667:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2667:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2667:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2667:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2667:6: ( ( ruleValidID ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2668:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2668:1: ( ruleValidID )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2669:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred21_InternalHelloInferrer6401);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,57,FOLLOW_57_in_synpred21_InternalHelloInferrer6407); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalHelloInferrer

    // $ANTLR start synpred22_InternalHelloInferrer
    public final void synpred22_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2713:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2713:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2713:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2713:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,19,FOLLOW_19_in_synpred22_InternalHelloInferrer6483); if (state.failed) return ;
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2714:1: ( ( ruleValidID ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2715:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2715:1: ( ruleValidID )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2716:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred22_InternalHelloInferrer6490);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,57,FOLLOW_57_in_synpred22_InternalHelloInferrer6496); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred22_InternalHelloInferrer

    // $ANTLR start synpred23_InternalHelloInferrer
    public final void synpred23_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3297:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3297:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3297:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3297:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3297:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3298:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3298:1: ( ruleJvmTypeReference )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3299:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred23_InternalHelloInferrer7761);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3301:2: ( ( ruleValidID ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3302:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3302:1: ( ruleValidID )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3303:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalHelloInferrer7770);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred23_InternalHelloInferrer

    // $ANTLR start synpred24_InternalHelloInferrer
    public final void synpred24_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3601:4: ( ( '(' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3602:1: ( '(' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3602:1: ( '(' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3603:2: '('
        {
        match(input,19,FOLLOW_19_in_synpred24_InternalHelloInferrer8332); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalHelloInferrer

    // $ANTLR start synpred25_InternalHelloInferrer
    public final void synpred25_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3622:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3622:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3622:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3622:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3622:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3623:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3623:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==RULE_ID||LA99_0==19||LA99_0==36) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3623:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3623:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3624:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3624:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3625:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred25_InternalHelloInferrer8384);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3627:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop98:
                do {
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==20) ) {
                        alt98=1;
                    }


                    switch (alt98) {
                	case 1 :
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3627:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred25_InternalHelloInferrer8391); if (state.failed) return ;
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3628:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3629:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3629:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3630:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred25_InternalHelloInferrer8398);
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

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3632:6: ( ( '|' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3633:1: ( '|' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3633:1: ( '|' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3634:2: '|'
        {
        match(input,51,FOLLOW_51_in_synpred25_InternalHelloInferrer8412); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalHelloInferrer

    // $ANTLR start synpred26_InternalHelloInferrer
    public final void synpred26_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3701:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3702:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3702:1: ( ruleXClosure )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3703:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred26_InternalHelloInferrer8530);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalHelloInferrer

    // $ANTLR start synpred27_InternalHelloInferrer
    public final void synpred27_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3846:4: ( '<' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3846:6: '<'
        {
        match(input,33,FOLLOW_33_in_synpred27_InternalHelloInferrer8917); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalHelloInferrer

    // $ANTLR start synpred28_InternalHelloInferrer
    public final void synpred28_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3895:5: ( '(' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3895:7: '('
        {
        match(input,19,FOLLOW_19_in_synpred28_InternalHelloInferrer9010); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalHelloInferrer

    // $ANTLR start synpred29_InternalHelloInferrer
    public final void synpred29_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3900:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3900:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3900:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3900:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3900:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3901:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3901:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt101=2;
        int LA101_0 = input.LA(1);

        if ( (LA101_0==RULE_ID||LA101_0==19||LA101_0==36) ) {
            alt101=1;
        }
        switch (alt101) {
            case 1 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3901:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3901:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3902:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3902:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3903:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred29_InternalHelloInferrer9040);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3905:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop100:
                do {
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==20) ) {
                        alt100=1;
                    }


                    switch (alt100) {
                	case 1 :
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3905:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred29_InternalHelloInferrer9047); if (state.failed) return ;
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3906:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3907:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3907:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3908:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred29_InternalHelloInferrer9054);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop100;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3910:6: ( ( '|' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3911:1: ( '|' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3911:1: ( '|' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3912:2: '|'
        {
        match(input,51,FOLLOW_51_in_synpred29_InternalHelloInferrer9068); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred29_InternalHelloInferrer

    // $ANTLR start synpred30_InternalHelloInferrer
    public final void synpred30_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3979:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3980:1: ( ruleXClosure )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3980:1: ( ruleXClosure )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3981:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred30_InternalHelloInferrer9186);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred30_InternalHelloInferrer

    // $ANTLR start synpred31_InternalHelloInferrer
    public final void synpred31_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4303:2: ( ( ruleXExpression ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4304:1: ( ruleXExpression )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4304:1: ( ruleXExpression )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4305:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred31_InternalHelloInferrer9988);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalHelloInferrer

    // $ANTLR start synpred32_InternalHelloInferrer
    public final void synpred32_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4374:5: ( 'catch' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4374:7: 'catch'
        {
        match(input,76,FOLLOW_76_in_synpred32_InternalHelloInferrer10133); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalHelloInferrer

    // $ANTLR start synpred33_InternalHelloInferrer
    public final void synpred33_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4393:5: ( 'finally' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4393:7: 'finally'
        {
        match(input,75,FOLLOW_75_in_synpred33_InternalHelloInferrer10163); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalHelloInferrer

    // $ANTLR start synpred35_InternalHelloInferrer
    public final void synpred35_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4541:3: ( '.' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4542:2: '.'
        {
        match(input,47,FOLLOW_47_in_synpred35_InternalHelloInferrer10510); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalHelloInferrer

    // $ANTLR start synpred36_InternalHelloInferrer
    public final void synpred36_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4665:2: ( ( () '[' ']' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4665:3: ( () '[' ']' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4665:3: ( () '[' ']' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4665:4: () '[' ']'
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4665:4: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4666:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred36_InternalHelloInferrer10893); if (state.failed) return ;
        match(input,52,FOLLOW_52_in_synpred36_InternalHelloInferrer10897); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred36_InternalHelloInferrer

    // $ANTLR start synpred37_InternalHelloInferrer
    public final void synpred37_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4819:4: ( '<' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4819:6: '<'
        {
        match(input,33,FOLLOW_33_in_synpred37_InternalHelloInferrer11257); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalHelloInferrer

    // Delegated rules

    public final boolean synpred32_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalHelloInferrer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred37_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalHelloInferrer_fragment(); // can never throw exception
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
    public final boolean synpred36_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalHelloInferrer_fragment(); // can never throw exception
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
    public final boolean synpred17_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalHelloInferrer_fragment(); // can never throw exception
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


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA88 dfa88 = new DFA88(this);
    static final String DFA15_eotS =
        "\12\uffff";
    static final String DFA15_eofS =
        "\1\1\11\uffff";
    static final String DFA15_minS =
        "\1\4\1\uffff\7\0\1\uffff";
    static final String DFA15_maxS =
        "\1\114\1\uffff\7\0\1\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA15_specialS =
        "\2\uffff\1\3\1\6\1\0\1\1\1\2\1\5\1\4\1\uffff}>";
    static final String[] DFA15_transitionS = {
            "\5\1\7\uffff\2\1\1\uffff\3\1\2\uffff\10\1\1\2\1\3\1\4\1\5\1"+
            "\6\1\7\1\10\14\1\1\uffff\16\1\1\uffff\12\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "()* loopback of 1096:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_4 = input.LA(1);

                         
                        int index15_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloInferrer()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_5 = input.LA(1);

                         
                        int index15_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloInferrer()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloInferrer()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloInferrer()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_8 = input.LA(1);

                         
                        int index15_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloInferrer()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloInferrer()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloInferrer()) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA18_eotS =
        "\12\uffff";
    static final String DFA18_eofS =
        "\12\uffff";
    static final String DFA18_minS =
        "\1\40\4\uffff\1\40\4\uffff";
    static final String DFA18_maxS =
        "\1\46\4\uffff\1\41\4\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\1\6\1\5";
    static final String DFA18_specialS =
        "\12\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\4\1\5\1\1\1\2\1\3\1\6\1\7",
            "",
            "",
            "",
            "",
            "\1\10\1\11",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1161:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' kw= '>' ( ( '>' )=>kw= '>' )? ) | (kw= '<' kw= '<' ( ( '<' )=>kw= '<' )? ) | (kw= '<' kw= '>' ) | kw= '?:' | kw= '<=>' )";
        }
    }
    static final String DFA17_eotS =
        "\35\uffff";
    static final String DFA17_eofS =
        "\1\2\34\uffff";
    static final String DFA17_minS =
        "\1\4\1\0\33\uffff";
    static final String DFA17_maxS =
        "\1\112\1\0\33\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\31\uffff\1\1";
    static final String DFA17_specialS =
        "\1\uffff\1\0\33\uffff}>";
    static final String[] DFA17_transitionS = {
            "\5\2\7\uffff\1\2\2\uffff\1\2\15\uffff\1\1\5\uffff\2\2\4\uffff"+
            "\1\2\4\uffff\1\2\3\uffff\1\2\1\uffff\1\2\3\uffff\3\2\2\uffff"+
            "\1\2\1\uffff\10\2",
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1215:1: ( ( '<' )=>kw= '<' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                         
                        int index17_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalHelloInferrer()) ) {s = 28;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\100\uffff";
    static final String DFA31_eofS =
        "\1\2\77\uffff";
    static final String DFA31_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA31_maxS =
        "\1\114\1\0\76\uffff";
    static final String DFA31_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA31_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA31_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\1\2\2\2\uffff\33\2\1\uffff\16\2"+
            "\1\uffff\12\2",
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
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1860:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_1 = input.LA(1);

                         
                        int index31_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA30_eotS =
        "\36\uffff";
    static final String DFA30_eofS =
        "\36\uffff";
    static final String DFA30_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA30_maxS =
        "\1\112\2\0\33\uffff";
    static final String DFA30_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA30_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA30_transitionS = {
            "\4\5\1\1\7\uffff\1\5\2\uffff\1\2\1\uffff\1\35\13\uffff\1\5"+
            "\2\uffff\1\3\2\uffff\2\5\4\uffff\1\5\4\uffff\1\5\1\4\2\uffff"+
            "\1\5\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            return "1881:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_0 = input.LA(1);

                         
                        int index30_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_0==RULE_ID) ) {s = 1;}

                        else if ( (LA30_0==19) ) {s = 2;}

                        else if ( (LA30_0==36) && (synpred16_InternalHelloInferrer())) {s = 3;}

                        else if ( (LA30_0==51) && (synpred16_InternalHelloInferrer())) {s = 4;}

                        else if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_DECIMAL)||LA30_0==16||LA30_0==33||(LA30_0>=39 && LA30_0<=40)||LA30_0==45||LA30_0==50||LA30_0==54||LA30_0==56||(LA30_0>=60 && LA30_0<=62)||LA30_0==65||(LA30_0>=67 && LA30_0<=74)) ) {s = 5;}

                        else if ( (LA30_0==21) ) {s = 29;}

                         
                        input.seek(index30_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloInferrer()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_2 = input.LA(1);

                         
                        int index30_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloInferrer()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index30_2);
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
        "\100\uffff";
    static final String DFA32_eofS =
        "\1\2\77\uffff";
    static final String DFA32_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA32_maxS =
        "\1\114\1\0\76\uffff";
    static final String DFA32_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA32_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA32_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\3\2\2\uffff\32\2\1\1\1\uffff\16\2"+
            "\1\uffff\12\2",
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
            return "1960:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA38_eotS =
        "\40\uffff";
    static final String DFA38_eofS =
        "\40\uffff";
    static final String DFA38_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA38_maxS =
        "\1\112\2\0\35\uffff";
    static final String DFA38_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA38_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA38_transitionS = {
            "\4\5\1\1\7\uffff\1\5\2\uffff\1\2\15\uffff\1\5\2\uffff\1\3\2"+
            "\uffff\2\5\4\uffff\1\5\4\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff"+
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

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "2243:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_0 = input.LA(1);

                         
                        int index38_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA38_0==RULE_ID) ) {s = 1;}

                        else if ( (LA38_0==19) ) {s = 2;}

                        else if ( (LA38_0==36) && (synpred18_InternalHelloInferrer())) {s = 3;}

                        else if ( (LA38_0==51) && (synpred18_InternalHelloInferrer())) {s = 4;}

                        else if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_DECIMAL)||LA38_0==16||LA38_0==33||(LA38_0>=39 && LA38_0<=40)||LA38_0==45||LA38_0==50||LA38_0==52||LA38_0==54||LA38_0==56||(LA38_0>=60 && LA38_0<=65)||(LA38_0>=67 && LA38_0<=74)) ) {s = 5;}

                         
                        input.seek(index38_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_1 = input.LA(1);

                         
                        int index38_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalHelloInferrer()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index38_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_2 = input.LA(1);

                         
                        int index38_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalHelloInferrer()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index38_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA62_eotS =
        "\100\uffff";
    static final String DFA62_eofS =
        "\1\2\77\uffff";
    static final String DFA62_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA62_maxS =
        "\1\114\1\0\76\uffff";
    static final String DFA62_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA62_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA62_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\1\2\2\2\uffff\33\2\1\uffff\16\2"+
            "\1\uffff\12\2",
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
            return "3601:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred24_InternalHelloInferrer()) ) {s = 63;}

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
    static final String DFA61_eotS =
        "\36\uffff";
    static final String DFA61_eofS =
        "\36\uffff";
    static final String DFA61_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA61_maxS =
        "\1\112\2\0\33\uffff";
    static final String DFA61_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA61_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA61_transitionS = {
            "\4\5\1\1\7\uffff\1\5\2\uffff\1\2\1\uffff\1\35\13\uffff\1\5"+
            "\2\uffff\1\3\2\uffff\2\5\4\uffff\1\5\4\uffff\1\5\1\4\2\uffff"+
            "\1\5\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            return "3622:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_0 = input.LA(1);

                         
                        int index61_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA61_0==RULE_ID) ) {s = 1;}

                        else if ( (LA61_0==19) ) {s = 2;}

                        else if ( (LA61_0==36) && (synpred25_InternalHelloInferrer())) {s = 3;}

                        else if ( (LA61_0==51) && (synpred25_InternalHelloInferrer())) {s = 4;}

                        else if ( ((LA61_0>=RULE_STRING && LA61_0<=RULE_DECIMAL)||LA61_0==16||LA61_0==33||(LA61_0>=39 && LA61_0<=40)||LA61_0==45||LA61_0==50||LA61_0==54||LA61_0==56||(LA61_0>=60 && LA61_0<=62)||LA61_0==65||(LA61_0>=67 && LA61_0<=74)) ) {s = 5;}

                        else if ( (LA61_0==21) ) {s = 29;}

                         
                        input.seek(index61_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalHelloInferrer()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_2 = input.LA(1);

                         
                        int index61_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalHelloInferrer()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index61_2);
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
    static final String DFA63_eotS =
        "\100\uffff";
    static final String DFA63_eofS =
        "\1\2\77\uffff";
    static final String DFA63_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA63_maxS =
        "\1\114\1\0\76\uffff";
    static final String DFA63_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA63_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA63_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\3\2\2\uffff\32\2\1\1\1\uffff\16\2"+
            "\1\uffff\12\2",
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
            return "3701:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred26_InternalHelloInferrer()) ) {s = 63;}

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
    static final String DFA67_eotS =
        "\100\uffff";
    static final String DFA67_eofS =
        "\1\2\77\uffff";
    static final String DFA67_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA67_maxS =
        "\1\114\1\0\76\uffff";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA67_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\3\2\2\uffff\11\2\1\1\21\2\1\uffff"+
            "\16\2\1\uffff\12\2",
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
            return "3846:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
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
                        if ( (synpred27_InternalHelloInferrer()) ) {s = 63;}

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
    static final String DFA70_eotS =
        "\100\uffff";
    static final String DFA70_eofS =
        "\1\2\77\uffff";
    static final String DFA70_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA70_maxS =
        "\1\114\1\0\76\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA70_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\1\2\2\2\uffff\33\2\1\uffff\16\2"+
            "\1\uffff\12\2",
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
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "3895:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA69_eotS =
        "\36\uffff";
    static final String DFA69_eofS =
        "\36\uffff";
    static final String DFA69_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA69_maxS =
        "\1\112\2\0\33\uffff";
    static final String DFA69_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA69_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA69_transitionS = {
            "\4\5\1\1\7\uffff\1\5\2\uffff\1\2\1\uffff\1\35\13\uffff\1\5"+
            "\2\uffff\1\3\2\uffff\2\5\4\uffff\1\5\4\uffff\1\5\1\4\2\uffff"+
            "\1\5\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            return "3900:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_0 = input.LA(1);

                         
                        int index69_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA69_0==RULE_ID) ) {s = 1;}

                        else if ( (LA69_0==19) ) {s = 2;}

                        else if ( (LA69_0==36) && (synpred29_InternalHelloInferrer())) {s = 3;}

                        else if ( (LA69_0==51) && (synpred29_InternalHelloInferrer())) {s = 4;}

                        else if ( ((LA69_0>=RULE_STRING && LA69_0<=RULE_DECIMAL)||LA69_0==16||LA69_0==33||(LA69_0>=39 && LA69_0<=40)||LA69_0==45||LA69_0==50||LA69_0==54||LA69_0==56||(LA69_0>=60 && LA69_0<=62)||LA69_0==65||(LA69_0>=67 && LA69_0<=74)) ) {s = 5;}

                        else if ( (LA69_0==21) ) {s = 29;}

                         
                        input.seek(index69_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA69_2 = input.LA(1);

                         
                        int index69_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index69_2);
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
        "\100\uffff";
    static final String DFA71_eofS =
        "\1\2\77\uffff";
    static final String DFA71_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA71_maxS =
        "\1\114\1\0\76\uffff";
    static final String DFA71_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA71_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\3\2\2\uffff\32\2\1\1\1\uffff\16\2"+
            "\1\uffff\12\2",
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
            return "3979:3: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred30_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index71_1);
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
    static final String DFA73_eotS =
        "\100\uffff";
    static final String DFA73_eofS =
        "\1\33\77\uffff";
    static final String DFA73_minS =
        "\1\4\32\0\45\uffff";
    static final String DFA73_maxS =
        "\1\114\32\0\45\uffff";
    static final String DFA73_acceptS =
        "\33\uffff\1\2\43\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\45\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\21\1\15\1\16\1\17\1\1\7\uffff\1\6\1\33\1\uffff\1\32\2\33"+
            "\2\uffff\11\33\1\10\5\33\1\4\1\3\4\33\1\2\4\33\1\12\1\uffff"+
            "\2\33\1\23\1\33\1\7\3\33\1\24\1\25\1\26\2\33\1\11\1\uffff\1"+
            "\5\1\13\1\14\1\20\1\22\1\27\1\30\1\31\2\33",
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
            ""
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "4303:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_2 = input.LA(1);

                         
                        int index73_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_3 = input.LA(1);

                         
                        int index73_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA73_4 = input.LA(1);

                         
                        int index73_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA73_5 = input.LA(1);

                         
                        int index73_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA73_6 = input.LA(1);

                         
                        int index73_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA73_7 = input.LA(1);

                         
                        int index73_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA73_8 = input.LA(1);

                         
                        int index73_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA73_9 = input.LA(1);

                         
                        int index73_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA73_10 = input.LA(1);

                         
                        int index73_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA73_11 = input.LA(1);

                         
                        int index73_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA73_12 = input.LA(1);

                         
                        int index73_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA73_13 = input.LA(1);

                         
                        int index73_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA73_14 = input.LA(1);

                         
                        int index73_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA73_15 = input.LA(1);

                         
                        int index73_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA73_16 = input.LA(1);

                         
                        int index73_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA73_17 = input.LA(1);

                         
                        int index73_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA73_18 = input.LA(1);

                         
                        int index73_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA73_19 = input.LA(1);

                         
                        int index73_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA73_20 = input.LA(1);

                         
                        int index73_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA73_21 = input.LA(1);

                         
                        int index73_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA73_22 = input.LA(1);

                         
                        int index73_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA73_23 = input.LA(1);

                         
                        int index73_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA73_24 = input.LA(1);

                         
                        int index73_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA73_25 = input.LA(1);

                         
                        int index73_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA73_26 = input.LA(1);

                         
                        int index73_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA88_eotS =
        "\100\uffff";
    static final String DFA88_eofS =
        "\1\2\77\uffff";
    static final String DFA88_minS =
        "\1\4\1\0\76\uffff";
    static final String DFA88_maxS =
        "\1\114\1\0\76\uffff";
    static final String DFA88_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA88_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA88_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\3\2\2\uffff\11\2\1\1\21\2\1\uffff"+
            "\16\2\1\uffff\12\2",
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
            ""
    };

    static final short[] DFA88_eot = DFA.unpackEncodedString(DFA88_eotS);
    static final short[] DFA88_eof = DFA.unpackEncodedString(DFA88_eofS);
    static final char[] DFA88_min = DFA.unpackEncodedStringToUnsignedChars(DFA88_minS);
    static final char[] DFA88_max = DFA.unpackEncodedStringToUnsignedChars(DFA88_maxS);
    static final short[] DFA88_accept = DFA.unpackEncodedString(DFA88_acceptS);
    static final short[] DFA88_special = DFA.unpackEncodedString(DFA88_specialS);
    static final short[][] DFA88_transition;

    static {
        int numStates = DFA88_transitionS.length;
        DFA88_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA88_transition[i] = DFA.unpackEncodedString(DFA88_transitionS[i]);
        }
    }

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = DFA88_eot;
            this.eof = DFA88_eof;
            this.min = DFA88_min;
            this.max = DFA88_max;
            this.accept = DFA88_accept;
            this.special = DFA88_special;
            this.transition = DFA88_transition;
        }
        public String getDescription() {
            return "4819:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA88_1 = input.LA(1);

                         
                        int index88_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalHelloInferrer()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index88_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 88, _s, input);
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
    public static final BitSet FOLLOW_19_in_ruleOperation644 = new BitSet(new long[]{0x0000001000280100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleOperation666 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleOperation679 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleOperation700 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleOperation716 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleOperation728 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleOperation749 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleOperation770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment964 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment980 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1030 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1083 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
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
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1431 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1454 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOr1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1637 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1690 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1713 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpAnd1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1896 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1949 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1972 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpEquality2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpEquality2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2176 = new BitSet(new long[]{0x00000003E0000002L});
    public static final BitSet FOLLOW_29_in_ruleXRelationalExpression2212 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2235 = new BitSet(new long[]{0x00000003E0000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2296 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2319 = new BitSet(new long[]{0x00000003E0000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpCompare2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpCompare2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpCompare2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpCompare2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2562 = new BitSet(new long[]{0x0000007F00000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2615 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2638 = new BitSet(new long[]{0x0000007F00000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOther2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpOther2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2784 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2797 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2842 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2855 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2900 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpOther2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpOther2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3049 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3102 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3125 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpAdd3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpAdd3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3329 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3382 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3405 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpMulti3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpMulti3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpMulti3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpMulti3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3658 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpUnary3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpUnary3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpUnary3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3928 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXCastedExpression3963 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3986 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4081 = new BitSet(new long[]{0x0003800000000002L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4130 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4153 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4169 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4191 = new BitSet(new long[]{0x0003800000000002L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4277 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall4301 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_49_in_ruleXMemberFeatureCall4338 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_33_in_ruleXMemberFeatureCall4367 = new BitSet(new long[]{0x0000001000080100L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4388 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_20_in_ruleXMemberFeatureCall4401 = new BitSet(new long[]{0x0000001000080100L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4422 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_32_in_ruleXMemberFeatureCall4436 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4461 = new BitSet(new long[]{0x0007800000080002L});
    public static final BitSet FOLLOW_19_in_ruleXMemberFeatureCall4495 = new BitSet(new long[]{0x714C2192002901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4580 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4608 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleXMemberFeatureCall4621 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4642 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleXMemberFeatureCall4659 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4692 = new BitSet(new long[]{0x0003800000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXClosure5431 = new BitSet(new long[]{0xF15C2192000901F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5502 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXClosure5515 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5536 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_51_in_ruleXClosure5558 = new BitSet(new long[]{0xF1542182000901F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5595 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXClosure5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5709 = new BitSet(new long[]{0xF1642182000901F2L,0x00000000000007FBL});
    public static final BitSet FOLLOW_53_in_ruleXExpressionInClosure5722 = new BitSet(new long[]{0xF1442182000901F2L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5880 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXShortClosure5893 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5914 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_51_in_ruleXShortClosure5936 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleXParenthesizedExpression6055 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6077 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXParenthesizedExpression6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXIfExpression6180 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXIfExpression6192 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6213 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXIfExpression6225 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6246 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXIfExpression6267 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6383 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6426 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6438 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6462 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_19_in_ruleXSwitchExpression6506 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6527 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6539 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6562 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXSwitchExpression6574 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXSwitchExpression6588 = new BitSet(new long[]{0x0A00001000080100L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6609 = new BitSet(new long[]{0x0E000010000A0100L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression6623 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6635 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6656 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression6670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6762 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_59_in_ruleXCasePart6776 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6797 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXCasePart6811 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXForLoopExpression6924 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXForLoopExpression6936 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6957 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXForLoopExpression6969 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6990 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXForLoopExpression7002 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXWhileExpression7115 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXWhileExpression7127 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7148 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXWhileExpression7160 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXDoWhileExpression7273 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7294 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleXDoWhileExpression7306 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXDoWhileExpression7318 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7339 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXDoWhileExpression7351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleXBlockExpression7443 = new BitSet(new long[]{0xF1442182000B01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7465 = new BitSet(new long[]{0xF1642182000B01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_53_in_ruleXBlockExpression7478 = new BitSet(new long[]{0xF1442182000B01F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_17_in_ruleXBlockExpression7494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXVariableDeclaration7712 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_64_in_ruleXVariableDeclaration7743 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7791 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7812 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7841 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleXVariableDeclaration7855 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7970 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8084 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8208 = new BitSet(new long[]{0x0000000200000100L,0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleXFeatureCall8222 = new BitSet(new long[]{0x0000001000080100L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8243 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_20_in_ruleXFeatureCall8256 = new BitSet(new long[]{0x0000001000080100L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8277 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_32_in_ruleXFeatureCall8291 = new BitSet(new long[]{0x0000000200000100L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8316 = new BitSet(new long[]{0x0004000000080002L});
    public static final BitSet FOLLOW_19_in_ruleXFeatureCall8350 = new BitSet(new long[]{0x714C2192002901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8435 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8463 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleXFeatureCall8476 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8497 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleXFeatureCall8514 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleIdOrSuper8667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleStaticQualifier8784 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXConstructorCall8881 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8904 = new BitSet(new long[]{0x0004000200080002L});
    public static final BitSet FOLLOW_33_in_ruleXConstructorCall8925 = new BitSet(new long[]{0x0000001000080100L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8947 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_20_in_ruleXConstructorCall8960 = new BitSet(new long[]{0x0000001000080100L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8981 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_32_in_ruleXConstructorCall8995 = new BitSet(new long[]{0x0004000000080002L});
    public static final BitSet FOLLOW_19_in_ruleXConstructorCall9018 = new BitSet(new long[]{0x714C2192002901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9091 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9119 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleXConstructorCall9132 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9153 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleXConstructorCall9170 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXBooleanLiteral9297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXBooleanLiteral9321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXNullLiteral9427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXTypeLiteral9722 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXTypeLiteral9734 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9757 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXTypeLiteral9769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXThrowExpression9861 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXReturnExpression9974 = new BitSet(new long[]{0x71442182000901F2L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression10098 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10149 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_ruleXTryCatchFinallyExpression10171 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXTryCatchFinallyExpression10215 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXCatchClause10329 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXCatchClause10342 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10363 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXCatchClause10375 = new BitSet(new long[]{0x71442182000901F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10491 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleQualifiedName10519 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10542 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10679 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10705 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleNumber10725 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10878 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleJvmTypeReference10916 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleJvmTypeReference10928 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleXFunctionTypeRef11043 = new BitSet(new long[]{0x0000001000280100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11065 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleXFunctionTypeRef11078 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11099 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleXFunctionTypeRef11115 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleXFunctionTypeRef11129 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11244 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleJvmParameterizedTypeReference11265 = new BitSet(new long[]{0x0000001000080100L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11287 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_20_in_ruleJvmParameterizedTypeReference11300 = new BitSet(new long[]{0x0000001000080100L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11321 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_32_in_ruleJvmParameterizedTypeReference11335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmWildcardTypeReference11548 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmUpperBound11682 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleJvmUpperBoundAnded11786 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleJvmLowerBound11890 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloInferrer1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalHelloInferrer1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalHelloInferrer1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalHelloInferrer1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred5_InternalHelloInferrer2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalHelloInferrer2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalHelloInferrer2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred8_InternalHelloInferrer2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred9_InternalHelloInferrer2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalHelloInferrer3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalHelloInferrer3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred12_InternalHelloInferrer3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred13_InternalHelloInferrer4098 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalHelloInferrer4107 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHelloInferrer4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred14_InternalHelloInferrer4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred14_InternalHelloInferrer4230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred14_InternalHelloInferrer4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred15_InternalHelloInferrer4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloInferrer4529 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_20_in_synpred16_InternalHelloInferrer4536 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloInferrer4543 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_51_in_synpred16_InternalHelloInferrer4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred17_InternalHelloInferrer4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalHelloInferrer5448 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_20_in_synpred18_InternalHelloInferrer5455 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred18_InternalHelloInferrer5462 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_51_in_synpred18_InternalHelloInferrer5476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred20_InternalHelloInferrer6259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred21_InternalHelloInferrer6401 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred21_InternalHelloInferrer6407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred22_InternalHelloInferrer6483 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred22_InternalHelloInferrer6490 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred22_InternalHelloInferrer6496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred23_InternalHelloInferrer7761 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalHelloInferrer7770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred24_InternalHelloInferrer8332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred25_InternalHelloInferrer8384 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_20_in_synpred25_InternalHelloInferrer8391 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred25_InternalHelloInferrer8398 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_51_in_synpred25_InternalHelloInferrer8412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred26_InternalHelloInferrer8530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred27_InternalHelloInferrer8917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred28_InternalHelloInferrer9010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred29_InternalHelloInferrer9040 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_20_in_synpred29_InternalHelloInferrer9047 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred29_InternalHelloInferrer9054 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_51_in_synpred29_InternalHelloInferrer9068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred30_InternalHelloInferrer9186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred31_InternalHelloInferrer9988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_synpred32_InternalHelloInferrer10133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_synpred33_InternalHelloInferrer10163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred35_InternalHelloInferrer10510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred36_InternalHelloInferrer10893 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred36_InternalHelloInferrer10897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred37_InternalHelloInferrer11257 = new BitSet(new long[]{0x0000000000000002L});

}