/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class AAffInstr extends PInstr
{
    private PAffectation _affectation_;

    public AAffInstr()
    {
        // Constructor
    }

    public AAffInstr(
        @SuppressWarnings("hiding") PAffectation _affectation_)
    {
        // Constructor
        setAffectation(_affectation_);

    }

    @Override
    public Object clone()
    {
        return new AAffInstr(
            cloneNode(this._affectation_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAffInstr(this);
    }

    public PAffectation getAffectation()
    {
        return this._affectation_;
    }

    public void setAffectation(PAffectation node)
    {
        if(this._affectation_ != null)
        {
            this._affectation_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._affectation_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._affectation_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._affectation_ == child)
        {
            this._affectation_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._affectation_ == oldChild)
        {
            setAffectation((PAffectation) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
