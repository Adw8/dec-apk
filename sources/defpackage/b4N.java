package defpackage;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: b4N  reason: default package */
/* loaded from: classes.dex */
public final class b4N extends hw1 {
    public final EditText R;

    /* renamed from: R  reason: collision with other field name */
    public final jM9 f1516R;

    public b4N(EditText editText) {
        this.R = editText;
        jM9 jm9 = new jM9(editText);
        this.f1516R = jm9;
        editText.addTextChangedListener(jm9);
        if (nNh.f6380R == null) {
            synchronized (nNh.f6379R) {
                if (nNh.f6380R == null) {
                    nNh.f6380R = new nNh();
                }
            }
        }
        editText.setEditableFactory(nNh.f6380R);
    }

    @Override // defpackage.hw1
    public final void J(boolean z) {
        jM9 jm9 = this.f1516R;
        if (jm9.v != z) {
            if (jm9.f4905R != null) {
                dfg R = dfg.R();
                lOo loo = jm9.f4905R;
                R.getClass();
                gvP.U(loo, "initCallback cannot be null");
                R.f2809R.writeLock().lock();
                try {
                    R.f2805R.remove(loo);
                } finally {
                    R.f2809R.writeLock().unlock();
                }
            }
            jm9.v = z;
            if (z) {
                jM9.R(jm9.R, dfg.R().v());
            }
        }
    }

    @Override // defpackage.hw1
    public final InputConnection V(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection instanceof fSH ? inputConnection : new fSH(this.R, inputConnection, editorInfo);
    }

    @Override // defpackage.hw1
    public final KeyListener i(KeyListener keyListener) {
        if (keyListener instanceof dm3) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new dm3(keyListener);
    }
}
