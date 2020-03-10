import sa.SaAppel;
import sa.SaDec;
import sa.SaDecFonc;
import sa.SaDecTab;
import sa.SaDecVar;
import sa.SaDepthFirstVisitor;
import sa.SaLDec;
import sa.SaNode;
import sa.SaVarIndicee;
import sa.SaVarSimple;
import ts.Ts;

public class Sa2ts extends SaDepthFirstVisitor<Void> {

    private final Ts tableGlobale;
    private Ts tableLocale;

    public Sa2ts(SaNode saRoot) {
        tableGlobale = new Ts();
        saRoot.accept(this);
    }

    public Ts getTableGlobale() {
        return tableGlobale;
    }

    @Override
    public Void visit(SaDecTab node) {
        String identif = node.getNom();
        int size = node.getTaille();
        if (tableLocale != null) throw new RuntimeException("Can't declare array inside a function");

        if (tableGlobale.containsVar(identif)) throw new RuntimeException("Variable " + identif + " already used");

        tableGlobale.addVar(identif, size);
        return super.visit(node);
    }

    @Override
    public Void visit(SaDecFonc node) {
        String identif = node.getNom();
        SaLDec parameter = node.getParametres();
        tableLocale = new Ts();
        if (tableGlobale.containsFonc(identif)) throw new RuntimeException("Function " + identif + " already defined");

        if(parameter!= null)tableGlobale.addFct(identif, parameter.length(), tableLocale, node);
        else tableGlobale.addFct(identif,0,tableLocale,node);

        SaDec head;
        while (parameter != null && (head = parameter.getTete()) != null) {
            tableLocale.addParam(head.getNom());
            parameter = parameter.getQueue();
        }

        if (node.getVariable() != null) {
            node.getVariable().accept(this);
        }
        node.getCorps().accept(this);
        tableLocale = null;

        return null;
    }

    @Override
    public Void visit(SaDecVar node) {
        String identif = node.getNom();
        Ts table;
        if(tableLocale == null)table = tableGlobale;
                else table = tableLocale;
        if (table.containsVar(identif)) throw new RuntimeException("Variable " + identif + " already used");

        table.addVar(identif, 1);
        return super.visit(node);
    }

    @Override
    public Void visit(SaVarSimple node) {
        String identif = node.getNom();
        if (!(tableLocale != null && tableLocale.containsVar(identif))) {
            if (!tableGlobale.containsVar(identif)) {
                throw new RuntimeException("Variable " + identif + " NOT defined");
            }
        }
        return super.visit(node);
    }

    @Override
    public Void visit(SaAppel node) {
        String identif = node.getNom();
        if (!tableGlobale.containsFonc(identif)) {
            throw new RuntimeException("Function " + identif + "NOT defined");
        }
        return super.visit(node);
    }

    @Override
    public Void visit(SaVarIndicee node) {
        String identif = node.getNom();
        if (!tableGlobale.containsVar(identif)) {
            throw new RuntimeException("La variable indicee " + identif + "n'a pas été définie");
        }
        return super.visit(node);
    }
}