package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: XM  reason: default package */
/* loaded from: classes.dex */
public final class XM extends AnimatorListenerAdapter {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f616R;

    public /* synthetic */ XM(int i, Object obj) {
        this.R = i;
        this.f616R = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.R) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f616R;
                actionBarOverlayLayout.f1069R = null;
                actionBarOverlayLayout.f1077X = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.R) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f616R;
                actionBarOverlayLayout.f1069R = null;
                actionBarOverlayLayout.f1077X = false;
                return;
            case 1:
                ((hFt) this.f616R).g();
                animator.removeListener(this);
                return;
            case 2:
                ArrayList arrayList = new ArrayList(((EH) this.f616R).f85R);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    EH eh = (EH) this.f616R;
                    ColorStateList colorStateList = ((ePR) arrayList.get(i)).f3078R.f3859v;
                    if (colorStateList != null) {
                        cAO.Z(eh, colorStateList);
                    }
                }
                return;
            case 3:
                ((HideBottomViewOnScrollBehavior) this.f616R).f2250R = null;
                return;
            case 4:
            default:
                ((ExpandableTransformationBehavior) this.f616R).R = null;
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                ((AF) this.f616R).R();
                return;
            case 6:
                super.onAnimationEnd(animator);
                h89 V = vd.V((oN) this.f616R);
                Iterator it = ((oN) this.f616R).f6784R.iterator();
                while (it.hasNext()) {
                    V.C((j3y) it.next());
                }
                return;
            case 7:
                ((heD) this.f616R).g();
                ((heD) this.f616R).v.start();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.R) {
            case 2:
                ArrayList arrayList = new ArrayList(((EH) this.f616R).f85R);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    EH eh = (EH) this.f616R;
                    ggH ggh = ((ePR) arrayList.get(i)).f3078R;
                    ColorStateList colorStateList = ggh.f3859v;
                    if (colorStateList != null) {
                        cAO.L(eh, colorStateList.getColorForState(ggh.f3854R, colorStateList.getDefaultColor()));
                    }
                }
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                ((AF) this.f616R).v();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
