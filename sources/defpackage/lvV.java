package defpackage;

/* renamed from: lvV  reason: default package */
/* loaded from: classes.dex */
public final class lvV implements h2V {
    public final /* synthetic */ aD8 R;
    public final /* synthetic */ int e;

    public /* synthetic */ lvV(aD8 ad8, int i) {
        this.e = i;
        this.R = ad8;
    }

    @Override // defpackage.h2V
    public final Object R(Object obj, aOO aoo) {
        int i;
        switch (this.e) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.R.c.R(null);
                return o8s.R;
            default:
                Integer num = (Integer) obj;
                aD8 ad8 = this.R;
                iFC L = ad8.L();
                if (!(L == null || (i = L.v) == ad8.Z())) {
                    ad8.f795R.R(Integer.valueOf(i));
                }
                return o8s.R;
        }
    }
}
