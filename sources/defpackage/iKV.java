package defpackage;

import android.util.SparseArray;
import java.util.Arrays;

/* renamed from: iKV  reason: default package */
/* loaded from: classes.dex */
public final class iKV {
    public int R = 1;

    /* renamed from: R  reason: collision with other field name */
    public final e1o f4537R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f4538R;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f4539R;
    public int c;

    /* renamed from: c  reason: collision with other field name */
    public e1o f4540c;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public e1o f4541v;

    public iKV(e1o e1o, boolean z, int[] iArr) {
        this.f4537R = e1o;
        this.f4541v = e1o;
        this.f4538R = z;
        this.f4539R = iArr;
    }

    public final int R(int i) {
        SparseArray sparseArray = this.f4541v.R;
        e1o e1o = sparseArray == null ? null : (e1o) sparseArray.get(i);
        int i2 = 3;
        if (this.R == 2) {
            if (e1o != null) {
                this.f4541v = e1o;
                this.c++;
            } else {
                boolean z = false;
                if (i == 65038) {
                    v();
                } else {
                    if (i == 65039) {
                        z = true;
                    }
                    if (!z) {
                        e1o e1o2 = this.f4541v;
                        if (e1o2.f2939R == null) {
                            v();
                        } else if (this.c != 1) {
                            this.f4540c = e1o2;
                            v();
                        } else if (c()) {
                            this.f4540c = this.f4541v;
                            v();
                        } else {
                            v();
                        }
                    }
                }
                i2 = 1;
            }
            i2 = 2;
        } else if (e1o == null) {
            v();
            i2 = 1;
        } else {
            this.R = 2;
            this.f4541v = e1o;
            this.c = 1;
            i2 = 2;
        }
        this.v = i;
        return i2;
    }

    public final boolean c() {
        a8Z e = this.f4541v.f2939R.e();
        int R = e.R(6);
        if ((R == 0 || ((kY7) e).f5345R.get(R + ((kY7) e).R) == 0) ? false : true) {
            return true;
        }
        if (this.v == 65039) {
            return true;
        }
        if (this.f4538R) {
            if (this.f4539R == null) {
                return true;
            }
            if (Arrays.binarySearch(this.f4539R, this.f4541v.f2939R.R(0)) < 0) {
                return true;
            }
        }
        return false;
    }

    public final void v() {
        this.R = 1;
        this.f4541v = this.f4537R;
        this.c = 0;
    }
}
