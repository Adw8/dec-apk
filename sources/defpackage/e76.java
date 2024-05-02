package defpackage;

/* renamed from: e76  reason: default package */
/* loaded from: classes.dex */
public final class e76 extends Oa implements g2d {
    public static final e76 R = new e76(pgk.R, 0);

    /* renamed from: R  reason: collision with other field name */
    public final pgk f2983R;
    public final int e;

    public e76(pgk pgk, int i) {
        this.f2983R = pgk;
        this.e = i;
    }

    public final e76 R(Object obj, ftv ftv) {
        c85 V = this.f2983R.V(obj, obj != null ? obj.hashCode() : 0, ftv, 0);
        return V == null ? this : new e76((pgk) V.R, this.e + V.e);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f2983R.e(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f2983R.L(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
