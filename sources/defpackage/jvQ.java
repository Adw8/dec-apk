package defpackage;

import java.util.List;

/* renamed from: jvQ  reason: default package */
/* loaded from: classes.dex */
public final class jvQ implements bF9 {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ LG f5119R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mdz f5120R;

    public /* synthetic */ jvQ(LG lg, mdz mdz, int i) {
        this.R = i;
        this.f5119R = lg;
        this.f5120R = mdz;
    }

    @Override // defpackage.bF9
    public final mET v(mZf mzf, List list, long j) {
        switch (this.R) {
            case 0:
                ((gv2) this.f5119R).f3983R = this.f5120R;
                return mzf.f(0, 0, iia.R, fWj.R);
            default:
                ((bkb) this.f5119R).setParentLayoutDirection(this.f5120R);
                return mzf.f(0, 0, iia.R, s7.R);
        }
    }
}
