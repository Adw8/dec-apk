package defpackage;

/* renamed from: enH  reason: default package */
/* loaded from: classes.dex */
public final class enH extends mjG implements kES {
    public long R = iTI.R(Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f3201R;

    public enH(kg9 kg9) {
        this.f3201R = kg9;
    }

    @Override // defpackage.kES
    public final void ZW(long j) {
        if (!ltH.R(this.R, j)) {
            this.f3201R.x(new ltH(j));
            this.R = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enH)) {
            return false;
        }
        return n3x.v(this.f3201R, ((enH) obj).f3201R);
    }

    public final int hashCode() {
        return this.f3201R.hashCode();
    }
}
