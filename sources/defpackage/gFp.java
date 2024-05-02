package defpackage;

/* renamed from: gFp  reason: default package */
/* loaded from: classes.dex */
public final class gFp extends aFk implements iv7 {
    public final /* synthetic */ m5f R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gFp(m5f m5f, aOO aoo) {
        super(2, aoo);
        this.R = m5f;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((gFp) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        ipB ipb;
        Object obj2;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        boolean z = true;
        try {
            if (i == 0) {
                jjU.o(obj);
                ((Boolean) this.R.e.getValue()).booleanValue();
                m5f m5f = this.R;
                this.X = 1;
                obj2 = m5f.v(m5f, this);
                if (obj2 == bgr) {
                    return bgr;
                }
            } else if (i == 1) {
                jjU.o(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException(afN.R(-1778143318924L));
            }
            ipb = (ipB) obj2;
        } catch (Exception e) {
            ipb = e instanceof Fa ? new ipB(p0k.R, (String) null, (String) null, (Long) null, (Integer) null, (Integer) null, 126) : new ipB(iBb.R, (String) null, (String) null, (Long) null, (Integer) null, (Integer) null, 126);
        }
        this.R.f5907R.R();
        String str = (String) this.R.f5923v.getValue();
        String str2 = ipb.f4736v;
        if (str2 != null) {
            this.R.f5923v.H(str2);
        }
        iwX iwx = ipb.R;
        if (!(n3x.v(iwx, bBw.R) ? true : n3x.v(iwx, p0k.R) ? true : n3x.v(iwx, hoq.R) ? true : n3x.v(iwx, fed.R))) {
            if (!(n3x.v(iwx, iBb.R) ? true : n3x.v(iwx, mFE.R))) {
                z = n3x.v(iwx, eDg.R);
            }
            biy biy = null;
            if (z) {
                if (str != null) {
                    biy = this.R.f5908R.c(str, false);
                }
                if (str != null && (biy instanceof nOH)) {
                    nOH noh = (nOH) biy;
                    ipb = new ipB(mRo.R, ipb.R, noh.f6384R, str, new Long(noh.R), new Integer(noh.e), noh.f6383R);
                }
            } else if (!n3x.v(iwx, mRo.R)) {
                throw new j8f((Object) null);
            }
        }
        String str3 = ipb.R.R;
        if (str3 != null) {
            this.R.f5923v.H(str3);
        }
        return ipb;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new gFp(this.R, aoo);
    }
}
