package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: cXA  reason: default package */
/* loaded from: classes.dex */
public final class cXA implements mZf {
    public final c2J R;

    /* renamed from: R  reason: collision with other field name */
    public final f53 f2127R;

    /* renamed from: R  reason: collision with other field name */
    public final HashMap f2128R = new HashMap();

    public cXA(f53 f53, c2J c2j) {
        this.f2127R = f53;
        this.R = c2j;
    }

    @Override // defpackage.jJj
    public final int B(float f) {
        return this.R.B(f);
    }

    @Override // defpackage.jJj
    public final long C(long j) {
        return this.R.C(j);
    }

    @Override // defpackage.jJj
    public final float D() {
        return this.R.R;
    }

    @Override // defpackage.jJj
    public final long M(long j) {
        return this.R.M(j);
    }

    @Override // defpackage.mZf
    public final j2E f(int i, int i2, Map map, kg9 kg9) {
        return this.R.f(i, i2, map, kg9);
    }

    @Override // defpackage.mZf
    public final mdz getLayoutDirection() {
        return this.R.f1948R;
    }

    @Override // defpackage.jJj
    public final float l(int i) {
        return this.R.l(i);
    }

    @Override // defpackage.jJj
    public final float mZ(float f) {
        return this.R.D() * f;
    }

    @Override // defpackage.jJj
    public final float q(float f) {
        return f / this.R.D();
    }

    @Override // defpackage.jJj
    public final float vr() {
        return this.R.v;
    }

    @Override // defpackage.jJj
    public final float vz(long j) {
        return this.R.vz(j);
    }
}
