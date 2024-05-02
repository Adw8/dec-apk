package defpackage;

/* renamed from: tY  reason: default package */
/* loaded from: classes.dex */
public final class tY extends aFk implements iv7 {
    public final /* synthetic */ long R;
    public final /* synthetic */ long v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public tY(long j, long j2, aOO aoo) {
        super(2, aoo);
        this.R = j;
        this.v = j2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((tY) X(obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        nbD nbd = ((plU) this).R;
        dSP dsp = hlA.R;
        dSP dsp2 = (dSP) nbd.O(dSP.R);
        if (dsp2 == null) {
            dsp2 = hlA.R;
        }
        h22 h22 = dsp2.f2611R;
        int i = hDC.J(((plU) this).R).e;
        long j = this.R;
        long j2 = this.v;
        long j3 = Long.MAX_VALUE;
        long j4 = i < 63 ? 1 << i : Long.MAX_VALUE;
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        boolean z = true;
        if (i2 >= 0 && j4 >= 0) {
            if (i2 == 0 || j4 <= Long.MAX_VALUE / j2) {
                j3 = j2 * j4;
            }
            long min = Math.min(j, j3) / ((long) 2);
            long Y = dtx.Y(min, h22.e(dtx.Y(min, 1)));
            if (Y <= 0) {
                z = false;
            }
            if (z) {
                return new lmN(Y);
            }
            throw new IllegalArgumentException(opT.x("delayMillis must be positive: ", Y).toString());
        }
        throw new IllegalArgumentException(("saturatedMultiply is optimized for non-negative longs: " + j2 + " x " + j4).toString());
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new tY(this.R, this.v, aoo);
    }
}
