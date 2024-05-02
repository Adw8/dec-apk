package defpackage;

/* renamed from: _6  reason: default package */
/* loaded from: classes.dex */
public final class _6 {
    public final Pc R;

    /* renamed from: R  reason: collision with other field name */
    public final SE f680R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f681R;

    /* renamed from: R  reason: collision with other field name */
    public final oHg f683R;
    public Pc c;

    /* renamed from: c  reason: collision with other field name */
    public Object f685c;
    public Pc e;
    public final Pc v;

    /* renamed from: v  reason: collision with other field name */
    public Object f686v;

    /* renamed from: v  reason: collision with other field name */
    public final oST f687v;

    /* renamed from: R  reason: collision with other field name */
    public final oST f684R = l6.n(Boolean.FALSE);

    /* renamed from: R  reason: collision with other field name */
    public final oDD f682R = new oDD();

    public _6(Object obj, oHg ohg, Object obj2) {
        this.f683R = ohg;
        this.f681R = obj2;
        this.f680R = new SE(ohg, obj, null, 60);
        this.f687v = l6.n(obj);
        new ipq(obj2);
        Pc pc = (Pc) ohg.R.x(obj);
        int v = pc.v();
        int i = 0;
        int i2 = 0;
        while (i2 < v) {
            i2++;
            pc.X(i2, Float.NEGATIVE_INFINITY);
        }
        this.R = pc;
        Pc pc2 = (Pc) this.f683R.R.x(obj);
        int v2 = pc2.v();
        while (i < v2) {
            i++;
            pc2.X(i, Float.POSITIVE_INFINITY);
        }
        this.v = pc2;
        this.c = pc;
        this.e = pc2;
    }

    public static Object R(_6 _6, Object obj, jM jMVar, aOO aoo) {
        Object x = _6.f683R.v.x(_6.f680R.f506R);
        Object c = _6.c();
        oHg ohg = _6.f683R;
        hgI hgi = new hgI(jMVar, ohg, c, obj, (Pc) ohg.R.x(x));
        long j = _6.f680R.R;
        oDD odd = _6.f682R;
        eO eOVar = new eO(_6, x, hgi, j, null, null);
        odd.getClass();
        return jjU.L(new bjp(1, odd, eOVar, null), aoo);
    }

    public final Object c() {
        return this.f680R.getValue();
    }

    public final Object e(Object obj, aOO aoo) {
        oDD odd = this.f682R;
        mU mUVar = new mU(this, obj, null);
        odd.getClass();
        Object L = jjU.L(new bjp(1, odd, mUVar, null), aoo);
        return L == bGR.COROUTINE_SUSPENDED ? L : o8s.R;
    }

    public final Object v(Object obj) {
        if (n3x.v(this.c, this.R) && n3x.v(this.e, this.v)) {
            return obj;
        }
        Pc pc = (Pc) this.f683R.R.x(obj);
        int v = pc.v();
        int i = 0;
        boolean z = false;
        while (i < v) {
            i++;
            if (pc.R(i) < this.c.R(i) || pc.R(i) > this.e.R(i)) {
                pc.X(i, caw.m(pc.R(i), this.c.R(i), this.e.R(i)));
                z = true;
            }
        }
        return z ? this.f683R.v.x(pc) : obj;
    }
}
