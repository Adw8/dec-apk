package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class c implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ e f2322R;

    public c(e eVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f2322R = eVar;
        this.R = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        d R = this.R.getAdapter();
        boolean z = true;
        if (i >= R.R() && i <= (R.R() + R.f2324R.L) + -1) {
            h89 h89 = this.f2322R.f2326R;
            long longValue = this.R.getAdapter().getItem(i).longValue();
            Object obj = h89.R;
            if (longValue < ((aEW) ((hSy) obj).R.R).R) {
                z = false;
            }
            if (z) {
                ((hSy) obj).getClass();
                throw null;
            }
        }
    }
}
