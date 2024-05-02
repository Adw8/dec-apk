package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* renamed from: fiE  reason: default package */
/* loaded from: classes.dex */
public final class fiE extends ActionMode.Callback2 {
    public final j0 R;

    public fiE(j0 j0Var) {
        this.R = j0Var;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        j0 j0Var = this.R;
        j0Var.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            f_c f_c = (f_c) j0Var.c;
            if (f_c != null) {
                f_c.g();
            }
        } else if (itemId == 1) {
            f_c f_c2 = (f_c) j0Var.e;
            if (f_c2 != null) {
                f_c2.g();
            }
        } else if (itemId == 2) {
            f_c f_c3 = (f_c) j0Var.X;
            if (f_c3 != null) {
                f_c3.g();
            }
        } else if (itemId != 3) {
            return false;
        } else {
            f_c f_c4 = (f_c) j0Var.O;
            if (f_c4 != null) {
                f_c4.g();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.R.m(actionMode, menu);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        f_c f_c = (f_c) this.R.f4786R;
        if (f_c != null) {
            f_c.g();
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        gIA gia = (gIA) this.R.v;
        if (rect != null) {
            rect.set((int) gia.f3720R, (int) gia.v, (int) gia.c, (int) gia.e);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.R.x(actionMode, menu);
    }
}
