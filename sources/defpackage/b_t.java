package defpackage;

/* renamed from: b_t  reason: default package */
/* loaded from: classes.dex */
public final class b_t {
    public final iv7 R;

    /* renamed from: R  reason: collision with other field name */
    public final String f1750R;

    public b_t(String str, iv7 iv7) {
        this.f1750R = str;
        this.R = iv7;
    }

    public final void R(bNL bnl, Object obj) {
        ((kEW) bnl).c(this, obj);
    }

    public final String toString() {
        StringBuilder U = opT.U("SemanticsPropertyKey: ");
        U.append(this.f1750R);
        return U.toString();
    }

    public /* synthetic */ b_t(String str) {
        this(str, oLA.m);
    }
}
