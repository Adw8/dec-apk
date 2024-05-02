package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.e;
import java.util.Calendar;

/* renamed from: hqE  reason: default package */
/* loaded from: classes.dex */
public final class hqE implements View.OnClickListener {
    public final /* synthetic */ e R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ hSy f4393R;
    public final /* synthetic */ int e;

    public /* synthetic */ hqE(hSy hsy, e eVar, int i) {
        this.e = i;
        this.f4393R = hsy;
        this.R = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.e) {
            case 0:
                int iS = ((LinearLayoutManager) this.f4393R.f4271v.getLayoutManager()).iS() + 1;
                if (iS < this.f4393R.f4271v.getAdapter().R()) {
                    hSy hsy = this.f4393R;
                    Calendar v = dGb.v(this.R.R.f20R.f3521R);
                    v.add(2, iS);
                    hsy.E(new fhy(v));
                    return;
                }
                return;
            default:
                int wW = ((LinearLayoutManager) this.f4393R.f4271v.getLayoutManager()).wW() - 1;
                if (wW >= 0) {
                    hSy hsy2 = this.f4393R;
                    Calendar v2 = dGb.v(this.R.R.f20R.f3521R);
                    v2.add(2, wW);
                    hsy2.E(new fhy(v2));
                    return;
                }
                return;
        }
    }
}
