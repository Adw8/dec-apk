package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import java.util.List;

/* renamed from: pU  reason: default package */
/* loaded from: classes.dex */
public final class pU implements acA {
    public final EdgeEffect L;
    public final EdgeEffect O;
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public aWo f7088R;

    /* renamed from: R  reason: collision with other field name */
    public final EdgeEffect f7089R;

    /* renamed from: R  reason: collision with other field name */
    public final List f7090R;

    /* renamed from: R  reason: collision with other field name */
    public k8q f7091R;

    /* renamed from: R  reason: collision with other field name */
    public final ncu f7092R;

    /* renamed from: R  reason: collision with other field name */
    public final oC2 f7093R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f7094R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7095R;
    public final EdgeEffect X;
    public final EdgeEffect Z;
    public final EdgeEffect c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f7096c;
    public final EdgeEffect e;
    public final EdgeEffect v;

    /* renamed from: v  reason: collision with other field name */
    public final oST f7097v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f7098v;

    public pU(Context context, oC2 oc2) {
        this.f7093R = oc2;
        VS vs = VS.R;
        EdgeEffect R = vs.R(context, null);
        this.f7089R = R;
        EdgeEffect R2 = vs.R(context, null);
        this.v = R2;
        EdgeEffect R3 = vs.R(context, null);
        this.c = R3;
        EdgeEffect R4 = vs.R(context, null);
        this.e = R4;
        List Y = pdD.Y(R3, R, R4, R2);
        this.f7090R = Y;
        this.X = vs.R(context, null);
        this.O = vs.R(context, null);
        this.L = vs.R(context, null);
        this.Z = vs.R(context, null);
        int size = Y.size();
        for (int i = 0; i < size; i++) {
            ((EdgeEffect) Y.get(i)).setColor(aH9.vz(this.f7093R.R));
        }
        o8s o8s = o8s.R;
        this.f7094R = new oST(o8s, d6b.R);
        this.f7095R = true;
        this.R = nqW.v;
        this.f7097v = l6.n(Boolean.FALSE);
        this.f7092R = lCG.R(Fr.f148R, o8s, new gG(this, null)).I(new enH(new gs(this))).I(new nyw(this));
    }

    public final float C(long j, long j2) {
        float e = aWo.e(j2) / nqW.e(this.R);
        float X = aWo.X(j) / nqW.v(this.R);
        float f = ((float) 1) - e;
        VS vs = VS.R;
        return nqW.v(this.R) * (-vs.c(this.v, -X, f));
    }

