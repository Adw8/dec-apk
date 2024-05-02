package defpackage;

/* renamed from: ooO  reason: default package */
/* loaded from: classes.dex */
public final class ooO extends aFk implements kg9 {
    public final /* synthetic */ blo R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ m5f f6959R;

    /* renamed from: R  reason: collision with other field name */
    public nWW f6960R;
    public int X;
    public final /* synthetic */ nWW v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ooO(nWW nww, m5f m5f, blo blo, aOO aoo) {
        super(1, aoo);
        this.v = nww;
        this.f6959R = m5f;
        this.R = blo;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        nWW nww;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        boolean z = true;
        try {
            if (i == 0) {
                jjU.o(obj);
                nWW nww2 = this.v;
                m5f m5f = this.f6959R;
                this.f6960R = nww2;
                this.X = 1;
                Object R = m5f.R(m5f, this);
                if (R == bgr) {
                    return bgr;
                }
                nww = nww2;
                obj = R;
            } else if (i == 1) {
                nww = this.f6960R;
                jjU.o(obj);
            } else {
                throw new IllegalStateException(afN.R(-249134961548L));
            }
            nww.R = (ipB) obj;
            ipB ipb = (ipB) this.v.R;
            iwX iwx = ipb.v;
            if (iwx == null) {
                iwx = ipb.R;
            }
            if (!(n3x.v(iwx, mFE.R) ? true : n3x.v(iwx, eDg.R))) {
                z = n3x.v(iwx, iBb.R);
            }
            if (!z) {
                return (ipB) this.v.R;
            }
            throw new iYd();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        return new ooO(this.v, this.f6959R, this.R, (aOO) obj).O(o8s.R);
    }
}
