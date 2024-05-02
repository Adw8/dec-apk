package defpackage;

import java.util.Map;

/* renamed from: oKM  reason: default package */
/* loaded from: classes.dex */
public final class oKM implements mET {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lGT f6746R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mET f6747R;

    public oKM(mET met, lGT lgt, int i) {
        this.f6747R = met;
        this.f6746R = lgt;
        this.R = i;
    }

    @Override // defpackage.mET
    public final Map R() {
        return this.f6747R.R();
    }

    @Override // defpackage.mET
    public final void Z() {
        this.f6746R.R = this.R;
        this.f6747R.Z();
        lGT lgt = this.f6746R;
        lgt.R(lgt.R);
    }

    @Override // defpackage.mET
    public final int c() {
        return this.f6747R.c();
    }

    @Override // defpackage.mET
    public final int e() {
        return this.f6747R.e();
    }
}
