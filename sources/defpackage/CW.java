package defpackage;

/* renamed from: CW  reason: default package */
/* loaded from: classes.dex */
public final class CW extends vd {
    public static volatile CW R;

    /* renamed from: R  reason: collision with other field name */
    public static final r0 f60R = new r0(1);

    /* renamed from: R  reason: collision with other field name */
    public ble f61R = new ble();

    public static CW S() {
        if (R != null) {
            return R;
        }
        synchronized (CW.class) {
            if (R == null) {
                R = new CW();
            }
        }
        return R;
    }
}
