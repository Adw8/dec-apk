package defpackage;

/* renamed from: bQZ  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class bQZ {
    public static final /* synthetic */ int[] R;

    static {
        int[] iArr = new int[alX.values().length];
        R = iArr;
        try {
            iArr[alX.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            R[alX.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            R[alX.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            R[alX.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            R[alX.ON_STOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            R[alX.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            R[alX.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
