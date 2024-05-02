package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: fkN  reason: default package */
/* loaded from: classes.dex */
public final class fkN extends lsz {
    public fkN(int i) {
        if ((i & -4) == 0) {
            ((lsz) this).X = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public final ObjectAnimator B(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        mZP mzp = kkY.R;
        view.setTransitionAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, kkY.R, f2);
        ofFloat.addListener(new ner(view));
        v(new jhx(this, 0, view));
        return ofFloat;
    }

    @Override // defpackage.lsz
    public final Animator G(ViewGroup viewGroup, View view, oNy ony) {
        Float f;
        mZP mzp = kkY.R;
        return B(view, (ony == null || (f = (Float) ony.f6812R.get("android:fade:transitionAlpha")) == null) ? 1.0f : f.floatValue(), 0.0f);
    }

    @Override // defpackage.lsz, defpackage.hFt
    public final void m(oNy ony) {
        r(ony);
        HashMap hashMap = ony.f6812R;
        View view = ony.R;
        mZP mzp = kkY.R;
        hashMap.put("android:fade:transitionAlpha", Float.valueOf(view.getTransitionAlpha()));
    }

    @Override // defpackage.lsz
    public final Animator p(ViewGroup viewGroup, View view, oNy ony) {
        Float f;
        float f2 = 0.0f;
        float floatValue = (ony == null || (f = (Float) ony.f6812R.get("android:fade:transitionAlpha")) == null) ? 0.0f : f.floatValue();
        if (floatValue != 1.0f) {
            f2 = floatValue;
        }
        return B(view, f2, 1.0f);
    }

    public fkN() {
    }
}
