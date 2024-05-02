package defpackage;

import android.view.KeyEvent;

/* renamed from: pxb  reason: default package */
/* loaded from: classes.dex */
public final class pxb {
    public final KeyEvent R;

    public /* synthetic */ pxb(KeyEvent keyEvent) {
        this.R = keyEvent;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pxb) && n3x.v(this.R, ((pxb) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    public final String toString() {
        KeyEvent keyEvent = this.R;
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }
}
