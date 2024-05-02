package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import dev.kdrag0n.virtcontainer.R;
import java.util.Calendar;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final Calendar R = dGb.e(null);

    /* renamed from: R  reason: collision with other field name */
    public final boolean f2320R;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (ajY.D(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f2320R = ajY.b(getContext(), R.attr.nestedScrollable);
        of5.O(this, new lGF(2, this));
    }

    /* renamed from: R */
    public final d getAdapter() {
        return (d) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d R = getAdapter();
        R.getClass();
        BS bs = R.f2323R;
        int max = Math.max(R.R(), getFirstVisiblePosition());
        int min = Math.min((R.R() + R.f2324R.L) - 1, getLastVisiblePosition());
        R.getItem(max);
        R.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
        } else if (i == 33) {
            d R = getAdapter();
            setSelection((R.R() + R.f2324R.L) - 1);
        } else if (i == 130) {
            setSelection(getAdapter().R());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.view.KeyEvent.Callback, android.widget.AbsListView, android.view.View
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().R()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().R());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f2320R) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < getAdapter().R()) {
            super.setSelection(getAdapter().R());
        } else {
            super.setSelection(i);
        }
    }

    public final View v(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof d) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), d.class.getCanonicalName()));
    }
}
