package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.transformation.ExpandableBehavior;

/* renamed from: kxU  reason: default package */
/* loaded from: classes.dex */
public final class kxU implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ExpandableBehavior f5525R;
    public final /* synthetic */ int e;

    public kxU(ExpandableBehavior expandableBehavior, View view, int i, fdL fdl) {
        this.f5525R = expandableBehavior;
        this.R = view;
        this.e = i;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.R.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.f5525R.R != this.e) {
            return false;
        }
        throw null;
    }
}
