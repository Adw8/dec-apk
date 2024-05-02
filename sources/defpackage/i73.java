package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* renamed from: i73  reason: default package */
/* loaded from: classes.dex */
public final class i73 extends G5 {
    public WeakHashMap R = new WeakHashMap();

    /* renamed from: R  reason: collision with other field name */
    public final kuM f4466R;

    public i73(kuM kum) {
        this.f4466R = kum;
    }

    @Override // defpackage.G5
    public final boolean L(View view, int i, Bundle bundle) {
        RecyclerView recyclerView = this.f4466R.R;
        if ((!recyclerView.f1417e || recyclerView.f1419m || recyclerView.f1398R.L()) || this.f4466R.R.getLayoutManager() == null) {
            return super.L(view, i, bundle);
        }
        G5 g5 = (G5) this.R.get(view);
        if (g5 != null) {
            if (g5.L(view, i, bundle)) {
                return true;
            }
        } else if (super.L(view, i, bundle)) {
            return true;
        }
        fgh fgh = this.f4466R.R.getLayoutManager().f5374R.f1391R;
        return false;
    }

    @Override // defpackage.G5
    public final boolean O(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        G5 g5 = (G5) this.R.get(viewGroup);
        return g5 != null ? g5.O(viewGroup, view, accessibilityEvent) : super.O(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.G5
    public final boolean R(View view, AccessibilityEvent accessibilityEvent) {
        G5 g5 = (G5) this.R.get(view);
        return g5 != null ? g5.R(view, accessibilityEvent) : super.R(view, accessibilityEvent);
    }

    @Override // defpackage.G5
    public final void X(View view, AccessibilityEvent accessibilityEvent) {
        G5 g5 = (G5) this.R.get(view);
        if (g5 != null) {
            g5.X(view, accessibilityEvent);
        } else {
            super.X(view, accessibilityEvent);
        }
    }

    @Override // defpackage.G5
    public final void Z(View view, int i) {
        G5 g5 = (G5) this.R.get(view);
        if (g5 != null) {
            g5.Z(view, i);
        } else {
            super.Z(view, i);
        }
    }

    @Override // defpackage.G5
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        G5 g5 = (G5) this.R.get(view);
        if (g5 != null) {
            g5.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.G5
    public final void e(View view, jG jGVar) {
        RecyclerView recyclerView = this.f4466R.R;
        if ((!recyclerView.f1417e || recyclerView.f1419m || recyclerView.f1398R.L()) || this.f4466R.R.getLayoutManager() == null) {
            ((G5) this).R.onInitializeAccessibilityNodeInfo(view, jGVar.f4895R);
            return;
        }
        this.f4466R.R.getLayoutManager().M(view, jGVar);
        G5 g5 = (G5) this.R.get(view);
        if (g5 != null) {
            g5.e(view, jGVar);
        } else {
            ((G5) this).R.onInitializeAccessibilityNodeInfo(view, jGVar.f4895R);
        }
    }

    @Override // defpackage.G5
    public final void m(View view, AccessibilityEvent accessibilityEvent) {
        G5 g5 = (G5) this.R.get(view);
        if (g5 != null) {
            g5.m(view, accessibilityEvent);
        } else {
            super.m(view, accessibilityEvent);
        }
    }

    @Override // defpackage.G5
    public final Zz v(View view) {
        G5 g5 = (G5) this.R.get(view);
        return g5 != null ? g5.v(view) : super.v(view);
    }
}
