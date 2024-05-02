package defpackage;

import android.text.TextPaint;
import java.io.IOException;
import java.util.List;

/* renamed from: lIm  reason: default package */
/* loaded from: classes.dex */
public final class lIm extends k8G implements f_c {
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X = 0;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lIm(int i, Vw vw, CharSequence charSequence) {
        super(0);
        this.O = i;
        this.R = charSequence;
        this.v = vw;
    }

    @Override // defpackage.f_c
    public final Object g() {
        switch (this.X) {
            case 0:
                return ok.v((CharSequence) this.R, (TextPaint) this.v, dVA.R(this.O));
            default:
                ((jr5) this.R).f5046v.getClass();
                jr5 jr5 = (jr5) this.R;
                int i = this.O;
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

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lIm(jr5 jr5, int i, List list) {
        super(0);
        this.R = jr5;
        this.O = i;
        this.v = list;
    }
}
