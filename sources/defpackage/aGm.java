package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* renamed from: aGm  reason: default package */
/* loaded from: classes.dex */
public final class aGm extends AnimatorListenerAdapter {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ TextView f816R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nje f817R;
    public final /* synthetic */ int v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ TextView f818v;

    public aGm(nje nje, int i, TextView textView, int i2, TextView textView2) {
        this.f817R = nje;
        this.R = i;
        this.f816R = textView;
        this.v = i2;
        this.f818v = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TC tc;
        nje nje = this.f817R;
        nje.v = this.R;
        nje.f6520R = null;
        TextView textView = this.f816R;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.v == 1 && (tc = this.f817R.f6519R) != null) {
                tc.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f818v;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            this.f818v.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f818v;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
