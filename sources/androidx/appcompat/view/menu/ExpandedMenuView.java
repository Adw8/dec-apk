package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements ikD, ehR, AdapterView.OnItemClickListener {
    public static final int[] R = {16842964, 16843049};

    /* renamed from: R  reason: collision with other field name */
    public lRG f1032R;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        CV h = CV.h(context, attributeSet, R, 16842868, 0);
        if (h.o(0)) {
            setBackgroundDrawable(h.U(0));
        }
        if (h.o(1)) {
            setDivider(h.U(1));
        }
        h.z();
    }

    @Override // defpackage.ikD
    public final boolean R(pce pce) {
        return this.f1032R.g(pce, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View, android.widget.AdapterView
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        R((pce) getAdapter().getItem(i));
    }

    @Override // defpackage.ehR
    public final void v(lRG lrg) {
        this.f1032R = lrg;
    }
}
