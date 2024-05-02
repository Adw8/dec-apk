package defpackage;

/* renamed from: T_  reason: default package */
/* loaded from: classes.dex */
public final class T_ {
    public final long R;
    public final long c;
    public final long e;
    public final long v;

    public T_(long j, long j2, long j3, long j4) {
        this.R = j;
        this.v = j2;
        this.c = j3;
        this.e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof T_)) {
            return false;
        }
        T_ t_ = (T_) obj;
        return n3.c(this.R, t_.R) && n3.c(this.v, t_.v) && n3.c(this.c, t_.c) && n3.c(this.e, t_.e);
    }

    public final int hashCode() {
        long j = this.R;
        int i = n3.R;
        return ejC.R(this.e) + jQ.e(this.c, jQ.e(this.v, ejC.R(j) * 31, 31), 31);
    }
}
