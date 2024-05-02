package defpackage;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* renamed from: j2l  reason: default package */
/* loaded from: classes.dex */
public final class j2l extends gU1 {
    public final /* synthetic */ hSy R;

    /* renamed from: R  reason: collision with other field name */
    public final Calendar f4796R = dGb.e(null);
    public final Calendar v = dGb.e(null);

    public j2l(hSy hsy) {
        this.R = hsy;
    }

    @Override // defpackage.gU1
    public final void R(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof cKO) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            cKO cko = (cKO) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            this.R.getClass();
            throw null;
        }
    }
}
