package defpackage;

import com.termux.terminal.Y;
import java.util.Arrays;
import java.util.Stack;

/* renamed from: gje  reason: default package */
/* loaded from: classes.dex */
public final class gje {
    public static final Integer[] R = {0, 1, 2};
    public int C;
    public int H;
    public int L;

    /* renamed from: L  reason: collision with other field name */
    public boolean f3886L;
    public int N;
    public int O;

    /* renamed from: O  reason: collision with other field name */
    public boolean f3887O;
    public int P;

    /* renamed from: R  reason: collision with other field name */
    public byte f3888R;

    /* renamed from: R  reason: collision with other field name */
    public int f3889R;

    /* renamed from: R  reason: collision with other field name */
    public final Y f3890R;

    /* renamed from: R  reason: collision with other field name */
    public final idE f3891R;

    /* renamed from: R  reason: collision with other field name */
    public Integer f3892R;

    /* renamed from: R  reason: collision with other field name */
    public String f3893R;

    /* renamed from: R  reason: collision with other field name */
    public nAq f3897R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3899R;

    /* renamed from: R  reason: collision with other field name */
    public boolean[] f3902R;
    public int U;
    public int Z;

    /* renamed from: Z  reason: collision with other field name */
    public boolean f3904Z;
    public int c;

    /* renamed from: c  reason: collision with other field name */
    public idE f3905c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f3906c;
    public int e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f3907e;
    public int j;
    public int m;

    /* renamed from: m  reason: collision with other field name */
    public boolean f3908m;
    public byte v;

    /* renamed from: v  reason: collision with other field name */
    public int f3909v;

    /* renamed from: v  reason: collision with other field name */
    public final idE f3910v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f3912v;
    public int x;

    /* renamed from: R  reason: collision with other field name */
    public final Stack f3895R = new Stack();
    public int X = 0;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f3901R = new int[16];

    /* renamed from: R  reason: collision with other field name */
    public final StringBuilder f3894R = new StringBuilder();

    /* renamed from: R  reason: collision with other field name */
    public final mjH f3896R = new mjH(1);

    /* renamed from: v  reason: collision with other field name */
    public final mjH f3911v = new mjH(1);

    /* renamed from: X  reason: collision with other field name */
    public boolean f3903X = true;
    public int g = 0;

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f3900R = new byte[4];
    public int y = -1;

    /* renamed from: R  reason: collision with other field name */
    public final oI0 f3898R = new oI0();

    public gje(Y y, int i, int i2, Integer num, nAq naq) {
        this.f3890R = y;
        idE ide = new idE(i, (num == null || num.intValue() < 100 || num.intValue() > 50000) ? 2000 : num.intValue(), i2);
        this.f3891R = ide;
        this.f3905c = ide;
        this.f3910v = new idE(i, i2, i2);
        this.f3897R = naq;
        this.c = i2;
        this.e = i;
        this.f3902R = new boolean[i];
        V();
    }

