package defpackage;

import android.view.ViewGroup;

/* renamed from: hCE  reason: default package */
/* loaded from: classes.dex */
public abstract class hCE {
    public static int R(ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }

    public static void c(ViewGroup viewGroup, boolean z) {
        viewGroup.setTransitionGroup(z);
    }

    public static boolean v(ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }
}
