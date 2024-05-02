package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: fkQ  reason: default package */
/* loaded from: classes.dex */
public abstract class fkQ implements gt5, lF5, AdapterView.OnItemClickListener {
    public Rect R;

    public static int C(jMp jmp, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = jmp.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = jmp.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = jmp.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean V(lRG lrg) {
        int size = lrg.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = lrg.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public abstract void N(View view);

    @Override // defpackage.lF5
    public final void O(Context context, lRG lrg) {
    }

    public abstract void P(boolean z);

    public abstract void U(lRG lrg);

    @Override // defpackage.lF5
    public final boolean X(pce pce) {
        return false;
    }

    public abstract void g(int i);

    public abstract void i(int i);

    public abstract void j(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (jMp) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (jMp) listAdapter).f4913R.g((MenuItem) listAdapter.getItem(i), this, (this instanceof f5) ^ true ? 0 : 4);
    }

    public abstract void t(boolean z);

    @Override // defpackage.lF5
    public final boolean x(pce pce) {
        return false;
    }

    public abstract void y(PopupWindow.OnDismissListener onDismissListener);
}
