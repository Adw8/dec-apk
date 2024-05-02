package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: akd  reason: default package */
/* loaded from: classes.dex */
public final class akd implements Animation.AnimationListener {
    public final /* synthetic */ View R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ViewGroup f998R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kuA f999R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ l3O f1000R;

    public akd(View view, ViewGroup viewGroup, l3O l3o, kuA kua) {
        this.f999R = kua;
        this.f998R = viewGroup;
        this.R = view;
        this.f1000R = l3o;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f998R.post(new kvW(0, this));
        if (hAW.W(2)) {
            StringBuilder U = opT.U("Animation from operation ");
            U.append(this.f999R);
            U.append(" has ended.");
            Log.v("FragmentManager", U.toString());
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (hAW.W(2)) {
            StringBuilder U = opT.U("Animation from operation ");
            U.append(this.f999R);
            U.append(" has reached onAnimationStart.");
            Log.v("FragmentManager", U.toString());
        }
    }
}
