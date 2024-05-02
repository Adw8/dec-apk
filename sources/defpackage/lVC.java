package defpackage;

import java.io.IOException;

/* renamed from: lVC  reason: default package */
/* loaded from: classes.dex */
public abstract class lVC implements fGn {
    public final /* synthetic */ oIS R;

    /* renamed from: R  reason: collision with other field name */
    public final px6 f5761R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5762R;

    public lVC(oIS ois) {
        this.R = ois;
        this.f5761R = new px6(ois.f6729R.e());
    }

    public final void R() {
        int i = this.R.R;
        if (i != 6) {
            if (i == 5) {
                px6 px6 = this.f5761R;
                hqj hqj = px6.R;
                px6.R = hqj.R;
                hqj.R();
                hqj.v();
                this.R.R = 6;
                return;
            }
            StringBuilder U = opT.U("state: ");
            U.append(this.R.R);
            throw new IllegalStateException(U.toString());
        }
    }

    @Override // defpackage.fGn
    public long Y(ME me, long j) {
        try {
            return this.R.f6729R.Y(me, j);
        } catch (IOException e) {
            this.R.f6733R.c();
            this.R();
            throw e;
        }
    }

    @Override // defpackage.fGn
    public final hqj e() {
        return this.f5761R;
    }
}
