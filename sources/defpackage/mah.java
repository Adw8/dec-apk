package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: mah  reason: default package */
/* loaded from: classes.dex */
public final class mah extends AnimationSet implements Runnable {
    public final View R;

    /* renamed from: R  reason: collision with other field name */
    public final ViewGroup f6079R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6080R;
    public boolean c = true;
    public boolean v;

    public mah(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f6079R = viewGroup;
        this.R = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.c = true;
        if (this.f6080R) {
            return !this.v;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f6080R = true;
            nZr.R(this.f6079R, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6080R || !this.c) {
            this.f6079R.endViewTransition(this.R);
            this.v = true;
            return;
        }
        this.c = false;
        this.f6079R.post(this);
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.c = true;
        if (this.f6080R) {
            return !this.v;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f6080R = true;
            nZr.R(this.f6079R, this);
        }
        return true;
    }
}
