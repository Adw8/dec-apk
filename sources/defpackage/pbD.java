package defpackage;

/* renamed from: pbD  reason: default package */
/* loaded from: classes.dex */
public final class pbD implements lXY {
    public static final Object v = new Object();
    public volatile Object R = v;

    /* renamed from: R  reason: collision with other field name */
    public volatile lXY f7102R;

    public pbD(lXY lxy) {
        this.f7102R = lxy;
    }

    public static lXY R(lXY lxy) {
        return ((lxy instanceof pbD) || (lxy instanceof nak)) ? lxy : new pbD(lxy);
    }

    @Override // defpackage.lXY
    public final Object get() {
        Object obj = this.R;
        if (obj != v) {
            return obj;
        }
        lXY lxy = this.f7102R;
        if (lxy == null) {
            return this.R;
        }
        Object obj2 = lxy.get();
        this.R = obj2;
        this.f7102R = null;
        return obj2;
    }
}
