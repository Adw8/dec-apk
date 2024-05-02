package defpackage;

import android.view.ViewConfiguration;

/* renamed from: pt  reason: default package */
/* loaded from: classes.dex */
public final class pt implements bUo {
    public final ViewConfiguration R;

    public pt(ViewConfiguration viewConfiguration) {
        this.R = viewConfiguration;
    }

    @Override // defpackage.bUo
    public final long R() {
        return (long) ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.bUo
    public final float c() {
        return (float) this.R.getScaledTouchSlop();
    }

    @Override // defpackage.bUo
    public final long e() {
        return (long) ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.bUo
    public final long v() {
        return 40;
    }
}
