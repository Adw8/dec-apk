package defpackage;

import dev.kdrag0n.virtcontainer.R;
import dev.kdrag0n.virtcontainer.ui.settings.root.RootSettingsViewModel;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.math.BigInteger;
import java.net.Socket;
import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: mLz  reason: default package */
/* loaded from: classes.dex */
public abstract class mLz {

    /* renamed from: R  reason: collision with other field name */
    public static final float[][] f6005R = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: v  reason: collision with other field name */
    public static final float[][] f6007v = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: R  reason: collision with other field name */
    public static final float[] f6003R = {95.047f, 100.0f, 108.883f};

    /* renamed from: c  reason: collision with other field name */
    public static final float[][] f6006c = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: R  reason: collision with other field name */
    public static final int[] f6004R = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    public static final int[] v = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    public static final int[] c = {67108863, 33554431};
    public static final int[] e = {26, 25};
    public static final n2G R = new n2G(15, null);

    public static void C(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j = jArr2[0];
        long j2 = jArr2[1];
        long j3 = jArr3[0];
        jArr[1] = (j2 * j3) + (jArr3[1] * j);
        long j4 = jArr2[1];
        long j5 = jArr3[1];
        jArr[2] = (jArr2[2] * j3) + (jArr3[2] * j) + (j4 * 2 * j5);
        long j6 = jArr3[2];
        long j7 = jArr2[2];
        jArr[3] = (jArr2[3] * j3) + (jArr3[3] * j) + (j7 * j5) + (j4 * j6);
        long j8 = jArr3[3];
        long j9 = jArr2[3];
        long j10 = jArr2[4] * j3;
        jArr[4] = j10 + (jArr3[4] * j) + (((j9 * j5) + (j4 * j8)) * 2) + (j7 * j6);
        long j11 = jArr3[4];
        long j12 = (j4 * j11) + (j9 * j6) + (j7 * j8);
        long j13 = jArr2[4];
        jArr[5] = (jArr2[5] * j3) + (jArr3[5] * j) + (j13 * j5) + j12;
        long j14 = jArr3[5];
        long j15 = (j4 * j14) + (j9 * j8);
        long j16 = jArr2[5];
        jArr[6] = (jArr2[6] * j3) + (jArr3[6] * j) + (j13 * j6) + (j7 * j11) + (((j16 * j5) + j15) * 2);
        long j17 = (j16 * j6) + (j7 * j14) + (j13 * j8) + (j9 * j11);
        long j18 = jArr3[6];
        long j19 = (j4 * j18) + j17;
        long j20 = jArr2[6];
        jArr[7] = (jArr2[7] * j3) + (jArr3[7] * j) + (j20 * j5) + j19;
        long j21 = jArr3[7];
        long j22 = (j4 * j21) + (j16 * j8) + (j9 * j14);
        long j23 = jArr2[7];
        long j24 = j20 * j6;
        jArr[8] = (jArr2[8] * j3) + (jArr3[8] * j) + j24 + (j7 * j18) + (((j23 * j5) + j22) * 2) + (j13 * j11);
        long j25 = (j23 * j6) + (j7 * j21) + (j20 * j8) + (j9 * j18) + (j16 * j11) + (j13 * j14);
        long j26 = jArr3[8];
        long j27 = (j4 * j26) + j25;
        long j28 = jArr2[8];
        long j29 = (j28 * j5) + j27;
        jArr[9] = (jArr2[9] * j3) + (j * jArr3[9]) + j29;
        long j30 = (j23 * j8) + (j9 * j21) + (j16 * j14);
        long j31 = jArr3[9];
        long j32 = jArr2[9];
        long j33 = j13 * j18;
        long j34 = j20 * j11;
        jArr[10] = (j28 * j6) + (j7 * j26) + j34 + j33 + (((j5 * j32) + (j4 * j31) + j30) * 2);
        long j35 = j7 * j31;
        long j36 = j6 * j32;
        jArr[11] = j36 + j35 + (j28 * j8) + (j9 * j26) + (j23 * j11) + (j13 * j21) + (j20 * j14) + (j16 * j18);
        long j37 = j9 * j31;
        long j38 = j8 * j32;
        long j39 = j28 * j11;
        jArr[12] = j39 + (j13 * j26) + ((j38 + j37 + (j23 * j14) + (j16 * j21)) * 2) + (j20 * j18);
        long j40 = j13 * j31;
        long j41 = j11 * j32;
        jArr[13] = j41 + j40 + (j28 * j14) + (j16 * j26) + (j23 * j18) + (j20 * j21);
        long j42 = j14 * j32;
        long j43 = j20 * j26;
        long j44 = j28 * j18;
        jArr[14] = j44 + j43 + ((j42 + (j16 * j31) + (j23 * j21)) * 2);
        long j45 = j20 * j31;
        long j46 = j18 * j32;
        jArr[15] = j46 + j45 + (j28 * j21) + (j23 * j26);
        jArr[16] = (((j21 * j32) + (j23 * j31)) * 2) + (j28 * j26);
        jArr[17] = (j26 * j32) + (j28 * j31);
        jArr[18] = j32 * 2 * j31;
    }

