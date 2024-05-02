package defpackage;

import java.io.IOException;

/* renamed from: n5W  reason: default package */
/* loaded from: classes.dex */
public final class n5W extends k8G implements f_c {
    public final /* synthetic */ int O;
    public final /* synthetic */ gtp R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jr5 f6297R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5W(jr5 jr5, int i, gtp gtp, int i2) {
        super(0);
        this.X = i2;
        this.f6297R = jr5;
        this.O = i;
        this.R = gtp;
    }

    public final void R() {
        switch (this.X) {
            case 0:
                this.f6297R.f5046v.getClass();
                jr5 jr5 = this.f6297R;
                int i = this.O;
                synchronized (jr5) {
                    jr5.f5038R.remove(Integer.valueOf(i));
                }
                return;
            default:
                try {
                    jr5 jr52 = this.f6297R;
                    jr52.f5032R.H(this.O, this.R);
                    return;
                } catch (IOException e) {
                    this.f6297R.c(e);
                    return;
                }
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                R();
                break;
            default:
                R();
                break;
        }
        return o8s.R;
    }
}
