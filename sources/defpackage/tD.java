package defpackage;

/* renamed from: tD  reason: default package */
/* loaded from: classes.dex */
public final class tD implements h2V {
    public final /* synthetic */ h0T R;
    public final /* synthetic */ int e;

    public /* synthetic */ tD(h0T h0t, int i) {
        this.e = i;
        this.R = h0t;
    }

    @Override // defpackage.h2V
    public final Object R(Object obj, aOO aoo) {
        switch (this.e) {
            case 0:
                this.R.R(Boolean.valueOf(((Boolean) obj).booleanValue()));
                break;
            case 1:
                this.R.R((heu) obj);
                break;
            default:
                int intValue = ((Number) obj).intValue();
                h0T h0t = this.R;
                Integer num = new Integer(intValue);
                float f = iqx.R;
                h0t.R(num);
                break;
        }
        return o8s.R;
    }
}
