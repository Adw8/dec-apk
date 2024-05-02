package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* renamed from: mop  reason: default package */
/* loaded from: classes.dex */
public final class mop extends ActionMode.Callback2 {
    public final /* synthetic */ ActionMode.Callback R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ c8A f6164R;

    public mop(c8A c8a, biC bic) {
        this.f6164R = c8a;
        this.R = bic;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.R.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.R.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        c8A c8a = this.f6164R;
        int round = Math.round(((float) c8a.X) * c8a.f1973R.f2431R.R);
        c8A c8a2 = this.f6164R;
        int round2 = Math.round(((float) c8a2.O) * c8a2.f1973R.f2431R.R);
        c8A c8a3 = this.f6164R;
        int round3 = Math.round((float) (((c8a3.L - 1) - c8a3.f1973R.getTopRow()) * this.f6164R.f1973R.f2431R.v));
        c8A c8a4 = this.f6164R;
        int round4 = Math.round((float) (((c8a4.Z + 1) - c8a4.f1973R.getTopRow()) * this.f6164R.f1973R.f2431R.v));
        if (round > round2) {
            round2 = round;
            round = round2;
        }
        int bottom = this.f6164R.f1973R.getBottom();
        int i = this.f6164R.e;
        int i2 = round3 + i;
        int i3 = round4 + i;
        if (i2 > bottom) {
            i2 = bottom;
        }
        if (i3 <= bottom) {
            bottom = i3;
        }
        rect.set(round, i2, round2, bottom);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }
}
