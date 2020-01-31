/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.analysis;

import sc.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAEtiquetteProgramme(AEtiquetteProgramme node);
    void caseAProgrammesuite(AProgrammesuite node);
    void caseAListedefonction(AListedefonction node);
    void caseACoolListedefonction2(ACoolListedefonction2 node);
    void caseARienListedefonction2(ARienListedefonction2 node);
    void caseADefonction(ADefonction node);
    void caseASuitefonction2Defonction2(ASuitefonction2Defonction2 node);
    void caseASuitefonctionDefonction2(ASuitefonctionDefonction2 node);
    void caseADefonction3(ADefonction3 node);
    void caseABlocfonc(ABlocfonc node);
    void caseAPourquoiBlocfonc(APourquoiBlocfonc node);
    void caseASimpleVar(ASimpleVar node);
    void caseADeriveVar(ADeriveVar node);
    void caseASimpleDeclarvar(ASimpleDeclarvar node);
    void caseADeriveDeclarvar(ADeriveDeclarvar node);
    void caseAListevarListedeclarvar(AListevarListedeclarvar node);
    void caseAVideListedeclarvar(AVideListedeclarvar node);
    void caseASuitelistevarListdeclarvar2(ASuitelistevarListdeclarvar2 node);
    void caseAIllkillyouListdeclarvar2(AIllkillyouListdeclarvar2 node);
    void caseAInstruvide(AInstruvide node);
    void caseAOuExpr99(AOuExpr99 node);
    void caseAExpr1Expr99(AExpr1Expr99 node);
    void caseAEtExpr1(AEtExpr1 node);
    void caseAExpr2Expr1(AExpr2Expr1 node);
    void caseAEgalExpr2(AEgalExpr2 node);
    void caseAInfExpr2(AInfExpr2 node);
    void caseASupExpr2(ASupExpr2 node);
    void caseAExpr3Expr2(AExpr3Expr2 node);
    void caseAPlusExpr3(APlusExpr3 node);
    void caseAMoinsExpr3(AMoinsExpr3 node);
    void caseAExpr4Expr3(AExpr4Expr3 node);
    void caseAFoisExpr4(AFoisExpr4 node);
    void caseADiviseExpr4(ADiviseExpr4 node);
    void caseAExpr5Expr4(AExpr5Expr4 node);
    void caseANonExpr5(ANonExpr5 node);
    void caseAExpr6Expr5(AExpr6Expr5 node);
    void caseAParenthesageExpr6(AParenthesageExpr6 node);
    void caseANombreExpr6(ANombreExpr6 node);
    void caseAIdentifExpr6(AIdentifExpr6 node);
    void caseALireExpr6(ALireExpr6 node);
    void caseAAppelfunctionExpr6(AAppelfunctionExpr6 node);
    void caseAAffectation(AAffectation node);
    void caseAFonctionparamAppelf(AFonctionparamAppelf node);
    void caseAInstructfonction(AInstructfonction node);
    void caseAReturn(AReturn node);
    void caseAWrite(AWrite node);
    void caseAParamListexpr(AParamListexpr node);
    void caseAVideListexpr(AVideListexpr node);
    void caseASuiteparamListexpr2(ASuiteparamListexpr2 node);
    void caseAVideListexpr2(AVideListexpr2 node);
    void caseASiKeyword(ASiKeyword node);
    void caseATantqueKeyword(ATantqueKeyword node);
    void caseASiIf(ASiIf node);
    void caseASisinonIf(ASisinonIf node);
    void caseAWololo(AWololo node);
    void caseABloc(ABloc node);
    void caseASuitexprBloc2(ASuitexprBloc2 node);
    void caseAKeywordBloc2(AKeywordBloc2 node);
    void caseATuerBloc2(ATuerBloc2 node);
    void caseALvijruBloc2(ALvijruBloc2 node);
    void caseAWhile(AWhile node);

    void caseTEspaces(TEspaces node);
    void caseTCommentaire(TCommentaire node);
    void caseTPointVirgule(TPointVirgule node);
    void caseTVirgule(TVirgule node);
    void caseTPlus(TPlus node);
    void caseTMoins(TMoins node);
    void caseTFois(TFois node);
    void caseTDivise(TDivise node);
    void caseTLp(TLp node);
    void caseTRp(TRp node);
    void caseTCr(TCr node);
    void caseTCl(TCl node);
    void caseTAl(TAl node);
    void caseTAr(TAr node);
    void caseTEgal(TEgal node);
    void caseTInf(TInf node);
    void caseTSup(TSup node);
    void caseTEt(TEt node);
    void caseTOu(TOu node);
    void caseTNon(TNon node);
    void caseTSi(TSi node);
    void caseTAlors(TAlors node);
    void caseTSinon(TSinon node);
    void caseTTantque(TTantque node);
    void caseTFaire(TFaire node);
    void caseTEntier(TEntier node);
    void caseTRetour(TRetour node);
    void caseTLire(TLire node);
    void caseTEcrire(TEcrire node);
    void caseTIdentif(TIdentif node);
    void caseTNombre(TNombre node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
