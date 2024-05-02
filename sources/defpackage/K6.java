package defpackage;

/* renamed from: K6  reason: default package */
/* loaded from: classes.dex */
public final class K6 {
    public static final dHi C;
    public static final dHi H;
    public static final dHi L;
    public static final dHi N;
    public static final dHi O;
    public static final dHi P;
    public static final dHi R;

    /* renamed from: R  reason: collision with other field name */
    public static final dSD f227R;

    /* renamed from: R  reason: collision with other field name */
    public static final jfT f228R;

    /* renamed from: R  reason: collision with other field name */
    public static final npe f229R;

    /* renamed from: R  reason: collision with other field name */
    public static final float[] f230R;

    /* renamed from: R  reason: collision with other field name */
    public static final u_[] f231R;
    public static final dHi U;
    public static final dHi X;
    public static final dHi Z;
    public static final dHi c;
    public static final dHi e;
    public static final dHi m;
    public static final dHi v;

    /* renamed from: v  reason: collision with other field name */
    public static final float[] f232v;
    public static final dHi x;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f230R = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f232v = fArr2;
        nTx ntx = new nTx(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        nTx ntx2 = new nTx(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        bSx bsx = iWF.e;
        dHi dhi = new dHi("sRGB IEC61966-2.1", fArr, bsx, ntx, 0);
        R = dhi;
        dHi dhi2 = new dHi("sRGB IEC61966-2.1 (Linear)", fArr, bsx, 1.0d, 0.0f, 1.0f, 1);
        v = dhi2;
        dHi dhi3 = new dHi("scRGB-nl IEC 61966-2-2:2003", fArr, bsx, null, nqF.y, nqF.t, -0.799f, 2.399f, ntx, 2);
        c = dhi3;
        dHi dhi4 = new dHi("scRGB IEC 61966-2-2:2003", fArr, bsx, 1.0d, -0.5f, 7.499f, 3);
        e = dhi4;
        dHi dhi5 = new dHi("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, bsx, new nTx(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        X = dhi5;
        dHi dhi6 = new dHi("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, bsx, new nTx(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        O = dhi6;
        dHi dhi7 = new dHi("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new bSx(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        L = dhi7;
        dHi dhi8 = new dHi("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, bsx, ntx, 7);
        Z = dhi8;
        dHi dhi9 = new dHi("NTSC (1953)", fArr2, iWF.f4625R, new nTx(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = dhi9;
        dHi dhi10 = new dHi("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, bsx, new nTx(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        x = dhi10;
        dHi dhi11 = new dHi("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, bsx, 2.2d, 0.0f, 1.0f, 10);
        H = dhi11;
        dHi dhi12 = new dHi("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, iWF.v, new nTx(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        U = dhi12;
        bSx bsx2 = iWF.c;
        dHi dhi13 = new dHi("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, bsx2, 1.0d, -65504.0f, 65504.0f, 12);
        C = dhi13;
        dHi dhi14 = new dHi("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, bsx2, 1.0d, -65504.0f, 65504.0f, 13);
        N = dhi14;
        jfT jft = new jfT();
        f228R = jft;
        npe npe = new npe();
        f229R = npe;
        dHi dhi15 = new dHi("None", fArr, bsx, ntx2, 16);
        P = dhi15;
        dSD dsd = new dSD();
        f227R = dsd;
        f231R = new u_[]{dhi, dhi2, dhi3, dhi4, dhi5, dhi6, dhi7, dhi8, dhi9, dhi10, dhi11, dhi12, dhi13, dhi14, jft, npe, dhi15, dsd};
    }
}
