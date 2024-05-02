package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: hJL  reason: default package */
/* loaded from: classes.dex */
public final class hJL {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public final View f4207R;
    public int c;
    public int v;

    public hJL(View view) {
        this.f4207R = view;
    }

    public final void R() {
        View view = this.f4207R;
        int top = this.c - (view.getTop() - this.R);
        WeakHashMap weakHashMap = of5.f6887R;
        view.offsetTopAndBottom(top);
        View view2 = this.f4207R;
        view2.offsetLeftAndRight(0 - (view2.getLeft() - this.v));
    }

    public final boolean v(int i) {
        if (this.c == i) {
            return false;
        }
        this.c = i;
        R();
        return true;
    }
}
