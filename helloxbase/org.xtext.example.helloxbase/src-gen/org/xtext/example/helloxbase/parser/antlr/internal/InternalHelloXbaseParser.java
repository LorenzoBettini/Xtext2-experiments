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

                if ( (LA1_0==13) ) {
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

                if ( (LA2_0==15) ) {
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
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImport237); if (state.failed) return current;
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

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:192:2: kw= '.*'
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:214:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:217:28: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:218:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:218:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:218:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_expression_3_0= ruleXExpression ) ) otherlv_4= '!'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleGreeting461); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleGreeting495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getFromKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:244:1: ( (lv_expression_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:245:1: (lv_expression_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:245:1: (lv_expression_3_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:246:3: lv_expression_3_0= ruleXExpression
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

                if ( (LA5_1==EOF||(LA5_1>=RULE_ID && LA5_1<=RULE_DECIMAL)||LA5_1==17||(LA5_1>=19 && LA5_1<=48)||(LA5_1>=50 && LA5_1<=76)) ) {
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
            else if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_DECIMAL)||LA5_0==17||LA5_0==28||(LA5_0>=35 && LA5_0<=36)||LA5_0==46||LA5_0==48||LA5_0==52||LA5_0==54||LA5_0==56||(LA5_0>=60 && LA5_0<=62)||LA5_0==65||(LA5_0>=67 && LA5_0<=74)) ) {
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

                    if ( (LA4_0==19) ) {
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

                if ( (LA6_0==20) ) {
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

                if ( (LA7_0==21) ) {
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

                if ( (LA8_0==22) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred4_InternalHelloXbase()) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==23) ) {
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:770:2: kw= '=='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpEquality1818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:777:2: kw= '!='
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:799:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:802:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:803:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:803:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:804:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:812:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop10:
            do {
                int alt10=3;
                switch ( input.LA(1) ) {
                case 27:
                    {
                    int LA10_2 = input.LA(2);

                    if ( (synpred6_InternalHelloXbase()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 28:
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

                    if ( (synpred5_InternalHelloXbase()) ) {
                        alt10=1;
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
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:812:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:812:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:812:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
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

            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXRelationalExpression1970); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:824:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:825:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:825:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:826:3: lv_type_3_0= ruleJvmTypeReference
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
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:843:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:843:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:843:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:843:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:843:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:848:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:848:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:848:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:849:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:854:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:855:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:855:1: ( ruleOpCompare )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:856:3: ruleOpCompare
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:869:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:870:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:870:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:871:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:895:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:896:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:897:2: iv_ruleOpCompare= ruleOpCompare EOF
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:904:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:907:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:908:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:908:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:909:2: kw= '>='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare2166); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:916:2: kw= '<='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2185); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:923:2: kw= '>'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2204); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:930:2: kw= '<'
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:943:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:944:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:945:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:952:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:955:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:956:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:956:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:957:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:965:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:965:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:965:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:965:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:970:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:970:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:970:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:971:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:976:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:977:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:977:1: ( ruleOpOther )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:978:3: ruleOpOther
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:991:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:992:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:992:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:993:3: lv_rightOperand_3_0= ruleXAdditiveExpression
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1017:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1018:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1019:2: iv_ruleOpOther= ruleOpOther EOF
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1026:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1029:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1030:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1030:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt15=8;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt15=1;
                }
                break;
            case 30:
                {
                alt15=2;
                }
                break;
            case 31:
                {
                alt15=3;
                }
                break;
            case 27:
                {
                alt15=4;
                }
                break;
            case 28:
                {
                alt15=5;
                }
                break;
            case 32:
                {
                alt15=6;
                }
                break;
            case 33:
                {
                alt15=7;
                }
                break;
            case 34:
                {
                alt15=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1031:2: kw= '->'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2484); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1038:2: kw= '..'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1045:2: kw= '=>'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2522); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1051:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1051:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1052:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1057:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==27) ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1==EOF||(LA13_1>=RULE_ID && LA13_1<=RULE_DECIMAL)||LA13_1==17||LA13_1==28||(LA13_1>=35 && LA13_1<=36)||LA13_1==46||LA13_1==48||LA13_1==52||LA13_1==54||LA13_1==56||(LA13_1>=60 && LA13_1<=62)||LA13_1==65||(LA13_1>=67 && LA13_1<=74)) ) {
                            alt13=2;
                        }
                        else if ( (LA13_1==27) && (synpred8_InternalHelloXbase())) {
                            alt13=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1057:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1057:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1057:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1061:5: (kw= '>' kw= '>' )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1062:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2573); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2586); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1075:2: kw= '>'
                            {
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2607); if (state.failed) return current;
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1081:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1081:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1082:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1087:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==28) ) {
                        int LA14_1 = input.LA(2);

                        if ( (synpred9_InternalHelloXbase()) ) {
                            alt14=1;
                        }
                        else if ( (true) ) {
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
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1087:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1087:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1087:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1091:5: (kw= '<' kw= '<' )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1092:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2660); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2673); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1105:2: kw= '<'
                            {
                            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2694); if (state.failed) return current;
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1112:2: kw= '<>'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1119:2: kw= '?:'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2734); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1126:2: kw= '<=>'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOther2753); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1139:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1140:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1141:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2793);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2803); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1148:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1151:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1152:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1152:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1153:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2850);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1161:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred10_InternalHelloXbase()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==36) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred10_InternalHelloXbase()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1161:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1161:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1161:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1166:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1166:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1166:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1167:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1172:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1173:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1173:1: ( ruleOpAdd )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1174:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2903);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1187:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1188:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1188:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1189:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2926);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1213:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1214:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1215:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2965);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2976); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1222:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1225:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1226:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1226:1: (kw= '+' | kw= '-' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            else if ( (LA17_0==36) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1227:2: kw= '+'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpAdd3014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1234:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpAdd3033); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1247:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1248:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1249:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3073);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3083); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1256:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1259:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1260:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1260:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1261:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3130);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1269:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (synpred11_InternalHelloXbase()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (synpred11_InternalHelloXbase()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (synpred11_InternalHelloXbase()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA18_5 = input.LA(2);

                    if ( (synpred11_InternalHelloXbase()) ) {
                        alt18=1;
                    }


                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1269:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1269:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1269:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1274:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1274:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1274:7: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1275:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1280:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1281:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1281:1: ( ruleOpMulti )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1282:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3183);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1295:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1296:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1296:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1297:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3206);
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
            	    break loop18;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1321:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1322:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1323:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3245);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3256); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1330:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1333:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1334:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1334:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt19=1;
                }
                break;
            case 38:
                {
                alt19=2;
                }
                break;
            case 39:
                {
                alt19=3;
                }
                break;
            case 40:
                {
                alt19=4;
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1335:2: kw= '*'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3294); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1342:2: kw= '**'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpMulti3313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1349:2: kw= '/'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpMulti3332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1356:2: kw= '%'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpMulti3351); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1369:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1370:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1371:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3391);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3401); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1378:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1381:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1382:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1382:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17||(LA20_0>=35 && LA20_0<=36)) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_DECIMAL)||LA20_0==28||LA20_0==46||LA20_0==48||LA20_0==52||LA20_0==54||LA20_0==56||(LA20_0>=60 && LA20_0<=62)||LA20_0==65||(LA20_0>=67 && LA20_0<=74)) ) {
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1382:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1382:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1382:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1382:3: ()
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1383:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1388:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1389:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1389:1: ( ruleOpUnary )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1390:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3459);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1403:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1404:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1404:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1405:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3480);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1423:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3509);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1439:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1440:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1441:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3545);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3556); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1448:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1451:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1452:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1452:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt21=1;
                }
                break;
            case 36:
                {
                alt21=2;
                }
                break;
            case 35:
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1453:2: kw= '!'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleOpUnary3594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1460:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpUnary3613); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1467:2: kw= '+'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpUnary3632); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1480:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1481:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1482:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3672);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3682); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1489:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1492:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1493:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1493:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1494:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3729);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1502:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==41) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred12_InternalHelloXbase()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1502:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1502:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1502:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1504:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1504:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1504:6: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1505:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXCastedExpression3764); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1514:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1515:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1515:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1516:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3787);
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
            	    break loop22;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1540:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1541:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1542:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3825);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3835); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1549:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1552:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1553:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1553:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1554:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3882);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1562:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop30:
            do {
                int alt30=3;
                switch ( input.LA(1) ) {
                case 42:
                    {
                    int LA30_2 = input.LA(2);

                    if ( (synpred13_InternalHelloXbase()) ) {
                        alt30=1;
                    }
                    else if ( (synpred14_InternalHelloXbase()) ) {
                        alt30=2;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA30_3 = input.LA(2);

                    if ( (synpred14_InternalHelloXbase()) ) {
                        alt30=2;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA30_4 = input.LA(2);

                    if ( (synpred14_InternalHelloXbase()) ) {
                        alt30=2;
                    }


                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1562:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1562:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1562:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1562:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1562:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1568:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1568:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1568:26: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1569:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall3931); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1578:1: ( ( ruleValidID ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1579:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1579:1: ( ruleValidID )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1580:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3954);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3970);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1601:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1602:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1602:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1603:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3992);
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
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1620:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1620:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1620:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1620:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1620:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1636:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1636:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1636:8: ()
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1637:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1642:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt23=3;
            	    switch ( input.LA(1) ) {
            	    case 42:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1642:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4078); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1647:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1647:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1648:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1648:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1649:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4102); if (state.failed) return current;
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
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1663:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1663:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1664:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1664:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1665:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4139); if (state.failed) return current;
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1678:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==28) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1678:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall4168); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1682:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1683:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1683:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1684:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4189);
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

            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1700:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop24:
            	            do {
            	                int alt24=2;
            	                int LA24_0 = input.LA(1);

            	                if ( (LA24_0==45) ) {
            	                    alt24=1;
            	                }


            	                switch (alt24) {
            	            	case 1 :
            	            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1700:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4202); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1704:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1705:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1705:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1706:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4223);
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
            	            	    break loop24;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall4237); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1726:3: ( ( ruleValidID ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1727:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1727:1: ( ruleValidID )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1728:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4262);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1741:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt28=2;
            	    alt28 = dfa28.predict(input);
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1741:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1741:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1741:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1748:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1749:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4296); if (state.failed) return current;
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

            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1762:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt27=3;
            	            alt27 = dfa27.predict(input);
            	            switch (alt27) {
            	                case 1 :
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1762:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1762:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1762:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1779:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1780:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4381);
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
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1797:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1797:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1797:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1797:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1798:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1798:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1799:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4409);
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

            	                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1815:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop26:
            	                    do {
            	                        int alt26=2;
            	                        int LA26_0 = input.LA(1);

            	                        if ( (LA26_0==45) ) {
            	                            alt26=1;
            	                        }


            	                        switch (alt26) {
            	                    	case 1 :
            	                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1815:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4422); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1819:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1820:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1820:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1821:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4443);
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
            	                    	    break loop26;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4460); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1841:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt29=2;
            	    alt29 = dfa29.predict(input);
            	    switch (alt29) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1841:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1844:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1845:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4495);
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
            	    break loop30;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1869:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1870:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1871:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4535);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4545); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1878:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1881:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1882:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1882:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt31=13;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1883:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4592);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1893:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4619);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1903:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4646);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1913:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4673);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1923:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4700);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1933:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4727);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1943:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4754);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1953:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4781);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1963:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4808);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1973:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4835);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1983:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4862);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1993:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4889);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2003:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4916);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2019:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2020:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2021:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4951);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4961); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2028:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2031:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2032:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2032:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt32=6;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==48) && (synpred18_InternalHelloXbase())) {
                alt32=1;
            }
            else if ( ((LA32_0>=68 && LA32_0<=69)) ) {
                alt32=2;
            }
            else if ( ((LA32_0>=RULE_HEX && LA32_0<=RULE_DECIMAL)) ) {
                alt32=3;
            }
            else if ( (LA32_0==70) ) {
                alt32=4;
            }
            else if ( (LA32_0==RULE_STRING) ) {
                alt32=5;
            }
            else if ( (LA32_0==71) ) {
                alt32=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2032:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2032:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2032:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5021);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2045:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5049);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2055:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5076);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2065:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5103);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2075:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5130);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2085:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5157);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2101:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2102:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2103:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5192);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5202); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2110:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2113:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2114:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2114:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2114:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2114:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2114:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2116:5: ( () otherlv_1= '[' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2116:6: () otherlv_1= '['
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2116:6: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2117:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXClosure5262); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2126:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2126:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2141:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2141:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2141:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ID||LA34_0==31||LA34_0==46) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2141:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2141:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2142:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2142:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2143:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5335);
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

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2159:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==45) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2159:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleXClosure5348); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2163:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2164:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2164:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2165:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5369);
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
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2181:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2182:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2182:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2183:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,49,FOLLOW_49_in_ruleXClosure5391); if (state.failed) return current;
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2196:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2197:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2197:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2198:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5428);
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

            otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleXClosure5440); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2226:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2227:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2228:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5476);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5486); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2235:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2238:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2239:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2239:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2239:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2239:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2240:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2245:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_DECIMAL)||LA37_0==17||LA37_0==28||(LA37_0>=35 && LA37_0<=36)||LA37_0==46||LA37_0==48||LA37_0==52||LA37_0==54||LA37_0==56||(LA37_0>=60 && LA37_0<=65)||(LA37_0>=67 && LA37_0<=74)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2245:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2245:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2246:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2246:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2247:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5542);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2263:2: (otherlv_2= ';' )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==51) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2263:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleXExpressionInClosure5555); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2275:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2276:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2277:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5595);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5605); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2284:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2287:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2288:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2288:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2288:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2288:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2288:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2304:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2304:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2304:7: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2305:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2310:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID||LA39_0==31||LA39_0==46) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2310:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2310:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2311:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2311:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2312:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5713);
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

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2328:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==45) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2328:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXShortClosure5726); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2332:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2333:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2333:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2334:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5747);
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
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2350:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2351:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2351:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2352:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,49,FOLLOW_49_in_ruleXShortClosure5769); if (state.failed) return current;
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2365:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2366:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2366:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2367:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5805);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2391:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2392:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2393:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5841);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5851); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2400:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2403:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2404:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2404:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2404:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleXParenthesizedExpression5888); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5910);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXParenthesizedExpression5921); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2429:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2430:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2431:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5957);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5967); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2438:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2441:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2442:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2442:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2442:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2442:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2443:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXIfExpression6013); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXIfExpression6025); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2456:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2457:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2457:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2458:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6046);
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

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXIfExpression6058); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2478:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2479:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2479:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2480:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6079);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2496:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==53) ) {
                int LA40_1 = input.LA(2);

                if ( (synpred22_InternalHelloXbase()) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2496:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2496:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2496:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleXIfExpression6100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2501:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2502:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2502:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2503:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6122);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2527:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2528:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2529:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6160);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6170); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2536:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2539:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2540:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2540:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2540:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2540:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2541:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2550:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_DECIMAL)||LA42_0==17||LA42_0==28||(LA42_0>=35 && LA42_0<=36)||LA42_0==48||LA42_0==52||LA42_0==54||LA42_0==56||(LA42_0>=60 && LA42_0<=62)||LA42_0==65||(LA42_0>=67 && LA42_0<=74)) ) {
                alt42=1;
            }
            else if ( (LA42_0==46) ) {
                int LA42_2 = input.LA(2);

                if ( (LA42_2==RULE_ID) ) {
                    int LA42_3 = input.LA(3);

                    if ( ((LA42_3>=18 && LA42_3<=44)||(LA42_3>=46 && LA42_3<=48)||LA42_3==66) ) {
                        alt42=1;
                    }
                    else if ( (LA42_3==55) && (synpred24_InternalHelloXbase())) {
                        alt42=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA42_2>=RULE_STRING && LA42_2<=RULE_DECIMAL)||LA42_2==17||LA42_2==28||(LA42_2>=35 && LA42_2<=36)||LA42_2==46||LA42_2==48||LA42_2==52||LA42_2==54||LA42_2==56||(LA42_2>=60 && LA42_2<=62)||LA42_2==65||(LA42_2>=67 && LA42_2<=74)) ) {
                    alt42=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2550:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2550:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2550:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2550:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID) ) {
                        int LA41_1 = input.LA(2);

                        if ( (LA41_1==55) && (synpred23_InternalHelloXbase())) {
                            alt41=1;
                        }
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2550:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2555:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2555:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2555:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2556:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2556:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2557:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6259);
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

                            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6271); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2577:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2578:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2578:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2579:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6295);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2596:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2596:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2596:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2596:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2596:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2602:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2602:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleXSwitchExpression6339); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2606:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2607:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2607:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2608:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6360);
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

                    otherlv_7=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2628:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2629:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2629:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2630:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6395);
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

                    otherlv_9=(Token)match(input,47,FOLLOW_47_in_ruleXSwitchExpression6407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6421); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2654:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID||LA43_0==31||LA43_0==46||LA43_0==55||LA43_0==59) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2655:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2655:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2656:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6442);
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
            	    if ( cnt43 >= 1 ) break loop43;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2672:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==57) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2672:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6456); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6468); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2680:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2681:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2681:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2682:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6489);
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

            otherlv_15=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression6503); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2710:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2711:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2712:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6539);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6549); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2719:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2722:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2723:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2723:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2723:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2723:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==31||LA45_0==46) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2724:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2724:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2725:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6595);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2741:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==59) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2741:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXCasePart6609); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2745:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2746:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2746:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2747:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6630);
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

            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleXCasePart6644); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2767:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2768:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2768:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2769:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6665);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2793:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2794:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2795:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6701);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6711); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2802:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2805:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2806:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2806:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2806:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2806:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2807:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXForLoopExpression6757); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXForLoopExpression6769); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2820:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2821:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2821:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2822:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6790);
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

            otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleXForLoopExpression6802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2842:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2843:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2843:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2844:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6823);
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

            otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleXForLoopExpression6835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2864:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2865:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2865:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2866:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6856);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2890:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2891:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2892:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6892);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6902); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2899:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2902:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2903:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2903:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2903:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2903:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2904:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXWhileExpression6948); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXWhileExpression6960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2917:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2918:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2918:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2919:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6981);
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

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXWhileExpression6993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2939:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2940:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2940:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2941:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7014);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2965:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2966:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2967:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7050);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7060); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2974:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2977:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2978:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2978:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2978:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2978:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2979:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXDoWhileExpression7106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2988:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2989:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2989:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2990:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7127);
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

            otherlv_3=(Token)match(input,61,FOLLOW_61_in_ruleXDoWhileExpression7139); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleXDoWhileExpression7151); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3014:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3015:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3015:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3016:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7172);
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

            otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleXDoWhileExpression7184); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3044:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3045:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3046:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7220);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7230); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3053:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3056:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3057:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3057:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3057:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3057:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3058:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXBlockExpression7276); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3067:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_DECIMAL)||LA48_0==17||LA48_0==28||(LA48_0>=35 && LA48_0<=36)||LA48_0==46||LA48_0==48||LA48_0==52||LA48_0==54||LA48_0==56||(LA48_0>=60 && LA48_0<=65)||(LA48_0>=67 && LA48_0<=74)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3067:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3067:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3068:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3068:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3069:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7298);
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

            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3085:2: (otherlv_3= ';' )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==51) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3085:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleXBlockExpression7311); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_4=(Token)match(input,58,FOLLOW_58_in_ruleXBlockExpression7327); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3101:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3102:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3103:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7363);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7373); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3110:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3113:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3114:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3114:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=63 && LA49_0<=64)) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_DECIMAL)||LA49_0==17||LA49_0==28||(LA49_0>=35 && LA49_0<=36)||LA49_0==46||LA49_0==48||LA49_0==52||LA49_0==54||LA49_0==56||(LA49_0>=60 && LA49_0<=62)||LA49_0==65||(LA49_0>=67 && LA49_0<=74)) ) {
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3115:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7420);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3125:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7447);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3141:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3142:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3143:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7482);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7492); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3150:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3153:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3154:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3154:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3154:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3154:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3155:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3160:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==63) ) {
                alt50=1;
            }
            else if ( (LA50_0==64) ) {
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3160:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3160:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3161:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3161:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3162:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,63,FOLLOW_63_in_ruleXVariableDeclaration7545); if (state.failed) return current;
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3176:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleXVariableDeclaration7576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3180:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred25_InternalHelloXbase()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA51_0==46) && (synpred25_InternalHelloXbase())) {
                alt51=1;
            }
            else if ( (LA51_0==31) && (synpred25_InternalHelloXbase())) {
                alt51=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3180:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3180:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3180:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3188:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3188:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3188:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3189:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3189:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3190:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7624);
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

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3206:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3207:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3207:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3208:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7645);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3225:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3225:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3226:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3226:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3227:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7674);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3243:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==18) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3243:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleXVariableDeclaration7688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3247:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3248:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3248:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3249:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7709);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3273:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3274:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3275:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7747);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7757); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3282:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3285:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3286:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3286:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3286:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3286:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==RULE_ID||LA53_1==28||LA53_1==42||LA53_1==48) ) {
                    alt53=1;
                }
            }
            else if ( (LA53_0==31||LA53_0==46) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3287:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3287:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3288:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7803);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3304:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3305:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3305:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3306:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7825);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3330:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3331:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3332:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7861);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7871); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3339:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3342:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3343:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3343:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3343:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3343:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3344:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3344:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3345:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7917);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3361:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3362:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3362:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3363:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7938);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3387:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3388:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3389:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7974);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7984); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3396:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3399:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3400:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3400:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3400:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3400:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3401:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3406:2: ( ( ruleStaticQualifier ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==66) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3407:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3407:1: ( ruleStaticQualifier )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3408:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8041);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3421:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==28) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3421:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall8055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3425:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3426:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3426:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3427:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8076);
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

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3443:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==45) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3443:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXFeatureCall8089); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3447:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3448:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3448:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3449:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8110);
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
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall8124); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3469:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3470:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3470:1: ( ruleIdOrSuper )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3471:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8149);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3484:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3484:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3484:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3484:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3491:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3492:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,46,FOLLOW_46_in_ruleXFeatureCall8183); if (state.failed) return current;
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

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3505:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt58=3;
                    alt58 = dfa58.predict(input);
                    switch (alt58) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3505:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3505:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3505:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3522:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3523:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8268);
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
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3540:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3540:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3540:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3540:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3541:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3541:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3542:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8296);
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

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3558:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop57:
                            do {
                                int alt57=2;
                                int LA57_0 = input.LA(1);

                                if ( (LA57_0==45) ) {
                                    alt57=1;
                                }


                                switch (alt57) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3558:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,45,FOLLOW_45_in_ruleXFeatureCall8309); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3562:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3563:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3563:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3564:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8330);
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
                            	    break loop57;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,47,FOLLOW_47_in_ruleXFeatureCall8347); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3584:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3584:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3587:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3588:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8382);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3612:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3613:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3614:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8420);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8431); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3621:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3624:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3625:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3625:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            else if ( (LA61_0==65) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3626:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8478);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3638:2: kw= 'super'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleIdOrSuper8502); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3651:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3652:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3653:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8543);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8554); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3660:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3663:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3664:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3664:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_ID) ) {
                    int LA62_2 = input.LA(2);

                    if ( (LA62_2==66) ) {
                        alt62=1;
                    }


                }


                switch (alt62) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3665:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8601);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,66,FOLLOW_66_in_ruleStaticQualifier8619); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3689:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3690:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3691:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8660);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8670); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3698:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3701:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3702:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3702:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3702:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3702:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3703:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXConstructorCall8716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3712:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3713:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3713:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3714:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8739);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3727:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3727:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3727:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3727:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall8760); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3732:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3733:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3733:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3734:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8782);
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

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3750:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==45) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3750:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleXConstructorCall8795); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3754:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3755:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3755:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3756:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8816);
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
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall8830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3776:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3776:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3776:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3776:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleXConstructorCall8853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3781:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt66=3;
                    alt66 = dfa66.predict(input);
                    switch (alt66) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3781:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3781:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3781:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3798:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3799:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8926);
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
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3816:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3816:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3816:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3816:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3817:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3817:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3818:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8954);
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

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3834:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop65:
                            do {
                                int alt65=2;
                                int LA65_0 = input.LA(1);

                                if ( (LA65_0==45) ) {
                                    alt65=1;
                                }


                                switch (alt65) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3834:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,45,FOLLOW_45_in_ruleXConstructorCall8967); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3838:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3839:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3839:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3840:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8988);
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
                            	    break loop65;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,47,FOLLOW_47_in_ruleXConstructorCall9005); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3860:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3860:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3863:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3864:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9040);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3888:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3889:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3890:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9077);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9087); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3897:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3900:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3901:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3901:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3901:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3901:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3902:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3907:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==68) ) {
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3907:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXBooleanLiteral9134); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3912:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3912:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3913:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3913:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3914:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,69,FOLLOW_69_in_ruleXBooleanLiteral9158); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3935:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3936:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3937:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9208);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9218); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3944:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3947:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3948:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3948:1: ( () otherlv_1= 'null' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3948:2: () otherlv_1= 'null'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3948:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3949:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXNullLiteral9264); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3966:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3967:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3968:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9300);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9310); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3975:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3978:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3979:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3979:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3979:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3979:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3980:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3985:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3986:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3986:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3987:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9365);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4011:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4012:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4013:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9401);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9411); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4020:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4023:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4024:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4024:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4024:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4024:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4025:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4030:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4031:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4031:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4032:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9462); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4056:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4057:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4058:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9503);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9513); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4065:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4068:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4069:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4069:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4069:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4069:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4070:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXTypeLiteral9559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXTypeLiteral9571); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4083:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4084:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4084:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4085:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9594);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXTypeLiteral9606); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4110:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4111:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4112:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9642);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9652); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4119:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4122:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4123:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4123:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4123:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4123:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4124:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXThrowExpression9698); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4133:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4134:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4134:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4135:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9719);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4159:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4160:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4161:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9755);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9765); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4168:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4171:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4172:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4172:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4172:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4172:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4173:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXReturnExpression9811); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4182:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4182:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4187:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4188:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9842);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4212:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4213:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4214:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9879);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9889); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4221:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4224:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4225:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4225:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4225:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4225:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4226:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression9935); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4235:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4236:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4236:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4237:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9956);
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

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4253:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==76) ) {
                alt73=1;
            }
            else if ( (LA73_0==75) ) {
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4253:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4253:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4253:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4253:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt71=0;
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==76) ) {
                            int LA71_2 = input.LA(2);

                            if ( (synpred34_InternalHelloXbase()) ) {
                                alt71=1;
                            }


                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4253:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4255:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4256:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9986);
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
                    	    if ( cnt71 >= 1 ) break loop71;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(71, input);
                                throw eee;
                        }
                        cnt71++;
                    } while (true);

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4272:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==75) ) {
                        int LA72_1 = input.LA(2);

                        if ( (synpred35_InternalHelloXbase()) ) {
                            alt72=1;
                        }
                    }
                    switch (alt72) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4272:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4272:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4272:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,75,FOLLOW_75_in_ruleXTryCatchFinallyExpression10008); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4277:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4278:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4278:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4279:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10030);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4296:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4296:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4296:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,75,FOLLOW_75_in_ruleXTryCatchFinallyExpression10052); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4300:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4301:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4301:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4302:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10073);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4326:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4327:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4328:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10111);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10121); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4335:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4338:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4339:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4339:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4339:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4339:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4339:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleXCatchClause10166); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleXCatchClause10179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4348:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4349:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4349:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4350:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10200);
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

            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleXCatchClause10212); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4370:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4371:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4371:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4372:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10233);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4396:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4397:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4398:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10270);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10281); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4405:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4408:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4409:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4409:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4410:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10328);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4420:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==42) ) {
                    int LA74_2 = input.LA(2);

                    if ( (LA74_2==RULE_ID) ) {
                        int LA74_3 = input.LA(3);

                        if ( (synpred37_InternalHelloXbase()) ) {
                            alt74=1;
                        }


                    }


                }


                switch (alt74) {
            	case 1 :
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4420:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4420:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4420:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_ruleQualifiedName10356); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10379);
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
            	    break loop74;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4447:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4451:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4452:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10433);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10444); if (state.failed) return current;

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4462:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4466:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4467:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4467:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_HEX) ) {
                alt78=1;
            }
            else if ( ((LA78_0>=RULE_INT && LA78_0<=RULE_DECIMAL)) ) {
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4467:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4475:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4475:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4475:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4475:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
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
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4475:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10516); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4483:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10542); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4490:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==42) ) {
                        int LA77_1 = input.LA(2);

                        if ( ((LA77_1>=RULE_INT && LA77_1<=RULE_DECIMAL)) ) {
                            alt77=1;
                        }
                    }
                    switch (alt77) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4491:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,42,FOLLOW_42_in_ruleNumber10562); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4496:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
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
                                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4496:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10578); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4504:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10604); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4522:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4523:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4524:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10657);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10667); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4531:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4534:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4535:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4535:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_ID) ) {
                alt80=1;
            }
            else if ( (LA80_0==31||LA80_0==46) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4535:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4535:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4536:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10715);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4544:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==48) ) {
                            int LA79_2 = input.LA(2);

                            if ( (LA79_2==50) ) {
                                int LA79_3 = input.LA(3);

                                if ( (synpred38_InternalHelloXbase()) ) {
                                    alt79=1;
                                }


                            }


                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4544:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4547:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4547:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4547:6: ()
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4548:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleJvmTypeReference10753); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleJvmTypeReference10765); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4563:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10797);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4579:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4580:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4581:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10832);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10842); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4588:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4591:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4592:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4592:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4592:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4592:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==46) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4592:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleXFunctionTypeRef10880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4596:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==RULE_ID||LA82_0==31||LA82_0==46) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4596:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4596:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4597:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4597:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4598:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10902);
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

                            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4614:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop81:
                            do {
                                int alt81=2;
                                int LA81_0 = input.LA(1);

                                if ( (LA81_0==45) ) {
                                    alt81=1;
                                }


                                switch (alt81) {
                            	case 1 :
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4614:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXFunctionTypeRef10915); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4618:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4619:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4619:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4620:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10936);
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
                            	    break loop81;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXFunctionTypeRef10952); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleXFunctionTypeRef10966); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4644:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4645:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4645:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4646:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10987);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4670:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4671:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4672:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11023);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11033); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4679:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4682:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4683:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4683:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4683:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4683:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4684:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4684:1: ( ruleQualifiedName )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4685:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11081);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4698:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4698:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4698:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4698:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleJvmParameterizedTypeReference11102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4703:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4704:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4704:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4705:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11124);
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

                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4721:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==45) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4721:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleJvmParameterizedTypeReference11137); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4725:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4726:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4726:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4727:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11158);
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
                    	    break loop84;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleJvmParameterizedTypeReference11172); if (state.failed) return current;
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4755:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4756:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4757:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11210);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11220); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4764:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4767:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4768:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4768:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID||LA86_0==31||LA86_0==46) ) {
                alt86=1;
            }
            else if ( (LA86_0==77) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4769:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11267);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4779:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11294);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4795:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4796:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4797:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11329);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11339); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4804:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4807:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4808:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4808:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4808:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4808:2: ()
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4809:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleJvmWildcardTypeReference11385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4818:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt87=3;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==78) ) {
                alt87=1;
            }
            else if ( (LA87_0==65) ) {
                alt87=2;
            }
            switch (alt87) {
                case 1 :
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4818:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4818:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4819:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4819:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4820:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11407);
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
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4837:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4837:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4838:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4838:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4839:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11434);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4863:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4864:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4865:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11472);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11482); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4872:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4875:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4876:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4876:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4876:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleJvmUpperBound11519); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4880:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4881:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4881:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4882:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11540);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4906:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4907:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4908:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11576);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11586); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4915:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4918:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4919:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4919:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4919:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleJvmUpperBoundAnded11623); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4923:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4924:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4924:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4925:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11644);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4949:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4950:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4951:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11680);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11690); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4958:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4961:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4962:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4962:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4962:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleJvmLowerBound11727); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4966:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4967:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4967:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4968:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11748);
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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4994:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4995:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4996:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11787);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11798); if (state.failed) return current;

            }

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
    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5003:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5006:28: (this_ID_0= RULE_ID )
            // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:5007:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11837); if (state.failed) return current;
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

        match(input,24,FOLLOW_24_in_synpred5_InternalHelloXbase1951); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalHelloXbase

    // $ANTLR start synpred6_InternalHelloXbase
    public final void synpred6_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:843:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:843:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:843:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:843:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:843:10: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:844:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:844:2: ( ( ruleOpCompare ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:845:1: ( ruleOpCompare )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:845:1: ( ruleOpCompare )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:846:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalHelloXbase2022);
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
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:965:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:965:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:965:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:965:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:965:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:966:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:966:2: ( ( ruleOpOther ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:967:1: ( ruleOpOther )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:967:1: ( ruleOpOther )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:968:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalHelloXbase2341);
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
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1057:3: ( ( '>' '>' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1057:4: ( '>' '>' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1057:4: ( '>' '>' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1058:2: '>' '>'
        {
        match(input,27,FOLLOW_27_in_synpred8_InternalHelloXbase2557); if (state.failed) return ;
        match(input,27,FOLLOW_27_in_synpred8_InternalHelloXbase2562); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalHelloXbase

    // $ANTLR start synpred9_InternalHelloXbase
    public final void synpred9_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1087:3: ( ( '<' '<' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1087:4: ( '<' '<' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1087:4: ( '<' '<' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1088:2: '<' '<'
        {
        match(input,28,FOLLOW_28_in_synpred9_InternalHelloXbase2644); if (state.failed) return ;
        match(input,28,FOLLOW_28_in_synpred9_InternalHelloXbase2649); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalHelloXbase

    // $ANTLR start synpred10_InternalHelloXbase
    public final void synpred10_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1161:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1161:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1161:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1161:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1161:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1162:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1162:2: ( ( ruleOpAdd ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1163:1: ( ruleOpAdd )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1163:1: ( ruleOpAdd )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1164:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalHelloXbase2871);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalHelloXbase

    // $ANTLR start synpred11_InternalHelloXbase
    public final void synpred11_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1269:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1269:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1269:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1269:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1269:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1270:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1270:2: ( ( ruleOpMulti ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1271:1: ( ruleOpMulti )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1271:1: ( ruleOpMulti )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1272:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalHelloXbase3151);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalHelloXbase

    // $ANTLR start synpred12_InternalHelloXbase
    public final void synpred12_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1502:3: ( ( () 'as' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1502:4: ( () 'as' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1502:4: ( () 'as' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1502:5: () 'as'
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1502:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1503:1: 
        {
        }

        match(input,41,FOLLOW_41_in_synpred12_InternalHelloXbase3745); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalHelloXbase

    // $ANTLR start synpred13_InternalHelloXbase
    public final void synpred13_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1562:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1562:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1562:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1562:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1562:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1563:1: 
        {
        }

        match(input,42,FOLLOW_42_in_synpred13_InternalHelloXbase3899); if (state.failed) return ;
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1564:1: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1565:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1565:1: ( ruleValidID )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1566:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalHelloXbase3908);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHelloXbase3914);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalHelloXbase

    // $ANTLR start synpred14_InternalHelloXbase
    public final void synpred14_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1620:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1620:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1620:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1620:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1620:10: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1621:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1621:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt88=3;
        switch ( input.LA(1) ) {
        case 42:
            {
            alt88=1;
            }
            break;
        case 43:
            {
            alt88=2;
            }
            break;
        case 44:
            {
            alt88=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 88, 0, input);

            throw nvae;
        }

        switch (alt88) {
            case 1 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1621:4: '.'
                {
                match(input,42,FOLLOW_42_in_synpred14_InternalHelloXbase4017); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1623:6: ( ( '?.' ) )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1623:6: ( ( '?.' ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1624:1: ( '?.' )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1624:1: ( '?.' )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1625:2: '?.'
                {
                match(input,43,FOLLOW_43_in_synpred14_InternalHelloXbase4031); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1630:6: ( ( '*.' ) )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1630:6: ( ( '*.' ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1631:1: ( '*.' )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1631:1: ( '*.' )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1632:2: '*.'
                {
                match(input,44,FOLLOW_44_in_synpred14_InternalHelloXbase4051); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalHelloXbase

    // $ANTLR start synpred15_InternalHelloXbase
    public final void synpred15_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1741:4: ( ( '(' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1742:1: ( '(' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1742:1: ( '(' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1743:2: '('
        {
        match(input,46,FOLLOW_46_in_synpred15_InternalHelloXbase4278); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalHelloXbase

    // $ANTLR start synpred16_InternalHelloXbase
    public final void synpred16_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1762:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1762:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1762:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1762:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1762:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1763:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1763:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt90=2;
        int LA90_0 = input.LA(1);

        if ( (LA90_0==RULE_ID||LA90_0==31||LA90_0==46) ) {
            alt90=1;
        }
        switch (alt90) {
            case 1 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1763:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1763:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1764:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1764:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1765:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXbase4330);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1767:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop89:
                do {
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==45) ) {
                        alt89=1;
                    }


                    switch (alt89) {
                	case 1 :
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1767:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,45,FOLLOW_45_in_synpred16_InternalHelloXbase4337); if (state.failed) return ;
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1768:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1769:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1769:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1770:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXbase4344);
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

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1772:6: ( ( '|' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1773:1: ( '|' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1773:1: ( '|' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1774:2: '|'
        {
        match(input,49,FOLLOW_49_in_synpred16_InternalHelloXbase4358); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalHelloXbase

    // $ANTLR start synpred17_InternalHelloXbase
    public final void synpred17_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1841:4: ( ( () '[' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1841:5: ( () '[' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1841:5: ( () '[' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1841:6: () '['
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1841:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:1842:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred17_InternalHelloXbase4478); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalHelloXbase

    // $ANTLR start synpred18_InternalHelloXbase
    public final void synpred18_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2032:3: ( ( () '[' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2032:4: ( () '[' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2032:4: ( () '[' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2032:5: () '['
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2032:5: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2033:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred18_InternalHelloXbase5002); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalHelloXbase

    // $ANTLR start synpred20_InternalHelloXbase
    public final void synpred20_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2126:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2126:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2126:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2126:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2126:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt92=2;
        int LA92_0 = input.LA(1);

        if ( (LA92_0==RULE_ID||LA92_0==31||LA92_0==46) ) {
            alt92=1;
        }
        switch (alt92) {
            case 1 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2126:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2126:7: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2127:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2127:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2128:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloXbase5281);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2130:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop91:
                do {
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==45) ) {
                        alt91=1;
                    }


                    switch (alt91) {
                	case 1 :
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2130:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,45,FOLLOW_45_in_synpred20_InternalHelloXbase5288); if (state.failed) return ;
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2131:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2132:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2132:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2133:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloXbase5295);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop91;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2135:6: ( ( '|' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2136:1: ( '|' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2136:1: ( '|' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2137:2: '|'
        {
        match(input,49,FOLLOW_49_in_synpred20_InternalHelloXbase5309); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalHelloXbase

    // $ANTLR start synpred22_InternalHelloXbase
    public final void synpred22_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2496:4: ( 'else' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2496:6: 'else'
        {
        match(input,53,FOLLOW_53_in_synpred22_InternalHelloXbase6092); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalHelloXbase

    // $ANTLR start synpred23_InternalHelloXbase
    public final void synpred23_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2550:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2550:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2550:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2550:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2550:6: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2551:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2551:1: ( ruleValidID )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2552:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalHelloXbase6234);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,55,FOLLOW_55_in_synpred23_InternalHelloXbase6240); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalHelloXbase

    // $ANTLR start synpred24_InternalHelloXbase
    public final void synpred24_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2596:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2596:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2596:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2596:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,46,FOLLOW_46_in_synpred24_InternalHelloXbase6316); if (state.failed) return ;
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2597:1: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2598:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2598:1: ( ruleValidID )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:2599:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalHelloXbase6323);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,55,FOLLOW_55_in_synpred24_InternalHelloXbase6329); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalHelloXbase

    // $ANTLR start synpred25_InternalHelloXbase
    public final void synpred25_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3180:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3180:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3180:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3180:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3180:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3181:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3181:1: ( ruleJvmTypeReference )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3182:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalHelloXbase7594);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3184:2: ( ( ruleValidID ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3185:1: ( ruleValidID )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3185:1: ( ruleValidID )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3186:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalHelloXbase7603);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalHelloXbase

    // $ANTLR start synpred26_InternalHelloXbase
    public final void synpred26_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3484:4: ( ( '(' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3485:1: ( '(' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3485:1: ( '(' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3486:2: '('
        {
        match(input,46,FOLLOW_46_in_synpred26_InternalHelloXbase8165); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalHelloXbase

    // $ANTLR start synpred27_InternalHelloXbase
    public final void synpred27_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3505:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3505:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3505:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3505:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3505:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3506:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3506:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==31||LA96_0==46) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3506:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3506:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3507:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3507:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3508:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloXbase8217);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3510:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==45) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3510:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,45,FOLLOW_45_in_synpred27_InternalHelloXbase8224); if (state.failed) return ;
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3511:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3512:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3512:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3513:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloXbase8231);
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

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3515:6: ( ( '|' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3516:1: ( '|' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3516:1: ( '|' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3517:2: '|'
        {
        match(input,49,FOLLOW_49_in_synpred27_InternalHelloXbase8245); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalHelloXbase

    // $ANTLR start synpred28_InternalHelloXbase
    public final void synpred28_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3584:4: ( ( () '[' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3584:5: ( () '[' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3584:5: ( () '[' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3584:6: () '['
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3584:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3585:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred28_InternalHelloXbase8365); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalHelloXbase

    // $ANTLR start synpred29_InternalHelloXbase
    public final void synpred29_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3727:4: ( '<' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3727:6: '<'
        {
        match(input,28,FOLLOW_28_in_synpred29_InternalHelloXbase8752); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalHelloXbase

    // $ANTLR start synpred30_InternalHelloXbase
    public final void synpred30_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3776:5: ( '(' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3776:7: '('
        {
        match(input,46,FOLLOW_46_in_synpred30_InternalHelloXbase8845); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalHelloXbase

    // $ANTLR start synpred31_InternalHelloXbase
    public final void synpred31_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3781:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3781:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3781:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3781:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3781:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3782:1: 
        {
        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3782:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==RULE_ID||LA98_0==31||LA98_0==46) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3782:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3782:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3783:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3783:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3784:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloXbase8875);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3786:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop97:
                do {
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==45) ) {
                        alt97=1;
                    }


                    switch (alt97) {
                	case 1 :
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3786:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,45,FOLLOW_45_in_synpred31_InternalHelloXbase8882); if (state.failed) return ;
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3787:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3788:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3788:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3789:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloXbase8889);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop97;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3791:6: ( ( '|' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3792:1: ( '|' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3792:1: ( '|' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3793:2: '|'
        {
        match(input,49,FOLLOW_49_in_synpred31_InternalHelloXbase8903); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalHelloXbase

    // $ANTLR start synpred32_InternalHelloXbase
    public final void synpred32_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3860:4: ( ( () '[' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3860:5: ( () '[' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3860:5: ( () '[' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3860:6: () '['
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3860:6: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:3861:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred32_InternalHelloXbase9023); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalHelloXbase

    // $ANTLR start synpred33_InternalHelloXbase
    public final void synpred33_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4182:2: ( ( ruleXExpression ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4183:1: ( ruleXExpression )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4183:1: ( ruleXExpression )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4184:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalHelloXbase9825);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalHelloXbase

    // $ANTLR start synpred34_InternalHelloXbase
    public final void synpred34_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4253:5: ( 'catch' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4253:7: 'catch'
        {
        match(input,76,FOLLOW_76_in_synpred34_InternalHelloXbase9970); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalHelloXbase

    // $ANTLR start synpred35_InternalHelloXbase
    public final void synpred35_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4272:5: ( 'finally' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4272:7: 'finally'
        {
        match(input,75,FOLLOW_75_in_synpred35_InternalHelloXbase10000); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalHelloXbase

    // $ANTLR start synpred37_InternalHelloXbase
    public final void synpred37_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4420:3: ( '.' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4421:2: '.'
        {
        match(input,42,FOLLOW_42_in_synpred37_InternalHelloXbase10347); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalHelloXbase

    // $ANTLR start synpred38_InternalHelloXbase
    public final void synpred38_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4544:2: ( ( () '[' ']' ) )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4544:3: ( () '[' ']' )
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4544:3: ( () '[' ']' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4544:4: () '[' ']'
        {
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4544:4: ()
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4545:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred38_InternalHelloXbase10730); if (state.failed) return ;
        match(input,50,FOLLOW_50_in_synpred38_InternalHelloXbase10734); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalHelloXbase

    // $ANTLR start synpred39_InternalHelloXbase
    public final void synpred39_InternalHelloXbase_fragment() throws RecognitionException {   
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4698:4: ( '<' )
        // ../org.xtext.example.helloxbase/src-gen/org/xtext/example/helloxbase/parser/antlr/internal/InternalHelloXbase.g:4698:6: '<'
        {
        match(input,28,FOLLOW_28_in_synpred39_InternalHelloXbase11094); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalHelloXbase

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
    public final boolean synpred34_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalHelloXbase_fragment(); // can never throw exception
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
    public final boolean synpred29_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalHelloXbase_fragment(); // can never throw exception
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
    public final boolean synpred38_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalHelloXbase_fragment(); // can never throw exception
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
    public final boolean synpred17_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalHelloXbase_fragment(); // can never throw exception
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
    public final boolean synpred39_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalHelloXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalHelloXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalHelloXbase_fragment(); // can never throw exception
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


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA85 dfa85 = new DFA85(this);
    static final String DFA12_eotS =
        "\13\uffff";
    static final String DFA12_eofS =
        "\1\1\12\uffff";
    static final String DFA12_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA12_maxS =
        "\1\114\1\uffff\10\0\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA12_specialS =
        "\2\uffff\1\2\1\4\1\1\1\0\1\5\1\6\1\7\1\3\1\uffff}>";
    static final String[] DFA12_transitionS = {
            "\5\1\10\uffff\1\1\1\uffff\10\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10"+
            "\1\11\16\1\1\uffff\20\1\1\uffff\12\1",
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

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "()* loopback of 965:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalHelloXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\101\uffff";
    static final String DFA28_eofS =
        "\1\2\100\uffff";
    static final String DFA28_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA28_maxS =
        "\1\114\1\0\77\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA28_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA28_transitionS = {
            "\5\2\10\uffff\1\2\1\uffff\33\2\1\1\2\2\1\uffff\20\2\1\uffff"+
            "\12\2",
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
            return "1741:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
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
                        if ( (synpred15_InternalHelloXbase()) ) {s = 64;}

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
    static final String DFA27_eotS =
        "\36\uffff";
    static final String DFA27_eofS =
        "\36\uffff";
    static final String DFA27_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA27_maxS =
        "\1\112\2\0\33\uffff";
    static final String DFA27_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA27_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA27_transitionS = {
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
            return "1762:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_0 = input.LA(1);

                         
                        int index27_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_0==RULE_ID) ) {s = 1;}

                        else if ( (LA27_0==46) ) {s = 2;}

                        else if ( (LA27_0==31) && (synpred16_InternalHelloXbase())) {s = 3;}

                        else if ( (LA27_0==49) && (synpred16_InternalHelloXbase())) {s = 4;}

                        else if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_DECIMAL)||LA27_0==17||LA27_0==28||(LA27_0>=35 && LA27_0<=36)||LA27_0==48||LA27_0==52||LA27_0==54||LA27_0==56||(LA27_0>=60 && LA27_0<=62)||LA27_0==65||(LA27_0>=67 && LA27_0<=74)) ) {s = 5;}

                        else if ( (LA27_0==47) ) {s = 29;}

                         
                        input.seek(index27_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_2 = input.LA(1);

                         
                        int index27_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index27_2);
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
    static final String DFA29_eotS =
        "\101\uffff";
    static final String DFA29_eofS =
        "\1\2\100\uffff";
    static final String DFA29_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA29_maxS =
        "\1\114\1\0\77\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA29_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA29_transitionS = {
            "\5\2\10\uffff\1\2\1\uffff\35\2\1\1\1\uffff\20\2\1\uffff\12\2",
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
            return "1841:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
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
                        if ( (synpred17_InternalHelloXbase()) ) {s = 64;}

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
    static final String DFA31_eotS =
        "\16\uffff";
    static final String DFA31_eofS =
        "\16\uffff";
    static final String DFA31_minS =
        "\1\4\15\uffff";
    static final String DFA31_maxS =
        "\1\112\15\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA31_specialS =
        "\16\uffff}>";
    static final String[] DFA31_transitionS = {
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
            return "1882:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA35_eotS =
        "\40\uffff";
    static final String DFA35_eofS =
        "\40\uffff";
    static final String DFA35_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA35_maxS =
        "\1\112\2\0\35\uffff";
    static final String DFA35_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA35_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA35_transitionS = {
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

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "2126:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_0 = input.LA(1);

                         
                        int index35_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA35_0==RULE_ID) ) {s = 1;}

                        else if ( (LA35_0==46) ) {s = 2;}

                        else if ( (LA35_0==31) && (synpred20_InternalHelloXbase())) {s = 3;}

                        else if ( (LA35_0==49) && (synpred20_InternalHelloXbase())) {s = 4;}

                        else if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_DECIMAL)||LA35_0==17||LA35_0==28||(LA35_0>=35 && LA35_0<=36)||LA35_0==48||LA35_0==50||LA35_0==52||LA35_0==54||LA35_0==56||(LA35_0>=60 && LA35_0<=65)||(LA35_0>=67 && LA35_0<=74)) ) {s = 5;}

                         
                        input.seek(index35_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_2 = input.LA(1);

                         
                        int index35_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\101\uffff";
    static final String DFA59_eofS =
        "\1\2\100\uffff";
    static final String DFA59_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA59_maxS =
        "\1\114\1\0\77\uffff";
    static final String DFA59_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA59_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA59_transitionS = {
            "\5\2\10\uffff\1\2\1\uffff\33\2\1\1\2\2\1\uffff\20\2\1\uffff"+
            "\12\2",
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
            return "3484:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred26_InternalHelloXbase()) ) {s = 64;}

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
    static final String DFA58_eotS =
        "\36\uffff";
    static final String DFA58_eofS =
        "\36\uffff";
    static final String DFA58_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA58_maxS =
        "\1\112\2\0\33\uffff";
    static final String DFA58_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA58_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA58_transitionS = {
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
            return "3505:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_0 = input.LA(1);

                         
                        int index58_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA58_0==RULE_ID) ) {s = 1;}

                        else if ( (LA58_0==46) ) {s = 2;}

                        else if ( (LA58_0==31) && (synpred27_InternalHelloXbase())) {s = 3;}

                        else if ( (LA58_0==49) && (synpred27_InternalHelloXbase())) {s = 4;}

                        else if ( ((LA58_0>=RULE_STRING && LA58_0<=RULE_DECIMAL)||LA58_0==17||LA58_0==28||(LA58_0>=35 && LA58_0<=36)||LA58_0==48||LA58_0==52||LA58_0==54||LA58_0==56||(LA58_0>=60 && LA58_0<=62)||LA58_0==65||(LA58_0>=67 && LA58_0<=74)) ) {s = 5;}

                        else if ( (LA58_0==47) ) {s = 29;}

                         
                        input.seek(index58_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA58_2 = input.LA(1);

                         
                        int index58_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index58_2);
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
    static final String DFA60_eotS =
        "\101\uffff";
    static final String DFA60_eofS =
        "\1\2\100\uffff";
    static final String DFA60_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA60_maxS =
        "\1\114\1\0\77\uffff";
    static final String DFA60_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA60_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA60_transitionS = {
            "\5\2\10\uffff\1\2\1\uffff\35\2\1\1\1\uffff\20\2\1\uffff\12\2",
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
            return "3584:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred28_InternalHelloXbase()) ) {s = 64;}

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
    static final String DFA64_eotS =
        "\101\uffff";
    static final String DFA64_eofS =
        "\1\2\100\uffff";
    static final String DFA64_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA64_maxS =
        "\1\114\1\0\77\uffff";
    static final String DFA64_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA64_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA64_transitionS = {
            "\5\2\10\uffff\1\2\1\uffff\11\2\1\1\24\2\1\uffff\20\2\1\uffff"+
            "\12\2",
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
            return "3727:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
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
                        if ( (synpred29_InternalHelloXbase()) ) {s = 64;}

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
    static final String DFA67_eotS =
        "\101\uffff";
    static final String DFA67_eofS =
        "\1\2\100\uffff";
    static final String DFA67_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA67_maxS =
        "\1\114\1\0\77\uffff";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA67_transitionS = {
            "\5\2\10\uffff\1\2\1\uffff\33\2\1\1\2\2\1\uffff\20\2\1\uffff"+
            "\12\2",
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
            return "3776:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred30_InternalHelloXbase()) ) {s = 64;}

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
    static final String DFA66_eotS =
        "\36\uffff";
    static final String DFA66_eofS =
        "\36\uffff";
    static final String DFA66_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA66_maxS =
        "\1\112\2\0\33\uffff";
    static final String DFA66_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA66_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA66_transitionS = {
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
            return "3781:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_0 = input.LA(1);

                         
                        int index66_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA66_0==RULE_ID) ) {s = 1;}

                        else if ( (LA66_0==46) ) {s = 2;}

                        else if ( (LA66_0==31) && (synpred31_InternalHelloXbase())) {s = 3;}

                        else if ( (LA66_0==49) && (synpred31_InternalHelloXbase())) {s = 4;}

                        else if ( ((LA66_0>=RULE_STRING && LA66_0<=RULE_DECIMAL)||LA66_0==17||LA66_0==28||(LA66_0>=35 && LA66_0<=36)||LA66_0==48||LA66_0==52||LA66_0==54||LA66_0==56||(LA66_0>=60 && LA66_0<=62)||LA66_0==65||(LA66_0>=67 && LA66_0<=74)) ) {s = 5;}

                        else if ( (LA66_0==47) ) {s = 29;}

                         
                        input.seek(index66_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA66_2 = input.LA(1);

                         
                        int index66_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalHelloXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index66_2);
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
        "\101\uffff";
    static final String DFA68_eofS =
        "\1\2\100\uffff";
    static final String DFA68_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA68_maxS =
        "\1\114\1\0\77\uffff";
    static final String DFA68_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA68_transitionS = {
            "\5\2\10\uffff\1\2\1\uffff\35\2\1\1\1\uffff\20\2\1\uffff\12\2",
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
            return "3860:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred32_InternalHelloXbase()) ) {s = 64;}

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
    static final String DFA70_eotS =
        "\101\uffff";
    static final String DFA70_eofS =
        "\1\33\100\uffff";
    static final String DFA70_minS =
        "\1\4\32\0\46\uffff";
    static final String DFA70_maxS =
        "\1\114\32\0\46\uffff";
    static final String DFA70_acceptS =
        "\33\uffff\1\2\44\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\46\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\1\1\21\1\15\1\16\1\17\10\uffff\1\2\1\uffff\11\33\1\10\6\33"+
            "\1\4\1\3\11\33\1\32\1\33\1\12\1\uffff\2\33\1\23\1\33\1\7\1\33"+
            "\1\6\3\33\1\24\1\25\1\26\2\33\1\11\1\uffff\1\5\1\13\1\14\1\20"+
            "\1\22\1\27\1\30\1\31\2\33",
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
            return "4182:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_2 = input.LA(1);

                         
                        int index70_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA70_3 = input.LA(1);

                         
                        int index70_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA70_4 = input.LA(1);

                         
                        int index70_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA70_5 = input.LA(1);

                         
                        int index70_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA70_6 = input.LA(1);

                         
                        int index70_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA70_7 = input.LA(1);

                         
                        int index70_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA70_8 = input.LA(1);

                         
                        int index70_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA70_9 = input.LA(1);

                         
                        int index70_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA70_10 = input.LA(1);

                         
                        int index70_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA70_11 = input.LA(1);

                         
                        int index70_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA70_12 = input.LA(1);

                         
                        int index70_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA70_13 = input.LA(1);

                         
                        int index70_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA70_14 = input.LA(1);

                         
                        int index70_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA70_15 = input.LA(1);

                         
                        int index70_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA70_16 = input.LA(1);

                         
                        int index70_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA70_17 = input.LA(1);

                         
                        int index70_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA70_18 = input.LA(1);

                         
                        int index70_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA70_19 = input.LA(1);

                         
                        int index70_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA70_20 = input.LA(1);

                         
                        int index70_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA70_21 = input.LA(1);

                         
                        int index70_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA70_22 = input.LA(1);

                         
                        int index70_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA70_23 = input.LA(1);

                         
                        int index70_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA70_24 = input.LA(1);

                         
                        int index70_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA70_25 = input.LA(1);

                         
                        int index70_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA70_26 = input.LA(1);

                         
                        int index70_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index70_26);
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
    static final String DFA85_eotS =
        "\101\uffff";
    static final String DFA85_eofS =
        "\1\2\100\uffff";
    static final String DFA85_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA85_maxS =
        "\1\114\1\0\77\uffff";
    static final String DFA85_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA85_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA85_transitionS = {
            "\5\2\10\uffff\1\2\1\uffff\11\2\1\1\24\2\1\uffff\20\2\1\uffff"+
            "\12\2",
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

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "4698:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA85_1 = input.LA(1);

                         
                        int index85_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalHelloXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index85_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 85, _s, input);
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
    public static final BitSet FOLLOW_16_in_ruleGreeting495 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleGreeting516 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGreeting528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment722 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment738 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment788 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment841 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
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
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1189 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1212 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpOr1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1395 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1448 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1471 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpAnd1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1654 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1707 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1730 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpEquality1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpEquality1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1934 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_24_in_ruleXRelationalExpression1970 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1993 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2054 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2077 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2320 = new BitSet(new long[]{0x00000007F8000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2373 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2396 = new BitSet(new long[]{0x00000007F8000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2542 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2573 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2629 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2660 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOther2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2850 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2903 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2926 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpAdd3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpAdd3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3130 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3183 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3206 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpMulti3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpMulti3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpMulti3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3459 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpUnary3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpUnary3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpUnary3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3729 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleXCastedExpression3764 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3787 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3882 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall3931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3954 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3970 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3992 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4078 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4102 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4139 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall4168 = new BitSet(new long[]{0x0000400080000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4189 = new BitSet(new long[]{0x0000200008000000L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4202 = new BitSet(new long[]{0x0000400080000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4223 = new BitSet(new long[]{0x0000200008000000L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall4237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4262 = new BitSet(new long[]{0x00015C0000000002L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4296 = new BitSet(new long[]{0x7153C018900201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4381 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4409 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4422 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4443 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4460 = new BitSet(new long[]{0x00011C0000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4495 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXClosure5262 = new BitSet(new long[]{0xF1574018900201F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5335 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXClosure5348 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5369 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_ruleXClosure5391 = new BitSet(new long[]{0xF1554018100201F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5428 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXClosure5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5542 = new BitSet(new long[]{0xF1594018100201F2L,0x00000000000007FBL});
    public static final BitSet FOLLOW_51_in_ruleXExpressionInClosure5555 = new BitSet(new long[]{0xF1514018100201F2L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5713 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXShortClosure5726 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5747 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_ruleXShortClosure5769 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXParenthesizedExpression5888 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5910 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXParenthesizedExpression5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXIfExpression6013 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXIfExpression6025 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6046 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXIfExpression6058 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6079 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXIfExpression6100 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6216 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6259 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6271 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6295 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_46_in_ruleXSwitchExpression6339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6360 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6372 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6395 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXSwitchExpression6407 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6421 = new BitSet(new long[]{0x0880400080000010L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6442 = new BitSet(new long[]{0x0E80400080000010L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6456 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6468 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6489 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6595 = new BitSet(new long[]{0x0880000000000000L});
    public static final BitSet FOLLOW_59_in_ruleXCasePart6609 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6630 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXCasePart6644 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXForLoopExpression6757 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXForLoopExpression6769 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6790 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXForLoopExpression6802 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6823 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXForLoopExpression6835 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXWhileExpression6948 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXWhileExpression6960 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6981 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXWhileExpression6993 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXDoWhileExpression7106 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7127 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleXDoWhileExpression7139 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXDoWhileExpression7151 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7172 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXDoWhileExpression7184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXBlockExpression7276 = new BitSet(new long[]{0xF5514018100201F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7298 = new BitSet(new long[]{0xF5594018100201F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_51_in_ruleXBlockExpression7311 = new BitSet(new long[]{0xF5514018100201F0L,0x00000000000007FBL});
    public static final BitSet FOLLOW_58_in_ruleXBlockExpression7327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXVariableDeclaration7545 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_64_in_ruleXVariableDeclaration7576 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7645 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7674 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXVariableDeclaration7688 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8041 = new BitSet(new long[]{0x0000000010000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall8055 = new BitSet(new long[]{0x0000400080000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8076 = new BitSet(new long[]{0x0000200008000000L});
    public static final BitSet FOLLOW_45_in_ruleXFeatureCall8089 = new BitSet(new long[]{0x0000400080000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8110 = new BitSet(new long[]{0x0000200008000000L});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall8124 = new BitSet(new long[]{0x0000000010000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8149 = new BitSet(new long[]{0x0001400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXFeatureCall8183 = new BitSet(new long[]{0x7153C018900201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8268 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8296 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFeatureCall8309 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8330 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_47_in_ruleXFeatureCall8347 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleIdOrSuper8502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleStaticQualifier8619 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXConstructorCall8716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8739 = new BitSet(new long[]{0x0001400010000002L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall8760 = new BitSet(new long[]{0x0000400080000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8782 = new BitSet(new long[]{0x0000200008000000L});
    public static final BitSet FOLLOW_45_in_ruleXConstructorCall8795 = new BitSet(new long[]{0x0000400080000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8816 = new BitSet(new long[]{0x0000200008000000L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall8830 = new BitSet(new long[]{0x0001400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXConstructorCall8853 = new BitSet(new long[]{0x7153C018900201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8926 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8954 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_45_in_ruleXConstructorCall8967 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8988 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_47_in_ruleXConstructorCall9005 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXBooleanLiteral9134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXBooleanLiteral9158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXNullLiteral9264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXTypeLiteral9559 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXTypeLiteral9571 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9594 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXTypeLiteral9606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXThrowExpression9698 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXReturnExpression9811 = new BitSet(new long[]{0x71514018100201F2L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression9935 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9986 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_ruleXTryCatchFinallyExpression10008 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXTryCatchFinallyExpression10052 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXCatchClause10166 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXCatchClause10179 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10200 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXCatchClause10212 = new BitSet(new long[]{0x71514018100201F0L,0x00000000000007FAL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10328 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleQualifiedName10356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10379 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10516 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10542 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleNumber10562 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10715 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleJvmTypeReference10753 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleJvmTypeReference10765 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXFunctionTypeRef10880 = new BitSet(new long[]{0x0000C00080000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10902 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFunctionTypeRef10915 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10936 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_47_in_ruleXFunctionTypeRef10952 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXFunctionTypeRef10966 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11081 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleJvmParameterizedTypeReference11102 = new BitSet(new long[]{0x0000400080000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11124 = new BitSet(new long[]{0x0000200008000000L});
    public static final BitSet FOLLOW_45_in_ruleJvmParameterizedTypeReference11137 = new BitSet(new long[]{0x0000400080000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11158 = new BitSet(new long[]{0x0000200008000000L});
    public static final BitSet FOLLOW_27_in_ruleJvmParameterizedTypeReference11172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmWildcardTypeReference11385 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmUpperBound11519 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleJvmUpperBoundAnded11623 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleJvmLowerBound11727 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalHelloXbase809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalHelloXbase1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalHelloXbase1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalHelloXbase1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred5_InternalHelloXbase1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalHelloXbase2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalHelloXbase2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred8_InternalHelloXbase2557 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred8_InternalHelloXbase2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred9_InternalHelloXbase2644 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred9_InternalHelloXbase2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalHelloXbase2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalHelloXbase3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred12_InternalHelloXbase3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred13_InternalHelloXbase3899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalHelloXbase3908 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalHelloXbase3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred14_InternalHelloXbase4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred14_InternalHelloXbase4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred14_InternalHelloXbase4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred15_InternalHelloXbase4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXbase4330 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_synpred16_InternalHelloXbase4337 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalHelloXbase4344 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_synpred16_InternalHelloXbase4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred17_InternalHelloXbase4478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred18_InternalHelloXbase5002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloXbase5281 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_synpred20_InternalHelloXbase5288 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalHelloXbase5295 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_synpred20_InternalHelloXbase5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred22_InternalHelloXbase6092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalHelloXbase6234 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred23_InternalHelloXbase6240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred24_InternalHelloXbase6316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalHelloXbase6323 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred24_InternalHelloXbase6329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalHelloXbase7594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalHelloXbase7603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred26_InternalHelloXbase8165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloXbase8217 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_synpred27_InternalHelloXbase8224 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalHelloXbase8231 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_synpred27_InternalHelloXbase8245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred28_InternalHelloXbase8365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred29_InternalHelloXbase8752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred30_InternalHelloXbase8845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloXbase8875 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_synpred31_InternalHelloXbase8882 = new BitSet(new long[]{0x0000400080000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalHelloXbase8889 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_synpred31_InternalHelloXbase8903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred32_InternalHelloXbase9023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalHelloXbase9825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_synpred34_InternalHelloXbase9970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_synpred35_InternalHelloXbase10000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred37_InternalHelloXbase10347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred38_InternalHelloXbase10730 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_synpred38_InternalHelloXbase10734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred39_InternalHelloXbase11094 = new BitSet(new long[]{0x0000000000000002L});

}