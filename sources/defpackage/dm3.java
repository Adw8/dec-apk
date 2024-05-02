package defpackage;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: dm3  reason: default package */
/* loaded from: classes.dex */
public final class dm3 implements KeyListener {
    public final KeyListener R;

    /* renamed from: R  reason: collision with other field name */
    public final hw1 f2859R;

    public dm3(KeyListener keyListener) {
        hw1 hw1 = new hw1();
        this.R = keyListener;
        this.f2859R = hw1;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.R.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.R.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        this.f2859R.getClass();
        Object obj = dfg.f2803R;
        if (i != 67 ? i != 112 ? false : b1t.R(editable, keyEvent, true) : b1t.R(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        return z || this.R.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.R.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.R.onKeyUp(view, editable, i, keyEvent);
    }
}
