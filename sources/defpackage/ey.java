package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: ey  reason: default package */
/* loaded from: classes.dex */
public final class ey extends hFt {

    /* renamed from: R  reason: collision with other field name */
    public static final String[] f3257R = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final mZP R = new mZP(PointF.class, "topLeft", 1);
    public static final mZP v = new mZP(PointF.class, "bottomRight", 2);
    public static final mZP c = new mZP(PointF.class, "bottomRight", 3);
    public static final mZP e = new mZP(PointF.class, "topLeft", 4);
    public static final mZP X = new mZP(PointF.class, "position", 5);

    static {
        new ez(PointF.class);
    }

    @Override // defpackage.hFt
    public final void O(oNy ony) {
        r(ony);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v9, resolved type: android.animation.AnimatorSet */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hFt
    public final Animator P(ViewGroup viewGroup, oNy ony, oNy ony2) {
        int i;
        ObjectAnimator objectAnimator;
        ey eyVar;
        if (ony == null || ony2 == null) {
            return null;
        }
        HashMap hashMap = ony.f6812R;
        HashMap hashMap2 = ony2.f6812R;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = ony2.R;
        Rect rect = (Rect) ony.f6812R.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) ony2.f6812R.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) ony.f6812R.get("android:changeBounds:clip");
        Rect rect4 = (Rect) ony2.f6812R.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (!(i6 == i7 && i8 == i9)) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        if (i <= 0) {
            return null;
        }
        mZP mzp = kkY.R;
        view.setLeftTopRightBottom(i2, i4, i6, i8);
        if (i != 2) {
            eyVar = this;
            if (i2 == i3 && i4 == i5) {
                ((hFt) eyVar).f4179R.getClass();
                objectAnimator = ObjectAnimator.ofObject(view, c, (TypeConverter) null, n2G.x((float) i6, (float) i8, (float) i7, (float) i9));
            } else {
                ((hFt) eyVar).f4179R.getClass();
                objectAnimator = ObjectAnimator.ofObject(view, e, (TypeConverter) null, n2G.x((float) i2, (float) i4, (float) i3, (float) i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            eyVar = this;
            ((hFt) eyVar).f4179R.getClass();
            objectAnimator = ObjectAnimator.ofObject(view, X, (TypeConverter) null, n2G.x((float) i2, (float) i4, (float) i3, (float) i5));
        } else {
            eyVar = this;
            fv fvVar = new fv(view);
            ((hFt) eyVar).f4179R.getClass();
            ObjectAnimator ofObject = ObjectAnimator.ofObject(fvVar, R, (TypeConverter) null, n2G.x((float) i2, (float) i4, (float) i3, (float) i5));
            ((hFt) eyVar).f4179R.getClass();
            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(fvVar, v, (TypeConverter) null, n2G.x((float) i6, (float) i8, (float) i7, (float) i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, ofObject2);
            animatorSet.addListener(new bT(fvVar));
            objectAnimator = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            viewGroup4.suppressLayout(true);
            eyVar.v(new q9(viewGroup4));
        }
        return objectAnimator;
    }

    @Override // defpackage.hFt
    public final String[] i() {
        return f3257R;
    }

    @Override // defpackage.hFt
    public final void m(oNy ony) {
        r(ony);
    }

    public final void r(oNy ony) {
        View view = ony.R;
        WeakHashMap weakHashMap = of5.f6887R;
        if (d6y.c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            ony.f6812R.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            ony.f6812R.put("android:changeBounds:parent", ony.R.getParent());
        }
    }
}
