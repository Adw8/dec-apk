package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;

/* renamed from: RR  reason: default package */
/* loaded from: classes.dex */
public final class RR implements lF5 {
    public int L;
    public int O;
    public JJ R;

    /* renamed from: R  reason: collision with other field name */
    public Ni f481R;

    /* renamed from: R  reason: collision with other field name */
    public Context f482R;

    /* renamed from: R  reason: collision with other field name */
    public Drawable f483R;

    /* renamed from: R  reason: collision with other field name */
    public LayoutInflater f485R;

    /* renamed from: R  reason: collision with other field name */
    public bx f486R;

    /* renamed from: R  reason: collision with other field name */
    public ehR f487R;

    /* renamed from: R  reason: collision with other field name */
    public lRG f489R;

    /* renamed from: R  reason: collision with other field name */
    public m8 f490R;

    /* renamed from: R  reason: collision with other field name */
    public ovy f491R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f492R;
    public int Z;
    public boolean c;

    /* renamed from: e  reason: collision with other field name */
    public boolean f493e;
    public Ni v;

    /* renamed from: v  reason: collision with other field name */
    public Context f494v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f495v;
    public int e = R.layout.abc_action_menu_layout;
    public int X = R.layout.abc_action_menu_item_layout;

    /* renamed from: R  reason: collision with other field name */
    public final SparseBooleanArray f484R = new SparseBooleanArray();

    /* renamed from: R  reason: collision with other field name */
    public final h89 f488R = new h89(2, this);

