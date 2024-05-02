package defpackage;

import java.util.Arrays;

/* renamed from: iXx  reason: default package */
/* loaded from: classes.dex */
public abstract class iXx {
    public fpB[] R;
    private volatile /* synthetic */ int _size = 0;

    public final void R(fpB fpb) {
        fpb.X((mr0) this);
        fpB[] fpbArr = this.R;
        if (fpbArr == null) {
            fpbArr = new fpB[4];
            this.R = fpbArr;
        } else if (this._size >= fpbArr.length) {
            fpbArr = (fpB[]) Arrays.copyOf(fpbArr, this._size * 2);
            this.R = fpbArr;
        }
        int i = this._size;
        this._size = i + 1;
        fpbArr[i] = fpb;
        fpb.e = i;
        while (i > 0) {
            fpB[] fpbArr2 = this.R;
            int i2 = (i - 1) / 2;
            if (fpbArr2[i2].compareTo(fpbArr2[i]) > 0) {
                X(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    public final void X(int i, int i2) {
        fpB[] fpbArr = this.R;
        fpB fpb = fpbArr[i2];
        fpB fpb2 = fpbArr[i];
        fpbArr[i] = fpb;
        fpbArr[i2] = fpb2;
        fpb.e = i;
        fpb2.e = i2;
    }

    public final fpB c(int i) {
        fpB[] fpbArr = this.R;
        this._size--;
        if (i < this._size) {
            X(i, this._size);
            int i2 = (i - 1) / 2;
            if (i <= 0 || fpbArr[i].compareTo(fpbArr[i2]) >= 0) {
                while (true) {
                    int i3 = (i * 2) + 1;
                    if (i3 >= this._size) {
                        break;
                    }
                    fpB[] fpbArr2 = this.R;
                    int i4 = i3 + 1;
                    if (i4 < this._size && fpbArr2[i4].compareTo(fpbArr2[i3]) < 0) {
                        i3 = i4;
                    }
                    if (fpbArr2[i].compareTo(fpbArr2[i3]) <= 0) {
                        break;
                    }
                    X(i, i3);
                    i = i3;
                }
            } else {
                X(i, i2);
                while (i2 > 0) {
                    fpB[] fpbArr3 = this.R;
                    int i5 = (i2 - 1) / 2;
                    if (fpbArr3[i5].compareTo(fpbArr3[i2]) <= 0) {
                        break;
                    }
                    X(i2, i5);
                    i2 = i5;
                }
            }
        }
        fpB fpb = fpbArr[this._size];
        fpb.X(null);
        fpb.e = -1;
        fpbArr[this._size] = null;
        return fpb;
    }

    public final fpB e() {
        fpB c;
        synchronized (this) {
            c = this._size > 0 ? c(0) : null;
        }
        return c;
    }

    public final boolean v() {
        return this._size == 0;
    }
}
