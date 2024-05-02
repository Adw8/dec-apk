package defpackage;

/* renamed from: bfp  reason: default package */
/* loaded from: classes.dex */
public final class bfp extends k8G implements kg9 {
    public final /* synthetic */ h0T R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jJj f1764R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bfp(jJj jjj, h0T h0t, int i) {
        super(1);
        this.X = i;
        this.f1764R = jjj;
        this.R = h0t;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                long j = ((o2S) obj).f6655R;
                h0T h0t = this.R;
                jJj jjj = this.f1764R;
                h0t.R(new ltH(iTI.R(jjj.B(o2S.v(j)), jjj.B(o2S.R(j)))));
                return o8s.R;
            default:
                aff aff = aff.R;
                mk9 mk9 = mk9.v;
                _0 _0 = new _0(18, (f_c) obj);
                bfp bfp = new bfp(this.f1764R, this.R, 0);
                b_t b_t = nFs.R;
                return mWb.R(aff, g4x.y(aff, new ozH(_0, ih.c, Float.NaN, bfp, mk9)));
        }
    }
}
