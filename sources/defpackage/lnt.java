package defpackage;

/* renamed from: lnt  reason: default package */
/* loaded from: classes.dex */
public final class lnt extends mjG implements g4j {
    public final kg9 R;

    public lnt(kg9 kg9) {
        this.R = kg9;
    }

    @Override // defpackage.g4j
    public final void A(ohT oht) {
        this.R.x(oht);
        ((jDh) oht).v();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnt)) {
            return false;
        }
        return n3x.v(this.R, ((lnt) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }
}
