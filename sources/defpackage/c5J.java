package defpackage;

/* renamed from: c5J  reason: default package */
/* loaded from: classes.dex */
public final class c5J extends k8G implements lR3 {
    public static final c5J R = new c5J();

    public c5J() {
        super(3);
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        cyg cyg = (cyg) obj;
        ((Number) obj3).intValue();
        jr_ jr_ = (jr_) ((m88) obj2);
        jr_.w(1721367864);
        fB8 fb8 = fB8.Focused;
        fB8 fb82 = fB8.UnfocusedEmpty;
        Object t = cyg.R(fb8, fb82) ? o02.t(67, 0, hiK.R, 2) : (cyg.R(fb82, fb8) || cyg.R(fB8.UnfocusedNotEmpty, fb82)) ? new o3h(83, 67, hiK.R) : o02.y(0.0f, null, 7);
        jr_.g(false);
        return t;
    }
}
