package defpackage;

import android.content.res.Configuration;

/* renamed from: n2R  reason: default package */
/* loaded from: classes.dex */
public final class n2R extends k8G implements kg9 {
    public final /* synthetic */ h0T R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2R(h0T h0t, int i) {
        super(1);
        this.X = i;
        this.R = h0t;
    }

    public final void R(int i) {
        switch (this.X) {
            case 2:
                h0T h0t = this.R;
                float f = jyF.R;
                h0t.R(Integer.valueOf(i));
                return;
            case 3:
                h0T h0t2 = this.R;
                float f2 = jyF.R;
                h0t2.R(Integer.valueOf(i));
                return;
            default:
                this.R.R(Boolean.TRUE);
                return;
        }
    }

    public final void v(long j) {
        switch (this.X) {
            case 7:
                h0T h0t = this.R;
                float f = iqx.R;
                h0t.R(new aWo(j));
                return;
            default:
                h0T h0t2 = this.R;
                float f2 = iqx.R;
                h0t2.R(Boolean.valueOf(!((Boolean) h0t2.getValue()).booleanValue()));
                return;
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                this.R.R((ioS) obj);
                break;
            case 1:
                this.R.R(new aWo(ooA.i((hjM) obj)));
                break;
            case 2:
                R(((Number) obj).intValue());
                break;
            case 3:
                R(((Number) obj).intValue());
                break;
            case 4:
                h0T h0t = this.R;
                kPU kpu = ur.R;
                h0t.R((Configuration) obj);
                break;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                ((Boolean) obj).booleanValue();
                h0T h0t2 = this.R;
                h0t2.R(Boolean.valueOf(!d_f.R(h0t2)));
                return o8s.R;
            case 6:
                R(((Number) obj).intValue());
                break;
            case 7:
                v(((aWo) obj).f906R);
                break;
            default:
                v(((aWo) obj).f906R);
                break;
        }
        return o8s.R;
    }
}