    public static int P(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 25) {
            return 16;
        }
        if (i == 66) {
            return 32;
        }
        if (i == 69) {
            return 2048;
        }
        if (i == 1000) {
            return 64;
        }
        if (i == 1002) {
            return 128;
        }
        if (i == 1004) {
            return 256;
        }
        if (i == 1006) {
            return 512;
        }
        if (i == 2004) {
            return 1024;
        }
        if (i == 5) {
            return 2;
        }
        if (i != 6) {
            return i != 7 ? -1 : 8;
        }
        return 4;
    }

    public final boolean C(int i) {
        return (this.Z & i) != 0;
    }

    public final int H(int i) {
        return x(0, i, true);
    }

    public final void I(int i, int i2) {
        boolean C = C(4);
        int i3 = 0;
        int i4 = C ? this.x : 0;
        int i5 = C ? this.H : this.c;
        if (C) {
            i3 = this.U;
        }
        u(Math.max(i4, Math.min(i2 + i4, i5 - 1)), Math.max(i3, Math.min(i + i3, (C ? this.C : this.e) - 1)));
    }

    public final void J() {
        mjH mjh = this.f3905c == this.f3891R ? this.f3896R : this.f3911v;
        mjh.v = this.f3889R;
        mjh.c = this.f3909v;
        mjh.e = this.j;
        mjh.X = this.N;
        mjh.O = this.P;
        mjh.L = this.Z;
        mjh.f6137R = this.f3906c;
        mjh.f6139v = this.f3907e;
        mjh.f6138c = this.f3903X;
    }

    public final void K() {
        mjH mjh = this.f3905c == this.f3891R ? this.f3896R : this.f3911v;
        u(mjh.v, mjh.c);
        this.j = mjh.e;
        this.N = mjh.X;
        this.P = mjh.O;
        this.Z = (this.Z & -13) | (mjh.L & 12);
        this.f3906c = mjh.f6137R;
        this.f3907e = mjh.f6139v;
        this.f3903X = mjh.f6138c;
    }

    public final void L(int i) {
        if (i == 7) {
            Z("\u0007");
        } else if (i != 27) {
            v(i);
        } else {
            c(11);
        }
    }

    public final boolean N() {
        return C(64) || C(128);
    }

    public final void O() {
        int i = this.f3889R;
        int i2 = this.H;
        int i3 = i + 1;
        if (!(i >= i2)) {
            if (i3 == i2) {
                Y();
                i3 = this.H - 1;
            }
            this.f3889R = i3;
            this.f3886L = false;
        } else if (i != this.c - 1) {
            this.f3889R = i3;
            this.f3886L = false;
        }
    }

    public final void R(int i, int i2, int i3, int i4) {
        this.f3905c.e(i, i2, i3, i4, 32, U());
    }

    public final long U() {
        return ffC.R(this.N, this.P, this.j);
    }

    public final void V() {
        z();
        this.O = 0;
        this.f3912v = false;
        this.L = 0;
        this.f3887O = false;
        this.U = 0;
        this.x = 0;
        this.H = this.c;
        this.C = this.e;
        this.f3886L = false;
        mjH mjh = this.f3896R;
        mjH mjh2 = this.f3911v;
        mjh2.X = 256;
        mjh.X = 256;
        this.N = 256;
        mjh2.O = 257;
        mjh.O = 257;
        this.P = 257;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < this.e) {
                boolean[] zArr = this.f3902R;
                if ((i & 7) != 0 || i == 0) {
                    z = false;
                }
                zArr[i] = z;
                i++;
            } else {
                this.f3907e = false;
                this.f3906c = false;
                this.f3903X = true;
                mjH mjh3 = this.f3896R;
                mjh3.L = 0;
                mjh3.e = 0;
                mjh3.c = 0;
                mjh3.v = 0;
                mjH mjh4 = this.f3911v;
                mjh4.L = 0;
                mjh4.e = 0;
                mjh4.c = 0;
                mjh4.v = 0;
                this.Z = 0;
                n(8, true);
                n(16, true);
                mjH mjh5 = this.f3896R;
                mjH mjh6 = this.f3911v;
                int i2 = this.Z;
                mjh6.L = i2;
                mjh5.L = i2;
                this.m = i2;
                this.f3888R = 0;
                this.v = 0;
                this.f3898R.v();
                this.f3890R.R();
                return;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:819)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:161)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:858)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:161)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void X(int r10, boolean r11) {
        /*
            r9 = this;
            int r0 = P(r10)
            r1 = -1
            if (r0 == r1) goto L_0x000a
            r9.n(r0, r11)
        L_0x000a:
            r0 = 0
            switch(r10) {
                case 1: goto L_0x00a4;
                case 12: goto L_0x009d;
                case 25: goto L_0x009d;
                case 40: goto L_0x00a4;
                case 45: goto L_0x00a4;
                case 47: goto L_0x0053;
                case 66: goto L_0x00a4;
                case 69: goto L_0x004a;
                case 1015: goto L_0x00a4;
                case 1034: goto L_0x00a4;
                case 2004: goto L_0x00a4;
                default: goto L_0x000e;
            }
        L_0x000e:
            switch(r10) {
                case 3: goto L_0x002e;
                case 4: goto L_0x00a4;
                case 5: goto L_0x00a4;
                case 6: goto L_0x0027;
                case 7: goto L_0x009d;
                case 8: goto L_0x009d;
                case 9: goto L_0x009d;
                default: goto L_0x0011;
            }
        L_0x0011:
            switch(r10) {
                case 1000: goto L_0x00a4;
                case 1001: goto L_0x00a4;
                case 1002: goto L_0x00a4;
                case 1003: goto L_0x00a4;
                case 1004: goto L_0x00a4;
                case 1005: goto L_0x00a4;
                case 1006: goto L_0x00a4;
                default: goto L_0x0014;
            }
        L_0x0014:
            switch(r10) {
                case 1047: goto L_0x0053;
                case 1048: goto L_0x001b;
                case 1049: goto L_0x0053;
                default: goto L_0x0017;
            }
        L_0x0017:
            r9.L = r0
            goto L_0x00a4
        L_0x001b:
            if (r11 == 0) goto L_0x0022
            r9.J()
            goto L_0x00a4
        L_0x0022:
            r9.K()
            goto L_0x00a4
        L_0x0027:
            if (r11 == 0) goto L_0x00a4
            r9.I(r0, r0)
            goto L_0x00a4
        L_0x002e:
            r9.x = r0
            r9.U = r0
            int r10 = r9.c
            r9.H = r10
            int r10 = r9.e
            r9.C = r10
            r10 = 2048(0x800, float:2.87E-42)
            r9.n(r10, r0)
            int r10 = r9.e
            int r11 = r9.c
            r9.R(r0, r0, r10, r11)
            r9.u(r0, r0)
            goto L_0x00a4
        L_0x004a:
            if (r11 != 0) goto L_0x00a4
            r9.U = r0
            int r10 = r9.e
            r9.C = r10
            goto L_0x00a4
        L_0x0053:
            if (r11 == 0) goto L_0x0058
            idE r10 = r9.f3910v
            goto L_0x005a
        L_0x0058:
            idE r10 = r9.f3891R
        L_0x005a:
            r1 = r10
            idE r10 = r9.f3905c
            if (r1 == r10) goto L_0x00a4
            int r10 = r1.c
            int r2 = r9.e
            if (r10 != r2) goto L_0x006b
            int r10 = r1.v
            int r2 = r9.c
            if (r10 == r2) goto L_0x006c
        L_0x006b:
            r0 = 1
        L_0x006c:
            if (r11 == 0) goto L_0x0071
            r9.J()
        L_0x0071:
            r9.f3905c = r1
            if (r11 != 0) goto L_0x0084
            mjH r10 = r9.f3896R
            int r11 = r10.c
            int r10 = r10.v
            r9.K()
            if (r0 == 0) goto L_0x0084
            r9.f3909v = r11
            r9.f3889R = r10
        L_0x0084:
            if (r0 == 0) goto L_0x0089
            r9.o()
        L_0x0089:
            idE r10 = r9.f3910v
            if (r1 != r10) goto L_0x00a4
            r2 = 0
            r3 = 0
            int r4 = r9.e
            int r5 = r9.c
            r6 = 32
            long r7 = r9.U()
            r1.e(r2, r3, r4, r5, r6, r7)
            goto L_0x00a4
        L_0x009d:
            nAq r9 = r9.f3897R
            if (r9 == 0) goto L_0x00a4
            r9.e(r11)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gje.X(int, boolean):void");
    }

    public final void Y() {
        this.g++;
        int i = this.U;
        if (i == 0 && this.C == this.e) {
            this.f3905c.Z(this.x, this.H, U());
            return;
        }
        idE ide = this.f3905c;
        int i2 = this.x;
        ide.v(i, i2 + 1, this.C - i, (this.H - i2) - 1, i, i2);
        idE ide2 = this.f3905c;
        int i3 = this.U;
        ide2.e(i3, this.H - 1, this.C - i3, 1, 32, (long) this.j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x021e, code lost:
        r19.L = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0221, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0224, code lost:
        if (r2 < 0) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0227, code lost:
        if (r2 >= 0) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0229, code lost:
        if (r7 < '0') goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x022b, code lost:
        if (r7 > '9') goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x022d, code lost:
        if (r3 >= 0) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x022f, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0231, code lost:
        r3 = r3 * 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0233, code lost:
        r3 = r3 + (r7 - '0');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0236, code lost:
        if (r6 == false) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0239, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x023c, code lost:
        r19.L = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x023f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0240, code lost:
        r1 = r19.f3893R;
        r19.f3893R = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0248, code lost:
        if (java.util.Objects.equals(r1, r5) != false) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x024a, code lost:
        r1 = r19.f3890R;
        r1.f2416R.c(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r6 == 0) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r6 == 1) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r6 == 2) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        r13 = 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (r6 == 4) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        if (r6 == 52) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (r6 == 104) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0055, code lost:
        if (r6 == 119) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        switch(r6) {
            case 10: goto L_0x0062;
            case 11: goto L_0x0062;
            case 12: goto L_0x0062;
            default: goto L_0x005a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005a, code lost:
        switch(r6) {
            case 110: goto L_0x013f;
            case 111: goto L_0x013f;
            case 112: goto L_0x013f;
            default: goto L_0x005d;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005d, code lost:
        r19.L = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        r4 = (r6 - 10) + 256;
        r7 = 0;
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013f, code lost:
        r6 = (r6 - 110) + 256;
        r19.f3898R.f6727R[r6] = defpackage.oI0.R.R[r6];
        r19.f3890R.R();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015a, code lost:
        if (r5.isEmpty() == false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015c, code lost:
        r19.f3898R.v();
        r19.f3890R.R();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0168, code lost:
        r1 = 0;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016e, code lost:
        if (r1 != r5.length()) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0170, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0172, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0173, code lost:
        if (r3 != false) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017b, code lost:
        if (r5.charAt(r1) != ';') goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017d, code lost:
        r4 = java.lang.Integer.parseInt(r5.substring(r2, r1));
        r19.f3898R.f6727R[r4] = defpackage.oI0.R.R[r4];
        r19.f3890R.R();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0196, code lost:
        if (r3 == false) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x019a, code lost:
        r1 = r1 + 1;
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a6, code lost:
        r19.f3890R.f2416R.m(new java.lang.String(android.util.Base64.decode(r5.substring(r5.indexOf(";") + 1), 0), java.nio.charset.StandardCharsets.UTF_8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01bf, code lost:
        defpackage.lTs.g(r19.f3897R, "TerminalEmulator", "OSC Manipulate selection, invalid string '" + r5 + "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01dc, code lost:
        r2 = -1;
        r3 = -1;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e3, code lost:
        if (r1 != r5.length()) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01e5, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e7, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e8, code lost:
        if (r6 == false) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ea, code lost:
        r7 = ';';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ed, code lost:
        r7 = r5.charAt(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f3, code lost:
        if (r7 != ';') goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f5, code lost:
        if (r2 >= 0) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f7, code lost:
        r2 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01fc, code lost:
        if (r3 < 0) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0200, code lost:
        if (r3 <= 255) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0203, code lost:
        r7 = r19.f3898R;
        r2 = r5.substring(r2, r1);
        r7.getClass();
        r2 = defpackage.oI0.R(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0210, code lost:
        if (r2 == 0) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0212, code lost:
        r7.f6727R[r3] = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0216, code lost:
        r19.f3890R.R();
        r2 = -1;
        r3 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Z(java.lang.String r20) {
        /*
        // Method dump skipped, instructions count: 618
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gje.Z(java.lang.String):void");
    }

    public final void c(int i) {
        this.L = i;
        this.f3912v = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0248  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(int r18) {
        /*
        // Method dump skipped, instructions count: 1732
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gje.e(int):void");
    }

    public final void g(int i) {
        boolean z;
        Integer num;
        int[] iArr = {i};
        if (this.L == 6 && (((z = this.f3899R) && i == 59) || (!z && (num = this.f3892R) != null && num.intValue() == 59 && i == 59))) {
            iArr = new int[]{48, 59};
        }
        this.f3899R = false;
        for (int i2 : iArr) {
            if (i2 >= 48 && i2 <= 57) {
                int i3 = this.O;
                int[] iArr2 = this.f3901R;
                if (i3 < iArr2.length) {
                    int i4 = iArr2[i3];
                    int i5 = i2 - 48;
                    if (i4 >= 0) {
                        i5 += i4 * 10;
                    }
                    if (i5 > 9999) {
                        i5 = 9999;
                    }
                    iArr2[i3] = i5;
                }
                c(this.L);
            } else if (i2 == 59) {
                int i6 = this.O;
                if (i6 < this.f3901R.length) {
                    this.O = i6 + 1;
                }
                c(this.L);
            } else {
                this.L = 0;
            }
            this.f3892R = Integer.valueOf(i2);
        }
    }

    public final void h(int i) {
        this.f3909v = i;
        this.f3886L = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r28v0, resolved type: gje */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v40, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v73 */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:819)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:161)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:737)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:156)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:858)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:161)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:858)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:161)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:732)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:156)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:737)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:156)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:732)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:156)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x05c5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x05fe  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x077c  */
    public final void i(int r29) {
        /*
        // Method dump skipped, instructions count: 2642
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gje.i(int):void");
    }

    public final int j(int i) {
        int i2 = this.f3909v;
        while (true) {
            i2++;
            if (i2 >= this.e) {
                return this.C - 1;
            }
            if (this.f3902R[i2] && i - 1 == 0) {
                return Math.min(i2, this.C);
            }
        }
    }

    public final void m(int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i;
        this.y = i5;
        if (!this.f3903X ? this.f3907e : this.f3906c) {
            if (i5 != 48) {
                switch (i5) {
                    case 95:
                        i5 = 32;
                        break;
                    case 96:
                        i5 = 9670;
                        break;
                    case 97:
                        i5 = 9618;
                        break;
                    case 98:
                        i5 = 9225;
                        break;
                    case 99:
                        i5 = 9228;
                        break;
                    case 100:
                        i5 = 13;
                        break;
                    case 101:
                        i5 = 9226;
                        break;
                    case 102:
                        i5 = 176;
                        break;
                    case 103:
                        i5 = 177;
                        break;
                    case 104:
                        i5 = 10;
                        break;
                    case 105:
                        i5 = 9227;
                        break;
                    case 106:
                        i5 = 9496;
                        break;
                    case 107:
                        i5 = 9488;
                        break;
                    case 108:
                        i5 = 9484;
                        break;
                    case 109:
                        i5 = 9492;
                        break;
                    case 110:
                        i5 = 9532;
                        break;
                    case 111:
                        i5 = 9146;
                        break;
                    case 112:
                        i5 = 9147;
                        break;
                    case 113:
                        i5 = 9472;
                        break;
                    case 114:
                        i5 = 9148;
                        break;
                    case 115:
                        i5 = 9149;
                        break;
                    case 116:
                        i5 = 9500;
                        break;
                    case 117:
                        i5 = 9508;
                        break;
                    case 118:
                        i5 = 9524;
                        break;
                    case 119:
                        i5 = 9516;
                        break;
                    case 120:
                        i5 = 9474;
                        break;
                    case 121:
                        i5 = 8804;
                        break;
                    case 122:
                        i5 = 8805;
                        break;
                    case 123:
                        i5 = 960;
                        break;
                    case 124:
                        i5 = 8800;
                        break;
                    case 125:
                        i5 = 163;
                        break;
                    case 126:
                        i5 = 183;
                        break;
                }
            } else {
                i5 = 9608;
            }
        }
        boolean C = C(8);
        int z = lTs.z(i5);
        boolean z2 = false;
        boolean z3 = this.f3909v == this.C - 1;
        if (C) {
            if (z3 && ((this.f3886L && z == 1) || z == 2)) {
                idE ide = this.f3905c;
                ide.f4673R[ide.O(this.f3889R)].f7331R = true;
                this.f3909v = this.U;
                int i6 = this.f3889R + 1;
                if (i6 < this.H) {
                    this.f3889R = i6;
                } else {
                    Y();
                }
            }
        } else if (z3 && z == 2) {
            return;
        }
        if (this.f3887O && z > 0 && (i3 = (i2 = this.f3909v) + z) < (i4 = this.C)) {
            idE ide2 = this.f3905c;
            int i7 = this.f3889R;
            ide2.v(i2, i7, i4 - i3, 1, i3, i7);
        }
        int i8 = this.f3909v - ((z > 0 || this.f3909v <= 0 || this.f3886L) ? 0 : 1);
        if (i8 < 0) {
            i8 = 0;
        }
        this.f3905c.m(i8, this.f3889R, i5, U());
        if (C && z > 0) {
            if (this.f3909v == this.C - z) {
                z2 = true;
            }
            this.f3886L = z2;
        }
        this.f3909v = Math.min(this.f3909v + z, this.C - 1);
    }

    public final void n(int i, boolean z) {
        if (z) {
            if (i == 64) {
                n(128, false);
            } else if (i == 128) {
                n(64, false);
            }
        }
        if (z) {
            this.Z = i | this.Z;
            return;
        }
        this.Z = (~i) & this.Z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x024d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
        // Method dump skipped, instructions count: 703
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gje.o():void");
    }

    public final void t(byte b) {
        byte b2;
        byte b3 = this.f3888R;
        int i = 65533;
        if (b3 > 0) {
            if ((b & 192) == 128) {
                byte[] bArr = this.f3900R;
                byte b4 = this.v;
                byte b5 = (byte) (b4 + 1);
                this.v = b5;
                bArr[b4] = b;
                byte b6 = (byte) (b3 - 1);
                this.f3888R = b6;
                if (b6 == 0) {
                    int i2 = ((byte) (b5 == 2 ? 31 : b5 == 3 ? 15 : 7)) & bArr[0];
                    int i3 = 1;
                    while (true) {
                        b2 = this.v;
                        if (i3 >= b2) {
                            break;
                        }
                        i2 = (i2 << 6) | (this.f3900R[i3] & 63);
                        i3++;
                    }
                    if ((i2 <= 127 && b2 > 1) || ((i2 < 2047 && b2 > 2) || (i2 < 65535 && b2 > 3))) {
                        i2 = 65533;
                    }
                    this.f3888R = 0;
                    this.v = 0;
                    if (i2 < 128 || i2 > 159) {
                        int type = Character.getType(i2);
                        if (!(type == 0 || type == 19)) {
                            i = i2;
                        }
                        i(i);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f3888R = 0;
            this.v = 0;
            m(65533);
            t(b);
        } else if ((b & 128) == 0) {
            i(b);
        } else {
            if ((b & 224) == 192) {
                this.f3888R = 1;
            } else if ((b & 240) == 224) {
                this.f3888R = 2;
            } else if ((b & 248) == 240) {
                this.f3888R = 3;
            } else {
                i(65533);
                return;
            }
            byte[] bArr2 = this.f3900R;
            byte b7 = this.v;
            this.v = (byte) (b7 + 1);
            bArr2[b7] = b;
        }
    }

    public final String toString() {
        StringBuilder U = opT.U("TerminalEmulator[size=");
        U.append(this.f3905c.c);
        U.append("x");
        U.append(this.f3905c.v);
        U.append(", margins={");
        U.append(this.x);
        U.append(",");
        U.append(this.C);
        U.append(",");
        U.append(this.H);
        U.append(",");
        return jQ.j(U, this.U, "}]");
    }

    public final void u(int i, int i2) {
        this.f3889R = Math.max(0, Math.min(i, this.c - 1));
        this.f3909v = Math.max(0, Math.min(i2, this.e - 1));
        this.f3886L = false;
    }

    public final void v(int i) {
        if (this.f3894R.length() < 8192) {
            this.f3894R.appendCodePoint(i);
            c(this.L);
            return;
        }
        this.L = 0;
    }

    public final int x(int i, int i2, boolean z) {
        int i3 = this.f3901R[i];
        return i3 >= 0 ? (i3 != 0 || !z) ? i3 : i2 : i2;
    }

    public final void y(String str) {
        String replaceAll = str.replaceAll("(\u001b|[-])", "").replaceAll("\r?\n", "\r");
        boolean C = C(1024);
        if (C) {
            this.f3890R.c("\u001b[200~");
        }
        this.f3890R.c(replaceAll);
        if (C) {
            this.f3890R.c("\u001b[201~");
        }
    }

    public final void z() {
        nAq naq = this.f3897R;
        Integer R2 = naq != null ? naq.R() : null;
        if (R2 == null || !Arrays.asList(R).contains(R2)) {
            this.X = 0;
        } else {
            this.X = R2.intValue();
        }
    }
}
