package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import dev.kdrag0n.virtcontainer.R;
import java.util.LinkedHashMap;

/* renamed from: qc  reason: default package */
/* loaded from: classes.dex */
public abstract class qc extends ViewGroup implements b1z {
    public adL R;

    /* renamed from: R  reason: collision with other field name */
    public View f7362R;

    /* renamed from: R  reason: collision with other field name */
    public final c_x f7363R;

    /* renamed from: R  reason: collision with other field name */
    public f_c f7364R;

    /* renamed from: R  reason: collision with other field name */
    public final fue f7365R;

    /* renamed from: R  reason: collision with other field name */
    public final i0o f7366R;

    /* renamed from: R  reason: collision with other field name */
    public final jE4 f7367R;

    /* renamed from: R  reason: collision with other field name */
    public jJj f7368R;

    /* renamed from: R  reason: collision with other field name */
    public kg9 f7369R;

    /* renamed from: R  reason: collision with other field name */
    public final lh8 f7370R;

    /* renamed from: R  reason: collision with other field name */
    public ncu f7371R;

    /* renamed from: R  reason: collision with other field name */
    public nu_ f7372R;

    /* renamed from: R  reason: collision with other field name */
    public final q4 f7373R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7374R;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f7375R;
    public int X;
    public kg9 c;
    public int e;
    public kg9 v;

    public qc(Context context, hYA hya, lh8 lh8) {
        super(context);
        this.f7370R = lh8;
        if (hya != null) {
            LinkedHashMap linkedHashMap = kNb.R;
            setTag(R.id.androidx_compose_ui_view_composition_context, hya);
        }
        setSaveFromParentEnabled(false);
        this.f7364R = mY_.X;
        this.f7371R = aff.R;
        this.f7368R = new i4B(1.0f, 1.0f);
        gJ8 gj8 = (gJ8) this;
        this.f7367R = new jE4(new i0o(gj8, 2));
        this.f7366R = new i0o(gj8, 1);
        this.f7373R = new q4(21, this);
        this.f7375R = new int[2];
        this.e = Integer.MIN_VALUE;
        this.X = Integer.MIN_VALUE;
        this.f7363R = new c_x();
        fue fue = new fue(3, false, 0);
        nCn ncn = new nCn();
        ncn.R = new i0o(gj8, 0);
        pq5 pq5 = new pq5();
        pq5 pq52 = ncn.f6351R;
        if (pq52 != null) {
            pq52.R = null;
        }
        ncn.f6351R = pq5;
        pq5.R = ncn;
        setOnRequestDisallowInterceptTouchEvent$ui_release(pq5);
        ncu u = g4x.u(aH9.S(ncn, new jh(fue, gj8)), new jh(this, fue, 2));
        fue.l(this.f7371R.I(u));
        this.f7369R = new V4(fue, 28, u);
        fue.G(this.f7368R);
        this.v = new mox(10, fue);
        nWW nww = new nWW();
        fue.f3601R = new ofd(this, fue, nww, 15);
        fue.f3612v = new V4(this, 29, nww);
        fue.B(new Jb(fue, gj8));
        this.f7365R = fue;
    }

