package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    public AnimatorSet R;

    public ExpandableTransformationBehavior() {
    }

    public abstract AnimatorSet i(View view, View view2, boolean z, boolean z2);

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void t(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.R;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet i = i(view, view2, z, z3);
        this.R = i;
        i.addListener(new XM(8, this));
        this.R.start();
        if (!z2) {
            this.R.end();
        }
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
