package defpackage;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import dev.kdrag0n.virtcontainer.R;
import java.util.UUID;

/* renamed from: gv2  reason: default package */
/* loaded from: classes.dex */
public final class gv2 extends LG implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: R  reason: collision with other field name */
    public final View f3977R;

    /* renamed from: R  reason: collision with other field name */
    public final WindowManager.LayoutParams f3978R;

    /* renamed from: R  reason: collision with other field name */
    public final WindowManager f3979R;

    /* renamed from: R  reason: collision with other field name */
    public fDb f3980R;

    /* renamed from: c  reason: collision with other field name */
    public boolean f3985c;

    /* renamed from: v  reason: collision with other field name */
    public f_c f3986v;

    /* renamed from: R  reason: collision with other field name */
    public mdz f3983R = mdz.Ltr;

    /* renamed from: R  reason: collision with other field name */
    public final oST f3984R = l6.n(null);

    /* renamed from: v  reason: collision with other field name */
    public final oST f3987v = l6.n(null);

    /* renamed from: R  reason: collision with other field name */
    public final gHm f3981R = l6.V(new q4(5, this));
    public final Rect R = new Rect();
    public final Rect v = new Rect();

    /* renamed from: R  reason: collision with other field name */
    public final ky1 f3982R = ky1.N;
    public final oST c = l6.n(fQ8.R);

    public gv2(f_c f_c, View view, jJj jjj, fDb fdb, UUID uuid) {
        super(view.getContext());
        this.f3986v = f_c;
        this.f3977R = view;
        this.f3979R = (WindowManager) view.getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f3978R = layoutParams;
        this.f3980R = fdb;
        setId(16908290);
        setTag(R.id.view_tree_lifecycle_owner, aH9.s(view));
        setTag(R.id.view_tree_view_model_store_owner, iTI.H(view));
        aH9.cr(this, aH9.T(view));
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(jjj.mZ((float) 8));
        setOutlineProvider(new kX7(0));
    }

    @Override // defpackage.LG
    public final void R(m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-797839545);
        ((iv7) this.c.getValue()).J(jr_, 0);
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new m2w(i, 3, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4) {
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
                f_c f_c = this.f3986v;
                if (f_c != null) {
                    f_c.g();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.LG
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f3985c;
    }

    public final void m(f_c f_c, mdz mdz) {
        this.f3986v = f_c;
        int ordinal = mdz.ordinal();
        int i = 1;
        if (ordinal == 0) {
            i = 0;
        } else if (ordinal != 1) {
            throw new j8f((Object) null);
        }
        super.setLayoutDirection(i);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f3977R.getWindowVisibleDisplayFrame(this.v);
        if (!n3x.v(this.v, this.R)) {
            x();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        if (((java.lang.Boolean) r4.J(r1, r0)).booleanValue() == false) goto L_0x0094;
     */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0007
            boolean r7 = super.onTouchEvent(r8)
            return r7
        L_0x0007:
            int r0 = r8.getAction()
            r1 = 0
            if (r0 != 0) goto L_0x0038
            float r0 = r8.getX()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x003f
            float r0 = r8.getX()
            int r2 = r7.getWidth()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
            float r0 = r8.getY()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x003f
            float r0 = r8.getY()
            int r2 = r7.getHeight()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
        L_0x0038:
            int r0 = r8.getAction()
            r2 = 4
            if (r0 != r2) goto L_0x009e
        L_0x003f:
            oST r0 = r7.f3984R
            java.lang.Object r0 = r0.getValue()
            oOe r0 = (defpackage.oOe) r0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0093
            ky1 r4 = r7.f3982R
            float r5 = r8.getX()
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0057
            r5 = r3
            goto L_0x0058
        L_0x0057:
            r5 = r2
        L_0x0058:
            if (r5 == 0) goto L_0x006a
            float r5 = r8.getY()
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0064
            r1 = r3
            goto L_0x0065
        L_0x0064:
            r1 = r2
        L_0x0065:
            if (r1 != 0) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            r1 = 0
            goto L_0x0087
        L_0x006a:
            android.view.WindowManager$LayoutParams r1 = r7.f3978R
            int r1 = r1.x
            float r1 = (float) r1
            float r5 = r8.getX()
            float r5 = r5 + r1
            android.view.WindowManager$LayoutParams r1 = r7.f3978R
            int r1 = r1.y
            float r1 = (float) r1
            float r6 = r8.getY()
            float r6 = r6 + r1
            long r5 = defpackage.aH9.N(r5, r6)
            aWo r1 = new aWo
            r1.<init>(r5)
        L_0x0087:
            java.lang.Object r0 = r4.J(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0094
        L_0x0093:
            r2 = r3
        L_0x0094:
            if (r2 == 0) goto L_0x009e
            f_c r7 = r7.f3986v
            if (r7 == 0) goto L_0x009d
            r7.g()
        L_0x009d:
            return r3
        L_0x009e:
            boolean r7 = super.onTouchEvent(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
    }

    public final void x() {
        ltH lth;
        oOe ooe = (oOe) this.f3984R.getValue();
        if (ooe != null && (lth = (ltH) this.f3987v.getValue()) != null) {
            long j = lth.R;
            Rect rect = this.R;
            this.f3977R.getWindowVisibleDisplayFrame(rect);
            long R = this.f3980R.R(ooe, iTI.R(rect.right - rect.left, rect.bottom - rect.top), this.f3983R, j);
            WindowManager.LayoutParams layoutParams = this.f3978R;
            int i = dU5.R;
            layoutParams.x = (int) (R >> 32);
            layoutParams.y = dU5.v(R);
            this.f3979R.updateViewLayout(this, this.f3978R);
        }
    }
}
