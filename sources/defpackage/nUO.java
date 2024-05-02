package defpackage;

/* renamed from: nUO  reason: default package */
/* loaded from: classes.dex */
public final class nUO {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final int f6412R;

    /* renamed from: R  reason: collision with other field name */
    public final long f6413R;

    /* renamed from: R  reason: collision with other field name */
    public final i5Q f6414R;

    /* renamed from: R  reason: collision with other field name */
    public final String f6415R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f6416R;
    public final float c;
    public final float e;
    public final float v;

    public nUO(String str, float f, float f2, float f3, float f4, i5Q i5q, long j, int i, boolean z) {
        this.f6415R = str;
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
        this.f6414R = i5q;
        this.f6413R = j;
        this.f6412R = i;
        this.f6416R = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nUO)) {
            return false;
        }
        nUO nuo = (nUO) obj;
        if (!n3x.v(this.f6415R, nuo.f6415R) || !hoI.R(this.R, nuo.R) || !hoI.R(this.v, nuo.v)) {
            return false;
        }
        if (!(this.c == nuo.c)) {
            return false;
        }
        if (!(this.e == nuo.e) || !n3x.v(this.f6414R, nuo.f6414R) || !n3.c(this.f6413R, nuo.f6413R)) {
            return false;
        }
        int i = this.f6412R;
        int i2 = nuo.f6412R;
        int i3 = An.v;
        return (i == i2) && this.f6416R == nuo.f6416R;
    }

    public final int hashCode() {
        int c = jQ.c(this.e, jQ.c(this.c, jQ.c(this.v, jQ.c(this.R, this.f6415R.hashCode() * 31, 31), 31), 31), 31);
        long j = this.f6413R;
        int i = n3.R;
        return Boolean.hashCode(this.f6416R) + opT.e(this.f6412R, jQ.e(j, (this.f6414R.hashCode() + c) * 31, 31), 31);
    }
}
