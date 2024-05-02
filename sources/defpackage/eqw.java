package defpackage;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: eqw  reason: default package */
/* loaded from: classes.dex */
public abstract class eqw extends Enum {
    public static final eDl R;

    /* renamed from: R  reason: collision with other field name */
    public static final oDI f3215R;

    /* renamed from: R  reason: collision with other field name */
    public static final /* synthetic */ eqw[] f3216R;

    static {
        oDI odi = new oDI();
        f3215R = odi;
        eDl edl = new eDl();
        R = edl;
        f3216R = new eqw[]{odi, edl};
    }

    public eqw(String str, int i) {
    }

    public static eqw valueOf(String str) {
        return (eqw) Enum.valueOf(eqw.class, str);
    }

    public static eqw[] values() {
        return (eqw[]) f3216R.clone();
    }

    public abstract boolean R();
}
