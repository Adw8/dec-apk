package defpackage;

import java.util.HashSet;

/* renamed from: csc  reason: default package */
/* loaded from: classes.dex */
public final class csc {
    public static final csc R = new csc(new kSx());

    /* renamed from: R  reason: collision with other field name */
    public long f2439R;

    /* renamed from: R  reason: collision with other field name */
    public b0y f2440R;

    /* renamed from: R  reason: collision with other field name */
    public g_9 f2441R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2442R;
    public boolean c;
    public boolean e;
    public long v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f2443v;

    public csc() {
        this.f2441R = g_9.NOT_REQUIRED;
        this.f2439R = -1;
        this.v = -1;
        this.f2440R = new b0y();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || csc.class != obj.getClass()) {
            return false;
        }
        csc csc = (csc) obj;
        if (this.f2442R == csc.f2442R && this.f2443v == csc.f2443v && this.c == csc.c && this.e == csc.e && this.f2439R == csc.f2439R && this.v == csc.v && this.f2441R == csc.f2441R) {
            return this.f2440R.equals(csc.f2440R);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f2439R;
        long j2 = this.v;
        return this.f2440R.hashCode() + (((((((((((((this.f2441R.hashCode() * 31) + (this.f2442R ? 1 : 0)) * 31) + (this.f2443v ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public csc(kSx ksx) {
        this.f2441R = g_9.NOT_REQUIRED;
        this.f2439R = -1;
        this.v = -1;
        new HashSet();
        this.f2442R = false;
        this.f2443v = false;
        this.f2441R = ksx.f5299R;
        this.c = false;
        this.e = false;
        this.f2440R = ksx.R;
        this.f2439R = -1;
        this.v = -1;
    }

    public csc(csc csc) {
        this.f2441R = g_9.NOT_REQUIRED;
        this.f2439R = -1;
        this.v = -1;
        this.f2440R = new b0y();
        this.f2442R = csc.f2442R;
        this.f2443v = csc.f2443v;
        this.f2441R = csc.f2441R;
        this.c = csc.c;
        this.e = csc.e;
        this.f2440R = csc.f2440R;
    }
}
