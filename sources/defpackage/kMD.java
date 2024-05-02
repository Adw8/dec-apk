package defpackage;

/* renamed from: kMD  reason: default package */
/* loaded from: classes.dex */
public final class kMD extends plU implements h2V {
    public final h2V R;
    public aOO c;

    /* renamed from: c  reason: collision with other field name */
    public nbD f5276c;
    public final int e;
    public final nbD v;

    public kMD(h2V h2v, nbD nbd) {
        super(aW7.R, aIH.R);
        this.R = h2v;
        this.v = nbd;
        this.e = ((Number) nbd.o(0, go2.t)).intValue();
    }

    @Override // defpackage.plU, defpackage.C2
    public final void L() {
        super.L();
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Throwable R = mwl.R(obj);
        if (R != null) {
            this.f5276c = new cCC(v(), R);
        }
        aOO aoo = this.c;
        if (aoo != null) {
            aoo.Y(obj);
        }
        return bGR.COROUTINE_SUSPENDED;
    }

    @Override // defpackage.h2V
    public final Object R(Object obj, aOO aoo) {
        try {
            Object Z = Z(aoo, obj);
            return Z == bGR.COROUTINE_SUSPENDED ? Z : o8s.R;
        } catch (Throwable th) {
            this.f5276c = new cCC(aoo.v(), th);
            throw th;
        }
    }

    public final Object Z(aOO aoo, Object obj) {
        nbD v = aoo.v();
        dTl.K(v);
        nbD nbd = this.f5276c;
        if (nbd != v) {
            if (nbd instanceof cCC) {
                StringBuilder U = opT.U("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                U.append(((cCC) nbd).R);
                U.append(", but then emission attempt of value '");
                U.append(obj);
                U.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                throw new IllegalStateException(n3x.o(U.toString()).toString());
            } else if (((Number) v.o(0, new bkx(23, this))).intValue() == this.e) {
                this.f5276c = v;
            } else {
                StringBuilder U2 = opT.U("Flow invariant is violated:\n\t\tFlow was collected in ");
                U2.append(this.v);
                U2.append(",\n\t\tbut emission happened in ");
                U2.append(v);
                U2.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                throw new IllegalStateException(U2.toString().toString());
            }
        }
        this.c = aoo;
        Object y = jB1.R.y(this.R, obj, this);
        if (!n3x.v(y, bGR.COROUTINE_SUSPENDED)) {
            this.c = null;
        }
        return y;
    }

    @Override // defpackage.C2, defpackage.k5j
    public final k5j i() {
        aOO aoo = this.c;
        if (aoo instanceof k5j) {
            return (k5j) aoo;
        }
        return null;
    }

    @Override // defpackage.plU, defpackage.aOO
    public final nbD v() {
        nbD nbd = this.f5276c;
        return nbd == null ? aIH.R : nbd;
    }
}
