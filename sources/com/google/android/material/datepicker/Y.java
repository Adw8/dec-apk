package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Y extends h9X {
    public final TextView R;

    /* renamed from: R  reason: collision with other field name */
    public final MaterialCalendarGridView f2321R;

    public Y(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.R = textView;
        WeakHashMap weakHashMap = of5.f6887R;
        new g59(R.id.tag_accessibility_heading, 3).c(textView, Boolean.TRUE);
        this.f2321R = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z) {
            textView.setVisibility(8);
        }
    }
}