    public static final int L(qc qcVar, int i, int i2, int i3) {
        qcVar.getClass();
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(caw.x(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    @Override // defpackage.eRL
    public final boolean O(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // defpackage.eRL
    public final void R(View view, int i, int i2, int i3, int i4, int i5) {
        if (isNestedScrollingEnabled()) {
            float f = (float) -1;
            this.f7370R.v(i5 == 0 ? 1 : 2, aH9.N(((float) i) * f, ((float) i2) * f), aH9.N(((float) i3) * f, ((float) i4) * f));
        }
    }

    @Override // defpackage.eRL
    public final void X(View view, View view2, int i, int i2) {
        c_x c_x = this.f7363R;
        if (i2 == 1) {
            c_x.X = i;
        } else {
            c_x.e = i;
        }
    }

    @Override // defpackage.eRL
    public final void c(View view, int i) {
        c_x c_x = this.f7363R;
        if (i == 1) {
            c_x.X = 0;
        } else {
            c_x.e = 0;
        }
    }

    @Override // defpackage.b1z
    public final void e(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            float f = (float) -1;
            long v = this.f7370R.v(i5 == 0 ? 1 : 2, aH9.N(((float) i) * f, ((float) i2) * f), aH9.N(((float) i3) * f, ((float) i4) * f));
            iArr[0] = gQc.t(aWo.e(v));
            iArr[1] = gQc.t(aWo.X(v));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f7375R);
        int[] iArr = this.f7375R;
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + this.f7375R[1], Region.Op.DIFFERENCE);
        return true;
    }

    public final jJj getDensity() {
        return this.f7368R;
    }

    public final fue getLayoutNode() {
        return this.f7365R;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f7362R;
        return (view == null || (layoutParams = view.getLayoutParams()) == null) ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final nu_ getLifecycleOwner() {
        return this.f7372R;
    }

    public final ncu getModifier() {
        return this.f7371R;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        c_x c_x = this.f7363R;
        return c_x.X | c_x.e;
    }

    public final kg9 getOnDensityChanged$ui_release() {
        return this.v;
    }

    public final kg9 getOnModifierChanged$ui_release() {
        return this.f7369R;
    }

    public final kg9 getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.c;
    }

    public final adL getSavedStateRegistryOwner() {
        return this.R;
    }

    public final f_c getUpdate() {
        return this.f7364R;
    }

    public final View getView() {
        return this.f7362R;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.f7365R.t();
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        View view = this.f7362R;
        return view != null ? view.isNestedScrollingEnabled() : super.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jE4 je4 = this.f7367R;
        je4.f4861R = ift.x(je4.f4860R);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        this.f7365R.t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fbt fbt = this.f7367R.f4861R;
        if (fbt != null) {
            fbt.R();
        }
        this.f7367R.R();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.f7362R;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.f7362R;
        if (view != null) {
            view.measure(i, i2);
        }
        View view2 = this.f7362R;
        int i3 = 0;
        int measuredWidth = view2 != null ? view2.getMeasuredWidth() : 0;
        View view3 = this.f7362R;
        if (view3 != null) {
            i3 = view3.getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, i3);
        this.e = i;
        this.X = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        l6.z(this.f7370R.e(), null, 0, new IV(z, this, dtx.X(f * -1.0f, f2 * -1.0f), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        l6.z(this.f7370R.e(), null, 0, new Hf(this, dtx.X(f * -1.0f, f2 * -1.0f), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        kg9 kg9 = this.c;
        if (kg9 != null) {
            kg9.x(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(jJj jjj) {
        if (jjj != this.f7368R) {
            this.f7368R = jjj;
            kg9 kg9 = this.v;
            if (kg9 != null) {
                kg9.x(jjj);
            }
        }
    }

    public final void setLifecycleOwner(nu_ nu_) {
        if (nu_ != this.f7372R) {
            this.f7372R = nu_;
            setTag(R.id.view_tree_lifecycle_owner, nu_);
        }
    }

    public final void setModifier(ncu ncu) {
        if (ncu != this.f7371R) {
            this.f7371R = ncu;
            kg9 kg9 = this.f7369R;
            if (kg9 != null) {
                kg9.x(ncu);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(kg9 kg9) {
        this.v = kg9;
    }

    public final void setOnModifierChanged$ui_release(kg9 kg9) {
        this.f7369R = kg9;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(kg9 kg9) {
        this.c = kg9;
    }

    public final void setSavedStateRegistryOwner(adL adl) {
        if (adl != this.R) {
            this.R = adl;
            aH9.cr(this, adl);
        }
    }

    public final void setUpdate(f_c f_c) {
        this.f7364R = f_c;
        this.f7374R = true;
        this.f7373R.g();
    }

    public final void setView$ui_release(View view) {
        if (view != this.f7362R) {
            this.f7362R = view;
            removeAllViewsInLayout();
            if (view != null) {
                addView(view);
                this.f7373R.g();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // defpackage.eRL
    public final void v(View view, int i, int i2, int[] iArr, int i3) {
        if (isNestedScrollingEnabled()) {
            lh8 lh8 = this.f7370R;
            float f = (float) i;
            float f2 = (float) -1;
            long N = aH9.N(f * f2, ((float) i2) * f2);
            int i4 = i3 == 0 ? 1 : 2;
            i_c i_c = lh8.f5803R;
            long c = i_c != null ? i_c.c(N, i4) : aWo.v;
            iArr[0] = gQc.t(aWo.e(c));
            iArr[1] = gQc.t(aWo.X(c));
        }
    }
}
