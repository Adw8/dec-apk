package defpackage;

import java.util.concurrent.Future;

/* renamed from: pG  reason: default package */
/* loaded from: classes.dex */
public final class pG extends Tx {
    public final Object R;
    public final /* synthetic */ int e;

    public /* synthetic */ pG(int i, Object obj) {
        this.e = i;
        this.R = obj;
    }

    @Override // defpackage.Tx
    public final void R(Throwable th) {
        switch (this.e) {
            case 0:
                if (th != null) {
                    ((Future) this.R).cancel(false);
                    return;
                }
                return;
            case 1:
                ((jZi) this.R).R();
                return;
            default:
                ((kg9) this.R).x(th);
                return;
        }
    }

    public final String toString() {
        switch (this.e) {
            case 0:
                StringBuilder U = opT.U("CancelFutureOnCancel[");
                U.append((Future) this.R);
                U.append(']');
                return U.toString();
            case 1:
                StringBuilder U2 = opT.U("DisposeOnCancel[");
                U2.append((jZi) this.R);
                U2.append(']');
                return U2.toString();
            default:
                StringBuilder U3 = opT.U("InvokeOnCancel[");
                U3.append(((kg9) this.R).getClass().getSimpleName());
                U3.append('@');
                U3.append(aH9.G(this));
                U3.append(']');
                return U3.toString();
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        switch (this.e) {
            case 0:
                R((Throwable) obj);
                break;
            case 1:
                R((Throwable) obj);
                break;
            default:
                R((Throwable) obj);
                break;
        }
        return o8s.R;
    }
}
