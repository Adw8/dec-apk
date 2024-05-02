package defpackage;

/* renamed from: mLY  reason: default package */
/* loaded from: classes.dex */
public final class mLY extends k8G implements kg9 {
    public static final mLY R = new mLY();

    public mLY() {
        super(1);
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        float intValue = ((float) ((Number) obj).intValue()) / ((float) 1000);
        double d = 1.0d;
        for (int i = 0; i < 1; i++) {
            d *= (double) 10;
        }
        return ((float) (Math.rint(((double) intValue) * d) / d)) + " GB";
    }
}
