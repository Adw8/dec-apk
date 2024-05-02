package defpackage;

import java.util.Arrays;

/* renamed from: os  reason: default package */
/* loaded from: classes.dex */
public final class os implements n8 {

    /* renamed from: R  reason: collision with other field name */
    public final Wz f6984R;

    /* renamed from: R  reason: collision with other field name */
    public final piu f6985R;
    public int R = 0;
    public int v = 8;

    /* renamed from: R  reason: collision with other field name */
    public int[] f6988R = new int[8];

    /* renamed from: v  reason: collision with other field name */
    public int[] f6989v = new int[8];

    /* renamed from: R  reason: collision with other field name */
    public float[] f6987R = new float[8];
    public int c = -1;
    public int e = -1;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6986R = false;

    public os(Wz wz, piu piu) {
        this.f6984R = wz;
        this.f6985R = piu;
    }

    @Override // defpackage.n8
    public final boolean H(aLq alq) {
        int i = this.c;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.R) {
            if (this.f6988R[i] == alq.e) {
                return true;
            }
            i = this.f6989v[i];
            i2++;
        }
        return false;
    }

    @Override // defpackage.n8
    public final void L(float f) {
        int i = this.c;
        int i2 = 0;
        while (i != -1 && i2 < this.R) {
            float[] fArr = this.f6987R;
            fArr[i] = fArr[i] / f;
            i = this.f6989v[i];
            i2++;
        }
    }

    @Override // defpackage.n8
    public final float O(aLq alq, boolean z) {
        int i = this.c;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.R) {
            if (this.f6988R[i] == alq.e) {
                if (i == this.c) {
                    this.c = this.f6989v[i];
                } else {
                    int[] iArr = this.f6989v;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    alq.v(this.f6984R);
                }
                alq.m--;
                this.R--;
                this.f6988R[i] = -1;
                if (this.f6986R) {
                    this.e = i;
                }
                return this.f6987R[i];
            }
            i = this.f6989v[i];
            i2++;
            i3 = i;
        }
        return 0.0f;
    }

    @Override // defpackage.n8
    public final float R(Wz wz, boolean z) {
        float X = X(wz.f610R);
        O(wz.f610R, z);
        n8 n8Var = wz.f612R;
        int c = n8Var.c();
        for (int i = 0; i < c; i++) {
            aLq v = n8Var.v(i);
            e(v, n8Var.X(v) * X, z);
        }
        return X;
    }

    @Override // defpackage.n8
    public final float X(aLq alq) {
        int i = this.c;
        int i2 = 0;
        while (i != -1 && i2 < this.R) {
            if (this.f6988R[i] == alq.e) {
                return this.f6987R[i];
            }
            i = this.f6989v[i];
            i2++;
        }
        return 0.0f;
    }

    @Override // defpackage.n8
    public final void Z(aLq alq, float f) {
        if (f == 0.0f) {
            O(alq, true);
            return;
        }
        int i = this.c;
        if (i == -1) {
            this.c = 0;
            this.f6987R[0] = f;
            this.f6988R[0] = alq.e;
            this.f6989v[0] = -1;
            alq.m++;
            alq.R(this.f6984R);
            this.R++;
            if (!this.f6986R) {
                int i2 = this.e + 1;
                this.e = i2;
                int[] iArr = this.f6988R;
                if (i2 >= iArr.length) {
                    this.f6986R = true;
                    this.e = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.R) {
            int i5 = this.f6988R[i];
            int i6 = alq.e;
            if (i5 == i6) {
                this.f6987R[i] = f;
                return;
            }
            if (i5 < i6) {
                i4 = i;
            }
            i = this.f6989v[i];
            i3++;
        }
        int i7 = this.e;
        i7++;
        if (this.f6986R) {
            int[] iArr2 = this.f6988R;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        }
        int[] iArr3 = this.f6988R;
        if (i7 >= iArr3.length && this.R < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f6988R;
                if (i8 >= iArr4.length) {
                    break;
                } else if (iArr4[i8] == -1) {
                    i7 = i8;
                    break;
                } else {
                    i8++;
                }
            }
        }
        int[] iArr5 = this.f6988R;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i9 = this.v * 2;
            this.v = i9;
            this.f6986R = false;
            this.e = i7 - 1;
            this.f6987R = Arrays.copyOf(this.f6987R, i9);
            this.f6988R = Arrays.copyOf(this.f6988R, this.v);
            this.f6989v = Arrays.copyOf(this.f6989v, this.v);
        }
        this.f6988R[i7] = alq.e;
        this.f6987R[i7] = f;
        if (i4 != -1) {
            int[] iArr6 = this.f6989v;
            iArr6[i7] = iArr6[i4];
            iArr6[i4] = i7;
        } else {
            this.f6989v[i7] = this.c;
            this.c = i7;
        }
        alq.m++;
        alq.R(this.f6984R);
        int i10 = this.R + 1;
        this.R = i10;
        if (!this.f6986R) {
            this.e++;
        }
        int[] iArr7 = this.f6988R;
        if (i10 >= iArr7.length) {
            this.f6986R = true;
        }
        if (this.e >= iArr7.length) {
            this.f6986R = true;
            this.e = iArr7.length - 1;
        }
    }

    @Override // defpackage.n8
    public final int c() {
        return this.R;
    }

    @Override // defpackage.n8
    public final void clear() {
        int i = this.c;
        int i2 = 0;
        while (i != -1 && i2 < this.R) {
            aLq alq = ((aLq[]) this.f6985R.e)[this.f6988R[i]];
            if (alq != null) {
                alq.v(this.f6984R);
            }
            i = this.f6989v[i];
            i2++;
        }
        this.c = -1;
        this.e = -1;
        this.f6986R = false;
        this.R = 0;
    }

    @Override // defpackage.n8
    public final void e(aLq alq, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.c;
            if (i == -1) {
                this.c = 0;
                this.f6987R[0] = f;
                this.f6988R[0] = alq.e;
                this.f6989v[0] = -1;
                alq.m++;
                alq.R(this.f6984R);
                this.R++;
                if (!this.f6986R) {
                    int i2 = this.e + 1;
                    this.e = i2;
                    int[] iArr = this.f6988R;
                    if (i2 >= iArr.length) {
                        this.f6986R = true;
                        this.e = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.R) {
                int i5 = this.f6988R[i];
                int i6 = alq.e;
                if (i5 == i6) {
                    float[] fArr = this.f6987R;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.c) {
                            this.c = this.f6989v[i];
                        } else {
                            int[] iArr2 = this.f6989v;
                            iArr2[i4] = iArr2[i];
                        }
                        if (z) {
                            alq.v(this.f6984R);
                        }
                        if (this.f6986R) {
                            this.e = i;
                        }
                        alq.m--;
                        this.R--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i4 = i;
                }
                i = this.f6989v[i];
                i3++;
            }
            int i7 = this.e;
            i7++;
            if (this.f6986R) {
                int[] iArr3 = this.f6988R;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            }
            int[] iArr4 = this.f6988R;
            if (i7 >= iArr4.length && this.R < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f6988R;
                    if (i8 >= iArr5.length) {
                        break;
                    } else if (iArr5[i8] == -1) {
                        i7 = i8;
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            int[] iArr6 = this.f6988R;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i9 = this.v * 2;
                this.v = i9;
                this.f6986R = false;
                this.e = i7 - 1;
                this.f6987R = Arrays.copyOf(this.f6987R, i9);
                this.f6988R = Arrays.copyOf(this.f6988R, this.v);
                this.f6989v = Arrays.copyOf(this.f6989v, this.v);
            }
            this.f6988R[i7] = alq.e;
            this.f6987R[i7] = f;
            if (i4 != -1) {
                int[] iArr7 = this.f6989v;
                iArr7[i7] = iArr7[i4];
                iArr7[i4] = i7;
            } else {
                this.f6989v[i7] = this.c;
                this.c = i7;
            }
            alq.m++;
            alq.R(this.f6984R);
            this.R++;
            if (!this.f6986R) {
                this.e++;
            }
            int i10 = this.e;
            int[] iArr8 = this.f6988R;
            if (i10 >= iArr8.length) {
                this.f6986R = true;
                this.e = iArr8.length - 1;
            }
        }
    }

    @Override // defpackage.n8
    public final float m(int i) {
        int i2 = this.c;
        int i3 = 0;
        while (i2 != -1 && i3 < this.R) {
            if (i3 == i) {
                return this.f6987R[i2];
            }
            i2 = this.f6989v[i2];
            i3++;
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.c;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.R) {
            StringBuilder U = opT.U(opT.H(str, " -> "));
            U.append(this.f6987R[i]);
            U.append(" : ");
            StringBuilder U2 = opT.U(U.toString());
            U2.append(((aLq[]) this.f6985R.e)[this.f6988R[i]]);
            str = U2.toString();
            i = this.f6989v[i];
            i2++;
        }
        return str;
    }

    @Override // defpackage.n8
    public final aLq v(int i) {
        int i2 = this.c;
        int i3 = 0;
        while (i2 != -1 && i3 < this.R) {
            if (i3 == i) {
                return ((aLq[]) this.f6985R.e)[this.f6988R[i2]];
            }
            i2 = this.f6989v[i2];
            i3++;
        }
        return null;
    }

    @Override // defpackage.n8
    public final void x() {
        int i = this.c;
        int i2 = 0;
        while (i != -1 && i2 < this.R) {
            float[] fArr = this.f6987R;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f6989v[i];
            i2++;
        }
    }
}
