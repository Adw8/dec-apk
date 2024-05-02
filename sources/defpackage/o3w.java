package defpackage;

/* renamed from: o3w  reason: default package */
/* loaded from: classes.dex */
public final class o3w implements bvr {
    public final aVf R;

    /* renamed from: R  reason: collision with other field name */
    public final k3o f6663R;

    /* renamed from: R  reason: collision with other field name */
    public final qN f6664R;

    public o3w(k3o k3o, aVf avf, qN qNVar) {
        this.f6663R = k3o;
        avf.getClass();
        this.R = avf;
        this.f6664R = qNVar;
    }

    @Override // defpackage.bvr
    public final Object L() {
        return ((c_m) ((csA) this.f6664R).L(hZW.NEW_BUILDER)).e();
    }

    @Override // defpackage.bvr
    public final boolean O(Object obj, Object obj2) {
        this.f6663R.getClass();
        f2c f2c = ((csA) obj).unknownFields;
        this.f6663R.getClass();
        return f2c.equals(((csA) obj2).unknownFields);
    }

    @Override // defpackage.bvr
    public final void R(Object obj, gL6 gl6) {
        this.R.getClass();
        jQ.Y(obj);
        throw null;
    }

    @Override // defpackage.bvr
    public final void X(Object obj, byte[] bArr, int i, int i2, cDk cdk) {
        csA csa = (csA) obj;
        if (csa.unknownFields == f2c.R) {
            csa.unknownFields = f2c.v();
        }
        jQ.Y(obj);
        throw null;
    }

    @Override // defpackage.bvr
    public final boolean Z(Object obj) {
        this.R.getClass();
        jQ.Y(obj);
        throw null;
    }

    @Override // defpackage.bvr
    public final void c(Object obj, clz clz, nCG ncg) {
        k3o k3o = this.f6663R;
        aVf avf = this.R;
        k3o.getClass();
        csA csa = (csA) obj;
        if (csa.unknownFields == f2c.R) {
            csa.unknownFields = f2c.v();
        }
        avf.getClass();
        jQ.Y(obj);
        throw null;
    }

    @Override // defpackage.bvr
    public final int e(Object obj) {
        this.f6663R.getClass();
        return ((csA) obj).unknownFields.hashCode();
    }

    @Override // defpackage.bvr
    public final void m(Object obj) {
        this.f6663R.getClass();
        ((csA) obj).unknownFields.f3282R = false;
        this.R.getClass();
        jQ.Y(obj);
        throw null;
    }

    @Override // defpackage.bvr
    public final void v(Object obj, Object obj2) {
        dA8.u(this.f6663R, obj, obj2);
    }

    @Override // defpackage.bvr
    public final int x(Object obj) {
        this.f6663R.getClass();
        f2c f2c = ((csA) obj).unknownFields;
        int i = f2c.v;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < f2c.f3281R; i2++) {
                i += d3.c(3, (b0) f2c.f3284R[i2]) + d3.i(2, f2c.f3283R[i2] >>> 3) + (d3.t(1) * 2);
            }
            f2c.v = i;
        }
        return i + 0;
    }
}
