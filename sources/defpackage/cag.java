package defpackage;

import java.util.List;

/* renamed from: cag  reason: default package */
/* loaded from: classes.dex */
public final class cag extends k8G implements kg9 {
    public final /* synthetic */ jyH R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cag(jyH jyh, int i) {
        super(1);
        this.X = i;
        this.R = jyh;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        boolean z;
        switch (this.X) {
            case 0:
                hjM hjm = (hjM) obj;
                jyH jyh = this.R;
                eUu euu = jyh.f5166R;
                euu.f3121R = hjm;
                jyh.getClass();
                if (mQg.R(null, euu.R)) {
                    long v = hjm.v(aWo.v);
                    if (!aWo.v(v, this.R.f5166R.v)) {
                        this.R.getClass();
                    }
                    this.R.f5166R.v = v;
                }
                return o8s.R;
            case 1:
                List list = (List) obj;
                iRR irr = this.R.f5166R.f3122R;
                if (irr != null) {
                    list.add(irr);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                fiv fiv = (fiv) obj;
                jyH jyh2 = this.R;
                eUu euu2 = jyh2.f5166R;
                iRR irr2 = euu2.f3122R;
                if (irr2 != null) {
                    euu2.f3124R.getValue();
                    jyh2.getClass();
                    jy3.v(fiv.G().R(), irr2);
                }
                return o8s.R;
        }
    }
}
