package org.xtext.example.basicfamily.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.basicfamily.services.BasicFamilyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBasicFamilyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Family'", "'{'", "'composed'", "'of'", "','", "'}'", "'Woman'", "'parents'", "'('", "')'", "'children'", "'mother'", "'father'", "'Man'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBasicFamilyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBasicFamilyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBasicFamilyParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBasicFamily.g"; }



     	private BasicFamilyGrammarAccess grammarAccess;

        public InternalBasicFamilyParser(TokenStream input, BasicFamilyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Family";
       	}

       	@Override
       	protected BasicFamilyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFamily"
    // InternalBasicFamily.g:64:1: entryRuleFamily returns [EObject current=null] : iv_ruleFamily= ruleFamily EOF ;
    public final EObject entryRuleFamily() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFamily = null;


        try {
            // InternalBasicFamily.g:64:47: (iv_ruleFamily= ruleFamily EOF )
            // InternalBasicFamily.g:65:2: iv_ruleFamily= ruleFamily EOF
            {
             newCompositeNode(grammarAccess.getFamilyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFamily=ruleFamily();

            state._fsp--;

             current =iv_ruleFamily; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFamily"


    // $ANTLR start "ruleFamily"
    // InternalBasicFamily.g:71:1: ruleFamily returns [EObject current=null] : ( () otherlv_1= 'Family' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'composed' otherlv_5= 'of' otherlv_6= '{' ( (lv_members_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_members_9_0= rulePerson ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleFamily() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_members_7_0 = null;

        EObject lv_members_9_0 = null;



        	enterRule();

        try {
            // InternalBasicFamily.g:77:2: ( ( () otherlv_1= 'Family' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'composed' otherlv_5= 'of' otherlv_6= '{' ( (lv_members_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_members_9_0= rulePerson ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalBasicFamily.g:78:2: ( () otherlv_1= 'Family' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'composed' otherlv_5= 'of' otherlv_6= '{' ( (lv_members_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_members_9_0= rulePerson ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalBasicFamily.g:78:2: ( () otherlv_1= 'Family' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'composed' otherlv_5= 'of' otherlv_6= '{' ( (lv_members_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_members_9_0= rulePerson ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalBasicFamily.g:79:3: () otherlv_1= 'Family' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'composed' otherlv_5= 'of' otherlv_6= '{' ( (lv_members_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_members_9_0= rulePerson ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalBasicFamily.g:79:3: ()
            // InternalBasicFamily.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFamilyAccess().getFamilyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFamilyAccess().getFamilyKeyword_1());
            		
            // InternalBasicFamily.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBasicFamily.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalBasicFamily.g:91:4: (lv_name_2_0= ruleEString )
            // InternalBasicFamily.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFamilyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFamilyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.basicfamily.BasicFamily.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFamilyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBasicFamily.g:113:3: (otherlv_4= 'composed' otherlv_5= 'of' otherlv_6= '{' ( (lv_members_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_members_9_0= rulePerson ) ) )* otherlv_10= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBasicFamily.g:114:4: otherlv_4= 'composed' otherlv_5= 'of' otherlv_6= '{' ( (lv_members_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_members_9_0= rulePerson ) ) )* otherlv_10= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getFamilyAccess().getComposedKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getFamilyAccess().getOfKeyword_4_1());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getFamilyAccess().getLeftCurlyBracketKeyword_4_2());
                    			
                    // InternalBasicFamily.g:126:4: ( (lv_members_7_0= rulePerson ) )
                    // InternalBasicFamily.g:127:5: (lv_members_7_0= rulePerson )
                    {
                    // InternalBasicFamily.g:127:5: (lv_members_7_0= rulePerson )
                    // InternalBasicFamily.g:128:6: lv_members_7_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getFamilyAccess().getMembersPersonParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_members_7_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFamilyRule());
                    						}
                    						add(
                    							current,
                    							"members",
                    							lv_members_7_0,
                    							"org.xtext.example.basicfamily.BasicFamily.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBasicFamily.g:145:4: (otherlv_8= ',' ( (lv_members_9_0= rulePerson ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalBasicFamily.g:146:5: otherlv_8= ',' ( (lv_members_9_0= rulePerson ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getFamilyAccess().getCommaKeyword_4_4_0());
                    	    				
                    	    // InternalBasicFamily.g:150:5: ( (lv_members_9_0= rulePerson ) )
                    	    // InternalBasicFamily.g:151:6: (lv_members_9_0= rulePerson )
                    	    {
                    	    // InternalBasicFamily.g:151:6: (lv_members_9_0= rulePerson )
                    	    // InternalBasicFamily.g:152:7: lv_members_9_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getFamilyAccess().getMembersPersonParserRuleCall_4_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_members_9_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFamilyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"members",
                    	    								lv_members_9_0,
                    	    								"org.xtext.example.basicfamily.BasicFamily.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getFamilyAccess().getRightCurlyBracketKeyword_4_5());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFamilyAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFamily"


    // $ANTLR start "entryRulePerson"
    // InternalBasicFamily.g:183:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalBasicFamily.g:183:47: (iv_rulePerson= rulePerson EOF )
            // InternalBasicFamily.g:184:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalBasicFamily.g:190:1: rulePerson returns [EObject current=null] : (this_Man_0= ruleMan | this_Woman_1= ruleWoman ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        EObject this_Man_0 = null;

        EObject this_Woman_1 = null;



        	enterRule();

        try {
            // InternalBasicFamily.g:196:2: ( (this_Man_0= ruleMan | this_Woman_1= ruleWoman ) )
            // InternalBasicFamily.g:197:2: (this_Man_0= ruleMan | this_Woman_1= ruleWoman )
            {
            // InternalBasicFamily.g:197:2: (this_Man_0= ruleMan | this_Woman_1= ruleWoman )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBasicFamily.g:198:3: this_Man_0= ruleMan
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getManParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Man_0=ruleMan();

                    state._fsp--;


                    			current = this_Man_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBasicFamily.g:207:3: this_Woman_1= ruleWoman
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getWomanParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Woman_1=ruleWoman();

                    state._fsp--;


                    			current = this_Woman_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleEString"
    // InternalBasicFamily.g:219:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBasicFamily.g:219:47: (iv_ruleEString= ruleEString EOF )
            // InternalBasicFamily.g:220:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBasicFamily.g:226:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBasicFamily.g:232:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBasicFamily.g:233:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBasicFamily.g:233:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBasicFamily.g:234:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBasicFamily.g:242:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleWoman"
    // InternalBasicFamily.g:253:1: entryRuleWoman returns [EObject current=null] : iv_ruleWoman= ruleWoman EOF ;
    public final EObject entryRuleWoman() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWoman = null;


        try {
            // InternalBasicFamily.g:253:46: (iv_ruleWoman= ruleWoman EOF )
            // InternalBasicFamily.g:254:2: iv_ruleWoman= ruleWoman EOF
            {
             newCompositeNode(grammarAccess.getWomanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWoman=ruleWoman();

            state._fsp--;

             current =iv_ruleWoman; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWoman"


    // $ANTLR start "ruleWoman"
    // InternalBasicFamily.g:260:1: ruleWoman returns [EObject current=null] : ( () otherlv_1= 'Woman' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'mother' ( ( ruleEString ) ) )? (otherlv_18= 'father' ( ( ruleEString ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleWoman() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBasicFamily.g:266:2: ( ( () otherlv_1= 'Woman' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'mother' ( ( ruleEString ) ) )? (otherlv_18= 'father' ( ( ruleEString ) ) )? otherlv_20= '}' ) )
            // InternalBasicFamily.g:267:2: ( () otherlv_1= 'Woman' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'mother' ( ( ruleEString ) ) )? (otherlv_18= 'father' ( ( ruleEString ) ) )? otherlv_20= '}' )
            {
            // InternalBasicFamily.g:267:2: ( () otherlv_1= 'Woman' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'mother' ( ( ruleEString ) ) )? (otherlv_18= 'father' ( ( ruleEString ) ) )? otherlv_20= '}' )
            // InternalBasicFamily.g:268:3: () otherlv_1= 'Woman' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'mother' ( ( ruleEString ) ) )? (otherlv_18= 'father' ( ( ruleEString ) ) )? otherlv_20= '}'
            {
            // InternalBasicFamily.g:268:3: ()
            // InternalBasicFamily.g:269:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWomanAccess().getWomanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWomanAccess().getWomanKeyword_1());
            		
            // InternalBasicFamily.g:279:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBasicFamily.g:280:4: (lv_name_2_0= ruleEString )
            {
            // InternalBasicFamily.g:280:4: (lv_name_2_0= ruleEString )
            // InternalBasicFamily.g:281:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWomanAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWomanRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.basicfamily.BasicFamily.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getWomanAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBasicFamily.g:302:3: (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBasicFamily.g:303:4: otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getWomanAccess().getParentsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getWomanAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalBasicFamily.g:311:4: ( ( ruleEString ) )
                    // InternalBasicFamily.g:312:5: ( ruleEString )
                    {
                    // InternalBasicFamily.g:312:5: ( ruleEString )
                    // InternalBasicFamily.g:313:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWomanRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWomanAccess().getParentsPersonCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBasicFamily.g:327:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBasicFamily.g:328:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getWomanAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBasicFamily.g:332:5: ( ( ruleEString ) )
                    	    // InternalBasicFamily.g:333:6: ( ruleEString )
                    	    {
                    	    // InternalBasicFamily.g:333:6: ( ruleEString )
                    	    // InternalBasicFamily.g:334:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWomanRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWomanAccess().getParentsPersonCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getWomanAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalBasicFamily.g:354:3: (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBasicFamily.g:355:4: otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getWomanAccess().getChildrenKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getWomanAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalBasicFamily.g:363:4: ( ( ruleEString ) )
                    // InternalBasicFamily.g:364:5: ( ruleEString )
                    {
                    // InternalBasicFamily.g:364:5: ( ruleEString )
                    // InternalBasicFamily.g:365:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWomanRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWomanAccess().getChildrenPersonCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBasicFamily.g:379:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBasicFamily.g:380:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getWomanAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBasicFamily.g:384:5: ( ( ruleEString ) )
                    	    // InternalBasicFamily.g:385:6: ( ruleEString )
                    	    {
                    	    // InternalBasicFamily.g:385:6: ( ruleEString )
                    	    // InternalBasicFamily.g:386:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWomanRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWomanAccess().getChildrenPersonCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getWomanAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalBasicFamily.g:406:3: (otherlv_16= 'mother' ( ( ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBasicFamily.g:407:4: otherlv_16= 'mother' ( ( ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getWomanAccess().getMotherKeyword_6_0());
                    			
                    // InternalBasicFamily.g:411:4: ( ( ruleEString ) )
                    // InternalBasicFamily.g:412:5: ( ruleEString )
                    {
                    // InternalBasicFamily.g:412:5: ( ruleEString )
                    // InternalBasicFamily.g:413:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWomanRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWomanAccess().getMotherWomanCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBasicFamily.g:428:3: (otherlv_18= 'father' ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBasicFamily.g:429:4: otherlv_18= 'father' ( ( ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getWomanAccess().getFatherKeyword_7_0());
                    			
                    // InternalBasicFamily.g:433:4: ( ( ruleEString ) )
                    // InternalBasicFamily.g:434:5: ( ruleEString )
                    {
                    // InternalBasicFamily.g:434:5: ( ruleEString )
                    // InternalBasicFamily.g:435:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWomanRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWomanAccess().getFatherManCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getWomanAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWoman"


    // $ANTLR start "entryRuleMan"
    // InternalBasicFamily.g:458:1: entryRuleMan returns [EObject current=null] : iv_ruleMan= ruleMan EOF ;
    public final EObject entryRuleMan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMan = null;


        try {
            // InternalBasicFamily.g:458:44: (iv_ruleMan= ruleMan EOF )
            // InternalBasicFamily.g:459:2: iv_ruleMan= ruleMan EOF
            {
             newCompositeNode(grammarAccess.getManRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMan=ruleMan();

            state._fsp--;

             current =iv_ruleMan; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMan"


    // $ANTLR start "ruleMan"
    // InternalBasicFamily.g:465:1: ruleMan returns [EObject current=null] : ( () otherlv_1= 'Man' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'mother' ( ( ruleEString ) ) )? (otherlv_18= 'father' ( ( ruleEString ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleMan() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalBasicFamily.g:471:2: ( ( () otherlv_1= 'Man' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'mother' ( ( ruleEString ) ) )? (otherlv_18= 'father' ( ( ruleEString ) ) )? otherlv_20= '}' ) )
            // InternalBasicFamily.g:472:2: ( () otherlv_1= 'Man' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'mother' ( ( ruleEString ) ) )? (otherlv_18= 'father' ( ( ruleEString ) ) )? otherlv_20= '}' )
            {
            // InternalBasicFamily.g:472:2: ( () otherlv_1= 'Man' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'mother' ( ( ruleEString ) ) )? (otherlv_18= 'father' ( ( ruleEString ) ) )? otherlv_20= '}' )
            // InternalBasicFamily.g:473:3: () otherlv_1= 'Man' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'mother' ( ( ruleEString ) ) )? (otherlv_18= 'father' ( ( ruleEString ) ) )? otherlv_20= '}'
            {
            // InternalBasicFamily.g:473:3: ()
            // InternalBasicFamily.g:474:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getManAccess().getManAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getManAccess().getManKeyword_1());
            		
            // InternalBasicFamily.g:484:3: ( (lv_name_2_0= ruleEString ) )
            // InternalBasicFamily.g:485:4: (lv_name_2_0= ruleEString )
            {
            // InternalBasicFamily.g:485:4: (lv_name_2_0= ruleEString )
            // InternalBasicFamily.g:486:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getManAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.basicfamily.BasicFamily.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getManAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBasicFamily.g:507:3: (otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBasicFamily.g:508:4: otherlv_4= 'parents' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getManAccess().getParentsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getManAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalBasicFamily.g:516:4: ( ( ruleEString ) )
                    // InternalBasicFamily.g:517:5: ( ruleEString )
                    {
                    // InternalBasicFamily.g:517:5: ( ruleEString )
                    // InternalBasicFamily.g:518:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getManRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getManAccess().getParentsPersonCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBasicFamily.g:532:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==15) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalBasicFamily.g:533:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getManAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalBasicFamily.g:537:5: ( ( ruleEString ) )
                    	    // InternalBasicFamily.g:538:6: ( ruleEString )
                    	    {
                    	    // InternalBasicFamily.g:538:6: ( ruleEString )
                    	    // InternalBasicFamily.g:539:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getManRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getManAccess().getParentsPersonCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getManAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalBasicFamily.g:559:3: (otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBasicFamily.g:560:4: otherlv_10= 'children' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getManAccess().getChildrenKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getManAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalBasicFamily.g:568:4: ( ( ruleEString ) )
                    // InternalBasicFamily.g:569:5: ( ruleEString )
                    {
                    // InternalBasicFamily.g:569:5: ( ruleEString )
                    // InternalBasicFamily.g:570:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getManRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getManAccess().getChildrenPersonCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBasicFamily.g:584:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==15) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalBasicFamily.g:585:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getManAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBasicFamily.g:589:5: ( ( ruleEString ) )
                    	    // InternalBasicFamily.g:590:6: ( ruleEString )
                    	    {
                    	    // InternalBasicFamily.g:590:6: ( ruleEString )
                    	    // InternalBasicFamily.g:591:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getManRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getManAccess().getChildrenPersonCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getManAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalBasicFamily.g:611:3: (otherlv_16= 'mother' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBasicFamily.g:612:4: otherlv_16= 'mother' ( ( ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getManAccess().getMotherKeyword_6_0());
                    			
                    // InternalBasicFamily.g:616:4: ( ( ruleEString ) )
                    // InternalBasicFamily.g:617:5: ( ruleEString )
                    {
                    // InternalBasicFamily.g:617:5: ( ruleEString )
                    // InternalBasicFamily.g:618:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getManRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getManAccess().getMotherWomanCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBasicFamily.g:633:3: (otherlv_18= 'father' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBasicFamily.g:634:4: otherlv_18= 'father' ( ( ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getManAccess().getFatherKeyword_7_0());
                    			
                    // InternalBasicFamily.g:638:4: ( ( ruleEString ) )
                    // InternalBasicFamily.g:639:5: ( ruleEString )
                    {
                    // InternalBasicFamily.g:639:5: ( ruleEString )
                    // InternalBasicFamily.g:640:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getManRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getManAccess().getFatherManCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getManAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMan"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000E50000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000E10000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C10000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000810000L});

}