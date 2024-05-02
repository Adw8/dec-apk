package androidx.compose.ui.platform;

import android.content.Context;
import android.view.Choreographer;

/* loaded from: classes.dex */
public final class e extends k8G implements kg9 {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, int i, Object obj2) {
        super(1);
        this.X = i;
        this.R = obj;
        this.v = obj2;
    }

    public final void R(Throwable th) {
        switch (this.X) {
            case 2:
                hk hkVar = (hk) this.R;
                Choreographer.FrameCallback frameCallback = (Choreographer.FrameCallback) this.v;
                synchronized (hkVar.f4365R) {
                    hkVar.f4366R.remove(frameCallback);
                }
                return;
            default:
                ((el) this.R).R.removeFrameCallback((Choreographer.FrameCallback) this.v);
                return;
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                Mj mj = (Mj) obj;
                if (!((WrappedComposition) this.R).f1248R) {
                    m4i O = mj.f294R.O();
                    WrappedComposition wrappedComposition = (WrappedComposition) this.R;
                    wrappedComposition.f1247R = (iv7) this.v;
                    if (wrappedComposition.R == null) {
                        wrappedComposition.R = O;
                        O.R(wrappedComposition);
                    } else if (O.f5900R.R(iMP.CREATED)) {
                        WrappedComposition wrappedComposition2 = (WrappedComposition) this.R;
                        wrappedComposition2.f1246R.v(aH9.u(new Y(wrappedComposition2, (iv7) this.v, 1), true, -2000640158));
                    }
                }
                return o8s.R;
            case 1:
                dlc dlc = (dlc) obj;
                ((Context) this.R).getApplicationContext().registerComponentCallbacks((k9) this.v);
                return new fQb((Context) this.R, 7, (k9) this.v);
            case 2:
                R((Throwable) obj);
                break;
            default:
                R((Throwable) obj);
                break;
        }
        return o8s.R;
    }
}
