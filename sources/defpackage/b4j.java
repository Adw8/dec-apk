package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.io.EOFException;
import java.math.BigDecimal;

/* renamed from: b4j  reason: default package */
/* loaded from: classes.dex */
public final class b4j extends csz {
    public int O;

    /* renamed from: R  reason: collision with other field name */
    public long f1517R;

    /* renamed from: R  reason: collision with other field name */
    public final Jl f1518R;

    /* renamed from: R  reason: collision with other field name */
    public final ME f1519R;

    /* renamed from: R  reason: collision with other field name */
    public String f1520R;

    /* renamed from: X  reason: collision with other field name */
    public int f1521X = 0;
    public static final F6 R = kgV.e("'\\");
    public static final F6 v = kgV.e("\"\\");
    public static final F6 c = kgV.e("{}[]:, \n\t\r\f/\\;#=");
    public static final F6 e = kgV.e("\n\r");
    public static final F6 X = kgV.e("*/");

    static {
        F6 f6 = F6.R;
    }

    public b4j(Jl jl) {
        this.f1518R = jl;
        this.f1519R = jl.v();
        k(6);
    }

    @Override // defpackage.csz
    public final void B() {
        int i = this.f1521X;
        if (i == 0) {
            i = a();
        }
        if (i == 14) {
            long u = this.f1518R.u(c);
            ME me = this.f1519R;
            if (u == -1) {
                u = me.R;
            }
            me.J(u);
        } else if (i == 13) {
            iE(v);
        } else if (i == 12) {
            iE(R);
        } else if (i != 15) {
            StringBuilder U = opT.U("Expected a name but was ");
            U.append(jQ.Q(W()));
            U.append(" at path ");
            U.append(Z());
            throw new j8f(U.toString(), 0);
        }
        this.f1521X = 0;
        ((csz) this).f2445R[this.e - 1] = "null";
    }

