package defpackage;

import java.io.IOException;

/* renamed from: cdH  reason: default package */
/* loaded from: classes.dex */
public final class cdH extends k8G implements f_c {
    public final /* synthetic */ int O;
    public final /* synthetic */ ME R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jr5 f2166R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cdH(jr5 jr5, int i, ME me, int i2, boolean z) {
        super(0);
        this.f2166R = jr5;
        this.X = i;
        this.R = me;
        this.O = i2;
    }

    @Override // defpackage.f_c
    public final Object g() {
        jr5 jr5 = this.f2166R;
        int i = this.X;
        ME me = this.R;
        int i2 = this.O;
        try {
            jr5.f5046v.getClass();
            me.J((long) i2);
            jr5.f5032R.H(i, gtp.CANCEL);
            synchronized (jr5) {
                jr5.f5038R.remove(Integer.valueOf(i));
            }
        } catch (IOException unused) {
        }
        return o8s.R;
    }
}
