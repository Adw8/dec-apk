package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: eV  reason: default package */
/* loaded from: classes.dex */
public final class eV extends k8G implements kg9 {
    public final /* synthetic */ AndroidComposeView R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eV(AndroidComposeView androidComposeView, int i) {
        super(1);
        this.X = i;
        this.R = androidComposeView;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        Looper looper = null;
        jnj jnj = null;
        boolean z = true;
        switch (this.X) {
            case 0:
                int i = ((a_n) obj).R;
                if ((i == 1 ? 1 : null) != null) {
                    z = this.R.isInTouchMode();
                } else {
                    if ((i == 2 ? 1 : null) == null) {
                        z = false;
                    } else if (this.R.isInTouchMode()) {
                        z = this.R.requestFocusFromTouch();
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                KeyEvent keyEvent = ((pxb) obj).R;
                this.R.getClass();
                long I = dTl.I(keyEvent);
                if (nQJ.R(I, nQJ.Z)) {
                    jnj = new jnj(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (nQJ.R(I, nQJ.O)) {
                    jnj = new jnj(4);
                } else if (nQJ.R(I, nQJ.X)) {
                    jnj = new jnj(3);
                } else if (nQJ.R(I, nQJ.c)) {
                    jnj = new jnj(5);
                } else if (nQJ.R(I, nQJ.e)) {
                    jnj = new jnj(6);
                } else {
                    if (nQJ.R(I, nQJ.L) ? true : nQJ.R(I, nQJ.m) ? true : nQJ.R(I, nQJ.H)) {
                        jnj = new jnj(7);
                    } else {
                        if (nQJ.R(I, nQJ.v) ? true : nQJ.R(I, nQJ.x)) {
                            jnj = new jnj(8);
                        }
                    }
                }
                if (jnj != null) {
                    if (dTl.z(keyEvent) != 2) {
                        z = false;
                    }
                    if (z) {
                        return Boolean.valueOf(((o3Z) this.R.getFocusManager()).v(jnj.R));
                    }
                }
                return Boolean.FALSE;
            default:
                f_c f_c = (f_c) obj;
                Handler handler = this.R.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                }
                if (looper == Looper.myLooper()) {
                    f_c.g();
                } else {
                    Handler handler2 = this.R.getHandler();
                    if (handler2 != null) {
                        handler2.post(new i4(f_c, 0));
                    }
                }
                return o8s.R;
        }
    }
}
