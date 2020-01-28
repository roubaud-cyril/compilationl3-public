/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class ADefonction extends PDefonction
{
    private TIdentif _identif_;
    private TLp _lp_;
    private PListedeclarvar _listedeclarvar_;
    private TRp _rp_;
    private PDefonction2 _defonction2_;

    public ADefonction()
    {
        // Constructor
    }

    public ADefonction(
        @SuppressWarnings("hiding") TIdentif _identif_,
        @SuppressWarnings("hiding") TLp _lp_,
        @SuppressWarnings("hiding") PListedeclarvar _listedeclarvar_,
        @SuppressWarnings("hiding") TRp _rp_,
        @SuppressWarnings("hiding") PDefonction2 _defonction2_)
    {
        // Constructor
        setIdentif(_identif_);

        setLp(_lp_);

        setListedeclarvar(_listedeclarvar_);

        setRp(_rp_);

        setDefonction2(_defonction2_);

    }

    @Override
    public Object clone()
    {
        return new ADefonction(
            cloneNode(this._identif_),
            cloneNode(this._lp_),
            cloneNode(this._listedeclarvar_),
            cloneNode(this._rp_),
            cloneNode(this._defonction2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADefonction(this);
    }

    public TIdentif getIdentif()
    {
        return this._identif_;
    }

    public void setIdentif(TIdentif node)
    {
        if(this._identif_ != null)
        {
            this._identif_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identif_ = node;
    }

    public TLp getLp()
    {
        return this._lp_;
    }

    public void setLp(TLp node)
    {
        if(this._lp_ != null)
        {
            this._lp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lp_ = node;
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

    public TRp getRp()
    {
        return this._rp_;
    }

    public void setRp(TRp node)
    {
        if(this._rp_ != null)
        {
            this._rp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rp_ = node;
    }

    public PDefonction2 getDefonction2()
    {
        return this._defonction2_;
    }

    public void setDefonction2(PDefonction2 node)
    {
        if(this._defonction2_ != null)
        {
            this._defonction2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._defonction2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identif_)
            + toString(this._lp_)
            + toString(this._listedeclarvar_)
            + toString(this._rp_)
            + toString(this._defonction2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identif_ == child)
        {
            this._identif_ = null;
            return;
        }

        if(this._lp_ == child)
        {
            this._lp_ = null;
            return;
        }

        if(this._listedeclarvar_ == child)
        {
            this._listedeclarvar_ = null;
            return;
        }

        if(this._rp_ == child)
        {
            this._rp_ = null;
            return;
        }

        if(this._defonction2_ == child)
        {
            this._defonction2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identif_ == oldChild)
        {
            setIdentif((TIdentif) newChild);
            return;
        }

        if(this._lp_ == oldChild)
        {
            setLp((TLp) newChild);
            return;
        }

        if(this._listedeclarvar_ == oldChild)
        {
            setListedeclarvar((PListedeclarvar) newChild);
            return;
        }

        if(this._rp_ == oldChild)
        {
            setRp((TRp) newChild);
            return;
        }

        if(this._defonction2_ == oldChild)
        {
            setDefonction2((PDefonction2) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}