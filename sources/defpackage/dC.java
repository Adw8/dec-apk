package defpackage;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* renamed from: dC  reason: default package */
/* loaded from: classes.dex */
public final class dC extends Drawable.ConstantState {
    public FK R;

    /* renamed from: R  reason: collision with other field name */
    public AnimatorSet f2525R;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f2526R;

    /* renamed from: R  reason: collision with other field name */
    public lPr f2527R;

    public dC(kB3 kb3) {
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
