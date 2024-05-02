package defpackage;

import java.util.LinkedHashMap;

/* renamed from: otO  reason: default package */
/* loaded from: classes.dex */
public abstract class otO extends emQ implements pc0 {
    public final h89 R;

    /* renamed from: R  reason: collision with other field name */
    public LinkedHashMap f7010R;

    /* renamed from: R  reason: collision with other field name */
    public mET f7011R;

    /* renamed from: R  reason: collision with other field name */
    public final poS f7012R;
    public long c = dU5.v;

    /* renamed from: R  reason: collision with other field name */
    public final hkQ f7009R = new hkQ(this);
    public final LinkedHashMap v = new LinkedHashMap();

    public otO(poS pos, h89 h89) {
        this.f7012R = pos;
        this.R = h89;
    }

    public static final void S9(otO oto, mET met) {
        o8s o8s;
        if (met != null) {
            oto.getClass();
            oto.Qg(iTI.R(met.e(), met.c()));
            o8s = o8s.R;
        } else {
            o8s = null;
        }
        if (o8s == null) {
            oto.Qg(0);
        }
        if (!n3x.v(oto.f7011R, met) && met != null) {
            LinkedHashMap linkedHashMap = oto.f7010R;
            if ((!(linkedHashMap == null || linkedHashMap.isEmpty()) || (!met.R().isEmpty())) && !n3x.v(met.R(), oto.f7010R)) {
                oto.f7012R.f7272R.f3606R.f7298R.f5630R.X();
                LinkedHashMap linkedHashMap2 = oto.f7010R;
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    oto.f7010R = linkedHashMap2;
                }
                linkedHashMap2.clear();
                linkedHashMap2.putAll(met.R());
            }
        }
        oto.f7011R = met;
    }

    @Override // defpackage.jJj
    public final float D() {
        return this.f7012R.D();
    }

    @Override // defpackage.l0f
    public final void KZ(long j, float f, kg9 kg9) {
        if (!dU5.R(this.c, j)) {
            this.c = j;
            lGL lgl = this.f7012R.f7272R.f3606R.f7298R;
            if (lgl != null) {
                lgl.hi();
            }
            emQ.cR(this.f7012R);
        }
        if (!((emQ) this).R) {
            aS();
        }
    }

    @Override // defpackage.emQ
    public final hjM MG() {
        return this.f7009R;
    }

    @Override // defpackage.kgQ, defpackage.cxM
    public final Object R() {
        return this.f7012R.R();
    }

    @Override // defpackage.emQ
    public final boolean Ry() {
        return this.f7011R != null;
    }

    @Override // defpackage.cxM
    public int Z(int i) {
        return this.f7012R.f7280R.f7279R.Z(i);
    }

    @Override // defpackage.cxM
    public int ZW(int i) {
        return this.f7012R.f7280R.f7279R.ZW(i);
    }

    public void aS() {
        int e = c0().e();
        mdz mdz = this.f7012R.f7272R.f3603R;
        int i = h57.R;
        mdz mdz2 = h57.f4042R;
        h57.R = e;
        h57.f4042R = mdz;
        boolean x = gHI.x(this);
        c0().Z();
        ((emQ) this).v = x;
        h57.R = i;
        h57.f4042R = mdz2;
    }

    @Override // defpackage.emQ
    public final mET c0() {
        mET met = this.f7011R;
        if (met != null) {
            return met;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // defpackage.mZf
    public final mdz getLayoutDirection() {
        return this.f7012R.f7272R.f3603R;
    }

    @Override // defpackage.emQ
    public final emQ hi() {
        poS pos = this.f7012R.f7280R;
        if (pos != null) {
            return pos.f7279R;
        }
        return null;
    }

    @Override // defpackage.emQ
    public final emQ iS() {
        poS pos = this.f7012R.f7284v;
        if (pos != null) {
            return pos.f7279R;
        }
        return null;
    }

    @Override // defpackage.cxM
    public int k(int i) {
        return this.f7012R.f7280R.f7279R.k(i);
    }

    @Override // defpackage.emQ
    public final void k8() {
        KZ(this.c, 0.0f, null);
    }

    @Override // defpackage.jJj
    public final float vr() {
        return this.f7012R.vr();
    }

    @Override // defpackage.emQ
    public final long wW() {
        return this.c;
    }

    @Override // defpackage.emQ
    public final fue zE() {
        return this.f7012R.f7272R;
    }

    @Override // defpackage.cxM
    public int zw(int i) {
        return this.f7012R.f7280R.f7279R.zw(i);
    }
}
