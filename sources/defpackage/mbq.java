package defpackage;

import android.view.WindowInsetsAnimation;

/* renamed from: mbq  reason: default package */
/* loaded from: classes.dex */
public final class mbq extends ooA {
    public final WindowInsetsAnimation R;

    public mbq(WindowInsetsAnimation windowInsetsAnimation) {
        this.R = windowInsetsAnimation;
    }

    public final long I() {
        return this.R.getDurationMillis();
    }

    public final int u() {
        return this.R.getTypeMask();
    }

    public final void z(float f) {
        this.R.setFraction(f);
    }
}
