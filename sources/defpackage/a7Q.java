package defpackage;

import android.view.Choreographer;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* renamed from: a7Q  reason: default package */
/* loaded from: classes.dex */
public final class a7Q extends k8G implements kg9 {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7Q(int i, Object obj) {
        super(1);
        this.X = i;
        this.R = obj;
    }

    public final void R(Object obj) {
        switch (this.X) {
            case 2:
                ((hAe) ((fzE) this.R)).o(obj);
                return;
            default:
                ((Set) this.R).add(obj);
                return;
        }
    }

    public final void v(Throwable th) {
        switch (this.X) {
            case 0:
                jlG.R.removeFrameCallback((Choreographer.FrameCallback) this.R);
                return;
            default:
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                fLL fll = (fLL) this.R;
                synchronized (fll.f3384R) {
                    pd2 pd2 = fll.f3391R;
                    if (pd2 != null) {
                        fll.f3383R.H(a8X.ShuttingDown);
                        pd2.c(cancellationException);
                        fll.f3388R = null;
                        pd2.l(new V4(fll, 15, th));
                    } else {
                        fll.f3385R = cancellationException;
                        fll.f3383R.H(a8X.ShutDown);
                    }
                }
                return;
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        switch (this.X) {
            case 0:
                v((Throwable) obj);
                break;
            case 1:
                v((Throwable) obj);
                break;
            case 2:
                R(obj);
                break;
            default:
                R(obj);
                break;
        }
        return o8s.R;
    }
}
