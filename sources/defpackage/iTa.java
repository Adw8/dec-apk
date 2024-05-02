package defpackage;

/* renamed from: iTa  reason: default package */
/* loaded from: classes.dex */
public final class iTa implements lHr {
    public final kg9 R;

    public iTa(kg9 kg9) {
        this.R = kg9;
    }

    @Override // defpackage.lHr
    public final void P(bS6 bs6) {
        this.R.x(bs6.v(fQO.R));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof iTa) && n3x.v(((iTa) obj).R, this.R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }
}
