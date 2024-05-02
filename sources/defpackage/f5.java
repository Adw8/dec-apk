package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: f5  reason: default package */
/* loaded from: classes.dex */
public final class f5 extends fkQ implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public int H;
    public final int O;

    /* renamed from: O  reason: collision with other field name */
    public boolean f3287O;

    /* renamed from: R  reason: collision with other field name */
    public final Context f3289R;

    /* renamed from: R  reason: collision with other field name */
    public final Handler f3290R;

    /* renamed from: R  reason: collision with other field name */
    public View f3291R;

    /* renamed from: R  reason: collision with other field name */
    public ViewTreeObserver f3292R;

    /* renamed from: R  reason: collision with other field name */
    public PopupWindow.OnDismissListener f3293R;

    /* renamed from: R  reason: collision with other field name */
    public ovy f3296R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f3297R;
    public final int X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f3298X;
    public boolean c;
    public final int e;
    public int m;
    public View v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f3301v;
    public int x;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f3295R = new ArrayList();

    /* renamed from: v  reason: collision with other field name */
    public final ArrayList f3300v = new ArrayList();
    public final Cx R = new Cx(0, this);

    /* renamed from: R  reason: collision with other field name */
    public final V1 f3288R = new V1(0, this);

    /* renamed from: R  reason: collision with other field name */
    public final h89 f3294R = new h89(1, this);
    public int L = 0;
    public int Z = 0;

    /* renamed from: e  reason: collision with other field name */
    public boolean f3299e = false;

    public f5(Context context, View view, int i, int i2, boolean z) {
        int i3 = 0;
        this.f3289R = context;
        this.f3291R = view;
        this.X = i;
        this.O = i2;
        this.f3297R = z;
        WeakHashMap weakHashMap = of5.f6887R;
        this.m = eHQ.e(view) != 1 ? 1 : i3;
        Resources resources = context.getResources();
        this.e = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3290R = new Handler();
    }

    @Override // defpackage.lF5
    public final boolean H(go1 go1) {
        Iterator it = this.f3300v.iterator();
        while (it.hasNext()) {
            g2 g2Var = (g2) it.next();
            if (go1 == g2Var.f3654R) {
                ((olv) g2Var.f3655R).f6917R.requestFocus();
                return true;
            }
        }
        if (!go1.hasVisibleItems()) {
            return false;
        }
        U(go1);
        ovy ovy = this.f3296R;
        if (ovy != null) {
            ovy.e(go1);
        }
        return true;
    }

    @Override // defpackage.lF5
    public final void L(ovy ovy) {
        this.f3296R = ovy;
    }

    @Override // defpackage.fkQ
    public final void N(View view) {
        if (this.f3291R != view) {
            this.f3291R = view;
            int i = this.L;
            WeakHashMap weakHashMap = of5.f6887R;
            this.Z = Gravity.getAbsoluteGravity(i, eHQ.e(view));
        }
    }

    @Override // defpackage.fkQ
    public final void P(boolean z) {
        this.f3299e = z;
    }

    @Override // defpackage.lF5
    public final void R(lRG lrg, boolean z) {
        int size = this.f3300v.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (lrg == ((g2) this.f3300v.get(i)).f3654R) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.f3300v.size()) {
                ((g2) this.f3300v.get(i2)).f3654R.c(false);
            }
            g2 g2Var = (g2) this.f3300v.remove(i);
            g2Var.f3654R.y(this);
            if (this.f3287O) {
                pks.v(((olv) g2Var.f3655R).R, null);
                ((olv) g2Var.f3655R).R.setAnimationStyle(0);
            }
            g2Var.f3655R.dismiss();
            int size2 = this.f3300v.size();
            if (size2 > 0) {
                this.m = ((g2) this.f3300v.get(size2 - 1)).R;
            } else {
                View view = this.f3291R;
                WeakHashMap weakHashMap = of5.f6887R;
                this.m = eHQ.e(view) == 1 ? 0 : 1;
            }
            if (size2 == 0) {
                dismiss();
                ovy ovy = this.f3296R;
                if (ovy != null) {
                    ovy.R(lrg, true);
                }
                ViewTreeObserver viewTreeObserver = this.f3292R;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f3292R.removeGlobalOnLayoutListener(this.R);
                    }
                    this.f3292R = null;
                }
                this.v.removeOnAttachStateChangeListener(this.f3288R);
                this.f3293R.onDismiss();
            } else if (z) {
                ((g2) this.f3300v.get(0)).f3654R.c(false);
            }
        }
    }

    @Override // defpackage.fkQ
    public final void U(lRG lrg) {
        lrg.v(this, this.f3289R);
        if (v()) {
            o(lrg);
        } else {
            this.f3295R.add(lrg);
        }
    }

    @Override // defpackage.gt5
    public final void Z() {
        if (!v()) {
            Iterator it = this.f3295R.iterator();
            while (it.hasNext()) {
                o((lRG) it.next());
            }
            this.f3295R.clear();
            View view = this.f3291R;
            this.v = view;
            if (view != null) {
                boolean z = this.f3292R == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f3292R = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.R);
                }
                this.v.addOnAttachStateChangeListener(this.f3288R);
            }
        }
    }

    @Override // defpackage.lF5
    public final boolean c() {
        return false;
    }

    @Override // defpackage.gt5
    public final void dismiss() {
        int size = this.f3300v.size();
        if (size > 0) {
            g2[] g2VarArr = (g2[]) this.f3300v.toArray(new g2[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    g2 g2Var = g2VarArr[size];
                    if (g2Var.f3655R.v()) {
                        g2Var.f3655R.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.gt5
    public final aYp e() {
        if (this.f3300v.isEmpty()) {
            return null;
        }
        ArrayList arrayList = this.f3300v;
        return ((olv) ((g2) arrayList.get(arrayList.size() - 1)).f3655R).f6917R;
    }

    @Override // defpackage.fkQ
    public final void g(int i) {
        this.f3301v = true;
        this.x = i;
    }

    @Override // defpackage.fkQ
    public final void i(int i) {
        this.c = true;
        this.H = i;
    }

    @Override // defpackage.fkQ
    public final void j(int i) {
        if (this.L != i) {
            this.L = i;
            View view = this.f3291R;
            WeakHashMap weakHashMap = of5.f6887R;
            this.Z = Gravity.getAbsoluteGravity(i, eHQ.e(view));
        }
    }

    @Override // defpackage.lF5
    public final void m() {
        Iterator it = this.f3300v.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((olv) ((g2) it.next()).f3655R).f6917R.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((jMp) adapter).notifyDataSetChanged();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012b, code lost:
        if (((r8.getWidth() + r10[0]) + r4) > r11.right) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0131, code lost:
        if ((r10[0] - r4) < 0) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0133, code lost:
        r8 = 1;
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0136, code lost:
        r11 = 0;
        r8 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(defpackage.lRG r17) {
        /*
        // Method dump skipped, instructions count: 449
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f5.o(lRG):void");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        g2 g2Var;
        int size = this.f3300v.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                g2Var = null;
                break;
            }
            g2Var = (g2) this.f3300v.get(i);
            if (!g2Var.f3655R.v()) {
                break;
            }
            i++;
        }
        if (g2Var != null) {
            g2Var.f3654R.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.fkQ
    public final void t(boolean z) {
        this.f3298X = z;
    }

    @Override // defpackage.gt5
    public final boolean v() {
        return this.f3300v.size() > 0 && ((g2) this.f3300v.get(0)).f3655R.v();
    }

    @Override // defpackage.fkQ
    public final void y(PopupWindow.OnDismissListener onDismissListener) {
        this.f3293R = onDismissListener;
    }
}
