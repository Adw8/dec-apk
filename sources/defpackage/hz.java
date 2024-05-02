package defpackage;

/* renamed from: hz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hz extends nZL implements iv7 {
    public static final hz R = new hz();

    public hz() {
        super(2, mkm.class, "min", "min(II)I", 1);
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
