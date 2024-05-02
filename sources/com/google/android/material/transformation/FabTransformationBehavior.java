package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public final Rect f2402R;

    /* renamed from: R  reason: collision with other field name */
    public final RectF f2403R;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f2404R;
    public float v;

    /* renamed from: v  reason: collision with other field name */
    public final RectF f2405v;

    public FabTransformationBehavior() {
        this.f2402R = new Rect();
        this.f2403R = new RectF();
        this.f2405v = new RectF();
        this.f2404R = new int[2];
    }

    public static float J(h5 h5Var, nUp nup, float f) {
        long j = nup.f6417R;
        long j2 = nup.f6419v;
        nUp c = ((gm9) h5Var.R).c("expansion");
        float interpolation = nup.v().getInterpolation(((float) (((c.f6417R + c.f6419v) + 17) - j)) / ((float) j2));
        LinearInterpolator linearInterpolator = My.f298R;
        return jQ.v(0.0f, f, interpolation, f);
    }

    public static Pair V(float f, float f2, boolean z, h5 h5Var) {
        nUp nup;
        nUp nup2;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            nup2 = ((gm9) h5Var.R).c("translationXLinear");
            nup = ((gm9) h5Var.R).c("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || i <= 0)) {
            nup2 = ((gm9) h5Var.R).c("translationXCurveDownwards");
            nup = ((gm9) h5Var.R).c("translationYCurveDownwards");
        } else {
            nup2 = ((gm9) h5Var.R).c("translationXCurveUpwards");
            nup = ((gm9) h5Var.R).c("translationYCurveUpwards");
        }
        return new Pair(nup2, nup);
    }

    public final float K(View view, View view2, hw1 hw1) {
        RectF rectF = this.f2403R;
        RectF rectF2 = this.f2405v;
        Y(view, rectF);
        rectF.offset(this.R, this.v);
        Y(view2, rectF2);
        hw1.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void Y(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f2404R;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    @Override // defpackage.knf
    public final void c(aRL arl) {
        if (arl.O == 0) {
            arl.O = 80;
        }
    }

    public abstract h5 h(Context context, boolean z);

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet i(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimator;
        ArrayList arrayList;
        ObjectAnimator objectAnimator2;
        ObjectAnimator objectAnimator3;
        ObjectAnimator objectAnimator4;
        h5 h = h(view2.getContext(), z);
        if (z) {
            this.R = view.getTranslationX();
            this.v = view.getTranslationY();
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        WeakHashMap weakHashMap = of5.f6887R;
        float m = m18.m(view2) - m18.m(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-m);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -m);
        }
        ((gm9) h.R).c("elevation").R(objectAnimator);
        arrayList2.add(objectAnimator);
        RectF rectF = this.f2403R;
        float o = o(view, view2, (hw1) h.v);
        float K = K(view, view2, (hw1) h.v);
        Pair V = V(o, K, z, h);
        nUp nup = (nUp) V.first;
        nUp nup2 = (nUp) V.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-o);
                view2.setTranslationY(-K);
            }
            arrayList = arrayList3;
            objectAnimator3 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            float J = J(h, nup, -o);
            float J2 = J(h, nup2, -K);
            Rect rect = this.f2402R;
            view2.getWindowVisibleDisplayFrame(rect);
            RectF rectF2 = this.f2403R;
            rectF2.set(rect);
            RectF rectF3 = this.f2405v;
            Y(view2, rectF3);
            rectF3.offset(J, J2);
            rectF3.intersect(rectF2);
            rectF.set(rectF3);
        } else {
            arrayList = arrayList3;
            objectAnimator3 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -o);
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -K);
        }
        nup.R(objectAnimator3);
        nup2.R(objectAnimator2);
        arrayList2.add(objectAnimator3);
        arrayList2.add(objectAnimator2);
        rectF.width();
        rectF.height();
        float o2 = o(view, view2, (hw1) h.v);
        float K2 = K(view, view2, (hw1) h.v);
        Pair V2 = V(o2, K2, z, h);
        nUp nup3 = (nUp) V2.first;
        nUp nup4 = (nUp) V2.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            o2 = this.R;
        }
        fArr[0] = o2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            K2 = this.v;
        }
        fArr2[0] = K2;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        nup3.R(ofFloat);
        nup4.R(ofFloat2);
        arrayList2.add(ofFloat);
        arrayList2.add(ofFloat2);
        boolean z3 = view2 instanceof ViewGroup;
        if (z3) {
            View findViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = null;
            if (findViewById != null) {
                if (findViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) findViewById;
                }
            } else if (z3) {
                viewGroup = (ViewGroup) view2;
            }
            if (viewGroup != null) {
                if (z) {
                    if (!z2) {
                        Kq.R.set(viewGroup, Float.valueOf(0.0f));
                    }
                    objectAnimator4 = ObjectAnimator.ofFloat(viewGroup, Kq.R, 1.0f);
                } else {
                    objectAnimator4 = ObjectAnimator.ofFloat(viewGroup, Kq.R, 0.0f);
                }
                ((gm9) h.R).c("contentFade").R(objectAnimator4);
                arrayList2.add(objectAnimator4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        hDC.Q(animatorSet, arrayList2);
        animatorSet.addListener(new mNN(z, view2, view));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList.get(i));
        }
        return animatorSet;
    }

    public final float o(View view, View view2, hw1 hw1) {
        RectF rectF = this.f2403R;
        RectF rectF2 = this.f2405v;
        Y(view, rectF);
        rectF.offset(this.R, this.v);
        Y(view2, rectF2);
        hw1.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, defpackage.knf
    public final boolean v(View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2402R = new Rect();
        this.f2403R = new RectF();
        this.f2405v = new RectF();
        this.f2404R = new int[2];
    }
}
