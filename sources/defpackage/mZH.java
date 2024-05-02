package defpackage;

import java.io.IOException;

/* renamed from: mZH  reason: default package */
/* loaded from: classes.dex */
public final class mZH extends k8G implements f_c {
    public final /* synthetic */ int O;
    public final /* synthetic */ jr5 R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public mZH(jr5 jr5, int i, int i2) {
        super(0);
        this.R = jr5;
        this.X = i;
        this.O = i2;
    }

    @Override // defpackage.f_c
    public final Object g() {
        jr5 jr5 = this.R;
        int i = this.X;
        int i2 = this.O;
        jr5.getClass();
        try {
            jr5.f5032R.Z(i, i2, true);
        } catch (IOException e) {
            jr5.c(e);
        }
        return o8s.R;
    }
}
