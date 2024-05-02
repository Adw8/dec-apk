package defpackage;

import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: biC  reason: default package */
/* loaded from: classes.dex */
public final class biC implements ActionMode.Callback {
    public final Object R;

    public biC(c8A c8a) {
        this.R = c8a;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (((c8A) this.R).f1976R) {
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                ((c8A) this.R).f1973R.f2426R.f2416R.m(((c8A) this.R).R());
                ((c8A) this.R).f1973R.m();
            } else if (itemId == 2) {
                ((c8A) this.R).f1973R.m();
                ((c8A) this.R).f1973R.f2426R.f2416R.X();
            } else if (itemId == 3) {
                c8A c8a = (c8A) this.R;
                c8a.f1974R = c8a.R();
                ((c8A) this.R).f1973R.m();
                ((c8A) this.R).f1973R.showContextMenu();
            }
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        ClipboardManager clipboardManager = (ClipboardManager) ((c8A) this.R).f1973R.getContext().getSystemService("clipboard");
        boolean z = false;
        menu.add(0, 1, 0, R.string.copy_text).setShowAsAction(5);
        MenuItem add = menu.add(0, 2, 0, R.string.paste_text);
        if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            z = true;
        }
        add.setEnabled(z).setShowAsAction(5);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }
}
