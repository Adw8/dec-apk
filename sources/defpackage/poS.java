package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.Reference;
import java.util.LinkedHashMap;

/* renamed from: poS  reason: default package */
/* loaded from: classes.dex */
public abstract class poS extends emQ implements pc0, hjM, oFl, kg9 {

    /* renamed from: R  reason: collision with other field name */
    public aG9 f7270R;

    /* renamed from: R  reason: collision with other field name */
    public aao f7271R;

    /* renamed from: R  reason: collision with other field name */
    public final fue f7272R;

    /* renamed from: R  reason: collision with other field name */
    public jJj f7273R;

    /* renamed from: R  reason: collision with other field name */
    public LinkedHashMap f7274R;

    /* renamed from: R  reason: collision with other field name */
    public kg9 f7275R;

    /* renamed from: R  reason: collision with other field name */
    public lYW f7276R;

    /* renamed from: R  reason: collision with other field name */
    public mET f7277R;

    /* renamed from: R  reason: collision with other field name */
    public mdz f7278R;

    /* renamed from: R  reason: collision with other field name */
    public otO f7279R;

    /* renamed from: R  reason: collision with other field name */
    public poS f7280R;

    /* renamed from: c  reason: collision with other field name */
    public boolean f7282c;
    public boolean e;

    /* renamed from: v  reason: collision with other field name */
    public float f7283v;

    /* renamed from: v  reason: collision with other field name */
    public poS f7284v;
    public static final h7_ R = new h7_();
    public static final aao v = new aao();

    /* renamed from: R  reason: collision with other field name */
    public static final ift f7267R = new ift(0);

    /* renamed from: v  reason: collision with other field name */
    public static final ift f7268v = new ift(1);

    /* renamed from: R  reason: collision with other field name */
    public float f7269R = 0.8f;
    public long c = dU5.v;

    /* renamed from: R  reason: collision with other field name */
    public final q4 f7281R = new q4(14, this);

    static {
        l1r.R();
    }

    public poS(fue fue) {
        this.f7272R = fue;
        this.f7273R = fue.f3599R;
        this.f7278R = fue.f3603R;
    }

    public final void A5(bTI bti, long j, pfJ pfj, boolean z, boolean z2) {
        j28 j28;
        int X = ((ift) bti).X();
        boolean l = msU.l(X);
        j28 ax = ax();
        if (l || (ax = ax.v) != null) {
            j28 ky = ky(l);
            while (ky != null && (ky.X & X) != 0) {
                if ((ky.e & X) == 0) {
                    if (ky == ax) {
                        break;
                    }
                    ky = ky.c;
                } else {
                    j28 = ky;
                    break;
                }
            }
        }
        j28 = null;
        boolean z3 = false;
        z3 = true;
        if (!kW(j)) {
            if (z) {
                float _5 = _5(j, lU());
                if (!Float.isInfinite(_5) && !Float.isNaN(_5)) {
                    if (pfj.e != pdD.i(pfj)) {
                        if (msU.z(pfj.R(), msU.L(_5, false)) > 0) {
                            z3 = true;
                        }
                    }
                    if (z3) {
                        s3(j28, bti, j, pfj, z, false, _5);
                    }
                }
            }
        } else if (j28 == null) {
            EZ(bti, j, pfj, z, z2);
        } else {
            float e = aWo.e(j);
            float X2 = aWo.X(j);
            if (e >= 0.0f && X2 >= 0.0f && e < ((float) mh()) && X2 < ((float) JD())) {
                _i(j28, bti, j, pfj, z, z2);
                return;
            }
            float _52 = !z ? Float.POSITIVE_INFINITY : _5(j, lU());
            if (!Float.isInfinite(_52) && !Float.isNaN(_52)) {
                if (pfj.e != pdD.i(pfj)) {
                    if (msU.z(pfj.R(), msU.L(_52, z2)) > 0) {
                        z3 = true;
                    }
                }
                if (z3) {
                    s3(j28, bti, j, pfj, z, z2, _52);
                    return;
                }
            }
            ID(j28, bti, j, pfj, z, z2, _52);
        }
    }

