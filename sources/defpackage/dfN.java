package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: dfN  reason: default package */
/* loaded from: classes.dex */
public final class dfN extends mot {
    public static final String[] v = new String[128];
    public final NV R;
    public String c;

    /* renamed from: v  reason: collision with other field name */
    public String f2802v = ":";

    static {
        for (int i = 0; i <= 31; i++) {
            v[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = v;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public dfN(ME me) {
        this.R = me;
        int[] iArr = ((mot) this).f6168R;
        int i = this.e;
        this.e = i + 1;
        iArr[i] = 6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void l(defpackage.NV r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = defpackage.dfN.v
            r1 = 34
            r7.I(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        L_0x000d:
            if (r3 >= r2) goto L_0x0036
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L_0x001c
            r5 = r0[r5]
            if (r5 != 0) goto L_0x0029
            goto L_0x0033
        L_0x001c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L_0x0023
            java.lang.String r5 = "\\u2028"
            goto L_0x0029
        L_0x0023:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L_0x0033
            java.lang.String r5 = "\\u2029"
        L_0x0029:
            if (r4 >= r3) goto L_0x002e
            r7.s(r4, r3, r8)
        L_0x002e:
            r7.w(r5)
            int r4 = r3 + 1
        L_0x0033:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0036:
            if (r4 >= r2) goto L_0x003b
            r7.s(r4, r2, r8)
        L_0x003b:
            r7.I(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfN.l(NV, java.lang.String):void");
    }

    public final void B(int i, int i2, char c) {
        int i3;
        int i4 = this.e;
        int i5 = this.X;
        if (i4 == i5 && ((i3 = ((mot) this).f6168R[i4 - 1]) == i || i3 == i2)) {
            this.X = ~i5;
            return;
        }
        W();
        int i6 = this.e;
        int[] iArr = ((mot) this).f6168R;
        if (i6 == iArr.length) {
            if (i6 != 256) {
                ((mot) this).f6168R = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = ((mot) this).f6169R;
                ((mot) this).f6169R = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = super.v;
                super.v = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder U = opT.U("Nesting too deep at ");
                U.append(O());
                U.append(": circular reference?");
                throw new j8f(U.toString(), 0);
            }
        }
        int[] iArr3 = ((mot) this).f6168R;
        int i7 = this.e;
        int i8 = i7 + 1;
        this.e = i8;
        iArr3[i7] = i;
        super.v[i8 - 1] = 0;
        this.R.I(c);
    }

    public final void G() {
        if (((mot) this).R != null) {
            this.R.I(10);
            int i = this.e;
            for (int i2 = 1; i2 < i; i2++) {
                this.R.w(((mot) this).R);
            }
        }
    }

    @Override // defpackage.mot
    public final dfN H() {
        if (((mot) this).f6167R) {
            StringBuilder U = opT.U("null cannot be used as a map key in JSON at path ");
            U.append(O());
            throw new IllegalStateException(U.toString());
        } else if (this.c != null) {
            this.c = null;
            return this;
        } else {
            W();
            this.R.w("null");
            int[] iArr = super.v;
            int i = this.e - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    public final void M() {
        if (this.c != null) {
            int C = C();
            if (C == 5) {
                this.R.I(44);
            } else if (C != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            G();
            ((mot) this).f6168R[this.e - 1] = 4;
            l(this.R, this.c);
            this.c = null;
        }
    }

    @Override // defpackage.mot
    public final dfN R() {
        if (!((mot) this).f6167R) {
            M();
            B(1, 2, '[');
            return this;
        }
        StringBuilder U = opT.U("Array cannot be used as a map key in JSON at path ");
        U.append(O());
        throw new IllegalStateException(U.toString());
    }

    public final void W() {
        int C = C();
        int i = 7;
        if (C != 1) {
            if (C != 2) {
                if (C == 4) {
                    i = 5;
                    this.R.w(this.f2802v);
                } else if (C == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                } else if (C != 6) {
                    if (C == 7) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                    throw new IllegalStateException("Nesting problem.");
                }
                ((mot) this).f6168R[this.e - 1] = i;
            }
            this.R.I(44);
        }
        G();
        i = 2;
        ((mot) this).f6168R[this.e - 1] = i;
    }

    @Override // defpackage.mot
    public final dfN X() {
        ((mot) this).f6167R = false;
        k(3, 5, '}');
        return this;
    }

    @Override // defpackage.mot
    public final dfN Z(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.e != 0) {
            int C = C();
            if ((C == 3 || C == 5) && this.c == null && !((mot) this).f6167R) {
                this.c = str;
                ((mot) this).f6169R[this.e - 1] = str;
                return this;
            }
            throw new IllegalStateException("Nesting problem.");
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // defpackage.mot
    public final dfN c() {
        if (!((mot) this).f6167R) {
            M();
            B(3, 5, '{');
            return this;
        }
        StringBuilder U = opT.U("Object cannot be used as a map key in JSON at path ");
        U.append(O());
        throw new IllegalStateException(U.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.R.close();
        int i = this.e;
        if (i > 1 || (i == 1 && ((mot) this).f6168R[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.e = 0;
    }

    @Override // defpackage.mot
    public final dfN d(String str) {
        if (str == null) {
            H();
            return this;
        } else if (((mot) this).f6167R) {
            ((mot) this).f6167R = false;
            Z(str);
            return this;
        } else {
            M();
            W();
            l(this.R, str);
            int[] iArr = super.v;
            int i = this.e - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.e != 0) {
            this.R.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // defpackage.mot
    public final void j(String str) {
        ((mot) this).R = !str.isEmpty() ? str : null;
        this.f2802v = !str.isEmpty() ? ": " : ":";
    }

    public final void k(int i, int i2, char c) {
        int C = C();
        if (C != i2 && C != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.c == null) {
            int i3 = this.e;
            int i4 = ~this.X;
            if (i3 == i4) {
                this.X = i4;
                return;
            }
            int i5 = i3 - 1;
            this.e = i5;
            ((mot) this).f6169R[i5] = null;
            int[] iArr = super.v;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
            if (C == i2) {
                G();
            }
            this.R.I(c);
        } else {
            StringBuilder U = opT.U("Dangling name: ");
            U.append(this.c);
            throw new IllegalStateException(U.toString());
        }
    }

    @Override // defpackage.mot
    public final dfN o(Number number) {
        if (number == null) {
            H();
            return this;
        }
        String obj = number.toString();
        if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        } else if (((mot) this).f6167R) {
            ((mot) this).f6167R = false;
            Z(obj);
            return this;
        } else {
            M();
            W();
            this.R.w(obj);
            int[] iArr = super.v;
            int i = this.e - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    @Override // defpackage.mot
    public final dfN t(long j) {
        if (((mot) this).f6167R) {
            ((mot) this).f6167R = false;
            Z(Long.toString(j));
            return this;
        }
        M();
        W();
        this.R.w(Long.toString(j));
        int[] iArr = super.v;
        int i = this.e - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}
