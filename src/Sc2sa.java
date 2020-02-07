import sa.SaDec;
import sa.SaLDec;
import sa.SaNode;
import sa.SaProg;
import sc.analysis.DepthFirstAdapter;
import sc.node.*;

public class Sc2sa extends DepthFirstAdapter {
    private SaNode returnValue;

    @Override
    public void caseAProgramme(AProgramme node)
    {
        SaLDec var =null;
        SaLDec func =null;
        node.getListedeclarvar().apply(this);
        var = (SaLDec) this.returnValue;
        node.getProgrammesuite().apply(this);
        func = (SaLDec) this.returnValue;
        this.returnValue = new SaProg(var, func);
    }

    @Override
    public void caseAListedefonction(AListedefonction node)
    {
        SaDec tete = null;
        SaLDec queue = null;
        node.getDefonction().apply(this);
        tete = (SaDec) this.returnValue;
        node.getListedefonction2().apply(this);
        queue = (SaLDec) this.returnValue;
        this.returnValue = new SaLDec(tete, queue);
    }
    @Override
    public void caseASuitelistefuncListedefonction2(ASuitelistefuncListedefonction2 node) {
        SaDec tete = null;
        SaLDec queue = null;
        node.getDefonction().apply(this);
        tete = (SaDec) this.returnValue;
        node.getListedefonction2().apply(this);
        queue = (SaLDec) this.returnValue;
        this.returnValue = new SaLDec(tete, queue);
    }

    @Override
    public void caseADefonction(ADefonction node)
    {
        String name;
        SaLDec param;
        SaLDec variable;
        node.getIdentif().apply(this);
        name = returnValue.toString();
        node.getListedeclarvar().apply(this);
        param = (SaLDec) returnValue;
        node.getDefonction2().apply(this);

    }
}
