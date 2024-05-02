package defpackage;

/* renamed from: o3h  reason: default package */
/* loaded from: classes.dex */
public final class o3h implements jXh {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final oUk f6662R;
    public final int v;

    public o3h(int i, int i2, oUk ouk) {
        this.R = i;
        this.v = i2;
        this.f6662R = ouk;
    }

    @Override // defpackage.jXh
    public final giw O(oHg ohg) {
        return new eq_(this.R, this.v, this.f6662R);
    }

    @Override // defpackage.jM
    public final iHW c(oHg ohg) {
        return new eq_(this.R, this.v, this.f6662R);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o3h)) {
            return false;
        }
        o3h o3h = (o3h) obj;
        return o3h.R == this.R && o3h.v == this.v && n3x.v(o3h.f6662R, this.f6662R);
    }

    public final int hashCode() {
        return ((this.f6662R.hashCode() + (this.R * 31)) * 31) + this.v;
    }

    public /* synthetic */ o3h(int i, oUk ouk, int i2) {
        this((i2 & 1) != 0 ? 300 : i, 0, (i2 & 4) != 0 ? me6.R : ouk);
    }
}
