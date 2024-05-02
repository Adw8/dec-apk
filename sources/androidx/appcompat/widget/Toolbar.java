package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements eI3 {
    public int C;
    public int H;
    public int L;
    public int N;
    public int O;
    public int P;
    public final CV R;

    /* renamed from: R  reason: collision with other field name */
    public RR f1157R;

    /* renamed from: R  reason: collision with other field name */
    public TC f1158R;

    /* renamed from: R  reason: collision with other field name */
    public Context f1159R;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f1160R;

    /* renamed from: R  reason: collision with other field name */
    public Drawable f1161R;

    /* renamed from: R  reason: collision with other field name */
    public View f1162R;

    /* renamed from: R  reason: collision with other field name */
    public ActionMenuView f1163R;

    /* renamed from: R  reason: collision with other field name */
    public AppCompatImageView f1164R;

    /* renamed from: R  reason: collision with other field name */
    public eQ f1165R;

    /* renamed from: R  reason: collision with other field name */
    public final h89 f1166R;

    /* renamed from: R  reason: collision with other field name */
    public hLU f1167R;

    /* renamed from: R  reason: collision with other field name */
    public hz9 f1168R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f1169R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f1170R;

    /* renamed from: R  reason: collision with other field name */
    public final k0f f1171R;

    /* renamed from: R  reason: collision with other field name */
    public muY f1172R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1173R;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f1174R;
    public int U;
    public int X;
    public int Z;
    public CharSequence c;

    /* renamed from: c  reason: collision with other field name */
    public ArrayList f1175c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f1176c;
    public int e;
    public int m;
    public TC v;

    /* renamed from: v  reason: collision with other field name */
    public ColorStateList f1177v;

    /* renamed from: v  reason: collision with other field name */
    public eQ f1178v;

    /* renamed from: v  reason: collision with other field name */
    public CharSequence f1179v;

    /* renamed from: v  reason: collision with other field name */
    public final ArrayList f1180v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f1181v;
    public int x;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static fCm L(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof fCm ? new fCm((fCm) layoutParams) : layoutParams instanceof H2 ? new fCm((H2) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new fCm((ViewGroup.MarginLayoutParams) layoutParams) : new fCm(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new kpW(getContext());
    }

    public static int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return j2q.v(marginLayoutParams) + j2q.c(marginLayoutParams);
    }

    public static int x(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int C(View view, int i, int i2, int[] iArr) {
        fCm fcm = (fCm) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) fcm).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int Z = Z(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, Z, max + measuredWidth, view.getMeasuredHeight() + Z);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) fcm).rightMargin + max;
    }

    public final void H() {
        Iterator it = this.f1175c.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        CV cv = this.R;
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) cv.v).iterator();
        while (it2.hasNext()) {
            ((eI8) it2.next()).R.x();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1175c = currentMenuItems2;
        Iterator it3 = ((CopyOnWriteArrayList) this.R.v).iterator();
        while (it3.hasNext()) {
            ((eI8) it3.next()).R.t();
        }
    }

    public final int N(View view, int i, int i2, int[] iArr) {
        fCm fcm = (fCm) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) fcm).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int Z = Z(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, Z, max, view.getMeasuredHeight() + Z);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) fcm).leftMargin);
    }

    public final void O() {
        if (this.f1165R == null) {
            this.f1165R = new eQ(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            fCm fcm = new fCm();
            fcm.R = 8388611 | (this.L & 112);
            this.f1165R.setLayoutParams(fcm);
        }
    }

    public final int P(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void R(int i, ArrayList arrayList) {
        WeakHashMap weakHashMap = of5.f6887R;
        boolean z = eHQ.e(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, eHQ.e(this));
        arrayList.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                fCm fcm = (fCm) childAt.getLayoutParams();
                if (fcm.v == 0 && g(childAt)) {
                    int i3 = fcm.R;
                    WeakHashMap weakHashMap2 = of5.f6887R;
                    int e = eHQ.e(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, e) & 7;
                    if (!(absoluteGravity2 == 1 || absoluteGravity2 == 3 || absoluteGravity2 == 5)) {
                        absoluteGravity2 = e == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            fCm fcm2 = (fCm) childAt2.getLayoutParams();
            if (fcm2.v == 0 && g(childAt2)) {
                int i5 = fcm2.R;
                WeakHashMap weakHashMap3 = of5.f6887R;
                int e2 = eHQ.e(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, e2) & 7;
                if (!(absoluteGravity3 == 1 || absoluteGravity3 == 3 || absoluteGravity3 == 5)) {
                    absoluteGravity3 = e2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final boolean U(View view) {
        return view.getParent() == this || this.f1180v.contains(view);
    }

    public final void X() {
        if (this.f1163R == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1163R = actionMenuView;
            actionMenuView.setPopupTheme(this.e);
            this.f1163R.setOnMenuItemClickListener(this.f1166R);
            ActionMenuView actionMenuView2 = this.f1163R;
            actionMenuView2.f1089R = null;
            actionMenuView2.f1087R = null;
            fCm fcm = new fCm();
            fcm.R = 8388613 | (this.L & 112);
            this.f1163R.setLayoutParams(fcm);
            v(this.f1163R, false);
        }
    }

    public final int Z(View view, int i) {
        fCm fcm = (fCm) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = fcm.R & 112;
        if (!(i3 == 16 || i3 == 48 || i3 == 80)) {
            i3 = this.P & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fcm).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) fcm).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) fcm).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public final void c() {
        if (this.f1178v == null) {
            eQ eQVar = new eQ(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f1178v = eQVar;
            eQVar.setImageDrawable(this.f1161R);
            this.f1178v.setContentDescription(this.f1169R);
            fCm fcm = new fCm();
            fcm.R = 8388611 | (this.L & 112);
            fcm.v = 2;
            this.f1178v.setLayoutParams(fcm);
            this.f1178v.setOnClickListener(new pS(1, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof fCm);
    }

    public final void e() {
        X();
        ActionMenuView actionMenuView = this.f1163R;
        if (actionMenuView.f1088R == null) {
            lRG lrg = (lRG) actionMenuView.getMenu();
            if (this.f1167R == null) {
                this.f1167R = new hLU(this);
            }
            this.f1163R.setExpandedActionViewsExclusive(true);
            lrg.v(this.f1167R, this.f1159R);
        }
    }

    public final boolean g(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new fCm();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return L(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        eQ eQVar = this.f1178v;
        if (eQVar != null) {
            return eQVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        eQ eQVar = this.f1178v;
        if (eQVar != null) {
            return eQVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        hz9 hz9 = this.f1168R;
        if (hz9 != null) {
            return hz9.f4430R ? hz9.R : hz9.v;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.N;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        hz9 hz9 = this.f1168R;
        if (hz9 != null) {
            return hz9.R;
        }
        return 0;
    }

    public int getContentInsetRight() {
        hz9 hz9 = this.f1168R;
        if (hz9 != null) {
            return hz9.v;
        }
        return 0;
    }

    public int getContentInsetStart() {
        hz9 hz9 = this.f1168R;
        if (hz9 != null) {
            return hz9.f4430R ? hz9.v : hz9.R;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.C;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        lRG lrg;
        ActionMenuView actionMenuView = this.f1163R;
        return actionMenuView != null && (lrg = actionMenuView.f1088R) != null && lrg.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.N, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = of5.f6887R;
        return eHQ.e(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = of5.f6887R;
        return eHQ.e(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.C, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f1164R;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f1164R;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1163R.getMenu();
    }

    public View getNavButtonView() {
        return this.f1165R;
    }

    public CharSequence getNavigationContentDescription() {
        eQ eQVar = this.f1165R;
        if (eQVar != null) {
            return eQVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        eQ eQVar = this.f1165R;
        if (eQVar != null) {
            return eQVar.getDrawable();
        }
        return null;
    }

    public RR getOuterActionMenuPresenter() {
        return this.f1157R;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1163R.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1159R;
    }

    public int getPopupTheme() {
        return this.e;
    }

    public CharSequence getSubtitle() {
        return this.c;
    }

    public final TextView getSubtitleTextView() {
        return this.v;
    }

    public CharSequence getTitle() {
        return this.f1179v;
    }

    public int getTitleMarginBottom() {
        return this.U;
    }

    public int getTitleMarginEnd() {
        return this.x;
    }

    public int getTitleMarginStart() {
        return this.m;
    }

    public int getTitleMarginTop() {
        return this.H;
    }

    public final TextView getTitleTextView() {
        return this.f1158R;
    }

    public elR getWrapper() {
        if (this.f1172R == null) {
            this.f1172R = new muY(this);
        }
        return this.f1172R;
    }

    public final void j(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1171R);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1181v = false;
        }
        if (!this.f1181v) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1181v = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1181v = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0294 A[LOOP:0: B:101:0x0292->B:102:0x0294, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02b6 A[LOOP:1: B:104:0x02b4->B:105:0x02b6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02db A[LOOP:2: B:107:0x02d9->B:108:0x02db, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0330 A[LOOP:3: B:115:0x032e->B:116:0x0330, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
        /*
        // Method dump skipped, instructions count: 837
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0284  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 649
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof ebm)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ebm ebm = (ebm) parcelable;
        super.onRestoreInstanceState(((OG) ebm).f327R);
        ActionMenuView actionMenuView = this.f1163R;
        lRG lrg = actionMenuView != null ? actionMenuView.f1088R : null;
        int i = ebm.e;
        if (!(i == 0 || this.f1167R == null || lrg == null || (findItem = lrg.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (ebm.R) {
            removeCallbacks(this.f1171R);
            post(this.f1171R);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f1168R == null) {
            this.f1168R = new hz9();
        }
        hz9 hz9 = this.f1168R;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != hz9.f4430R) {
            hz9.f4430R = z;
            if (!hz9.f4431v) {
                hz9.R = hz9.X;
                hz9.v = hz9.O;
            } else if (z) {
                int i2 = hz9.e;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = hz9.X;
                }
                hz9.R = i2;
                int i3 = hz9.c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = hz9.O;
                }
                hz9.v = i3;
            } else {
                int i4 = hz9.c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = hz9.X;
                }
                hz9.R = i4;
                int i5 = hz9.e;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = hz9.O;
                }
                hz9.v = i5;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if ((r3 != null && r3.Z()) != false) goto L_0x002c;
     */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            ebm r0 = new ebm
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            hLU r1 = r3.f1167R
            if (r1 == 0) goto L_0x0015
            pce r1 = r1.f4214R
            if (r1 == 0) goto L_0x0015
            int r1 = r1.f7106R
            r0.e = r1
        L_0x0015:
            androidx.appcompat.widget.ActionMenuView r3 = r3.f1163R
            r1 = 1
            r2 = 0
            if (r3 == 0) goto L_0x002b
            RR r3 = r3.R
            if (r3 == 0) goto L_0x0027
            boolean r3 = r3.Z()
            if (r3 == 0) goto L_0x0027
            r3 = r1
            goto L_0x0028
        L_0x0027:
            r3 = r2
        L_0x0028:
            if (r3 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            r0.R = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onSaveInstanceState():android.os.Parcelable");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1173R = false;
        }
        if (!this.f1173R) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1173R = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1173R = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(aH9.p(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f1176c = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.N) {
            this.N = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.C) {
            this.C = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(aH9.p(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(aH9.p(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        O();
        this.f1165R.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(l2H l2h) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1163R.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.e != i) {
            this.e = i;
            if (i == 0) {
                this.f1159R = getContext();
            } else {
                this.f1159R = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.U = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.x = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.m = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.H = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void v(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        fCm fcm = layoutParams == null ? new fCm() : !checkLayoutParams(layoutParams) ? L(layoutParams) : (fCm) layoutParams;
        fcm.v = 1;
        if (!z || this.f1162R == null) {
            addView(view, fcm);
            return;
        }
        view.setLayoutParams(fcm);
        this.f1180v.add(view);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.P = 8388627;
        this.f1170R = new ArrayList();
        this.f1180v = new ArrayList();
        this.f1174R = new int[2];
        this.R = new CV(new mBn(3, this));
        this.f1175c = new ArrayList();
        this.f1166R = new h89(3, this);
        this.f1171R = new k0f(3, this);
        Context context2 = getContext();
        int[] iArr = iTI.Y;
        CV h = CV.h(context2, attributeSet, iArr, R.attr.toolbarStyle, 0);
        TypedArray typedArray = (TypedArray) h.v;
        WeakHashMap weakHashMap = of5.f6887R;
        hpL.c(this, context, iArr, attributeSet, typedArray, R.attr.toolbarStyle, 0);
        this.X = h.y(28, 0);
        this.O = h.y(19, 0);
        this.P = ((TypedArray) h.v).getInteger(0, this.P);
        this.L = ((TypedArray) h.v).getInteger(2, 48);
        int x = h.x(22, 0);
        x = h.o(27) ? h.x(27, x) : x;
        this.U = x;
        this.H = x;
        this.x = x;
        this.m = x;
        int x2 = h.x(25, -1);
        if (x2 >= 0) {
            this.m = x2;
        }
        int x3 = h.x(24, -1);
        if (x3 >= 0) {
            this.x = x3;
        }
        int x4 = h.x(26, -1);
        if (x4 >= 0) {
            this.H = x4;
        }
        int x5 = h.x(23, -1);
        if (x5 >= 0) {
            this.U = x5;
        }
        this.Z = h.H(13, -1);
        int x6 = h.x(9, Integer.MIN_VALUE);
        int x7 = h.x(5, Integer.MIN_VALUE);
        int H = h.H(7, 0);
        int H2 = h.H(8, 0);
        if (this.f1168R == null) {
            this.f1168R = new hz9();
        }
        hz9 hz9 = this.f1168R;
        hz9.f4431v = false;
        if (H != Integer.MIN_VALUE) {
            hz9.X = H;
            hz9.R = H;
        }
        if (H2 != Integer.MIN_VALUE) {
            hz9.O = H2;
            hz9.v = H2;
        }
        if (!(x6 == Integer.MIN_VALUE && x7 == Integer.MIN_VALUE)) {
            hz9.R(x6, x7);
        }
        this.C = h.x(10, Integer.MIN_VALUE);
        this.N = h.x(6, Integer.MIN_VALUE);
        this.f1161R = h.U(4);
        this.f1169R = h.V(3);
        CharSequence V = h.V(21);
        if (!TextUtils.isEmpty(V)) {
            setTitle(V);
        }
        CharSequence V2 = h.V(18);
        if (!TextUtils.isEmpty(V2)) {
            setSubtitle(V2);
        }
        this.f1159R = getContext();
        setPopupTheme(h.y(17, 0));
        Drawable U = h.U(16);
        if (U != null) {
            setNavigationIcon(U);
        }
        CharSequence V3 = h.V(15);
        if (!TextUtils.isEmpty(V3)) {
            setNavigationContentDescription(V3);
        }
        Drawable U2 = h.U(11);
        if (U2 != null) {
            setLogo(U2);
        }
        CharSequence V4 = h.V(12);
        if (!TextUtils.isEmpty(V4)) {
            setLogoDescription(V4);
        }
        if (h.o(29)) {
            setTitleTextColor(h.m(29));
        }
        if (h.o(20)) {
            setSubtitleTextColor(h.m(20));
        }
        if (h.o(14)) {
            getMenuInflater().inflate(h.y(14, 0), getMenu());
        }
        h.z();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new fCm(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        eQ eQVar = this.f1178v;
        if (eQVar != null) {
            eQVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f1178v.setImageDrawable(drawable);
            return;
        }
        eQ eQVar = this.f1178v;
        if (eQVar != null) {
            eQVar.setImageDrawable(this.f1161R);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1164R == null) {
                this.f1164R = new AppCompatImageView(getContext(), null);
            }
            if (!U(this.f1164R)) {
                v(this.f1164R, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f1164R;
            if (appCompatImageView != null && U(appCompatImageView)) {
                removeView(this.f1164R);
                this.f1180v.remove(this.f1164R);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f1164R;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1164R == null) {
            this.f1164R = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.f1164R;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            O();
        }
        eQ eQVar = this.f1165R;
        if (eQVar != null) {
            eQVar.setContentDescription(charSequence);
            cFY.R(this.f1165R, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            O();
            if (!U(this.f1165R)) {
                v(this.f1165R, true);
            }
        } else {
            eQ eQVar = this.f1165R;
            if (eQVar != null && U(eQVar)) {
                removeView(this.f1165R);
                this.f1180v.remove(this.f1165R);
            }
        }
        eQ eQVar2 = this.f1165R;
        if (eQVar2 != null) {
            eQVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.v == null) {
                Context context = getContext();
                TC tc = new TC(context, null);
                this.v = tc;
                tc.setSingleLine();
                this.v.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.O;
                if (i != 0) {
                    this.v.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1177v;
                if (colorStateList != null) {
                    this.v.setTextColor(colorStateList);
                }
            }
            if (!U(this.v)) {
                v(this.v, true);
            }
        } else {
            TC tc2 = this.v;
            if (tc2 != null && U(tc2)) {
                removeView(this.v);
                this.f1180v.remove(this.v);
            }
        }
        TC tc3 = this.v;
        if (tc3 != null) {
            tc3.setText(charSequence);
        }
        this.c = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1177v = colorStateList;
        TC tc = this.v;
        if (tc != null) {
            tc.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1158R == null) {
                Context context = getContext();
                TC tc = new TC(context, null);
                this.f1158R = tc;
                tc.setSingleLine();
                this.f1158R.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.X;
                if (i != 0) {
                    this.f1158R.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1160R;
                if (colorStateList != null) {
                    this.f1158R.setTextColor(colorStateList);
                }
            }
            if (!U(this.f1158R)) {
                v(this.f1158R, true);
            }
        } else {
            TC tc2 = this.f1158R;
            if (tc2 != null && U(tc2)) {
                removeView(this.f1158R);
                this.f1180v.remove(this.f1158R);
            }
        }
        TC tc3 = this.f1158R;
        if (tc3 != null) {
            tc3.setText(charSequence);
        }
        this.f1179v = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1160R = colorStateList;
        TC tc = this.f1158R;
        if (tc != null) {
            tc.setTextColor(colorStateList);
        }
    }
}
