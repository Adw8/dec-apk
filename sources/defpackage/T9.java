package defpackage;

/* renamed from: T9  reason: default package */
/* loaded from: classes.dex */
public final class T9 extends k8G implements kg9 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ bSG f525R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f526R;
    public final /* synthetic */ boolean v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public T9(long j, boolean z, bSG bsg, boolean z2) {
        super(1);
        this.R = j;
        this.f526R = z;
        this.f525R = bsg;
        this.v = z2;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        SD sd = (SD) obj;
        lC t = g4x.t(sd, nqW.e(sd.c()) / 2.0f);
        int i = Iw.R;
        return sd.R(new Yt(this.f526R, this.f525R, this.v, t, new Iw(S2.R.R(this.R, 5))));
    }
}
