package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Collection;

/* loaded from: classes.dex */
public final class d extends BaseAdapter {
    public final BD R;

    /* renamed from: R  reason: collision with other field name */
    public BS f2323R;

    /* renamed from: R  reason: collision with other field name */
    public final fhy f2324R;

    /* renamed from: R  reason: collision with other field name */
    public Collection f2325R;
    public static final int e = dGb.e(null).getMaximum(4);
    public static final int X = (dGb.e(null).getMaximum(7) + dGb.e(null).getMaximum(5)) - 1;

    public d(fhy fhy, hIm him, BD bd) {
        this.f2324R = fhy;
        this.R = bd;
        this.f2325R = him.X();
    }

    public final int R() {
        fhy fhy = this.f2324R;
        int i = this.R.e;
        int i2 = fhy.f3521R.get(7);
        if (i <= 0) {
            i = fhy.f3521R.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + fhy.O : i3;
    }

    public final void c(TextView textView, long j) {
        if (textView != null) {
            if (!(j >= ((aEW) this.R.R).R)) {
                textView.setEnabled(false);
                this.f2323R.L.H(textView);
                return;
            }
            textView.setEnabled(true);
            throw null;
        }
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (fhy.v(j).equals(this.f2324R)) {
            Calendar v = dGb.v(this.f2324R.f3521R);
            v.setTimeInMillis(j);
            int i = v.get(5);
            c((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter().R() + (i - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return X;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return (long) (i / this.f2324R.O);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00dd  */
    @Override // android.widget.Adapter
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            android.content.Context r0 = r11.getContext()
            BS r1 = r8.f2323R
            if (r1 != 0) goto L_0x000f
            BS r1 = new BS
            r1.<init>(r0)
            r8.f2323R = r1
        L_0x000f:
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r10 != 0) goto L_0x0027
            android.content.Context r10 = r11.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r0 = 2131492959(0x7f0c005f, float:1.8609385E38)
            android.view.View r10 = r10.inflate(r0, r11, r1)
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0027:
            int r10 = r8.R()
            int r10 = r9 - r10
            if (r10 < 0) goto L_0x00ce
            fhy r11 = r8.f2324R
            int r2 = r11.L
            if (r10 < r2) goto L_0x0037
            goto L_0x00ce
        L_0x0037:
            r2 = 1
            int r10 = r10 + r2
            r0.setTag(r11)
            android.content.res.Resources r11 = r0.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            java.util.Locale r11 = r11.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r11 = java.lang.String.format(r11, r4, r3)
            r0.setText(r11)
            fhy r11 = r8.f2324R
            java.util.Calendar r11 = r11.f3521R
            java.util.Calendar r11 = defpackage.dGb.v(r11)
            r3 = 5
            r11.set(r3, r10)
            long r10 = r11.getTimeInMillis()
            fhy r4 = r8.f2324R
            int r4 = r4.X
            java.util.Calendar r5 = defpackage.dGb.c()
            r5.set(r3, r2)
            java.util.Calendar r5 = defpackage.dGb.v(r5)
            r6 = 2
            r5.get(r6)
            int r6 = r5.get(r2)
            r7 = 7
            r5.getMaximum(r7)
            r5.getActualMaximum(r3)
            r5.getTimeInMillis()
            java.lang.String r3 = "UTC"
            if (r4 != r6) goto L_0x00aa
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r5 = "MMMEd"
            android.icu.text.DateFormat r4 = android.icu.text.DateFormat.getInstanceForSkeleton(r5, r4)
            android.icu.util.TimeZone r3 = android.icu.util.TimeZone.getTimeZone(r3)
            r4.setTimeZone(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r10)
            java.lang.String r10 = r4.format(r3)
            r0.setContentDescription(r10)
            goto L_0x00c7
        L_0x00aa:
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r5 = "yMMMEd"
            android.icu.text.DateFormat r4 = android.icu.text.DateFormat.getInstanceForSkeleton(r5, r4)
            android.icu.util.TimeZone r3 = android.icu.util.TimeZone.getTimeZone(r3)
            r4.setTimeZone(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r10)
            java.lang.String r10 = r4.format(r3)
            r0.setContentDescription(r10)
        L_0x00c7:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x00d6
        L_0x00ce:
            r10 = 8
            r0.setVisibility(r10)
            r0.setEnabled(r1)
        L_0x00d6:
            java.lang.Long r9 = r8.getItem(r9)
            if (r9 != 0) goto L_0x00dd
            goto L_0x00e4
        L_0x00dd:
            long r9 = r9.longValue()
            r8.c(r0, r9)
        L_0x00e4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.d.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    /* renamed from: v */
    public final Long getItem(int i) {
        if (i < R()) {
            return null;
        }
        int R = R();
        fhy fhy = this.f2324R;
        if (i > (R + fhy.L) - 1) {
            return null;
        }
        Calendar v = dGb.v(fhy.f3521R);
        v.set(5, (i - R()) + 1);
        return Long.valueOf(v.getTimeInMillis());
    }
}