    public static float H(int i) {
        float f = ((float) i) / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d)) * 100.0f;
    }

    public static float I() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static void J(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static void K(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    public static int L(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    public static final String N(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        return stringWriter.toString();
    }

    public static final void O(Reader reader, kg9 kg9) {
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        Throwable th = null;
        try {
            pn pnVar = new pn(bufferedReader);
            for (Object obj : pnVar instanceof nux ? pnVar : new nux(pnVar)) {
                kg9.x(obj);
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static final Object P(Object obj) {
        return obj instanceof pag ? new bvw(((pag) obj).f7100R) : obj;
    }

    public static final void R(RootSettingsViewModel rootSettingsViewModel, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(1883346086);
        if (((Boolean) rootSettingsViewModel.f2786R.getValue()).booleanValue()) {
            hDC.R(iTI.g(R.drawable.ic_fluent_bug_24_regular, jr_), dtx.h(R.string.debug_report_dialog_progress, jr_), jr_, 8);
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new m2w(i, 12, rootSettingsViewModel);
        }
    }

    public static void U(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        C(jArr4, jArr2, jArr3);
        g(jArr4);
        j(jArr4);
        System.arraycopy(jArr4, 0, jArr, 0, 10);
    }

    public static final J8 V(Socket socket) {
        Logger logger = iaf.R;
        pqF pqf = new pqF(socket);
        return new J8(pqf, new J8(socket.getInputStream(), pqf));
    }

    public static byte[] X(long[] jArr) {
        int i;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                break;
            }
            int i3 = 0;
            while (i3 < 9) {
                long j = copyOf[i3];
                int i4 = e[i3 & 1];
                int i5 = -((int) (((j >> 31) & j) >> i4));
                copyOf[i3] = j + ((long) (i5 << i4));
                i3++;
                copyOf[i3] = copyOf[i3] - ((long) i5);
            }
            long j2 = copyOf[9];
            int i6 = -((int) (((j2 >> 31) & j2) >> 25));
            copyOf[9] = j2 + ((long) (i6 << 25));
            copyOf[0] = copyOf[0] - ((long) (i6 * 19));
            i2++;
        }
        long j3 = copyOf[0];
        int i7 = -((int) (((j3 >> 31) & j3) >> 26));
        copyOf[0] = j3 + ((long) (i7 << 26));
        copyOf[1] = copyOf[1] - ((long) i7);
        for (int i8 = 0; i8 < 2; i8++) {
            int i9 = 0;
            while (i9 < 9) {
                long j4 = copyOf[i9];
                int i10 = i9 & 1;
                int i11 = (int) (j4 >> e[i10]);
                copyOf[i9] = j4 & ((long) c[i10]);
                i9++;
                copyOf[i9] = copyOf[i9] + ((long) i11);
            }
        }
        long j5 = copyOf[9];
        copyOf[9] = j5 & 33554431;
        long j6 = copyOf[0] + ((long) (((int) (j5 >> 25)) * 19));
        copyOf[0] = j6;
        int i12 = ~((((int) j6) - 67108845) >> 31);
        for (int i13 = 1; i13 < 10; i13++) {
            int i14 = ~(((int) copyOf[i13]) ^ c[i13 & 1]);
            int i15 = i14 & (i14 << 16);
            int i16 = i15 & (i15 << 8);
            int i17 = i16 & (i16 << 4);
            int i18 = i17 & (i17 << 2);
            i12 &= (i18 & (i18 << 1)) >> 31;
        }
        copyOf[0] = copyOf[0] - ((long) (67108845 & i12));
        long j7 = (long) (33554431 & i12);
        copyOf[1] = copyOf[1] - j7;
        for (i = 2; i < 10; i += 2) {
            copyOf[i] = copyOf[i] - ((long) (67108863 & i12));
            int i19 = i + 1;
            copyOf[i19] = copyOf[i19] - j7;
        }
        for (int i20 = 0; i20 < 10; i20++) {
            copyOf[i20] = copyOf[i20] << v[i20];
        }
        byte[] bArr = new byte[32];
        for (int i21 = 0; i21 < 10; i21++) {
            int i22 = f6004R[i21];
            long j8 = copyOf[i21];
            bArr[i22] = (byte) ((int) (((long) bArr[i22]) | (j8 & 255)));
            int i23 = i22 + 1;
            bArr[i23] = (byte) ((int) (((long) bArr[i23]) | ((j8 >> 8) & 255)));
            int i24 = i22 + 2;
            bArr[i24] = (byte) ((int) (((long) bArr[i24]) | ((j8 >> 16) & 255)));
            int i25 = i22 + 3;
            bArr[i25] = (byte) ((int) (((long) bArr[i25]) | ((j8 >> 24) & 255)));
        }
        return bArr;
    }

    public static cdU Y(boolean z, f_c f_c, int i) {
        int i2 = 0;
        boolean z2 = (i & 1) != 0;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            i2 = -1;
        }
        cdU cdu = new cdU(f_c);
        if (z) {
            cdu.setDaemon(true);
        }
        if (i2 > 0) {
            cdu.setPriority(i2);
        }
        if (z2) {
            cdu.start();
        }
        return cdu;
    }

    public static int Z(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = (f > 8.0f ? 1 : (f == 8.0f ? 0 : -1)) > 0 ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f6003R;
        return B7.R((double) (f5 * fArr[0]), (double) (f3 * fArr[1]), (double) (f4 * fArr[2]));
    }

    public static final Object c(htf[] htfArr, plU plu) {
        if (htfArr.length == 0) {
            return fcD.R;
        }
        MN mn = new MN(htfArr);
        xx xxVar = new xx(1, n3x.U(plu));
        xxVar.j();
        int length = htfArr.length;
        qT[] qTVarArr = new qT[length];
        for (int i = 0; i < length; i++) {
            nfJ nfj = (nfJ) mn.f291R[i];
            nfj.B();
            qT qTVar = new qT(mn, xxVar);
            qTVar.f7355R = nfj.l(qTVar);
            qTVarArr[i] = qTVar;
        }
        Ap ap = new Ap(qTVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            qTVarArr[i2].I(ap);
        }
        if (xxVar.t()) {
            ap.v();
        } else {
            xxVar.y(ap);
        }
        return xxVar.P();
    }

    public static byte[] e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static void g(long[] jArr) {
        long j = jArr[8];
        long j2 = jArr[18];
        long j3 = j + (j2 << 4);
        jArr[8] = j3;
        long j4 = j3 + (j2 << 1);
        jArr[8] = j4;
        jArr[8] = j4 + j2;
        long j5 = jArr[7];
        long j6 = jArr[17];
        long j7 = j5 + (j6 << 4);
        jArr[7] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[7] = j8;
        jArr[7] = j8 + j6;
        long j9 = jArr[6];
        long j10 = jArr[16];
        long j11 = j9 + (j10 << 4);
        jArr[6] = j11;
        long j12 = j11 + (j10 << 1);
        jArr[6] = j12;
        jArr[6] = j12 + j10;
        long j13 = jArr[5];
        long j14 = jArr[15];
        long j15 = j13 + (j14 << 4);
        jArr[5] = j15;
        long j16 = j15 + (j14 << 1);
        jArr[5] = j16;
        jArr[5] = j16 + j14;
        long j17 = jArr[4];
        long j18 = jArr[14];
        long j19 = j17 + (j18 << 4);
        jArr[4] = j19;
        long j20 = j19 + (j18 << 1);
        jArr[4] = j20;
        jArr[4] = j20 + j18;
        long j21 = jArr[3];
        long j22 = jArr[13];
        long j23 = j21 + (j22 << 4);
        jArr[3] = j23;
        long j24 = j23 + (j22 << 1);
        jArr[3] = j24;
        jArr[3] = j24 + j22;
        long j25 = jArr[2];
        long j26 = jArr[12];
        long j27 = j25 + (j26 << 4);
        jArr[2] = j27;
        long j28 = j27 + (j26 << 1);
        jArr[2] = j28;
        jArr[2] = j28 + j26;
        long j29 = jArr[1];
        long j30 = jArr[11];
        long j31 = j29 + (j30 << 4);
        jArr[1] = j31;
        long j32 = j31 + (j30 << 1);
        jArr[1] = j32;
        jArr[1] = j32 + j30;
        long j33 = jArr[0];
        long j34 = jArr[10];
        long j35 = j33 + (j34 << 4);
        jArr[0] = j35;
        long j36 = j35 + (j34 << 1);
        jArr[0] = j36;
        jArr[0] = j36 + j34;
    }

    public static final int[] h(BigInteger bigInteger) {
        int[] iArr = new int[64];
        BigInteger bigInteger2 = BigInteger.ZERO;
        BigInteger bit = bigInteger2.setBit(32);
        BigInteger add = bigInteger.add(bigInteger2);
        for (int i = 0; i < 64; i++) {
            BigInteger[] divideAndRemainder = add.divideAndRemainder(bit);
            add = divideAndRemainder[0];
            iArr[i] = divideAndRemainder[1].intValue();
        }
        return iArr;
    }

    public static final pZ i(Socket socket) {
        Logger logger = iaf.R;
        pqF pqf = new pqF(socket);
        return new pZ(pqf, new pZ(socket.getOutputStream(), pqf));
    }

    public static void j(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = jArr[i];
            long j2 = j / 67108864;
            jArr[i] = j - (j2 << 26);
            int i2 = i + 1;
            long j3 = jArr[i2] + j2;
            jArr[i2] = j3;
            long j4 = j3 / 33554432;
            jArr[i2] = j3 - (j4 << 25);
            i += 2;
            jArr[i] = jArr[i] + j4;
        }
        long j5 = jArr[0];
        long j6 = jArr[10];
        long j7 = j5 + (j6 << 4);
        jArr[0] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[0] = j8;
        long j9 = j8 + j6;
        jArr[0] = j9;
        jArr[10] = 0;
        long j10 = j9 / 67108864;
        jArr[0] = j9 - (j10 << 26);
        jArr[1] = jArr[1] + j10;
    }

    public static final boolean m(AssertionError assertionError) {
        Logger logger = iaf.R;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? iH_.I(message, "getsockname failed") : false;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = jArr2[0];
        long j3 = j2 * 2;
        long j4 = jArr2[1];
        long j5 = jArr2[2] * j2;
        long j6 = jArr2[2];
        long j7 = jArr2[3] * j2;
        long j8 = jArr2[3];
        long j9 = j3 * jArr2[4];
        long j10 = jArr2[4];
        long j11 = jArr2[5] * j2;
        long j12 = (jArr2[6] * j2) + (j6 * j10) + (j8 * j8);
        long j13 = jArr2[5];
        long j14 = jArr2[6];
        long j15 = jArr2[7];
        long j16 = jArr2[8];
        long j17 = jArr2[9];
        long[] jArr3 = {j * j, jArr2[1] * j3, (j5 + (j4 * j4)) * 2, (j7 + (j4 * j6)) * 2, j9 + (j4 * 4 * j8) + (j6 * j6), (j11 + (j4 * j10) + (j6 * j8)) * 2, ((j4 * 2 * j13) + j12) * 2, ((jArr2[7] * j2) + (j4 * j14) + (j6 * j13) + (j8 * j10)) * 2, (((((j8 * j13) + (j4 * j15)) * 2) + (jArr2[8] * j2) + (j6 * j14)) * 2) + (j10 * j10), ((j2 * jArr2[9]) + (j4 * j16) + (j6 * j15) + (j8 * j14) + (j10 * j13)) * 2, ((((j4 * j17) + (j8 * j15)) * 2) + (j6 * j16) + (j10 * j14) + (j13 * j13)) * 2, ((j6 * j17) + (j8 * j16) + (j10 * j15) + (j13 * j14)) * 2, (((((j8 * j17) + (j13 * j15)) * 2) + (j10 * j16)) * 2) + (j14 * j14), ((j10 * j17) + (j13 * j16) + (j14 * j15)) * 2, ((j13 * 2 * j17) + (j14 * j16) + (j15 * j15)) * 2, ((j14 * j17) + (j15 * j16)) * 2, (j15 * 4 * j17) + (j16 * j16), j16 * 2 * j17, 2 * j17 * j17};
        g(jArr3);
        j(jArr3);
        System.arraycopy(jArr3, 0, jArr, 0, 10);
    }

    public static final int t(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static final void v(RootSettingsViewModel rootSettingsViewModel, mpr mpr, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-155427785);
        hDC.v("Settings", mpr, null, null, null, aH9.I(jr_, 817657955, new hpH(rootSettingsViewModel, mpr, 3)), jr_, 196678, 28);
        R(rootSettingsViewModel, jr_, 8);
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new _a(rootSettingsViewModel, mpr, i, 21);
        }
    }

    public static boolean x(Double d, boolean z) {
        return d == null ? z : !d.isNaN() && d.doubleValue() >= 0.0d && d.doubleValue() <= 1.0d;
    }

    public static final int y(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        } else if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        } else {
            if (d < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d);
        }
    }
}
