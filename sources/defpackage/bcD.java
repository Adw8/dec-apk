package defpackage;

import java.io.IOException;
import java.util.List;

/* renamed from: bcD  reason: default package */
/* loaded from: classes.dex */
public final class bcD extends k8G implements f_c {
    public final /* synthetic */ jr5 R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bcD(jr5 jr5, int i, List list, boolean z) {
        super(0);
        this.R = jr5;
        this.X = i;
    }

    @Override // defpackage.f_c
    public final Object g() {
        this.R.f5046v.getClass();
        jr5 jr5 = this.R;
        int i = this.X;
        try {
            jr5.f5032R.H(i, gtp.CANCEL);
            synchronized (jr5) {
                jr5.f5038R.remove(Integer.valueOf(i));
            }
        } catch (IOException unused) {
        }
        return o8s.R;
    }
}
