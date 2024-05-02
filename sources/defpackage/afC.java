package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;

/* renamed from: afC  reason: default package */
/* loaded from: classes.dex */
public class afC implements Closeable {
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public final Reader f956R;

    /* renamed from: R  reason: collision with other field name */
    public String f957R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f960R;
    public int m;

    /* renamed from: R  reason: collision with other field name */
    public boolean f958R = false;

    /* renamed from: R  reason: collision with other field name */
    public final char[] f959R = new char[1024];
    public int e = 0;
    public int X = 0;
    public int O = 0;
    public int L = 0;
    public int Z = 0;
    public int x = 1;

    /* renamed from: R  reason: collision with other field name */
    public String[] f961R = new String[32];
    public int[] v = new int[32];

    public afC(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f960R = iArr;
        iArr[0] = 6;
        this.f956R = stringReader;
    }

    public final void B() {
        int i = this.Z;
        if (i == 0) {
            i = O();
        }
        if (i == 7) {
            this.Z = 0;
            int[] iArr = this.v;
            int i2 = this.x - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder U = opT.U("Expected null but was ");
        U.append(opT.j(a()));
        U.append(o());
        throw new IllegalStateException(U.toString());
    }

    public final boolean C(int i) {
        int i2;
        int i3;
        char[] cArr = this.f959R;
        int i4 = this.L;
        int i5 = this.e;
        this.L = i4 - i5;
        int i6 = this.X;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.X = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.X = 0;
        }
        this.e = 0;
        do {
            Reader reader = this.f956R;
            int i8 = this.X;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.X + read;
            this.X = i2;
            if (this.O == 0 && (i3 = this.L) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.e++;
                this.L = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    public final int G(boolean z) {
        char[] cArr = this.f959R;
        int i = this.e;
        int i2 = this.X;
        while (true) {
            boolean z2 = true;
            if (i == i2) {
                this.e = i;
                if (C(1)) {
                    i = this.e;
                    i2 = this.X;
                } else if (!z) {
                    return -1;
                } else {
                    StringBuilder U = opT.U("End of input");
                    U.append(o());
                    throw new EOFException(U.toString());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.O++;
                this.L = i3;
            } else if (!(c == ' ' || c == '\r' || c == '\t')) {
                if (c == '/') {
                    this.e = i3;
                    if (i3 == i2) {
                        this.e = i3 - 1;
                        boolean C = C(2);
                        this.e++;
                        if (!C) {
                            return c;
                        }
                    }
                    X();
                    int i4 = this.e;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.e = i4 + 1;
                        while (true) {
                            if (this.e + 2 > this.X && !C(2)) {
                                z2 = false;
                                break;
                            }
                            char[] cArr2 = this.f959R;
                            int i5 = this.e;
                            if (cArr2[i5] != '\n') {
                                for (int i6 = 0; i6 < 2; i6++) {
                                    if (this.f959R[this.e + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                }
                                break;
                            }
                            this.O++;
                            this.L = i5 + 1;
                            this.e++;
                        }
                        if (z2) {
                            i = this.e + 2;
                            i2 = this.X;
                        } else {
                            X4("Unterminated comment");
                            throw null;
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.e = i4 + 1;
                        mL();
                        i = this.e;
                        i2 = this.X;
                    }
                } else if (c == '#') {
                    this.e = i3;
                    X();
                    mL();
                    i = this.e;
                    i2 = this.X;
                } else {
                    this.e = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    public final void H() {
        int i = this.Z;
        if (i == 0) {
            i = O();
        }
        if (i == 2) {
            int i2 = this.x - 1;
            this.x = i2;
            this.f961R[i2] = null;
            int[] iArr = this.v;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.Z = 0;
            return;
        }
        StringBuilder U = opT.U("Expected END_OBJECT but was ");
        U.append(opT.j(a()));
        U.append(o());
        throw new IllegalStateException(U.toString());
    }

    public final String M() {
        String str;
        int i = this.Z;
        if (i == 0) {
            i = O();
        }
        if (i == 10) {
            str = f();
        } else if (i == 8) {
            str = l('\'');
        } else if (i == 9) {
            str = l('\"');
        } else if (i == 11) {
            str = this.f957R;
            this.f957R = null;
        } else if (i == 15) {
            str = Long.toString(this.R);
        } else if (i == 16) {
            str = new String(this.f959R, this.e, this.m);
            this.e += this.m;
        } else {
            StringBuilder U = opT.U("Expected a string but was ");
            U.append(opT.j(a()));
            U.append(o());
            throw new IllegalStateException(U.toString());
        }
        this.Z = 0;
        int[] iArr = this.v;
        int i2 = this.x - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0214, code lost:
        if (t(r1) != false) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0216, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0217, code lost:
        if (r10 != 2) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0219, code lost:
        if (r15 == false) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x021f, code lost:
        if (r11 != Long.MIN_VALUE) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0221, code lost:
        if (r16 == 0) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0227, code lost:
        if (r11 != 0) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0229, code lost:
        if (r16 != 0) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x022b, code lost:
        if (r16 == 0) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x022e, code lost:
        r11 = -r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x022f, code lost:
        r19.R = r11;
        r19.e += r5;
        r8 = 15;
        r19.Z = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x023b, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x023c, code lost:
        if (r10 == r1) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x023f, code lost:
        if (r10 == 4) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0242, code lost:
        if (r10 != 7) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0244, code lost:
        r19.m = r5;
        r8 = 16;
        r19.Z = 16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0181 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0273 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int O() {
        /*
        // Method dump skipped, instructions count: 806
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afC.O():int");
    }

    public final void R() {
        int i = this.Z;
        if (i == 0) {
            i = O();
        }
        if (i == 3) {
            q(1);
            this.v[this.x - 1] = 0;
            this.Z = 0;
            return;
        }
        StringBuilder U = opT.U("Expected BEGIN_ARRAY but was ");
        U.append(opT.j(a()));
        U.append(o());
        throw new IllegalStateException(U.toString());
    }

    public final int W() {
        int i = this.Z;
        if (i == 0) {
            i = O();
        }
        if (i == 15) {
            long j = this.R;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.Z = 0;
                int[] iArr = this.v;
                int i3 = this.x - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder U = opT.U("Expected an int but was ");
            U.append(this.R);
            U.append(o());
            throw new NumberFormatException(U.toString());
        }
        if (i == 16) {
            this.f957R = new String(this.f959R, this.e, this.m);
            this.e += this.m;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f957R = f();
            } else {
                this.f957R = l(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f957R);
                this.Z = 0;
                int[] iArr2 = this.v;
                int i4 = this.x - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder U2 = opT.U("Expected an int but was ");
            U2.append(opT.j(a()));
            U2.append(o());
            throw new IllegalStateException(U2.toString());
        }
        this.Z = 11;
        double parseDouble = Double.parseDouble(this.f957R);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f957R = null;
            this.Z = 0;
            int[] iArr3 = this.v;
            int i6 = this.x - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        StringBuilder U3 = opT.U("Expected an int but was ");
        U3.append(this.f957R);
        U3.append(o());
        throw new NumberFormatException(U3.toString());
    }

    public final void X() {
        if (!this.f958R) {
            X4("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    public final void X4(String str) {
        StringBuilder U = opT.U(str);
        U.append(o());
        throw new bXa(U.toString());
    }

    public final void Z() {
        int i = this.Z;
        if (i == 0) {
            i = O();
        }
        if (i == 4) {
            int i2 = this.x - 1;
            this.x = i2;
            int[] iArr = this.v;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.Z = 0;
            return;
        }
        StringBuilder U = opT.U("Expected END_ARRAY but was ");
        U.append(opT.j(a()));
        U.append(o());
        throw new IllegalStateException(U.toString());
    }

    public final int a() {
        int i = this.Z;
        if (i == 0) {
            i = O();
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
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void c() {
        int i = this.Z;
        if (i == 0) {
            i = O();
        }
        if (i == 1) {
            q(3);
            this.Z = 0;
            return;
        }
        StringBuilder U = opT.U("Expected BEGIN_OBJECT but was ");
        U.append(opT.j(a()));
        U.append(o());
        throw new IllegalStateException(U.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.Z = 0;
        this.f960R[0] = 8;
        this.x = 1;
        this.f956R.close();
    }

    public final boolean d() {
        int i = this.Z;
        if (i == 0) {
            i = O();
        }
        if (i == 5) {
            this.Z = 0;
            int[] iArr = this.v;
            int i2 = this.x - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.Z = 0;
            int[] iArr2 = this.v;
            int i3 = this.x - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder U = opT.U("Expected a boolean but was ");
            U.append(opT.j(a()));
            U.append(o());
            throw new IllegalStateException(U.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004a, code lost:
        X();
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String f() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r0
        L_0x0003:
            int r3 = r6.e
            int r4 = r3 + r2
            int r5 = r6.X
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f959R
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.X()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f959R
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.C(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f959R
            int r4 = r6.e
            r1.append(r3, r4, r2)
            int r3 = r6.e
            int r3 = r3 + r2
            r6.e = r3
            r2 = 1
            boolean r2 = r6.C(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f959R
            int r3 = r6.e
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f959R
            int r3 = r6.e
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.e
            int r2 = r2 + r0
            r6.e = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afC.f():java.lang.String");
    }

    public final boolean j() {
        int i = this.Z;
        if (i == 0) {
            i = O();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public final String k() {
        String str;
        int i = this.Z;
        if (i == 0) {
            i = O();
        }
        if (i == 14) {
            str = f();
        } else if (i == 12) {
            str = l('\'');
        } else if (i == 13) {
            str = l('\"');
        } else {
            StringBuilder U = opT.U("Expected a name but was ");
            U.append(opT.j(a()));
            U.append(o());
            throw new IllegalStateException(U.toString());
        }
        this.Z = 0;
        this.f961R[this.x - 1] = str;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ce, code lost:
        r0 = defpackage.opT.U("\\u");
        r0.append(new java.lang.String(r11.f959R, r11.e, 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00e9, code lost:
        throw new java.lang.NumberFormatException(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x011f, code lost:
        if (r2 != null) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0121, code lost:
        r2 = new java.lang.StringBuilder(java.lang.Math.max((r5 - r3) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x012f, code lost:
        r2.append(r0, r3, r5 - r3);
        r11.e = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String l(char r12) {
        /*
        // Method dump skipped, instructions count: 324
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afC.l(char):java.lang.String");
    }

    public final void mL() {
        char c;
        do {
            if (this.e < this.X || C(1)) {
                char[] cArr = this.f959R;
                int i = this.e;
                int i2 = i + 1;
                this.e = i2;
                c = cArr[i];
                if (c == '\n') {
                    this.O++;
                    this.L = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    public final String o() {
        StringBuilder y = jQ.y(" at line ", this.O + 1, " column ", (this.e - this.L) + 1, " path ");
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.x;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f960R[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.v[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.f961R[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        y.append(sb.toString());
        return y.toString();
    }

    public final void q(int i) {
        int i2 = this.x;
        int[] iArr = this.f960R;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f960R = Arrays.copyOf(iArr, i3);
            this.v = Arrays.copyOf(this.v, i3);
            this.f961R = (String[]) Arrays.copyOf(this.f961R, i3);
        }
        int[] iArr2 = this.f960R;
        int i4 = this.x;
        this.x = i4 + 1;
        iArr2[i4] = i;
    }

    public final boolean t(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        X();
        return false;
    }

    @Override // java.lang.Object
    public final String toString() {
        return afC.class.getSimpleName() + o();
    }
}
