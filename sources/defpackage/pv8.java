package defpackage;

/* renamed from: pv8  reason: default package */
/* loaded from: classes.dex */
public final class pv8 {
    public gDn R;

    /* renamed from: R  reason: collision with other field name */
    public String f7313R;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv8)) {
            return false;
        }
        pv8 pv8 = (pv8) obj;
        if (this.R != pv8.R) {
            return false;
        }
        return this.f7313R.equals(pv8.f7313R);
    }

    public final int hashCode() {
        return this.R.hashCode() + (this.f7313R.hashCode() * 31);
    }
}
