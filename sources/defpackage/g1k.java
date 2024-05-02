package defpackage;

import java.util.Iterator;

/* renamed from: g1k  reason: default package */
/* loaded from: classes.dex */
public final class g1k extends QR implements gDl {
    public static final g1k R;

    /* renamed from: R  reason: collision with other field name */
    public final e76 f3649R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f3650R;
    public final Object v;

    static {
        hw1 hw1 = hw1.X;
        R = new g1k(hw1, hw1, e76.R);
    }

    public g1k(Object obj, Object obj2, e76 e76) {
        this.f3650R = obj;
        this.v = obj2;
        this.f3649R = e76;
    }

    @Override // defpackage.U1
    public final int R() {
        e76 e76 = this.f3649R;
        e76.getClass();
        return e76.e;
    }

    @Override // defpackage.U1, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3649R.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new nY8(this.f3650R, this.f3649R);
    }
}
