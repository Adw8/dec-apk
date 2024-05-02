package defpackage;

/* renamed from: XS  reason: default package */
/* loaded from: classes.dex */
public abstract class XS implements lHr, mij {
    public hjM R;

    /* renamed from: R  reason: collision with other field name */
    public final v2 f618R;
    public v2 v;

    public XS(nW nWVar) {
        this.f618R = nWVar;
    }

    @Override // defpackage.lHr
    public final void P(bS6 bs6) {
        this.v = (v2) bs6.v(oD.R);
    }

    @Override // defpackage.mij
    public final void j(poS pos) {
        this.R = pos;
    }
}
