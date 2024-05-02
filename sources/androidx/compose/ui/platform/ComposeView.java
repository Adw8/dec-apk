package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class ComposeView extends LG {
    public final oST R;
    public boolean c;

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.R = l6.n(null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // defpackage.LG
    public final void R(m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(420213850);
        iv7 iv7 = (iv7) this.R.getValue();
        if (iv7 != null) {
            iv7.J(jr_, 0);
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new m2w(i, 4, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // defpackage.LG
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.c;
    }

    public final void setContent(iv7 iv7) {
        this.c = true;
        this.R.R(iv7);
        if (isAttachedToWindow()) {
            c();
        }
    }
}
