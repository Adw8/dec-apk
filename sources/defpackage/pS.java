package defpackage;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* renamed from: pS  reason: default package */
/* loaded from: classes.dex */
public final class pS implements View.OnClickListener {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int e;

    public /* synthetic */ pS(int i, Object obj) {
        this.e = i;
        this.R = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        Message message4 = null;
        pce pce = null;
        message4 = null;
        switch (this.e) {
            case 0:
                Fj fj = (Fj) this.R;
                if (view == fj.f125R && (message3 = fj.f122R) != null) {
                    message4 = Message.obtain(message3);
                } else if (view == fj.f144v && (message2 = fj.f142v) != null) {
                    message4 = Message.obtain(message2);
                } else if (view == fj.f137c && (message = fj.f136c) != null) {
                    message4 = Message.obtain(message);
                }
                if (message4 != null) {
                    message4.sendToTarget();
                }
                Fj fj2 = (Fj) this.R;
                fj2.f132R.obtainMessage(1, fj2.f119R).sendToTarget();
                return;
            case 1:
                hLU hlu = ((Toolbar) this.R).f1167R;
                if (hlu != null) {
                    pce = hlu.f4214R;
                }
                if (pce != null) {
                    pce.collapseActionView();
                    return;
                }
                return;
            default:
                hSy hsy = (hSy) this.R;
                int i = hsy.x;
                if (i == 2) {
                    hsy.f(1);
                    return;
                } else if (i == 1) {
                    hsy.f(2);
                    return;
                } else {
                    return;
                }
        }
    }
}
