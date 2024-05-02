package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import dev.kdrag0n.virtcontainer.R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: k65  reason: default package */
/* loaded from: classes.dex */
public final class k65 extends BaseAdapter {
    public final Calendar R;
    public final int X;
    public final int e;

    public k65() {
        Calendar e = dGb.e(null);
        this.R = e;
        this.e = e.getMaximum(7);
        this.X = e.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.e;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.e;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.X;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.R;
        int i2 = i + this.X;
        int i3 = this.e;
        if (i2 > i3) {
            i2 -= i3;
        }
        calendar.set(7, i2);
        textView.setText(this.R.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.R.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public k65(int i) {
        Calendar e = dGb.e(null);
        this.R = e;
        this.e = e.getMaximum(7);
        this.X = i;
    }
}