    public final boolean H(fiv fiv, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        int t = mLz.t(nqW.e(this.R));
        float c = this.f7093R.f6700R.c(fiv.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, fiv.mZ(c) + (-((float) t)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // defpackage.acA
    public final ncu L() {
        return this.f7092R;
    }

    public final float N(long j, long j2) {
        float X = aWo.X(j2) / nqW.v(this.R);
        float e = aWo.e(j) / nqW.e(this.R);
        return nqW.e(this.R) * VS.R.c(this.c, e, ((float) 1) - X);
    }

    @Override // defpackage.acA
    public final void O(int i, long j, long j2) {
        boolean z;
        boolean z2;
        if (!nqW.X(this.R)) {
            boolean z3 = false;
            if (i == 1) {
                aWo awo = this.f7088R;
                long N = awo != null ? awo.f906R : n1P.N(this.R);
                if (aWo.e(j2) > 0.0f) {
                    N(j2, N);
                } else if (aWo.e(j2) < 0.0f) {
                    P(j2, N);
                }
                if (aWo.X(j2) > 0.0f) {
                    j(j2, N);
                } else if (aWo.X(j2) < 0.0f) {
                    C(j2, N);
                }
                z = !aWo.v(j2, aWo.v);
            } else {
                z = false;
            }
            if (this.c.isFinished() || aWo.e(j) >= 0.0f) {
                z2 = false;
            } else {
                EdgeEffect edgeEffect = this.c;
                aWo.e(j);
                edgeEffect.onRelease();
                z2 = this.c.isFinished();
            }
            if (!this.e.isFinished() && aWo.e(j) > 0.0f) {
                EdgeEffect edgeEffect2 = this.e;
                aWo.e(j);
                edgeEffect2.onRelease();
                z2 = z2 || this.e.isFinished();
            }
            if (!this.f7089R.isFinished() && aWo.X(j) < 0.0f) {
                EdgeEffect edgeEffect3 = this.f7089R;
                aWo.X(j);
                edgeEffect3.onRelease();
                z2 = z2 || this.f7089R.isFinished();
            }
            if (!this.v.isFinished() && aWo.X(j) > 0.0f) {
                EdgeEffect edgeEffect4 = this.v;
                aWo.X(j);
                edgeEffect4.onRelease();
                z2 = z2 || this.v.isFinished();
            }
            if (z2 || z) {
                z3 = true;
            }
            if (z3) {
                U();
            }
        }
    }

    public final float P(long j, long j2) {
        float X = aWo.X(j2) / nqW.v(this.R);
        float e = aWo.e(j) / nqW.e(this.R);
        VS vs = VS.R;
        return nqW.e(this.R) * (-vs.c(this.e, -e, X));
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0143  */
    @Override // defpackage.acA
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long R(long r10) {
        /*
        // Method dump skipped, instructions count: 327
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pU.R(long):long");
    }

    public final void U() {
        if (this.f7095R) {
            this.f7094R.R(o8s.R);
        }
    }

    @Override // defpackage.acA
    public final void X(boolean z) {
        boolean z2 = this.f7096c != z;
        this.f7097v.R(Boolean.valueOf(z));
        this.f7096c = z;
        if (z2) {
            this.f7098v = false;
            Z();
        }
    }

    public final void Z() {
        List list = this.f7090R;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = (EdgeEffect) list.get(i);
            edgeEffect.onRelease();
            z = edgeEffect.isFinished() || z;
        }
        if (z) {
            U();
        }
    }

    @Override // defpackage.acA
    public final boolean c() {
        List list = this.f7090R;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!(VS.R.v((EdgeEffect) list.get(i)) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.acA
    public final o8s e(long j) {
        if (nqW.X(this.R)) {
            return o8s.R;
        }
        boolean z = false;
        this.f7098v = false;
        if (d_E.v(j) > 0.0f) {
            this.c.onAbsorb(mLz.t(d_E.v(j)));
        } else if (d_E.v(j) < 0.0f) {
            this.e.onAbsorb(-mLz.t(d_E.v(j)));
        }
        if (d_E.c(j) > 0.0f) {
            this.f7089R.onAbsorb(mLz.t(d_E.c(j)));
        } else if (d_E.c(j) < 0.0f) {
            this.v.onAbsorb(-mLz.t(d_E.c(j)));
        }
        if (j == d_E.v) {
            z = true;
        }
        if (!z) {
            U();
        }
        Z();
        return o8s.R;
    }

    @Override // defpackage.acA
    public final boolean isEnabled() {
        return ((Boolean) this.f7097v.getValue()).booleanValue();
    }

    public final float j(long j, long j2) {
        float e = aWo.e(j2) / nqW.e(this.R);
        float X = aWo.X(j) / nqW.v(this.R);
        return nqW.v(this.R) * VS.R.c(this.f7089R, X, e);
    }

    public final boolean m(fiv fiv, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-nqW.e(this.R), (-nqW.v(this.R)) + fiv.mZ(this.f7093R.f6700R.R()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ce  */
    @Override // defpackage.acA
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.d_E v(long r7) {
        /*
            r6 = this;
            long r0 = r6.R
            boolean r0 = defpackage.nqW.X(r0)
            if (r0 == 0) goto L_0x0010
            long r6 = defpackage.d_E.v
            d_E r8 = new d_E
            r8.<init>(r6)
            return r8
        L_0x0010:
            float r0 = defpackage.d_E.v(r7)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r0 <= 0) goto L_0x003e
            android.widget.EdgeEffect r0 = r6.c
            VS r4 = defpackage.VS.R
            float r0 = r4.v(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0029
            r0 = r3
            goto L_0x002a
        L_0x0029:
            r0 = r2
        L_0x002a:
            if (r0 != 0) goto L_0x003e
            android.widget.EdgeEffect r0 = r6.c
            float r4 = defpackage.d_E.v(r7)
            int r4 = defpackage.mLz.t(r4)
            r0.onAbsorb(r4)
            float r0 = defpackage.d_E.v(r7)
            goto L_0x006b
        L_0x003e:
            float r0 = defpackage.d_E.v(r7)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x006a
            android.widget.EdgeEffect r0 = r6.e
            VS r4 = defpackage.VS.R
            float r0 = r4.v(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0054
            r0 = r3
            goto L_0x0055
        L_0x0054:
            r0 = r2
        L_0x0055:
            if (r0 != 0) goto L_0x006a
            android.widget.EdgeEffect r0 = r6.e
            float r4 = defpackage.d_E.v(r7)
            int r4 = defpackage.mLz.t(r4)
            int r4 = -r4
            r0.onAbsorb(r4)
            float r0 = defpackage.d_E.v(r7)
            goto L_0x006b
        L_0x006a:
            r0 = r1
        L_0x006b:
            float r4 = defpackage.d_E.c(r7)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0096
            android.widget.EdgeEffect r4 = r6.f7089R
            VS r5 = defpackage.VS.R
            float r4 = r5.v(r4)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L_0x0081
            r4 = r3
            goto L_0x0082
        L_0x0081:
            r4 = r2
        L_0x0082:
            if (r4 != 0) goto L_0x0096
            android.widget.EdgeEffect r1 = r6.f7089R
            float r4 = defpackage.d_E.c(r7)
            int r4 = defpackage.mLz.t(r4)
            r1.onAbsorb(r4)
            float r1 = defpackage.d_E.c(r7)
            goto L_0x00c1
        L_0x0096:
            float r4 = defpackage.d_E.c(r7)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c1
            android.widget.EdgeEffect r4 = r6.v
            VS r5 = defpackage.VS.R
            float r4 = r5.v(r4)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L_0x00ac
            r4 = r3
            goto L_0x00ad
        L_0x00ac:
            r4 = r2
        L_0x00ad:
            if (r4 != 0) goto L_0x00c1
            android.widget.EdgeEffect r1 = r6.v
            float r4 = defpackage.d_E.c(r7)
            int r4 = defpackage.mLz.t(r4)
            int r4 = -r4
            r1.onAbsorb(r4)
            float r1 = defpackage.d_E.c(r7)
        L_0x00c1:
            long r7 = defpackage.dtx.X(r0, r1)
            long r0 = defpackage.d_E.v
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00cc
            r2 = r3
        L_0x00cc:
            if (r2 != 0) goto L_0x00d1
            r6.U()
        L_0x00d1:
            d_E r6 = new d_E
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pU.v(long):d_E");
    }

    public final boolean x(fiv fiv, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-nqW.v(this.R), fiv.mZ(this.f7093R.f6700R.e(fiv.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }
}
