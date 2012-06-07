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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'Hello'", "'{'", "'}'", "'op'", "'('", "','", "')'", "'output'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
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
    public static final int T__80=80;
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

                if ( (LA8_1==23) ) {
                    alt8=1;
                }
                else if ( (LA8_1==EOF||(LA8_1>=RULE_STRING && LA8_1<=RULE_ID)||(LA8_1>=16 && LA8_1<=17)||(LA8_1>=19 && LA8_1<=21)||(LA8_1>=24 && LA8_1<=51)||(LA8_1>=53 && LA8_1<=77)) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_DECIMAL)||LA8_0==16||LA8_0==19||LA8_0==33||(LA8_0>=40 && LA8_0<=41)||LA8_0==46||LA8_0==51||LA8_0==55||LA8_0==57||(LA8_0>=61 && LA8_0<=63)||LA8_0==66||(LA8_0>=68 && LA8_0<=75)) ) {
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1157:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1160:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1161:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1161:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt18=8;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt18=1;
                }
                break;
            case 35:
                {
                alt18=2;
                }
                break;
            case 36:
                {
                alt18=3;
                }
                break;
            case 32:
                {
                alt18=4;
                }
                break;
            case 33:
                {
                alt18=5;
                }
                break;
            case 37:
                {
                alt18=6;
                }
                break;
            case 38:
                {
                alt18=7;
                }
                break;
            case 39:
                {
                alt18=8;
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1182:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1182:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1183:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1188:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==32) ) {
                        int LA16_1 = input.LA(2);

                        if ( (LA16_1==EOF||(LA16_1>=RULE_STRING && LA16_1<=RULE_ID)||LA16_1==16||LA16_1==19||LA16_1==33||(LA16_1>=40 && LA16_1<=41)||LA16_1==46||LA16_1==51||LA16_1==55||LA16_1==57||(LA16_1>=61 && LA16_1<=63)||LA16_1==66||(LA16_1>=68 && LA16_1<=75)) ) {
                            alt16=2;
                        }
                        else if ( (LA16_1==32) && (synpred8_InternalHelloInferrer())) {
                            alt16=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1188:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1188:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1188:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1192:5: (kw= '>' kw= '>' )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1193:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2815); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2828); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1206:2: kw= '>'
                            {
                            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2849); if (state.failed) return current;
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1212:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1212:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1213:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2871); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1218:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==33) ) {
                        int LA17_1 = input.LA(2);

                        if ( (synpred9_InternalHelloInferrer()) ) {
                            alt17=1;
                        }
                        else if ( (true) ) {
                            alt17=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1218:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1218:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1218:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1222:5: (kw= '<' kw= '<' )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1223:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2902); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2915); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1236:2: kw= '<'
                            {
                            kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2936); if (state.failed) return current;
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1243:2: kw= '<>'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpOther2957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1250:2: kw= '?:'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpOther2976); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1257:2: kw= '<=>'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpOther2995); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1270:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1271:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1272:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3035);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3045); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1279:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1282:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1283:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1283:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1284:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3092);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1292:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==40) ) {
                    int LA19_2 = input.LA(2);

                    if ( (synpred10_InternalHelloInferrer()) ) {
                        alt19=1;
                    }


                }
                else if ( (LA19_0==41) ) {
                    int LA19_3 = input.LA(2);

                    if ( (synpred10_InternalHelloInferrer()) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1292:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1292:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1292:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1297:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1297:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1297:7: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1298:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1303:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1304:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1304:1: ( ruleOpAdd )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1305:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3145);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1318:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1319:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1319:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1320:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3168);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1344:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1345:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1346:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3207);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3218); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1353:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1356:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1357:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1357:1: (kw= '+' | kw= '-' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            else if ( (LA20_0==41) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1358:2: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpAdd3256); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1365:2: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpAdd3275); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1378:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1379:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1380:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3315);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3325); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1387:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1390:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1391:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1391:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1392:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3372);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1400:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop21:
            do {
                int alt21=2;
                switch ( input.LA(1) ) {
                case 42:
                    {
                    int LA21_2 = input.LA(2);

                    if ( (synpred11_InternalHelloInferrer()) ) {
                        alt21=1;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA21_3 = input.LA(2);

                    if ( (synpred11_InternalHelloInferrer()) ) {
                        alt21=1;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA21_4 = input.LA(2);

                    if ( (synpred11_InternalHelloInferrer()) ) {
                        alt21=1;
                    }


                    }
                    break;
                case 45:
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
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1400:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1400:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1400:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1405:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1405:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1405:7: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1406:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1411:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1412:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1412:1: ( ruleOpMulti )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1413:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3425);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1426:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1427:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1427:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1428:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3448);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1452:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1453:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1454:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3487);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3498); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1461:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1464:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1465:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1465:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt22=1;
                }
                break;
            case 43:
                {
                alt22=2;
                }
                break;
            case 44:
                {
                alt22=3;
                }
                break;
            case 45:
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1466:2: kw= '*'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpMulti3536); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1473:2: kw= '**'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpMulti3555); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1480:2: kw= '/'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpMulti3574); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1487:2: kw= '%'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpMulti3593); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1500:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1501:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1502:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3633);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3643); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1509:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1512:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1513:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1513:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=40 && LA23_0<=41)||LA23_0==46) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)||LA23_0==16||LA23_0==19||LA23_0==33||LA23_0==51||LA23_0==55||LA23_0==57||(LA23_0>=61 && LA23_0<=63)||LA23_0==66||(LA23_0>=68 && LA23_0<=75)) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1513:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1513:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1513:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1513:3: ()
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1514:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1519:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1520:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1520:1: ( ruleOpUnary )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1521:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3701);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1534:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1535:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1535:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1536:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3722);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1554:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3751);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1570:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1571:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1572:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3787);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3798); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1579:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1582:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1583:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1583:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt24=1;
                }
                break;
            case 41:
                {
                alt24=2;
                }
                break;
            case 40:
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1584:2: kw= '!'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpUnary3836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1591:2: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpUnary3855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1598:2: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpUnary3874); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1611:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1612:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1613:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3914);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3924); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1620:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1623:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1624:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1624:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1625:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3971);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1633:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==47) ) {
                    int LA25_2 = input.LA(2);

                    if ( (synpred12_InternalHelloInferrer()) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1633:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1633:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1633:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1635:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1635:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1635:6: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1636:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXCastedExpression4006); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1645:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1646:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1646:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1647:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4029);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1671:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1672:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1673:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4067);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4077); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1680:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1683:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1684:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1684:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1685:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4124);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1693:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop33:
            do {
                int alt33=3;
                switch ( input.LA(1) ) {
                case 48:
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
                case 49:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (synpred14_InternalHelloInferrer()) ) {
                        alt33=2;
                    }


                    }
                    break;
                case 50:
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
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1693:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1693:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1693:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1693:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1693:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1699:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1699:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1699:26: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1700:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall4173); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1709:1: ( ( ruleValidID ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1710:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1710:1: ( ruleValidID )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1711:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4196);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4212);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1732:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1733:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1733:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1734:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4234);
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
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1751:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1751:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1751:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1751:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1751:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1767:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1767:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1767:8: ()
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1768:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1773:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt26=3;
            	    switch ( input.LA(1) ) {
            	    case 48:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 50:
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
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1773:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall4320); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1778:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1778:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1779:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1779:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1780:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,49,FOLLOW_49_in_ruleXMemberFeatureCall4344); if (state.failed) return current;
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
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1794:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1794:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1795:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1795:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1796:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,50,FOLLOW_50_in_ruleXMemberFeatureCall4381); if (state.failed) return current;
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1809:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==33) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1809:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,33,FOLLOW_33_in_ruleXMemberFeatureCall4410); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1813:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1814:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1814:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1815:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4431);
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

            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1831:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop27:
            	            do {
            	                int alt27=2;
            	                int LA27_0 = input.LA(1);

            	                if ( (LA27_0==20) ) {
            	                    alt27=1;
            	                }


            	                switch (alt27) {
            	            	case 1 :
            	            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1831:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleXMemberFeatureCall4444); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1835:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1836:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1836:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1837:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4465);
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

            	            otherlv_14=(Token)match(input,32,FOLLOW_32_in_ruleXMemberFeatureCall4479); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1857:3: ( ( ruleValidID ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1858:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1858:1: ( ruleValidID )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1859:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4504);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1872:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt31=2;
            	    alt31 = dfa31.predict(input);
            	    switch (alt31) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1872:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1872:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1872:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1879:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1880:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,19,FOLLOW_19_in_ruleXMemberFeatureCall4538); if (state.failed) return current;
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

            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1893:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt30=3;
            	            alt30 = dfa30.predict(input);
            	            switch (alt30) {
            	                case 1 :
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1893:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1893:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1893:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1910:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1911:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4623);
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
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1928:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1928:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1928:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1928:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1929:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1929:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1930:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4651);
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

            	                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1946:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop29:
            	                    do {
            	                        int alt29=2;
            	                        int LA29_0 = input.LA(1);

            	                        if ( (LA29_0==20) ) {
            	                            alt29=1;
            	                        }


            	                        switch (alt29) {
            	                    	case 1 :
            	                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1946:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleXMemberFeatureCall4664); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1950:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1951:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1951:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1952:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4685);
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

            	            otherlv_21=(Token)match(input,21,FOLLOW_21_in_ruleXMemberFeatureCall4702); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1972:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt32=2;
            	    alt32 = dfa32.predict(input);
            	    switch (alt32) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1972:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1975:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1976:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4737);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2000:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2001:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2002:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4777);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4787); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2009:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2012:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2013:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2013:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt34=13;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2014:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4834);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2024:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4861);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2034:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4888);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2044:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4915);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2054:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4942);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2064:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4969);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2074:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4996);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2084:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5023);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2094:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5050);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2104:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5077);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2114:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5104);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2124:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5131);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2134:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5158);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2150:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2151:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2152:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5193);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5203); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2159:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2162:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2163:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2163:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt35=6;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==51) && (synpred18_InternalHelloInferrer())) {
                alt35=1;
            }
            else if ( ((LA35_0>=69 && LA35_0<=70)) ) {
                alt35=2;
            }
            else if ( ((LA35_0>=RULE_HEX && LA35_0<=RULE_DECIMAL)) ) {
                alt35=3;
            }
            else if ( (LA35_0==71) ) {
                alt35=4;
            }
            else if ( (LA35_0==RULE_STRING) ) {
                alt35=5;
            }
            else if ( (LA35_0==72) ) {
                alt35=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2163:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2163:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2163:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5263);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2176:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5291);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2186:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5318);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2196:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5345);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2206:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5372);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2216:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5399);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2232:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2233:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2234:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5434);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5444); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2241:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2244:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2245:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2245:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2245:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2245:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2245:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2247:5: ( () otherlv_1= '[' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2247:6: () otherlv_1= '['
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2247:6: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2248:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXClosure5504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2257:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2257:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2272:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2272:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2272:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_ID||LA37_0==19||LA37_0==36) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2272:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2272:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2273:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2273:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2274:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5577);
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

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2290:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==20) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2290:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleXClosure5590); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2294:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2295:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2295:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2296:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5611);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2312:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2313:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2313:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2314:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,52,FOLLOW_52_in_ruleXClosure5633); if (state.failed) return current;
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2327:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2328:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2328:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2329:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5670);
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

            otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleXClosure5682); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2357:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2358:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2359:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5718);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5728); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2366:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2369:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2370:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2370:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2370:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2370:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2371:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2376:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_ID)||LA40_0==16||LA40_0==19||LA40_0==33||(LA40_0>=40 && LA40_0<=41)||LA40_0==46||LA40_0==51||LA40_0==55||LA40_0==57||(LA40_0>=61 && LA40_0<=66)||(LA40_0>=68 && LA40_0<=75)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2376:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2376:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2377:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2377:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2378:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5784);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2394:2: (otherlv_2= ';' )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==54) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2394:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleXExpressionInClosure5797); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2406:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2407:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2408:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5837);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5847); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2415:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2418:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2419:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2419:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2419:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2419:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2419:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2435:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2435:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2435:7: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2436:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2441:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||LA42_0==19||LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2441:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2441:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2442:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2442:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2443:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5955);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2459:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==20) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2459:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleXShortClosure5968); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2463:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2464:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2464:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2465:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5989);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2481:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2482:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2482:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2483:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,52,FOLLOW_52_in_ruleXShortClosure6011); if (state.failed) return current;
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2496:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2497:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2497:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2498:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6047);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2522:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2523:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2524:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6083);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6093); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2531:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2534:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2535:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2535:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2535:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleXParenthesizedExpression6130); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6152);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXParenthesizedExpression6163); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2560:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2561:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2562:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6199);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6209); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2569:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2572:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2573:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2573:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2573:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2573:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2574:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXIfExpression6255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXIfExpression6267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2587:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2588:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2588:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2589:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6288);
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

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXIfExpression6300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2609:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2610:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2610:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2611:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6321);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2627:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                int LA43_1 = input.LA(2);

                if ( (synpred22_InternalHelloInferrer()) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2627:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2627:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2627:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,56,FOLLOW_56_in_ruleXIfExpression6342); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2632:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2633:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2633:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2634:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6364);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2658:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2659:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2660:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6402);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6412); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2667:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2670:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2671:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2671:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2671:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2671:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2672:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6458); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2681:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)||LA45_0==16||LA45_0==33||(LA45_0>=40 && LA45_0<=41)||LA45_0==46||LA45_0==51||LA45_0==55||LA45_0==57||(LA45_0>=61 && LA45_0<=63)||LA45_0==66||(LA45_0>=68 && LA45_0<=75)) ) {
                alt45=1;
            }
            else if ( (LA45_0==19) ) {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==RULE_ID) ) {
                    int LA45_3 = input.LA(3);

                    if ( (LA45_3==19||LA45_3==21||(LA45_3>=23 && LA45_3<=45)||(LA45_3>=47 && LA45_3<=51)||LA45_3==67) ) {
                        alt45=1;
                    }
                    else if ( (LA45_3==58) && (synpred24_InternalHelloInferrer())) {
                        alt45=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA45_2>=RULE_STRING && LA45_2<=RULE_DECIMAL)||LA45_2==16||LA45_2==19||LA45_2==33||(LA45_2>=40 && LA45_2<=41)||LA45_2==46||LA45_2==51||LA45_2==55||LA45_2==57||(LA45_2>=61 && LA45_2<=63)||LA45_2==66||(LA45_2>=68 && LA45_2<=75)) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2681:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2681:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2681:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2681:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_ID) ) {
                        int LA44_1 = input.LA(2);

                        if ( (LA44_1==58) && (synpred23_InternalHelloInferrer())) {
                            alt44=1;
                        }
                    }
                    switch (alt44) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2681:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2686:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2686:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2686:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2687:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2687:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2688:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6501);
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

                            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression6513); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2708:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2709:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2709:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2710:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6537);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2727:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2727:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2727:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2727:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2727:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2733:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2733:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleXSwitchExpression6581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2737:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2738:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2738:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2739:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6602);
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

                    otherlv_7=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression6614); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2759:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2760:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2760:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2761:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6637);
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

                    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleXSwitchExpression6649); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleXSwitchExpression6663); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2785:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID||LA46_0==19||LA46_0==36||LA46_0==58||LA46_0==60) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2786:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2786:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2787:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6684);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2803:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==59) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2803:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,59,FOLLOW_59_in_ruleXSwitchExpression6698); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression6710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2811:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2812:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2812:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2813:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6731);
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

            otherlv_15=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression6745); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2841:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2842:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2843:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6781);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6791); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2850:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2853:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2854:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2854:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2854:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2854:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||LA48_0==19||LA48_0==36) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2855:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2855:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2856:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6837);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2872:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==60) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2872:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXCasePart6851); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2876:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2877:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2877:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2878:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6872);
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

            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleXCasePart6886); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2898:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2899:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2899:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2900:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6907);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2924:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2925:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2926:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6943);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6953); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2933:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2936:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2937:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2937:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2937:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2937:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2938:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXForLoopExpression6999); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXForLoopExpression7011); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2951:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2952:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2952:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2953:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7032);
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

            otherlv_4=(Token)match(input,58,FOLLOW_58_in_ruleXForLoopExpression7044); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2973:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2974:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2974:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2975:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7065);
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

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleXForLoopExpression7077); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2995:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2996:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2996:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2997:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7098);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3021:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3022:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3023:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7134);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7144); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3030:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3033:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3034:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3034:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3034:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3034:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3035:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXWhileExpression7190); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXWhileExpression7202); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3048:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3049:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3049:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3050:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7223);
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

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXWhileExpression7235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3070:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3071:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3071:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3072:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7256);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3096:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3097:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3098:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7292);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7302); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3105:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3108:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3109:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3109:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3109:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3109:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3110:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXDoWhileExpression7348); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3119:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3120:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3120:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3121:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7369);
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

            otherlv_3=(Token)match(input,62,FOLLOW_62_in_ruleXDoWhileExpression7381); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleXDoWhileExpression7393); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3145:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3146:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3146:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3147:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7414);
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

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleXDoWhileExpression7426); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3175:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3176:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3177:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7462);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7472); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3184:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3187:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3188:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3188:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3188:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3188:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3189:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleXBlockExpression7518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3198:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_STRING && LA51_0<=RULE_ID)||LA51_0==16||LA51_0==19||LA51_0==33||(LA51_0>=40 && LA51_0<=41)||LA51_0==46||LA51_0==51||LA51_0==55||LA51_0==57||(LA51_0>=61 && LA51_0<=66)||(LA51_0>=68 && LA51_0<=75)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3198:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3198:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3199:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3199:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3200:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7540);
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

            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3216:2: (otherlv_3= ';' )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==54) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3216:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXBlockExpression7553); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleXBlockExpression7569); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3232:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3233:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3234:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7605);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7615); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3241:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3244:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3245:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3245:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=64 && LA52_0<=65)) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_ID)||LA52_0==16||LA52_0==19||LA52_0==33||(LA52_0>=40 && LA52_0<=41)||LA52_0==46||LA52_0==51||LA52_0==55||LA52_0==57||(LA52_0>=61 && LA52_0<=63)||LA52_0==66||(LA52_0>=68 && LA52_0<=75)) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3246:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7662);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3256:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7689);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3272:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3273:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3274:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7724);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7734); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3281:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3284:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3285:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3285:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3285:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3285:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3286:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3291:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==64) ) {
                alt53=1;
            }
            else if ( (LA53_0==65) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3291:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3291:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3292:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3292:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3293:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,64,FOLLOW_64_in_ruleXVariableDeclaration7787); if (state.failed) return current;
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3307:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleXVariableDeclaration7818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3311:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (synpred25_InternalHelloInferrer()) ) {
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
            else if ( (LA54_0==19) && (synpred25_InternalHelloInferrer())) {
                alt54=1;
            }
            else if ( (LA54_0==36) && (synpred25_InternalHelloInferrer())) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3311:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3311:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3311:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3319:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3319:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3319:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3320:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3320:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3321:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7866);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3337:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3338:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3338:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3339:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7887);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3356:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3356:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3357:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3357:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3358:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7916);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3374:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==23) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3374:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleXVariableDeclaration7930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3378:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3379:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3379:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3380:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7951);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3404:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3405:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3406:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7989);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7999); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3413:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3416:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3417:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3417:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3417:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3417:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==RULE_ID||LA56_1==33||LA56_1==48||LA56_1==51) ) {
                    alt56=1;
                }
            }
            else if ( (LA56_0==19||LA56_0==36) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3418:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3418:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3419:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8045);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3435:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3436:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3436:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3437:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8067);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3461:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3462:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3463:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8103);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8113); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3470:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3473:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3474:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3474:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3474:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3474:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3475:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3475:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3476:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8159);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3492:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3493:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3493:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3494:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8180);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3518:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3519:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3520:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8216);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8226); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3527:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3530:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3531:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3531:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3531:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3531:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3532:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3537:2: ( ( ruleStaticQualifier ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==67) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3538:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3538:1: ( ruleStaticQualifier )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3539:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8283);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3552:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==33) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3552:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleXFeatureCall8297); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3556:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3557:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3557:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3558:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8318);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3574:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==20) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3574:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleXFeatureCall8331); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3578:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3579:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3579:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3580:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8352);
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

                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleXFeatureCall8366); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3600:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3601:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3601:1: ( ruleIdOrSuper )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3602:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8391);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3615:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3615:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3615:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3615:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3622:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3623:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,19,FOLLOW_19_in_ruleXFeatureCall8425); if (state.failed) return current;
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3636:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt61=3;
                    alt61 = dfa61.predict(input);
                    switch (alt61) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3636:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3636:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3636:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3653:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3654:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8510);
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
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3671:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3671:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3671:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3671:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3672:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3672:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3673:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8538);
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

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3689:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==20) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3689:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleXFeatureCall8551); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3693:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3694:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3694:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3695:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8572);
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

                    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleXFeatureCall8589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3715:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3715:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3718:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3719:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8624);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3743:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3744:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3745:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8662);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8673); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3752:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3755:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3756:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3756:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_ID) ) {
                alt64=1;
            }
            else if ( (LA64_0==66) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3757:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8720);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3769:2: kw= 'super'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleIdOrSuper8744); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3782:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3783:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3784:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8785);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8796); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3791:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3794:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3795:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3795:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt65=0;
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_ID) ) {
                    int LA65_2 = input.LA(2);

                    if ( (LA65_2==67) ) {
                        alt65=1;
                    }


                }


                switch (alt65) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3796:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8843);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,67,FOLLOW_67_in_ruleStaticQualifier8861); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3820:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3821:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3822:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8902);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8912); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3829:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3832:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3833:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3833:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3833:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3833:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3834:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXConstructorCall8958); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3843:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3844:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3844:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3845:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8981);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3858:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3858:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3858:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3858:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleXConstructorCall9002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3863:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3864:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3864:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3865:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9024);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3881:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==20) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3881:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleXConstructorCall9037); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3885:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3886:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3886:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3887:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9058);
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

                    otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleXConstructorCall9072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3907:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3907:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3907:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3907:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleXConstructorCall9095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3912:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt69=3;
                    alt69 = dfa69.predict(input);
                    switch (alt69) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3912:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3912:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3912:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3929:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3930:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9168);
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
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3947:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3947:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3947:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3947:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3948:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3948:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3949:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9196);
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

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3965:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop68:
                            do {
                                int alt68=2;
                                int LA68_0 = input.LA(1);

                                if ( (LA68_0==20) ) {
                                    alt68=1;
                                }


                                switch (alt68) {
                            	case 1 :
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3965:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleXConstructorCall9209); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3969:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3970:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3970:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3971:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9230);
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

                    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleXConstructorCall9247); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3991:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3991:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3994:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3995:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9282);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4019:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4020:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4021:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9319);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9329); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4028:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4031:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4032:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4032:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4032:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4032:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4033:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4038:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==69) ) {
                alt72=1;
            }
            else if ( (LA72_0==70) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4038:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXBooleanLiteral9376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4043:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4043:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4044:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4044:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4045:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,70,FOLLOW_70_in_ruleXBooleanLiteral9400); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4066:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4067:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4068:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9450);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9460); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4075:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4078:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4079:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4079:1: ( () otherlv_1= 'null' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4079:2: () otherlv_1= 'null'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4079:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4080:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXNullLiteral9506); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4097:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4098:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4099:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9542);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9552); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4106:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4109:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4110:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4110:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4110:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4110:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4111:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4116:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4117:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4117:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4118:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9607);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4142:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4143:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4144:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9643);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9653); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4151:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4154:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4155:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4155:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4155:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4155:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4156:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4161:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4162:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4162:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4163:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9704); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4187:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4188:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4189:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9745);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9755); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4196:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4199:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4200:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4200:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4200:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4200:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4201:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXTypeLiteral9801); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXTypeLiteral9813); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4214:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4215:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4215:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4216:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9836);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXTypeLiteral9848); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4241:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4242:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4243:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9884);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9894); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4250:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4253:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4254:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4254:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4254:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4254:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4255:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXThrowExpression9940); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4264:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4265:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4265:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4266:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9961);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4290:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4291:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4292:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9997);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10007); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4299:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4302:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4303:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4303:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4303:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4303:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4304:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXReturnExpression10053); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4313:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4313:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4318:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4319:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10084);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4343:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4344:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4345:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10121);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10131); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4352:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4355:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4356:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4356:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4356:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4356:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4357:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXTryCatchFinallyExpression10177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4366:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4367:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4367:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4368:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10198);
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

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4384:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==77) ) {
                alt76=1;
            }
            else if ( (LA76_0==76) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4384:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4384:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4384:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4384:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt74=0;
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==77) ) {
                            int LA74_2 = input.LA(2);

                            if ( (synpred34_InternalHelloInferrer()) ) {
                                alt74=1;
                            }


                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4384:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4386:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4387:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10228);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4403:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==76) ) {
                        int LA75_1 = input.LA(2);

                        if ( (synpred35_InternalHelloInferrer()) ) {
                            alt75=1;
                        }
                    }
                    switch (alt75) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4403:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4403:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4403:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,76,FOLLOW_76_in_ruleXTryCatchFinallyExpression10250); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4408:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4409:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4409:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4410:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10272);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4427:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4427:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4427:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,76,FOLLOW_76_in_ruleXTryCatchFinallyExpression10294); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4431:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4432:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4432:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4433:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10315);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4457:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4458:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4459:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10353);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10363); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4466:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4469:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4470:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4470:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4470:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4470:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4470:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleXCatchClause10408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleXCatchClause10421); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4479:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4480:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4480:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4481:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10442);
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

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleXCatchClause10454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4501:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4502:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4502:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4503:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10475);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4527:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4528:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4529:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10512);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10523); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4536:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4539:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4540:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4540:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4541:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10570);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4551:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==48) ) {
                    int LA77_2 = input.LA(2);

                    if ( (LA77_2==RULE_ID) ) {
                        int LA77_3 = input.LA(3);

                        if ( (synpred37_InternalHelloInferrer()) ) {
                            alt77=1;
                        }


                    }


                }


                switch (alt77) {
            	case 1 :
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4551:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4551:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4551:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,48,FOLLOW_48_in_ruleQualifiedName10598); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10621);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4578:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4582:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4583:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10675);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10686); if (state.failed) return current;

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4593:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4597:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4598:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4598:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4598:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10730); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4606:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4606:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4606:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4606:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
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
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4606:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10758); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4614:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10784); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4621:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==48) ) {
                        int LA80_1 = input.LA(2);

                        if ( ((LA80_1>=RULE_INT && LA80_1<=RULE_DECIMAL)) ) {
                            alt80=1;
                        }
                    }
                    switch (alt80) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4622:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,48,FOLLOW_48_in_ruleNumber10804); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4627:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
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
                                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4627:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10820); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4635:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10846); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4653:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4654:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4655:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10899);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10909); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4662:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4665:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4666:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4666:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4666:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4666:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4667:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10957);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4675:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==51) ) {
                            int LA82_2 = input.LA(2);

                            if ( (LA82_2==53) ) {
                                int LA82_3 = input.LA(3);

                                if ( (synpred38_InternalHelloInferrer()) ) {
                                    alt82=1;
                                }


                            }


                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4675:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4678:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4678:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4678:6: ()
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4679:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleJvmTypeReference10995); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleJvmTypeReference11007); if (state.failed) return current;
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4694:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11039);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4710:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4711:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4712:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11074);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11084); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4719:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4722:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4723:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4723:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4723:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4723:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==19) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4723:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleXFunctionTypeRef11122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4727:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==RULE_ID||LA85_0==19||LA85_0==36) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4727:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4727:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4728:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4728:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4729:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11144);
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

                            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4745:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop84:
                            do {
                                int alt84=2;
                                int LA84_0 = input.LA(1);

                                if ( (LA84_0==20) ) {
                                    alt84=1;
                                }


                                switch (alt84) {
                            	case 1 :
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4745:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleXFunctionTypeRef11157); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4749:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4750:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4750:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4751:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11178);
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

                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXFunctionTypeRef11194); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleXFunctionTypeRef11208); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4775:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4776:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4776:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4777:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11229);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4801:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4802:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4803:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11265);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11275); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4810:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4813:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4814:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4814:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4814:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4814:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4815:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4815:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4816:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11323);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4829:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt88=2;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4829:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4829:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4829:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleJvmParameterizedTypeReference11344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4834:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4835:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4835:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4836:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11366);
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

                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4852:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==20) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4852:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleJvmParameterizedTypeReference11379); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4856:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4857:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4857:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4858:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11400);
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

                    otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleJvmParameterizedTypeReference11414); if (state.failed) return current;
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4886:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4887:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4888:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11452);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11462); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4895:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4898:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4899:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4899:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_ID||LA89_0==19||LA89_0==36) ) {
                alt89=1;
            }
            else if ( (LA89_0==78) ) {
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4900:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11509);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4910:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11536);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4926:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4927:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4928:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11571);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11581); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4935:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4938:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4939:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4939:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4939:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4939:2: ()
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4940:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleJvmWildcardTypeReference11627); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4949:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt90=3;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==79) ) {
                alt90=1;
            }
            else if ( (LA90_0==66) ) {
                alt90=2;
            }
            switch (alt90) {
                case 1 :
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4949:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4949:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4950:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4950:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4951:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11649);
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
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4968:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4968:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4969:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4969:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4970:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11676);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4994:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4995:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4996:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11714);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11724); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5003:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5006:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5007:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5007:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5007:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleJvmUpperBound11761); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5011:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5012:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5012:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5013:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11782);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5037:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5038:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5039:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11818);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11828); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5046:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5049:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5050:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5050:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5050:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleJvmUpperBoundAnded11865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5054:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5055:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5055:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5056:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11886);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5080:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5081:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5082:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11922);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11932); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5089:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5092:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5093:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5093:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5093:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleJvmLowerBound11969); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5097:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5098:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5098:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5099:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11990);
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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5125:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5126:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5127:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12029);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12040); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5134:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5137:28: (this_ID_0= RULE_ID )
            // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:5138:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12079); if (state.failed) return current;
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
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1188:3: ( ( '>' '>' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1188:4: ( '>' '>' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1188:4: ( '>' '>' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1189:2: '>' '>'
        {
        match(input,32,FOLLOW_32_in_synpred8_InternalHelloInferrer2799); if (state.failed) return ;
        match(input,32,FOLLOW_32_in_synpred8_InternalHelloInferrer2804); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalHelloInferrer

    // $ANTLR start synpred9_InternalHelloInferrer
    public final void synpred9_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1218:3: ( ( '<' '<' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1218:4: ( '<' '<' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1218:4: ( '<' '<' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1219:2: '<' '<'
        {
        match(input,33,FOLLOW_33_in_synpred9_InternalHelloInferrer2886); if (state.failed) return ;
        match(input,33,FOLLOW_33_in_synpred9_InternalHelloInferrer2891); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalHelloInferrer

    // $ANTLR start synpred10_InternalHelloInferrer
    public final void synpred10_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1292:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1292:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1292:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1292:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1292:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1293:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1293:2: ( ( ruleOpAdd ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1294:1: ( ruleOpAdd )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1294:1: ( ruleOpAdd )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1295:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalHelloInferrer3113);
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
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1400:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1400:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1400:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1400:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1400:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1401:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1401:2: ( ( ruleOpMulti ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1402:1: ( ruleOpMulti )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1402:1: ( ruleOpMulti )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1403:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalHelloInferrer3393);
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
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1633:3: ( ( () 'as' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1633:4: ( () 'as' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1633:4: ( () 'as' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1633:5: () 'as'
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1633:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1634:1: 
        {
        }

        match(input,47,FOLLOW_47_in_synpred12_InternalHelloInferrer3987); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalHelloInferrer

    // $ANTLR start synpred13_InternalHelloInferrer
    public final void synpred13_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1693:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1693:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1693:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1693:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1693:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1694:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred13_InternalHelloInferrer4141); if (state.failed) return ;
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1695:1: ( ( ruleValidID ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1696:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1696:1: ( ruleValidID )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1697:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalHelloInferrer4150);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHelloInferrer4156);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalHelloInferrer

    // $ANTLR start synpred14_InternalHelloInferrer
    public final void synpred14_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1751:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1751:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1751:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1751:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1751:10: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1752:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1752:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt91=3;
        switch ( input.LA(1) ) {
        case 48:
            {
            alt91=1;
            }
            break;
        case 49:
            {
            alt91=2;
            }
            break;
        case 50:
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
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1752:4: '.'
                {
                match(input,48,FOLLOW_48_in_synpred14_InternalHelloInferrer4259); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1754:6: ( ( '?.' ) )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1754:6: ( ( '?.' ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1755:1: ( '?.' )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1755:1: ( '?.' )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1756:2: '?.'
                {
                match(input,49,FOLLOW_49_in_synpred14_InternalHelloInferrer4273); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1761:6: ( ( '*.' ) )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1761:6: ( ( '*.' ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1762:1: ( '*.' )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1762:1: ( '*.' )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1763:2: '*.'
                {
                match(input,50,FOLLOW_50_in_synpred14_InternalHelloInferrer4293); if (state.failed) return ;

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
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1872:4: ( ( '(' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1873:1: ( '(' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1873:1: ( '(' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1874:2: '('
        {
        match(input,19,FOLLOW_19_in_synpred15_InternalHelloInferrer4520); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalHelloInferrer

    // $ANTLR start synpred16_InternalHelloInferrer
    public final void synpred16_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1893:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1893:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1893:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1893:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1893:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1894:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1894:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt93=2;
        int LA93_0 = input.LA(1);

        if ( (LA93_0==RULE_ID||LA93_0==19||LA93_0==36) ) {
            alt93=1;
        }
        switch (alt93) {
            case 1 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1894:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1894:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1895:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1895:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1896:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloInferrer4572);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1898:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop92:
                do {
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==20) ) {
                        alt92=1;
                    }


                    switch (alt92) {
                	case 1 :
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1898:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred16_InternalHelloInferrer4579); if (state.failed) return ;
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1899:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1900:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1900:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1901:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloInferrer4586);
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

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1903:6: ( ( '|' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1904:1: ( '|' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1904:1: ( '|' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1905:2: '|'
        {
        match(input,52,FOLLOW_52_in_synpred16_InternalHelloInferrer4600); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalHelloInferrer

    // $ANTLR start synpred17_InternalHelloInferrer
    public final void synpred17_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1972:4: ( ( () '[' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1972:5: ( () '[' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1972:5: ( () '[' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1972:6: () '['
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1972:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:1973:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred17_InternalHelloInferrer4720); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalHelloInferrer

    // $ANTLR start synpred18_InternalHelloInferrer
    public final void synpred18_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2163:3: ( ( () '[' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2163:4: ( () '[' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2163:4: ( () '[' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2163:5: () '['
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2163:5: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2164:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred18_InternalHelloInferrer5244); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalHelloInferrer

    // $ANTLR start synpred20_InternalHelloInferrer
    public final void synpred20_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2257:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2257:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2257:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2257:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2257:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==RULE_ID||LA95_0==19||LA95_0==36) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2257:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2257:7: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2258:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2258:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2259:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloInferrer5523);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2261:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop94:
                do {
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==20) ) {
                        alt94=1;
                    }


                    switch (alt94) {
                	case 1 :
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2261:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred20_InternalHelloInferrer5530); if (state.failed) return ;
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2262:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2263:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2263:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2264:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloInferrer5537);
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

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2266:6: ( ( '|' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2267:1: ( '|' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2267:1: ( '|' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2268:2: '|'
        {
        match(input,52,FOLLOW_52_in_synpred20_InternalHelloInferrer5551); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalHelloInferrer

    // $ANTLR start synpred22_InternalHelloInferrer
    public final void synpred22_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2627:4: ( 'else' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2627:6: 'else'
        {
        match(input,56,FOLLOW_56_in_synpred22_InternalHelloInferrer6334); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalHelloInferrer

    // $ANTLR start synpred23_InternalHelloInferrer
    public final void synpred23_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2681:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2681:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2681:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2681:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2681:6: ( ( ruleValidID ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2682:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2682:1: ( ruleValidID )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2683:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalHelloInferrer6476);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,58,FOLLOW_58_in_synpred23_InternalHelloInferrer6482); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalHelloInferrer

    // $ANTLR start synpred24_InternalHelloInferrer
    public final void synpred24_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2727:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2727:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2727:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2727:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,19,FOLLOW_19_in_synpred24_InternalHelloInferrer6558); if (state.failed) return ;
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2728:1: ( ( ruleValidID ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2729:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2729:1: ( ruleValidID )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:2730:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalHelloInferrer6565);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,58,FOLLOW_58_in_synpred24_InternalHelloInferrer6571); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalHelloInferrer

    // $ANTLR start synpred25_InternalHelloInferrer
    public final void synpred25_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3311:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3311:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3311:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3311:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3311:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3312:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3312:1: ( ruleJvmTypeReference )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3313:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalHelloInferrer7836);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3315:2: ( ( ruleValidID ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3316:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3316:1: ( ruleValidID )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3317:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalHelloInferrer7845);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalHelloInferrer

    // $ANTLR start synpred26_InternalHelloInferrer
    public final void synpred26_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3615:4: ( ( '(' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3616:1: ( '(' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3616:1: ( '(' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3617:2: '('
        {
        match(input,19,FOLLOW_19_in_synpred26_InternalHelloInferrer8407); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalHelloInferrer

    // $ANTLR start synpred27_InternalHelloInferrer
    public final void synpred27_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3636:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3636:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3636:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3636:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3636:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3637:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3637:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==RULE_ID||LA99_0==19||LA99_0==36) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3637:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3637:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3638:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3638:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3639:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloInferrer8459);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3641:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop98:
                do {
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==20) ) {
                        alt98=1;
                    }


                    switch (alt98) {
                	case 1 :
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3641:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred27_InternalHelloInferrer8466); if (state.failed) return ;
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3642:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3643:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3643:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3644:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloInferrer8473);
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

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3646:6: ( ( '|' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3647:1: ( '|' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3647:1: ( '|' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3648:2: '|'
        {
        match(input,52,FOLLOW_52_in_synpred27_InternalHelloInferrer8487); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalHelloInferrer

    // $ANTLR start synpred28_InternalHelloInferrer
    public final void synpred28_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3715:4: ( ( () '[' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3715:5: ( () '[' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3715:5: ( () '[' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3715:6: () '['
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3715:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3716:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred28_InternalHelloInferrer8607); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalHelloInferrer

    // $ANTLR start synpred29_InternalHelloInferrer
    public final void synpred29_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3858:4: ( '<' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3858:6: '<'
        {
        match(input,33,FOLLOW_33_in_synpred29_InternalHelloInferrer8994); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalHelloInferrer

    // $ANTLR start synpred30_InternalHelloInferrer
    public final void synpred30_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3907:5: ( '(' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3907:7: '('
        {
        match(input,19,FOLLOW_19_in_synpred30_InternalHelloInferrer9087); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalHelloInferrer

    // $ANTLR start synpred31_InternalHelloInferrer
    public final void synpred31_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3912:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3912:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3912:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3912:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3912:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3913:1: 
        {
        }

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3913:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt101=2;
        int LA101_0 = input.LA(1);

        if ( (LA101_0==RULE_ID||LA101_0==19||LA101_0==36) ) {
            alt101=1;
        }
        switch (alt101) {
            case 1 :
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3913:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3913:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3914:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3914:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3915:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloInferrer9117);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3917:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop100:
                do {
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==20) ) {
                        alt100=1;
                    }


                    switch (alt100) {
                	case 1 :
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3917:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred31_InternalHelloInferrer9124); if (state.failed) return ;
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3918:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3919:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3919:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3920:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloInferrer9131);
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

        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3922:6: ( ( '|' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3923:1: ( '|' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3923:1: ( '|' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3924:2: '|'
        {
        match(input,52,FOLLOW_52_in_synpred31_InternalHelloInferrer9145); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalHelloInferrer

    // $ANTLR start synpred32_InternalHelloInferrer
    public final void synpred32_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3991:4: ( ( () '[' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3991:5: ( () '[' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3991:5: ( () '[' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3991:6: () '['
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3991:6: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:3992:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred32_InternalHelloInferrer9265); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalHelloInferrer

    // $ANTLR start synpred33_InternalHelloInferrer
    public final void synpred33_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4313:2: ( ( ruleXExpression ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4314:1: ( ruleXExpression )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4314:1: ( ruleXExpression )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4315:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalHelloInferrer10067);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalHelloInferrer

    // $ANTLR start synpred34_InternalHelloInferrer
    public final void synpred34_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4384:5: ( 'catch' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4384:7: 'catch'
        {
        match(input,77,FOLLOW_77_in_synpred34_InternalHelloInferrer10212); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalHelloInferrer

    // $ANTLR start synpred35_InternalHelloInferrer
    public final void synpred35_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4403:5: ( 'finally' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4403:7: 'finally'
        {
        match(input,76,FOLLOW_76_in_synpred35_InternalHelloInferrer10242); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalHelloInferrer

    // $ANTLR start synpred37_InternalHelloInferrer
    public final void synpred37_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4551:3: ( '.' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4552:2: '.'
        {
        match(input,48,FOLLOW_48_in_synpred37_InternalHelloInferrer10589); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalHelloInferrer

    // $ANTLR start synpred38_InternalHelloInferrer
    public final void synpred38_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4675:2: ( ( () '[' ']' ) )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4675:3: ( () '[' ']' )
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4675:3: ( () '[' ']' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4675:4: () '[' ']'
        {
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4675:4: ()
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4676:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred38_InternalHelloInferrer10972); if (state.failed) return ;
        match(input,53,FOLLOW_53_in_synpred38_InternalHelloInferrer10976); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalHelloInferrer

    // $ANTLR start synpred39_InternalHelloInferrer
    public final void synpred39_InternalHelloInferrer_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4829:4: ( '<' )
        // ../org.xtext.example.helloinferrer/src-gen/org/xtext/example/helloinferrer/parser/antlr/internal/InternalHelloInferrer.g:4829:6: '<'
        {
        match(input,33,FOLLOW_33_in_synpred39_InternalHelloInferrer11336); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalHelloInferrer

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
    public final boolean synpred39_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalHelloInferrer_fragment(); // can never throw exception
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
    public final boolean synpred38_InternalHelloInferrer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalHelloInferrer_fragment(); // can never throw exception
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


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA34 dfa34 = new DFA34(this);
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
        "\13\uffff";
    static final String DFA15_eofS =
        "\1\1\12\uffff";
    static final String DFA15_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA15_maxS =
        "\1\115\1\uffff\10\0\1\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA15_specialS =
        "\2\uffff\1\6\1\7\1\1\1\0\1\5\1\4\1\3\1\2\1\uffff}>";
    static final String[] DFA15_transitionS = {
            "\5\1\7\uffff\2\1\1\uffff\3\1\2\uffff\10\1\1\2\1\3\1\4\1\5\1"+
            "\6\1\7\1\10\1\11\14\1\1\uffff\16\1\1\uffff\12\1",
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
                        int LA15_5 = input.LA(1);

                         
                        int index15_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloInferrer()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_4 = input.LA(1);

                         
                        int index15_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloInferrer()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_9 = input.LA(1);

                         
                        int index15_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloInferrer()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_8 = input.LA(1);

                         
                        int index15_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloInferrer()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloInferrer()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloInferrer()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloInferrer()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloInferrer()) ) {s = 10;}

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
    static final String DFA31_eotS =
        "\101\uffff";
    static final String DFA31_eofS =
        "\1\2\100\uffff";
    static final String DFA31_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA31_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA31_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA31_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA31_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\1\2\2\2\uffff\34\2\1\uffff\16\2\1"+
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
            return "1872:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
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
                        if ( (synpred15_InternalHelloInferrer()) ) {s = 64;}

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
        "\1\113\2\0\33\uffff";
    static final String DFA30_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA30_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA30_transitionS = {
            "\4\5\1\1\7\uffff\1\5\2\uffff\1\2\1\uffff\1\35\13\uffff\1\5\2"+
            "\uffff\1\3\3\uffff\2\5\4\uffff\1\5\4\uffff\1\5\1\4\2\uffff\1"+
            "\5\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            return "1893:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA30_0==52) && (synpred16_InternalHelloInferrer())) {s = 4;}

                        else if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_DECIMAL)||LA30_0==16||LA30_0==33||(LA30_0>=40 && LA30_0<=41)||LA30_0==46||LA30_0==51||LA30_0==55||LA30_0==57||(LA30_0>=61 && LA30_0<=63)||LA30_0==66||(LA30_0>=68 && LA30_0<=75)) ) {s = 5;}

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
        "\101\uffff";
    static final String DFA32_eofS =
        "\1\2\100\uffff";
    static final String DFA32_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA32_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA32_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA32_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA32_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\3\2\2\uffff\33\2\1\1\1\uffff\16\2\1"+
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
            return "1972:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
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
                        if ( (synpred17_InternalHelloInferrer()) ) {s = 64;}

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
    static final String DFA34_eotS =
        "\16\uffff";
    static final String DFA34_eofS =
        "\16\uffff";
    static final String DFA34_minS =
        "\1\4\15\uffff";
    static final String DFA34_maxS =
        "\1\113\15\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA34_specialS =
        "\16\uffff}>";
    static final String[] DFA34_transitionS = {
            "\4\5\1\4\7\uffff\1\2\2\uffff\1\15\15\uffff\1\4\21\uffff\1\5"+
            "\3\uffff\1\6\1\uffff\1\3\3\uffff\1\7\1\10\1\11\2\uffff\1\4\1"+
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
            return "2013:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA38_eotS =
        "\40\uffff";
    static final String DFA38_eofS =
        "\40\uffff";
    static final String DFA38_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA38_maxS =
        "\1\113\2\0\35\uffff";
    static final String DFA38_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA38_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA38_transitionS = {
            "\4\5\1\1\7\uffff\1\5\2\uffff\1\2\15\uffff\1\5\2\uffff\1\3\3"+
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
            return "2257:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
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

                        else if ( (LA38_0==36) && (synpred20_InternalHelloInferrer())) {s = 3;}

                        else if ( (LA38_0==52) && (synpred20_InternalHelloInferrer())) {s = 4;}

                        else if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_DECIMAL)||LA38_0==16||LA38_0==33||(LA38_0>=40 && LA38_0<=41)||LA38_0==46||LA38_0==51||LA38_0==53||LA38_0==55||LA38_0==57||(LA38_0>=61 && LA38_0<=66)||(LA38_0>=68 && LA38_0<=75)) ) {s = 5;}

                         
                        input.seek(index38_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_1 = input.LA(1);

                         
                        int index38_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalHelloInferrer()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index38_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_2 = input.LA(1);

                         
                        int index38_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalHelloInferrer()) ) {s = 4;}

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
        "\101\uffff";
    static final String DFA62_eofS =
        "\1\2\100\uffff";
    static final String DFA62_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA62_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA62_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA62_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA62_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\1\2\2\2\uffff\34\2\1\uffff\16\2\1"+
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
            return "3615:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred26_InternalHelloInferrer()) ) {s = 64;}

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
        "\1\113\2\0\33\uffff";
    static final String DFA61_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA61_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA61_transitionS = {
            "\4\5\1\1\7\uffff\1\5\2\uffff\1\2\1\uffff\1\35\13\uffff\1\5\2"+
            "\uffff\1\3\3\uffff\2\5\4\uffff\1\5\4\uffff\1\5\1\4\2\uffff\1"+
            "\5\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            return "3636:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA61_0==36) && (synpred27_InternalHelloInferrer())) {s = 3;}

                        else if ( (LA61_0==52) && (synpred27_InternalHelloInferrer())) {s = 4;}

                        else if ( ((LA61_0>=RULE_STRING && LA61_0<=RULE_DECIMAL)||LA61_0==16||LA61_0==33||(LA61_0>=40 && LA61_0<=41)||LA61_0==46||LA61_0==51||LA61_0==55||LA61_0==57||(LA61_0>=61 && LA61_0<=63)||LA61_0==66||(LA61_0>=68 && LA61_0<=75)) ) {s = 5;}

                        else if ( (LA61_0==21) ) {s = 29;}

                         
                        input.seek(index61_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHelloInferrer()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_2 = input.LA(1);

                         
                        int index61_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHelloInferrer()) ) {s = 4;}

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
        "\101\uffff";
    static final String DFA63_eofS =
        "\1\2\100\uffff";
    static final String DFA63_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA63_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA63_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA63_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA63_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\3\2\2\uffff\33\2\1\1\1\uffff\16\2\1"+
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
            return "3715:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred28_InternalHelloInferrer()) ) {s = 64;}

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
        "\101\uffff";
    static final String DFA67_eofS =
        "\1\2\100\uffff";
    static final String DFA67_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA67_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA67_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\3\2\2\uffff\11\2\1\1\22\2\1\uffff\16"+
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
            return "3858:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
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
                        if ( (synpred29_InternalHelloInferrer()) ) {s = 64;}

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
        "\101\uffff";
    static final String DFA70_eofS =
        "\1\2\100\uffff";
    static final String DFA70_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA70_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA70_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\1\1\2\2\2\uffff\34\2\1\uffff\16\2\1"+
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
            return "3907:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred30_InternalHelloInferrer()) ) {s = 64;}

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
        "\1\113\2\0\33\uffff";
    static final String DFA69_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA69_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA69_transitionS = {
            "\4\5\1\1\7\uffff\1\5\2\uffff\1\2\1\uffff\1\35\13\uffff\1\5\2"+
            "\uffff\1\3\3\uffff\2\5\4\uffff\1\5\4\uffff\1\5\1\4\2\uffff\1"+
            "\5\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            return "3912:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA69_0==36) && (synpred31_InternalHelloInferrer())) {s = 3;}

                        else if ( (LA69_0==52) && (synpred31_InternalHelloInferrer())) {s = 4;}

                        else if ( ((LA69_0>=RULE_STRING && LA69_0<=RULE_DECIMAL)||LA69_0==16||LA69_0==33||(LA69_0>=40 && LA69_0<=41)||LA69_0==46||LA69_0==51||LA69_0==55||LA69_0==57||(LA69_0>=61 && LA69_0<=63)||LA69_0==66||(LA69_0>=68 && LA69_0<=75)) ) {s = 5;}

                        else if ( (LA69_0==21) ) {s = 29;}

                         
                        input.seek(index69_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA69_2 = input.LA(1);

                         
                        int index69_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloInferrer()) ) {s = 4;}

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
        "\101\uffff";
    static final String DFA71_eofS =
        "\1\2\100\uffff";
    static final String DFA71_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA71_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA71_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA71_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\3\2\2\uffff\33\2\1\1\1\uffff\16\2\1"+
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
            return "3991:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred32_InternalHelloInferrer()) ) {s = 64;}

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
        "\101\uffff";
    static final String DFA73_eofS =
        "\1\33\100\uffff";
    static final String DFA73_minS =
        "\1\4\32\0\46\uffff";
    static final String DFA73_maxS =
        "\1\115\32\0\46\uffff";
    static final String DFA73_acceptS =
        "\33\uffff\1\2\44\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\46\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\21\1\15\1\16\1\17\1\1\7\uffff\1\6\1\33\1\uffff\1\32\2\33"+
            "\2\uffff\11\33\1\10\6\33\1\4\1\3\4\33\1\2\4\33\1\12\1\uffff"+
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
            return "4313:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_2 = input.LA(1);

                         
                        int index73_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_3 = input.LA(1);

                         
                        int index73_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA73_4 = input.LA(1);

                         
                        int index73_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA73_5 = input.LA(1);

                         
                        int index73_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA73_6 = input.LA(1);

                         
                        int index73_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA73_7 = input.LA(1);

                         
                        int index73_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA73_8 = input.LA(1);

                         
                        int index73_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA73_9 = input.LA(1);

                         
                        int index73_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA73_10 = input.LA(1);

                         
                        int index73_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA73_11 = input.LA(1);

                         
                        int index73_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA73_12 = input.LA(1);

                         
                        int index73_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA73_13 = input.LA(1);

                         
                        int index73_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA73_14 = input.LA(1);

                         
                        int index73_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA73_15 = input.LA(1);

                         
                        int index73_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA73_16 = input.LA(1);

                         
                        int index73_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA73_17 = input.LA(1);

                         
                        int index73_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA73_18 = input.LA(1);

                         
                        int index73_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA73_19 = input.LA(1);

                         
                        int index73_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA73_20 = input.LA(1);

                         
                        int index73_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA73_21 = input.LA(1);

                         
                        int index73_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA73_22 = input.LA(1);

                         
                        int index73_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA73_23 = input.LA(1);

                         
                        int index73_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA73_24 = input.LA(1);

                         
                        int index73_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA73_25 = input.LA(1);

                         
                        int index73_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index73_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA73_26 = input.LA(1);

                         
                        int index73_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloInferrer()) ) {s = 64;}

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
        "\101\uffff";
    static final String DFA88_eofS =
        "\1\2\100\uffff";
    static final String DFA88_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA88_maxS =
        "\1\115\1\0\77\uffff";
    static final String DFA88_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA88_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA88_transitionS = {
            "\5\2\7\uffff\2\2\1\uffff\3\2\2\uffff\11\2\1\1\22\2\1\uffff\16"+
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
            return "4829:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
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
                        if ( (synpred39_InternalHelloInferrer()) ) {s = 64;}

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
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment980 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1030 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1083 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
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
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1431 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1454 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOr1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1637 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1690 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1713 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpAnd1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1896 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1949 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
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
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2296 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2319 = new BitSet(new long[]{0x00000003E0000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpCompare2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpCompare2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpCompare2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpCompare2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2562 = new BitSet(new long[]{0x000000FF00000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2615 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2638 = new BitSet(new long[]{0x000000FF00000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOther2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpOther2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2784 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2815 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2871 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2902 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpOther2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpOther2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpOther2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3092 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3145 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3168 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpAdd3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpAdd3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3372 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3425 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3448 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpMulti3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpMulti3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpMulti3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpMulti3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3701 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpUnary3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpUnary3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpUnary3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3971 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleXCastedExpression4006 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4029 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4124 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall4173 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4196 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4212 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4234 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall4320 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_49_in_ruleXMemberFeatureCall4344 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_50_in_ruleXMemberFeatureCall4381 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_33_in_ruleXMemberFeatureCall4410 = new BitSet(new long[]{0x0000001000080100L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4431 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_20_in_ruleXMemberFeatureCall4444 = new BitSet(new long[]{0x0000001000080100L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4465 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_32_in_ruleXMemberFeatureCall4479 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4504 = new BitSet(new long[]{0x000F000000080002L});
    public static final BitSet FOLLOW_19_in_ruleXMemberFeatureCall4538 = new BitSet(new long[]{0xE2984312002901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4623 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4651 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleXMemberFeatureCall4664 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4685 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleXMemberFeatureCall4702 = new BitSet(new long[]{0x000F000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4737 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXClosure5504 = new BitSet(new long[]{0xE2B84312000901F0L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5577 = new BitSet(new long[]{0x0010000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXClosure5590 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5611 = new BitSet(new long[]{0x0010000000100000L});
    public static final BitSet FOLLOW_52_in_ruleXClosure5633 = new BitSet(new long[]{0xE2A84302000901F0L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5670 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXClosure5682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5784 = new BitSet(new long[]{0xE2C84302000901F2L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_54_in_ruleXExpressionInClosure5797 = new BitSet(new long[]{0xE2884302000901F2L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5955 = new BitSet(new long[]{0x0010000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXShortClosure5968 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5989 = new BitSet(new long[]{0x0010000000100000L});
    public static final BitSet FOLLOW_52_in_ruleXShortClosure6011 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleXParenthesizedExpression6130 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6152 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXParenthesizedExpression6163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXIfExpression6255 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXIfExpression6267 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6288 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXIfExpression6300 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6321 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXIfExpression6342 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6458 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6501 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression6513 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6537 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_19_in_ruleXSwitchExpression6581 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6602 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression6614 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6637 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXSwitchExpression6649 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXSwitchExpression6663 = new BitSet(new long[]{0x1400001000080100L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6684 = new BitSet(new long[]{0x1C000010000A0100L});
    public static final BitSet FOLLOW_59_in_ruleXSwitchExpression6698 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression6710 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6731 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression6745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6837 = new BitSet(new long[]{0x1400000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXCasePart6851 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6872 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXCasePart6886 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXForLoopExpression6999 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXForLoopExpression7011 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7032 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXForLoopExpression7044 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7065 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXForLoopExpression7077 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXWhileExpression7190 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXWhileExpression7202 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7223 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXWhileExpression7235 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXDoWhileExpression7348 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7369 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleXDoWhileExpression7381 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXDoWhileExpression7393 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7414 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXDoWhileExpression7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleXBlockExpression7518 = new BitSet(new long[]{0xE2884302000B01F0L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7540 = new BitSet(new long[]{0xE2C84302000B01F0L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_54_in_ruleXBlockExpression7553 = new BitSet(new long[]{0xE2884302000B01F0L,0x0000000000000FF7L});
    public static final BitSet FOLLOW_17_in_ruleXBlockExpression7569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXVariableDeclaration7787 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_65_in_ruleXVariableDeclaration7818 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7866 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7887 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7916 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleXVariableDeclaration7930 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8045 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8159 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8283 = new BitSet(new long[]{0x0000000200000100L,0x0000000000000004L});
    public static final BitSet FOLLOW_33_in_ruleXFeatureCall8297 = new BitSet(new long[]{0x0000001000080100L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8318 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_20_in_ruleXFeatureCall8331 = new BitSet(new long[]{0x0000001000080100L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8352 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_32_in_ruleXFeatureCall8366 = new BitSet(new long[]{0x0000000200000100L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8391 = new BitSet(new long[]{0x0008000000080002L});
    public static final BitSet FOLLOW_19_in_ruleXFeatureCall8425 = new BitSet(new long[]{0xE2984312002901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8510 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8538 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleXFeatureCall8551 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8572 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleXFeatureCall8589 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleIdOrSuper8744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleStaticQualifier8861 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXConstructorCall8958 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8981 = new BitSet(new long[]{0x0008000200080002L});
    public static final BitSet FOLLOW_33_in_ruleXConstructorCall9002 = new BitSet(new long[]{0x0000001000080100L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9024 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_20_in_ruleXConstructorCall9037 = new BitSet(new long[]{0x0000001000080100L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9058 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_32_in_ruleXConstructorCall9072 = new BitSet(new long[]{0x0008000000080002L});
    public static final BitSet FOLLOW_19_in_ruleXConstructorCall9095 = new BitSet(new long[]{0xE2984312002901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9168 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9196 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleXConstructorCall9209 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9230 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleXConstructorCall9247 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXBooleanLiteral9376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXBooleanLiteral9400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXNullLiteral9506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXTypeLiteral9801 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXTypeLiteral9813 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9836 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXTypeLiteral9848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXThrowExpression9940 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXReturnExpression10053 = new BitSet(new long[]{0xE2884302000901F2L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXTryCatchFinallyExpression10177 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10228 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_76_in_ruleXTryCatchFinallyExpression10250 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXTryCatchFinallyExpression10294 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXCatchClause10408 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXCatchClause10421 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10442 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXCatchClause10454 = new BitSet(new long[]{0xE2884302000901F0L,0x0000000000000FF4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10570 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleQualifiedName10598 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10621 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10758 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10784 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleNumber10804 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10957 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleJvmTypeReference10995 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleJvmTypeReference11007 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleXFunctionTypeRef11122 = new BitSet(new long[]{0x0000001000280100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11144 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleXFunctionTypeRef11157 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11178 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleXFunctionTypeRef11194 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleXFunctionTypeRef11208 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11323 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleJvmParameterizedTypeReference11344 = new BitSet(new long[]{0x0000001000080100L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11366 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_20_in_ruleJvmParameterizedTypeReference11379 = new BitSet(new long[]{0x0000001000080100L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11400 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_32_in_ruleJvmParameterizedTypeReference11414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmWildcardTypeReference11627 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008004L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleJvmUpperBound11761 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJvmUpperBoundAnded11865 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleJvmLowerBound11969 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloInferrer1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalHelloInferrer1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalHelloInferrer1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalHelloInferrer1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred5_InternalHelloInferrer2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalHelloInferrer2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalHelloInferrer2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred8_InternalHelloInferrer2799 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred8_InternalHelloInferrer2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred9_InternalHelloInferrer2886 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_synpred9_InternalHelloInferrer2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalHelloInferrer3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalHelloInferrer3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred12_InternalHelloInferrer3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred13_InternalHelloInferrer4141 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalHelloInferrer4150 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHelloInferrer4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred14_InternalHelloInferrer4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred14_InternalHelloInferrer4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred14_InternalHelloInferrer4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred15_InternalHelloInferrer4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloInferrer4572 = new BitSet(new long[]{0x0010000000100000L});
    public static final BitSet FOLLOW_20_in_synpred16_InternalHelloInferrer4579 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloInferrer4586 = new BitSet(new long[]{0x0010000000100000L});
    public static final BitSet FOLLOW_52_in_synpred16_InternalHelloInferrer4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred17_InternalHelloInferrer4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred18_InternalHelloInferrer5244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloInferrer5523 = new BitSet(new long[]{0x0010000000100000L});
    public static final BitSet FOLLOW_20_in_synpred20_InternalHelloInferrer5530 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloInferrer5537 = new BitSet(new long[]{0x0010000000100000L});
    public static final BitSet FOLLOW_52_in_synpred20_InternalHelloInferrer5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred22_InternalHelloInferrer6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalHelloInferrer6476 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_synpred23_InternalHelloInferrer6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred24_InternalHelloInferrer6558 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalHelloInferrer6565 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_synpred24_InternalHelloInferrer6571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalHelloInferrer7836 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalHelloInferrer7845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred26_InternalHelloInferrer8407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloInferrer8459 = new BitSet(new long[]{0x0010000000100000L});
    public static final BitSet FOLLOW_20_in_synpred27_InternalHelloInferrer8466 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloInferrer8473 = new BitSet(new long[]{0x0010000000100000L});
    public static final BitSet FOLLOW_52_in_synpred27_InternalHelloInferrer8487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred28_InternalHelloInferrer8607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred29_InternalHelloInferrer8994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred30_InternalHelloInferrer9087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloInferrer9117 = new BitSet(new long[]{0x0010000000100000L});
    public static final BitSet FOLLOW_20_in_synpred31_InternalHelloInferrer9124 = new BitSet(new long[]{0x0000001000080100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloInferrer9131 = new BitSet(new long[]{0x0010000000100000L});
    public static final BitSet FOLLOW_52_in_synpred31_InternalHelloInferrer9145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred32_InternalHelloInferrer9265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalHelloInferrer10067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred34_InternalHelloInferrer10212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_synpred35_InternalHelloInferrer10242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred37_InternalHelloInferrer10589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred38_InternalHelloInferrer10972 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_synpred38_InternalHelloInferrer10976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred39_InternalHelloInferrer11336 = new BitSet(new long[]{0x0000000000000002L});

}