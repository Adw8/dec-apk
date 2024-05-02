package defpackage;

/* renamed from: nL3  reason: default package */
/* loaded from: classes.dex */
public final class nL3 extends mjG implements g4j {
    public final kg9 R;

    public nL3(kg9 kg9) {
        this.R = kg9;
    }

    @Override // defpackage.g4j
    public final void A(ohT oht) {
        this.R.x(oht);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nL3)) {
            return false;
        }
        return n3x.v(this.R, ((nL3) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }
}
