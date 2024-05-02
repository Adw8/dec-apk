package defpackage;

/* renamed from: lad  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class lad {
    public static final /* synthetic */ int[] R;
    public static final /* synthetic */ int[] v;

    static {
        int[] iArr = new int[alX.values().length];
        v = iArr;
        try {
            iArr[alX.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            v[alX.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            v[alX.ON_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            v[alX.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            v[alX.ON_RESUME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            v[alX.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            v[alX.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr2 = new int[iMP.values().length];
        R = iArr2;
        try {
            iArr2[2] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            R[3] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            R[4] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            R[0] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            R[1] = 5;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