    @Override // defpackage.csz
    public final double C() {
        int i = this.f1521X;
        if (i == 0) {
            i = a();
        }
        if (i == 16) {
            this.f1521X = 0;
            int[] iArr = this.v;
            int i2 = this.e - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f1517R;
        }
        if (i == 17) {
            this.f1520R = this.f1519R.B((long) this.O);
        } else if (i == 9) {
            this.f1520R = vr(v);
        } else if (i == 8) {
            this.f1520R = vr(R);
        } else if (i == 10) {
            this.f1520R = cr();
        } else if (i != 11) {
            StringBuilder U = opT.U("Expected a double but was ");
            U.append(jQ.Q(W()));
            U.append(" at path ");
            U.append(Z());
            throw new j8f(U.toString(), 0);
        }
        this.f1521X = 11;
        try {
            double parseDouble = Double.parseDouble(this.f1520R);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new iH7("JSON forbids NaN and infinities: " + parseDouble + " at path " + Z());
            }
            this.f1520R = null;
            this.f1521X = 0;
            int[] iArr2 = this.v;
            int i3 = this.e - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            StringBuilder U2 = opT.U("Expected a double but was ");
            U2.append(this.f1520R);
            U2.append(" at path ");
            U2.append(Z());
            throw new j8f(U2.toString(), 0);
        }
    }

    @Override // defpackage.csz
    public final int G(jsT jst) {
        int i = this.f1521X;
        if (i == 0) {
            i = a();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return q(this.f1520R, jst);
        }
        int p = this.f1518R.p((paU) jst.v);
        if (p != -1) {
            this.f1521X = 0;
            ((csz) this).f2445R[this.e - 1] = ((String[]) jst.R)[p];
            return p;
        }
        String str = ((csz) this).f2445R[this.e - 1];
        String zw = zw();
        int q = q(zw, jst);
        if (q == -1) {
            this.f1521X = 15;
            this.f1520R = zw;
            ((csz) this).f2445R[this.e - 1] = str;
        }
        return q;
    }

    @Override // defpackage.csz
    public final boolean H() {
        int i = this.f1521X;
        if (i == 0) {
            i = a();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    @Override // defpackage.csz
    public final void O() {
        int i = this.f1521X;
        if (i == 0) {
            i = a();
        }
        if (i == 2) {
            int i2 = this.e - 1;
            this.e = i2;
            ((csz) this).f2445R[i2] = null;
            int[] iArr = this.v;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f1521X = 0;
            return;
        }
        StringBuilder U = opT.U("Expected END_OBJECT but was ");
        U.append(jQ.Q(W()));
        U.append(" at path ");
        U.append(Z());
        throw new j8f(U.toString(), 0);
    }

    @Override // defpackage.csz
    public final void R() {
        int i = this.f1521X;
        if (i == 0) {
            i = a();
        }
        if (i == 3) {
            k(1);
            this.v[this.e - 1] = 0;
            this.f1521X = 0;
            return;
        }
        StringBuilder U = opT.U("Expected BEGIN_ARRAY but was ");
        U.append(jQ.Q(W()));
        U.append(" at path ");
        U.append(Z());
        throw new j8f(U.toString(), 0);
    }

    @Override // defpackage.csz
    public final int W() {
        int i = this.f1521X;
        if (i == 0) {
            i = a();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
            case 6:
                return 8;
            case 7:
                return 9;
            case VmNativeCallback.$stable /* 8 */:
            case 9:
            case 10:
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // defpackage.csz
    public final void X() {
        int i = this.f1521X;
        if (i == 0) {
            i = a();
        }
        if (i == 4) {
            int i2 = this.e - 1;
            this.e = i2;
            int[] iArr = this.v;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f1521X = 0;
            return;
        }
        StringBuilder U = opT.U("Expected END_ARRAY but was ");
        U.append(jQ.Q(W()));
        U.append(" at path ");
        U.append(Z());
        throw new j8f(U.toString(), 0);
    }

    public final boolean X4(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        f();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01bf, code lost:
        if (X4(r5) != false) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01c1, code lost:
        if (r2 != 2) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01c3, code lost:
        if (r4 == 0) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01c9, code lost:
        if (r11 != Long.MIN_VALUE) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01cb, code lost:
        if (r6 == 0) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01d1, code lost:
        if (r11 != 0) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01d3, code lost:
        if (r6 != 0) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01d5, code lost:
        if (r6 == 0) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01d8, code lost:
        r11 = -r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01d9, code lost:
        r17.f1517R = r11;
        r17.f1519R.J((long) r3);
        r13 = 16;
        r17.f1521X = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01e6, code lost:
        if (r2 == 2) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01e9, code lost:
        if (r2 == 4) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01ec, code lost:
        if (r2 != 7) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01ee, code lost:
        r17.O = r3;
        r13 = 17;
        r17.f1521X = 17;
     */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0218 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x013c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x013d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a() {
        /*
        // Method dump skipped, instructions count: 758
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b4j.a():int");
    }

    @Override // defpackage.csz
    public final void c() {
        int i = this.f1521X;
        if (i == 0) {
            i = a();
        }
        if (i == 1) {
            k(3);
            this.f1521X = 0;
            return;
        }
        StringBuilder U = opT.U("Expected BEGIN_OBJECT but was ");
        U.append(jQ.Q(W()));
        U.append(" at path ");
        U.append(Z());
        throw new j8f(U.toString(), 0);
    }

    public final char cE() {
        int i;
        int i2;
        if (this.f1518R.n(1)) {
            byte readByte = this.f1519R.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return '\b';
            }
            if (readByte == 102) {
                return '\f';
            }
            if (readByte == 110) {
                return '\n';
            }
            if (readByte == 114) {
                return '\r';
            }
            if (readByte == 116) {
                return '\t';
            }
            if (readByte != 117) {
                StringBuilder U = opT.U("Invalid escape sequence: \\");
                U.append((char) readByte);
                M(U.toString());
                throw null;
            } else if (this.f1518R.n(4)) {
                char c2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte j = this.f1519R.j((long) i3);
                    char c3 = (char) (c2 << 4);
                    if (j < 48 || j > 57) {
                        if (j >= 97 && j <= 102) {
                            i2 = j - 97;
                        } else if (j < 65 || j > 70) {
                            StringBuilder U2 = opT.U("\\u");
                            U2.append(this.f1519R.B(4));
                            M(U2.toString());
                            throw null;
                        } else {
                            i2 = j - 65;
                        }
                        i = i2 + 10;
                    } else {
                        i = j - 48;
                    }
                    c2 = (char) (i + c3);
                }
                this.f1519R.J(4);
                return c2;
            } else {
                StringBuilder U3 = opT.U("Unterminated escape sequence at path ");
                U3.append(Z());
                throw new EOFException(U3.toString());
            }
        } else {
            M("Unterminated escape sequence");
            throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1521X = 0;
        ((csz) this).R[0] = 8;
        this.e = 1;
        this.f1519R.X();
        this.f1518R.close();
    }

    public final String cr() {
        long u = this.f1518R.u(c);
        int i = (u > -1 ? 1 : (u == -1 ? 0 : -1));
        ME me = this.f1519R;
        return i != 0 ? me.B(u) : me.G();
    }

    @Override // defpackage.csz
    public final String d() {
        String str;
        int i = this.f1521X;
        if (i == 0) {
            i = a();
        }
        if (i == 10) {
            str = cr();
        } else if (i == 9) {
            str = vr(v);
        } else if (i == 8) {
            str = vr(R);
        } else if (i == 11) {
            str = this.f1520R;
            this.f1520R = null;
        } else if (i == 16) {
            str = Long.toString(this.f1517R);
        } else if (i == 17) {
            str = this.f1519R.B((long) this.O);
        } else {
            StringBuilder U = opT.U("Expected a string but was ");
            U.append(jQ.Q(W()));
            U.append(" at path ");
            U.append(Z());
            throw new j8f(U.toString(), 0);
        }
        this.f1521X = 0;
        int[] iArr = this.v;
        int i2 = this.e - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public final void f() {
        M("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final void iE(F6 f6) {
        while (true) {
            long u = this.f1518R.u(f6);
            if (u == -1) {
                M("Unterminated string");
                throw null;
            } else if (this.f1519R.j(u) == 92) {
                this.f1519R.J(u + 1);
                cE();
            } else {
                this.f1519R.J(u + 1);
                return;
            }
        }
    }

    @Override // defpackage.csz
    public final int j() {
        int i = this.f1521X;
        if (i == 0) {
            i = a();
        }
        if (i == 16) {
            long j = this.f1517R;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f1521X = 0;
                int[] iArr = this.v;
                int i3 = this.e - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder U = opT.U("Expected an int but was ");
            U.append(this.f1517R);
            U.append(" at path ");
            U.append(Z());
            throw new j8f(U.toString(), 0);
        }
        if (i == 17) {
            this.f1520R = this.f1519R.B((long) this.O);
        } else if (i == 9 || i == 8) {
            String vr = i == 9 ? vr(v) : vr(R);
            this.f1520R = vr;
            try {
                int parseInt = Integer.parseInt(vr);
                this.f1521X = 0;
                int[] iArr2 = this.v;
                int i4 = this.e - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder U2 = opT.U("Expected an int but was ");
            U2.append(jQ.Q(W()));
            U2.append(" at path ");
            U2.append(Z());
            throw new j8f(U2.toString(), 0);
        }
        this.f1521X = 11;
        try {
            double parseDouble = Double.parseDouble(this.f1520R);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f1520R = null;
                this.f1521X = 0;
                int[] iArr3 = this.v;
                int i6 = this.e - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            StringBuilder U3 = opT.U("Expected an int but was ");
            U3.append(this.f1520R);
            U3.append(" at path ");
            U3.append(Z());
            throw new j8f(U3.toString(), 0);
        } catch (NumberFormatException unused2) {
            StringBuilder U4 = opT.U("Expected an int but was ");
            U4.append(this.f1520R);
            U4.append(" at path ");
            U4.append(Z());
            throw new j8f(U4.toString(), 0);
        }
    }

    @Override // defpackage.csz
    public final void l() {
        int i = 0;
        do {
            int i2 = this.f1521X;
            if (i2 == 0) {
                i2 = a();
            }
            if (i2 == 3) {
                k(1);
            } else if (i2 == 1) {
                k(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i >= 0) {
                        this.e--;
                    } else {
                        StringBuilder U = opT.U("Expected a value but was ");
                        U.append(jQ.Q(W()));
                        U.append(" at path ");
                        U.append(Z());
                        throw new j8f(U.toString(), 0);
                    }
                } else if (i2 == 2) {
                    i--;
                    if (i >= 0) {
                        this.e--;
                    } else {
                        StringBuilder U2 = opT.U("Expected a value but was ");
                        U2.append(jQ.Q(W()));
                        U2.append(" at path ");
                        U2.append(Z());
                        throw new j8f(U2.toString(), 0);
                    }
                } else if (i2 == 14 || i2 == 10) {
                    long u = this.f1518R.u(c);
                    ME me = this.f1519R;
                    if (u == -1) {
                        u = me.R;
                    }
                    me.J(u);
                } else if (i2 == 9 || i2 == 13) {
                    iE(v);
                } else if (i2 == 8 || i2 == 12) {
                    iE(R);
                } else if (i2 == 17) {
                    this.f1519R.J((long) this.O);
                } else if (i2 == 18) {
                    StringBuilder U3 = opT.U("Expected a value but was ");
                    U3.append(jQ.Q(W()));
                    U3.append(" at path ");
                    U3.append(Z());
                    throw new j8f(U3.toString(), 0);
                }
                this.f1521X = 0;
            }
            i++;
            this.f1521X = 0;
        } while (i != 0);
        int[] iArr = this.v;
        int i3 = this.e;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        ((csz) this).f2445R[i3 - 1] = "null";
    }

    public final int mL(String str, jsT jst) {
        int length = ((String[]) jst.R).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) jst.R)[i])) {
                this.f1521X = 0;
                int[] iArr = this.v;
                int i2 = this.e - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.csz
    public final void o() {
        int i = this.f1521X;
        if (i == 0) {
            i = a();
        }
        if (i == 7) {
            this.f1521X = 0;
            int[] iArr = this.v;
            int i2 = this.e - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder U = opT.U("Expected null but was ");
        U.append(jQ.Q(W()));
        U.append(" at path ");
        U.append(Z());
        throw new j8f(U.toString(), 0);
    }

    public final int q(String str, jsT jst) {
        int length = ((String[]) jst.R).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) jst.R)[i])) {
                this.f1521X = 0;
                ((csz) this).f2445R[this.e - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.csz
    public final long t() {
        int i = this.f1521X;
        if (i == 0) {
            i = a();
        }
        if (i == 16) {
            this.f1521X = 0;
            int[] iArr = this.v;
            int i2 = this.e - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f1517R;
        }
        if (i == 17) {
            this.f1520R = this.f1519R.B((long) this.O);
        } else if (i == 9 || i == 8) {
            String vr = i == 9 ? vr(v) : vr(R);
            this.f1520R = vr;
            try {
                long parseLong = Long.parseLong(vr);
                this.f1521X = 0;
                int[] iArr2 = this.v;
                int i3 = this.e - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder U = opT.U("Expected a long but was ");
            U.append(jQ.Q(W()));
            U.append(" at path ");
            U.append(Z());
            throw new j8f(U.toString(), 0);
        }
        this.f1521X = 11;
        try {
            long longValueExact = new BigDecimal(this.f1520R).longValueExact();
            this.f1520R = null;
            this.f1521X = 0;
            int[] iArr3 = this.v;
            int i4 = this.e - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            StringBuilder U2 = opT.U("Expected a long but was ");
            U2.append(this.f1520R);
            U2.append(" at path ");
            U2.append(Z());
            throw new j8f(U2.toString(), 0);
        }
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder U = opT.U("JsonReader(");
        U.append(this.f1518R);
        U.append(")");
        return U.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r10.f1519R.J((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r1 != 47) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r10.f1518R.n(2) != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        f();
        r7 = r10.f1519R.j(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r7 == 42) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (r7 == 47) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        r10.f1519R.readByte();
        r10.f1519R.readByte();
        r0 = r10.f1518R.u(defpackage.b4j.e);
        r2 = r10.f1519R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        if (r0 == -1) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        r0 = r2.R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        r2.J(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        r10.f1519R.readByte();
        r10.f1519R.readByte();
        r1 = r10.f1518R;
        r2 = defpackage.b4j.X;
        r3 = r1.T(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        if (r3 == -1) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        r1 = r10.f1519R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r0 == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
        r3 = r3 + ((long) r2.f115R.length);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        r3 = r1.R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
        r1.J(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0097, code lost:
        if (r0 == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009b, code lost:
        M("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a1, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a4, code lost:
        if (r1 != 35) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a6, code lost:
        f();
        r0 = r10.f1518R.u(defpackage.b4j.e);
        r2 = r10.f1519R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b5, code lost:
        if (r0 == -1) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b7, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b9, code lost:
        r0 = r2.R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bb, code lost:
        r2.J(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c0, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int vl(boolean r11) {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b4j.vl(boolean):int");
    }

    public final String vr(F6 f6) {
        StringBuilder sb = null;
        while (true) {
            long u = this.f1518R.u(f6);
            if (u == -1) {
                M("Unterminated string");
                throw null;
            } else if (this.f1519R.j(u) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f1519R.B(u));
                this.f1519R.readByte();
                sb.append(cE());
            } else if (sb == null) {
                String B = this.f1519R.B(u);
                this.f1519R.readByte();
                return B;
            } else {
                sb.append(this.f1519R.B(u));
                this.f1519R.readByte();
                return sb.toString();
            }
        }
    }

    public final String zw() {
        String str;
        int i = this.f1521X;
        if (i == 0) {
            i = a();
        }
        if (i == 14) {
            str = cr();
        } else if (i == 13) {
            str = vr(v);
        } else if (i == 12) {
            str = vr(R);
        } else if (i == 15) {
            str = this.f1520R;
            this.f1520R = null;
        } else {
            StringBuilder U = opT.U("Expected a name but was ");
            U.append(jQ.Q(W()));
            U.append(" at path ");
            U.append(Z());
            throw new j8f(U.toString(), 0);
        }
        this.f1521X = 0;
        ((csz) this).f2445R[this.e - 1] = str;
        return str;
    }
}
