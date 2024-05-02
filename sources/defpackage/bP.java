package defpackage;

/* renamed from: bP  reason: default package */
/* loaded from: classes.dex */
public final class bP extends XS implements bpk, v2 {
    public Zs R;

    /* renamed from: R  reason: collision with other field name */
    public kSh f1631R;
    public kSh v;

    public bP(nW nWVar) {
        super(nWVar);
    }

    public static final Object m(bP bPVar, kSh ksh, hjM hjm, aOO aoo) {
        bPVar.v = ksh;
        gIA gia = (gIA) ksh.R;
        Zs zs = bPVar.R;
        if (zs == null) {
            zs = null;
        }
        h6T h6t = (h6T) zs;
        ltH lth = h6t.f4052R;
        if (lth != null) {
            Object L = jjU.L(new cd(bPVar, hjm, gia, h6t.c(lth.R, gia), null), aoo);
            return L == bGR.COROUTINE_SUSPENDED ? L : o8s.R;
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    @Override // defpackage.v2
    public final Object c(hjM hjm, f_c f_c, aOO aoo) {
        Object L = jjU.L(new Ji(this, hjm, f_c, null), aoo);
        return L == bGR.COROUTINE_SUSPENDED ? L : o8s.R;
    }

    @Override // defpackage.bpk
    public final Object getValue() {
        return this;
    }

    @Override // defpackage.bpk
    public final bsy r() {
        return oD.R;
    }
}
