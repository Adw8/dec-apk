package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: dES  reason: default package */
/* loaded from: classes.dex */
public class dES extends Dd implements Menu {
    public final p1a R;

    public dES(Context context, p1a p1a) {
        super(context);
        if (p1a != null) {
            this.R = p1a;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return j(((lRG) this.R).R(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = ((lRG) this.R).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = j(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return ((lRG) this.R).addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        cE0 ce0 = (cE0) this.v;
        if (ce0 != null) {
            ce0.clear();
        }
        cE0 ce02 = (cE0) this.c;
        if (ce02 != null) {
            ce02.clear();
        }
        ((lRG) this.R).clear();
    }

    @Override // android.view.Menu
    public final void close() {
        ((lRG) this.R).c(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return j(((lRG) this.R).findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return j(((lRG) this.R).getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return ((lRG) this.R).hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((lRG) this.R).isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return ((lRG) this.R).performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((lRG) this.R).performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((cE0) this.v) != null) {
            int i2 = 0;
            while (true) {
                cE0 ce0 = (cE0) this.v;
                if (i2 >= ce0.e) {
                    break;
                }
                if (((irv) ce0.Z(i2)).getGroupId() == i) {
                    ((cE0) this.v).m(i2);
                    i2--;
                }
                i2++;
            }
        }
        ((lRG) this.R).removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((cE0) this.v) != null) {
            int i2 = 0;
            while (true) {
                cE0 ce0 = (cE0) this.v;
                if (i2 >= ce0.e) {
                    break;
                } else if (((irv) ce0.Z(i2)).getItemId() == i) {
                    ((cE0) this.v).m(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        ((lRG) this.R).removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ((lRG) this.R).setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ((lRG) this.R).setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ((lRG) this.R).setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.R.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return ((lRG) this.R).size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return ((lRG) this.R).addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return j(((lRG) this.R).add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return ((lRG) this.R).addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return j(((lRG) this.R).R(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return ((lRG) this.R).addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return j(((lRG) this.R).add(i, i2, i3, i4));
    }
}
