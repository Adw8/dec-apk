package defpackage;

import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.e;
import java.util.Calendar;

/* renamed from: hcT  reason: default package */
/* loaded from: classes.dex */
public final class hcT extends cp2 {
    public final /* synthetic */ MaterialButton R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ e f4320R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ hSy f4321R;

    public hcT(hSy hsy, e eVar, MaterialButton materialButton) {
        this.f4321R = hsy;
        this.f4320R = eVar;
        this.R = materialButton;
    }

    @Override // defpackage.cp2
    public final void R(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.R.getText());
        }
    }

    @Override // defpackage.cp2
    public final void v(RecyclerView recyclerView, int i, int i2) {
        int iS = i < 0 ? ((LinearLayoutManager) this.f4321R.f4271v.getLayoutManager()).iS() : ((LinearLayoutManager) this.f4321R.f4271v.getLayoutManager()).wW();
        hSy hsy = this.f4321R;
        Calendar v = dGb.v(this.f4320R.R.f20R.f3521R);
        v.add(2, iS);
        hsy.f4270R = new fhy(v);
        MaterialButton materialButton = this.R;
        Calendar v2 = dGb.v(this.f4320R.R.f20R.f3521R);
        v2.add(2, iS);
        v2.set(5, 1);
        Calendar v3 = dGb.v(v2);
        v3.get(2);
        v3.get(1);
        v3.getMaximum(7);
        v3.getActualMaximum(5);
        v3.getTimeInMillis();
        materialButton.setText(DateUtils.formatDateTime(null, v3.getTimeInMillis(), 8228));
    }
}
