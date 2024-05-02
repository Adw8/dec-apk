package defpackage;

/* renamed from: aB7  reason: default package */
/* loaded from: classes.dex */
public final class aB7 extends k8G implements kg9 {
    public final /* synthetic */ h0T R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f778R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f779R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kun f780R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aB7(kun kun, String str, kg9 kg9, h0T h0t, int i) {
        super(1);
        this.X = i;
        this.f780R = kun;
        this.f778R = str;
        this.f779R = kg9;
        this.R = h0t;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                this.R.R(Boolean.valueOf(((Boolean) obj).booleanValue()));
                this.f780R.f5478R.edit().putBoolean(this.f778R, biy.O(this.R)).apply();
                kg9 kg9 = this.f779R;
                if (kg9 != null) {
                    kg9.x(Boolean.valueOf(biy.O(this.R)));
                }
                return o8s.R;
            default:
                float floatValue = ((Number) obj).floatValue();
                this.R.R(Integer.valueOf(mLz.t(floatValue)));
                this.f780R.f5478R.edit().putInt(this.f778R, mLz.t(floatValue)).apply();
                this.f779R.x(Integer.valueOf(((Number) this.R.getValue()).intValue()));
                return o8s.R;
        }
    }
}
