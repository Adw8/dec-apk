package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import dev.kdrag0n.virtcontainer.R;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class e extends gEY {
    public final BD R;

    /* renamed from: R  reason: collision with other field name */
    public final h89 f2326R;
    public final int X;

    public e(ContextThemeWrapper contextThemeWrapper, hIm him, BD bd, h89 h89) {
        fhy fhy = bd.f20R;
        fhy fhy2 = bd.v;
        fhy fhy3 = bd.c;
        if (fhy.f3521R.compareTo(fhy3.f3521R) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (fhy3.f3521R.compareTo(fhy2.f3521R) <= 0) {
            int i = d.e;
            int i2 = hSy.H;
            this.X = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i) + (ajY.D(contextThemeWrapper) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
            this.R = bd;
            this.f2326R = h89;
            if (!((gEY) this).R.R()) {
                ((gEY) this).f3695R = true;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    @Override // defpackage.gEY
    public final h9X L(RecyclerView recyclerView, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, (ViewGroup) recyclerView, false);
        if (!ajY.D(recyclerView.getContext())) {
            return new Y(linearLayout, false);
        }
        linearLayout.setLayoutParams(new l88(-1, this.X));
        return new Y(linearLayout, true);
    }

    @Override // defpackage.gEY
    public final void O(h9X h9x, int i) {
        Y y = (Y) h9x;
        Calendar v = dGb.v(this.R.f20R.f3521R);
        v.add(2, i);
        fhy fhy = new fhy(v);
        y.R.setText(fhy.O());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) y.f2321R.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !fhy.equals(materialCalendarGridView.getAdapter().f2324R)) {
            d dVar = new d(fhy, null, this.R);
            materialCalendarGridView.setNumColumns(fhy.O);
            materialCalendarGridView.setAdapter((ListAdapter) dVar);
        } else {
            materialCalendarGridView.invalidate();
            d R = materialCalendarGridView.getAdapter();
            for (Long l : R.f2325R) {
                R.e(materialCalendarGridView, l.longValue());
            }
            R.getClass();
        }
        materialCalendarGridView.setOnItemClickListener(new c(this, materialCalendarGridView));
    }

    @Override // defpackage.gEY
    public final int R() {
        return this.R.O;
    }

    @Override // defpackage.gEY
    public final long v(int i) {
        Calendar v = dGb.v(this.R.f20R.f3521R);
        v.add(2, i);
        return new fhy(v).f3521R.getTimeInMillis();
    }
}
