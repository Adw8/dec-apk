package defpackage;

/* renamed from: kJ  reason: default package */
/* loaded from: classes.dex */
public final class kJ {
    public final long R;
    public final long c;
    public final long e;
    public final long v;

    public kJ(long j, long j2, long j3, long j4) {
        this.R = j;
        this.v = j2;
        this.c = j3;
        this.e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kJ)) {
            return false;
        }
        kJ kJVar = (kJ) obj;
        return n3.c(this.R, kJVar.R) && n3.c(this.v, kJVar.v) && n3.c(this.c, kJVar.c) && n3.c(this.e, kJVar.e);
    }

    public final int hashCode() {
        long j = this.R;
        int i = n3.R;
        return ejC.R(this.e) + jQ.e(this.c, jQ.e(this.v, ejC.R(j) * 31, 31), 31);
    }
}