    public final void CD(aG9 ag9, boolean z, boolean z2) {
        lYW lyw = this.f7276R;
        if (lyw != null) {
            if (this.f7282c) {
                if (z2) {
                    long lU = lU();
                    float e = nqW.e(lU) / 2.0f;
                    float v2 = nqW.v(lU) / 2.0f;
                    long j = ((l0f) this).R;
                    ag9.R(-e, -v2, ((float) ((int) (j >> 32))) + e, ((float) ltH.v(j)) + v2);
                } else if (z) {
                    long j2 = ((l0f) this).R;
                    ag9.R(0.0f, 0.0f, (float) ((int) (j2 >> 32)), (float) ltH.v(j2));
                }
                if (ag9.v()) {
                    return;
                }
            }
            lyw.R(ag9, false);
        }
        long j3 = this.c;
        int i = dU5.R;
        float f = (float) ((int) (j3 >> 32));
        ag9.R += f;
        ag9.c += f;
        float v3 = (float) dU5.v(j3);
        ag9.v += v3;
        ag9.e += v3;
    }

    @Override // defpackage.jJj
    public final float D() {
        return this.f7272R.f3599R.D();
    }

    public void EZ(bTI bti, long j, pfJ pfj, boolean z, boolean z2) {
        poS pos = this.f7280R;
        if (pos != null) {
            pos.A5(bti, pos.jp(j), pfj, z, z2);
        }
    }

    public final void FP() {
        lYW lyw = this.f7276R;
        if (lyw != null) {
            lyw.invalidate();
            return;
        }
        poS pos = this.f7284v;
        if (pos != null) {
            pos.FP();
        }
    }

    public final boolean HK() {
        if (this.f7276R != null && this.f7269R <= 0.0f) {
            return true;
        }
        poS pos = this.f7284v;
        if (pos != null) {
            return pos.HK();
        }
        return false;
    }

    public final void ID(kTd ktd, bTI bti, long j, pfJ pfj, boolean z, boolean z2, float f) {
        if (ktd == null) {
            EZ(bti, j, pfj, z, z2);
            return;
        }
        ift ift = (ift) bti;
        switch (ift.e) {
            case 0:
                ((h_4) ((e7) ((oSr) ktd)).R).k().getClass();
                break;
            default:
                hUv huv = (hUv) ktd;
                break;
        }
        ID(msU.C(ktd, ift.X()), bti, j, pfj, z, z2, f);
    }

    @Override // defpackage.l0f
    public void KZ(long j, float f, kg9 kg9) {
        uv(kg9);
        if (!dU5.R(this.c, j)) {
            this.c = j;
            this.f7272R.f3606R.f7296R.PN();
            lYW lyw = this.f7276R;
            if (lyw != null) {
                lyw.v(j);
            } else {
                poS pos = this.f7284v;
                if (pos != null) {
                    pos.FP();
                }
            }
            emQ.cR(this);
            fue fue = this.f7272R;
            gzG gzg = fue.f3595R;
            if (gzg != null) {
                ((AndroidComposeView) gzg).P(fue);
            }
        }
        this.f7283v = f;
    }

