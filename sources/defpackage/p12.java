package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;

/* renamed from: p12  reason: default package */
/* loaded from: classes.dex */
public final class p12 implements Closeable, Flushable {
    public static final String[] R = new String[128];

    /* renamed from: R  reason: collision with other field name */
    public final Writer f7052R;

    /* renamed from: R  reason: collision with other field name */
    public String f7053R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7054R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f7055R;
    public int e;
    public String v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f7056v;

    static {
        for (int i = 0; i <= 31; i++) {
            R[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = R;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public p12(StringWriter stringWriter) {
        int[] iArr = new int[32];
        this.f7055R = iArr;
        this.e = 0;
        if (iArr.length == 0) {
            this.f7055R = Arrays.copyOf(iArr, 0 * 2);
        }
        int[] iArr2 = this.f7055R;
        int i = this.e;
        this.e = i + 1;
        iArr2[i] = 6;
        this.f7053R = ":";
        this.f7056v = true;
        this.f7052R = stringWriter;
    }

    public final void C(long j) {
        o();
        R();
        this.f7052R.write(Long.toString(j));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String[] r0 = defpackage.p12.R
            java.io.Writer r1 = r8.f7052R
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L_0x000f:
            if (r3 >= r1) goto L_0x003e
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L_0x001e
            r5 = r0[r5]
            if (r5 != 0) goto L_0x002b
            goto L_0x003b
        L_0x001e:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L_0x0025
            java.lang.String r5 = "\\u2028"
            goto L_0x002b
        L_0x0025:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L_0x003b
            java.lang.String r5 = "\\u2029"
        L_0x002b:
            if (r4 >= r3) goto L_0x0034
            java.io.Writer r6 = r8.f7052R
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L_0x0034:
            java.io.Writer r4 = r8.f7052R
            r4.write(r5)
            int r4 = r3 + 1
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x003e:
            if (r4 >= r1) goto L_0x0046
            java.io.Writer r0 = r8.f7052R
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L_0x0046:
            java.io.Writer r8 = r8.f7052R
            r8.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p12.H(java.lang.String):void");
    }

    public final void O() {
        if (this.v != null) {
            if (this.f7056v) {
                o();
            } else {
                this.v = null;
                return;
            }
        }
        R();
        this.f7052R.write("null");
    }

    public final void R() {
        int Z = Z();
        if (Z == 1) {
            this.f7055R[this.e - 1] = 2;
        } else if (Z == 2) {
            this.f7052R.append(',');
        } else if (Z != 4) {
            if (Z != 6) {
                if (Z != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f7054R) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f7055R[this.e - 1] = 7;
        } else {
            this.f7052R.append((CharSequence) this.f7053R);
            this.f7055R[this.e - 1] = 5;
        }
    }

    public final void X(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.v != null) {
            throw new IllegalStateException();
        } else if (this.e != 0) {
            this.v = str;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public final int Z() {
        int i = this.e;
        if (i != 0) {
            return this.f7055R[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void c(int i, int i2, char c) {
        int Z = Z();
        if (Z != i2 && Z != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.v == null) {
            this.e--;
            this.f7052R.write(c);
        } else {
            StringBuilder U = opT.U("Dangling name: ");
            U.append(this.v);
            throw new IllegalStateException(U.toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7052R.close();
        int i = this.e;
        if (i > 1 || (i == 1 && this.f7055R[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.e = 0;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.e != 0) {
            this.f7052R.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void j(Number number) {
        if (number == null) {
            O();
            return;
        }
        o();
        String obj = number.toString();
        if (this.f7054R || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            R();
            this.f7052R.append((CharSequence) obj);
            return;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public final void o() {
        if (this.v != null) {
            int Z = Z();
            if (Z == 5) {
                this.f7052R.write(44);
            } else if (Z != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f7055R[this.e - 1] = 4;
            H(this.v);
            this.v = null;
        }
    }

    public final void t(String str) {
        if (str == null) {
            O();
            return;
        }
        o();
        R();
        H(str);
    }
}
