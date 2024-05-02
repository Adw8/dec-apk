package defpackage;

/* renamed from: dU2  reason: default package */
/* loaded from: classes.dex */
public final class dU2 extends k8G implements kg9 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f2627R;
    public final /* synthetic */ int X = 2;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dU2(long j, ngd ngd) {
        super(1);
        this.R = j;
        this.f2627R = ngd;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                geT get = (geT) this.f2627R;
                jQ.Y(get.f3833R.getValue());
                long j = dU5.v;
                jQ.Y(get.v.getValue());
                int ordinal = ((aMr) obj).ordinal();
                if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                    return new dU5(j);
                }
                throw new j8f((Object) null);
            default:
                ohT oht = (ohT) obj;
                float e = nqW.e(this.R);
                float f = 0.0f;
                if (e > 0.0f) {
                    jDh jdh = (jDh) oht;
                    float mZ = jdh.mZ(brj.R);
                    float mZ2 = jdh.mZ(((ngd) this.f2627R).e(jdh.getLayoutDirection())) - mZ;
                    float f2 = (float) 2;
                    float f3 = (mZ * f2) + e + mZ2;
                    mdz layoutDirection = jdh.getLayoutDirection();
                    int[] iArr = ign.R;
                    float e2 = iArr[layoutDirection.ordinal()] == 1 ? nqW.e(jdh.c()) - f3 : mZ2 < 0.0f ? 0.0f : mZ2;
                    if (iArr[jdh.getLayoutDirection().ordinal()] == 1) {
                        float e3 = nqW.e(jdh.c());
                        if (mZ2 >= 0.0f) {
                            f = mZ2;
                        }
                        f3 = e3 - f;
                    }
                    float v = nqW.v(this.R);
                    float f4 = (-v) / f2;
                    float f5 = v / f2;
                    JF jf = jdh.R.R;
                    long v2 = jf.v();
                    jf.R().y();
                    jf.f201R.R(e2, f4, f3, f5, 0);
                    jdh.v();
                    jf.R().j();
                    jf.c(v2);
                } else {
                    ((jDh) oht).v();
                }
                return o8s.R;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public dU2(geT get, long j) {
        super(1);
        this.f2627R = get;
        this.R = j;
    }
}