    public final void LE(mET met) {
        mET met2 = this.f7277R;
        if (met != met2) {
            this.f7277R = met;
            if (met2 == null || met.e() != met2.e() || met.c() != met2.c()) {
                int e = met.e();
                int c = met.c();
                lYW lyw = this.f7276R;
                if (lyw != null) {
                    lyw.m(iTI.R(e, c));
                } else {
                    poS pos = this.f7284v;
                    if (pos != null) {
                        pos.FP();
                    }
                }
                fue fue = this.f7272R;
                gzG gzg = fue.f3595R;
                if (gzg != null) {
                    ((AndroidComposeView) gzg).P(fue);
                }
                Qg(iTI.R(e, c));
                boolean l = msU.l(4);
                j28 ax = ax();
                if (l || (ax = ax.v) != null) {
                    j28 ky = ky(l);
                    while (ky != null && (ky.X & 4) != 0) {
                        if ((ky.e & 4) != 0 && (ky instanceof oYk)) {
                            e7 e7Var = (e7) ((oYk) ky);
                            e7Var.v = true;
                            msU.vz(e7Var).t();
                        }
                        if (ky == ax) {
                            break;
                        }
                        ky = ky.c;
                    }
                }
            }
            LinkedHashMap linkedHashMap = this.f7274R;
            if ((!(linkedHashMap == null || linkedHashMap.isEmpty()) || (!met.R().isEmpty())) && !n3x.v(met.R(), this.f7274R)) {
                this.f7272R.f3606R.f7296R.f2092R.X();
                LinkedHashMap linkedHashMap2 = this.f7274R;
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    this.f7274R = linkedHashMap2;
                }
                linkedHashMap2.clear();
                linkedHashMap2.putAll(met.R());
            }
        }
    }

    @Override // defpackage.emQ
    public final hjM MG() {
        return this;
    }

    @Override // defpackage.hjM
    public final long O(long j) {
        if (p()) {
            hjM g = ooA.g(this);
            AndroidComposeView androidComposeView = (AndroidComposeView) msU.Kl(this.f7272R);
            androidComposeView.g();
            return Y(g, aWo.O(l1r.v(androidComposeView.f1240v, j), ooA.i(g)));
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final void OE() {
        poS pos;
        lYW lyw = this.f7276R;
        boolean z = false;
        if (lyw != null) {
            kg9 kg9 = this.f7275R;
            if (kg9 != null) {
                h7_ h7_ = R;
                h7_.R = 1.0f;
                h7_.v = 1.0f;
                h7_.c = 1.0f;
                h7_.e = 0.0f;
                h7_.X = 0.0f;
                h7_.O = 0.0f;
                long j = nRb.R;
                h7_.f4078R = j;
                h7_.f4083v = j;
                h7_.L = 0.0f;
                h7_.Z = 0.0f;
                h7_.m = 0.0f;
                h7_.x = 8.0f;
                h7_.f4082c = b3a.v;
                h7_.f4080R = cUF.f2104R;
                h7_.f4081R = false;
                fue fue = this.f7272R;
                h7_.f4079R = fue.f3599R;
                msU.Kl(fue).getSnapshotObserver().R(this, lBz.Z, new q4(15, kg9));
                aao aao = this.f7271R;
                if (aao == null) {
                    aao = new aao();
                    this.f7271R = aao;
                }
                float f = h7_.R;
                aao.R = f;
                float f2 = h7_.v;
                aao.v = f2;
                float f3 = h7_.e;
                aao.c = f3;
                float f4 = h7_.X;
                aao.e = f4;
                float f5 = h7_.L;
                aao.X = f5;
                float f6 = h7_.Z;
                aao.O = f6;
                float f7 = h7_.m;
                aao.L = f7;
                float f8 = h7_.x;
                aao.Z = f8;
                long j2 = h7_.f4082c;
                aao.f925R = j2;
                float f9 = h7_.c;
                float f10 = h7_.O;
                long j3 = h7_.f4078R;
                long j4 = h7_.f4083v;
                n76 n76 = h7_.f4080R;
                boolean z2 = h7_.f4081R;
                fue fue2 = this.f7272R;
                lyw.c(f, f2, f9, f3, f4, f10, f5, f6, f7, f8, j2, n76, z2, j3, j4, fue2.f3603R, fue2.f3599R);
                pos = this;
                pos.f7282c = h7_.f4081R;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            pos = this;
            if (pos.f7275R == null) {
                z = true;
            }
            if (!z) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        pos.f7269R = R.c;
        fue fue3 = pos.f7272R;
        gzG gzg = fue3.f3595R;
        if (gzg != null) {
            ((AndroidComposeView) gzg).P(fue3);
        }
    }

    public final poS Ou(poS pos) {
        fue fue = pos.f7272R;
        fue fue2 = this.f7272R;
        if (fue == fue2) {
            j28 ax = pos.ax();
            j28 j28 = ax().R;
            if (j28.f4792R) {
                for (j28 j282 = j28.v; j282 != null; j282 = j282.v) {
                    if ((j282.e & 2) != 0 && j282 == ax) {
                        return pos;
                    }
                }
                return this;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        while (fue.O > fue2.O) {
            fue = fue.N();
        }
        while (fue2.O > fue.O) {
            fue2 = fue2.N();
        }
        while (fue != fue2) {
            fue = fue.N();
            fue2 = fue2.N();
            if (fue != null) {
                if (fue2 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        return fue2 == this.f7272R ? this : fue == pos.f7272R ? pos : fue.f3600R.f4974R;
    }

    @Override // defpackage.kgQ, defpackage.cxM
    public final Object R() {
        j28 ax = ax();
        fue fue = this.f7272R;
        jJj jjj = fue.f3599R;
        Object obj = null;
        for (j28 j28 = (j28) fue.f3600R.c; j28 != null; j28 = j28.v) {
            if (j28 != ax) {
                if (((j28.e & 64) != 0) && (j28 instanceof dnR)) {
                    obj = ((cNa) ((e7) ((dnR) j28)).R).b(obj);
                }
            }
        }
        return obj;
    }

    public abstract void R2(Gp gp);

    @Override // defpackage.emQ
    public final boolean Ry() {
        return this.f7277R != null;
    }

    public final void S9(poS pos, aG9 ag9, boolean z) {
        if (pos != this) {
            poS pos2 = this.f7284v;
            if (pos2 != null) {
                pos2.S9(pos, ag9, z);
            }
            long j = this.c;
            int i = dU5.R;
            float f = (float) ((int) (j >> 32));
            ag9.R -= f;
            ag9.c -= f;
            float v2 = (float) dU5.v(j);
            ag9.v -= v2;
            ag9.e -= v2;
            lYW lyw = this.f7276R;
            if (lyw != null) {
                lyw.R(ag9, true);
                if (this.f7282c && z) {
                    long j2 = ((l0f) this).R;
                    ag9.R(0.0f, 0.0f, (float) ((int) (j2 >> 32)), (float) ltH.v(j2));
                }
            }
        }
    }

    public final long V_(long j) {
        lYW lyw = this.f7276R;
        if (lyw != null) {
            j = lyw.X(j, false);
        }
        long j2 = this.c;
        float e = aWo.e(j);
        int i = dU5.R;
        return aH9.N(e + ((float) ((int) (j2 >> 32))), aWo.X(j) + ((float) dU5.v(j2)));
    }

    public abstract otO WF(h89 h89);

    @Override // defpackage.hjM
    public final long X(long j) {
        if (p()) {
            while (this != null) {
                j = this.V_(j);
                this = this.f7284v;
            }
            return j;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    @Override // defpackage.hjM
    public final long Y(hjM hjm, long j) {
        poS pos;
        hkQ hkq = hjm instanceof hkQ ? (hkQ) hjm : null;
        if (hkq == null || (pos = hkq.R.f7012R) == null) {
            pos = (poS) hjm;
        }
        poS Ou = Ou(pos);
        while (pos != Ou) {
            j = pos.V_(j);
            pos = pos.f7284v;
        }
        return aS(Ou, j);
    }

    public final float _5(long j, long j2) {
        if (((float) mh()) >= nqW.e(j2) && ((float) JD()) >= nqW.v(j2)) {
            return Float.POSITIVE_INFINITY;
        }
        long ec = ec(j2);
        float e = nqW.e(ec);
        float v2 = nqW.v(ec);
        float e2 = aWo.e(j);
        float max = Math.max(0.0f, e2 < 0.0f ? -e2 : e2 - ((float) mh()));
        float X = aWo.X(j);
        long N = aH9.N(max, Math.max(0.0f, X < 0.0f ? -X : X - ((float) JD())));
        if ((e <= 0.0f && v2 <= 0.0f) || aWo.e(N) > e || aWo.X(N) > v2) {
            return Float.POSITIVE_INFINITY;
        }
        return (aWo.X(N) * aWo.X(N)) + (aWo.e(N) * aWo.e(N));
    }

    public final void _i(kTd ktd, bTI bti, long j, pfJ pfj, boolean z, boolean z2) {
        if (ktd == null) {
            EZ(bti, j, pfj, z, z2);
        } else {
            pfj.v(ktd, -1.0f, z2, new mXn(this, ktd, bti, j, pfj, z, z2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void _m(Gp gp) {
        boolean l = msU.l(4);
        j28 ax = ax();
        oYk oyk = 0;
        if (l || (ax = ax.v) != null) {
            j28 ky = ky(l);
            while (true) {
                if (ky != null && (ky.X & 4) != 0) {
                    if ((ky.e & 4) == 0) {
                        if (ky == ax) {
                            break;
                        }
                        ky = ky.c;
                    } else {
                        if (ky instanceof oYk) {
                            oyk = ky;
                        }
                        oyk = (oYk) oyk;
                    }
                } else {
                    break;
                }
            }
        }
        if (oyk == null) {
            R2(gp);
            return;
        }
        fue fue = this.f7272R;
        fue.getClass();
        msU.Kl(fue).getSharedDrawScope().R(gp, iTI.J(((l0f) this).R), this, oyk);
    }

    public final long aS(poS pos, long j) {
        if (pos == this) {
            return j;
        }
        poS pos2 = this.f7284v;
        return (pos2 == null || n3x.v(pos, pos2)) ? jp(j) : jp(pos2.aS(pos, j));
    }

    public abstract j28 ax();

    @Override // defpackage.hjM
    public final poS b() {
        if (p()) {
            return this.f7272R.C().f7284v;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    @Override // defpackage.emQ
    public final mET c0() {
        mET met = this.f7277R;
        if (met != null) {
            return met;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    public final long ec(long j) {
        return n1P.e(Math.max(0.0f, (nqW.e(j) - ((float) mh())) / 2.0f), Math.max(0.0f, (nqW.v(j) - ((float) JD())) / 2.0f));
    }

    @Override // defpackage.mZf
    public final mdz getLayoutDirection() {
        return this.f7272R.f3603R;
    }

    @Override // defpackage.emQ
    public final emQ hi() {
        return this.f7280R;
    }

    @Override // defpackage.emQ
    public final emQ iS() {
        return this.f7284v;
    }

    @Override // defpackage.oFl
    public final boolean isValid() {
        return this.f7276R != null && p();
    }

    @Override // defpackage.hjM
    public final gIA j(hjM hjm, boolean z) {
        poS pos;
        if (!p()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        } else if (hjm.p()) {
            hkQ hkq = hjm instanceof hkQ ? (hkQ) hjm : null;
            if (hkq == null || (pos = hkq.R.f7012R) == null) {
                pos = (poS) hjm;
            }
            poS Ou = Ou(pos);
            aG9 ag9 = this.f7270R;
            if (ag9 == null) {
                ag9 = new aG9();
                this.f7270R = ag9;
            }
            ag9.R = 0.0f;
            ag9.v = 0.0f;
            ag9.c = (float) ((int) (hjm.pG() >> 32));
            ag9.e = (float) ltH.v(hjm.pG());
            while (pos != Ou) {
                pos.CD(ag9, z, false);
                if (ag9.v()) {
                    return gIA.R;
                }
                pos = pos.f7284v;
            }
            S9(Ou, ag9, z);
            return new gIA(ag9.R, ag9.v, ag9.c, ag9.e);
        } else {
            throw new IllegalStateException(("LayoutCoordinates " + hjm + " is not attached!").toString());
        }
    }

    public final long jp(long j) {
        long j2 = this.c;
        float e = aWo.e(j);
        int i = dU5.R;
        long N = aH9.N(e - ((float) ((int) (j2 >> 32))), aWo.X(j) - ((float) dU5.v(j2)));
        lYW lyw = this.f7276R;
        return lyw != null ? lyw.X(N, true) : N;
    }

    @Override // defpackage.emQ
    public final void k8() {
        KZ(this.c, this.f7283v, this.f7275R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0031 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean kW(long r5) {
        /*
            r4 = this;
            float r0 = defpackage.aWo.e(r5)
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0014
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r3
        L_0x0015:
            if (r0 == 0) goto L_0x002e
            float r0 = defpackage.aWo.X(r5)
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L_0x0029
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0029
            r0 = r2
            goto L_0x002a
        L_0x0029:
            r0 = r3
        L_0x002a:
            if (r0 == 0) goto L_0x002e
            r0 = r2
            goto L_0x002f
        L_0x002e:
            r0 = r3
        L_0x002f:
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            lYW r0 = r4.f7276R
            if (r0 == 0) goto L_0x0042
            boolean r4 = r4.f7282c
            if (r4 == 0) goto L_0x0042
            boolean r4 = r0.e(r5)
            if (r4 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r2 = r3
        L_0x0042:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.poS.kW(long):boolean");
    }

    public final j28 ky(boolean z) {
        j28 ax;
        if (this.f7272R.C() == this) {
            return (j28) this.f7272R.f3600R.e;
        }
        if (z) {
            poS pos = this.f7284v;
            if (pos == null || (ax = pos.ax()) == null) {
                return null;
            }
            return ax.c;
        }
        poS pos2 = this.f7284v;
        if (pos2 != null) {
            return pos2.ax();
        }
        return null;
    }

    public final long lU() {
        return this.f7273R.M(this.f7272R.f3592R.X());
    }

    @Override // defpackage.hjM
    public final boolean p() {
        return ax().f4792R;
    }

    @Override // defpackage.hjM
    public final long pG() {
        return ((l0f) this).R;
    }

    public void q_() {
        lYW lyw = this.f7276R;
        if (lyw != null) {
            lyw.invalidate();
        }
    }

    public final void rz(Gp gp) {
        lYW lyw = this.f7276R;
        if (lyw != null) {
            lyw.Z(gp);
            return;
        }
        long j = this.c;
        float f = (float) ((int) (j >> 32));
        float v2 = (float) dU5.v(j);
        gp.g(f, v2);
        _m(gp);
        gp.g(-f, -v2);
    }

    public final void s3(kTd ktd, bTI bti, long j, pfJ pfj, boolean z, boolean z2, float f) {
        if (ktd == null) {
            EZ(bti, j, pfj, z, z2);
        } else {
            pfj.v(ktd, f, z2, new h1c(this, ktd, bti, j, pfj, z, z2, f));
        }
    }

    public final void sS() {
        otO oto = this.f7279R;
        boolean l = msU.l(128);
        if (oto != null) {
            j28 ax = ax();
            if (l || (ax = ax.v) != null) {
                j28 ky = ky(l);
                while (ky != null && (ky.X & 128) != 0) {
                    if ((ky.e & 128) != 0 && (ky instanceof jo5)) {
                        jo5 jo5 = (jo5) ky;
                    }
                    if (ky == ax) {
                        break;
                    }
                    ky = ky.c;
                }
            }
        }
        j28 ax2 = ax();
        if (l || (ax2 = ax2.v) != null) {
            j28 ky2 = ky(l);
            while (ky2 != null && (ky2.X & 128) != 0) {
                if ((ky2.e & 128) != 0 && (ky2 instanceof jo5)) {
                    e7 e7Var = (e7) ((jo5) ky2);
                    e7Var.f2979R = this;
                    eo1 eo1 = e7Var.R;
                    if (eo1 instanceof mij) {
                        ((mij) eo1).j(this);
                    }
                }
                if (ky2 != ax2) {
                    ky2 = ky2.c;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (((r2.R.X & 128) != 0) == true) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void tP() {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.794E-43)
            boolean r1 = defpackage.msU.l(r0)
            j28 r2 = r9.ky(r1)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x001b
            j28 r2 = r2.R
            int r2 = r2.X
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0017
            r2 = r3
            goto L_0x0018
        L_0x0017:
            r2 = r4
        L_0x0018:
            if (r2 != r3) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r3 = r4
        L_0x001c:
            if (r3 == 0) goto L_0x0072
            dR6 r2 = defpackage.ift.c()
            dR6 r3 = r2.m()     // Catch: all -> 0x006d
            if (r1 == 0) goto L_0x002d
            j28 r4 = r9.ax()     // Catch: all -> 0x0068
            goto L_0x0036
        L_0x002d:
            j28 r4 = r9.ax()     // Catch: all -> 0x0068
            j28 r4 = r4.v     // Catch: all -> 0x0068
            if (r4 != 0) goto L_0x0036
            goto L_0x0061
        L_0x0036:
            j28 r1 = r9.ky(r1)     // Catch: all -> 0x0068
        L_0x003a:
            if (r1 == 0) goto L_0x0061
            int r5 = r1.X     // Catch: all -> 0x0068
            r5 = r5 & r0
            if (r5 == 0) goto L_0x0061
            int r5 = r1.e     // Catch: all -> 0x0068
            r5 = r5 & r0
            if (r5 == 0) goto L_0x005c
            boolean r5 = r1 instanceof defpackage.jo5     // Catch: all -> 0x0068
            if (r5 == 0) goto L_0x005c
            r5 = r1
            jo5 r5 = (defpackage.jo5) r5     // Catch: all -> 0x0068
            long r6 = r9.R     // Catch: all -> 0x0068
            e7 r5 = (defpackage.e7) r5     // Catch: all -> 0x0068
            eo1 r5 = r5.R     // Catch: all -> 0x0068
            boolean r8 = r5 instanceof defpackage.kES     // Catch: all -> 0x0068
            if (r8 == 0) goto L_0x005c
            kES r5 = (defpackage.kES) r5     // Catch: all -> 0x0068
            r5.ZW(r6)     // Catch: all -> 0x0068
        L_0x005c:
            if (r1 == r4) goto L_0x0061
            j28 r1 = r1.c     // Catch: all -> 0x0068
            goto L_0x003a
        L_0x0061:
            defpackage.dR6.P(r3)     // Catch: all -> 0x006d
            r2.c()
            goto L_0x0072
        L_0x0068:
            r9 = move-exception
            defpackage.dR6.P(r3)     // Catch: all -> 0x006d
            throw r9     // Catch: all -> 0x006d
        L_0x006d:
            r9 = move-exception
            r2.c()
            throw r9
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.poS.tP():void");
    }

    public final void tR(Gp gp, gw gwVar) {
        long j = ((l0f) this).R;
        gp.t(0.5f, 0.5f, ((float) ((int) (j >> 32))) - 0.5f, ((float) ltH.v(j)) - 0.5f, gwVar);
    }

    public final void uv(kg9 kg9) {
        fue fue;
        gzG gzg;
        boolean z = (this.f7275R == kg9 && n3x.v(this.f7273R, this.f7272R.f3599R) && this.f7278R == this.f7272R.f3603R) ? false : true;
        this.f7275R = kg9;
        fue fue2 = this.f7272R;
        this.f7273R = fue2.f3599R;
        this.f7278R = fue2.f3603R;
        Object obj = null;
        if (!p() || kg9 == null) {
            lYW lyw = this.f7276R;
            if (lyw != null) {
                lyw.destroy();
                this.f7272R.f3588L = true;
                this.f7281R.g();
                if (p() && (gzg = (fue = this.f7272R).f3595R) != null) {
                    ((AndroidComposeView) gzg).P(fue);
                }
            }
            this.f7276R = null;
            this.e = false;
        } else if (this.f7276R == null) {
            gzG Kl = msU.Kl(this.f7272R);
            q4 q4Var = this.f7281R;
            AndroidComposeView androidComposeView = (AndroidComposeView) Kl;
            h5 h5Var = androidComposeView.f1203R;
            h5Var.Z();
            while (true) {
                if (!((biT) h5Var.R).H()) {
                    break;
                }
                biT bit = (biT) h5Var.R;
                Object obj2 = ((Reference) bit.N(bit.e - 1)).get();
                if (obj2 != null) {
                    obj = obj2;
                    break;
                }
            }
            lYW lyw2 = (lYW) obj;
            if (lyw2 != null) {
                lyw2.O(q4Var, this);
            } else {
                if (androidComposeView.isHardwareAccelerated() && androidComposeView.L) {
                    try {
                        lyw2 = new mQJ(androidComposeView, this, q4Var);
                    } catch (Throwable unused) {
                        androidComposeView.L = false;
                    }
                }
                if (androidComposeView.f1200R == null) {
                    if (!pzb.e) {
                        jy3.c(new View(androidComposeView.getContext()));
                    }
                    fi6 fi6 = pzb.X ? new fi6(androidComposeView.getContext()) : new j0s(androidComposeView.getContext());
                    androidComposeView.f1200R = fi6;
                    androidComposeView.addView(fi6);
                }
                lyw2 = new pzb(androidComposeView, androidComposeView.f1200R, this, q4Var);
            }
            lyw2.m(((l0f) this).R);
            lyw2.v(this.c);
            this.f7276R = lyw2;
            OE();
            this.f7272R.f3588L = true;
            this.f7281R.g();
        } else if (z) {
            OE();
        }
    }

    @Override // defpackage.hjM
    public final long v(long j) {
        long X = X(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) msU.Kl(this.f7272R);
        androidComposeView.g();
        return l1r.v(androidComposeView.f1228R, X);
    }

    @Override // defpackage.jJj
    public final float vr() {
        return this.f7272R.f3599R.vr();
    }

    @Override // defpackage.emQ
    public final long wW() {
        return this.c;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        Gp gp = (Gp) obj;
        fue fue = this.f7272R;
        if (fue.f3608X) {
            msU.Kl(fue).getSnapshotObserver().R(this, lBz.L, new _c(this, 11, gp));
            this.e = false;
        } else {
            this.e = true;
        }
        return o8s.R;
    }

    @Override // defpackage.emQ
    public final fue zE() {
        return this.f7272R;
    }
}
