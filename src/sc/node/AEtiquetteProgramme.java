/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class AEtiquetteProgramme extends PProgramme
{
    private PListedeclarvar _listedeclarvar_;
    private PProgrammesuite _programmesuite_;

    public AEtiquetteProgramme()
    {
        // Constructor
    }

    public AEtiquetteProgramme(
        @SuppressWarnings("hiding") PListedeclarvar _listedeclarvar_,
        @SuppressWarnings("hiding") PProgrammesuite _programmesuite_)
    {
        // Constructor
        setListedeclarvar(_listedeclarvar_);

        setProgrammesuite(_programmesuite_);

    }

    @Override
    public Object clone()
    {
        return new AEtiquetteProgramme(
            cloneNode(this._listedeclarvar_),
            cloneNode(this._programmesuite_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEtiquetteProgramme(this);
    }

    public PListedeclarvar getListedeclarvar()
    {
        return this._listedeclarvar_;
    }

    public void setListedeclarvar(PListedeclarvar node)
    {
        if(this._listedeclarvar_ != null)
        {
            this._listedeclarvar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listedeclarvar_ = node;
    }

    public PProgrammesuite getProgrammesuite()
    {
        return this._programmesuite_;
    }

    public void setProgrammesuite(PProgrammesuite node)
    {
        if(this._programmesuite_ != null)
        {
            this._programmesuite_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._programmesuite_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._listedeclarvar_)
            + toString(this._programmesuite_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._listedeclarvar_ == child)
        {
            this._listedeclarvar_ = null;
            return;
        }

        if(this._programmesuite_ == child)
        {
            this._programmesuite_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._listedeclarvar_ == oldChild)
        {
            setListedeclarvar((PListedeclarvar) newChild);
            return;
        }

        if(this._programmesuite_ == oldChild)
        {
            setProgrammesuite((PProgrammesuite) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
