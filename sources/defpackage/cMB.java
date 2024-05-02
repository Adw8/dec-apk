package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import java.util.WeakHashMap;

/* renamed from: cMB  reason: default package */
/* loaded from: classes.dex */
public abstract class cMB extends Activity implements nu_, f_g {
    public m4i R = new m4i(this);

    public final boolean H(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (getWindow().getDecorView() != null) {
            WeakHashMap weakHashMap = of5.f6887R;
        }
        return H(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (getWindow().getDecorView() != null) {
            WeakHashMap weakHashMap = of5.f6887R;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mQ4.v(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        m4i m4i = this.R;
        iMP imp = iMP.CREATED;
        m4i.e("markState");
        m4i.L(imp);
        super.onSaveInstanceState(bundle);
    }
}
