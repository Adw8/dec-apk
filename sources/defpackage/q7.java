package defpackage;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: q7  reason: default package */
/* loaded from: classes.dex */
public final class q7 implements Window.Callback {
    public final /* synthetic */ Q8 R;

    /* renamed from: R  reason: collision with other field name */
    public final Window.Callback f7350R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7351R;
    public boolean c;
    public boolean v;

    public q7(Q8 q8, Window.Callback callback) {
        this.R = q8;
        if (callback != null) {
            this.f7350R = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* renamed from: C */
    public final void onDetachedFromWindow() {
        this.f7350R.onDetachedFromWindow();
    }

    public final boolean H(int i, Menu menu) {
        return this.f7350R.onCreatePanelMenu(i, menu);
    }

    public final ActionMode J(ActionMode.Callback callback, int i) {
        return mPw.v(this.f7350R, callback, i);
    }

    /* renamed from: K */
    public final void onWindowFocusChanged(boolean z) {
        this.f7350R.onWindowFocusChanged(z);
    }

    /* renamed from: L */
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f7350R.dispatchTrackballEvent(motionEvent);
    }

    /* renamed from: N */
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f7350R.onMenuItemSelected(i, menuItem);
    }

    /* renamed from: O */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f7350R.dispatchTouchEvent(motionEvent);
    }

    public final boolean P(int i, Menu menu) {
        return this.f7350R.onMenuOpened(i, menu);
    }

    public final void R(Window.Callback callback) {
        try {
            this.f7351R = true;
            callback.onContentChanged();
        } finally {
            this.f7351R = false;
        }
    }

    public final View U(int i) {
        return this.f7350R.onCreatePanelView(i);
    }

    /* renamed from: V */
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return mPw.R(this.f7350R, searchEvent);
    }

    /* renamed from: X */
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f7350R.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    /* renamed from: Z */
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f7350R.onActionModeFinished(actionMode);
    }

    public final boolean c(KeyEvent keyEvent) {
        return this.f7350R.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.v ? this.f7350R.dispatchKeyEvent(keyEvent) : this.R.t(keyEvent) || c(keyEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r0 != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0065, code lost:
        if (r5 != false) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // android.view.Window.Callback
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.e(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x006c
            Q8 r5 = r5.R
            int r0 = r6.getKeyCode()
            r5.h()
            b_R r3 = r5.f409R
            if (r3 == 0) goto L_0x003b
            eY0 r3 = r3.f1736R
            if (r3 != 0) goto L_0x001a
            goto L_0x0037
        L_0x001a:
            lRG r3 = r3.f3134R
            if (r3 == 0) goto L_0x0037
            int r4 = r6.getDeviceId()
            android.view.KeyCharacterMap r4 = android.view.KeyCharacterMap.load(r4)
            int r4 = r4.getKeyboardType()
            if (r4 == r2) goto L_0x002e
            r4 = r2
            goto L_0x002f
        L_0x002e:
            r4 = r1
        L_0x002f:
            r3.setQwertyMode(r4)
            boolean r0 = r3.performShortcut(r0, r6, r1)
            goto L_0x0038
        L_0x0037:
            r0 = r1
        L_0x0038:
            if (r0 == 0) goto L_0x003b
            goto L_0x0067
        L_0x003b:
            rD r0 = r5.f416R
            if (r0 == 0) goto L_0x0050
            int r3 = r6.getKeyCode()
            boolean r0 = r5.z(r0, r3, r6)
            if (r0 == 0) goto L_0x0050
            rD r5 = r5.f416R
            if (r5 == 0) goto L_0x0067
            r5.f7394v = r2
            goto L_0x0067
        L_0x0050:
            rD r0 = r5.f416R
            if (r0 != 0) goto L_0x0069
            rD r0 = r5.J(r1)
            r5.n(r0, r6)
            int r3 = r6.getKeyCode()
            boolean r5 = r5.z(r0, r3, r6)
            r0.f7390R = r1
            if (r5 == 0) goto L_0x0069
        L_0x0067:
            r5 = r2
            goto L_0x006a
        L_0x0069:
            r5 = r1
        L_0x006a:
            if (r5 == 0) goto L_0x006d
        L_0x006c:
            r1 = r2
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q7.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    public final boolean e(KeyEvent keyEvent) {
        return this.f7350R.dispatchKeyShortcutEvent(keyEvent);
    }

    /* renamed from: g */
    public final void onPointerCaptureChanged(boolean z) {
        eHO.R(this.f7350R, z);
    }

    /* renamed from: i */
    public final boolean onSearchRequested() {
        return this.f7350R.onSearchRequested();
    }

    public final void j(int i, Menu menu) {
        this.f7350R.onPanelClosed(i, menu);
    }

    /* renamed from: m */
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f7350R.onActionModeStarted(actionMode);
    }

    /* renamed from: o */
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f7350R.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f7351R) {
            this.f7350R.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof lRG)) {
            return H(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return U(i);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        P(i, menu);
        Q8 q8 = this.R;
        if (i == 108) {
            q8.h();
            b_R b_r = q8.f409R;
            if (b_r != null) {
                b_r.mZ(true);
            }
        } else {
            q8.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.c) {
            this.f7350R.onPanelClosed(i, menu);
            return;
        }
        j(i, menu);
        Q8 q8 = this.R;
        if (i == 108) {
            q8.h();
            b_R b_r = q8.f409R;
            if (b_r != null) {
                b_r.mZ(false);
            }
        } else if (i == 0) {
            rD J = q8.J(i);
            if (J.f7391c) {
                q8.g(J, false);
            }
        } else {
            q8.getClass();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        lRG lrg = menu instanceof lRG ? (lRG) menu : null;
        if (i == 0 && lrg == null) {
            return false;
        }
        if (lrg != null) {
            lrg.x = true;
        }
        boolean y = y(i, view, menu);
        if (lrg != null) {
            lrg.x = false;
        }
        return y;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        lRG lrg = this.R.J(0).f7388R;
        if (lrg != null) {
            t(list, lrg, i);
        } else {
            t(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01db  */
    @Override // android.view.Window.Callback
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r8, int r9) {
        /*
        // Method dump skipped, instructions count: 513
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q7.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }

    public final void t(List list, Menu menu, int i) {
        dL0.R(this.f7350R, list, menu, i);
    }

    /* renamed from: v */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f7350R.dispatchGenericMotionEvent(motionEvent);
    }

    /* renamed from: x */
    public final void onAttachedToWindow() {
        this.f7350R.onAttachedToWindow();
    }

    public final boolean y(int i, View view, Menu menu) {
        return this.f7350R.onPreparePanel(i, view, menu);
    }
}
