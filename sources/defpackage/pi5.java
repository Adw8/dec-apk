package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: pi5  reason: default package */
/* loaded from: classes.dex */
public abstract class pi5 extends lsz {
    public final lx3 R;
    public final ArrayList Z = new ArrayList();
    public lx3 v;

    public pi5(lx3 lx3, b_0 b_0) {
        this.R = lx3;
        this.v = b_0;
    }

    public static void B(ArrayList arrayList, lx3 lx3, ViewGroup viewGroup, View view, boolean z) {
        if (lx3 != null) {
            Animator R = z ? lx3.R(viewGroup, view) : lx3.v(viewGroup, view);
            if (R != null) {
                arrayList.add(R);
            }
        }
    }

    @Override // defpackage.lsz
    public final Animator G(ViewGroup viewGroup, View view, oNy ony) {
        return l(viewGroup, view, false);
    }

    public final AnimatorSet l(ViewGroup viewGroup, View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        B(arrayList, this.R, viewGroup, view, z);
        B(arrayList, this.v, viewGroup, view, z);
        Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            B(arrayList, (lx3) it.next(), viewGroup, view, z);
        }
        Context context = viewGroup.getContext();
        int i = otP.R;
        if (((hFt) this).f4184v == -1) {
            TypedValue W = hDC.W(context, R.attr.motionDurationLong1);
            int i2 = (W == null || W.type != 16) ? -1 : W.data;
            if (i2 != -1) {
                ((hFt) this).f4184v = (long) i2;
            }
        }
        TimeInterpolator timeInterpolator = My.f300R;
        if (((hFt) this).f4174R == null) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(R.attr.motionEasingEmphasizedInterpolator, typedValue, true)) {
                if (typedValue.type == 3) {
                    String valueOf = String.valueOf(typedValue.string);
                    if (!(cpc.W(valueOf, "cubic-bezier") || cpc.W(valueOf, "path"))) {
                        timeInterpolator = AnimationUtils.loadInterpolator(context, typedValue.resourceId);
                    } else if (cpc.W(valueOf, "cubic-bezier")) {
                        String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                        if (split.length == 4) {
                            timeInterpolator = kUo.v(cpc.A(0, split), cpc.A(1, split), cpc.A(2, split), cpc.A(3, split));
                        } else {
                            StringBuilder U = opT.U("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                            U.append(split.length);
                            throw new IllegalArgumentException(U.toString());
                        }
                    } else if (cpc.W(valueOf, "path")) {
                        timeInterpolator = kUo.c(gvP.y(valueOf.substring(5, valueOf.length() - 1)));
                    } else {
                        throw new IllegalArgumentException(opT.H("Invalid motion easing type: ", valueOf));
                    }
                } else {
                    throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
                }
            }
            ((hFt) this).f4174R = timeInterpolator;
        }
        hDC.Q(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // defpackage.lsz
    public final Animator p(ViewGroup viewGroup, View view, oNy ony) {
        return l(viewGroup, view, true);
    }
}
