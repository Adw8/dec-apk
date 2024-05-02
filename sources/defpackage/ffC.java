package defpackage;

/* renamed from: ffC  reason: default package */
/* loaded from: classes.dex */
public abstract class ffC {
    public static final /* synthetic */ int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public static final long f3495R = R(256, 257, 0);

    public static long R(int i, int i2, int i3) {
        return ((i2 & -16777216) == -16777216 ? ((((long) i2) & 16777215) << 16) | 1024 : (((long) i2) & 511) << 16) | ((long) (i3 & 511)) | ((i & -16777216) == -16777216 ? 512 | ((((long) i) & 16777215) << 40) : (((long) i) & 511) << 40);
    }
}
