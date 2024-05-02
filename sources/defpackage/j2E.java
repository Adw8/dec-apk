package defpackage;

import java.util.Map;

/* renamed from: j2E  reason: default package */
/* loaded from: classes.dex */
public final class j2E implements mET {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final Map f4793R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f4794R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mZf f4795R;
    public final /* synthetic */ int c;
    public final int v;

    public j2E(int i, int i2, Map map, mZf mzf, kg9 kg9) {
        this.c = i;
        this.f4795R = mzf;
        this.f4794R = kg9;
        this.R = i;
        this.v = i2;
        this.f4793R = map;
    }

    @Override // defpackage.mET
    public final Map R() {
        return this.f4793R;
    }

    @Override // defpackage.mET
    public final void Z() {
        gHI ghi = h57.f4041R;
        int i = this.c;
        mdz layoutDirection = this.f4795R.getLayoutDirection();
        mZf mzf = this.f4795R;
        emQ emq = mzf instanceof emQ ? (emQ) mzf : null;
        kg9 kg9 = this.f4794R;
        int i2 = h57.R;
        mdz mdz = h57.f4042R;
        h57.R = i;
        h57.f4042R = layoutDirection;
        boolean x = gHI.x(emq);
        kg9.x(ghi);
        if (emq != null) {
            emq.v = x;
        }
        h57.R = i2;
        h57.f4042R = mdz;
    }

    @Override // defpackage.mET
    public final int c() {
        return this.v;
    }

    @Override // defpackage.mET
    public final int e() {
        return this.R;
    }
}