    public RR(Context context) {
        this.f482R = context;
        this.f485R = LayoutInflater.from(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    @Override // defpackage.lF5
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean H(defpackage.go1 r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r9
        L_0x0009:
            lRG r2 = r0.R
            lRG r3 = r8.f489R
            if (r2 == r3) goto L_0x0013
            r0 = r2
            go1 r0 = (defpackage.go1) r0
            goto L_0x0009
        L_0x0013:
            pce r0 = r0.v
            ehR r2 = r8.f487R
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 0
            if (r2 != 0) goto L_0x001d
            goto L_0x003a
        L_0x001d:
            int r4 = r2.getChildCount()
            r5 = r1
        L_0x0022:
            if (r5 >= r4) goto L_0x003a
            android.view.View r6 = r2.getChildAt(r5)
            boolean r7 = r6 instanceof defpackage.jd5
            if (r7 == 0) goto L_0x0037
            r7 = r6
            jd5 r7 = (defpackage.jd5) r7
            pce r7 = r7.getItemData()
            if (r7 != r0) goto L_0x0037
            r3 = r6
            goto L_0x003a
        L_0x0037:
            int r5 = r5 + 1
            goto L_0x0022
        L_0x003a:
            if (r3 != 0) goto L_0x003d
            return r1
        L_0x003d:
            pce r0 = r9.v
            r0.getClass()
            int r0 = r9.size()
            r2 = r1
        L_0x0047:
            r4 = 1
            if (r2 >= r0) goto L_0x005f
            android.view.MenuItem r5 = r9.getItem(r2)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L_0x005c
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L_0x005c
            r0 = r4
            goto L_0x0060
        L_0x005c:
            int r2 = r2 + 1
            goto L_0x0047
        L_0x005f:
            r0 = r1
        L_0x0060:
            Ni r2 = new Ni
            android.content.Context r5 = r8.f494v
            r2.<init>(r8, r5, r9, r3)
            r8.v = r2
            r2.f4073v = r0
            fkQ r2 = r2.f4068R
            if (r2 == 0) goto L_0x0072
            r2.P(r0)
        L_0x0072:
            Ni r0 = r8.v
            boolean r2 = r0.v()
            if (r2 == 0) goto L_0x007c
        L_0x007a:
            r1 = r4
            goto L_0x0085
        L_0x007c:
            android.view.View r2 = r0.f4066R
            if (r2 != 0) goto L_0x0081
            goto L_0x0085
        L_0x0081:
            r0.e(r1, r1, r1, r1)
            goto L_0x007a
        L_0x0085:
            if (r1 == 0) goto L_0x008f
            ovy r8 = r8.f491R
            if (r8 == 0) goto L_0x008e
            r8.e(r9)
        L_0x008e:
            return r4
        L_0x008f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "MenuPopupHelper cannot be used without an anchor"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RR.H(go1):boolean");
    }

    @Override // defpackage.lF5
    public final void L(ovy ovy) {
        this.f491R = ovy;
    }

    @Override // defpackage.lF5
    public final void O(Context context, lRG lrg) {
        this.f494v = context;
        LayoutInflater.from(context);
        this.f489R = lrg;
        Resources resources = context.getResources();
        gL6 gl6 = new gL6(1, context);
        if (!this.c) {
            this.f495v = true;
        }
        this.O = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.Z = gl6.C();
        int i = this.O;
        if (this.f495v) {
            if (this.R == null) {
                JJ jj = new JJ(this, this.f482R);
                this.R = jj;
                if (this.f492R) {
                    jj.setImageDrawable(this.f483R);
                    this.f483R = null;
                    this.f492R = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.R.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.R.getMeasuredWidth();
        } else {
            this.R = null;
        }
        this.L = i;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.lF5
    public final void R(lRG lrg, boolean z) {
        e();
        Ni ni = this.v;
        if (ni != null && ni.v()) {
            ((h6s) ni).f4068R.dismiss();
        }
        ovy ovy = this.f491R;
        if (ovy != null) {
            ovy.R(lrg, z);
        }
    }

    public final boolean U() {
        lRG lrg;
        if (this.f495v && !Z() && (lrg = this.f489R) != null && this.f487R != null && this.f486R == null) {
            lrg.m();
            if (!lrg.e.isEmpty()) {
                bx bxVar = new bx(this, 0, new Ni(this, this.f494v, this.f489R, this.R));
                this.f486R = bxVar;
                ((View) this.f487R).post(bxVar);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lF5
    public final /* bridge */ /* synthetic */ boolean X(pce pce) {
        return false;
    }

    public final boolean Z() {
        Ni ni = this.f481R;
        return ni != null && ni.v();
    }

    @Override // defpackage.lF5
    public final boolean c() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        lRG lrg = this.f489R;
        if (lrg != null) {
            arrayList = lrg.U();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.Z;
        int i4 = this.L;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f487R;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            pce pce = (pce) arrayList.get(i5);
            int i8 = pce.m;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (this.f493e && pce.f7122e) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f495v && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f484R;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            pce pce2 = (pce) arrayList.get(i10);
            int i12 = pce2.m;
            if ((i12 & 2) == i2 ? z : false) {
                View v = v(pce2, null, viewGroup);
                v.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = v.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                int i13 = pce2.f7123v;
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                pce2.m(z);
            } else if ((i12 & 1) == z ? z : false) {
                int i14 = pce2.f7123v;
                boolean z3 = sparseBooleanArray.get(i14);
                boolean z4 = ((i9 > 0 || z3) && i4 > 0) ? z : false;
                if (z4) {
                    View v2 = v(pce2, null, viewGroup);
                    v2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = v2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z4 &= i4 + i11 > 0;
                }
                if (z4 && i14 != 0) {
                    sparseBooleanArray.put(i14, true);
                } else if (z3) {
                    sparseBooleanArray.put(i14, false);
                    for (int i15 = 0; i15 < i10; i15++) {
                        pce pce3 = (pce) arrayList.get(i15);
                        if (pce3.f7123v == i14) {
                            if (pce3.Z()) {
                                i9++;
                            }
                            pce3.m(false);
                        }
                    }
                }
                if (z4) {
                    i9--;
                }
                pce2.m(z4);
            } else {
                pce2.m(false);
                i10++;
                i2 = 2;
                z = true;
            }
            i10++;
            i2 = 2;
            z = true;
        }
        return z;
    }

    public final boolean e() {
        ehR ehr;
        bx bxVar = this.f486R;
        if (bxVar == null || (ehr = this.f487R) == null) {
            Ni ni = this.f481R;
            if (ni == null) {
                return false;
            }
            if (ni.v()) {
                ((h6s) ni).f4068R.dismiss();
            }
            return true;
        }
        ((View) ehr).removeCallbacks(bxVar);
        this.f486R = null;
        return true;
    }

    @Override // defpackage.lF5
    public final void m() {
        ehR ehr;
        int i;
        boolean z;
        ViewGroup viewGroup = (ViewGroup) this.f487R;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            lRG lrg = this.f489R;
            if (lrg != null) {
                lrg.m();
                ArrayList U = this.f489R.U();
                int size = U.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    pce pce = (pce) U.get(i2);
                    if (pce.Z()) {
                        View childAt = viewGroup.getChildAt(i);
                        pce itemData = childAt instanceof jd5 ? ((jd5) childAt).getItemData() : null;
                        View v = v(pce, childAt, viewGroup);
                        if (pce != itemData) {
                            v.setPressed(false);
                            v.jumpDrawablesToCurrentState();
                        }
                        if (v != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) v.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(v);
                            }
                            ((ViewGroup) this.f487R).addView(v, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.R) {
                    z = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z = true;
                }
                if (!z) {
                    i++;
                }
            }
        }
        ((View) this.f487R).requestLayout();
        lRG lrg2 = this.f489R;
        if (lrg2 != null) {
            lrg2.m();
            ArrayList arrayList2 = lrg2.c;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                c5B c5b = ((pce) arrayList2.get(i3)).f7114R;
            }
        }
        lRG lrg3 = this.f489R;
        if (lrg3 != null) {
            lrg3.m();
            arrayList = lrg3.e;
        }
        if (this.f495v && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((pce) arrayList.get(0)).f7122e;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.R == null) {
                this.R = new JJ(this, this.f482R);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.R.getParent();
            if (viewGroup3 != this.f487R) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.R);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f487R;
                JJ jj = this.R;
                actionMenuView.getClass();
                UV uv = new UV();
                ((LinearLayout.LayoutParams) uv).gravity = 16;
                uv.f563R = true;
                actionMenuView.addView(jj, uv);
            }
        } else {
            JJ jj2 = this.R;
            if (jj2 != null && jj2.getParent() == (ehr = this.f487R)) {
                ((ViewGroup) ehr).removeView(this.R);
            }
        }
        ((ActionMenuView) this.f487R).setOverflowReserved(this.f495v);
    }

    public final View v(pce pce, View view, ViewGroup viewGroup) {
        View actionView = pce.getActionView();
        int i = 0;
        if (actionView == null || pce.L()) {
            jd5 jd5 = view instanceof jd5 ? (jd5) view : (jd5) this.f485R.inflate(this.X, viewGroup, false);
            jd5.c(pce);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) jd5;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f487R);
            if (this.f490R == null) {
                this.f490R = new m8(this);
            }
            actionMenuItemView.setPopupCallback(this.f490R);
            actionView = (View) jd5;
        }
        if (pce.f7122e) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.x(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.lF5
    public final /* bridge */ /* synthetic */ boolean x(pce pce) {
        return false;
    }
}
