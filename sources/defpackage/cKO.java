package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import dev.kdrag0n.virtcontainer.R;
import java.util.Locale;

/* renamed from: cKO  reason: default package */
/* loaded from: classes.dex */
public final class cKO extends gEY {
    public final hSy R;

    public cKO(hSy hsy) {
        this.R = hsy;
    }

    @Override // defpackage.gEY
    public final h9X L(RecyclerView recyclerView, int i) {
        return new gxm((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_year, (ViewGroup) recyclerView, false));
    }

    @Override // defpackage.gEY
    public final void O(h9X h9x, int i) {
        gxm gxm = (gxm) h9x;
        int i2 = this.R.R.f20R.X + i;
        String string = gxm.R.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        gxm.R.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        gxm.R.setContentDescription(String.format(string, Integer.valueOf(i2)));
        BS bs = this.R.f4268R;
        if (dGb.c().get(1) == i2) {
            Jd jd = bs.O;
        } else {
            Jd jd2 = bs.e;
        }
        this.R.getClass();
        throw null;
    }

    @Override // defpackage.gEY
    public final int R() {
        return this.R.R.X;
    }
}
