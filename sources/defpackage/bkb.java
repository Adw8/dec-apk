package defpackage;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import dev.kdrag0n.virtcontainer.R;
import java.util.UUID;

/* renamed from: bkb  reason: default package */
/* loaded from: classes.dex */
public final class bkb extends LG {

    /* renamed from: R  reason: collision with other field name */
    public final View f1789R;

    /* renamed from: R  reason: collision with other field name */
    public final WindowManager.LayoutParams f1790R;

    /* renamed from: R  reason: collision with other field name */
    public final WindowManager f1791R;

    /* renamed from: R  reason: collision with other field name */
    public final cU5 f1792R;

    /* renamed from: R  reason: collision with other field name */
    public cvV f1793R;

    /* renamed from: R  reason: collision with other field name */
    public fDb f1794R;

    /* renamed from: R  reason: collision with other field name */
    public String f1796R;

    /* renamed from: R  reason: collision with other field name */
    public oOe f1798R;

    /* renamed from: c  reason: collision with other field name */
    public boolean f1801c;
    public f_c v;

    /* renamed from: R  reason: collision with other field name */
    public mdz f1797R = mdz.Ltr;

    /* renamed from: R  reason: collision with other field name */
    public final oST f1799R = l6.n(null);

    /* renamed from: v  reason: collision with other field name */
    public final oST f1802v = l6.n(null);

    /* renamed from: R  reason: collision with other field name */
    public final gHm f1795R = l6.V(new q4(24, this));
    public final Rect R = new Rect();
    public final oST c = l6.n(jcc.R);

