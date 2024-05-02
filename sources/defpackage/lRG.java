package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: lRG  reason: default package */
/* loaded from: classes.dex */
public class lRG implements p1a {
    public static final int[] R = {1, 4, 5, 3, 2, 0};

    /* renamed from: R  reason: collision with other field name */
    public final Context f5727R;

    /* renamed from: R  reason: collision with other field name */
    public final Resources f5728R;

    /* renamed from: R  reason: collision with other field name */
    public Drawable f5729R;

    /* renamed from: R  reason: collision with other field name */
    public View f5730R;

    /* renamed from: R  reason: collision with other field name */
    public foC f5731R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f5732R;

    /* renamed from: R  reason: collision with other field name */
    public pce f5735R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5736R;

    /* renamed from: v  reason: collision with other field name */
    public boolean f5740v;
    public boolean x;

    /* renamed from: R  reason: collision with other field name */
    public int f5726R = 0;

    /* renamed from: X  reason: collision with other field name */
    public boolean f5737X = false;
    public boolean O = false;
    public boolean L = false;
    public boolean Z = false;
    public ArrayList X = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public CopyOnWriteArrayList f5734R = new CopyOnWriteArrayList();
    public boolean m = false;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f5733R = new ArrayList();
    public ArrayList v = new ArrayList();

    /* renamed from: c  reason: collision with other field name */
    public boolean f5738c = true;
    public ArrayList c = new ArrayList();
    public ArrayList e = new ArrayList();

    /* renamed from: e  reason: collision with other field name */
    public boolean f5739e = true;

    public lRG(Context context) {
        boolean z = false;
        this.f5727R = context;
        Resources resources = context.getResources();
        this.f5728R = resources;
        if (resources.getConfiguration().keyboard != 1 && pqq.v(ViewConfiguration.get(context))) {
            z = true;
        }
        this.f5740v = z;
    }

    public boolean C() {
        return this.m;
    }

    public lRG H() {
        return this;
    }

    public final void K() {
        if (!this.f5737X) {
            this.f5737X = true;
            this.O = false;
            this.L = false;
        }
    }

