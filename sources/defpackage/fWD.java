package defpackage;

import java.util.List;

/* renamed from: fWD  reason: default package */
/* loaded from: classes.dex */
public final class fWD extends jy6 {
    public final /* synthetic */ iv7 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lGT f3441R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fWD(lGT lgt, iv7 iv7, String str) {
        super(str);
        this.f3441R = lgt;
        this.R = iv7;
    }

    @Override // defpackage.bF9
    public final mET v(mZf mzf, List list, long j) {
        this.f3441R.f5635R.f1948R = mzf.getLayoutDirection();
        this.f3441R.f5635R.R = mzf.D();
        this.f3441R.f5635R.v = mzf.vr();
        lGT lgt = this.f3441R;
        lgt.R = 0;
        lGT lgt2 = this.f3441R;
        return new oKM((mET) this.R.J(lgt.f5635R, new oys(j)), lgt2, lgt2.R);
    }
}
