package defpackage;

import java.io.Serializable;

/* renamed from: lff  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lff implements Runnable {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object v;

    public /* synthetic */ lff(Object obj, int i, Serializable serializable, int i2) {
        this.e = i2;
        this.v = obj;
        this.X = i;
        this.R = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                ((hmW) this.v).R.L(this.X, this.R);
                return;
            default:
                ((aoz) this.v).L(this.X, this.R);
                return;
        }
    }
}
