package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: e4H  reason: default package */
/* loaded from: classes.dex */
public final class e4H {
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public long f2949R;

    /* renamed from: R  reason: collision with other field name */
    public final Outline f2950R;

    /* renamed from: R  reason: collision with other field name */
    public bwp f2951R;

    /* renamed from: R  reason: collision with other field name */
    public cnO f2952R;

    /* renamed from: R  reason: collision with other field name */
    public dm f2953R;

    /* renamed from: R  reason: collision with other field name */
    public jJj f2954R;

    /* renamed from: R  reason: collision with other field name */
    public vC f2957R;
    public long c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f2959c;
    public boolean e;

    /* renamed from: v  reason: collision with other field name */
    public dm f2960v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f2961v;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2958R = true;

    /* renamed from: R  reason: collision with other field name */
    public n76 f2956R = cUF.f2104R;
    public long v = aWo.v;

    /* renamed from: R  reason: collision with other field name */
    public mdz f2955R = mdz.Ltr;

    public e4H(jJj jjj) {
        this.f2954R = jjj;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f2950R = outline;
        long j = nqW.v;
        this.f2949R = j;
        this.c = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007f, code lost:
        if (r8 == false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(defpackage.Gp r13) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e4H.R(Gp):void");
    }

    public final void X() {
        if (this.f2961v) {
            this.v = aWo.v;
            long j = this.f2949R;
            this.c = j;
            this.R = 0.0f;
            this.f2952R = null;
            this.f2961v = false;
            this.f2959c = false;
            if (!this.e || nqW.e(j) <= 0.0f || nqW.v(this.f2949R) <= 0.0f) {
                this.f2950R.setEmpty();
                return;
            }
            this.f2958R = true;
            vC R = this.f2956R.R(this.f2949R, this.f2955R, this.f2954R);
            this.f2957R = R;
            if (R instanceof kW2) {
                gIA gia = ((kW2) R).R;
                this.v = aH9.N(gia.f3720R, gia.v);
                this.c = n1P.e(gia.c - gia.f3720R, gia.e - gia.v);
                this.f2950R.setRect(mLz.t(gia.f3720R), mLz.t(gia.v), mLz.t(gia.c), mLz.t(gia.e));
            } else if (R instanceof j43) {
                bwp bwp = ((j43) R).R;
                float v = buB.v(bwp.f1859R);
                this.v = aH9.N(bwp.R, bwp.v);
                this.c = n1P.e(bwp.c - bwp.R, bwp.e - bwp.v);
                if (dTl.S(bwp)) {
                    this.f2950R.setRoundRect(mLz.t(bwp.R), mLz.t(bwp.v), mLz.t(bwp.c), mLz.t(bwp.e), v);
                    this.R = v;
                    return;
                }
                dm dmVar = this.f2953R;
                if (dmVar == null) {
                    dmVar = g4x.L();
                    this.f2953R = dmVar;
                }
                dmVar.e();
                dmVar.v(bwp);
                this.f2950R.setConvexPath(dmVar.f2856R);
                this.f2959c = true ^ this.f2950R.canClip();
                this.f2952R = dmVar;
            }
        }
    }

    public final boolean c(long j) {
        vC vCVar;
        if (!this.e || (vCVar = this.f2957R) == null) {
            return true;
        }
        float e = aWo.e(j);
        float X = aWo.X(j);
        boolean z = false;
        if (vCVar instanceof kW2) {
            gIA gia = ((kW2) vCVar).R;
            if (gia.f3720R <= e && e < gia.c && gia.v <= X && X < gia.e) {
                return true;
            }
        } else if (vCVar instanceof j43) {
            bwp bwp = ((j43) vCVar).R;
            if (e >= bwp.R && e < bwp.c && X >= bwp.v && X < bwp.e) {
                if (buB.v(bwp.f1862v) + buB.v(bwp.f1859R) <= bwp.c - bwp.R) {
                    if (buB.v(bwp.f1860c) + buB.v(bwp.f1861e) <= bwp.c - bwp.R) {
                        if (buB.c(bwp.f1861e) + buB.c(bwp.f1859R) <= bwp.e - bwp.v) {
                            if (buB.c(bwp.f1860c) + buB.c(bwp.f1862v) <= bwp.e - bwp.v) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    dm L = g4x.L();
                    L.v(bwp);
                    float f = e - 0.005f;
                    float f2 = X - 0.005f;
                    float f3 = e + 0.005f;
                    float f4 = X + 0.005f;
                    dm L2 = g4x.L();
                    if (!(!Float.isNaN(f))) {
                        throw new IllegalStateException("Rect.left is NaN".toString());
                    } else if (!(!Float.isNaN(f2))) {
                        throw new IllegalStateException("Rect.top is NaN".toString());
                    } else if (!(!Float.isNaN(f3))) {
                        throw new IllegalStateException("Rect.right is NaN".toString());
                    } else if (!Float.isNaN(f4)) {
                        L2.f2857R.set(new RectF(f, f2, f3, f4));
                        L2.f2856R.addRect(L2.f2857R, Path.Direction.CCW);
                        dm L3 = g4x.L();
                        L3.c(L, L2, 1);
                        boolean isEmpty = L3.f2856R.isEmpty();
                        L3.e();
                        L2.e();
                        return true ^ isEmpty;
                    } else {
                        throw new IllegalStateException("Rect.bottom is NaN".toString());
                    }
                } else {
                    float v = buB.v(bwp.f1859R) + bwp.R;
                    float c = buB.c(bwp.f1859R) + bwp.v;
                    float v2 = bwp.c - buB.v(bwp.f1862v);
                    float c2 = bwp.v + buB.c(bwp.f1862v);
                    float v3 = bwp.c - buB.v(bwp.f1860c);
                    float c3 = bwp.e - buB.c(bwp.f1860c);
                    float c4 = bwp.e - buB.c(bwp.f1861e);
                    float v4 = bwp.R + buB.v(bwp.f1861e);
                    if (e < v && X < c) {
                        return dtx.o(e, X, v, c, bwp.f1859R);
                    }
                    if (e < v4 && X > c4) {
                        return dtx.o(e, X, v4, c4, bwp.f1861e);
                    }
                    if (e > v2 && X < c2) {
                        return dtx.o(e, X, v2, c2, bwp.f1862v);
                    }
                    if (e <= v3 || X <= c3) {
                        return true;
                    }
                    return dtx.o(e, X, v3, c3, bwp.f1860c);
                }
            }
        } else {
            throw new j8f((Object) null);
        }
        return false;
    }

    public final boolean e(n76 n76, float f, boolean z, float f2, mdz mdz, jJj jjj) {
        this.f2950R.setAlpha(f);
        boolean z2 = !n3x.v(this.f2956R, n76);
        if (z2) {
            this.f2956R = n76;
            this.f2961v = true;
        }
        boolean z3 = z || f2 > 0.0f;
        if (this.e != z3) {
            this.e = z3;
            this.f2961v = true;
        }
        if (this.f2955R != mdz) {
            this.f2955R = mdz;
            this.f2961v = true;
        }
        if (!n3x.v(this.f2954R, jjj)) {
            this.f2954R = jjj;
            this.f2961v = true;
        }
        return z2;
    }

    public final Outline v() {
        X();
        if (!this.e || !this.f2958R) {
            return null;
        }
        return this.f2950R;
    }
}
