package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.h;
import java.lang.ref.WeakReference;

/* renamed from: LG  reason: default package */
/* loaded from: classes.dex */
public abstract class LG extends ViewGroup {
    public IBinder R;

    /* renamed from: R  reason: collision with other field name */
    public fJK f276R;

    /* renamed from: R  reason: collision with other field name */
    public f_c f277R;

    /* renamed from: R  reason: collision with other field name */
    public hYA f278R;

    /* renamed from: R  reason: collision with other field name */
    public WeakReference f279R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f280R;
    public boolean v;

    public /* synthetic */ LG(Context context) {
        this(context, null, 0);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(hYA hya) {
        if (this.f278R != hya) {
            this.f278R = hya;
            if (hya != null) {
                this.f279R = null;
            }
            fJK fjk = this.f276R;
            if (fjk != null) {
                fjk.R();
                this.f276R = null;
                if (isAttachedToWindow()) {
                    X();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.R != iBinder) {
            this.R = iBinder;
            this.f279R = null;
        }
    }

    public void L(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public void O(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public abstract void R(m88 m88, int i);

    public final void X() {
        if (this.f276R == null) {
            try {
                this.v = true;
                this.f276R = h.R(this, Z(), aH9.u(new bkx(5, this), true, -656146368));
            } finally {
                this.v = false;
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x0046 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x0078 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:25:0x0051 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [hYA] */
    /* JADX WARN: Type inference failed for: r1v1, types: [hYA] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v12, types: [fLL] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v31, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v35, types: [hYA] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        if ((!(r1 instanceof defpackage.fLL) || ((defpackage.a8X) ((defpackage.fLL) r1).f3383R.getValue()).compareTo(r0) > 0) != false) goto L_0x007c;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.hYA Z() {
        /*
        // Method dump skipped, instructions count: 487
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LG.Z():hYA");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        v();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        v();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void c() {
        if (this.f278R != null || isAttachedToWindow()) {
            X();
            return;
        }
        throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
    }

    public final void e() {
        fJK fjk = this.f276R;
        if (fjk != null) {
            fjk.R();
        }
        this.f276R = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.f276R != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f280R;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            X();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        O(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        X();
        L(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(hYA hya) {
        setParentContext(hya);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f280R = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((gzG) childAt).setShowLayoutBounds(z);
        }
    }

    public final void setViewCompositionStrategy(boB bob) {
        f_c f_c = this.f277R;
        if (f_c != null) {
            f_c.g();
        }
        this.f277R = bob.v(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void v() {
        if (!this.v) {
            StringBuilder U = opT.U("Cannot add views to ");
            U.append(getClass().getSimpleName());
            U.append("; only Compose content is supported");
            throw new UnsupportedOperationException(U.toString());
        }
    }

    public LG(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        V1 v1 = new V1(3, this);
        addOnAttachStateChangeListener(v1);
        dq dqVar = new dq();
        aH9.M(this).R.add(dqVar);
        this.f277R = new h31(this, v1, dqVar, 6);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        v();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        v();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        v();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        v();
        super.addView(view, i, layoutParams);
    }
}
