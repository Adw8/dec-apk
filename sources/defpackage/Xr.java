package defpackage;

/* renamed from: Xr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Xr extends nZL implements iv7 {
    public static final Xr R = new Xr();

    public Xr() {
        super(2, mkm.class, "max", "max(II)I", 1);
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