    /* renamed from: R  reason: collision with other field name */
    public final int[] f1800R = new int[2];

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bkb(f_c f_c, cvV cvv, String str, View view, jJj jjj, fDb fdb, UUID uuid) {
        super(view.getContext());
        b5E b5e = new b5E();
        this.v = f_c;
        this.f1793R = cvv;
        this.f1796R = str;
        this.f1789R = view;
        this.f1792R = b5e;
        this.f1791R = (WindowManager) view.getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & -8552473) | 262144;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f1790R = layoutParams;
        this.f1794R = fdb;
        setId(16908290);
        setTag(R.id.view_tree_lifecycle_owner, aH9.s(view));
        setTag(R.id.view_tree_view_model_store_owner, iTI.H(view));
        aH9.cr(this, aH9.T(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(jjj.mZ((float) 8));
        setOutlineProvider(new kX7(3));
    }

    private final iv7 getContent() {
        return (iv7) this.c.getValue();
    }

    private final int getDisplayHeight() {
        return mLz.t(((float) getContext().getResources().getConfiguration().screenHeightDp) * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return mLz.t(((float) getContext().getResources().getConfiguration().screenWidthDp) * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* access modifiers changed from: private */
    public final hjM getParentLayoutCoordinates() {
        return (hjM) this.f1802v.getValue();
    }

    private final void setClippingEnabled(boolean z) {
        int i = z ? this.f1790R.flags & -513 : this.f1790R.flags | 512;
        WindowManager.LayoutParams layoutParams = this.f1790R;
        layoutParams.flags = i;
        cU5 cu5 = this.f1792R;
        WindowManager windowManager = this.f1791R;
        cu5.getClass();
        windowManager.updateViewLayout(this, layoutParams);
    }

    private final void setContent(iv7 iv7) {
        this.c.R(iv7);
    }

    private final void setIsFocusable(boolean z) {
        int i = !z ? this.f1790R.flags | 8 : this.f1790R.flags & -9;
        WindowManager.LayoutParams layoutParams = this.f1790R;
        layoutParams.flags = i;
        cU5 cu5 = this.f1792R;
        WindowManager windowManager = this.f1791R;
        cu5.getClass();
        windowManager.updateViewLayout(this, layoutParams);
    }

    private final void setParentLayoutCoordinates(hjM hjm) {
        this.f1802v.R(hjm);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r5 = r4.f1790R.flags | 8192;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setSecurePolicy(defpackage.axi r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.f1789R
            android.view.View r0 = r0.getRootView()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.view.WindowManager.LayoutParams
            r2 = 0
            if (r1 == 0) goto L_0x0012
            android.view.WindowManager$LayoutParams r0 = (android.view.WindowManager.LayoutParams) r0
            goto L_0x0013
        L_0x0012:
            r0 = r2
        L_0x0013:
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L_0x001f
            int r0 = r0.flags
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x001f
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r3
        L_0x0020:
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x0033
            if (r5 == r1) goto L_0x0034
            r0 = 2
            if (r5 != r0) goto L_0x002d
            r1 = r3
            goto L_0x0034
        L_0x002d:
            j8f r4 = new j8f
            r4.<init>(r2)
            throw r4
        L_0x0033:
            r1 = r0
        L_0x0034:
            if (r1 == 0) goto L_0x003d
            android.view.WindowManager$LayoutParams r5 = r4.f1790R
            int r5 = r5.flags
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0043
        L_0x003d:
            android.view.WindowManager$LayoutParams r5 = r4.f1790R
            int r5 = r5.flags
            r5 = r5 & -8193(0xffffffffffffdfff, float:NaN)
        L_0x0043:
            android.view.WindowManager$LayoutParams r0 = r4.f1790R
            r0.flags = r5
            cU5 r5 = r4.f1792R
            android.view.WindowManager r1 = r4.f1791R
            r5.getClass()
            r1.updateViewLayout(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkb.setSecurePolicy(axi):void");
    }

    public final void C(hjM hjm) {
        setParentLayoutCoordinates(hjm);
        U();
    }

    public final void H(f_c f_c, cvV cvv, String str, mdz mdz) {
        this.v = f_c;
        this.f1793R = cvv;
        this.f1796R = str;
        setIsFocusable(cvv.f2456R);
        setSecurePolicy(cvv.R);
        setClippingEnabled(cvv.X);
        int ordinal = mdz.ordinal();
        int i = 1;
        if (ordinal == 0) {
            i = 0;
        } else if (ordinal != 1) {
            throw new j8f((Object) null);
        }
        super.setLayoutDirection(i);
    }

    @Override // defpackage.LG
    public final void L(int i, int i2) {
        this.f1793R.getClass();
        super.L(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
    }

    public final void N() {
        ltH r0;
        oOe ooe = this.f1798R;
        if (ooe != null && (r0 = m9getPopupContentSizebOM6tXw()) != null) {
            long j = r0.R;
            Rect rect = this.R;
            cU5 cu5 = this.f1792R;
            View view = this.f1789R;
            cu5.getClass();
            view.getWindowVisibleDisplayFrame(rect);
            long R = iTI.R(rect.right - rect.left, rect.bottom - rect.top);
            long R2 = this.f1794R.R(ooe, R, this.f1797R, j);
            WindowManager.LayoutParams layoutParams = this.f1790R;
            int i = dU5.R;
            layoutParams.x = (int) (R2 >> 32);
            layoutParams.y = dU5.v(R2);
            if (this.f1793R.e) {
                this.f1792R.P(this, (int) (R >> 32), ltH.v(R));
            }
            cU5 cu52 = this.f1792R;
            WindowManager windowManager = this.f1791R;
            WindowManager.LayoutParams layoutParams2 = this.f1790R;
            cu52.getClass();
            windowManager.updateViewLayout(this, layoutParams2);
        }
    }

    @Override // defpackage.LG
    public final void O(boolean z, int i, int i2, int i3, int i4) {
        super.O(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            this.f1790R.width = childAt.getMeasuredWidth();
            this.f1790R.height = childAt.getMeasuredHeight();
            cU5 cu5 = this.f1792R;
            WindowManager windowManager = this.f1791R;
            WindowManager.LayoutParams layoutParams = this.f1790R;
            cu5.getClass();
            windowManager.updateViewLayout(this, layoutParams);
        }
    }

    @Override // defpackage.LG
    public final void R(m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-857613600);
        getContent().J(jr_, 0);
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new m2w(i, 6, this);
        }
    }

    public final void U() {
        hjM parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            long pG = parentLayoutCoordinates.pG();
            long v = parentLayoutCoordinates.v(aWo.v);
            long v2 = cU5.v(mLz.t(aWo.e(v)), mLz.t(aWo.X(v)));
            int i = (int) (v2 >> 32);
            oOe ooe = new oOe(i, dU5.v(v2), ((int) (pG >> 32)) + i, ltH.v(pG) + dU5.v(v2));
            if (!n3x.v(ooe, this.f1798R)) {
                this.f1798R = ooe;
                N();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f1793R.v) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                f_c f_c = this.v;
                if (f_c != null) {
                    f_c.g();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f1795R.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f1790R;
    }

    public final mdz getParentLayoutDirection() {
        return this.f1797R;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final ltH m9getPopupContentSizebOM6tXw() {
        return (ltH) this.f1799R.getValue();
    }

    public final fDb getPositionProvider() {
        return this.f1794R;
    }

    @Override // defpackage.LG
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f1801c;
    }

    public LG getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f1796R;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f1793R.c) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = false;
        if (!(motionEvent != null && motionEvent.getAction() == 0) || (motionEvent.getX() >= 0.0f && motionEvent.getX() < ((float) getWidth()) && motionEvent.getY() >= 0.0f && motionEvent.getY() < ((float) getHeight()))) {
            if (motionEvent != null && motionEvent.getAction() == 4) {
                z = true;
            }
            if (!z) {
                return super.onTouchEvent(motionEvent);
            }
            f_c f_c = this.v;
            if (f_c != null) {
                f_c.g();
            }
            return true;
        }
        f_c f_c2 = this.v;
        if (f_c2 != null) {
            f_c2.g();
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(mdz mdz) {
        this.f1797R = mdz;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m10setPopupContentSizefhxjrPA(ltH lth) {
        this.f1799R.R(lth);
    }

    public final void setPositionProvider(fDb fdb) {
        this.f1794R = fdb;
    }

    public final void setTestTag(String str) {
        this.f1796R = str;
    }

    public final void x(hYA hya, iv7 iv7) {
        setParentCompositionContext(hya);
        setContent(iv7);
        this.f1801c = true;
    }
}
