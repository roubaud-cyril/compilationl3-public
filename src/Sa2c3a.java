import c3a.C3a;
import c3a.C3aInstAffect;
import c3a.C3aInstWrite;
import c3a.C3aOperand;
import sa.*;
import ts.Ts;

public class Sa2c3a extends SaDepthFirstVisitor<C3aOperand> {

    private final C3a c3a;
    private final Ts table;
    private Ts tableLocale;

    public Sa2c3a(SaNode saRoot, Ts table) {
        c3a = new C3a();
        this.table = table;
        saRoot.accept(this);
    }

    public C3a getC3a() {
        return c3a;
    }
    @Override
    public C3aOperand visit(SaInstEcriture node) {
        C3aOperand operation = node.getArg().accept(this);
        c3a.ajouteInst(new C3aInstWrite(operation, ""));
        return null;
    }

    @Override
    public C3aOperand visit(SaInstAffect node) {
        C3aOperand variable = node.getLhs().accept(this);
        C3aOperand expr = node.getRhs().accept(this);
        c3a.ajouteInst(new C3aInstAffect(variable,expr,""));
        return null; // ?
    }

    @Override
    public C3aOperand visit(SaProg node) {
        return super.visit(node);
    }
}
