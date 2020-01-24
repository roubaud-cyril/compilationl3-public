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
    void caseAExpression(AExpression node);

    void caseTEspaces(TEspaces node);
    void caseTCommentaire(TCommentaire node);
    void caseTPointVirgule(TPointVirgule node);
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