    public final pce L(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.X;
        arrayList.clear();
        Z(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (pce) arrayList.get(0);
        }
        boolean N = N();
        for (int i2 = 0; i2 < size; i2++) {
            pce pce = (pce) arrayList.get(i2);
            char c = N ? pce.v : pce.R;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (N && c == '\b' && i == 67))) {
                return pce;
            }
        }
        return null;
    }

    public boolean N() {
        return this.f5736R;
    }

    public boolean O(pce pce) {
        boolean z = false;
        if (this.f5734R.isEmpty()) {
            return false;
        }
        K();
        Iterator it = this.f5734R.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            lF5 lf5 = (lF5) weakReference.get();
            if (lf5 == null) {
                this.f5734R.remove(weakReference);
            } else {
                z = lf5.x(pce);
                if (z) {
                    break;
                }
            }
        }
        o();
        if (z) {
            this.f5735R = pce;
        }
        return z;
    }

    public boolean P() {
        return this.f5740v;
    }

    public final pce R(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = (-65536 & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = R;
            if (i5 < 6) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                pce pce = new pce(this, i, i2, i3, i6, charSequence, this.f5726R);
                ArrayList arrayList = this.f5733R;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (((pce) arrayList.get(size)).e <= i6) {
                            i4 = size + 1;
                            break;
                        }
                    } else {
                        i4 = 0;
                        break;
                    }
                }
                arrayList.add(i4, pce);
                j(true);
                return pce;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public final ArrayList U() {
        if (!this.f5738c) {
            return this.v;
        }
        this.v.clear();
        int size = this.f5733R.size();
        for (int i = 0; i < size; i++) {
            pce pce = (pce) this.f5733R.get(i);
            if (pce.isVisible()) {
                this.v.add(pce);
            }
        }
        this.f5738c = false;
        this.f5739e = true;
        return this.v;
    }

    public final void V(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f5728R;
        if (view != null) {
            this.f5730R = view;
            this.f5732R = null;
            this.f5729R = null;
        } else {
            if (i > 0) {
                this.f5732R = resources.getText(i);
            } else if (charSequence != null) {
                this.f5732R = charSequence;
            }
            if (i2 > 0) {
                Context context = this.f5727R;
                Object obj = C1.R;
                this.f5729R = eNe.v(context, i2);
            } else if (drawable != null) {
                this.f5729R = drawable;
            }
            this.f5730R = null;
        }
        j(false);
    }

    public boolean X(lRG lrg, MenuItem menuItem) {
        foC foc = this.f5731R;
        return foc != null && foc.R(lrg, menuItem);
    }

    public final void Z(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean N = N();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f5733R.size();
            for (int i2 = 0; i2 < size; i2++) {
                pce pce = (pce) this.f5733R.get(i2);
                if (pce.hasSubMenu()) {
                    pce.f7115R.Z(arrayList, i, keyEvent);
                }
                char c = N ? pce.v : pce.R;
                if (((modifiers & 69647) == ((N ? pce.O : pce.X) & 69647)) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (N && c == '\b' && i == 67)) && pce.isEnabled()) {
                        arrayList.add(pce);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return R(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f5727R.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            pce R2 = R(i, i2, i3, resolveInfo.loadLabel(packageManager));
            R2.setIcon(resolveInfo.loadIcon(packageManager));
            R2.f7107R = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = R2;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void c(boolean z) {
        if (!this.Z) {
            this.Z = true;
            Iterator it = this.f5734R.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                lF5 lf5 = (lF5) weakReference.get();
                if (lf5 == null) {
                    this.f5734R.remove(weakReference);
                } else {
                    lf5.R(this, z);
                }
            }
            this.Z = false;
        }
    }

    @Override // android.view.Menu
    public final void clear() {
        pce pce = this.f5735R;
        if (pce != null) {
            e(pce);
        }
        this.f5733R.clear();
        j(true);
    }

    public final void clearHeader() {
        this.f5729R = null;
        this.f5732R = null;
        this.f5730R = null;
        j(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean e(pce pce) {
        boolean z = false;
        if (!this.f5734R.isEmpty() && this.f5735R == pce) {
            K();
            Iterator it = this.f5734R.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                lF5 lf5 = (lF5) weakReference.get();
                if (lf5 == null) {
                    this.f5734R.remove(weakReference);
                } else {
                    z = lf5.X(pce);
                    if (z) {
                        break;
                    }
                }
            }
            o();
            if (z) {
                this.f5735R = null;
            }
        }
        return z;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            pce pce = (pce) this.f5733R.get(i2);
            if (pce.f7106R == i) {
                return pce;
            }
            if (pce.hasSubMenu() && (findItem = pce.f7115R.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(android.view.MenuItem r7, defpackage.lF5 r8, int r9) {
        /*
            r6 = this;
            pce r7 = (defpackage.pce) r7
            r0 = 0
            if (r7 == 0) goto L_0x00dd
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00dd
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f7112R
            r2 = 1
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x0019
            goto L_0x0042
        L_0x0019:
            lRG r1 = r7.f7117R
            boolean r1 = r1.X(r1, r7)
            if (r1 == 0) goto L_0x0022
            goto L_0x0042
        L_0x0022:
            android.content.Intent r1 = r7.f7107R
            if (r1 == 0) goto L_0x0036
            lRG r3 = r7.f7117R     // Catch: ActivityNotFoundException -> 0x002e
            android.content.Context r3 = r3.f5727R     // Catch: ActivityNotFoundException -> 0x002e
            r3.startActivity(r1)     // Catch: ActivityNotFoundException -> 0x002e
            goto L_0x0042
        L_0x002e:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L_0x0036:
            c5B r1 = r7.f7114R
            if (r1 == 0) goto L_0x0044
            android.view.ActionProvider r1 = r1.R
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L_0x0044
        L_0x0042:
            r1 = r2
            goto L_0x0045
        L_0x0044:
            r1 = r0
        L_0x0045:
            c5B r3 = r7.f7114R
            if (r3 == 0) goto L_0x0053
            android.view.ActionProvider r4 = r3.R
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L_0x0053
            r4 = r2
            goto L_0x0054
        L_0x0053:
            r4 = r0
        L_0x0054:
            boolean r5 = r7.L()
            if (r5 == 0) goto L_0x0066
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00dc
            r6.c(r2)
            goto L_0x00dc
        L_0x0066:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x0077
            if (r4 == 0) goto L_0x006f
            goto L_0x0077
        L_0x006f:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00dc
            r6.c(r2)
            goto L_0x00dc
        L_0x0077:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x007e
            r6.c(r0)
        L_0x007e:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0092
            go1 r9 = new go1
            android.content.Context r5 = r6.f5727R
            r9.<init>(r5, r6, r7)
            r7.f7115R = r9
            java.lang.CharSequence r5 = r7.f7116R
            r9.setHeaderTitle(r5)
        L_0x0092:
            go1 r7 = r7.f7115R
            if (r4 == 0) goto L_0x00a0
            android.view.ActionProvider r9 = r3.R
            o5B r3 = r3.f1961R
            r3.getClass()
            r9.onPrepareSubMenu(r7)
        L_0x00a0:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f5734R
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x00a9
            goto L_0x00d6
        L_0x00a9:
            if (r8 == 0) goto L_0x00af
            boolean r0 = r8.H(r7)
        L_0x00af:
            java.util.concurrent.CopyOnWriteArrayList r8 = r6.f5734R
            java.util.Iterator r8 = r8.iterator()
        L_0x00b5:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00d6
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            lF5 r3 = (defpackage.lF5) r3
            if (r3 != 0) goto L_0x00cf
            java.util.concurrent.CopyOnWriteArrayList r3 = r6.f5734R
            r3.remove(r9)
            goto L_0x00b5
        L_0x00cf:
            if (r0 != 0) goto L_0x00b5
            boolean r0 = r3.H(r7)
            goto L_0x00b5
        L_0x00d6:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00dc
            r6.c(r2)
        L_0x00dc:
            return r1
        L_0x00dd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lRG.g(android.view.MenuItem, lF5, int):boolean");
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f5733R.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((pce) this.f5733R.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((go1) item.getSubMenu()).i(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(x(), sparseArray);
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return L(i, keyEvent) != null;
    }

    public final void j(boolean z) {
        if (!this.f5737X) {
            if (z) {
                this.f5738c = true;
                this.f5739e = true;
            }
            if (!this.f5734R.isEmpty()) {
                K();
                Iterator it = this.f5734R.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    lF5 lf5 = (lF5) weakReference.get();
                    if (lf5 == null) {
                        this.f5734R.remove(weakReference);
                    } else {
                        lf5.m();
                    }
                }
                o();
                return;
            }
            return;
        }
        this.O = true;
        if (z) {
            this.L = true;
        }
    }

    public final void m() {
        ArrayList U = U();
        if (this.f5739e) {
            Iterator it = this.f5734R.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                lF5 lf5 = (lF5) weakReference.get();
                if (lf5 == null) {
                    this.f5734R.remove(weakReference);
                } else {
                    z |= lf5.c();
                }
            }
            if (z) {
                this.c.clear();
                this.e.clear();
                int size = U.size();
                for (int i = 0; i < size; i++) {
                    pce pce = (pce) U.get(i);
                    if (pce.Z()) {
                        this.c.add(pce);
                    } else {
                        this.e.add(pce);
                    }
                }
            } else {
                this.c.clear();
                this.e.clear();
                this.e.addAll(U());
            }
            this.f5739e = false;
        }
    }

    public final void o() {
        this.f5737X = false;
        if (this.O) {
            this.O = false;
            j(this.L);
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return g(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        pce L = L(i, keyEvent);
        boolean g = L != null ? g(L, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return g;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((pce) this.f5733R.get(i3)).f7123v == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = this.f5733R.size() - i3;
            while (true) {
                i2++;
                if (i2 >= size2 || ((pce) this.f5733R.get(i3)).f7123v != i) {
                    break;
                } else if (i3 >= 0 && i3 < this.f5733R.size()) {
                    this.f5733R.remove(i3);
                }
            }
            j(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((pce) this.f5733R.get(i2)).f7106R == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0 && i2 < this.f5733R.size()) {
            this.f5733R.remove(i2);
            j(true);
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f5733R.size();
        for (int i2 = 0; i2 < size; i2++) {
            pce pce = (pce) this.f5733R.get(i2);
            if (pce.f7123v == i) {
                pce.Z = (pce.Z & -5) | (z2 ? 4 : 0);
                pce.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.m = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        int size = this.f5733R.size();
        for (int i2 = 0; i2 < size; i2++) {
            pce pce = (pce) this.f5733R.get(i2);
            if (pce.f7123v == i) {
                pce.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        int size = this.f5733R.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            pce pce = (pce) this.f5733R.get(i2);
            if (pce.f7123v == i) {
                int i3 = pce.Z;
                int i4 = (i3 & -9) | (z ? 0 : 8);
                pce.Z = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            j(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f5736R = z;
        j(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f5733R.size();
    }

    public final void t(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(x());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((go1) item.getSubMenu()).t(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public final void v(lF5 lf5, Context context) {
        this.f5734R.add(new WeakReference(lf5));
        lf5.O(context, this);
        this.f5739e = true;
    }

    public String x() {
        return "android:menu:actionviewstates";
    }

    public final void y(lF5 lf5) {
        Iterator it = this.f5734R.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            lF5 lf52 = (lF5) weakReference.get();
            if (lf52 == null || lf52 == lf5) {
                this.f5734R.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return R(0, 0, 0, this.f5728R.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f5728R.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return R(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        pce R2 = R(i, i2, i3, charSequence);
        go1 go1 = new go1(this.f5727R, this, R2);
        R2.f7115R = go1;
        go1.setHeaderTitle(R2.f7116R);
        return go1;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return R(i, i2, i3, this.f5728R.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f5728R.getString(i4));
    }
}
