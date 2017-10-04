package poli.compiladores.rec.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import poli.compiladores.rec.services.RectrineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRectrineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_TIPO", "RULE_MULT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'{'", "'}'", "':'", "'->'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_MULT=6;
    public static final int T__17=17;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_TIPO=5;

    // delegates
    // delegators


        public InternalRectrineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRectrineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRectrineParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRectrine.g"; }



     	private RectrineGrammarAccess grammarAccess;

        public InternalRectrineParser(TokenStream input, RectrineGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected RectrineGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalRectrine.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalRectrine.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalRectrine.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalRectrine.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_entidades_0_0= ruleEntidade ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_entidades_0_0 = null;



        	enterRule();

        try {
            // InternalRectrine.g:77:2: ( ( (lv_entidades_0_0= ruleEntidade ) )* )
            // InternalRectrine.g:78:2: ( (lv_entidades_0_0= ruleEntidade ) )*
            {
            // InternalRectrine.g:78:2: ( (lv_entidades_0_0= ruleEntidade ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRectrine.g:79:3: (lv_entidades_0_0= ruleEntidade )
            	    {
            	    // InternalRectrine.g:79:3: (lv_entidades_0_0= ruleEntidade )
            	    // InternalRectrine.g:80:4: lv_entidades_0_0= ruleEntidade
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getEntidadesEntidadeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_entidades_0_0=ruleEntidade();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"entidades",
            	    					lv_entidades_0_0,
            	    					"poli.compiladores.rec.Rectrine.Entidade");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleEntidade"
    // InternalRectrine.g:100:1: entryRuleEntidade returns [EObject current=null] : iv_ruleEntidade= ruleEntidade EOF ;
    public final EObject entryRuleEntidade() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidade = null;


        try {
            // InternalRectrine.g:100:49: (iv_ruleEntidade= ruleEntidade EOF )
            // InternalRectrine.g:101:2: iv_ruleEntidade= ruleEntidade EOF
            {
             newCompositeNode(grammarAccess.getEntidadeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntidade=ruleEntidade();

            state._fsp--;

             current =iv_ruleEntidade; 
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
    // $ANTLR end "entryRuleEntidade"


    // $ANTLR start "ruleEntidade"
    // InternalRectrine.g:107:1: ruleEntidade returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_campos_3_0= ruleCampo ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntidade() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_campos_3_0 = null;



        	enterRule();

        try {
            // InternalRectrine.g:113:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_campos_3_0= ruleCampo ) )* otherlv_4= '}' ) )
            // InternalRectrine.g:114:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_campos_3_0= ruleCampo ) )* otherlv_4= '}' )
            {
            // InternalRectrine.g:114:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_campos_3_0= ruleCampo ) )* otherlv_4= '}' )
            // InternalRectrine.g:115:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_campos_3_0= ruleCampo ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntidadeAccess().getEntityKeyword_0());
            		
            // InternalRectrine.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRectrine.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRectrine.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalRectrine.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntidadeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntidadeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getEntidadeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRectrine.g:141:3: ( (lv_campos_3_0= ruleCampo ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRectrine.g:142:4: (lv_campos_3_0= ruleCampo )
            	    {
            	    // InternalRectrine.g:142:4: (lv_campos_3_0= ruleCampo )
            	    // InternalRectrine.g:143:5: lv_campos_3_0= ruleCampo
            	    {

            	    					newCompositeNode(grammarAccess.getEntidadeAccess().getCamposCampoParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_campos_3_0=ruleCampo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntidadeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"campos",
            	    						lv_campos_3_0,
            	    						"poli.compiladores.rec.Rectrine.Campo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntidadeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEntidade"


    // $ANTLR start "entryRuleCampo"
    // InternalRectrine.g:168:1: entryRuleCampo returns [EObject current=null] : iv_ruleCampo= ruleCampo EOF ;
    public final EObject entryRuleCampo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCampo = null;


        try {
            // InternalRectrine.g:168:46: (iv_ruleCampo= ruleCampo EOF )
            // InternalRectrine.g:169:2: iv_ruleCampo= ruleCampo EOF
            {
             newCompositeNode(grammarAccess.getCampoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCampo=ruleCampo();

            state._fsp--;

             current =iv_ruleCampo; 
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
    // $ANTLR end "entryRuleCampo"


    // $ANTLR start "ruleCampo"
    // InternalRectrine.g:175:1: ruleCampo returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_tipo_2_0= RULE_TIPO ) ) | ( (lv_rel_3_0= ruleLigacao ) ) ) ) ;
    public final EObject ruleCampo() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_tipo_2_0=null;
        EObject lv_rel_3_0 = null;



        	enterRule();

        try {
            // InternalRectrine.g:181:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_tipo_2_0= RULE_TIPO ) ) | ( (lv_rel_3_0= ruleLigacao ) ) ) ) )
            // InternalRectrine.g:182:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_tipo_2_0= RULE_TIPO ) ) | ( (lv_rel_3_0= ruleLigacao ) ) ) )
            {
            // InternalRectrine.g:182:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_tipo_2_0= RULE_TIPO ) ) | ( (lv_rel_3_0= ruleLigacao ) ) ) )
            // InternalRectrine.g:183:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_tipo_2_0= RULE_TIPO ) ) | ( (lv_rel_3_0= ruleLigacao ) ) )
            {
            // InternalRectrine.g:183:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRectrine.g:184:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRectrine.g:184:4: (lv_name_0_0= RULE_ID )
            // InternalRectrine.g:185:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCampoAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCampoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getCampoAccess().getColonKeyword_1());
            		
            // InternalRectrine.g:205:3: ( ( (lv_tipo_2_0= RULE_TIPO ) ) | ( (lv_rel_3_0= ruleLigacao ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_TIPO) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRectrine.g:206:4: ( (lv_tipo_2_0= RULE_TIPO ) )
                    {
                    // InternalRectrine.g:206:4: ( (lv_tipo_2_0= RULE_TIPO ) )
                    // InternalRectrine.g:207:5: (lv_tipo_2_0= RULE_TIPO )
                    {
                    // InternalRectrine.g:207:5: (lv_tipo_2_0= RULE_TIPO )
                    // InternalRectrine.g:208:6: lv_tipo_2_0= RULE_TIPO
                    {
                    lv_tipo_2_0=(Token)match(input,RULE_TIPO,FOLLOW_2); 

                    						newLeafNode(lv_tipo_2_0, grammarAccess.getCampoAccess().getTipoTIPOTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCampoRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tipo",
                    							lv_tipo_2_0,
                    							"poli.compiladores.rec.Rectrine.TIPO");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRectrine.g:225:4: ( (lv_rel_3_0= ruleLigacao ) )
                    {
                    // InternalRectrine.g:225:4: ( (lv_rel_3_0= ruleLigacao ) )
                    // InternalRectrine.g:226:5: (lv_rel_3_0= ruleLigacao )
                    {
                    // InternalRectrine.g:226:5: (lv_rel_3_0= ruleLigacao )
                    // InternalRectrine.g:227:6: lv_rel_3_0= ruleLigacao
                    {

                    						newCompositeNode(grammarAccess.getCampoAccess().getRelLigacaoParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rel_3_0=ruleLigacao();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCampoRule());
                    						}
                    						set(
                    							current,
                    							"rel",
                    							lv_rel_3_0,
                    							"poli.compiladores.rec.Rectrine.Ligacao");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleCampo"


    // $ANTLR start "entryRuleLigacao"
    // InternalRectrine.g:249:1: entryRuleLigacao returns [EObject current=null] : iv_ruleLigacao= ruleLigacao EOF ;
    public final EObject entryRuleLigacao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLigacao = null;


        try {
            // InternalRectrine.g:249:48: (iv_ruleLigacao= ruleLigacao EOF )
            // InternalRectrine.g:250:2: iv_ruleLigacao= ruleLigacao EOF
            {
             newCompositeNode(grammarAccess.getLigacaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLigacao=ruleLigacao();

            state._fsp--;

             current =iv_ruleLigacao; 
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
    // $ANTLR end "entryRuleLigacao"


    // $ANTLR start "ruleLigacao"
    // InternalRectrine.g:256:1: ruleLigacao returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_mul1_1_0= RULE_MULT ) ) otherlv_2= '->' ( (lv_mul2_3_0= RULE_MULT ) ) ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleLigacao() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mul1_1_0=null;
        Token otherlv_2=null;
        Token lv_mul2_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRectrine.g:262:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_mul1_1_0= RULE_MULT ) ) otherlv_2= '->' ( (lv_mul2_3_0= RULE_MULT ) ) ( (otherlv_4= RULE_ID ) ) ) )
            // InternalRectrine.g:263:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_mul1_1_0= RULE_MULT ) ) otherlv_2= '->' ( (lv_mul2_3_0= RULE_MULT ) ) ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalRectrine.g:263:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_mul1_1_0= RULE_MULT ) ) otherlv_2= '->' ( (lv_mul2_3_0= RULE_MULT ) ) ( (otherlv_4= RULE_ID ) ) )
            // InternalRectrine.g:264:3: ( (otherlv_0= RULE_ID ) ) ( (lv_mul1_1_0= RULE_MULT ) ) otherlv_2= '->' ( (lv_mul2_3_0= RULE_MULT ) ) ( (otherlv_4= RULE_ID ) )
            {
            // InternalRectrine.g:264:3: ( (otherlv_0= RULE_ID ) )
            // InternalRectrine.g:265:4: (otherlv_0= RULE_ID )
            {
            // InternalRectrine.g:265:4: (otherlv_0= RULE_ID )
            // InternalRectrine.g:266:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLigacaoRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getLigacaoAccess().getEnt1EntidadeCrossReference_0_0());
            				

            }


            }

            // InternalRectrine.g:277:3: ( (lv_mul1_1_0= RULE_MULT ) )
            // InternalRectrine.g:278:4: (lv_mul1_1_0= RULE_MULT )
            {
            // InternalRectrine.g:278:4: (lv_mul1_1_0= RULE_MULT )
            // InternalRectrine.g:279:5: lv_mul1_1_0= RULE_MULT
            {
            lv_mul1_1_0=(Token)match(input,RULE_MULT,FOLLOW_10); 

            					newLeafNode(lv_mul1_1_0, grammarAccess.getLigacaoAccess().getMul1MULTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLigacaoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mul1",
            						lv_mul1_1_0,
            						"poli.compiladores.rec.Rectrine.MULT");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getLigacaoAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalRectrine.g:299:3: ( (lv_mul2_3_0= RULE_MULT ) )
            // InternalRectrine.g:300:4: (lv_mul2_3_0= RULE_MULT )
            {
            // InternalRectrine.g:300:4: (lv_mul2_3_0= RULE_MULT )
            // InternalRectrine.g:301:5: lv_mul2_3_0= RULE_MULT
            {
            lv_mul2_3_0=(Token)match(input,RULE_MULT,FOLLOW_4); 

            					newLeafNode(lv_mul2_3_0, grammarAccess.getLigacaoAccess().getMul2MULTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLigacaoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mul2",
            						lv_mul2_3_0,
            						"poli.compiladores.rec.Rectrine.MULT");
            				

            }


            }

            // InternalRectrine.g:317:3: ( (otherlv_4= RULE_ID ) )
            // InternalRectrine.g:318:4: (otherlv_4= RULE_ID )
            {
            // InternalRectrine.g:318:4: (otherlv_4= RULE_ID )
            // InternalRectrine.g:319:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLigacaoRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getLigacaoAccess().getEnt2EntidadeCrossReference_4_0());
            				

            }


            }


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
    // $ANTLR end "ruleLigacao"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});

}