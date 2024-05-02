package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: k5O  reason: default package */
/* loaded from: classes.dex */
public final class k5O extends AnimatorListenerAdapter {
    public final /* synthetic */ View R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ViewGroup f5192R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kuA f5193R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ l3O f5194R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f5195R;

    public k5O(ViewGroup viewGroup, View view, boolean z, kuA kua, l3O l3o) {
        this.f5192R = viewGroup;
        this.R = view;
        this.f5195R = z;
        this.f5193R = kua;
        this.f5194R = l3o;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f5192R.endViewTransition(this.R);
        if (this.f5195R) {
            opT.R(this.f5193R.R, this.R);
        }
        this.f5194R.c();
        if (hAW.W(2)) {
            StringBuilder U = opT.U("Animator from operation ");
            U.append(this.f5193R);
            U.append(" has ended.");
            Log.v("FragmentManager", U.toString());
        }
    }
}
